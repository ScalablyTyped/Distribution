package typings.bson.mod

import typings.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdLike extends StObject {
  
  var __id: js.UndefOr[String] = js.undefined
  
  var id: String | Buffer
  
  def toHexString(): String
}
object ObjectIdLike {
  
  inline def apply(id: String | Buffer, toHexString: () => String): ObjectIdLike = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], toHexString = js.Any.fromFunction0(toHexString))
    __obj.asInstanceOf[ObjectIdLike]
  }
  
  extension [Self <: ObjectIdLike](x: Self) {
    
    inline def setId(value: String | Buffer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setToHexString(value: () => String): Self = StObject.set(x, "toHexString", js.Any.fromFunction0(value))
    
    inline def set__id(value: String): Self = StObject.set(x, "__id", value.asInstanceOf[js.Any])
    
    inline def set__idUndefined: Self = StObject.set(x, "__id", js.undefined)
  }
}
