package typings.dav.mod.transport

import typings.dav.mod.Credentials
import typings.dav.mod.Request_
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
  def send(request: Request_, url: String): js.Promise[_] = js.native
  def send(request: Request_, url: String, options: TransportOptions): js.Promise[_] = js.native
}

