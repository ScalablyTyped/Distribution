package typings.backlogJs.mod

import typings.backlogJs.anon.Code
import typings.backlogJs.anon.Host
import typings.backlogJs.anon.RefreshToken
import typings.backlogJs.mod.Entity.OAuth2.AccessToken
import typings.backlogJs.mod.Option.OAuth2.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("backlog-js", "OAuth2")
@js.native
class OAuth2 protected () extends StObject {
  def this(credentials: Credentials) = this()
  def this(credentials: Credentials, timeout: Double) = this()
  
  var credentials: js.Any = js.native
  
  def getAccessToken(options: Code): js.Promise[AccessToken] = js.native
  
  def getAuthorizationURL(options: Host): String = js.native
  
  def refreshAccessToken(options: RefreshToken): js.Promise[AccessToken] = js.native
  
  var timeout: js.Any = js.native
}
