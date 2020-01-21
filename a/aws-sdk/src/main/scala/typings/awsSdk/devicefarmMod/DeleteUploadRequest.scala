package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUploadRequest extends js.Object {
  /**
    * Represents the Amazon Resource Name (ARN) of the Device Farm upload to delete.
    */
  var arn: AmazonResourceName = js.native
}

object DeleteUploadRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): DeleteUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUploadRequest]
  }
}

