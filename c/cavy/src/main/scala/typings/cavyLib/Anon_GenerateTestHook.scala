package typings
package cavyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GenerateTestHook extends js.Object {
  @JSName("generateTestHook")
  var generateTestHook_Original: cavyLib.cavyMod.TestHookGenerator = js.native
  def generateTestHook(label: java.lang.String): cavyLib.cavyMod.RefCallback = js.native
  def generateTestHook(label: java.lang.String, callback: cavyLib.cavyMod.RefCallback): cavyLib.cavyMod.RefCallback = js.native
}

