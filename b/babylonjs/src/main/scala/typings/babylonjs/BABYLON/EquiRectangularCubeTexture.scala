package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EquiRectangularCubeTexture
  extends StObject
     with BaseTexture {
  
  /** The buffer of the image. */
  /* private */ var _buffer: js.Any = js.native
  
  /** The height of the input image. */
  /* private */ var _height: js.Any = js.native
  
  /* private */ var _noMipmap: js.Any = js.native
  
  /* private */ var _onError: js.Any = js.native
  
  /* private */ var _onLoad: js.Any = js.native
  
  /** The size of the cubemap. */
  /* private */ var _size: js.Any = js.native
  
  /** The width of the input image. */
  /* private */ var _width: js.Any = js.native
  
  /**
    * Convert the ArrayBuffer into a Float32Array and drop the transparency channel.
    * @param buffer The ArrayBuffer that should be converted.
    * @returns The buffer as Float32Array.
    */
  /* private */ var getFloat32ArrayFromArrayBuffer: js.Any = js.native
  
  /**
    * Load the image data, by putting the image on a canvas and extracting its buffer.
    */
  /* private */ var loadImage: js.Any = js.native
  
  /**
    * Convert the image buffer into a cubemap and create a CubeTexture.
    */
  /* private */ var loadTexture: js.Any = js.native
  
  /** The URL to the image. */
  var url: String = js.native
}
