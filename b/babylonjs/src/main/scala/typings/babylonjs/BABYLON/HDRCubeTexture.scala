package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HDRCubeTexture extends BaseTexture {
  var _boundingBoxSize: js.Any = js.native
  var _generateHarmonics: js.Any = js.native
  var _isBlocking: Boolean = js.native
  var _noMipmap: js.Any = js.native
  var _onError: js.Any = js.native
  var _onLoad: js.Any = js.native
  var _rotationY: Double = js.native
  var _size: js.Any = js.native
  var _textureMatrix: js.Any = js.native
  /**
    * Gets or sets the center of the bounding box associated with the cube texture
    * It must define where the camera used to render the texture was set
    */
  var boundingBoxPosition: Vector3 = js.native
  /**
    * The texture coordinates mode. As this texture is stored in a cube format, please modify carefully.
    */
  @JSName("coordinatesMode")
  var coordinatesMode_FHDRCubeTexture: Double = js.native
  /**
    * Occurs when the file is raw .hdr file.
    */
  var loadTexture: js.Any = js.native
  /**
    * The texture URL.
    */
  var url: String = js.native
  def boundingBoxSize: Vector3 = js.native
  /**
    * Gets or sets the size of the bounding box associated with the cube texture
    * When defined, the cubemap will switch to local mode
    * @see https://community.arm.com/graphics/b/blog/posts/reflections-based-on-local-cubemaps-in-unity
    * @example https://www.babylonjs-playground.com/#RNASML
    */
  def boundingBoxSize(value: Vector3): js.Any = js.native
  /**
    * Sets wether or not the texture is blocking during loading.
    */
  def isBlocking(value: Boolean): js.Any = js.native
  /**
    * Gets texture matrix rotation angle around Y axis radians.
    */
  def rotationY: Double = js.native
  /**
    * Sets texture matrix rotation angle around Y axis in radians.
    */
  def rotationY(value: Double): js.Any = js.native
  /**
    * Set the texture reflection matrix used to rotate/transform the reflection.
    * @param value Define the reflection matrix to set
    */
  def setReflectionTextureMatrix(value: Matrix): Unit = js.native
}

