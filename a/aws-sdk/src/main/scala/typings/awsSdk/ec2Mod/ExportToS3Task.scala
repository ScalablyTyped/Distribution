package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportToS3Task extends StObject {
  
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
    * The encryption key for your S3 bucket.
    */
  var S3Key: js.UndefOr[String] = js.undefined
}
object ExportToS3Task {
  
  inline def apply(): ExportToS3Task = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportToS3Task]
  }
  
  extension [Self <: ExportToS3Task](x: Self) {
    
    inline def setContainerFormat(value: ContainerFormat): Self = StObject.set(x, "ContainerFormat", value.asInstanceOf[js.Any])
    
    inline def setContainerFormatUndefined: Self = StObject.set(x, "ContainerFormat", js.undefined)
    
    inline def setDiskImageFormat(value: DiskImageFormat): Self = StObject.set(x, "DiskImageFormat", value.asInstanceOf[js.Any])
    
    inline def setDiskImageFormatUndefined: Self = StObject.set(x, "DiskImageFormat", js.undefined)
    
    inline def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    inline def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    inline def setS3Key(value: String): Self = StObject.set(x, "S3Key", value.asInstanceOf[js.Any])
    
    inline def setS3KeyUndefined: Self = StObject.set(x, "S3Key", js.undefined)
  }
}
