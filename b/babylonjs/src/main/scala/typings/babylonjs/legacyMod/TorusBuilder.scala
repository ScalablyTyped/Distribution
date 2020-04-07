package typings.babylonjs.legacyMod

import typings.babylonjs.AnonThickness
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "TorusBuilder")
@js.native
class TorusBuilder ()
  extends typings.babylonjs.indexMod.TorusBuilder

/* static members */
@JSImport("babylonjs/Legacy/legacy", "TorusBuilder")
@js.native
object TorusBuilder extends js.Object {
  /**
    * Creates a torus mesh
    * * The parameter `diameter` sets the diameter size (float) of the torus (default 1)
    * * The parameter `thickness` sets the diameter size of the tube of the torus (float, default 0.5)
    * * The parameter `tessellation` sets the number of torus sides (postive integer, default 16)
    * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created.
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the torus mesh
    * @see https://doc.babylonjs.com/how_to/set_shapes#torus
    */
  def CreateTorus(name: String, options: AnonThickness, scene: js.Any): typings.babylonjs.meshMod.Mesh = js.native
}

