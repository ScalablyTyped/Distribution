package typings.babylonjs.BABYLON

import typings.babylonjs.anon.EmitVertex
import typings.babylonjs.anon.NeedAlphaBlending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeMaterialBuildStateSharedData extends js.Object {
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
  var textureBlocks: js.Array[ReflectionTextureBlock | TextureBlock]
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
  /**
    * Emits console errors and exceptions if there is a failing check
    */
  def emitErrors(): Unit
}

object NodeMaterialBuildStateSharedData {
  @scala.inline
  def apply(
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
    textureBlocks: js.Array[ReflectionTextureBlock | TextureBlock],
    variableNames: org.scalablytyped.runtime.StringDictionary[Double],
    varyingDeclaration: String,
    varyings: js.Array[String],
    verbose: Boolean
  ): NodeMaterialBuildStateSharedData = {
    val __obj = js.Dynamic.literal(animatedInputs = animatedInputs.asInstanceOf[js.Any], bindableBlocks = bindableBlocks.asInstanceOf[js.Any], blockingBlocks = blockingBlocks.asInstanceOf[js.Any], blocksWithDefines = blocksWithDefines.asInstanceOf[js.Any], blocksWithFallbacks = blocksWithFallbacks.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], defineNames = defineNames.asInstanceOf[js.Any], dynamicUniformBlocks = dynamicUniformBlocks.asInstanceOf[js.Any], emitComments = emitComments.asInstanceOf[js.Any], emitErrors = js.Any.fromFunction0(emitErrors), hints = hints.asInstanceOf[js.Any], inputBlocks = inputBlocks.asInstanceOf[js.Any], repeatableContentBlocks = repeatableContentBlocks.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], temps = temps.asInstanceOf[js.Any], textureBlocks = textureBlocks.asInstanceOf[js.Any], variableNames = variableNames.asInstanceOf[js.Any], varyingDeclaration = varyingDeclaration.asInstanceOf[js.Any], varyings = varyings.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMaterialBuildStateSharedData]
  }
}

