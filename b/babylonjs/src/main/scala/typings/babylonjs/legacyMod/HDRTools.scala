package typings.babylonjs.legacyMod

import typings.babylonjs.hdrMod.HDRInfo
import typings.babylonjs.panoramaToCubemapMod.CubeMapInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "HDRTools")
@js.native
open class HDRTools ()
  extends typings.babylonjs.indexMod.HDRTools
/* static members */
object HDRTools {
  
  @JSImport("babylonjs/Legacy/legacy", "HDRTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the cubemap information (each faces texture data) extracted from an RGBE texture.
    * This RGBE texture needs to store the information as a panorama.
    *
    * More information on this format are available here:
    * https://en.wikipedia.org/wiki/RGBE_image_format
    *
    * @param buffer The binary file stored in an array buffer.
    * @param size The expected size of the extracted cubemap.
    * @returns The Cube Map information.
    */
  inline def GetCubeMapTextureData(buffer: js.typedarray.ArrayBuffer, size: Double): CubeMapInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCubeMapTextureData")(buffer.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[CubeMapInfo]
  
  /**
    * Reads header information from an RGBE texture stored in a native array.
    * More information on this format are available here:
    * https://en.wikipedia.org/wiki/RGBE_image_format
    *
    * @param uint8array The binary file stored in  native array.
    * @returns The header information.
    */
  inline def RGBE_ReadHeader(uint8array: js.typedarray.Uint8Array): HDRInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBE_ReadHeader")(uint8array.asInstanceOf[js.Any]).asInstanceOf[HDRInfo]
  
  /**
    * Returns the pixels data extracted from an RGBE texture.
    * This pixels will be stored left to right up to down in the R G B order in one array.
    *
    * More information on this format are available here:
    * https://en.wikipedia.org/wiki/RGBE_image_format
    *
    * @param uint8array The binary file stored in an array buffer.
    * @param hdrInfo The header information of the file.
    * @returns The pixels data in RGB right to left up to down order.
    */
  inline def RGBE_ReadPixels(uint8array: js.typedarray.Uint8Array, hdrInfo: HDRInfo): js.typedarray.Float32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("RGBE_ReadPixels")(uint8array.asInstanceOf[js.Any], hdrInfo.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Float32Array]
  
  @JSImport("babylonjs/Legacy/legacy", "HDRTools._Ldexp")
  @js.native
  def _Ldexp: Any = js.native
  inline def _Ldexp_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Ldexp")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "HDRTools._RGBEReadPixelsNOTRLE")
  @js.native
  def _RGBEReadPixelsNOTRLE: Any = js.native
  inline def _RGBEReadPixelsNOTRLE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RGBEReadPixelsNOTRLE")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "HDRTools._RGBEReadPixelsRLE")
  @js.native
  def _RGBEReadPixelsRLE: Any = js.native
  inline def _RGBEReadPixelsRLE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RGBEReadPixelsRLE")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "HDRTools._ReadStringLine")
  @js.native
  def _ReadStringLine: Any = js.native
  inline def _ReadStringLine_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ReadStringLine")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "HDRTools._Rgbe2float")
  @js.native
  def _Rgbe2float: Any = js.native
  inline def _Rgbe2float_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Rgbe2float")(x.asInstanceOf[js.Any])
}
