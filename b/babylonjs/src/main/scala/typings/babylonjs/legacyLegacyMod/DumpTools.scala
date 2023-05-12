package typings.babylonjs.legacyLegacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "DumpTools")
@js.native
open class DumpTools ()
  extends typings.babylonjs.indexMod.DumpTools
/* static members */
object DumpTools {
  
  @JSImport("babylonjs/Legacy/legacy", "DumpTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Dispose the dump tools associated resources
    */
  inline def Dispose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Dispose")().asInstanceOf[Unit]
  
  /**
    * Dumps an array buffer
    * @param width defines the rendering width
    * @param height defines the rendering height
    * @param data the data array
    * @param successCallback defines the callback triggered once the data are available
    * @param mimeType defines the mime type of the result
    * @param fileName defines the filename to download. If present, the result will automatically be downloaded
    * @param invertY true to invert the picture in the Y dimension
    * @param toArrayBuffer true to convert the data to an ArrayBuffer (encoded as `mimeType`) instead of a base64 string
    * @param quality defines the quality of the result
    */
  inline def DumpData(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    successCallback: js.UndefOr[js.Function1[/* data */ String | js.typedarray.ArrayBuffer, Unit]],
    mimeType: js.UndefOr[String],
    fileName: js.UndefOr[String],
    invertY: js.UndefOr[Boolean],
    toArrayBuffer: js.UndefOr[Boolean],
    quality: js.UndefOr[Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpData")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Dumps an array buffer
    * @param width defines the rendering width
    * @param height defines the rendering height
    * @param data the data array
    * @param mimeType defines the mime type of the result
    * @param fileName defines the filename to download. If present, the result will automatically be downloaded
    * @param invertY true to invert the picture in the Y dimension
    * @param toArrayBuffer true to convert the data to an ArrayBuffer (encoded as `mimeType`) instead of a base64 string
    * @param quality defines the quality of the result
    * @returns a promise that resolve to the final data
    */
  inline def DumpDataAsync(width: Double, height: Double, data: js.typedarray.ArrayBufferView): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(width: Double, height: Double, data: js.typedarray.ArrayBufferView, mimeType: String): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: String
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: String,
    invertY: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: String,
    invertY: Boolean,
    toArrayBuffer: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: String,
    invertY: Boolean,
    toArrayBuffer: Boolean,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: String,
    invertY: Boolean,
    toArrayBuffer: Unit,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: String,
    invertY: Unit,
    toArrayBuffer: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: String,
    invertY: Unit,
    toArrayBuffer: Boolean,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: String,
    invertY: Unit,
    toArrayBuffer: Unit,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: Unit,
    invertY: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: Unit,
    invertY: Boolean,
    toArrayBuffer: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: Unit,
    invertY: Boolean,
    toArrayBuffer: Boolean,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: Unit,
    invertY: Boolean,
    toArrayBuffer: Unit,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: Unit,
    invertY: Unit,
    toArrayBuffer: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: Unit,
    invertY: Unit,
    toArrayBuffer: Boolean,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: String,
    fileName: Unit,
    invertY: Unit,
    toArrayBuffer: Unit,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: String
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: String,
    invertY: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: String,
    invertY: Boolean,
    toArrayBuffer: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: String,
    invertY: Boolean,
    toArrayBuffer: Boolean,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: String,
    invertY: Boolean,
    toArrayBuffer: Unit,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: String,
    invertY: Unit,
    toArrayBuffer: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: String,
    invertY: Unit,
    toArrayBuffer: Boolean,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: String,
    invertY: Unit,
    toArrayBuffer: Unit,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: Unit,
    invertY: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: Unit,
    invertY: Boolean,
    toArrayBuffer: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: Unit,
    invertY: Boolean,
    toArrayBuffer: Boolean,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: Unit,
    invertY: Boolean,
    toArrayBuffer: Unit,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: Unit,
    invertY: Unit,
    toArrayBuffer: Boolean
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: Unit,
    invertY: Unit,
    toArrayBuffer: Boolean,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  inline def DumpDataAsync(
    width: Double,
    height: Double,
    data: js.typedarray.ArrayBufferView,
    mimeType: Unit,
    fileName: Unit,
    invertY: Unit,
    toArrayBuffer: Unit,
    quality: Double
  ): js.Promise[String | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpDataAsync")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], data.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], invertY.asInstanceOf[js.Any], toArrayBuffer.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.typedarray.ArrayBuffer]]
  
  /**
    * Dumps the current bound framebuffer
    * @param width defines the rendering width
    * @param height defines the rendering height
    * @param engine defines the hosting engine
    * @param successCallback defines the callback triggered once the data are available
    * @param mimeType defines the mime type of the result
    * @param fileName defines the filename to download. If present, the result will automatically be downloaded
    * @returns a void promise
    */
  inline def DumpFramebuffer(width: Double, height: Double, engine: typings.babylonjs.enginesEngineMod.Engine): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.enginesEngineMod.Engine,
    successCallback: js.Function1[/* data */ String, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.enginesEngineMod.Engine,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.enginesEngineMod.Engine,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    fileName: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.enginesEngineMod.Engine,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: Unit,
    fileName: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.enginesEngineMod.Engine,
    successCallback: Unit,
    mimeType: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.enginesEngineMod.Engine,
    successCallback: Unit,
    mimeType: String,
    fileName: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typings.babylonjs.enginesEngineMod.Engine,
    successCallback: Unit,
    mimeType: Unit,
    fileName: String
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("DumpFramebuffer")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], mimeType.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("babylonjs/Legacy/legacy", "DumpTools._CreateDumpRenderer")
  @js.native
  def _CreateDumpRenderer: Any = js.native
  inline def _CreateDumpRenderer_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateDumpRenderer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "DumpTools._DumpToolsEngine")
  @js.native
  def _DumpToolsEngine: Any = js.native
  inline def _DumpToolsEngine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_DumpToolsEngine")(x.asInstanceOf[js.Any])
}
