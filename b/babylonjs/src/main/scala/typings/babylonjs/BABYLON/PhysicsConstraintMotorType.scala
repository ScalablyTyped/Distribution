package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsConstraintMotorType extends StObject
@JSGlobal("BABYLON.PhysicsConstraintMotorType")
@js.native
object PhysicsConstraintMotorType extends StObject {
  
  @js.native
  sealed trait NONE
    extends StObject
       with PhysicsConstraintMotorType
  
  @js.native
  sealed trait POSITION
    extends StObject
       with PhysicsConstraintMotorType
  
  @js.native
  sealed trait VELOCITY
    extends StObject
       with PhysicsConstraintMotorType
}
