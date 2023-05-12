package typings.cyclonedx.mod

import typings.cyclonedx.anon.Classification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceBase extends StObject {
  
  var authenticated: js.UndefOr[Boolean] = js.undefined
  
  var `bom-ref`: js.UndefOr[BomRef] = js.undefined
  
  var data: js.UndefOr[js.Array[Classification]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var endpoints: js.UndefOr[js.Array[URL]] = js.undefined
  
  var externalReferences: js.UndefOr[js.Array[ExternalReference]] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var licenses: js.UndefOr[js.Array[LicenseOrExpression]] = js.undefined
  
  var name: String
  
  var provider: js.UndefOr[Contact] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var `x-trust-boundary`: js.UndefOr[Boolean] = js.undefined
}
object ServiceBase {
  
  inline def apply(name: String): ServiceBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceBase] (val x: Self) extends AnyVal {
    
    inline def setAuthenticated(value: Boolean): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatedUndefined: Self = StObject.set(x, "authenticated", js.undefined)
    
    inline def `setBom-ref`(value: BomRef): Self = StObject.set(x, "bom-ref", value.asInstanceOf[js.Any])
    
    inline def `setBom-refUndefined`: Self = StObject.set(x, "bom-ref", js.undefined)
    
    inline def setData(value: js.Array[Classification]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Classification*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndpoints(value: js.Array[URL]): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsUndefined: Self = StObject.set(x, "endpoints", js.undefined)
    
    inline def setEndpointsVarargs(value: URL*): Self = StObject.set(x, "endpoints", js.Array(value*))
    
    inline def setExternalReferences(value: js.Array[ExternalReference]): Self = StObject.set(x, "externalReferences", value.asInstanceOf[js.Any])
    
    inline def setExternalReferencesUndefined: Self = StObject.set(x, "externalReferences", js.undefined)
    
    inline def setExternalReferencesVarargs(value: ExternalReference*): Self = StObject.set(x, "externalReferences", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setLicenses(value: js.Array[LicenseOrExpression]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
    
    inline def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
    
    inline def setLicensesVarargs(value: LicenseOrExpression*): Self = StObject.set(x, "licenses", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: Contact): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def `setX-trust-boundary`(value: Boolean): Self = StObject.set(x, "x-trust-boundary", value.asInstanceOf[js.Any])
    
    inline def `setX-trust-boundaryUndefined`: Self = StObject.set(x, "x-trust-boundary", js.undefined)
  }
}
