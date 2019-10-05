package typings.dav.davMod.transport

import typings.dav.davMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dav", "transport.Basic")
@js.native
class Basic protected () extends Transport {
  /**
    * Create a new Basic object. This sends dav requests using http basic authentication.
    * @param credentials user authorization.
    */
  def this(credentials: Credentials) = this()
}

