package typings
package chunkedDashDcLib.chunkedDcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unchunker extends js.Object {
  @JSName("onMessage")
  var onMessage_Original: MessageListener = js.native
  def add(chunk: stdLib.ArrayBuffer): scala.Unit = js.native
  def add(chunk: stdLib.ArrayBuffer, context: js.Any): scala.Unit = js.native
  def gc(maxAge: scala.Double): scala.Double = js.native
  def onMessage(message: stdLib.Uint8Array): scala.Unit = js.native
  def onMessage(message: stdLib.Uint8Array, context: js.Any): scala.Unit = js.native
}

