package typings
package cavyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cavyMod {
  type TestHookGenerator = js.Function2[
    /* label */ java.lang.String, 
    /* callback */ js.UndefOr[cavyLib.RefCallback], 
    cavyLib.RefCallback
  ]
  type WithTestHook[T /* <: js.Object */] = T with cavyLib.Anon_GenerateTestHook
}
