package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLCanvasElement
import typings.babylonjs.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlElementTexture
  extends StObject
     with BaseTexture {
  
  /* private */ var _createInternalTexture: Any = js.native
  
  /* private */ var _externalTexture: Any = js.native
  
  /* private */ val _format: Any = js.native
  
  /* private */ var _generateMipMaps: Any = js.native
  
  /* private */ var _isVideo: Any = js.native
  
  /* private */ var _samplingMode: Any = js.native
  
  /* private */ var _textureMatrix: Any = js.native
  
  /**
    * The texture URL.
    */
  var element: HTMLVideoElement | HTMLCanvasElement = js.native
  
  /**
    * Observable triggered once the texture has been loaded.
    */
  var onLoadObservable: Observable[HtmlElementTexture] = js.native
  
  /**
    * Updates the content of the texture.
    * @param invertY Defines whether the texture should be inverted on Y (false by default on video and true on canvas)
    */
  def update(): Unit = js.native
  def update(invertY: Nullable[Boolean]): Unit = js.native
}
