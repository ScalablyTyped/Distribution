package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageVersion extends StObject {
  
  /**
    * When the version was created.
    */
  var CreationTime: Timestamp
  
  /**
    * When a create or delete operation fails, the reason for the failure.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.sagemakerMod.FailureReason] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the image the version is based on.
    */
  var ImageArn: typings.awsSdk.sagemakerMod.ImageArn
  
  /**
    * The ARN of the version.
    */
  var ImageVersionArn: typings.awsSdk.sagemakerMod.ImageVersionArn
  
  /**
    * The status of the version.
    */
  var ImageVersionStatus: typings.awsSdk.sagemakerMod.ImageVersionStatus
  
  /**
    * When the version was last modified.
    */
  var LastModifiedTime: Timestamp
  
  /**
    * The version number.
    */
  var Version: ImageVersionNumber
}
object ImageVersion {
  
  inline def apply(
    CreationTime: Timestamp,
    ImageArn: ImageArn,
    ImageVersionArn: ImageVersionArn,
    ImageVersionStatus: ImageVersionStatus,
    LastModifiedTime: Timestamp,
    Version: ImageVersionNumber
  ): ImageVersion = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ImageArn = ImageArn.asInstanceOf[js.Any], ImageVersionArn = ImageVersionArn.asInstanceOf[js.Any], ImageVersionStatus = ImageVersionStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageVersion]
  }
  
  extension [Self <: ImageVersion](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setImageArn(value: ImageArn): Self = StObject.set(x, "ImageArn", value.asInstanceOf[js.Any])
    
    inline def setImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "ImageVersionArn", value.asInstanceOf[js.Any])
    
    inline def setImageVersionStatus(value: ImageVersionStatus): Self = StObject.set(x, "ImageVersionStatus", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: ImageVersionNumber): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
