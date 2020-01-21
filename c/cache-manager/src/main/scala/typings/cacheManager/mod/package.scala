package typings.cacheManager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackFunc[T] = js.Function2[/* error */ js.Any, /* result */ T, scala.Unit]
  type TtlFunction = js.Function1[/* result */ js.Any, scala.Double]
  type WrapArgsType[T] = java.lang.String | (js.Function1[/* callback */ typings.cacheManager.mod.CallbackFunc[T], scala.Unit]) | typings.cacheManager.mod.CachingConfig | typings.cacheManager.mod.CallbackFunc[T]
}
