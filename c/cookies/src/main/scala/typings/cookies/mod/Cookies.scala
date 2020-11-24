package typings.cookies.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cookies extends js.Object {
  
  /**
    * This extracts the cookie with the given name from the
    * Cookie header in the request. If such a cookie exists,
    * its value is returned. Otherwise, nothing is returned.
    */
  def get(name: String): js.UndefOr[String] = js.native
  def get(name: String, opts: GetOption): js.UndefOr[String] = js.native
  
  var request: IncomingMessage = js.native
  
  var response: ServerResponse = js.native
  
  var secure: Boolean = js.native
  
  def set(name: String): this.type = js.native
  def set(name: String, opts: SetOption): this.type = js.native
  /**
    * This sets the given cookie in the response and returns
    * the current context to allow chaining.If the value is omitted,
    * an outbound header with an expired date is used to delete the cookie.
    */
  def set(name: String, value: String): this.type = js.native
  def set(name: String, value: String, opts: SetOption): this.type = js.native
}
