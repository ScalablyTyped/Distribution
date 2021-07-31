package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpekeKeyProvider extends StObject {
  
  /**
    * An Amazon Resource Name (ARN) of a Certificate Manager certificate
  that MediaPackage will use for enforcing secure end-to-end data
  transfer with the key provider service.
    */
  var CertificateArn: js.UndefOr[string] = js.undefined
  
  /**
    * The resource ID to include in key requests.
    */
  var ResourceId: string
  
  /**
    * An Amazon Resource Name (ARN) of an IAM role that AWS Elemental
  MediaPackage will assume when accessing the key provider service.
    */
  var RoleArn: string
  
  /**
    * The system IDs to include in key requests.
    */
  var SystemIds: listOfString
  
  /**
    * The URL of the external key provider service.
    */
  var Url: string
}
object SpekeKeyProvider {
  
  @scala.inline
  def apply(ResourceId: string, RoleArn: string, SystemIds: listOfString, Url: string): SpekeKeyProvider = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], SystemIds = SystemIds.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpekeKeyProvider]
  }
  
  @scala.inline
  implicit class SpekeKeyProviderMutableBuilder[Self <: SpekeKeyProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: string): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setResourceId(value: string): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemIds(value: listOfString): Self = StObject.set(x, "SystemIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemIdsVarargs(value: string*): Self = StObject.set(x, "SystemIds", js.Array(value :_*))
    
    @scala.inline
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
