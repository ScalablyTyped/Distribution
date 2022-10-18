package typings.babylonjs

import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bakedVertexAnimationIndexMod {
  
  @JSImport("babylonjs/BakedVertexAnimation/index", "BakedVertexAnimationManager")
  @js.native
  /**
    * Creates a new BakedVertexAnimationManager
    * @param scene defines the current scene
    */
  open class BakedVertexAnimationManager ()
    extends typings.babylonjs.bakedVertexAnimationBakedVertexAnimationManagerMod.BakedVertexAnimationManager {
    def this(scene: Nullable[Scene]) = this()
  }
  
  @JSImport("babylonjs/BakedVertexAnimation/index", "VertexAnimationBaker")
  @js.native
  open class VertexAnimationBaker protected ()
    extends typings.babylonjs.bakedVertexAnimationVertexAnimationBakerMod.VertexAnimationBaker {
    /**
      * Create a new VertexAnimationBaker object which can help baking animations into a texture.
      * @param scene Defines the scene the VAT belongs to
      * @param mesh Defines the mesh the VAT belongs to
      */
    def this(scene: Scene, mesh: Mesh) = this()
  }
}
