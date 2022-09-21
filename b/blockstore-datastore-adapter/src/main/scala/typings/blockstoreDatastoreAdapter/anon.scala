package typings.blockstoreDatastoreAdapter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key extends StObject {
    
    var key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
    
    var value: js.typedarray.Uint8Array
  }
  object Key {
    
    inline def apply(
      key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any,
      value: js.typedarray.Uint8Array
    ): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CID */ Any
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
