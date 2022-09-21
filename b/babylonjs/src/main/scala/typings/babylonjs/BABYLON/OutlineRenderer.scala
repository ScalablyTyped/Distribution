package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlineRenderer
  extends StObject
     with ISceneComponent {
  
  /* private */ var _afterRenderingMesh: Any = js.native
  
  /* private */ var _beforeRenderingMesh: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _passIdForDrawWrapper: Any = js.native
  
  /* private */ var _savedDepthWrite: Any = js.native
  
  /**
    * Returns whether or not the outline renderer is ready for a given submesh.
    * All the dependencies e.g. submeshes, texture, effect... mus be ready
    * @param subMesh Defines the submesh to check readiness for
    * @param useInstances Defines whether wee are trying to render instances or not
    * @param renderPassId Render pass id to use to render the mesh
    * @returns true if ready otherwise false
    */
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  def isReady(subMesh: SubMesh, useInstances: Boolean, renderPassId: Double): Boolean = js.native
  
  /**
    * Renders the outline in the canvas.
    * @param subMesh Defines the sumesh to render
    * @param batch Defines the batch of meshes in case of instances
    * @param useOverlay Defines if the rendering is for the overlay or the outline
    * @param renderPassId Render pass id to use to render the mesh
    */
  def render(subMesh: SubMesh, batch: InstancesBatch): Unit = js.native
  def render(subMesh: SubMesh, batch: InstancesBatch, useOverlay: Boolean): Unit = js.native
  def render(subMesh: SubMesh, batch: InstancesBatch, useOverlay: Boolean, renderPassId: Double): Unit = js.native
  def render(subMesh: SubMesh, batch: InstancesBatch, useOverlay: Unit, renderPassId: Double): Unit = js.native
  
  /**
    * Defines a zOffset default Factor to prevent zFighting between the overlay and the mesh.
    */
  var zOffset: Double = js.native
  
  /**
    * Defines a zOffset default Unit to prevent zFighting between the overlay and the mesh.
    */
  var zOffsetUnits: Double = js.native
}
