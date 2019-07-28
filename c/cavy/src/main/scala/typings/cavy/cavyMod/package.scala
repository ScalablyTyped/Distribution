package typings.cavy

import typings.cavy.Anon_GenerateTestHook
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cavyMod {
  type RefCallback = js.Function1[/* element */ ReactNode | Null, Unit]
  type TestHookGenerator = js.Function2[/* label */ String, /* callback */ js.UndefOr[RefCallback], RefCallback]
  type WithTestHook[T /* <: js.Object */] = T with Anon_GenerateTestHook
}
