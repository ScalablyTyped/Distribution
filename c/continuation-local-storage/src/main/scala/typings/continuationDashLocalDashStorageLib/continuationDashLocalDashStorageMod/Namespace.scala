package typings
package continuationDashLocalDashStorageLib.continuationDashLocalDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Namespace extends js.Object {
   // Note: this is readonly because changing it does not actually rename it
  val active: Context = js.native
  val name: java.lang.String = js.native
  def bind(callback: Func[scala.Unit]): Func[scala.Unit] = js.native
  def bind(callback: Func[scala.Unit], context: Context): Func[scala.Unit] = js.native
  def bindEmitter(emitter: nodeLib.NodeJSNs.EventEmitter): scala.Unit = js.native
  @JSName("bind")
  def bind_T[T](callback: Func[T]): Func[T] = js.native
  @JSName("bind")
  def bind_T[T](callback: Func[T], context: Context): Func[T] = js.native
   // Note: this is readonly because changing it manually will break functionality
  def createContext(): Context = js.native
  def get(key: java.lang.String): js.Any = js.native
  def run(callback: Func[scala.Unit]): Context = js.native
  def runAndReturn[T](callback: Func[T]): T = js.native
  @JSName("run")
  def run_T[T](callback: Func[T]): Context = js.native
  def set[T](key: java.lang.String, value: T): T = js.native
}

