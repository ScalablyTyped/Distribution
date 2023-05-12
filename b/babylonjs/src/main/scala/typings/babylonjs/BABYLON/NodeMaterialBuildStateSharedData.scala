package typings.babylonjs.BABYLON

import typings.babylonjs.anon.EmitVertex
import typings.babylonjs.anon.NeedAlphaBlending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMaterialBuildStateSharedData extends StObject {
  
  /**
    * Is vertex program allowed to be empty?
    */
  var allowEmptyVertexProgram: Boolean
  
  /**
    * Gets the list of animated inputs
    */
  var animatedInputs: js.Array[InputBlock]
  
  /**
    * Bindable blocks (Blocks that need to set data to the effect)
    */
  var bindableBlocks: js.Array[NodeMaterialBlock]
  
  /**
    * List of blocks that can block the isReady function for the material
    */
  var blockingBlocks: js.Array[NodeMaterialBlock]
  
  /**
    * List of blocks that can provide a define update
    */
  var blocksWithDefines: js.Array[NodeMaterialBlock]
  
  /**
    * List of blocks that can provide a compilation fallback
    */
  var blocksWithFallbacks: js.Array[NodeMaterialBlock]
  
  /**
    * Build Id used to avoid multiple recompilations
    */
  var buildId: Double
  
  /**
    * List of compilation checks
    */
  var checks: EmitVertex
  
  /** List of emitted defines */
  var defineNames: org.scalablytyped.runtime.StringDictionary[Double]
  
  /**
    * List of blocks that can provide a dynamic list of uniforms
    */
  var dynamicUniformBlocks: js.Array[NodeMaterialBlock]
  
  /** Should emit comments? */
  var emitComments: Boolean
  
  /**
    * Emits console errors and exceptions if there is a failing check
    */
  def emitErrors(): Unit
  
  /**
    * Bindable blocks (Blocks that need to set data to the effect) that will always be called (by bindForSubMesh), contrary to bindableBlocks that won't be called if _mustRebind() returns false
    */
  var forcedBindableBlocks: js.Array[NodeMaterialBlock]
  
  /**
    * List of the fragment output nodes
    */
  var fragmentOutputNodes: Immutable[js.Array[NodeMaterialBlock]]
  
  /**
    * Gets the compilation hints emitted at compilation time
    */
  var hints: NeedAlphaBlending
  
  /**
    * Input blocks
    */
  var inputBlocks: js.Array[InputBlock]
  
  /**
    * List of blocks that can provide a repeatable content
    */
  var repeatableContentBlocks: js.Array[NodeMaterialBlock]
  
  /** Gets or sets the hosting scene */
  var scene: Scene
  
  /**
    * Gets the list of emitted varyings
    */
  var temps: js.Array[String]
  
  /**
    * Input blocks
    */
  var textureBlocks: js.Array[NodeMaterialTextureBlocks]
  
  /** List of emitted variables */
  var variableNames: org.scalablytyped.runtime.StringDictionary[Double]
  
  /**
    * Gets the varying declaration string
    */
  var varyingDeclaration: String
  
  /**
    * Gets the list of emitted varyings
    */
  var varyings: js.Array[String]
  
  /** Emit build activity */
  var verbose: Boolean
}
object NodeMaterialBuildStateSharedData {
  
  inline def apply(
    allowEmptyVertexProgram: Boolean,
    animatedInputs: js.Array[InputBlock],
    bindableBlocks: js.Array[NodeMaterialBlock],
    blockingBlocks: js.Array[NodeMaterialBlock],
    blocksWithDefines: js.Array[NodeMaterialBlock],
    blocksWithFallbacks: js.Array[NodeMaterialBlock],
    buildId: Double,
    checks: EmitVertex,
    defineNames: org.scalablytyped.runtime.StringDictionary[Double],
    dynamicUniformBlocks: js.Array[NodeMaterialBlock],
    emitComments: Boolean,
    emitErrors: () => Unit,
    forcedBindableBlocks: js.Array[NodeMaterialBlock],
    fragmentOutputNodes: Immutable[js.Array[NodeMaterialBlock]],
    hints: NeedAlphaBlending,
    inputBlocks: js.Array[InputBlock],
    repeatableContentBlocks: js.Array[NodeMaterialBlock],
    scene: Scene,
    temps: js.Array[String],
    textureBlocks: js.Array[NodeMaterialTextureBlocks],
    variableNames: org.scalablytyped.runtime.StringDictionary[Double],
    varyingDeclaration: String,
    varyings: js.Array[String],
    verbose: Boolean
  ): NodeMaterialBuildStateSharedData = {
    val __obj = js.Dynamic.literal(allowEmptyVertexProgram = allowEmptyVertexProgram.asInstanceOf[js.Any], animatedInputs = animatedInputs.asInstanceOf[js.Any], bindableBlocks = bindableBlocks.asInstanceOf[js.Any], blockingBlocks = blockingBlocks.asInstanceOf[js.Any], blocksWithDefines = blocksWithDefines.asInstanceOf[js.Any], blocksWithFallbacks = blocksWithFallbacks.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], defineNames = defineNames.asInstanceOf[js.Any], dynamicUniformBlocks = dynamicUniformBlocks.asInstanceOf[js.Any], emitComments = emitComments.asInstanceOf[js.Any], emitErrors = js.Any.fromFunction0(emitErrors), forcedBindableBlocks = forcedBindableBlocks.asInstanceOf[js.Any], fragmentOutputNodes = fragmentOutputNodes.asInstanceOf[js.Any], hints = hints.asInstanceOf[js.Any], inputBlocks = inputBlocks.asInstanceOf[js.Any], repeatableContentBlocks = repeatableContentBlocks.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], temps = temps.asInstanceOf[js.Any], textureBlocks = textureBlocks.asInstanceOf[js.Any], variableNames = variableNames.asInstanceOf[js.Any], varyingDeclaration = varyingDeclaration.asInstanceOf[js.Any], varyings = varyings.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMaterialBuildStateSharedData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMaterialBuildStateSharedData] (val x: Self) extends AnyVal {
    
    inline def setAllowEmptyVertexProgram(value: Boolean): Self = StObject.set(x, "allowEmptyVertexProgram", value.asInstanceOf[js.Any])
    
    inline def setAnimatedInputs(value: js.Array[InputBlock]): Self = StObject.set(x, "animatedInputs", value.asInstanceOf[js.Any])
    
    inline def setAnimatedInputsVarargs(value: InputBlock*): Self = StObject.set(x, "animatedInputs", js.Array(value*))
    
    inline def setBindableBlocks(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "bindableBlocks", value.asInstanceOf[js.Any])
    
    inline def setBindableBlocksVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "bindableBlocks", js.Array(value*))
    
    inline def setBlockingBlocks(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "blockingBlocks", value.asInstanceOf[js.Any])
    
    inline def setBlockingBlocksVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "blockingBlocks", js.Array(value*))
    
    inline def setBlocksWithDefines(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "blocksWithDefines", value.asInstanceOf[js.Any])
    
    inline def setBlocksWithDefinesVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "blocksWithDefines", js.Array(value*))
    
    inline def setBlocksWithFallbacks(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "blocksWithFallbacks", value.asInstanceOf[js.Any])
    
    inline def setBlocksWithFallbacksVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "blocksWithFallbacks", js.Array(value*))
    
    inline def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setChecks(value: EmitVertex): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setDefineNames(value: org.scalablytyped.runtime.StringDictionary[Double]): Self = StObject.set(x, "defineNames", value.asInstanceOf[js.Any])
    
    inline def setDynamicUniformBlocks(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "dynamicUniformBlocks", value.asInstanceOf[js.Any])
    
    inline def setDynamicUniformBlocksVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "dynamicUniformBlocks", js.Array(value*))
    
    inline def setEmitComments(value: Boolean): Self = StObject.set(x, "emitComments", value.asInstanceOf[js.Any])
    
    inline def setEmitErrors(value: () => Unit): Self = StObject.set(x, "emitErrors", js.Any.fromFunction0(value))
    
    inline def setForcedBindableBlocks(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "forcedBindableBlocks", value.asInstanceOf[js.Any])
    
    inline def setForcedBindableBlocksVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "forcedBindableBlocks", js.Array(value*))
    
    inline def setFragmentOutputNodes(value: Immutable[js.Array[NodeMaterialBlock]]): Self = StObject.set(x, "fragmentOutputNodes", value.asInstanceOf[js.Any])
    
    inline def setFragmentOutputNodesVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "fragmentOutputNodes", js.Array(value*))
    
    inline def setHints(value: NeedAlphaBlending): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setInputBlocks(value: js.Array[InputBlock]): Self = StObject.set(x, "inputBlocks", value.asInstanceOf[js.Any])
    
    inline def setInputBlocksVarargs(value: InputBlock*): Self = StObject.set(x, "inputBlocks", js.Array(value*))
    
    inline def setRepeatableContentBlocks(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "repeatableContentBlocks", value.asInstanceOf[js.Any])
    
    inline def setRepeatableContentBlocksVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "repeatableContentBlocks", js.Array(value*))
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setTemps(value: js.Array[String]): Self = StObject.set(x, "temps", value.asInstanceOf[js.Any])
    
    inline def setTempsVarargs(value: String*): Self = StObject.set(x, "temps", js.Array(value*))
    
    inline def setTextureBlocks(value: js.Array[NodeMaterialTextureBlocks]): Self = StObject.set(x, "textureBlocks", value.asInstanceOf[js.Any])
    
    inline def setTextureBlocksVarargs(value: NodeMaterialTextureBlocks*): Self = StObject.set(x, "textureBlocks", js.Array(value*))
    
    inline def setVariableNames(value: org.scalablytyped.runtime.StringDictionary[Double]): Self = StObject.set(x, "variableNames", value.asInstanceOf[js.Any])
    
    inline def setVaryingDeclaration(value: String): Self = StObject.set(x, "varyingDeclaration", value.asInstanceOf[js.Any])
    
    inline def setVaryings(value: js.Array[String]): Self = StObject.set(x, "varyings", value.asInstanceOf[js.Any])
    
    inline def setVaryingsVarargs(value: String*): Self = StObject.set(x, "varyings", js.Array(value*))
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
