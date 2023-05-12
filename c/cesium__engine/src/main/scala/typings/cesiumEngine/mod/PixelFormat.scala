package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PixelFormat extends StObject
@JSImport("@cesium/engine", "PixelFormat")
@js.native
object PixelFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[PixelFormat & scala.Nothing] = js.native
  
  /**
    * A pixel format containing an alpha channel.
    */
  @js.native
  sealed trait ALPHA
    extends StObject
       with PixelFormat
  /* WebGLConstants.ALPHA */ val ALPHA: typings.cesiumEngine.mod.PixelFormat.ALPHA & scala.Nothing = js.native
  
  /**
    * A pixel format containing a depth value.
    */
  @js.native
  sealed trait DEPTH_COMPONENT
    extends StObject
       with PixelFormat
  /* WebGLConstants.DEPTH_COMPONENT */ val DEPTH_COMPONENT: typings.cesiumEngine.mod.PixelFormat.DEPTH_COMPONENT & scala.Nothing = js.native
  
  /**
    * A pixel format containing a depth and stencil value, most often used with {@link PixelDatatype.UNSIGNED_INT_24_8}.
    */
  @js.native
  sealed trait DEPTH_STENCIL
    extends StObject
       with PixelFormat
  /* WebGLConstants.DEPTH_STENCIL */ val DEPTH_STENCIL: typings.cesiumEngine.mod.PixelFormat.DEPTH_STENCIL & scala.Nothing = js.native
  
  /**
    * A pixel format containing a luminance (intensity) channel.
    */
  @js.native
  sealed trait LUMINANCE
    extends StObject
       with PixelFormat
  /* WebGLConstants.LUMINANCE */ val LUMINANCE: typings.cesiumEngine.mod.PixelFormat.LUMINANCE & scala.Nothing = js.native
  
  /**
    * A pixel format containing luminance (intensity) and alpha channels.
    */
  @js.native
  sealed trait LUMINANCE_ALPHA
    extends StObject
       with PixelFormat
  /* WebGLConstants.LUMINANCE_ALPHA */ val LUMINANCE_ALPHA: typings.cesiumEngine.mod.PixelFormat.LUMINANCE_ALPHA & scala.Nothing = js.native
  
  /**
    * A pixel format containing a red channel
    */
  @js.native
  sealed trait RED
    extends StObject
       with PixelFormat
  /* WebGLConstants.RED */ val RED: typings.cesiumEngine.mod.PixelFormat.RED & scala.Nothing = js.native
  
  /**
    * A pixel format containing red and green channels.
    */
  @js.native
  sealed trait RG
    extends StObject
       with PixelFormat
  /* WebGLConstants.RG */ val RG: typings.cesiumEngine.mod.PixelFormat.RG & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, and blue channels.
    */
  @js.native
  sealed trait RGB
    extends StObject
       with PixelFormat
  /* WebGLConstants.RGB */ val RGB: typings.cesiumEngine.mod.PixelFormat.RGB & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, and blue channels that is ETC2 compressed.
    */
  @js.native
  sealed trait RGB8_ETC2
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGB8_ETC2 */ val RGB8_ETC2: typings.cesiumEngine.mod.PixelFormat.RGB8_ETC2 & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, blue, and alpha channels.
    */
  @js.native
  sealed trait RGBA
    extends StObject
       with PixelFormat
  /* WebGLConstants.RGBA */ val RGBA: typings.cesiumEngine.mod.PixelFormat.RGBA & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, blue, and alpha channels that is ETC2 compressed.
    */
  @js.native
  sealed trait RGBA8_ETC2_EAC
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGBA8_ETC2_EAC */ val RGBA8_ETC2_EAC: typings.cesiumEngine.mod.PixelFormat.RGBA8_ETC2_EAC & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, blue, and alpha channels that is ASTC compressed.
    */
  @js.native
  sealed trait RGBA_ASTC
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGBA_ASTC_4x4_WEBGL */ val RGBA_ASTC: typings.cesiumEngine.mod.PixelFormat.RGBA_ASTC & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, blue, and alpha channels that is BC7 compressed.
    */
  @js.native
  sealed trait RGBA_BC7
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGBA_BPTC_UNORM */ val RGBA_BC7: typings.cesiumEngine.mod.PixelFormat.RGBA_BC7 & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, blue, and alpha channels that is DXT1 compressed.
    */
  @js.native
  sealed trait RGBA_DXT1
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGBA_S3TC_DXT1_EXT */ val RGBA_DXT1: typings.cesiumEngine.mod.PixelFormat.RGBA_DXT1 & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, blue, and alpha channels that is DXT3 compressed.
    */
  @js.native
  sealed trait RGBA_DXT3
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGBA_S3TC_DXT3_EXT */ val RGBA_DXT3: typings.cesiumEngine.mod.PixelFormat.RGBA_DXT3 & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, blue, and alpha channels that is DXT5 compressed.
    */
  @js.native
  sealed trait RGBA_DXT5
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGBA_S3TC_DXT5_EXT */ val RGBA_DXT5: typings.cesiumEngine.mod.PixelFormat.RGBA_DXT5 & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, blue, and alpha channels that is PVR 2bpp compressed.
    */
  @js.native
  sealed trait RGBA_PVRTC_2BPPV1
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGBA_PVRTC_2BPPV1_IMG */ val RGBA_PVRTC_2BPPV1: typings.cesiumEngine.mod.PixelFormat.RGBA_PVRTC_2BPPV1 & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, blue, and alpha channels that is PVR 4bpp compressed.
    */
  @js.native
  sealed trait RGBA_PVRTC_4BPPV1
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGBA_PVRTC_4BPPV1_IMG */ val RGBA_PVRTC_4BPPV1: typings.cesiumEngine.mod.PixelFormat.RGBA_PVRTC_4BPPV1 & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, and blue channels that is DXT1 compressed.
    */
  @js.native
  sealed trait RGB_DXT1
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGB_S3TC_DXT1_EXT */ val RGB_DXT1: typings.cesiumEngine.mod.PixelFormat.RGB_DXT1 & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, and blue channels that is ETC1 compressed.
    */
  @js.native
  sealed trait RGB_ETC1
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGB_ETC1_WEBGL */ val RGB_ETC1: typings.cesiumEngine.mod.PixelFormat.RGB_ETC1 & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, and blue channels that is PVR 2bpp compressed.
    */
  @js.native
  sealed trait RGB_PVRTC_2BPPV1
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGB_PVRTC_2BPPV1_IMG */ val RGB_PVRTC_2BPPV1: typings.cesiumEngine.mod.PixelFormat.RGB_PVRTC_2BPPV1 & scala.Nothing = js.native
  
  /**
    * A pixel format containing red, green, and blue channels that is PVR 4bpp compressed.
    */
  @js.native
  sealed trait RGB_PVRTC_4BPPV1
    extends StObject
       with PixelFormat
  /* WebGLConstants.COMPRESSED_RGB_PVRTC_4BPPV1_IMG */ val RGB_PVRTC_4BPPV1: typings.cesiumEngine.mod.PixelFormat.RGB_PVRTC_4BPPV1 & scala.Nothing = js.native
}
