package typings.bencode

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bencode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def byteLength(value: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def decode(data: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(data: Buffer, encoding: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(data: Buffer, start: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(data: Buffer, start: Double, encoding: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(data: Buffer, start: Double, end: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(data: Buffer, start: Double, end: Double, encoding: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(data: Buffer, start: Double, end: Unit, encoding: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(data: Buffer, start: Unit, encoding: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(data: Buffer, start: Unit, end: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(data: Buffer, start: Unit, end: Double, encoding: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def decode(data: Buffer, start: Unit, end: Unit, encoding: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encode(data: Any): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def encode(data: Any, buffer: Unit, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encode(data: Any, buffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encode(data: Any, buffer: Buffer, offset: Double): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodingLength(value: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodingLength")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
}
