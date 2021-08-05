package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortMultipartUploadInput
  extends StObject
     with typings.awsSdkClientS3Node.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
object AbortMultipartUploadInput {
  
  inline def apply(Bucket: String, Key: String, UploadId: String): AbortMultipartUploadInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortMultipartUploadInput]
  }
}
