package typings.awsSdkClientS3Browser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteMultipartUploadInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
object CompleteMultipartUploadInput {
  
  @scala.inline
  def apply(Bucket: String, Key: String, UploadId: String): CompleteMultipartUploadInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartUploadInput]
  }
}
