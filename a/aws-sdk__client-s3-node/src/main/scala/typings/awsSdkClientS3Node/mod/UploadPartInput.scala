package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadPartInput[StreamType]
  extends StObject
     with typings.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput[StreamType]
object UploadPartInput {
  
  inline def apply[StreamType](Bucket: String, Key: String, PartNumber: Double, UploadId: String): UploadPartInput[StreamType] = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartInput[StreamType]]
  }
}
