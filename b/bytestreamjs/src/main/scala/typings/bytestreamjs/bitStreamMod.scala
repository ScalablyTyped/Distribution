package typings.bytestreamjs

import typings.bytestreamjs.byteStreamMod.ByteStream
import typings.bytestreamjs.byteStreamMod.FindFirstInResult
import typings.bytestreamjs.byteStreamMod.FindFirstNotInResult
import typings.bytestreamjs.byteStreamMod.FindFirstSequenceResult
import typings.bytestreamjs.byteStreamMod.FindPairedArraysResult
import typings.bytestreamjs.byteStreamMod.FindPairedPatternsResult
import typings.bytestreamjs.byteStreamMod.FindResult
import typings.bytestreamjs.bytestreamjsNumbers.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitStreamMod {
  
  @JSImport("bytestreamjs/build/types/bit_stream", "BitStream")
  @js.native
  /**
    * Constructor for "BitStream" class
    * @param parameters
    */
  open class BitStream () extends StObject {
    def this(parameters: BitStreamParameters) = this()
    
    /**
      * Append a new "BitStream" content to the current "BitStream"
      * @param stream A new "stream" to append to current "stream"
      */
    def append(stream: BitStream): Unit = js.native
    
    var bitsCount: Double = js.native
    
    var buffer: js.typedarray.ArrayBuffer = js.native
    
    /**
      * Clear existing stream
      */
    def clear(): Unit = js.native
    
    /**
      * Return copy of existing "BitStream"
      * @param start Start position of the copy (in bits)
      * @param length Length of the copy (in bits)
      * @returns
      */
    def copy(): BitStream = js.native
    def copy(start: Double): BitStream = js.native
    def copy(start: Double, length: Double): BitStream = js.native
    def copy(start: Unit, length: Double): BitStream = js.native
    
    /**
      * Find all positions of any pattern from input array
      * @param patterns Array with patterns which should be found
      * @param start Start position to search from
      * @param length Length of byte block to search at
      */
    def findAllIn(patterns: js.Array[BitStream]): js.Array[FindResult] = js.native
    def findAllIn(patterns: js.Array[BitStream], start: Double): js.Array[FindResult] = js.native
    def findAllIn(patterns: js.Array[BitStream], start: Double, length: Double): js.Array[FindResult] = js.native
    def findAllIn(patterns: js.Array[BitStream], start: Null, length: Double): js.Array[FindResult] = js.native
    def findAllIn(patterns: js.Array[BitStream], start: Unit, length: Double): js.Array[FindResult] = js.native
    
    /**
      * Find all positions of data, not included in patterns from input array
      * @param patterns Array with patterns which should be found
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @returns {Array}
      */
    def findAllNotIn(patterns: js.Array[BitStream]): js.Array[FindFirstNotInResult] = js.native
    def findAllNotIn(patterns: js.Array[BitStream], start: Double): js.Array[FindFirstNotInResult] = js.native
    def findAllNotIn(patterns: js.Array[BitStream], start: Double, length: Double): js.Array[FindFirstNotInResult] = js.native
    def findAllNotIn(patterns: js.Array[BitStream], start: Null, length: Double): js.Array[FindFirstNotInResult] = js.native
    def findAllNotIn(patterns: js.Array[BitStream], start: Unit, length: Double): js.Array[FindFirstNotInResult] = js.native
    
    /**
      * Find all positions of a pattern
      * @param pattern Stream having pattern value
      * @param start Start position to search from
      * @param length Length of byte block to search at
      */
    def findAllPatternIn(pattern: BitStream): `-1` | js.Array[Double] = js.native
    def findAllPatternIn(pattern: BitStream, start: Double): `-1` | js.Array[Double] = js.native
    def findAllPatternIn(pattern: BitStream, start: Double, length: Double): `-1` | js.Array[Double] = js.native
    def findAllPatternIn(pattern: BitStream, start: Null, length: Double): `-1` | js.Array[Double] = js.native
    def findAllPatternIn(pattern: BitStream, start: Unit, length: Double): `-1` | js.Array[Double] = js.native
    
    /**
      * Find position of a sequence of any patterns from input array
      * @param patterns Array with patterns which should be found
      * @param start Start position to search from
      * @param length Length of byte block to search at
      */
    def findAllSequences(patterns: js.Array[BitStream]): js.Array[FindFirstSequenceResult] = js.native
    def findAllSequences(patterns: js.Array[BitStream], start: Double): js.Array[FindFirstSequenceResult] = js.native
    def findAllSequences(patterns: js.Array[BitStream], start: Double, length: Double): js.Array[FindFirstSequenceResult] = js.native
    def findAllSequences(patterns: js.Array[BitStream], start: Null, length: Double): js.Array[FindFirstSequenceResult] = js.native
    def findAllSequences(patterns: js.Array[BitStream], start: Unit, length: Double): js.Array[FindFirstSequenceResult] = js.native
    
    /**
      * Find first position of any pattern from input array
      * @param patterns Array with patterns which should be found
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @param backward Flag to search in backward order
      */
    def findFirstIn(patterns: js.Array[BitStream]): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Double): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Double, length: Double): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Double, length: Double, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Double, length: Null, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Double, length: Unit, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Null, length: Double): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Null, length: Double, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Null, length: Null, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Null, length: Unit, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Unit, length: Double): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Unit, length: Double, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Unit, length: Null, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[BitStream], start: Unit, length: Unit, backward: Boolean): FindFirstInResult = js.native
    
    /**
      * Find first position of data, not included in patterns from input array
      * @param patterns Array with patterns which should be found
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @param backward Flag to search in backward order
      * @returns
      */
    def findFirstNotIn(patterns: js.Array[BitStream]): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Double): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Double, length: Double): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Double, length: Double, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Double, length: Null, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Double, length: Unit, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Null, length: Double): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Null, length: Double, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Null, length: Null, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Null, length: Unit, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Unit, length: Double): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Unit, length: Double, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Unit, length: Null, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[BitStream], start: Unit, length: Unit, backward: Boolean): FindFirstNotInResult = js.native
    
    /**
      * Find position of a sequence of any patterns from input array
      * @param patterns Array with patterns which should be found
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @param backward Flag to search in backward order
      */
    def findFirstSequence(patterns: js.Array[BitStream]): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Double): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Double, length: Double): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Double, length: Double, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Double, length: Null, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Double, length: Unit, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Null, length: Double): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Null, length: Double, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Null, length: Null, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Null, length: Unit, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Unit, length: Double): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Unit, length: Double, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Unit, length: Null, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[BitStream], start: Unit, length: Unit, backward: Boolean): FindFirstSequenceResult = js.native
    
    /**
      * Find all paired patterns in the stream
      * @param inputLeftPatterns Array of left patterns to search for
      * @param inputRightPatterns Array of right patterns to search for
      * @param start Start position to search from
      * @param length Length of byte block to search at
      */
    def findPairedArrays(inputLeftPatterns: js.Array[BitStream], inputRightPatterns: js.Array[BitStream]): js.Array[FindPairedArraysResult] = js.native
    def findPairedArrays(inputLeftPatterns: js.Array[BitStream], inputRightPatterns: js.Array[BitStream], start: Double): js.Array[FindPairedArraysResult] = js.native
    def findPairedArrays(
      inputLeftPatterns: js.Array[BitStream],
      inputRightPatterns: js.Array[BitStream],
      start: Double,
      length: Double
    ): js.Array[FindPairedArraysResult] = js.native
    def findPairedArrays(
      inputLeftPatterns: js.Array[BitStream],
      inputRightPatterns: js.Array[BitStream],
      start: Null,
      length: Double
    ): js.Array[FindPairedArraysResult] = js.native
    def findPairedArrays(
      inputLeftPatterns: js.Array[BitStream],
      inputRightPatterns: js.Array[BitStream],
      start: Unit,
      length: Double
    ): js.Array[FindPairedArraysResult] = js.native
    
    /**
      * Find all paired patterns in the stream
      * @param leftPattern Left pattern to search for
      * @param rightPattern Right pattern to search for
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @returns
      */
    def findPairedPatterns(leftPattern: BitStream, rightPattern: BitStream): js.Array[FindPairedPatternsResult] = js.native
    def findPairedPatterns(leftPattern: BitStream, rightPattern: BitStream, start: Double): js.Array[FindPairedPatternsResult] = js.native
    def findPairedPatterns(leftPattern: BitStream, rightPattern: BitStream, start: Double, length: Double): js.Array[FindPairedPatternsResult] = js.native
    def findPairedPatterns(leftPattern: BitStream, rightPattern: BitStream, start: Null, length: Double): js.Array[FindPairedPatternsResult] = js.native
    def findPairedPatterns(leftPattern: BitStream, rightPattern: BitStream, start: Unit, length: Double): js.Array[FindPairedPatternsResult] = js.native
    
    /**
      * Find any bit pattern in "BitStream"
      * @param pattern Stream having pattern value
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @param backward Flag to search in backward order
      * @returns
      */
    def findPattern(pattern: BitStream): Double = js.native
    def findPattern(pattern: BitStream, start: Double): Double = js.native
    def findPattern(pattern: BitStream, start: Double, length: Double): Double = js.native
    def findPattern(pattern: BitStream, start: Double, length: Double, backward: Boolean): Double = js.native
    def findPattern(pattern: BitStream, start: Double, length: Null, backward: Boolean): Double = js.native
    def findPattern(pattern: BitStream, start: Double, length: Unit, backward: Boolean): Double = js.native
    def findPattern(pattern: BitStream, start: Null, length: Double): Double = js.native
    def findPattern(pattern: BitStream, start: Null, length: Double, backward: Boolean): Double = js.native
    def findPattern(pattern: BitStream, start: Null, length: Null, backward: Boolean): Double = js.native
    def findPattern(pattern: BitStream, start: Null, length: Unit, backward: Boolean): Double = js.native
    def findPattern(pattern: BitStream, start: Unit, length: Double): Double = js.native
    def findPattern(pattern: BitStream, start: Unit, length: Double, backward: Boolean): Double = js.native
    def findPattern(pattern: BitStream, start: Unit, length: Null, backward: Boolean): Double = js.native
    def findPattern(pattern: BitStream, start: Unit, length: Unit, backward: Boolean): Double = js.native
    
    /**
      * Initialize "BitStream" object from existing "ArrayBuffer"
      * @param array The ArrayBuffer to copy from
      */
    def fromArrayBuffer(array: js.typedarray.ArrayBuffer): Unit = js.native
    
    /**
      * Initialize "BitStream" by data from existing "ByteStream"
      * @param stream
      */
    def fromByteStream(stream: ByteStream): Unit = js.native
    
    /**
      * Initialize "BitStream" object from existing bit string
      * @param string The string to initialize from
      */
    def fromString(string: String): Unit = js.native
    
    /**
      * Initialize "BitStream" object from existing uint32 number
      * @param number The string to initialize from
      */
    def fromUint32(uint32: Double): Unit = js.native
    
    /**
      * Initialize "BitStream" object from existing "Uint8Array"
      * @param array The Uint8Array to copy from
      */
    def fromUint8Array(array: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Trying to represent entire "BitStream" as an unsigned integer.
      * @return
      */
    def getNumberValue(): Double = js.native
    
    /**
      * Replace one pattern with other
      * @param searchPattern The pattern to search for
      * @param replacePattern The pattern to replace initial pattern
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @returns
      */
    def replacePattern(searchPattern: BitStream, replacePattern: BitStream): Boolean = js.native
    def replacePattern(searchPattern: BitStream, replacePattern: BitStream, start: Double): Boolean = js.native
    def replacePattern(searchPattern: BitStream, replacePattern: BitStream, start: Double, length: Double): Boolean = js.native
    def replacePattern(searchPattern: BitStream, replacePattern: BitStream, start: Null, length: Double): Boolean = js.native
    def replacePattern(searchPattern: BitStream, replacePattern: BitStream, start: Unit, length: Double): Boolean = js.native
    
    /**
      * Reverse bits order in each byte in the stream
      *
      * Got it from here: http://graphics.stanford.edu/~seander/bithacks.html#ReverseByteWith32Bits
      */
    def reverseBytes(): Unit = js.native
    
    /**
      * Reverse all bits in entire "BitStream"
      */
    def reverseValue(): Unit = js.native
    
    /**
      * Shift entire "BitStream" value left to number of bits
      * @param shift Number of bits to shift value
      */
    def shiftLeft(shift: Double): Unit = js.native
    
    /**
      * Shift entire "BitStream" value right to number of bits
      * @param shift Number of bits to shift value
      * @param needShrink Need to shrink result or not
      */
    def shiftRight(shift: Double): Unit = js.native
    def shiftRight(shift: Double, needShrink: Boolean): Unit = js.native
    
    /**
      * Shrink unnecessary bytes in current stream accordingly to "bitsCount" value
      */
    def shrink(): Unit = js.native
    
    /**
      * Skip any pattern not from input array
      * @param patterns Array with patterns which should be omitted
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @param backward Flag to search in backward order
      */
    def skipNotPatterns(patterns: js.Array[BitStream]): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Double): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Double, length: Double): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Double, length: Double, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Double, length: Null, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Double, length: Unit, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Null, length: Double): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Null, length: Double, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Null, length: Null, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Null, length: Unit, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Unit, length: Double): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Unit, length: Double, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Unit, length: Null, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[BitStream], start: Unit, length: Unit, backward: Boolean): Double = js.native
    
    /**
      * Skip any pattern from input array
      * @param patterns Array with patterns which should be omitted
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @param backward Flag to search in backward order
      */
    def skipPatterns(patterns: js.Array[BitStream]): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Double): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Double, length: Double): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Double, length: Double, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Double, length: Null, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Double, length: Unit, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Null, length: Double): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Null, length: Double, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Null, length: Null, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Null, length: Unit, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Unit, length: Double): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Unit, length: Double, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Unit, length: Null, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[BitStream], start: Unit, length: Unit, backward: Boolean): Double = js.native
    
    /**
      * Return slice of existing "BitStream"
      * @param start Start position of the slice (in bits)
      * @param end End position of the slice (in bits)
      * @returns
      */
    def slice(): BitStream = js.native
    def slice(start: Double): BitStream = js.native
    def slice(start: Double, end: Double): BitStream = js.native
    def slice(start: Unit, end: Double): BitStream = js.native
    
    def toString(start: Double): String = js.native
    def toString(start: Double, length: Double): String = js.native
    def toString(start: Null, length: Double): String = js.native
    def toString(start: Unit, length: Double): String = js.native
    
    var view: js.typedarray.Uint8Array = js.native
  }
  
  trait BitStreamBufferParameters
    extends StObject
       with BitStreamParameters {
    
    var bitsCount: js.UndefOr[Double] = js.undefined
    
    var buffer: js.typedarray.ArrayBuffer
  }
  object BitStreamBufferParameters {
    
    inline def apply(buffer: js.typedarray.ArrayBuffer): BitStreamBufferParameters = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitStreamBufferParameters]
    }
    
    extension [Self <: BitStreamBufferParameters](x: Self) {
      
      inline def setBitsCount(value: Double): Self = StObject.set(x, "bitsCount", value.asInstanceOf[js.Any])
      
      inline def setBitsCountUndefined: Self = StObject.set(x, "bitsCount", js.undefined)
      
      inline def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bytestreamjs.bitStreamMod.BitStreamViewParameters
    - typings.bytestreamjs.bitStreamMod.BitStreamStreamParameters
    - typings.bytestreamjs.bitStreamMod.BitStreamBufferParameters
    - typings.bytestreamjs.bitStreamMod.BitStreamUint32Parameters
    - typings.bytestreamjs.bitStreamMod.BitStreamStringParameters
  */
  trait BitStreamParameters extends StObject
  object BitStreamParameters {
    
    inline def BitStreamBufferParameters(buffer: js.typedarray.ArrayBuffer): typings.bytestreamjs.bitStreamMod.BitStreamBufferParameters = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.bitStreamMod.BitStreamBufferParameters]
    }
    
    inline def BitStreamStreamParameters(byteStream: ByteStream): typings.bytestreamjs.bitStreamMod.BitStreamStreamParameters = {
      val __obj = js.Dynamic.literal(byteStream = byteStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.bitStreamMod.BitStreamStreamParameters]
    }
    
    inline def BitStreamStringParameters(string: String): typings.bytestreamjs.bitStreamMod.BitStreamStringParameters = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.bitStreamMod.BitStreamStringParameters]
    }
    
    inline def BitStreamUint32Parameters(uint32: Double): typings.bytestreamjs.bitStreamMod.BitStreamUint32Parameters = {
      val __obj = js.Dynamic.literal(uint32 = uint32.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.bitStreamMod.BitStreamUint32Parameters]
    }
    
    inline def BitStreamViewParameters(view: js.typedarray.Uint8Array): typings.bytestreamjs.bitStreamMod.BitStreamViewParameters = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.bitStreamMod.BitStreamViewParameters]
    }
  }
  
  trait BitStreamStreamParameters
    extends StObject
       with BitStreamParameters {
    
    var bitsCount: js.UndefOr[Double] = js.undefined
    
    var byteStream: ByteStream
  }
  object BitStreamStreamParameters {
    
    inline def apply(byteStream: ByteStream): BitStreamStreamParameters = {
      val __obj = js.Dynamic.literal(byteStream = byteStream.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitStreamStreamParameters]
    }
    
    extension [Self <: BitStreamStreamParameters](x: Self) {
      
      inline def setBitsCount(value: Double): Self = StObject.set(x, "bitsCount", value.asInstanceOf[js.Any])
      
      inline def setBitsCountUndefined: Self = StObject.set(x, "bitsCount", js.undefined)
      
      inline def setByteStream(value: ByteStream): Self = StObject.set(x, "byteStream", value.asInstanceOf[js.Any])
    }
  }
  
  trait BitStreamStringParameters
    extends StObject
       with BitStreamParameters {
    
    var bitsCount: js.UndefOr[Double] = js.undefined
    
    var string: String
  }
  object BitStreamStringParameters {
    
    inline def apply(string: String): BitStreamStringParameters = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitStreamStringParameters]
    }
    
    extension [Self <: BitStreamStringParameters](x: Self) {
      
      inline def setBitsCount(value: Double): Self = StObject.set(x, "bitsCount", value.asInstanceOf[js.Any])
      
      inline def setBitsCountUndefined: Self = StObject.set(x, "bitsCount", js.undefined)
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  trait BitStreamUint32Parameters
    extends StObject
       with BitStreamParameters {
    
    var bitsCount: js.UndefOr[Double] = js.undefined
    
    var uint32: Double
  }
  object BitStreamUint32Parameters {
    
    inline def apply(uint32: Double): BitStreamUint32Parameters = {
      val __obj = js.Dynamic.literal(uint32 = uint32.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitStreamUint32Parameters]
    }
    
    extension [Self <: BitStreamUint32Parameters](x: Self) {
      
      inline def setBitsCount(value: Double): Self = StObject.set(x, "bitsCount", value.asInstanceOf[js.Any])
      
      inline def setBitsCountUndefined: Self = StObject.set(x, "bitsCount", js.undefined)
      
      inline def setUint32(value: Double): Self = StObject.set(x, "uint32", value.asInstanceOf[js.Any])
    }
  }
  
  trait BitStreamViewParameters
    extends StObject
       with BitStreamParameters {
    
    var bitsCount: js.UndefOr[Double] = js.undefined
    
    var view: js.typedarray.Uint8Array
  }
  object BitStreamViewParameters {
    
    inline def apply(view: js.typedarray.Uint8Array): BitStreamViewParameters = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitStreamViewParameters]
    }
    
    extension [Self <: BitStreamViewParameters](x: Self) {
      
      inline def setBitsCount(value: Double): Self = StObject.set(x, "bitsCount", value.asInstanceOf[js.Any])
      
      inline def setBitsCountUndefined: Self = StObject.set(x, "bitsCount", js.undefined)
      
      inline def setView(value: js.typedarray.Uint8Array): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
