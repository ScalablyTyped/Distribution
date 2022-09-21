package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ITexturePackerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TexturePacker")
@js.native
open class TexturePacker protected ()
  extends StObject
     with typings.babylonjs.BABYLON.TexturePacker {
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
    meshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh],
    options: ITexturePackerOptions,
    scene: typings.babylonjs.BABYLON.Scene
  ) = this()
}
/* static members */
object TexturePacker {
  
  /** Packer Layout Constant 2 */
  @JSGlobal("BABYLON.TexturePacker.LAYOUT_COLNUM")
  @js.native
  val LAYOUT_COLNUM: /* 2 */ Double = js.native
  
  /** Packer Layout Constant 1 */
  @JSGlobal("BABYLON.TexturePacker.LAYOUT_POWER2")
  @js.native
  val LAYOUT_POWER2: /* 1 */ Double = js.native
  
  /** Packer Layout Constant 0 */
  @JSGlobal("BABYLON.TexturePacker.LAYOUT_STRIP")
  @js.native
  val LAYOUT_STRIP: /* 0 */ Double = js.native
  
  /** Packer Layout Constant 2 */
  @JSGlobal("BABYLON.TexturePacker.SUBUV_COLOR")
  @js.native
  val SUBUV_COLOR: /* 2 */ Double = js.native
  
  /** Packer Layout Constant 1 */
  @JSGlobal("BABYLON.TexturePacker.SUBUV_EXTEND")
  @js.native
  val SUBUV_EXTEND: /* 1 */ Double = js.native
  
  /** Packer Layout Constant 0 */
  @JSGlobal("BABYLON.TexturePacker.SUBUV_WRAP")
  @js.native
  val SUBUV_WRAP: /* 0 */ Double = js.native
}
