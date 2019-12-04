package typings.baconjs

import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/assert", JSImport.Namespace)
@js.native
object typesInternalAssertMod extends js.Object {
  def assert(message: String, condition: Boolean): Unit = js.native
  def assertArray(xs: js.Array[_]): Unit = js.native
  def assertEventStream(event: js.Any): Unit = js.native
  def assertFunction(): Unit = js.native
  def assertFunction(f: js.Function): Unit = js.native
  def assertNoArguments(args: IArguments): Unit = js.native
  def assertObservable(observable: js.Any): Unit = js.native
  def assertObservableIsProperty(x: js.Any): Unit = js.native
}

