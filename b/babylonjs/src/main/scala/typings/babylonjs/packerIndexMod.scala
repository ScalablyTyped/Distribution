package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.packerMod.ITexturePackerOptions
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packerIndexMod {
  
  @JSImport("babylonjs/Materials/Textures/Packer/index", "TexturePacker")
  @js.native
  class TexturePacker protected ()
    extends typings.babylonjs.packerMod.TexturePacker {
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
  object TexturePacker {
    
    /** Packer Layout Constant 2 */
    @JSImport("babylonjs/Materials/Textures/Packer/index", "TexturePacker.LAYOUT_COLNUM")
    @js.native
    val LAYOUT_COLNUM: Double = js.native
    
    /** Packer Layout Constant 1 */
    @JSImport("babylonjs/Materials/Textures/Packer/index", "TexturePacker.LAYOUT_POWER2")
    @js.native
    val LAYOUT_POWER2: Double = js.native
    
    /** Packer Layout Constant 0 */
    @JSImport("babylonjs/Materials/Textures/Packer/index", "TexturePacker.LAYOUT_STRIP")
    @js.native
    val LAYOUT_STRIP: Double = js.native
    
    /** Packer Layout Constant 2 */
    @JSImport("babylonjs/Materials/Textures/Packer/index", "TexturePacker.SUBUV_COLOR")
    @js.native
    val SUBUV_COLOR: Double = js.native
    
    /** Packer Layout Constant 1 */
    @JSImport("babylonjs/Materials/Textures/Packer/index", "TexturePacker.SUBUV_EXTEND")
    @js.native
    val SUBUV_EXTEND: Double = js.native
    
    /** Packer Layout Constant 0 */
    @JSImport("babylonjs/Materials/Textures/Packer/index", "TexturePacker.SUBUV_WRAP")
    @js.native
    val SUBUV_WRAP: Double = js.native
  }
  
  @JSImport("babylonjs/Materials/Textures/Packer/index", "TexturePackerFrame")
  @js.native
  class TexturePackerFrame protected ()
    extends typings.babylonjs.frameMod.TexturePackerFrame {
    /**
      * Initializes a texture package frame.
      * @param id The numerical frame identifier
      * @param scale Scalar Vector2 for UV frame
      * @param offset Vector2 for the frame position in UV units.
      * @returns TexturePackerFrame
      */
    def this(id: Double, scale: Vector2, offset: Vector2) = this()
  }
}
