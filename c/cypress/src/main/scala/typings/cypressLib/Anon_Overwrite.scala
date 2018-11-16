package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Overwrite extends js.Object {
  def add(name: java.lang.String, fn: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  def add(
    name: java.lang.String,
    options: cypressLib.CypressNs.CommandOptions,
    fn: js.Function1[/* repeated */js.Any, scala.Unit]
  ): scala.Unit = js.native
  def overwrite(name: java.lang.String, fn: js.Function1[/* repeated */js.Any, scala.Unit]): scala.Unit = js.native
  def overwrite(
    name: java.lang.String,
    options: cypressLib.CypressNs.CommandOptions,
    fn: js.Function1[/* repeated */js.Any, scala.Unit]
  ): scala.Unit = js.native
}

