package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseOperationFailure extends StObject {
  
  /**
    * Error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Failure time.
    */
  var FailureTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Reserved.
    */
  var MetadataList: js.UndefOr[typings.awsSdk.licensemanagerMod.MetadataList] = js.undefined
  
  /**
    * Name of the operation.
    */
  var OperationName: js.UndefOr[String] = js.undefined
  
  /**
    * The requester is "License Manager Automated Discovery".
    */
  var OperationRequestedBy: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the Amazon Web Services account that owns the resource.
    */
  var ResourceOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Resource type.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceType] = js.undefined
}
object LicenseOperationFailure {
  
  inline def apply(): LicenseOperationFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseOperationFailure]
  }
  
  extension [Self <: LicenseOperationFailure](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setFailureTime(value: js.Date): Self = StObject.set(x, "FailureTime", value.asInstanceOf[js.Any])
    
    inline def setFailureTimeUndefined: Self = StObject.set(x, "FailureTime", js.undefined)
    
    inline def setMetadataList(value: MetadataList): Self = StObject.set(x, "MetadataList", value.asInstanceOf[js.Any])
    
    inline def setMetadataListUndefined: Self = StObject.set(x, "MetadataList", js.undefined)
    
    inline def setMetadataListVarargs(value: Metadata*): Self = StObject.set(x, "MetadataList", js.Array(value*))
    
    inline def setOperationName(value: String): Self = StObject.set(x, "OperationName", value.asInstanceOf[js.Any])
    
    inline def setOperationNameUndefined: Self = StObject.set(x, "OperationName", js.undefined)
    
    inline def setOperationRequestedBy(value: String): Self = StObject.set(x, "OperationRequestedBy", value.asInstanceOf[js.Any])
    
    inline def setOperationRequestedByUndefined: Self = StObject.set(x, "OperationRequestedBy", js.undefined)
    
    inline def setResourceArn(value: String): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourceOwnerId(value: String): Self = StObject.set(x, "ResourceOwnerId", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerIdUndefined: Self = StObject.set(x, "ResourceOwnerId", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
