package typings.babylonjs.mod

import typings.babylonjs.materialsTexturesPackerPackerMod.ITexturePackerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "TexturePacker")
@js.native
open class TexturePacker protected ()
  extends typings.babylonjs.legacyLegacyMod.TexturePacker {
  /**
    * Initializes a texture package series from an array of meshes or a single mesh.
    * @param name The name of the package
    * @param meshes The target meshes to compose the package from
    * @param options The arguments that texture packer should follow while building.
    * @param scene The scene which the textures are scoped to.
    * @returns TexturePacker
    */
  def this(
    name: String,
    meshes: js.Array[typings.babylonjs.meshesAbstractMeshMod.AbstractMesh],
    options: ITexturePackerOptions,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
/* static members */
object TexturePacker {
  
  /** Packer Layout Constant 2 */
  @JSImport("babylonjs", "TexturePacker.LAYOUT_COLNUM")
  @js.native
  val LAYOUT_COLNUM: Double = js.native
  
  /** Packer Layout Constant 1 */
  @JSImport("babylonjs", "TexturePacker.LAYOUT_POWER2")
  @js.native
  val LAYOUT_POWER2: Double = js.native
  
  /** Packer Layout Constant 0 */
  @JSImport("babylonjs", "TexturePacker.LAYOUT_STRIP")
  @js.native
  val LAYOUT_STRIP: Double = js.native
  
  /** Packer Layout Constant 2 */
  @JSImport("babylonjs", "TexturePacker.SUBUV_COLOR")
  @js.native
  val SUBUV_COLOR: Double = js.native
  
  /** Packer Layout Constant 1 */
  @JSImport("babylonjs", "TexturePacker.SUBUV_EXTEND")
  @js.native
  val SUBUV_EXTEND: Double = js.native
  
  /** Packer Layout Constant 0 */
  @JSImport("babylonjs", "TexturePacker.SUBUV_WRAP")
  @js.native
  val SUBUV_WRAP: Double = js.native
}
