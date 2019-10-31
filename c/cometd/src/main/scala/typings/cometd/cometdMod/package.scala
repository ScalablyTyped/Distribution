package typings.cometd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cometdMod {
  type Callback = js.Function1[/* data */ js.Any, Unit]
  type HandshakeListener = js.Function1[/* message */ HandshakeMessage, Unit]
  type Listener = js.Function1[/* message */ Message, Unit]
  type SubscribeListener = js.Function1[/* message */ SubscribeMessage, Unit]
}
