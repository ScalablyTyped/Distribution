package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "SplitSolver")
@js.native
open class SplitSolver protected ()
  extends StObject
     with typings.cannon.CANNON.SplitSolver {
  def this(subsolver: typings.cannon.CANNON.Solver) = this()
  
  /* CompleteClass */
  override def addEquation(eq: typings.cannon.CANNON.Equation): Unit = js.native
  
  /* CompleteClass */
  var equations: js.Array[typings.cannon.CANNON.Equation] = js.native
  
  /* CompleteClass */
  var iterations: Double = js.native
  
  /* CompleteClass */
  override def removeAllEquations(): Unit = js.native
  
  /* CompleteClass */
  override def removeEquation(eq: typings.cannon.CANNON.Equation): Unit = js.native
  
  /* CompleteClass */
  override def solve(dy: Double, world: typings.cannon.CANNON.World): Double = js.native
  
  /* CompleteClass */
  var subsolver: typings.cannon.CANNON.Solver = js.native
}
