package typings.babylonjs.global.BABYLON

import typings.babylonjs.anon.EmitVertex
import typings.babylonjs.anon.NeedAlphaBlending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.NodeMaterialBuildStateSharedData")
@js.native
/** Creates a new shared data */
class NodeMaterialBuildStateSharedData ()
  extends typings.babylonjs.BABYLON.NodeMaterialBuildStateSharedData {
  /**
    * Gets the list of animated inputs
    */
  /* CompleteClass */
  override var animatedInputs: js.Array[typings.babylonjs.BABYLON.InputBlock] = js.native
  /**
    * Bindable blocks (Blocks that need to set data to the effect)
    */
  /* CompleteClass */
  override var bindableBlocks: js.Array[typings.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  /**
    * List of blocks that can block the isReady function for the material
    */
  /* CompleteClass */
  override var blockingBlocks: js.Array[typings.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  /**
    * List of blocks that can provide a define update
    */
  /* CompleteClass */
  override var blocksWithDefines: js.Array[typings.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  /**
    * List of blocks that can provide a compilation fallback
    */
  /* CompleteClass */
  override var blocksWithFallbacks: js.Array[typings.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  /**
    * Build Id used to avoid multiple recompilations
    */
  /* CompleteClass */
  override var buildId: Double = js.native
  /**
    * List of compilation checks
    */
  /* CompleteClass */
  override var checks: EmitVertex = js.native
  /** List of emitted defines */
  /* CompleteClass */
  override var defineNames: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  /**
    * List of blocks that can provide a dynamic list of uniforms
    */
  /* CompleteClass */
  override var dynamicUniformBlocks: js.Array[typings.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  /** Should emit comments? */
  /* CompleteClass */
  override var emitComments: Boolean = js.native
  /**
    * Gets the compilation hints emitted at compilation time
    */
  /* CompleteClass */
  override var hints: NeedAlphaBlending = js.native
  /**
    * Input blocks
    */
  /* CompleteClass */
  override var inputBlocks: js.Array[typings.babylonjs.BABYLON.InputBlock] = js.native
  /**
    * List of blocks that can provide a repeatable content
    */
  /* CompleteClass */
  override var repeatableContentBlocks: js.Array[typings.babylonjs.BABYLON.NodeMaterialBlock] = js.native
  /** Gets or sets the hosting scene */
  /* CompleteClass */
  override var scene: typings.babylonjs.BABYLON.Scene = js.native
  /**
    * Gets the list of emitted varyings
    */
  /* CompleteClass */
  override var temps: js.Array[String] = js.native
  /**
    * Input blocks
    */
  /* CompleteClass */
  override var textureBlocks: js.Array[
    typings.babylonjs.BABYLON.ReflectionTextureBlock | typings.babylonjs.BABYLON.TextureBlock
  ] = js.native
  /** List of emitted variables */
  /* CompleteClass */
  override var variableNames: org.scalablytyped.runtime.StringDictionary[Double] = js.native
  /**
    * Gets the varying declaration string
    */
  /* CompleteClass */
  override var varyingDeclaration: String = js.native
  /**
    * Gets the list of emitted varyings
    */
  /* CompleteClass */
  override var varyings: js.Array[String] = js.native
  /** Emit build activity */
  /* CompleteClass */
  override var verbose: Boolean = js.native
  /**
    * Emits console errors and exceptions if there is a failing check
    */
  /* CompleteClass */
  override def emitErrors(): Unit = js.native
}

