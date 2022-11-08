package typings.b4a

import typings.b4a.anon.ToPrimitive
import typings.b4a.b4aInts.`-1`
import typings.b4a.b4aInts.`0`
import typings.b4a.b4aInts.`1`
import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.bufferMod.global.WithImplicitCoercion
import typings.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("b4a", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alloc(size: Double): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def alloc(size: Double, fill: String): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def alloc(size: Double, fill: String, encoding: BufferEncoding): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def alloc(size: Double, fill: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def alloc(size: Double, fill: js.typedarray.Uint8Array, encoding: BufferEncoding): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def alloc(size: Double, fill: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def alloc(size: Double, fill: Double, encoding: BufferEncoding): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def alloc(size: Double, fill: Unit, encoding: BufferEncoding): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(size.asInstanceOf[js.Any], fill.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  
  inline def allocUnsafe(size: Double): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafe")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  
  inline def allocUnsafeSlow(size: Double): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafeSlow")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  
  inline def byteLength(string: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def byteLength(string: String, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def byteLength(string: js.typedarray.ArrayBuffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def byteLength(string: js.typedarray.ArrayBuffer, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def byteLength(string: ArrayBufferView): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def byteLength(string: ArrayBufferView, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def byteLength(string: SharedArrayBuffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def byteLength(string: SharedArrayBuffer, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("byteLength")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def compare(buf1: js.typedarray.Uint8Array, buf2: js.typedarray.Uint8Array): `-1` | `0` | `1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(buf1.asInstanceOf[js.Any], buf2.asInstanceOf[js.Any])).asInstanceOf[`-1` | `0` | `1`]
  
  inline def concat(list: js.Array[js.typedarray.Uint8Array]): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def concat(list: js.Array[js.typedarray.Uint8Array], totalLength: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any], totalLength.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  
  inline def copy(source: js.typedarray.Uint8Array, target: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def copy(source: js.typedarray.Uint8Array, target: js.typedarray.Uint8Array, targetStart: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetStart.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def copy(
    source: js.typedarray.Uint8Array,
    target: js.typedarray.Uint8Array,
    targetStart: Double,
    sourceStart: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetStart.asInstanceOf[js.Any], sourceStart.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def copy(
    source: js.typedarray.Uint8Array,
    target: js.typedarray.Uint8Array,
    targetStart: Double,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetStart.asInstanceOf[js.Any], sourceStart.asInstanceOf[js.Any], sourceEnd.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def copy(
    source: js.typedarray.Uint8Array,
    target: js.typedarray.Uint8Array,
    targetStart: Double,
    sourceStart: Unit,
    sourceEnd: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetStart.asInstanceOf[js.Any], sourceStart.asInstanceOf[js.Any], sourceEnd.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def copy(
    source: js.typedarray.Uint8Array,
    target: js.typedarray.Uint8Array,
    targetStart: Unit,
    sourceStart: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetStart.asInstanceOf[js.Any], sourceStart.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def copy(
    source: js.typedarray.Uint8Array,
    target: js.typedarray.Uint8Array,
    targetStart: Unit,
    sourceStart: Double,
    sourceEnd: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetStart.asInstanceOf[js.Any], sourceStart.asInstanceOf[js.Any], sourceEnd.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def copy(
    source: js.typedarray.Uint8Array,
    target: js.typedarray.Uint8Array,
    targetStart: Unit,
    sourceStart: Unit,
    sourceEnd: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(source.asInstanceOf[js.Any], target.asInstanceOf[js.Any], targetStart.asInstanceOf[js.Any], sourceStart.asInstanceOf[js.Any], sourceEnd.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def equals_(buffer: js.typedarray.Uint8Array, otherBuffer: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(buffer.asInstanceOf[js.Any], otherBuffer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fill(buffer: js.typedarray.Uint8Array, value: String): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: String, offset: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: String, offset: Double, end: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(
    buffer: js.typedarray.Uint8Array,
    value: String,
    offset: Double,
    end: Double,
    encoding: BufferEncoding
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(
    buffer: js.typedarray.Uint8Array,
    value: String,
    offset: Double,
    end: Unit,
    encoding: BufferEncoding
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: String, offset: Unit, end: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(
    buffer: js.typedarray.Uint8Array,
    value: String,
    offset: Unit,
    end: Double,
    encoding: BufferEncoding
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: String, offset: Unit, end: Unit, encoding: BufferEncoding): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, offset: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, offset: Double, end: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(
    buffer: js.typedarray.Uint8Array,
    value: js.typedarray.Uint8Array,
    offset: Double,
    end: Double,
    encoding: BufferEncoding
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(
    buffer: js.typedarray.Uint8Array,
    value: js.typedarray.Uint8Array,
    offset: Double,
    end: Unit,
    encoding: BufferEncoding
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, offset: Unit, end: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(
    buffer: js.typedarray.Uint8Array,
    value: js.typedarray.Uint8Array,
    offset: Unit,
    end: Double,
    encoding: BufferEncoding
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(
    buffer: js.typedarray.Uint8Array,
    value: js.typedarray.Uint8Array,
    offset: Unit,
    end: Unit,
    encoding: BufferEncoding
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: Double, offset: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: Double, offset: Double, end: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(
    buffer: js.typedarray.Uint8Array,
    value: Double,
    offset: Double,
    end: Double,
    encoding: BufferEncoding
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(
    buffer: js.typedarray.Uint8Array,
    value: Double,
    offset: Double,
    end: Unit,
    encoding: BufferEncoding
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: Double, offset: Unit, end: Double): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(
    buffer: js.typedarray.Uint8Array,
    value: Double,
    offset: Unit,
    end: Double,
    encoding: BufferEncoding
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def fill(buffer: js.typedarray.Uint8Array, value: Double, offset: Unit, end: Unit, encoding: BufferEncoding): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], end.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  
  inline def from(arrayBuffer: WithImplicitCoercion[js.typedarray.ArrayBuffer | SharedArrayBuffer]): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def from(
    arrayBuffer: WithImplicitCoercion[js.typedarray.ArrayBuffer | SharedArrayBuffer],
    byteOffset: Double
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def from(
    arrayBuffer: WithImplicitCoercion[js.typedarray.ArrayBuffer | SharedArrayBuffer],
    byteOffset: Double,
    length: Double
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def from(
    arrayBuffer: WithImplicitCoercion[js.typedarray.ArrayBuffer | SharedArrayBuffer],
    byteOffset: Unit,
    length: Double
  ): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(arrayBuffer.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def from(data: js.Array[Double]): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def from(data: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def from(data: WithImplicitCoercion[js.Array[Double] | String | js.typedarray.Uint8Array]): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def from(str: ToPrimitive): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def from(str: ToPrimitive, encoding: BufferEncoding): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  inline def from(str: WithImplicitCoercion[String], encoding: BufferEncoding): Buffer | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(str.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  
  inline def includes(buffer: js.typedarray.Uint8Array, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(buffer: js.typedarray.Uint8Array, value: String, byteOffset: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(buffer: js.typedarray.Uint8Array, value: String, byteOffset: Double, encoding: BufferEncoding): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(buffer: js.typedarray.Uint8Array, value: String, byteOffset: Unit, encoding: BufferEncoding): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(buffer: js.typedarray.Uint8Array, value: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(buffer: js.typedarray.Uint8Array, value: Double, byteOffset: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(buffer: js.typedarray.Uint8Array, value: Double, byteOffset: Double, encoding: BufferEncoding): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(buffer: js.typedarray.Uint8Array, value: Double, byteOffset: Unit, encoding: BufferEncoding): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(buffer: js.typedarray.Uint8Array, value: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(buffer: js.typedarray.Uint8Array, value: Buffer, byteOffset: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(buffer: js.typedarray.Uint8Array, value: Buffer, byteOffset: Double, encoding: BufferEncoding): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def includes(buffer: js.typedarray.Uint8Array, value: Buffer, byteOffset: Unit, encoding: BufferEncoding): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def indexOf(buffer: js.typedarray.Uint8Array, value: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(buffer: js.typedarray.Uint8Array, value: String, byteOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(buffer: js.typedarray.Uint8Array, value: String, byteOffset: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(buffer: js.typedarray.Uint8Array, value: String, byteOffset: Unit, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(buffer: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(buffer: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, byteOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(
    buffer: js.typedarray.Uint8Array,
    value: js.typedarray.Uint8Array,
    byteOffset: Double,
    encoding: BufferEncoding
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(
    buffer: js.typedarray.Uint8Array,
    value: js.typedarray.Uint8Array,
    byteOffset: Unit,
    encoding: BufferEncoding
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(buffer: js.typedarray.Uint8Array, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(buffer: js.typedarray.Uint8Array, value: Double, byteOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(buffer: js.typedarray.Uint8Array, value: Double, byteOffset: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def indexOf(buffer: js.typedarray.Uint8Array, value: Double, byteOffset: Unit, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isBuffer(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuffer")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEncoding(encoding: String): /* is node.buffer.<global>.BufferEncoding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEncoding")(encoding.asInstanceOf[js.Any]).asInstanceOf[/* is node.buffer.<global>.BufferEncoding */ Boolean]
  
  inline def lastIndexOf(buffer: js.typedarray.Uint8Array, value: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf(buffer: js.typedarray.Uint8Array, value: String, byteOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf(buffer: js.typedarray.Uint8Array, value: String, byteOffset: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf(buffer: js.typedarray.Uint8Array, value: String, byteOffset: Unit, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf(buffer: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf(buffer: js.typedarray.Uint8Array, value: js.typedarray.Uint8Array, byteOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf(
    buffer: js.typedarray.Uint8Array,
    value: js.typedarray.Uint8Array,
    byteOffset: Double,
    encoding: BufferEncoding
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf(
    buffer: js.typedarray.Uint8Array,
    value: js.typedarray.Uint8Array,
    byteOffset: Unit,
    encoding: BufferEncoding
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf(buffer: js.typedarray.Uint8Array, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf(buffer: js.typedarray.Uint8Array, value: Double, byteOffset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf(buffer: js.typedarray.Uint8Array, value: Double, byteOffset: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lastIndexOf(buffer: js.typedarray.Uint8Array, value: Double, byteOffset: Unit, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], byteOffset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readDoubleLE(buffer: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readDoubleLE")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def readDoubleLE(buffer: js.typedarray.Uint8Array, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readDoubleLE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readFloatLE(buffer: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readFloatLE")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def readFloatLE(buffer: js.typedarray.Uint8Array, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readFloatLE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readInt32LE(buffer: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readInt32LE")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def readInt32LE(buffer: js.typedarray.Uint8Array, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt32LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readUInt32LE(buffer: js.typedarray.Uint8Array): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUInt32LE")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def readUInt32LE(buffer: js.typedarray.Uint8Array, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt32LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def swap16(buffer: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("swap16")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  
  inline def swap32(buffer: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("swap32")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  
  inline def swap64(buffer: js.typedarray.Uint8Array): Buffer | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("swap64")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.typedarray.Uint8Array]
  
  inline def toBuffer(buffer: js.typedarray.Uint8Array): js.typedarray.Uint8Array | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array | Buffer]
  
  inline def toString_(buffer: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(buffer: js.typedarray.Uint8Array, encoding: Unit, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(buffer: js.typedarray.Uint8Array, encoding: Unit, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(buffer: js.typedarray.Uint8Array, encoding: Unit, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(buffer: js.typedarray.Uint8Array, encoding: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(buffer: js.typedarray.Uint8Array, encoding: BufferEncoding, start: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(buffer: js.typedarray.Uint8Array, encoding: BufferEncoding, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toString_(buffer: js.typedarray.Uint8Array, encoding: BufferEncoding, start: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def write(buffer: js.typedarray.Uint8Array, string: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def write(buffer: js.typedarray.Uint8Array, string: String, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def write(buffer: js.typedarray.Uint8Array, string: String, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], string.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def write(buffer: js.typedarray.Uint8Array, string: String, offset: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], string.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def write(buffer: js.typedarray.Uint8Array, string: String, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], string.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def write(
    buffer: js.typedarray.Uint8Array,
    string: String,
    offset: Double,
    length: Double,
    encoding: BufferEncoding
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(buffer.asInstanceOf[js.Any], string.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def writeDoubleLE(buffer: js.typedarray.Uint8Array, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDoubleLE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeDoubleLE(buffer: js.typedarray.Uint8Array, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeDoubleLE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def writeFloatLE(buffer: js.typedarray.Uint8Array, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloatLE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeFloatLE(buffer: js.typedarray.Uint8Array, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloatLE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def writeInt32LE(buffer: js.typedarray.Uint8Array, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt32LE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeInt32LE(buffer: js.typedarray.Uint8Array, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt32LE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def writeUInt32LE(buffer: js.typedarray.Uint8Array, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt32LE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def writeUInt32LE(buffer: js.typedarray.Uint8Array, value: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt32LE")(buffer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
}
