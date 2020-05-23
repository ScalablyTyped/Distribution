package typings.babylonjs.buildersIndexMod

import typings.babylonjs.anon.RadiusX
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Meshes/Builders/index", "IcoSphereBuilder")
@js.native
class IcoSphereBuilder ()
  extends typings.babylonjs.icoSphereBuilderMod.IcoSphereBuilder

/* static members */
@JSImport("babylonjs/Meshes/Builders/index", "IcoSphereBuilder")
@js.native
object IcoSphereBuilder extends js.Object {
  /**
    * Creates a sphere based upon an icosahedron with 20 triangular faces which can be subdivided
    * * The parameter `radius` sets the radius size (float) of the icosphere (default 1)
    * * You can set some different icosphere dimensions, for instance to build an ellipsoid, by using the parameters `radiusX`, `radiusY` and `radiusZ` (all by default have the same value of `radius`)
    * * The parameter `subdivisions` sets the number of subdivisions (postive integer, default 4). The more subdivisions, the more faces on the icosphere whatever its size
    * * The parameter `flat` (boolean, default true) gives each side its own normals. Set it to false to get a smooth continuous light reflection on the surface
    * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the icosahedron mesh
    * @see https://doc.babylonjs.com/how_to/polyhedra_shapes#icosphere
    */
  def CreateIcoSphere(name: String, options: RadiusX): Mesh = js.native
  def CreateIcoSphere(name: String, options: RadiusX, scene: Nullable[Scene]): Mesh = js.native
}

