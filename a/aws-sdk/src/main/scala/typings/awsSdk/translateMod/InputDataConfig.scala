package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputDataConfig extends js.Object {
  /**
    * The multipurpose internet mail extension (MIME) type of the input files. Valid values are text/plain for plaintext files and text/html for HTML files.
    */
  var ContentType: typings.awsSdk.translateMod.ContentType = js.native
  /**
    * The URI of the AWS S3 folder that contains the input file. The folder must be in the same Region as the API endpoint you are calling.
    */
  var S3Uri: typings.awsSdk.translateMod.S3Uri = js.native
}

object InputDataConfig {
  @scala.inline
  def apply(ContentType: ContentType, S3Uri: S3Uri): InputDataConfig = {
    val __obj = js.Dynamic.literal(ContentType = ContentType.asInstanceOf[js.Any], S3Uri = S3Uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputDataConfig]
  }
}

