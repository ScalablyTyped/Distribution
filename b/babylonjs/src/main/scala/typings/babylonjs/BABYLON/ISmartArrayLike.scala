package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISmartArrayLike[T] extends StObject {
  
  /**
    * The data of the array.
    */
  var data: js.Array[T] = js.native
  
  /**
    * The active length of the array.
    */
  var length: Double = js.native
}
object ISmartArrayLike {
  
  @scala.inline
  def apply[T](data: js.Array[T], length: Double): ISmartArrayLike[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISmartArrayLike[T]]
  }
  
  @scala.inline
  implicit class ISmartArrayLikeMutableBuilder[Self <: ISmartArrayLike[_], T] (val x: Self with ISmartArrayLike[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
