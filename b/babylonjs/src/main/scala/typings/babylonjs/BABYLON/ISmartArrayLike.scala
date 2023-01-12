package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISmartArrayLike[T] extends StObject {
  
  /**
    * The data of the array.
    */
  var data: js.Array[T]
  
  /**
    * The active length of the array.
    */
  var length: Double
}
object ISmartArrayLike {
  
  inline def apply[T](data: js.Array[T], length: Double): ISmartArrayLike[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmartArrayLike[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISmartArrayLike[?], T] (val x: Self & ISmartArrayLike[T]) extends AnyVal {
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
