package typings.cacheDashManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cacheDashManagerMod {
  type CallbackFunc[T] = js.Function2[/* error */ js.Any, /* result */ T, Unit]
  type TtlFunction = js.Function1[/* result */ js.Any, Double]
  type WrapArgsType[T] = String | (js.Function1[/* callback */ CallbackFunc[T], Unit]) | CachingConfig | CallbackFunc[T]
}
