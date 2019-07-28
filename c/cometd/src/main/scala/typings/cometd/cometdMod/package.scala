package typings.cometd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cometdMod {
  type Callback = js.Function1[/* data */ js.Any, Unit]
  type Listener = js.Function1[/* message */ Message, Unit]
}
