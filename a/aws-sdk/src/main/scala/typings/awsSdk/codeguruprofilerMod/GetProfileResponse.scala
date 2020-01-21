package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProfileResponse extends js.Object {
  /**
    * The content encoding of the profile in the payload.
    */
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * The content type of the profile in the payload. Will be application/json or application/x-amzn-ion based on Accept header in the request.
    */
  var contentType: String = js.native
  var profile: AggregatedProfile = js.native
}

object GetProfileResponse {
  @scala.inline
  def apply(contentType: String, profile: AggregatedProfile, contentEncoding: String = null): GetProfileResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    if (contentEncoding != null) __obj.updateDynamic("contentEncoding")(contentEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProfileResponse]
  }
}

