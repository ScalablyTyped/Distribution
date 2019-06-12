package typings
package bellLib.bellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bell", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val plugin: hapiLib.hapiMod.Plugin[BellOptions] = js.native
  def simulate(credentialsFunc: RequestPassThrough): scala.Unit = js.native
  @JSName("simulate")
  def simulate_false(state: bellLib.bellLibNumbers.`false`): scala.Unit = js.native
}

