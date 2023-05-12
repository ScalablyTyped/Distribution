package typings.babylonjs.physicsIndexMod

import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintParameters
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Physics/index", "Physics6DoFConstraint")
@js.native
open class Physics6DoFConstraint protected ()
  extends typings.babylonjs.physicsV2IndexMod.Physics6DoFConstraint {
  def this(
    constraintParams: PhysicsConstraintParameters,
    limits: js.Array[typings.babylonjs.physicsV2PhysicsConstraintMod.Physics6DoFLimit],
    scene: Scene
  ) = this()
}
