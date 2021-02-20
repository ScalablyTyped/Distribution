package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "TrailMesh")
@js.native
class TrailMesh protected ()
  extends typings.babylonjs.indexMod.TrailMesh {
  /**
    * @constructor
    * @param name The value used by scene.getMeshByName() to do a lookup.
    * @param generator The mesh or transform node to generate a trail.
    * @param scene The scene to add this mesh to.
    * @param diameter Diameter of trailing mesh. Default is 1.
    * @param length Length of trailing mesh. Default is 60.
    * @param autoStart Automatically start trailing mesh. Default true.
    */
  def this(
    name: String,
    generator: typings.babylonjs.transformNodeMod.TransformNode,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.transformNodeMod.TransformNode,
    scene: typings.babylonjs.sceneMod.Scene,
    diameter: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.transformNodeMod.TransformNode,
    scene: typings.babylonjs.sceneMod.Scene,
    diameter: js.UndefOr[scala.Nothing],
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.transformNodeMod.TransformNode,
    scene: typings.babylonjs.sceneMod.Scene,
    diameter: Double,
    length: Double
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.transformNodeMod.TransformNode,
    scene: typings.babylonjs.sceneMod.Scene,
    diameter: js.UndefOr[scala.Nothing],
    length: js.UndefOr[scala.Nothing],
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.transformNodeMod.TransformNode,
    scene: typings.babylonjs.sceneMod.Scene,
    diameter: js.UndefOr[scala.Nothing],
    length: Double,
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.transformNodeMod.TransformNode,
    scene: typings.babylonjs.sceneMod.Scene,
    diameter: Double,
    length: js.UndefOr[scala.Nothing],
    autoStart: Boolean
  ) = this()
  def this(
    name: String,
    generator: typings.babylonjs.transformNodeMod.TransformNode,
    scene: typings.babylonjs.sceneMod.Scene,
    diameter: Double,
    length: Double,
    autoStart: Boolean
  ) = this()
}
/* static members */
object TrailMesh {
  
  /**
    * Parses a serialized trail mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the trail mesh in
    * @returns the created trail mesh
    */
  @JSImport("babylonjs/Legacy/legacy", "TrailMesh.Parse")
  @js.native
  def Parse(parsedMesh: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.trailMeshMod.TrailMesh = js.native
}
