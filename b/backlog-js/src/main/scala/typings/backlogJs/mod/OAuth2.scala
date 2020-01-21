package typings.backlogJs.mod

import typings.backlogJs.AnonCode
import typings.backlogJs.AnonHost
import typings.backlogJs.AnonHostRefreshToken
import typings.backlogJs.mod.Entity.OAuth2.AccessToken
import typings.backlogJs.mod.Option.OAuth2.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "OAuth2")
@js.native
class OAuth2 protected () extends js.Object {
  def this(credentials: Credentials) = this()
  def this(credentials: Credentials, timeout: Double) = this()
  var credentials: js.Any = js.native
  var timeout: js.Any = js.native
  def getAccessToken(options: AnonCode): js.Promise[AccessToken] = js.native
  def getAuthorizationURL(options: AnonHost): String = js.native
  def refreshAccessToken(options: AnonHostRefreshToken): js.Promise[AccessToken] = js.native
}

