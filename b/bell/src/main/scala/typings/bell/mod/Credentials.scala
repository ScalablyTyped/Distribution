package typings.bell.mod

import typings.bell.bellStrings.custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  /**
    * Varying data depending on provider.
    */
  var profile: js.UndefOr[js.Object] = js.native
  var provider: Provider | custom = js.native
  var query: StringLikeMap = js.native
  var token: String = js.native
}

object Credentials {
  @scala.inline
  def apply(provider: Provider | custom, query: StringLikeMap, token: String): Credentials = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  @scala.inline
  implicit class CredentialsOps[Self <: Credentials] (val x: Self) extends AnyVal {
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
    def setProvider(value: Provider | custom): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: StringLikeMap): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfile(value: js.Object): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
  }
  
}

