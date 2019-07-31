package typings.cavy

import typings.cavy.Anon_GenerateTestHook
import typings.react.reactMod.ReactNode
import typings.react.reactMod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cavyMod {
  type RefCallback = js.Function1[/* element */ ReactNode | Null, Unit]
  type TestHookGenerator = TestHookGeneratorWithRefCallback with TestHookGeneratorWithRefObject
  type TestHookGeneratorWithRefCallback = js.Function2[/* label */ String, /* ref */ js.UndefOr[RefCallback], RefCallback]
  type TestHookGeneratorWithRefObject = js.Function2[/* label */ String, /* ref */ js.UndefOr[RefObject[js.Any]], RefObject[js.Any]]
  type WithTestHook[T /* <: js.Object */] = T with Anon_GenerateTestHook
}
