package typings.broadcastChannel.broadcastChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("broadcast-channel/types/broadcast-channel", "BroadcastChannel")
@js.native
class BroadcastChannel[T] protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, opts: BroadcastChannelOptions) = this()
  
  // not defined in the offical standard
  def addEventListener(`type`: EventType, handler: OnMessageHandler[T]): Unit = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  val name: String = js.native
  
  var onmessage: OnMessageHandler[T] = js.native
  
  val options: BroadcastChannelOptions = js.native
  
  def postMessage(msg: T): js.Promise[Unit] = js.native
  
  def removeEventListener(`type`: EventType, handler: OnMessageHandler[T]): Unit = js.native
  
  val `type`: MethodType = js.native
}
