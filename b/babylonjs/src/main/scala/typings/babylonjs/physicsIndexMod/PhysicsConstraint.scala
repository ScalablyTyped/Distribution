package typings.babylonjs.physicsIndexMod

import typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintParameters
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Physics/index", "PhysicsConstraint")
@js.native
open class PhysicsConstraint protected ()
  extends typings.babylonjs.physicsV2IndexMod.PhysicsConstraint {
  /**
    * Constructs a new constraint for the physics constraint.
    * @param type The type of constraint to create.
    * @param options The options for the constraint.
    * @param scene The scene the constraint belongs to.
    *
    * This code is useful for creating a new constraint for the physics engine. It checks if the scene has a physics engine, and if the plugin version is correct.
    * If all checks pass, it initializes the constraint with the given type and options.
    */
  def this(
    `type`: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsConstraintType,
    options: PhysicsConstraintParameters,
    scene: Scene
  ) = this()
}
