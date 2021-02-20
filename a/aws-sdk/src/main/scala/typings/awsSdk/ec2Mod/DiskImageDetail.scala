package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskImageDetail extends StObject {
  
  /**
    * The size of the disk image, in GiB.
    */
  var Bytes: Long = js.native
  
  /**
    * The disk image format.
    */
  var Format: DiskImageFormat = js.native
  
  /**
    * A presigned URL for the import manifest stored in Amazon S3 and presented here as an Amazon S3 presigned URL. For information about creating a presigned URL for an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the Authenticating REST Requests topic in the Amazon Simple Storage Service Developer Guide. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  var ImportManifestUrl: String = js.native
}
object DiskImageDetail {
  
  @scala.inline
  def apply(Bytes: Long, Format: DiskImageFormat, ImportManifestUrl: String): DiskImageDetail = {
    val __obj = js.Dynamic.literal(Bytes = Bytes.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], ImportManifestUrl = ImportManifestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskImageDetail]
  }
  
  @scala.inline
  implicit class DiskImageDetailMutableBuilder[Self <: DiskImageDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytes(value: Long): Self = StObject.set(x, "Bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: DiskImageFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportManifestUrl(value: String): Self = StObject.set(x, "ImportManifestUrl", value.asInstanceOf[js.Any])
  }
}
