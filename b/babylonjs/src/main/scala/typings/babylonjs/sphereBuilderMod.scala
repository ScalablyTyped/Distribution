package typings.babylonjs

import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/Builders/sphereBuilder", JSImport.Namespace)
@js.native
object sphereBuilderMod extends js.Object {
  @js.native
  class SphereBuilder () extends js.Object
  
  /* static members */
  @js.native
  object SphereBuilder extends js.Object {
    /**
      * Creates a sphere mesh
      * * The parameter `diameter` sets the diameter size (float) of the sphere (default 1)
      * * You can set some different sphere dimensions, for instance to build an ellipsoid, by using the parameters `diameterX`, `diameterY` and `diameterZ` (all by default have the same value of `diameter`)
      * * The parameter `segments` sets the sphere number of horizontal stripes (positive integer, default 32)
      * * You can create an unclosed sphere with the parameter `arc` (positive float, default 1), valued between 0 and 1, what is the ratio of the circumference (latitude) : 2 x PI x ratio
      * * You can create an unclosed sphere on its height with the parameter `slice` (positive float, default1), valued between 0 and 1, what is the height ratio (longitude)
      * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
      * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
      * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
      * @param name defines the name of the mesh
      * @param options defines the options used to create the mesh
      * @param scene defines the hosting scene
      * @returns the sphere mesh
      * @see https://doc.babylonjs.com/how_to/set_shapes#sphere
      */
    def CreateSphere(name: String, options: AnonDiameterX): Mesh = js.native
    def CreateSphere(name: String, options: AnonDiameterX, scene: Nullable[Scene]): Mesh = js.native
  }
  
}

