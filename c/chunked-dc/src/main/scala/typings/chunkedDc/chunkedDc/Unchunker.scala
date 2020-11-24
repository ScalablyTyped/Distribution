package typings.chunkedDc.chunkedDc

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unchunker extends js.Object {
  
  def add(chunk: ArrayBuffer): Unit = js.native
  def add(chunk: ArrayBuffer, context: js.Any): Unit = js.native
  
  def gc(maxAge: Double): Double = js.native
  
  def onMessage(message: Uint8Array): Unit = js.native
  def onMessage(message: Uint8Array, context: js.Any): Unit = js.native
  @JSName("onMessage")
  var onMessage_Original: MessageListener = js.native
}
