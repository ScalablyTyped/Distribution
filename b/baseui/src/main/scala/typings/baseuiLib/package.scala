package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object baseuiLib {
  type Override[T] = OverrideObject[T] | reactLib.reactMod.ComponentType[T]
  type Overrides[T] = org.scalablytyped.runtime.StringDictionary[Override[T]]
  type StyleOverride = js.Object | (js.Function1[/* props */ js.Any, js.Object])
}
