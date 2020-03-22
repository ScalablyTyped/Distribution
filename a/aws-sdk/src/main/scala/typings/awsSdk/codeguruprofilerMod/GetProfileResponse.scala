package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProfileResponse extends js.Object {
  /**
    * The content encoding of the profile.
    */
  var contentEncoding: js.UndefOr[String] = js.native
  /**
    * The content type of the profile in the payload. It is either application/json or the default application/x-amzn-ion.
    */
  var contentType: String = js.native
  /**
    * Information about the profile.
    */
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

