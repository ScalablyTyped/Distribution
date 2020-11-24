package typings.babylonjs.legacyMod

import typings.babylonjs.ddsMod.DDSInfo
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DDSTools")
@js.native
class DDSTools ()
  extends typings.babylonjs.indexMod.DDSTools
/* static members */
@JSImport("babylonjs/Legacy/legacy", "DDSTools")
@js.native
object DDSTools extends js.Object {
  
  /**
    * Gets DDS information from an array buffer
    * @param data defines the array buffer view to read data from
    * @returns the DDS information
    */
  def GetDDSInfo(data: ArrayBufferView): DDSInfo = js.native
  
  /**
    * Gets or sets a boolean indicating that LOD info is stored in alpha channel (false by default)
    */
  var StoreLODInAlphaChannel: Boolean = js.native
  
  /**
    * Uploads DDS Levels to a Babylon Texture
    * @hidden
    */
  def UploadDDSLevels(
    engine: typings.babylonjs.thinEngineMod.ThinEngine,
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double
  ): Unit = js.native
  def UploadDDSLevels(
    engine: typings.babylonjs.thinEngineMod.ThinEngine,
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: js.UndefOr[scala.Nothing],
    currentFace: Double
  ): Unit = js.native
  def UploadDDSLevels(
    engine: typings.babylonjs.thinEngineMod.ThinEngine,
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Double
  ): Unit = js.native
  def UploadDDSLevels(
    engine: typings.babylonjs.thinEngineMod.ThinEngine,
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Double,
    currentFace: Double
  ): Unit = js.native
  
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
}
