package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryArgProfileConfig extends js.Object {
  /**
    * Flag to set if you want a request to be forwarded to the origin even if the profile specified by the field-level encryption query argument, fle-profile, is unknown.
    */
  var ForwardWhenQueryArgProfileIsUnknown: Boolean = js.native
  /**
    * Profiles specified for query argument-profile mapping for field-level encryption.
    */
  var QueryArgProfiles: js.UndefOr[typings.awsSdk.cloudfrontMod.QueryArgProfiles] = js.native
}

object QueryArgProfileConfig {
  @scala.inline
  def apply(ForwardWhenQueryArgProfileIsUnknown: Boolean, QueryArgProfiles: QueryArgProfiles = null): QueryArgProfileConfig = {
    val __obj = js.Dynamic.literal(ForwardWhenQueryArgProfileIsUnknown = ForwardWhenQueryArgProfileIsUnknown.asInstanceOf[js.Any])
    if (QueryArgProfiles != null) __obj.updateDynamic("QueryArgProfiles")(QueryArgProfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArgProfileConfig]
  }
}

