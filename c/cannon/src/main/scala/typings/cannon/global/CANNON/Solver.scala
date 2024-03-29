package typings.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.Solver")
@js.native
open class Solver ()
  extends StObject
     with typings.cannon.CANNON.Solver {
  
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
}
