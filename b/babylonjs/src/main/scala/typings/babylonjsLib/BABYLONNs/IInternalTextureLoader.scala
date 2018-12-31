package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents the required contract to create a new type of texture loader.
  */
@js.native
trait IInternalTextureLoader extends js.Object {
  /**
    * Defines wether the loader supports cascade loading the different faces.
    */
  var supportCascades: scala.Boolean = js.native
  /**
    * This returns if the loader support the current file information.
    * @param extension defines the file extension of the file being loaded
    * @param textureFormatInUse defines the current compressed format in use iun the engine
    * @param fallback defines the fallback internal texture if any
    * @param isBase64 defines whether the texture is encoded as a base64
    * @param isBuffer defines whether the texture data are stored as a buffer
    * @returns true if the loader can load the specified file
    */
  def canLoad(
    extension: java.lang.String,
    textureFormatInUse: Nullable[java.lang.String],
    fallback: Nullable[InternalTexture],
    isBase64: scala.Boolean,
    isBuffer: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * Gets the fallback url in case the load fail. This can return null to allow the default fallback mecanism to work
    * @param rootUrl the url of the texture
    * @param textureFormatInUse defines the current compressed format in use iun the engine
    * @returns the fallback texture
    */
  def getFallbackTextureUrl(rootUrl: java.lang.String, textureFormatInUse: Nullable[java.lang.String]): Nullable[java.lang.String] = js.native
  /**
    * Uploads the cube texture data to the WebGl Texture. It has alreday been bound.
    * @param data contains the texture data
    * @param texture defines the BabylonJS internal texture
    * @param createPolynomials will be true if polynomials have been requested
    * @param onLoad defines the callback to trigger once the texture is ready
    * @param onError defines the callback to trigger in case of error
    */
  def loadCubeData(
    data: java.lang.String,
    texture: InternalTexture,
    createPolynomials: scala.Boolean,
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], scala.Unit]],
    onError: Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ]
  ): scala.Unit = js.native
  def loadCubeData(
    data: js.Array[java.lang.String | stdLib.ArrayBuffer],
    texture: InternalTexture,
    createPolynomials: scala.Boolean,
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], scala.Unit]],
    onError: Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ]
  ): scala.Unit = js.native
  def loadCubeData(
    data: stdLib.ArrayBuffer,
    texture: InternalTexture,
    createPolynomials: scala.Boolean,
    onLoad: Nullable[js.Function1[/* data */ js.UndefOr[_], scala.Unit]],
    onError: Nullable[
      js.Function2[
        /* message */ js.UndefOr[java.lang.String], 
        /* exception */ js.UndefOr[_], 
        scala.Unit
      ]
    ]
  ): scala.Unit = js.native
  /**
    * Uploads the 2D texture data to the WebGl Texture. It has alreday been bound once in the callback.
    * @param data contains the texture data
    * @param texture defines the BabylonJS internal texture
    * @param callback defines the method to call once ready to upload
    */
  def loadData(
    data: stdLib.ArrayBuffer,
    texture: InternalTexture,
    callback: js.Function5[
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      /* loadMipmap */ scala.Boolean, 
      /* isCompressed */ scala.Boolean, 
      /* done */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Transform the url before loading if required.
    * @param rootUrl the url of the texture
    * @param textureFormatInUse defines the current compressed format in use iun the engine
    * @returns the transformed texture
    */
  def transformUrl(rootUrl: java.lang.String, textureFormatInUse: Nullable[java.lang.String]): java.lang.String = js.native
}

