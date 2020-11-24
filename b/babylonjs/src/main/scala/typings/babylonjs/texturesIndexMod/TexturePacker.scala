package typings.babylonjs.texturesIndexMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.packerMod.ITexturePackerOptions
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/index", "TexturePacker")
@js.native
class TexturePacker protected ()
  extends typings.babylonjs.packerIndexMod.TexturePacker {
  /**
    * Initializes a texture package series from an array of meshes or a single mesh.
    * @param name The name of the package
    * @param meshes The target meshes to compose the package from
    * @param options The arguments that texture packer should follow while building.
    * @param scene The scene which the textures are scoped to.
    * @returns TexturePacker
    */
  def this(name: String, meshes: js.Array[AbstractMesh], options: ITexturePackerOptions, scene: Scene) = this()
}
/* static members */
@JSImport("babylonjs/Materials/Textures/index", "TexturePacker")
@js.native
object TexturePacker extends js.Object {
  
  /** Packer Layout Constant 2 */
  val LAYOUT_COLNUM: Double = js.native
  
  /** Packer Layout Constant 1 */
  val LAYOUT_POWER2: Double = js.native
  
  /** Packer Layout Constant 0 */
  val LAYOUT_STRIP: Double = js.native
  
  /** Packer Layout Constant 2 */
  val SUBUV_COLOR: Double = js.native
  
  /** Packer Layout Constant 1 */
  val SUBUV_EXTEND: Double = js.native
  
  /** Packer Layout Constant 0 */
  val SUBUV_WRAP: Double = js.native
}
