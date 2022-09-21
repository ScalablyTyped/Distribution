package typings.bson.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializeOptions extends StObject {
  
  /** the serializer will check if keys are valid. */
  var checkKeys: js.UndefOr[Boolean] = js.undefined
  
  /** serialize will not emit undefined fields **(default:true)** */
  var ignoreUndefined: js.UndefOr[Boolean] = js.undefined
  
  /* Excluded from this release type: minInternalBufferSize */
  /** the index in the buffer where we wish to start serializing into */
  var index: js.UndefOr[scala.Double] = js.undefined
  
  /** serialize the javascript functions **(default:false)**. */
  var serializeFunctions: js.UndefOr[Boolean] = js.undefined
}
object SerializeOptions {
  
  inline def apply(): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeOptions]
  }
  
  extension [Self <: SerializeOptions](x: Self) {
    
    inline def setCheckKeys(value: Boolean): Self = StObject.set(x, "checkKeys", value.asInstanceOf[js.Any])
    
    inline def setCheckKeysUndefined: Self = StObject.set(x, "checkKeys", js.undefined)
    
    inline def setIgnoreUndefined(value: Boolean): Self = StObject.set(x, "ignoreUndefined", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefinedUndefined: Self = StObject.set(x, "ignoreUndefined", js.undefined)
    
    inline def setIndex(value: scala.Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setSerializeFunctions(value: Boolean): Self = StObject.set(x, "serializeFunctions", value.asInstanceOf[js.Any])
    
    inline def setSerializeFunctionsUndefined: Self = StObject.set(x, "serializeFunctions", js.undefined)
  }
}
