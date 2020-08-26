package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credentials extends js.Object {
  /**
    * An access token generated for a federated user to access Amazon Connect.
    */
  var AccessToken: js.UndefOr[SecurityToken] = js.native
  /**
    * A token generated with an expiration time for the session a user is logged in to Amazon Connect.
    */
  var AccessTokenExpiration: js.UndefOr[timestamp] = js.native
  /**
    * Renews a token generated for a user to access the Amazon Connect instance.
    */
  var RefreshToken: js.UndefOr[SecurityToken] = js.native
  /**
    * Renews the expiration timer for a generated token.
    */
  var RefreshTokenExpiration: js.UndefOr[timestamp] = js.native
}

object Credentials {
  @scala.inline
  def apply(): Credentials = {
    val __obj = js.Dynamic.literal()
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
    def setAccessToken(value: SecurityToken): Self = this.set("AccessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("AccessToken", js.undefined)
    @scala.inline
    def setAccessTokenExpiration(value: timestamp): Self = this.set("AccessTokenExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessTokenExpiration: Self = this.set("AccessTokenExpiration", js.undefined)
    @scala.inline
    def setRefreshToken(value: SecurityToken): Self = this.set("RefreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("RefreshToken", js.undefined)
    @scala.inline
    def setRefreshTokenExpiration(value: timestamp): Self = this.set("RefreshTokenExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshTokenExpiration: Self = this.set("RefreshTokenExpiration", js.undefined)
  }
  
}

