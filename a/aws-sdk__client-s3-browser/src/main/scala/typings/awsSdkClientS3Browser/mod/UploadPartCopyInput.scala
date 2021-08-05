package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadPartCopyInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesUploadPartCopyInputMod.UploadPartCopyInput
object UploadPartCopyInput {
  
  inline def apply(Bucket: String, CopySource: String, Key: String, PartNumber: Double, UploadId: String): UploadPartCopyInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CopySource = CopySource.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartCopyInput]
  }
}
