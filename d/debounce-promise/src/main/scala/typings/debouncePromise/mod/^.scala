package typings.debouncePromise.mod

import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("debounce-promise", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T): js.Function1[/* args */ Parameters[T], js.Promise[ReturnType[T]] | ReturnType[T]] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: js.UndefOr[scala.Nothing], options: DebounceOptions): js.Function1[/* args */ Parameters[T], js.Promise[ReturnType[T]] | ReturnType[T]] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: Double): js.Function1[/* args */ Parameters[T], js.Promise[ReturnType[T]] | ReturnType[T]] = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, wait: Double, options: DebounceOptions): js.Function1[/* args */ Parameters[T], js.Promise[ReturnType[T]] | ReturnType[T]] = js.native
}
