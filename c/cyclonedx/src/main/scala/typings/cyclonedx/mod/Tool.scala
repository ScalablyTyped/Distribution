package typings.cyclonedx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tool extends StObject {
  
  var externalReferences: js.UndefOr[js.Array[ExternalReference]] = js.undefined
  
  var hashes: js.UndefOr[js.Array[Hash]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var vendor: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object Tool {
  
  inline def apply(): Tool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tool] (val x: Self) extends AnyVal {
    
    inline def setExternalReferences(value: js.Array[ExternalReference]): Self = StObject.set(x, "externalReferences", value.asInstanceOf[js.Any])
    
    inline def setExternalReferencesUndefined: Self = StObject.set(x, "externalReferences", js.undefined)
    
    inline def setExternalReferencesVarargs(value: ExternalReference*): Self = StObject.set(x, "externalReferences", js.Array(value*))
    
    inline def setHashes(value: js.Array[Hash]): Self = StObject.set(x, "hashes", value.asInstanceOf[js.Any])
    
    inline def setHashesUndefined: Self = StObject.set(x, "hashes", js.undefined)
    
    inline def setHashesVarargs(value: Hash*): Self = StObject.set(x, "hashes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
