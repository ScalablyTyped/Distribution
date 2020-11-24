package typings.axon.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("axon", "SubEmitterSocket")
@js.native
class SubEmitterSocket () extends js.Object {
  
  def bind(port: ConnectionPort): Socket_ = js.native
  def bind(port: ConnectionPort, host: js.UndefOr[scala.Nothing], fn: js.Function0[Unit]): Socket_ = js.native
  def bind(port: ConnectionPort, host: String): Socket_ = js.native
  def bind(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
  def bind(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
  def bind(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
  
  def close(): Unit = js.native
  
  def connect(port: ConnectionPort): Socket_ = js.native
  def connect(port: ConnectionPort, host: js.UndefOr[scala.Nothing], fn: js.Function0[Unit]): Socket_ = js.native
  def connect(port: ConnectionPort, host: String): Socket_ = js.native
  def connect(port: ConnectionPort, host: String, fn: js.Function0[Unit]): Socket_ = js.native
  def connect(port: ConnectionPort, host: js.Function0[Unit]): Socket_ = js.native
  def connect(port: ConnectionPort, host: js.Function0[Unit], fn: js.Function0[Unit]): Socket_ = js.native
  
  def off(event: String): SubEmitterSocket = js.native
  
  def on(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): SubEmitterSocket = js.native
  
  def onmessage(): js.Function1[/* args */ Buffer | js.Array[Buffer], Unit] = js.native
}
