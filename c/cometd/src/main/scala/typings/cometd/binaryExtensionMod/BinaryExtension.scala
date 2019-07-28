package typings.cometd.binaryExtensionMod

import typings.cometd.cometdMod.Extension
import typings.cometd.cometdMod.Listener
import typings.cometd.cometdMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryExtension extends Extension {
  @JSName("incoming")
  var incoming_Original: Listener = js.native
  @JSName("outgoing")
  var outgoing_Original: Listener = js.native
  @JSName("incoming")
  def incoming_MBinaryExtension(message: Message): Unit = js.native
  @JSName("outgoing")
  def outgoing_MBinaryExtension(message: Message): Unit = js.native
}

