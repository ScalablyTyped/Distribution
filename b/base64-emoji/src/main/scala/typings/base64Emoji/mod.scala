package typings.base64Emoji

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base64-emoji", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object decode {
    
    inline def apply(buffer: String): Buffer = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(buffer: String, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(buffer: String, offset: Double, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(buffer: String, offset: Unit, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, offset: Double, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, offset: Unit, length: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("base64-emoji", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of decoded bytes after a call to `decode`.
      */
    @JSImport("base64-emoji", "decode.bytes")
    @js.native
    val bytes: js.UndefOr[Double] = js.native
  }
  
  object encode {
    
    inline def apply(obj: String): Buffer = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(obj: String, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(obj: String, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(obj: String, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(obj: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(obj: Buffer, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(obj: Buffer, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(obj: Buffer, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("base64-emoji", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of encoded bytes after a call to `encode`.
      */
    @JSImport("base64-emoji", "encode.bytes")
    @js.native
    val bytes: js.UndefOr[Double] = js.native
  }
  
  inline def encodingLength(obj: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def encodingLength(obj: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
}
