package typings
package cometdLib.binaryExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinaryExtension
  extends cometdLib.cometdMod.Extension {
  @JSName("incoming")
  var incoming_Original: cometdLib.cometdMod.Listener = js.native
  @JSName("outgoing")
  var outgoing_Original: cometdLib.cometdMod.Listener = js.native
  @JSName("incoming")
  def incoming_MBinaryExtension(message: cometdLib.cometdMod.Message): scala.Unit = js.native
  @JSName("outgoing")
  def outgoing_MBinaryExtension(message: cometdLib.cometdMod.Message): scala.Unit = js.native
}

