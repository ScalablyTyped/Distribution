package typings.backlogDashJs.backlogDashJsMod

import typings.backlogDashJs.Anon_Code
import typings.backlogDashJs.Anon_Host
import typings.backlogDashJs.Anon_HostRefreshToken
import typings.backlogDashJs.backlogDashJsMod.EntityNs.OAuth2Ns.AccessToken
import typings.backlogDashJs.backlogDashJsMod.OptionNs.OAuth2Ns.Credentials
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
  def getAccessToken(options: Anon_Code): js.Promise[AccessToken] = js.native
  def getAuthorizationURL(options: Anon_Host): String = js.native
  def refreshAccessToken(options: Anon_HostRefreshToken): js.Promise[AccessToken] = js.native
}

