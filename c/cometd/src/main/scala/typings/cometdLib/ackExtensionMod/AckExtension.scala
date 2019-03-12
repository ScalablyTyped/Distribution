package typings
package cometdLib.ackExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AckExtension
  extends cometdLib.cometdMod.Extension {
  @JSName("incoming")
  var incoming_Original: cometdLib.cometdMod.Listener = js.native
  @JSName("outgoing")
  var outgoing_Original: cometdLib.cometdMod.Listener = js.native
  @JSName("incoming")
  def incoming_MAckExtension(message: cometdLib.cometdMod.Message): scala.Unit = js.native
  @JSName("outgoing")
  def outgoing_MAckExtension(message: cometdLib.cometdMod.Message): scala.Unit = js.native
  @JSName("registered")
  def registered_MAckExtension(name: java.lang.String, cometd: cometdLib.cometdMod.CometD): scala.Unit = js.native
  @JSName("unregistered")
  def unregistered_MAckExtension(): scala.Unit = js.native
}

