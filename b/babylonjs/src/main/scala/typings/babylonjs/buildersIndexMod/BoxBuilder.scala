package typings.babylonjs.buildersIndexMod

import typings.babylonjs.AnonBottomBaseAt
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/Builders/index", "BoxBuilder")
@js.native
class BoxBuilder ()
  extends typings.babylonjs.boxBuilderMod.BoxBuilder

/* static members */
@JSImport("babylonjs/Meshes/Builders/index", "BoxBuilder")
@js.native
object BoxBuilder extends js.Object {
  /**
    * Creates a box mesh
    * * The parameter `size` sets the size (float) of each box side (default 1)
    * * You can set some different box dimensions by using the parameters `width`, `height` and `depth` (all by default have the same value of `size`)
    * * You can set different colors and different images to each box side by using the parameters `faceColors` (an array of 6 Color3 elements) and `faceUV` (an array of 6 Vector4 elements)
    * * Please read this tutorial : https://doc.babylonjs.com/how_to/createbox_per_face_textures_and_colors
    * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @see https://doc.babylonjs.com/how_to/set_shapes#box
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the box mesh
    */
  def CreateBox(name: String, options: AnonBottomBaseAt): Mesh = js.native
  def CreateBox(name: String, options: AnonBottomBaseAt, scene: Nullable[Scene]): Mesh = js.native
}

