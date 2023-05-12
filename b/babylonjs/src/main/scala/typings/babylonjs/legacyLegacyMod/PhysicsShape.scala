package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.physicsV2PhysicsShapeMod.PhysicShapeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PhysicsShape")
@js.native
open class PhysicsShape protected ()
  extends typings.babylonjs.indexMod.PhysicsShape {
  /**
    * Constructs a new physics shape.
    * @param options The options for the physics shape. These are:
    *  * type: The type of the shape. This can be one of the following: SPHERE, BOX, CAPSULE, CYLINDER, CONVEX_HULL, MESH, HEIGHTFIELD, CONTAINER
    *  * parameters: The parameters of the shape.
    *  * pluginData: The plugin data of the shape. This is used if you already have a reference to the object on the plugin side.
    * You need to specify either type or pluginData.
    * @param scene The scene the shape belongs to.
    *
    * This code is useful for creating a new physics shape with the given type, options, and scene.
    * It also checks that the physics engine and plugin version are correct.
    * If not, it throws an error. This ensures that the shape is created with the correct parameters and is compatible with the physics engine.
    */
  def this(options: PhysicShapeOptions, scene: typings.babylonjs.sceneMod.Scene) = this()
}
