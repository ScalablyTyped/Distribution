package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HDRCubeTexture
  extends StObject
     with BaseTexture {
  
  /* private */ var _boundingBoxSize: Any = js.native
  
  /* private */ var _generateHarmonics: Any = js.native
  
  /* protected */ var _isBlocking: Boolean = js.native
  
  /**
    * Occurs when the file is raw .hdr file.
    */
  /* private */ var _loadTexture: Any = js.native
  
  /* private */ var _noMipmap: Any = js.native
  
  /* private */ var _onError: Any = js.native
  
  /* private */ var _onLoad: Any = js.native
  
  /* private */ var _prefilterOnLoad: Any = js.native
  
  /* protected */ var _rotationY: Double = js.native
  
  /* private */ var _size: Any = js.native
  
  /* private */ var _supersample: Any = js.native
  
  /* private */ var _textureMatrix: Any = js.native
  
  /**
    * Gets or sets the center of the bounding box associated with the cube texture
    * It must define where the camera used to render the texture was set
    */
  var boundingBoxPosition: Vector3 = js.native
  
  def boundingBoxSize: Vector3 = js.native
  /**
    * Gets or sets the size of the bounding box associated with the cube texture
    * When defined, the cubemap will switch to local mode
    * @see https://community.arm.com/graphics/b/blog/posts/reflections-based-on-local-cubemaps-in-unity
    * @example https://www.babylonjs-playground.com/#RNASML
    */
  def boundingBoxSize_=(value: Vector3): Unit = js.native
  
  /**
    * Sets whether or not the texture is blocking during loading.
    */
  def isBlocking_=(value: Boolean): Unit = js.native
  
  /**
    * Observable triggered once the texture has been loaded.
    */
  var onLoadObservable: Observable[HDRCubeTexture] = js.native
  
  /**
    * Gets texture matrix rotation angle around Y axis radians.
    */
  def rotationY: Double = js.native
  /**
    * Sets texture matrix rotation angle around Y axis in radians.
    */
  def rotationY_=(value: Double): Unit = js.native
  
  /**
    * Set the texture reflection matrix used to rotate/transform the reflection.
    * @param value Define the reflection matrix to set
    */
  def setReflectionTextureMatrix(value: Matrix): Unit = js.native
  
  /**
    * The texture URL.
    */
  var url: String = js.native
}
