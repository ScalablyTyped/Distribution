package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheInterfaceIserializabletokencacheMod {
  
  trait ISerializableTokenCache extends StObject {
    
    def deserialize(cache: String): Unit
    
    def serialize(): String
  }
  object ISerializableTokenCache {
    
    inline def apply(deserialize: String => Unit, serialize: () => String): ISerializableTokenCache = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction0(serialize))
      __obj.asInstanceOf[ISerializableTokenCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISerializableTokenCache] (val x: Self) extends AnyVal {
      
      inline def setDeserialize(value: String => Unit): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setSerialize(value: () => String): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    }
  }
}
