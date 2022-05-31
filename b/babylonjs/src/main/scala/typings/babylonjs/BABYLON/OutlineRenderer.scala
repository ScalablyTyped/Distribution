package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlineRenderer
  extends StObject
     with ISceneComponent {
  
  /* private */ var _afterRenderingMesh: js.Any = js.native
  
  /* private */ var _beforeRenderingMesh: js.Any = js.native
  
  /* private */ var _cachedDefines: js.Any = js.native
  
  /* private */ var _effect: js.Any = js.native
  
  /* private */ var _engine: js.Any = js.native
  
  /* private */ var _savedDepthWrite: js.Any = js.native
  
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
