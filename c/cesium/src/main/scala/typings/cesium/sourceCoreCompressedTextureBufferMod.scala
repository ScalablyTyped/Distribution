package typings.cesium

import typings.cesium.mod.CompressedTextureBuffer
import typings.cesium.mod.PixelDatatype
import typings.cesium.mod.PixelFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreCompressedTextureBufferMod {
  
  @JSImport("cesium/Source/Core/CompressedTextureBuffer", JSImport.Default)
  @js.native
  open class default protected () extends CompressedTextureBuffer {
    def this(
      internalFormat: PixelFormat,
      pixelDatatype: PixelDatatype,
      width: Double,
      height: Double,
      buffer: js.typedarray.Uint8Array
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/CompressedTextureBuffer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a shallow clone of a compressed texture buffer.
      * @param object - The compressed texture buffer to be cloned.
      * @returns A shallow clone of the compressed texture buffer.
      */
    inline def clone(`object`: CompressedTextureBuffer): CompressedTextureBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`object`.asInstanceOf[js.Any]).asInstanceOf[CompressedTextureBuffer]
  }
}
