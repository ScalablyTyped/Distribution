package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MeshLODLevel")
@js.native
class MeshLODLevel protected ()
  extends StObject
     with typings.babylonjs.BABYLON.MeshLODLevel {
  /**
    * Creates a new LOD level
    * @param distance defines the distance where this level should star being displayed
    * @param mesh defines the mesh to use to render this level
    */
  def this(
    /** Defines the distance where this level should start being displayed */
  distance: Double,
    /** Defines the mesh to use to render this level */
  mesh: Nullable[typings.babylonjs.BABYLON.Mesh]
  ) = this()
  
  /** Defines the distance where this level should start being displayed */
  /* CompleteClass */
  var distance: Double = js.native
  
  /** Defines the mesh to use to render this level */
  /* CompleteClass */
  var mesh: Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
}
