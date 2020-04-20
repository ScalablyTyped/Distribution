package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCloudFrontOriginAccessIdentityRequest extends js.Object {
  /**
    * The identity's ID.
    */
  var Id: String = js.native
}

object GetCloudFrontOriginAccessIdentityRequest {
  @scala.inline
  def apply(Id: String): GetCloudFrontOriginAccessIdentityRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityRequest]
  }
}

