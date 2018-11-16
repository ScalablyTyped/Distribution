package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class used to provide DDS decompression tools
     */
@JSGlobal("BABYLON.DDSTools")
@js.native
class DDSTools () extends js.Object

/**
     * Class used to provide DDS decompression tools
     */
@JSGlobal("BABYLON.DDSTools")
@js.native
object DDSTools extends js.Object {
  /**
           * Gets or sets a boolean indicating that LOD info is stored in alpha channel (false by default)
           */
  var StoreLODInAlphaChannel: scala.Boolean = js.native
  var _ExtractLongWordOrder: js.Any = js.native
  var _FloatView: js.Any = js.native
  var _FromHalfFloat: js.Any = js.native
  var _GetFloatAsUIntRGBAArrayBuffer: js.Any = js.native
  var _GetFloatRGBAArrayBuffer: js.Any = js.native
  var _GetHalfFloatAsFloatRGBAArrayBuffer: js.Any = js.native
  var _GetHalfFloatAsUIntRGBAArrayBuffer: js.Any = js.native
  var _GetHalfFloatRGBAArrayBuffer: js.Any = js.native
  var _GetLuminanceArrayBuffer: js.Any = js.native
  var _GetRGBAArrayBuffer: js.Any = js.native
  var _GetRGBArrayBuffer: js.Any = js.native
  var _Int32View: js.Any = js.native
  var _ToHalfFloat: js.Any = js.native
  /**
           * Gets DDS information from an array buffer
           * @param arrayBuffer defines the array buffer to read data from
           * @returns the DDS information
           */
  def GetDDSInfo(arrayBuffer: js.Any): babylonjsLib.BABYLONNs.DDSInfo = js.native
  /**
           * Uploads DDS Levels to a Babylon Texture
           * @hidden
           */
  def UploadDDSLevels(
    engine: babylonjsLib.BABYLONNs.Engine,
    texture: babylonjsLib.BABYLONNs.InternalTexture,
    arrayBuffer: js.Any,
    info: babylonjsLib.BABYLONNs.DDSInfo,
    loadMipmaps: scala.Boolean,
    faces: scala.Double
  ): scala.Unit = js.native
  /**
           * Uploads DDS Levels to a Babylon Texture
           * @hidden
           */
  def UploadDDSLevels(
    engine: babylonjsLib.BABYLONNs.Engine,
    texture: babylonjsLib.BABYLONNs.InternalTexture,
    arrayBuffer: js.Any,
    info: babylonjsLib.BABYLONNs.DDSInfo,
    loadMipmaps: scala.Boolean,
    faces: scala.Double,
    lodIndex: scala.Double
  ): scala.Unit = js.native
  /**
           * Uploads DDS Levels to a Babylon Texture
           * @hidden
           */
  def UploadDDSLevels(
    engine: babylonjsLib.BABYLONNs.Engine,
    texture: babylonjsLib.BABYLONNs.InternalTexture,
    arrayBuffer: js.Any,
    info: babylonjsLib.BABYLONNs.DDSInfo,
    loadMipmaps: scala.Boolean,
    faces: scala.Double,
    lodIndex: scala.Double,
    currentFace: scala.Double
  ): scala.Unit = js.native
}

