package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRestoreImageTaskRequest extends StObject {
  
  /**
    * The name of the Amazon S3 bucket that contains the stored AMI object.
    */
  var Bucket: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name for the restored AMI. The name must be unique for AMIs in the Region for this account. If you do not provide a name, the new AMI gets the same name as the original AMI.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the stored AMI object in the bucket.
    */
  var ObjectKey: String
  
  /**
    * The tags to apply to the AMI and snapshots on restoration. You can tag the AMI, the snapshots, or both.   To tag the AMI, the value for ResourceType must be image.   To tag the snapshots, the value for ResourceType must be snapshot. The same tag is applied to all of the snapshots that are created.  
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateRestoreImageTaskRequest {
  
  inline def apply(Bucket: String, ObjectKey: String): CreateRestoreImageTaskRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], ObjectKey = ObjectKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRestoreImageTaskRequest]
  }
  
  extension [Self <: CreateRestoreImageTaskRequest](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setObjectKey(value: String): Self = StObject.set(x, "ObjectKey", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
