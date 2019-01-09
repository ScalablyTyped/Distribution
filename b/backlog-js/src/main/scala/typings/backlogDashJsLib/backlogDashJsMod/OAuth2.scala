package typings
package backlogDashJsLib.backlogDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "OAuth2")
@js.native
class OAuth2 protected () extends js.Object {
  def this(credentials: backlogDashJsLib.backlogDashJsMod.OptionNs.OAuth2Ns.Credentials) = this()
  def this(credentials: backlogDashJsLib.backlogDashJsMod.OptionNs.OAuth2Ns.Credentials, timeout: scala.Double) = this()
  var credentials: js.Any = js.native
  var timeout: js.Any = js.native
  def getAccessToken(options: backlogDashJsLib.Anon_Code): js.Promise[backlogDashJsLib.backlogDashJsMod.EntityNs.OAuth2Ns.AccessToken] = js.native
  def getAuthorizationURL(options: backlogDashJsLib.Anon_Host): java.lang.String = js.native
  def refreshAccessToken(options: backlogDashJsLib.Anon_HostRefreshToken): js.Promise[backlogDashJsLib.backlogDashJsMod.EntityNs.OAuth2Ns.AccessToken] = js.native
}

