package typings.bytestreamjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Backward extends StObject {
    
    var backward: Boolean
    
    var length: Double
    
    var start: Double
  }
  object Backward {
    
    inline def apply(backward: Boolean, length: Double, start: Double): Backward = {
      val __obj = js.Dynamic.literal(backward = backward.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Backward]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Backward] (val x: Self) extends AnyVal {
      
      inline def setBackward(value: Boolean): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: Double
    
    var position: Double
  }
  object Id {
    
    inline def apply(id: Double, position: Double): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
