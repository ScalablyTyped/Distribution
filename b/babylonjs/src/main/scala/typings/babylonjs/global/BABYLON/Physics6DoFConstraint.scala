package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.PhysicsConstraintParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Physics6DoFConstraint")
@js.native
open class Physics6DoFConstraint protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Physics6DoFConstraint {
  def this(
    constraintParams: PhysicsConstraintParameters,
    limits: js.Array[typings.babylonjs.BABYLON.Physics6DoFLimit],
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
}
