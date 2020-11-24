package typings.babylonjs.mod

import typings.babylonjs.anon.Q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "TorusKnotBuilder")
@js.native
class TorusKnotBuilder ()
  extends typings.babylonjs.legacyMod.TorusKnotBuilder
/* static members */
@JSImport("babylonjs", "TorusKnotBuilder")
@js.native
object TorusKnotBuilder extends js.Object {
  
  /**
    * Creates a torus knot mesh
    * * The parameter `radius` sets the global radius size (float) of the torus knot (default 2)
    * * The parameter `radialSegments` sets the number of sides on each tube segments (positive integer, default 32)
    * * The parameter `tubularSegments` sets the number of tubes to decompose the knot into (positive integer, default 32)
    * * The parameters `p` and `q` are the number of windings on each axis (positive integers, default 2 and 3)
    * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created.
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the torus knot mesh
    * @see  https://doc.babylonjs.com/how_to/set_shapes#torus-knot
    */
  def CreateTorusKnot(name: String, options: Q, scene: js.Any): typings.babylonjs.meshMod.Mesh = js.native
}
