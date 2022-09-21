package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EquiRectangularCubeTexture
  extends StObject
     with BaseTexture {
  
  /** The buffer of the image. */
  /* private */ var _buffer: Any = js.native
  
  /**
    * Convert the ArrayBuffer into a Float32Array and drop the transparency channel.
    * @param buffer The ArrayBuffer that should be converted.
    * @returns The buffer as Float32Array.
    */
  /* private */ var _getFloat32ArrayFromArrayBuffer: Any = js.native
  
  /** The height of the input image. */
  /* private */ var _height: Any = js.native
  
  /**
    * Load the image data, by putting the image on a canvas and extracting its buffer.
    * @param loadTextureCallback
    * @param onError
    */
  /* private */ var _loadImage: Any = js.native
  
  /**
    * Convert the image buffer into a cubemap and create a CubeTexture.
    */
  /* private */ var _loadTexture: Any = js.native
  
  /* private */ var _noMipmap: Any = js.native
  
  /* private */ var _onError: Any = js.native
  
  /* private */ var _onLoad: Any = js.native
  
  /** The size of the cubemap. */
  /* private */ var _size: Any = js.native
  
  /** The width of the input image. */
  /* private */ var _width: Any = js.native
  
  /** The URL to the image. */
  var url: String = js.native
}
