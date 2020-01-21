package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCloudFrontOriginAccessIdentityRequest extends js.Object {
  /**
    * The origin access identity's ID.
    */
  var Id: String = js.native
  /**
    * The value of the ETag header you received from a previous GET or PUT request. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
}

object DeleteCloudFrontOriginAccessIdentityRequest {
  @scala.inline
  def apply(Id: String, IfMatch: String = null): DeleteCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCloudFrontOriginAccessIdentityRequest]
  }
}

