package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyCertificateBasedAuthPropertiesRequest extends StObject {
  
  /**
    * The properties of the certificate-based authentication.
    */
  var CertificateBasedAuthProperties: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.CertificateBasedAuthProperties] = js.undefined
  
  /**
    * The properties of the certificate-based authentication you want to delete.
    */
  var PropertiesToDelete: js.UndefOr[DeletableCertificateBasedAuthPropertiesList] = js.undefined
  
  /**
    * The resource identifiers, in the form of directory IDs.
    */
  var ResourceId: DirectoryId
}
object ModifyCertificateBasedAuthPropertiesRequest {
  
  inline def apply(ResourceId: DirectoryId): ModifyCertificateBasedAuthPropertiesRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCertificateBasedAuthPropertiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyCertificateBasedAuthPropertiesRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateBasedAuthProperties(value: CertificateBasedAuthProperties): Self = StObject.set(x, "CertificateBasedAuthProperties", value.asInstanceOf[js.Any])
    
    inline def setCertificateBasedAuthPropertiesUndefined: Self = StObject.set(x, "CertificateBasedAuthProperties", js.undefined)
    
    inline def setPropertiesToDelete(value: DeletableCertificateBasedAuthPropertiesList): Self = StObject.set(x, "PropertiesToDelete", value.asInstanceOf[js.Any])
    
    inline def setPropertiesToDeleteUndefined: Self = StObject.set(x, "PropertiesToDelete", js.undefined)
    
    inline def setPropertiesToDeleteVarargs(value: DeletableCertificateBasedAuthProperty*): Self = StObject.set(x, "PropertiesToDelete", js.Array(value*))
    
    inline def setResourceId(value: DirectoryId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
