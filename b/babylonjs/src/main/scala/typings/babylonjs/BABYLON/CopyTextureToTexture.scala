package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyTextureToTexture extends StObject {
  
  /* private */ var _conversion: Any = js.native
  
  /* private */ var _effectWrapper: Any = js.native
  
  /* private */ var _renderer: Any = js.native
  
  /* private */ var _source: Any = js.native
  
  /* private */ var _textureIsInternal: Any = js.native
  
  def copy(source: InternalTexture, destination: IRenderTargetTexture): Boolean = js.native
  def copy(source: InternalTexture, destination: IRenderTargetTexture, conversion: ConversionMode): Boolean = js.native
  /**
    * Copy one texture into another
    * @param source The source texture
    * @param destination The destination texture
    * @param conversion The conversion mode that should be applied when copying
    * @returns
    */
  def copy(source: InternalTexture, destination: RenderTargetWrapper): Boolean = js.native
  def copy(source: InternalTexture, destination: RenderTargetWrapper, conversion: ConversionMode): Boolean = js.native
  def copy(source: ThinTexture, destination: IRenderTargetTexture): Boolean = js.native
  def copy(source: ThinTexture, destination: IRenderTargetTexture, conversion: ConversionMode): Boolean = js.native
  def copy(source: ThinTexture, destination: RenderTargetWrapper): Boolean = js.native
  def copy(source: ThinTexture, destination: RenderTargetWrapper, conversion: ConversionMode): Boolean = js.native
  
  /**
    * Indicates if the effect is ready to be used for the copy
    * @returns true if "copy" can be called without delay, else false
    */
  def isReady(): Boolean = js.native
}
