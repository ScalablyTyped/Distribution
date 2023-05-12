package typings.cyclonedx.mod

import typings.cyclonedx.anon.DependsOn
import typings.cyclonedx.cyclonedxStrings.CycloneDX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CycloneDXBase[C] extends StObject {
  
  var bomFormat: CycloneDX
  
  var components: js.UndefOr[js.Array[C]] = js.undefined
  
  var dependencies: js.UndefOr[js.Array[DependsOn]] = js.undefined
  
  var externalReferences: js.UndefOr[js.Array[ExternalReference]] = js.undefined
  
  var serialNumber: js.UndefOr[String] = js.undefined
  
  var version: Integer
}
object CycloneDXBase {
  
  inline def apply[C](version: Integer): CycloneDXBase[C] = {
    val __obj = js.Dynamic.literal(bomFormat = "CycloneDX", version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CycloneDXBase[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CycloneDXBase[?], C] (val x: Self & CycloneDXBase[C]) extends AnyVal {
    
    inline def setBomFormat(value: CycloneDX): Self = StObject.set(x, "bomFormat", value.asInstanceOf[js.Any])
    
    inline def setComponents(value: js.Array[C]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: C*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setDependencies(value: js.Array[DependsOn]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: DependsOn*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setExternalReferences(value: js.Array[ExternalReference]): Self = StObject.set(x, "externalReferences", value.asInstanceOf[js.Any])
    
    inline def setExternalReferencesUndefined: Self = StObject.set(x, "externalReferences", js.undefined)
    
    inline def setExternalReferencesVarargs(value: ExternalReference*): Self = StObject.set(x, "externalReferences", js.Array(value*))
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setVersion(value: Integer): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
