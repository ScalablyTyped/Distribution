package typings.cannon.global.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.GSSolver")
@js.native
class GSSolver ()
  extends typings.cannon.CANNON.GSSolver {
  /* CompleteClass */
  override var equations: js.Array[typings.cannon.CANNON.Equation] = js.native
  /* CompleteClass */
  override var iterations: Double = js.native
  /* CompleteClass */
  override var tolerance: Double = js.native
  /* CompleteClass */
  override def addEquation(eq: typings.cannon.CANNON.Equation): Unit = js.native
  /* CompleteClass */
  override def removeAllEquations(): Unit = js.native
  /* CompleteClass */
  override def removeEquation(eq: typings.cannon.CANNON.Equation): Unit = js.native
  /* CompleteClass */
  override def solve(dy: Double, world: typings.cannon.CANNON.World): Double = js.native
}

