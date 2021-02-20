package typings.babylonjs.BABYLON

import typings.babylonjs.anon.EmitVertex
import typings.babylonjs.anon.NeedAlphaBlending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeMaterialBuildStateSharedData extends StObject {
  
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
  var checks: EmitVertex = js.native
  
  /** List of emitted defines */
  var defineNames: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  
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
    TextureBlock | ReflectionTextureBaseBlock | RefractionBlock | CurrentScreenBlock | ParticleTextureBlock
  ] = js.native
  
  /** List of emitted variables */
  var variableNames: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  
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
object NodeMaterialBuildStateSharedData {
  
  @scala.inline
  def apply(
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
    hints: NeedAlphaBlending,
    inputBlocks: js.Array[InputBlock],
    repeatableContentBlocks: js.Array[NodeMaterialBlock],
    scene: Scene,
    temps: js.Array[String],
    textureBlocks: js.Array[
      TextureBlock | ReflectionTextureBaseBlock | RefractionBlock | CurrentScreenBlock | ParticleTextureBlock
    ],
    variableNames: org.scalablytyped.runtime.StringDictionary[Double],
    varyingDeclaration: String,
    varyings: js.Array[String],
    verbose: Boolean
  ): NodeMaterialBuildStateSharedData = {
    val __obj = js.Dynamic.literal(allowEmptyVertexProgram = allowEmptyVertexProgram.asInstanceOf[js.Any], animatedInputs = animatedInputs.asInstanceOf[js.Any], bindableBlocks = bindableBlocks.asInstanceOf[js.Any], blockingBlocks = blockingBlocks.asInstanceOf[js.Any], blocksWithDefines = blocksWithDefines.asInstanceOf[js.Any], blocksWithFallbacks = blocksWithFallbacks.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], defineNames = defineNames.asInstanceOf[js.Any], dynamicUniformBlocks = dynamicUniformBlocks.asInstanceOf[js.Any], emitComments = emitComments.asInstanceOf[js.Any], emitErrors = js.Any.fromFunction0(emitErrors), hints = hints.asInstanceOf[js.Any], inputBlocks = inputBlocks.asInstanceOf[js.Any], repeatableContentBlocks = repeatableContentBlocks.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], temps = temps.asInstanceOf[js.Any], textureBlocks = textureBlocks.asInstanceOf[js.Any], variableNames = variableNames.asInstanceOf[js.Any], varyingDeclaration = varyingDeclaration.asInstanceOf[js.Any], varyings = varyings.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMaterialBuildStateSharedData]
  }
  
  @scala.inline
  implicit class NodeMaterialBuildStateSharedDataMutableBuilder[Self <: NodeMaterialBuildStateSharedData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowEmptyVertexProgram(value: Boolean): Self = StObject.set(x, "allowEmptyVertexProgram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedInputs(value: js.Array[InputBlock]): Self = StObject.set(x, "animatedInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedInputsVarargs(value: InputBlock*): Self = StObject.set(x, "animatedInputs", js.Array(value :_*))
    
    @scala.inline
    def setBindableBlocks(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "bindableBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindableBlocksVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "bindableBlocks", js.Array(value :_*))
    
    @scala.inline
    def setBlockingBlocks(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "blockingBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockingBlocksVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "blockingBlocks", js.Array(value :_*))
    
    @scala.inline
    def setBlocksWithDefines(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "blocksWithDefines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksWithDefinesVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "blocksWithDefines", js.Array(value :_*))
    
    @scala.inline
    def setBlocksWithFallbacks(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "blocksWithFallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksWithFallbacksVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "blocksWithFallbacks", js.Array(value :_*))
    
    @scala.inline
    def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecks(value: EmitVertex): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefineNames(value: org.scalablytyped.runtime.StringDictionary[Double]): Self = StObject.set(x, "defineNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicUniformBlocks(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "dynamicUniformBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicUniformBlocksVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "dynamicUniformBlocks", js.Array(value :_*))
    
    @scala.inline
    def setEmitComments(value: Boolean): Self = StObject.set(x, "emitComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitErrors(value: () => Unit): Self = StObject.set(x, "emitErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHints(value: NeedAlphaBlending): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputBlocks(value: js.Array[InputBlock]): Self = StObject.set(x, "inputBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputBlocksVarargs(value: InputBlock*): Self = StObject.set(x, "inputBlocks", js.Array(value :_*))
    
    @scala.inline
    def setRepeatableContentBlocks(value: js.Array[NodeMaterialBlock]): Self = StObject.set(x, "repeatableContentBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatableContentBlocksVarargs(value: NodeMaterialBlock*): Self = StObject.set(x, "repeatableContentBlocks", js.Array(value :_*))
    
    @scala.inline
    def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemps(value: js.Array[String]): Self = StObject.set(x, "temps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempsVarargs(value: String*): Self = StObject.set(x, "temps", js.Array(value :_*))
    
    @scala.inline
    def setTextureBlocks(
      value: js.Array[
          TextureBlock | ReflectionTextureBaseBlock | RefractionBlock | CurrentScreenBlock | ParticleTextureBlock
        ]
    ): Self = StObject.set(x, "textureBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureBlocksVarargs(
      value: (TextureBlock | ReflectionTextureBaseBlock | RefractionBlock | CurrentScreenBlock | ParticleTextureBlock)*
    ): Self = StObject.set(x, "textureBlocks", js.Array(value :_*))
    
    @scala.inline
    def setVariableNames(value: org.scalablytyped.runtime.StringDictionary[Double]): Self = StObject.set(x, "variableNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaryingDeclaration(value: String): Self = StObject.set(x, "varyingDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaryings(value: js.Array[String]): Self = StObject.set(x, "varyings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaryingsVarargs(value: String*): Self = StObject.set(x, "varyings", js.Array(value :_*))
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
