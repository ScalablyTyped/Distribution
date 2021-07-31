package typings.bufferCompare

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(cmp: List, to: List): Double = (^.asInstanceOf[js.Dynamic].apply(cmp.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def apply[T](cmp: T, to: T): Double = (^.asInstanceOf[js.Dynamic].apply(cmp.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("buffer-compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait List
    extends StObject
       with /* index */ NumberDictionary[js.Any] {
    
    var length: Double
  }
  object List {
    
    @scala.inline
    def apply(length: Double): List = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[List]
    }
    
    @scala.inline
    implicit class ListMutableBuilder[Self <: List] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
