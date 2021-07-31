package typings.cheapRuler

import typings.cheapRuler.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index extends StObject {
    
    var index: Double
    
    var point: Point
    
    var t: Double
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, point: Point, t: Double): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
}
