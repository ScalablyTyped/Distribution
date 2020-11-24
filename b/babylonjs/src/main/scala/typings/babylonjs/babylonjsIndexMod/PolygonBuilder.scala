package typings.babylonjs.babylonjsIndexMod

import typings.babylonjs.anon.Holes
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/index", "PolygonBuilder")
@js.native
class PolygonBuilder ()
  extends typings.babylonjs.buildersIndexMod.PolygonBuilder
/* static members */
@JSImport("babylonjs/Meshes/index", "PolygonBuilder")
@js.native
object PolygonBuilder extends js.Object {
  
  /**
    * Creates a polygon mesh
    * The polygon's shape will depend on the input parameters and is constructed parallel to a ground mesh
    * * The parameter `shape` is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
    * * You can set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4)
    * * Remember you can only change the shape positions, not their number when updating a polygon
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @param earcutInjection can be used to inject your own earcut reference
    * @returns the polygon mesh
    */
  def CreatePolygon(name: String, options: Holes): typings.babylonjs.meshMod.Mesh = js.native
  def CreatePolygon(name: String, options: Holes, scene: js.UndefOr[Nullable[Scene]], earcutInjection: js.Any): typings.babylonjs.meshMod.Mesh = js.native
  def CreatePolygon(name: String, options: Holes, scene: Nullable[Scene]): typings.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates an extruded polygon mesh, with depth in the Y direction.
    * * You can set different colors and different images to the top, bottom and extruded side by using the parameters `faceColors` (an array of 3 Color3 elements) and `faceUV` (an array of 3 Vector4 elements)
    * @see https://doc.babylonjs.com/how_to/createbox_per_face_textures_and_colors
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @param earcutInjection can be used to inject your own earcut reference
    * @returns the polygon mesh
    */
  def ExtrudePolygon(name: String, options: Holes): typings.babylonjs.meshMod.Mesh = js.native
  def ExtrudePolygon(name: String, options: Holes, scene: js.UndefOr[Nullable[Scene]], earcutInjection: js.Any): typings.babylonjs.meshMod.Mesh = js.native
  def ExtrudePolygon(name: String, options: Holes, scene: Nullable[Scene]): typings.babylonjs.meshMod.Mesh = js.native
}
