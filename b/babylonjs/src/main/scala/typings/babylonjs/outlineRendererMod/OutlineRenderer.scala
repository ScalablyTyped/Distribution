package typings.babylonjs.outlineRendererMod

import typings.babylonjs.meshMod.InstancesBatch
import typings.babylonjs.sceneComponentMod.ISceneComponent
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.subMeshMod.SubMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/outlineRenderer", "OutlineRenderer")
@js.native
class OutlineRenderer protected () extends ISceneComponent {
  /**
    * Instantiates a new outline renderer. (There could be only one per scene).
    * @param scene Defines the scene it belongs to
    */
  def this(scene: Scene) = this()
  
  var _afterRenderingMesh: js.Any = js.native
  
  var _beforeRenderingMesh: js.Any = js.native
  
  var _cachedDefines: js.Any = js.native
  
  var _effect: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _savedDepthWrite: js.Any = js.native
  
  /**
    * Returns whether or not the outline renderer is ready for a given submesh.
    * All the dependencies e.g. submeshes, texture, effect... mus be ready
    * @param subMesh Defines the submesh to check readyness for
    * @param useInstances Defines wheter wee are trying to render instances or not
    * @returns true if ready otherwise false
    */
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  
  /**
    * Renders the outline in the canvas.
    * @param subMesh Defines the sumesh to render
    * @param batch Defines the batch of meshes in case of instances
    * @param useOverlay Defines if the rendering is for the overlay or the outline
    */
  def render(subMesh: SubMesh, batch: InstancesBatch): Unit = js.native
  def render(subMesh: SubMesh, batch: InstancesBatch, useOverlay: Boolean): Unit = js.native
  
  /**
    * Defines a zOffset to prevent zFighting between the overlay and the mesh.
    */
  var zOffset: Double = js.native
}
/* static members */
@JSImport("babylonjs/Rendering/outlineRenderer", "OutlineRenderer")
@js.native
object OutlineRenderer extends js.Object {
  
  /**
    * Stencil value used to avoid outline being seen within the mesh when the mesh is transparent
    */
  var _StencilReference: js.Any = js.native
}
