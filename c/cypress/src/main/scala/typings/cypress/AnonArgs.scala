package typings.cypress

import typings.cypress.lodashMod.MapCacheConstructor
import typings.cypress.lodashMod.MemoizedFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgs extends js.Object {
  var Cache: MapCacheConstructor = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T): T with MemoizedFunction = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](func: T, resolver: js.Function1[/* repeated */ js.Any, _]): T with MemoizedFunction = js.native
}

