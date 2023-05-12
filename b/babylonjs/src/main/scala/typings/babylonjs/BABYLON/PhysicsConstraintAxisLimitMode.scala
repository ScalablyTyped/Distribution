package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsConstraintAxisLimitMode extends StObject
@JSGlobal("BABYLON.PhysicsConstraintAxisLimitMode")
@js.native
object PhysicsConstraintAxisLimitMode extends StObject {
  
  @js.native
  sealed trait FREE
    extends StObject
       with PhysicsConstraintAxisLimitMode
  
  @js.native
  sealed trait LIMITED
    extends StObject
       with PhysicsConstraintAxisLimitMode
  
  @js.native
  sealed trait LOCKED
    extends StObject
       with PhysicsConstraintAxisLimitMode
}
