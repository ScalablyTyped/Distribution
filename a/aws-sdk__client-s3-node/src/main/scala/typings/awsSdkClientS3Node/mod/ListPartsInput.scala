package typings.awsSdkClientS3Node.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartsInput
  extends StObject
     with typings.awsSdkClientS3Node.typesListPartsInputMod.ListPartsInput
object ListPartsInput {
  
  @scala.inline
  def apply(Bucket: String, Key: String, UploadId: String): ListPartsInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartsInput]
  }
}
