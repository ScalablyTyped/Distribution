package typings.bufferJsonEncoding

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("buffer-json-encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object decode {
    
    inline def apply(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, start: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, start: Double, end: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, start: Unit, end: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("buffer-json-encoding", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The amount of bytes used to decode the `Buffer`. This property is set after each call to `decode()`.
      */
    @JSImport("buffer-json-encoding", "decode.bytes")
    @js.native
    val bytes: js.UndefOr[Double] = js.native
  }
  
  object encode {
    
    inline def apply(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, target: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def apply(buffer: Buffer, target: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], target.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    
    @JSImport("buffer-json-encoding", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The amount of bytes used to encode the `Buffer`. This property is set after each call to `encode()`.
      */
    @JSImport("buffer-json-encoding", "encode.bytes")
    @js.native
    val bytes: js.UndefOr[Double] = js.native
  }
  
  inline def encodingLength(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
}
