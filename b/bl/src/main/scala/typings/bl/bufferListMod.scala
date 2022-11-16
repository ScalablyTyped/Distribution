package typings.bl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.bl.anon.FnCall
import typings.bl.anon.FnCallOffset
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bufferListMod {
  
  @js.native
  trait BufferList extends StObject {
    
    /**
      * Adds an additional buffer or BufferList to the internal list.
      * this is returned so it can be chained.
      *
      * @param buffer
      */
    def append(buffer: BufferListAcceptedTypes): this.type = js.native
    
    /**
      * Will shift bytes off the start of the list. The number of bytes
      * consumed don't need to line up with the sizes of the internal
      * Buffers—initial offsets will be calculated accordingly in order
      * to give you a consistent view of the data.
      *
      * @param bytes
      */
    def consume(): Unit = js.native
    def consume(bytes: Double): Unit = js.native
    
    /**
      * Copies the content of the list in the `dest` buffer, starting from
      * `destStart` and containing the bytes within the range specified
      * with `srcStart` to `srcEnd`.
      *
      * `destStart`, `start` and `end` are optional and will default to the
      * beginning of the dest buffer, and the beginning and end of the
      * list respectively.
      *
      * @param dest
      * @param destStart
      * @param srcStart
      * @param srcEnd
      */
    def copy(dest: Buffer): Buffer = js.native
    def copy(dest: Buffer, destStart: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Double, srcStart: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Double, srcStart: Double, srcEnd: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Double, srcStart: Unit, srcEnd: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Unit, srcStart: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Unit, srcStart: Double, srcEnd: Double): Buffer = js.native
    def copy(dest: Buffer, destStart: Unit, srcStart: Unit, srcEnd: Double): Buffer = js.native
    
    /**
      * Performs a shallow-copy of the list. The internal Buffers remains the
      * same, so if you change the underlying Buffers, the change will be
      * reflected in both the original and the duplicate.
      *
      * This method is needed if you want to call consume() or pipe() and
      * still keep the original list.
      *
      * @example
      *
      * ```js
      * var bl = new BufferListStream();
      * bl.append('hello');
      * bl.append(' world');
      * bl.append('\n');
      * bl.duplicate().pipe(process.stdout, { end: false });
      *
      * console.log(bl.toString())
      * ```
      */
    def duplicate(): this.type = js.native
    
    /**
      * Will return the byte at the specified index.
      * @param index
      */
    def get(index: Double): Double = js.native
    
    /**
      * Will return the byte at the specified index. indexOf() method
      * returns the first index at which a given element can be found
      * in the BufferList, or -1 if it is not present.
      *
      * @param value
      * @param byteOffset
      * @param encoding
      */
    def indexOf(value: String): Double = js.native
    def indexOf(value: String, byteOffset: Double): Double = js.native
    def indexOf(value: String, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: String, byteOffset: Unit, encoding: String): Double = js.native
    def indexOf(value: js.typedarray.Uint8Array): Double = js.native
    def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double): Double = js.native
    def indexOf(value: js.typedarray.Uint8Array, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: js.typedarray.Uint8Array, byteOffset: Unit, encoding: String): Double = js.native
    def indexOf(value: Double): Double = js.native
    def indexOf(value: Double, byteOffset: Double): Double = js.native
    def indexOf(value: Double, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: Double, byteOffset: Unit, encoding: String): Double = js.native
    def indexOf(value: typings.bl.bufferListMod.BufferList): Double = js.native
    def indexOf(value: typings.bl.bufferListMod.BufferList, byteOffset: Double): Double = js.native
    def indexOf(value: typings.bl.bufferListMod.BufferList, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: typings.bl.bufferListMod.BufferList, byteOffset: Unit, encoding: String): Double = js.native
    def indexOf(value: Buffer): Double = js.native
    def indexOf(value: Buffer, byteOffset: Double): Double = js.native
    def indexOf(value: Buffer, byteOffset: Double, encoding: String): Double = js.native
    def indexOf(value: Buffer, byteOffset: Unit, encoding: String): Double = js.native
    
    /**
      * Get the length of the list in bytes. This is the sum of the lengths
      * of all of the buffers contained in the list, minus any initial offset
      * for a semi-consumed buffer at the beginning. Should accurately
      * represent the total number of bytes that can be read from the list.
      */
    var length: Double = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readBigInt64BE(): js.BigInt = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readBigInt64BE(offset: Double): js.BigInt = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readBigInt64BE")
    var readBigInt64BE_Original: FnCallOffset = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readBigInt64LE(): js.BigInt = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readBigInt64LE(offset: Double): js.BigInt = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readBigInt64LE")
    var readBigInt64LE_Original: FnCallOffset = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readBigUInt64BE(): js.BigInt = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readBigUInt64BE(offset: Double): js.BigInt = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readBigUInt64BE")
    var readBigUInt64BE_Original: FnCallOffset = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readBigUInt64LE(): js.BigInt = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readBigUInt64LE(offset: Double): js.BigInt = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readBigUInt64LE")
    var readBigUInt64LE_Original: FnCallOffset = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readDoubleBE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readDoubleBE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readDoubleBE")
    var readDoubleBE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readDoubleLE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readDoubleLE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readDoubleLE")
    var readDoubleLE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readFloatBE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readFloatBE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readFloatBE")
    var readFloatBE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readFloatLE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readFloatLE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readFloatLE")
    var readFloatLE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readInt16BE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readInt16BE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readInt16BE")
    var readInt16BE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readInt16LE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readInt16LE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    @JSName("readInt16LE")
    var readInt16LE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readInt32BE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readInt32BE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readInt32BE")
    var readInt32BE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readInt32LE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readInt32LE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readInt32LE")
    var readInt32LE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readInt8(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readInt8(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    @JSName("readInt8")
    var readInt8_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readIntBE(offset: Double, byteLength: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    @JSName("readIntBE")
    var readIntBE_Original: js.Function2[/* offset */ Double, /* byteLength */ Double, Double] = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readIntLE(offset: Double, byteLength: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    @JSName("readIntLE")
    var readIntLE_Original: js.Function2[/* offset */ Double, /* byteLength */ Double, Double] = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readUInt16BE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readUInt16BE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    @JSName("readUInt16BE")
    var readUInt16BE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readUInt16LE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readUInt16LE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    @JSName("readUInt16LE")
    var readUInt16LE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readUInt32BE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readUInt32BE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readUInt32BE")
    var readUInt32BE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readUInt32LE(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    def readUInt32LE(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are implemented and will operate across internal Buffer boundaries transparently.
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html) documentation for how these work.
      *
      * @param offset
      */
    @JSName("readUInt32LE")
    var readUInt32LE_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readUInt8(): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readUInt8(offset: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    @JSName("readUInt8")
    var readUInt8_Original: FnCall = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readUIntBE(offset: Double, byteLength: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    @JSName("readUIntBE")
    var readUIntBE_Original: js.Function2[/* offset */ Double, /* byteLength */ Double, Double] = js.native
    
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    def readUIntLE(offset: Double, byteLength: Double): Double = js.native
    /**
      * All of the standard byte-reading methods of the Buffer interface are
      * implemented and will operate across internal Buffer boundaries transparently.
      *
      * See the [Buffer](http://nodejs.org/docs/latest/api/buffer.html)
      * documentation for how these work.
      *
      * @param offset
      */
    @JSName("readUIntLE")
    var readUIntLE_Original: js.Function2[/* offset */ Double, /* byteLength */ Double, Double] = js.native
    
    /**
      * Returns a new BufferList object containing the bytes within the
      * range specified. Both start and end are optional and will default
      * to the beginning and end of the list respectively.
      *
      * No copies will be performed. All buffers in the result share
      * memory with the original list.
      *
      * @param start
      * @param end
      */
    def shallowSlice(): this.type = js.native
    def shallowSlice(start: Double): this.type = js.native
    def shallowSlice(start: Double, end: Double): this.type = js.native
    def shallowSlice(start: Unit, end: Double): this.type = js.native
    
    /**
      * Returns a new Buffer object containing the bytes within the
      * range specified. Both start and end are optional and will
      * default to the beginning and end of the list respectively.
      *
      * If the requested range spans a single internal buffer then a
      * slice of that buffer will be returned which shares the original
      * memory range of that Buffer. If the range spans multiple buffers
      * then copy operations will likely occur to give you a uniform Buffer.
      *
      * @param start
      * @param end
      */
    def slice(): Buffer = js.native
    def slice(start: Double): Buffer = js.native
    def slice(start: Double, end: Double): Buffer = js.native
    def slice(start: Unit, end: Double): Buffer = js.native
    
    def toString(encoding: String): String = js.native
    def toString(encoding: String, start: Double): String = js.native
    def toString(encoding: String, start: Double, end: Double): String = js.native
    def toString(encoding: String, start: Unit, end: Double): String = js.native
    def toString(encoding: Unit, start: Double): String = js.native
    def toString(encoding: Unit, start: Double, end: Double): String = js.native
    def toString(encoding: Unit, start: Unit, end: Double): String = js.native
  }
  /**
    * No arguments are required for the constructor, but you can initialise
    * the list by passing in a single Buffer object or an array of Buffer
    * objects.
    *
    * `new` is not strictly required, if you don't instantiate a new object,
    * it will be done automatically for you so you can create a new instance
    * simply with:
    *
    * ```js
    * const { BufferList } = require('bl')
    * const bl = BufferList()
    *
    * // equivalent to:
    *
    * const { BufferList } = require('bl')
    * const bl = new BufferList()
    * ```
    */
  @JSImport("bl/BufferList", "BufferList")
  @js.native
  val BufferList: BufferListConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("bl/BufferList", "BufferList")
  @js.native
  open class BufferListCls ()
    extends StObject
       with typings.bl.bufferListMod.BufferList {
    def this(initData: BufferListAcceptedTypes) = this()
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type BufferListAcceptedTypes = node.buffer.<global>.Buffer | bl.bl/BufferList.BufferList | std.Uint8Array | std.Array<bl.bl/BufferList.BufferListAcceptedTypes> | string | number
  }}}
  to avoid circular code involving: 
  - bl.bl.BufferListStreamInit
  - bl.bl/BufferList.BufferListAcceptedTypes
  */
  type BufferListAcceptedTypes = Buffer | typings.bl.bufferListMod.BufferList | js.typedarray.Uint8Array | js.Array[Any] | String | Double
  
  @js.native
  trait BufferListConstructor
    extends StObject
       with Instantiable0[typings.bl.bufferListMod.BufferList]
       with Instantiable1[/* initData */ BufferListAcceptedTypes, typings.bl.bufferListMod.BufferList] {
    
    def apply(): typings.bl.bufferListMod.BufferList = js.native
    def apply(initData: BufferListAcceptedTypes): typings.bl.bufferListMod.BufferList = js.native
    
    /**
      * Determines if the passed object is a BufferList. It will return true
      * if the passed object is an instance of BufferList or BufferListStream
      * and false otherwise.
      *
      * N.B. this won't return true for BufferList or BufferListStream instances
      * created by versions of this library before this static method was added.
      *
      * @param other
      */
    def isBufferList(other: Any): Boolean = js.native
  }
}
