package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.SplitSolver")
@js.native
class SplitSolver protected () extends Solver {
  def this(subsolver: Solver) = this()
  var subsolver: Solver = js.native
}

