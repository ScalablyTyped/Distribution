package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object baseuiLib {
  type Override[T] = OverrideObject[T] | reactLib.reactMod.ComponentType[T]
  type Overrides[T] = org.scalablytyped.runtime.StringDictionary[Override[T]]
  type StyleOverride[T] = js.Object | (js.Function1[/* props */ Anon_Theme with reactLib.reactMod.PropsWithChildren[T], js.Object])
}
