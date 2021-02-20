package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseOperationFailure extends StObject {
  
  /**
    * Error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * Failure time.
    */
  var FailureTime: js.UndefOr[DateTime] = js.native
  
  /**
    * Reserved.
    */
  var MetadataList: js.UndefOr[typings.awsSdk.licensemanagerMod.MetadataList] = js.native
  
  /**
    * Name of the operation.
    */
  var OperationName: js.UndefOr[String] = js.native
  
  /**
    * The requester is "License Manager Automated Discovery".
    */
  var OperationRequestedBy: js.UndefOr[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.native
  
  /**
    * ID of the AWS account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.native
  
  /**
    * Resource type.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.native
}
object LicenseOperationFailure {
  
  @scala.inline
  def apply(): LicenseOperationFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseOperationFailure]
  }
  
  @scala.inline
  implicit class LicenseOperationFailureMutableBuilder[Self <: LicenseOperationFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setFailureTime(value: DateTime): Self = StObject.set(x, "FailureTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureTimeUndefined: Self = StObject.set(x, "FailureTime", js.undefined)
    
    @scala.inline
    def setMetadataList(value: MetadataList): Self = StObject.set(x, "MetadataList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataListUndefined: Self = StObject.set(x, "MetadataList", js.undefined)
    
    @scala.inline
    def setMetadataListVarargs(value: Metadata*): Self = StObject.set(x, "MetadataList", js.Array(value :_*))
    
    @scala.inline
    def setOperationName(value: String): Self = StObject.set(x, "OperationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationNameUndefined: Self = StObject.set(x, "OperationName", js.undefined)
    
    @scala.inline
    def setOperationRequestedBy(value: String): Self = StObject.set(x, "OperationRequestedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationRequestedByUndefined: Self = StObject.set(x, "OperationRequestedBy", js.undefined)
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setResourceOwnerId(value: String): Self = StObject.set(x, "ResourceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnerIdUndefined: Self = StObject.set(x, "ResourceOwnerId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
