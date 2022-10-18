package typings.babylonjs.meshesIndexMod

import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "LinesMesh")
@js.native
open class LinesMesh protected ()
  extends typings.babylonjs.meshesLinesMeshMod.LinesMesh {
  /**
    * Creates a new LinesMesh
    * @param name defines the name
    * @param scene defines the hosting scene
    * @param parent defines the parent mesh if any
    * @param source defines the optional source LinesMesh used to clone data from
    * @param doNotCloneChildren When cloning, skip cloning child meshes of source, default False.
    * When false, achieved by calling a clone(), also passing False.
    * This will make creation of children, recursive.
    * @param useVertexColor defines if this LinesMesh supports vertex color
    * @param useVertexAlpha defines if this LinesMesh supports vertex alpha
    * @param material material to use to draw the line. If not provided, will create a new one
    */
  def this(
    name: String,
    scene: js.UndefOr[Nullable[Scene]],
    parent: js.UndefOr[Nullable[Node]],
    source: js.UndefOr[Nullable[typings.babylonjs.meshesLinesMeshMod.LinesMesh]],
    doNotCloneChildren: js.UndefOr[Boolean],
    /**
    * If vertex color should be applied to the mesh
    */
  useVertexColor: js.UndefOr[Boolean],
    /**
    * If vertex alpha should be applied to the mesh
    */
  useVertexAlpha: js.UndefOr[Boolean],
    material: js.UndefOr[Material]
  ) = this()
}
/* static members */
object LinesMesh {
  
  @JSImport("babylonjs/Meshes/index", "LinesMesh")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a serialized ground mesh
    * @param parsedMesh the serialized mesh
    * @param scene the scene to create the ground mesh in
    * @returns the created ground mesh
    */
  inline def Parse(parsedMesh: Any, scene: Scene): typings.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedMesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.meshesLinesMeshMod.LinesMesh]
}
