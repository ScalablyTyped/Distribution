package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoldbergMesh
  extends StObject
     with Mesh {
  
  /* private */ var _changeGoldbergFaceColors: Any = js.native
  
  /* private */ var _changeGoldbergFaceUVs: Any = js.native
  
  /**
    * Defines the specific Goldberg data used in this mesh construction.
    */
  var goldbergData: GoldbergData = js.native
  
  /**
    * Places a mesh on a particular face of the goldberg polygon
    * @param mesh Defines the mesh to position
    * @param face Defines the face to position onto
    * @param position Defines the position relative to the face we are positioning the mesh onto
    */
  def placeOnGoldbergFaceAt(mesh: Mesh, face: Double, position: Vector3): Unit = js.native
  
  /**
    * Gets the related Goldberg face from pole infos
    * @param poleOrShared Defines the pole index or the shared face index if the fromPole parameter is passed in
    * @param fromPole Defines an optional pole index to find the related info from
    * @returns the goldberg face number
    */
  def relatedGoldbergFace(poleOrShared: Double): Double = js.native
  def relatedGoldbergFace(poleOrShared: Double, fromPole: Double): Double = js.native
  
  /**
    * Set new goldberg face colors
    * @param colorRange the new color to apply to the mesh
    */
  def setGoldbergFaceColors(colorRange: js.Array[js.Array[Double | Color4]]): Unit = js.native
  
  /**
    * set new goldberg face UVs
    * @param uvRange the new UVs to apply to the mesh
    */
  def setGoldbergFaceUVs(uvRange: js.Array[js.Array[Double | Vector2]]): Unit = js.native
  
  /**
    * Updates new goldberg face colors
    * @param colorRange the new color to apply to the mesh
    */
  def updateGoldbergFaceColors(colorRange: js.Array[js.Array[Double | Color4]]): Unit = js.native
  
  /**
    * Updates new goldberg face UVs
    * @param uvRange the new UVs to apply to the mesh
    */
  def updateGoldbergFaceUVs(uvRange: js.Array[js.Array[Double | Vector2]]): Unit = js.native
}
