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
  def apply(ForwardWhenQueryArgProfileIsUnknown: Boolean): QueryArgProfileConfig = {
    val __obj = js.Dynamic.literal(ForwardWhenQueryArgProfileIsUnknown = ForwardWhenQueryArgProfileIsUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryArgProfileConfig]
  }
  @scala.inline
  implicit class QueryArgProfileConfigOps[Self <: QueryArgProfileConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForwardWhenQueryArgProfileIsUnknown(value: Boolean): Self = this.set("ForwardWhenQueryArgProfileIsUnknown", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryArgProfiles(value: QueryArgProfiles): Self = this.set("QueryArgProfiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryArgProfiles: Self = this.set("QueryArgProfiles", js.undefined)
  }
  
}

