package typings.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.SplitSolver")
@js.native
class SplitSolver protected ()
  extends typings.cannon.CANNON.SplitSolver {
  def this(subsolver: typings.cannon.CANNON.Solver) = this()
  /* CompleteClass */
  override var equations: js.Array[typings.cannon.CANNON.Equation] = js.native
  /* CompleteClass */
  override var iterations: Double = js.native
  /* CompleteClass */
  override var subsolver: typings.cannon.CANNON.Solver = js.native
  /* CompleteClass */
  override def addEquation(eq: typings.cannon.CANNON.Equation): Unit = js.native
  /* CompleteClass */
  override def removeAllEquations(): Unit = js.native
  /* CompleteClass */
  override def removeEquation(eq: typings.cannon.CANNON.Equation): Unit = js.native
  /* CompleteClass */
  override def solve(dy: Double, world: typings.cannon.CANNON.World): Double = js.native
}

