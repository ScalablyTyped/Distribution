package typings.cavy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RefCallback = js.Function1[/* element */ typings.react.mod.ReactNode | scala.Null, scala.Unit]
  type TestHookGenerator = typings.cavy.mod.TestHookGeneratorWithRefCallback with typings.cavy.mod.TestHookGeneratorWithRefObject
  type TestHookGeneratorWithRefCallback = js.Function2[
    /* label */ java.lang.String, 
    /* ref */ js.UndefOr[typings.cavy.mod.RefCallback], 
    typings.cavy.mod.RefCallback
  ]
  type TestHookGeneratorWithRefObject = js.Function2[
    /* label */ java.lang.String, 
    /* ref */ js.UndefOr[typings.react.mod.RefObject[js.Any]], 
    typings.react.mod.RefObject[js.Any]
  ]
  type WithTestHook[P /* <: js.Object */] = P with typings.cavy.AnonGenerateTestHook
}
