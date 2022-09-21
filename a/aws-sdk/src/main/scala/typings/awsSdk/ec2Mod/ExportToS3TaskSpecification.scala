package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportToS3TaskSpecification extends StObject {
  
  /**
    * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is exported.
    */
  var ContainerFormat: js.UndefOr[typings.awsSdk.ec2Mod.ContainerFormat] = js.undefined
  
  /**
    * The format for the exported image.
    */
  var DiskImageFormat: js.UndefOr[typings.awsSdk.ec2Mod.DiskImageFormat] = js.undefined
  
  /**
    * The Amazon S3 bucket for the destination image. The destination bucket must exist and have an access control list (ACL) attached that specifies the Region-specific canonical account ID for the Grantee. For more information about the ACL to your S3 bucket, see Prerequisites in the VM Import/Export User Guide.
    */
  var S3Bucket: js.UndefOr[String] = js.undefined
  
  /**
    * The image is written to a single object in the Amazon S3 bucket at the S3 key s3prefix + exportTaskId + '.' + diskImageFormat.
    */
  var S3Prefix: js.UndefOr[String] = js.undefined
}
object ExportToS3TaskSpecification {
  
  inline def apply(): ExportToS3TaskSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportToS3TaskSpecification]
  }
  
  extension [Self <: ExportToS3TaskSpecification](x: Self) {
    
    inline def setContainerFormat(value: ContainerFormat): Self = StObject.set(x, "ContainerFormat", value.asInstanceOf[js.Any])
    
    inline def setContainerFormatUndefined: Self = StObject.set(x, "ContainerFormat", js.undefined)
    
    inline def setDiskImageFormat(value: DiskImageFormat): Self = StObject.set(x, "DiskImageFormat", value.asInstanceOf[js.Any])
    
    inline def setDiskImageFormatUndefined: Self = StObject.set(x, "DiskImageFormat", js.undefined)
    
    inline def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3Prefix(value: String): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    inline def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
  }
}
