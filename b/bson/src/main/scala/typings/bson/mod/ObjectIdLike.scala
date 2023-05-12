package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdLike extends StObject {
  
  var __id: js.UndefOr[String] = js.undefined
  
  var id: String | js.typedarray.Uint8Array
  
  def toHexString(): String
}
object ObjectIdLike {
  
  inline def apply(id: String | js.typedarray.Uint8Array, toHexString: () => String): ObjectIdLike = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], toHexString = js.Any.fromFunction0(toHexString))
    __obj.asInstanceOf[ObjectIdLike]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectIdLike] (val x: Self) extends AnyVal {
    
    inline def setId(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
    
    inline def set__id(value: String): Self = StObject.set(x, "__id", value.asInstanceOf[js.Any])
    
    inline def set__idUndefined: Self = StObject.set(x, "__id", js.undefined)
  }
}
