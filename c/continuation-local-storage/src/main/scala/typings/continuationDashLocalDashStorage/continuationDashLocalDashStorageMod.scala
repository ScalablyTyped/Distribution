package typings.continuationDashLocalDashStorage

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("continuation-local-storage", JSImport.Namespace)
@js.native
object continuationDashLocalDashStorageMod extends js.Object {
  @js.native
  trait Namespace extends js.Object {
     // Note: this is readonly because changing it does not actually rename it
    val active: Context = js.native
    val name: String = js.native
    def bind(callback: Func[Unit]): Func[Unit] = js.native
    def bind(callback: Func[Unit], context: Context): Func[Unit] = js.native
    def bindEmitter(emitter: EventEmitter): Unit = js.native
    @JSName("bind")
    def bind_T[T](callback: Func[T]): Func[T] = js.native
    @JSName("bind")
    def bind_T[T](callback: Func[T], context: Context): Func[T] = js.native
     // Note: this is readonly because changing it manually will break functionality
    def createContext(): Context = js.native
    def enter(context: Context): Unit = js.native
    def exit(context: Context): Unit = js.native
    def get(key: String): js.Any = js.native
    def run(callback: Func[Unit]): Context = js.native
    def runAndReturn[T](callback: Func[T]): T = js.native
    @JSName("run")
    def run_T[T](callback: Func[T]): Context = js.native
    def set[T](key: String, value: T): T = js.native
  }
  
  def createNamespace(name: String): Namespace = js.native
  def destroyNamespace(name: String): Unit = js.native
  def getNamespace(name: String): Namespace = js.native
  def reset(): Unit = js.native
  type Context = StringDictionary[js.Any]
  type Func[T] = js.Function1[/* repeated */ js.Any, T]
}

