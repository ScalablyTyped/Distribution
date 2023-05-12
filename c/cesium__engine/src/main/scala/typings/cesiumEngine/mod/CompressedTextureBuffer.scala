package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "CompressedTextureBuffer")
@js.native
open class CompressedTextureBuffer protected () extends StObject {
  def this(
    internalFormat: PixelFormat,
    pixelDatatype: PixelDatatype,
    width: Double,
    height: Double,
    buffer: js.typedarray.Uint8Array
  ) = this()
  
  /**
    * The compressed texture buffer.
    */
  val bufferView: js.typedarray.Uint8Array = js.native
  
  /**
    * The height of the texture.
    */
  val height: Double = js.native
  
  /**
    * The format of the compressed texture.
    */
  val internalFormat: PixelFormat = js.native
  
  /**
    * The datatype of the compressed texture.
    */
  val pixelDatatype: PixelDatatype = js.native
  
  /**
    * The width of the texture.
    */
  val width: Double = js.native
}
/* static members */
object CompressedTextureBuffer {
  
  @JSImport("@cesium/engine", "CompressedTextureBuffer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a shallow clone of a compressed texture buffer.
    * @param object - The compressed texture buffer to be cloned.
    * @returns A shallow clone of the compressed texture buffer.
    */
  inline def clone(`object`: CompressedTextureBuffer): CompressedTextureBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`object`.asInstanceOf[js.Any]).asInstanceOf[CompressedTextureBuffer]
}
