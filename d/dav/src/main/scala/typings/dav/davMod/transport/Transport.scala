package typings.dav.davMod.transport

import typings.dav.davMod.Credentials
import typings.dav.davMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "transport.Transport")
@js.native
class Transport protected () extends js.Object {
  /**
    * @param credentials user authorization.
    */
  def this(credentials: Credentials) = this()
  def send(request: Request, url: String): js.Promise[_] = js.native
  def send(request: Request, url: String, options: TransportOptions): js.Promise[_] = js.native
}

