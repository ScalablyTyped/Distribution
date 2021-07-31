package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMultipartUploadInput
  extends StObject
     with typings.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
object CreateMultipartUploadInput {
  
  @scala.inline
  def apply(Bucket: String, Key: String): CreateMultipartUploadInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultipartUploadInput]
  }
}
