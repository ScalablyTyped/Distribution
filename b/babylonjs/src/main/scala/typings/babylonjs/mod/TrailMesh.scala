package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "TrailMesh")
@js.native
class TrailMesh protected ()
  extends typings.babylonjs.legacyMod.TrailMesh {
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
    diameter: Double,
    length: Double
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
@JSImport("babylonjs", "TrailMesh")
@js.native
object TrailMesh extends js.Object {
  /**
    * Parses a serialized trail mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the trail mesh in
    * @returns the created trail mesh
    */
  def Parse(parsedMesh: js.Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.trailMeshMod.TrailMesh = js.native
}

