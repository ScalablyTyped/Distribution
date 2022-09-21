package typings.base32Encoding

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("base32-encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object decode {
    
    inline def apply[TOut /* <: js.typedarray.Uint8Array */](buffer: js.typedarray.Uint8Array): TOut = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[TOut]
    inline def apply[TOut /* <: js.typedarray.Uint8Array */](buffer: js.typedarray.Uint8Array, output: TOut): TOut = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[TOut]
    inline def apply[TOut /* <: js.typedarray.Uint8Array */](buffer: js.typedarray.Uint8Array, output: TOut, offset: Double): TOut = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[TOut]
    inline def apply[TOut /* <: js.typedarray.Uint8Array */](buffer: js.typedarray.Uint8Array, output: Unit, offset: Double): TOut = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[TOut]
    
    @JSImport("base32-encoding", "decode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("base32-encoding", "decode.bytes")
    @js.native
    val bytes: js.UndefOr[Double] = js.native
  }
  
  object encode {
    
    inline def apply[TOut /* <: js.typedarray.Uint8Array */](buffer: js.typedarray.Uint8Array): TOut = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[TOut]
    inline def apply[TOut /* <: js.typedarray.Uint8Array */](buffer: js.typedarray.Uint8Array, /** @default Buffer.alloc(encode.bytes) */
    output: TOut): TOut = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[TOut]
    inline def apply[TOut /* <: js.typedarray.Uint8Array */](
      buffer: js.typedarray.Uint8Array,
      /** @default Buffer.alloc(encode.bytes) */
    output: TOut,
      /** @default 0 */
    offset: Double
    ): TOut = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[TOut]
    inline def apply[TOut /* <: js.typedarray.Uint8Array */](
      buffer: js.typedarray.Uint8Array,
      /** @default Buffer.alloc(encode.bytes) */
    output: Unit,
      /** @default 0 */
    offset: Double
    ): TOut = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], output.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[TOut]
    
    @JSImport("base32-encoding", "encode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("base32-encoding", "encode.bytes")
    @js.native
    val bytes: js.UndefOr[Double] = js.native
  }
  
  inline def encodingLength(buffer: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def parse(str: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def parse(str: String, /** @default '23456789abcdefghijkmnpqrstuvwxyz' (missing o01l) */
  alphabet: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], alphabet.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def stringify(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(
    buffer: js.typedarray.Uint8Array,
    /** @default '23456789abcdefghijkmnpqrstuvwxyz' (missing o01l) */
  alphabet: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(buffer.asInstanceOf[js.Any], alphabet.asInstanceOf[js.Any])).asInstanceOf[String]
}
