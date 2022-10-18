package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.EmitFragment
import typings.babylonjs.anon.NeedAlphaBlending
import typings.babylonjs.materialsNodeBlocksDualCurrentScreenBlockMod.CurrentScreenBlock
import typings.babylonjs.materialsNodeBlocksDualImageSourceBlockMod.ImageSourceBlock
import typings.babylonjs.materialsNodeBlocksDualReflectionTextureBaseBlockMod.ReflectionTextureBaseBlock
import typings.babylonjs.materialsNodeBlocksDualTextureBlockMod.TextureBlock
import typings.babylonjs.materialsNodeBlocksInputInputBlockMod.InputBlock
import typings.babylonjs.materialsNodeBlocksParticleParticleTextureBlockMod.ParticleTextureBlock
import typings.babylonjs.materialsNodeBlocksPbrRefractionBlockMod.RefractionBlock
import typings.babylonjs.materialsNodeNodeMaterialBlockMod.NodeMaterialBlock
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Immutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object materialsNodeNodeMaterialBuildStateSharedDataMod {
  
  @JSImport("babylonjs/Materials/Node/nodeMaterialBuildStateSharedData", "NodeMaterialBuildStateSharedData")
  @js.native
  /** Creates a new shared data */
  open class NodeMaterialBuildStateSharedData () extends StObject {
    
    /**
      * Is vertex program allowed to be empty?
      */
    var allowEmptyVertexProgram: Boolean = js.native
    
    /**
      * Gets the list of animated inputs
      */
    var animatedInputs: js.Array[InputBlock] = js.native
    
    /**
      * Bindable blocks (Blocks that need to set data to the effect)
      */
    var bindableBlocks: js.Array[NodeMaterialBlock] = js.native
    
    /**
      * List of blocks that can block the isReady function for the material
      */
    var blockingBlocks: js.Array[NodeMaterialBlock] = js.native
    
    /**
      * List of blocks that can provide a define update
      */
    var blocksWithDefines: js.Array[NodeMaterialBlock] = js.native
    
    /**
      * List of blocks that can provide a compilation fallback
      */
    var blocksWithFallbacks: js.Array[NodeMaterialBlock] = js.native
    
    /**
      * Build Id used to avoid multiple recompilations
      */
    var buildId: Double = js.native
    
    /**
      * List of compilation checks
      */
    var checks: EmitFragment = js.native
    
    /** List of emitted defines */
    var defineNames: StringDictionary[Double] = js.native
    
    /**
      * List of blocks that can provide a dynamic list of uniforms
      */
    var dynamicUniformBlocks: js.Array[NodeMaterialBlock] = js.native
    
    /** Should emit comments? */
    var emitComments: Boolean = js.native
    
    /**
      * Emits console errors and exceptions if there is a failing check
      */
    def emitErrors(): Unit = js.native
    
    /**
      * Bindable blocks (Blocks that need to set data to the effect) that will always be called (by bindForSubMesh), contrary to bindableBlocks that won't be called if _mustRebind() returns false
      */
    var forcedBindableBlocks: js.Array[NodeMaterialBlock] = js.native
    
    /**
      * List of the fragment output nodes
      */
    var fragmentOutputNodes: Immutable[js.Array[NodeMaterialBlock]] = js.native
    
    /**
      * Gets the compilation hints emitted at compilation time
      */
    var hints: NeedAlphaBlending = js.native
    
    /**
      * Input blocks
      */
    var inputBlocks: js.Array[InputBlock] = js.native
    
    /**
      * List of blocks that can provide a repeatable content
      */
    var repeatableContentBlocks: js.Array[NodeMaterialBlock] = js.native
    
    /** Gets or sets the hosting scene */
    var scene: Scene = js.native
    
    /**
      * Gets the list of emitted varyings
      */
    var temps: js.Array[String] = js.native
    
    /**
      * Input blocks
      */
    var textureBlocks: js.Array[
        ImageSourceBlock | TextureBlock | ReflectionTextureBaseBlock | RefractionBlock | CurrentScreenBlock | ParticleTextureBlock
      ] = js.native
    
    /** List of emitted variables */
    var variableNames: StringDictionary[Double] = js.native
    
    /**
      * Gets the varying declaration string
      */
    var varyingDeclaration: String = js.native
    
    /**
      * Gets the list of emitted varyings
      */
    var varyings: js.Array[String] = js.native
    
    /** Emit build activity */
    var verbose: Boolean = js.native
  }
}
