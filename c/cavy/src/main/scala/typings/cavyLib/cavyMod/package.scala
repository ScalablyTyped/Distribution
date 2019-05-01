package typings
package cavyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cavyMod {
  type RefCallback = js.Function1[/* element */ reactLib.reactMod.ReactNode | scala.Null, scala.Unit]
  type TestHookGenerator = js.Function2[/* label */ java.lang.String, /* callback */ js.UndefOr[RefCallback], RefCallback]
  type WithTestHook[T /* <: js.Object */] = T with cavyLib.Anon_GenerateTestHook
}
