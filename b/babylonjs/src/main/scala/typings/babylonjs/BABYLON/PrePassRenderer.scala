package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrePassRenderer extends StObject {
  
  /**
    * @hidden
    */
  def _afterCameraDraw(): Unit = js.native
  
  /**
    * @hidden
    */
  def _beforeCameraDraw(): Unit = js.native
  
  var _bindFrameBuffer: js.Any = js.native
  
  var _bindPostProcessChain: js.Any = js.native
  
  var _checkRTSize: js.Any = js.native
  
  var _clearAttachments: js.Any = js.native
  
  val _clearColor: js.Any = js.native
  
  var _createCompositionEffect: js.Any = js.native
  
  var _defaultAttachments: js.Any = js.native
  
  var _disable: js.Any = js.native
  
  /**
    * Configuration for prepass effects
    */
  var _effectConfigurations: js.Any = js.native
  
  var _enable: js.Any = js.native
  
  /**
    * Enables a texture on the MultiRenderTarget for prepass
    */
  var _enableTextures: js.Any = js.native
  
  var _enabled: js.Any = js.native
  
  var _engine: js.Any = js.native
  
  var _geometryBuffer: js.Any = js.native
  
  var _initializeAttachments: js.Any = js.native
  
  var _isDirty: js.Any = js.native
  
  var _markAllMaterialsAsPrePassDirty: js.Any = js.native
  
  var _mrtFormats: js.Any = js.native
  
  var _mrtLayout: js.Any = js.native
  
  var _multiRenderAttachments: js.Any = js.native
  
  var _postProcesses: js.Any = js.native
  
  var _resetLayout: js.Any = js.native
  
  var _resetPostProcessChain: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _setState: js.Any = js.native
  
  var _textureFormats: js.Any = js.native
  
  var _textureIndices: js.Any = js.native
  
  var _update: js.Any = js.native
  
  var _updateGeometryBufferLayout: js.Any = js.native
  
  var _useGeometryBufferFallback: js.Any = js.native
  
  /**
    * Adds an effect configuration to the prepass.
    * If an effect has already been added, it won't add it twice and will return the configuration
    * already present.
    * @param cfg the effect configuration
    * @return the effect configuration now used by the prepass
    */
  def addEffectConfiguration(cfg: PrePassEffectConfiguration): PrePassEffectConfiguration = js.native
  
  /**
    * Sets the proper output textures to draw in the engine.
    * @param effect The effect that is drawn. It can be or not be compatible with drawing to several output textures.
    * @param subMesh Submesh on which the effect is applied
    */
  def bindAttachmentsForEffect(effect: Effect, subMesh: SubMesh): Unit = js.native
  
  /**
    * Clears the scene render target (in the sense of settings pixels to the scene clear color value)
    */
  def clear(): Unit = js.native
  
  /**
    * Set to true to disable gamma transform in PrePass.
    * Can be useful in case you already proceed to gamma transform on a material level
    * and your post processes don't need to be in linear color space.
    */
  var disableGammaTransform: Boolean = js.native
  
  /**
    * Disposes the prepass renderer.
    */
  def dispose(): Unit = js.native
  
  /**
    * Indicates if the prepass is enabled
    */
  def enabled: Boolean = js.native
  
  /**
    * Force material to be excluded from the prepass
    * Can be useful when `useGeometryBufferFallback` is set to `true`
    * and you don't want a material to show in the effect.
    */
  var excludedMaterials: js.Array[Material] = js.native
  
  /**
    * To save performance, we can excluded skinned meshes from the prepass
    */
  var excludedSkinnedMesh: js.Array[AbstractMesh] = js.native
  
  /**
    * Returns the index of a texture in the multi render target texture array.
    * @param type Texture type
    * @return The index
    */
  def getIndex(`type`: Double): Double = js.native
  
  /**
    * Image processing post process for composition
    */
  var imageProcessingPostProcess: ImageProcessingPostProcess = js.native
  
  /**
    * Indicates if rendering a prepass is supported
    */
  def isSupported: Boolean = js.native
  
  /**
    * Marks the prepass renderer as dirty, triggering a check if the prepass is necessary for the next rendering.
    */
  def markAsDirty(): Unit = js.native
  
  /**
    * Number of textures in the multi render target texture where the scene is directly rendered
    */
  var mrtCount: Double = js.native
  
  /**
    * The render target where the scene is directly rendered
    */
  var prePassRT: MultiRenderTarget = js.native
  
  /**
    * Restores attachments for single texture draw.
    */
  def restoreAttachments(): Unit = js.native
  
  /**
    * How many samples are used for MSAA of the scene render target
    */
  def samples: Double = js.native
  def samples_=(n: Double): Unit = js.native
  
  /**
    * Uses the geometry buffer renderer as a fallback for non prepass capable effects
    */
  def useGeometryBufferFallback: Boolean = js.native
  def useGeometryBufferFallback_=(value: Boolean): Unit = js.native
}
