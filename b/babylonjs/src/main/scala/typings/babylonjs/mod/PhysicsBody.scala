package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PhysicsBody")
@js.native
open class PhysicsBody protected ()
  extends typings.babylonjs.legacyLegacyMod.PhysicsBody {
  /**
    * Constructs a new physics body for the given node.
    * @param transformNode - The Transform Node to construct the physics body for.
    * @param motionType - The motion type of the physics body. The options are:
    *  - PhysicsMotionType.STATIC - Static bodies are not moving and unaffected by forces or collisions. They are good for level boundaries or terrain.
    *  - PhysicsMotionType.DYNAMIC - Dynamic bodies are fully simulated. They can move and collide with other objects.
    *  - PhysicsMotionType.ANIMATED - They behave like dynamic bodies, but they won't be affected by other bodies, but still push other bodies out of the way.
    * @param startsAsleep - Whether the physics body should start in a sleeping state (not a guarantee). Defaults to false.
    * @param scene - The scene containing the physics engine.
    *
    * This code is useful for creating a physics body for a given Transform Node in a scene.
    * It checks the version of the physics engine and the physics plugin, and initializes the body accordingly.
    * It also sets the node's rotation quaternion if it is not already set. Finally, it adds the body to the physics engine.
    */
  def this(
    transformNode: typings.babylonjs.meshesTransformNodeMod.TransformNode,
    motionType: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsMotionType,
    startsAsleep: Boolean,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
