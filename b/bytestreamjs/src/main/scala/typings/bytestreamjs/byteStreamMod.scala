package typings.bytestreamjs

import typings.bytestreamjs.anon.Backward
import typings.bytestreamjs.bytestreamjsInts.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteStreamMod {
  
  @JSImport("bytestreamjs/build/types/byte_stream", "ByteStream")
  @js.native
  /**
    * Constructor for ByteStream class
    * @param parameters
    */
  open class ByteStream () extends StObject {
    def this(parameters: ByteStreamParameters) = this()
    
    /* private */ var _buffer: Any = js.native
    
    /* private */ var _view: Any = js.native
    
    /**
      * Append a new "Stream" content to the current "Stream"
      * @param stream A new "stream" to append to current "stream"
      */
    def append(stream: ByteStream): Unit = js.native
    
    /**
      * Getter for "buffer"
      */
    def buffer: js.typedarray.ArrayBuffer = js.native
    /**
      * Setter for "buffer"
      * @param value
      */
    def buffer_=(value: js.typedarray.ArrayBuffer): Unit = js.native
    
    /**
      * Clear existing stream
      */
    def clear(): Unit = js.native
    
    /**
      * Return copy of existing "Stream"
      * @param start Start position of the copy
      * @param length Length of the copy
      */
    def copy(): ByteStream = js.native
    def copy(start: Double): ByteStream = js.native
    def copy(start: Double, length: Double): ByteStream = js.native
    def copy(start: Unit, length: Double): ByteStream = js.native
    
    /**
      * Find all positions of any pattern from input array
      * @param patterns Array with patterns which should be found
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @returns
      */
    def findAllIn(patterns: js.Array[ByteStream]): js.Array[FindResult] = js.native
    def findAllIn(patterns: js.Array[ByteStream], start: Double): js.Array[FindResult] = js.native
    def findAllIn(patterns: js.Array[ByteStream], start: Double, length: Double): js.Array[FindResult] = js.native
    def findAllIn(patterns: js.Array[ByteStream], start: Null, length: Double): js.Array[FindResult] = js.native
    def findAllIn(patterns: js.Array[ByteStream], start: Unit, length: Double): js.Array[FindResult] = js.native
    
    /**
      * Find all positions of data, not included in patterns from input array
      * @param patterns Array with patterns which should be omitted
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @returns
      */
    def findAllNotIn(patterns: js.Array[ByteStream]): js.Array[FindFirstNotInResult] = js.native
    def findAllNotIn(patterns: js.Array[ByteStream], start: Double): js.Array[FindFirstNotInResult] = js.native
    def findAllNotIn(patterns: js.Array[ByteStream], start: Double, length: Double): js.Array[FindFirstNotInResult] = js.native
    def findAllNotIn(patterns: js.Array[ByteStream], start: Null, length: Double): js.Array[FindFirstNotInResult] = js.native
    def findAllNotIn(patterns: js.Array[ByteStream], start: Unit, length: Double): js.Array[FindFirstNotInResult] = js.native
    
    /**
      * Find all positions of a pattern
      * @param pattern Stream having pattern value
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @returns Array with all pattern positions or (-1) if failed
      */
    def findAllPatternIn(pattern: ByteStream): `-1` | js.Array[Double] = js.native
    def findAllPatternIn(pattern: ByteStream, start: Double): `-1` | js.Array[Double] = js.native
    def findAllPatternIn(pattern: ByteStream, start: Double, length: Double): `-1` | js.Array[Double] = js.native
    def findAllPatternIn(pattern: ByteStream, start: Null, length: Double): `-1` | js.Array[Double] = js.native
    def findAllPatternIn(pattern: ByteStream, start: Unit, length: Double): `-1` | js.Array[Double] = js.native
    
    /**
      * Find all positions of a sequence of any patterns from input array
      * @param patterns Array of patterns to search for
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @returns
      */
    def findAllSequences(patterns: js.Array[ByteStream]): js.Array[FindFirstSequenceResult] = js.native
    def findAllSequences(patterns: js.Array[ByteStream], start: Double): js.Array[FindFirstSequenceResult] = js.native
    def findAllSequences(patterns: js.Array[ByteStream], start: Double, length: Double): js.Array[FindFirstSequenceResult] = js.native
    def findAllSequences(patterns: js.Array[ByteStream], start: Null, length: Double): js.Array[FindFirstSequenceResult] = js.native
    def findAllSequences(patterns: js.Array[ByteStream], start: Unit, length: Double): js.Array[FindFirstSequenceResult] = js.native
    
    /**
      * Find first position of any pattern from input array
      * @param patterns Array with patterns which should be found
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @param backward Flag to search in backward order
      * @returns
      */
    def findFirstIn(patterns: js.Array[ByteStream]): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Double): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Double, length: Double): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Double, length: Double, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Double, length: Null, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Double, length: Unit, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Null, length: Double): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Null, length: Double, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Null, length: Null, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Null, length: Unit, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Unit, length: Double): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Unit, length: Double, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Unit, length: Null, backward: Boolean): FindFirstInResult = js.native
    def findFirstIn(patterns: js.Array[ByteStream], start: Unit, length: Unit, backward: Boolean): FindFirstInResult = js.native
    
    /**
      * Find first position of data, not included in patterns from input array
      * @param patterns Array with patterns which should be ommited
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @param backward Flag to search in backward order
      * @returns
      */
    def findFirstNotIn(patterns: js.Array[ByteStream]): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Double): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Double, length: Double): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Double, length: Double, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Double, length: Null, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Double, length: Unit, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Null, length: Double): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Null, length: Double, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Null, length: Null, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Null, length: Unit, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Unit, length: Double): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Unit, length: Double, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Unit, length: Null, backward: Boolean): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], start: Unit, length: Unit, backward: Boolean): FindFirstNotInResult = js.native
    
    /**
      * Find position of a sequence of any patterns from input array
      * @param patterns Array of pattern to look for
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @param backward Flag to search in backward order
      * @returns
      */
    def findFirstSequence(patterns: js.Array[ByteStream]): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Double): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Double, length: Double): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Double, length: Double, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Double, length: Null, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Double, length: Unit, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Null, length: Double): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Null, length: Double, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Null, length: Null, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Null, length: Unit, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Unit, length: Double): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Unit, length: Double, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Unit, length: Null, backward: Boolean): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], start: Unit, length: Unit, backward: Boolean): FindFirstSequenceResult = js.native
    
    /**
      * Find all paired patterns in the stream
      * @param inputLeftPatterns Array of left patterns to search for
      * @param inputRightPatterns Array of right patterns to search for
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @returns
      */
    def findPairedArrays(inputLeftPatterns: js.Array[ByteStream], inputRightPatterns: js.Array[ByteStream]): js.Array[FindPairedArraysResult] = js.native
    def findPairedArrays(inputLeftPatterns: js.Array[ByteStream], inputRightPatterns: js.Array[ByteStream], start: Double): js.Array[FindPairedArraysResult] = js.native
    def findPairedArrays(
      inputLeftPatterns: js.Array[ByteStream],
      inputRightPatterns: js.Array[ByteStream],
      start: Double,
      length: Double
    ): js.Array[FindPairedArraysResult] = js.native
    def findPairedArrays(
      inputLeftPatterns: js.Array[ByteStream],
      inputRightPatterns: js.Array[ByteStream],
      start: Null,
      length: Double
    ): js.Array[FindPairedArraysResult] = js.native
    def findPairedArrays(
      inputLeftPatterns: js.Array[ByteStream],
      inputRightPatterns: js.Array[ByteStream],
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
    def findPairedPatterns(leftPattern: ByteStream, rightPattern: ByteStream): js.Array[FindPairedPatternsResult] = js.native
    def findPairedPatterns(leftPattern: ByteStream, rightPattern: ByteStream, start: Double): js.Array[FindPairedPatternsResult] = js.native
    def findPairedPatterns(leftPattern: ByteStream, rightPattern: ByteStream, start: Double, length: Double): js.Array[FindPairedPatternsResult] = js.native
    def findPairedPatterns(leftPattern: ByteStream, rightPattern: ByteStream, start: Null, length: Double): js.Array[FindPairedPatternsResult] = js.native
    def findPairedPatterns(leftPattern: ByteStream, rightPattern: ByteStream, start: Unit, length: Double): js.Array[FindPairedPatternsResult] = js.native
    
    /**
      * Find any byte pattern in "Stream"
      * @param pattern Stream having pattern value
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @param backward Flag to search in backward order
      * @returns
      */
    def findPattern(pattern: ByteStream): Double = js.native
    def findPattern(pattern: ByteStream, start: Double): Double = js.native
    def findPattern(pattern: ByteStream, start: Double, length: Double): Double = js.native
    def findPattern(pattern: ByteStream, start: Double, length: Double, backward: Boolean): Double = js.native
    def findPattern(pattern: ByteStream, start: Double, length: Null, backward: Boolean): Double = js.native
    def findPattern(pattern: ByteStream, start: Double, length: Unit, backward: Boolean): Double = js.native
    def findPattern(pattern: ByteStream, start: Null, length: Double): Double = js.native
    def findPattern(pattern: ByteStream, start: Null, length: Double, backward: Boolean): Double = js.native
    def findPattern(pattern: ByteStream, start: Null, length: Null, backward: Boolean): Double = js.native
    def findPattern(pattern: ByteStream, start: Null, length: Unit, backward: Boolean): Double = js.native
    def findPattern(pattern: ByteStream, start: Unit, length: Double): Double = js.native
    def findPattern(pattern: ByteStream, start: Unit, length: Double, backward: Boolean): Double = js.native
    def findPattern(pattern: ByteStream, start: Unit, length: Null, backward: Boolean): Double = js.native
    def findPattern(pattern: ByteStream, start: Unit, length: Unit, backward: Boolean): Double = js.native
    
    /**
      * Initialize "Stream" object from existing "ArrayBuffer"
      * @param array The ArrayBuffer to copy from
      */
    def fromArrayBuffer(array: js.typedarray.ArrayBuffer): Unit = js.native
    
    /**
      * Initialize "Stream" object from existing hexdecimal string
      * @param hexString String to initialize from
      */
    def fromHexString(hexString: String): Unit = js.native
    
    /**
      * Initialize "Stream" object from existing string
      * @param string The string to initialize from
      */
    def fromString(string: String): Unit = js.native
    
    /**
      * Initialize "Stream" object from existing "Uint8Array"
      * @param  array The Uint8Array to copy from
      */
    def fromUint8Array(array: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Insert "Stream" content to the current "Stream" at specific position
      * @param stream A new "stream" to insert to current "stream"
      * @param start Start position to insert to
      * @param length
      * @returns
      */
    def insert(stream: ByteStream): Boolean = js.native
    def insert(stream: ByteStream, start: Double): Boolean = js.native
    def insert(stream: ByteStream, start: Double, length: Double): Boolean = js.native
    def insert(stream: ByteStream, start: Unit, length: Double): Boolean = js.native
    
    /**
      * Check that two "Stream" objects has equal content
      * @param stream Stream to compare with
      * @returns
      */
    def isEqual(stream: ByteStream): Boolean = js.native
    
    /**
      * Check that current "Stream" objects has equal content with input "Uint8Array"
      * @param view View to compare with
      * @returns
      */
    def isEqualView(view: js.typedarray.Uint8Array): Boolean = js.native
    
    /**
      * Getter for "length"
      */
    def length: Double = js.native
    /**
      * Setter for "length"
      * @param value
      */
    def length_=(value: Double): Unit = js.native
    
    /* protected */ def prepareFindParameters(): Backward = js.native
    /* protected */ def prepareFindParameters(start: Double): Backward = js.native
    /* protected */ def prepareFindParameters(start: Double, length: Double): Backward = js.native
    /* protected */ def prepareFindParameters(start: Double, length: Double, backward: Boolean): Backward = js.native
    /* protected */ def prepareFindParameters(start: Double, length: Null, backward: Boolean): Backward = js.native
    /* protected */ def prepareFindParameters(start: Double, length: Unit, backward: Boolean): Backward = js.native
    /* protected */ def prepareFindParameters(start: Null, length: Double): Backward = js.native
    /* protected */ def prepareFindParameters(start: Null, length: Double, backward: Boolean): Backward = js.native
    /* protected */ def prepareFindParameters(start: Null, length: Null, backward: Boolean): Backward = js.native
    /* protected */ def prepareFindParameters(start: Null, length: Unit, backward: Boolean): Backward = js.native
    /* protected */ def prepareFindParameters(start: Unit, length: Double): Backward = js.native
    /* protected */ def prepareFindParameters(start: Unit, length: Double, backward: Boolean): Backward = js.native
    /* protected */ def prepareFindParameters(start: Unit, length: Null, backward: Boolean): Backward = js.native
    /* protected */ def prepareFindParameters(start: Unit, length: Unit, backward: Boolean): Backward = js.native
    
    /**
      * Change size of existing "Stream"
      * @param size Size for new "Stream"
      */
    def realloc(size: Double): Unit = js.native
    
    /**
      * Replace one patter with other
      * @param searchPattern The pattern to search for
      * @param replacePattern The pattern to replace initial pattern
      * @param start Start position to search from
      * @param length Length of byte block to search at
      * @param findAllResult Pre-calculated results of "findAllIn"
      */
    def replacePattern(searchPattern: ByteStream, replacePattern: ByteStream): ReplacePatternResult = js.native
    def replacePattern(searchPattern: ByteStream, replacePattern: ByteStream, start: Double): ReplacePatternResult = js.native
    def replacePattern(searchPattern: ByteStream, replacePattern: ByteStream, start: Double, length: Double): ReplacePatternResult = js.native
    def replacePattern(
      searchPattern: ByteStream,
      replacePattern: ByteStream,
      start: Double,
      length: Double,
      findAllResult: js.Array[FindResult]
    ): ReplacePatternResult = js.native
    def replacePattern(
      searchPattern: ByteStream,
      replacePattern: ByteStream,
      start: Double,
      length: Null,
      findAllResult: js.Array[FindResult]
    ): ReplacePatternResult = js.native
    def replacePattern(
      searchPattern: ByteStream,
      replacePattern: ByteStream,
      start: Double,
      length: Unit,
      findAllResult: js.Array[FindResult]
    ): ReplacePatternResult = js.native
    def replacePattern(searchPattern: ByteStream, replacePattern: ByteStream, start: Null, length: Double): ReplacePatternResult = js.native
    def replacePattern(
      searchPattern: ByteStream,
      replacePattern: ByteStream,
      start: Null,
      length: Double,
      findAllResult: js.Array[FindResult]
    ): ReplacePatternResult = js.native
    def replacePattern(
      searchPattern: ByteStream,
      replacePattern: ByteStream,
      start: Null,
      length: Null,
      findAllResult: js.Array[FindResult]
    ): ReplacePatternResult = js.native
    def replacePattern(
      searchPattern: ByteStream,
      replacePattern: ByteStream,
      start: Null,
      length: Unit,
      findAllResult: js.Array[FindResult]
    ): ReplacePatternResult = js.native
    def replacePattern(searchPattern: ByteStream, replacePattern: ByteStream, start: Unit, length: Double): ReplacePatternResult = js.native
    def replacePattern(
      searchPattern: ByteStream,
      replacePattern: ByteStream,
      start: Unit,
      length: Double,
      findAllResult: js.Array[FindResult]
    ): ReplacePatternResult = js.native
    def replacePattern(
      searchPattern: ByteStream,
      replacePattern: ByteStream,
      start: Unit,
      length: Null,
      findAllResult: js.Array[FindResult]
    ): ReplacePatternResult = js.native
    def replacePattern(
      searchPattern: ByteStream,
      replacePattern: ByteStream,
      start: Unit,
      length: Unit,
      findAllResult: js.Array[FindResult]
    ): ReplacePatternResult = js.native
    
    /**
      * Skip any pattern not from input array
      * @param patterns Array with patterns which should not be ommited
      * @param start
      * @param length
      * @param backward
      * @returns
      */
    def skipNotPatterns(patterns: js.Array[ByteStream]): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Double): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Double, length: Double): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Double, length: Double, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Double, length: Null, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Double, length: Unit, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Null, length: Double): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Null, length: Double, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Null, length: Null, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Null, length: Unit, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Unit, length: Double): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Unit, length: Double, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Unit, length: Null, backward: Boolean): Double = js.native
    def skipNotPatterns(patterns: js.Array[ByteStream], start: Unit, length: Unit, backward: Boolean): Double = js.native
    
    /**
      * Skip any pattern from input array
      * @param patterns Array with patterns which should be ommited
      * @param start=null Start position to search from
      * @param length=null Length of byte block to search at
      * @param backward=false Flag to search in backward order
      * @returns
      */
    def skipPatterns(patterns: js.Array[ByteStream]): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Double): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Double, length: Double): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Double, length: Double, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Double, length: Null, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Double, length: Unit, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Null, length: Double): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Null, length: Double, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Null, length: Null, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Null, length: Unit, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Unit, length: Double): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Unit, length: Double, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Unit, length: Null, backward: Boolean): Double = js.native
    def skipPatterns(patterns: js.Array[ByteStream], start: Unit, length: Unit, backward: Boolean): Double = js.native
    
    /**
      * Return slice of existing "Stream"
      * @param start Start position of the slice
      * @param end End position of the slice
      * @returns
      */
    def slice(): ByteStream = js.native
    def slice(start: Double): ByteStream = js.native
    def slice(start: Double, end: Double): ByteStream = js.native
    def slice(start: Unit, end: Double): ByteStream = js.native
    
    /**
      * Represent "Stream" object content as a hexadecimal string
      * @param start Start position to convert to string
      * @param length Length of array to convert to string
      * @returns
      */
    def toHexString(): String = js.native
    def toHexString(start: Double): String = js.native
    def toHexString(start: Double, length: Double): String = js.native
    def toHexString(start: Unit, length: Double): String = js.native
    
    def toString(start: Double): String = js.native
    def toString(start: Double, length: Double): String = js.native
    def toString(start: Unit, length: Double): String = js.native
    
    /**
      * Getter for "view"
      */
    def view: js.typedarray.Uint8Array = js.native
    /**
      * Setter for "view"
      * @param value
      */
    def view_=(value: js.typedarray.Uint8Array): Unit = js.native
  }
  
  trait ByteStreamBufferParameters
    extends StObject
       with ByteStreamParameters {
    
    var buffer: js.typedarray.ArrayBuffer
  }
  object ByteStreamBufferParameters {
    
    inline def apply(buffer: js.typedarray.ArrayBuffer): ByteStreamBufferParameters = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteStreamBufferParameters]
    }
    
    extension [Self <: ByteStreamBufferParameters](x: Self) {
      
      inline def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
  
  trait ByteStreamEmptyParameters
    extends StObject
       with ByteStreamParameters
  
  trait ByteStreamHexParameters
    extends StObject
       with ByteStreamParameters {
    
    var hexstring: String
  }
  object ByteStreamHexParameters {
    
    inline def apply(hexstring: String): ByteStreamHexParameters = {
      val __obj = js.Dynamic.literal(hexstring = hexstring.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteStreamHexParameters]
    }
    
    extension [Self <: ByteStreamHexParameters](x: Self) {
      
      inline def setHexstring(value: String): Self = StObject.set(x, "hexstring", value.asInstanceOf[js.Any])
    }
  }
  
  trait ByteStreamLengthParameters
    extends StObject
       with ByteStreamParameters {
    
    var length: Double
    
    var stub: js.UndefOr[Double] = js.undefined
  }
  object ByteStreamLengthParameters {
    
    inline def apply(length: Double): ByteStreamLengthParameters = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteStreamLengthParameters]
    }
    
    extension [Self <: ByteStreamLengthParameters](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStub(value: Double): Self = StObject.set(x, "stub", value.asInstanceOf[js.Any])
      
      inline def setStubUndefined: Self = StObject.set(x, "stub", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bytestreamjs.byteStreamMod.ByteStreamEmptyParameters
    - typings.bytestreamjs.byteStreamMod.ByteStreamLengthParameters
    - typings.bytestreamjs.byteStreamMod.ByteStreamViewParameters
    - typings.bytestreamjs.byteStreamMod.ByteStreamBufferParameters
    - typings.bytestreamjs.byteStreamMod.ByteStreamStringParameters
    - typings.bytestreamjs.byteStreamMod.ByteStreamHexParameters
  */
  trait ByteStreamParameters extends StObject
  object ByteStreamParameters {
    
    inline def ByteStreamBufferParameters(buffer: js.typedarray.ArrayBuffer): typings.bytestreamjs.byteStreamMod.ByteStreamBufferParameters = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.byteStreamMod.ByteStreamBufferParameters]
    }
    
    inline def ByteStreamHexParameters(hexstring: String): typings.bytestreamjs.byteStreamMod.ByteStreamHexParameters = {
      val __obj = js.Dynamic.literal(hexstring = hexstring.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.byteStreamMod.ByteStreamHexParameters]
    }
    
    inline def ByteStreamLengthParameters(length: Double): typings.bytestreamjs.byteStreamMod.ByteStreamLengthParameters = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.byteStreamMod.ByteStreamLengthParameters]
    }
    
    inline def ByteStreamStringParameters(string: String): typings.bytestreamjs.byteStreamMod.ByteStreamStringParameters = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.byteStreamMod.ByteStreamStringParameters]
    }
    
    inline def ByteStreamViewParameters(view: js.typedarray.Uint8Array): typings.bytestreamjs.byteStreamMod.ByteStreamViewParameters = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.byteStreamMod.ByteStreamViewParameters]
    }
  }
  
  trait ByteStreamStringParameters
    extends StObject
       with ByteStreamParameters {
    
    var string: String
  }
  object ByteStreamStringParameters {
    
    inline def apply(string: String): ByteStreamStringParameters = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteStreamStringParameters]
    }
    
    extension [Self <: ByteStreamStringParameters](x: Self) {
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  trait ByteStreamViewParameters
    extends StObject
       with ByteStreamParameters {
    
    var view: js.typedarray.Uint8Array
  }
  object ByteStreamViewParameters {
    
    inline def apply(view: js.typedarray.Uint8Array): ByteStreamViewParameters = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[ByteStreamViewParameters]
    }
    
    extension [Self <: ByteStreamViewParameters](x: Self) {
      
      inline def setView(value: js.typedarray.Uint8Array): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindFirstInResult extends StObject {
    
    /**
      * Index of the pattern in the list of the patterns
      */
    var id: Double
    
    var length: Double
    
    /**
      * Position after the pattern found
      */
    var position: Double
  }
  object FindFirstInResult {
    
    inline def apply(id: Double, length: Double, position: Double): FindFirstInResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindFirstInResult]
    }
    
    extension [Self <: FindFirstInResult](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindFirstNotInResult extends StObject {
    
    var left: FindResult
    
    var right: FindResult
    
    var value: ByteStream
  }
  object FindFirstNotInResult {
    
    inline def apply(left: FindResult, right: FindResult, value: ByteStream): FindFirstNotInResult = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindFirstNotInResult]
    }
    
    extension [Self <: FindFirstNotInResult](x: Self) {
      
      inline def setLeft(value: FindResult): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: FindResult): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ByteStream): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindFirstSequenceResult extends StObject {
    
    var position: Double
    
    var value: ByteStream
  }
  object FindFirstSequenceResult {
    
    inline def apply(position: Double, value: ByteStream): FindFirstSequenceResult = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindFirstSequenceResult]
    }
    
    extension [Self <: FindFirstSequenceResult](x: Self) {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ByteStream): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindPairedArraysResult extends StObject {
    
    var left: FindResult
    
    var right: FindResult
  }
  object FindPairedArraysResult {
    
    inline def apply(left: FindResult, right: FindResult): FindPairedArraysResult = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindPairedArraysResult]
    }
    
    extension [Self <: FindPairedArraysResult](x: Self) {
      
      inline def setLeft(value: FindResult): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: FindResult): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindPairedPatternsResult extends StObject {
    
    var left: Double
    
    var right: Double
  }
  object FindPairedPatternsResult {
    
    inline def apply(left: Double, right: Double): FindPairedPatternsResult = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindPairedPatternsResult]
    }
    
    extension [Self <: FindPairedPatternsResult](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindResult extends StObject {
    
    var id: Double
    
    var length: js.UndefOr[Double] = js.undefined
    
    var position: Double
  }
  object FindResult {
    
    inline def apply(id: Double, position: Double): FindResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindResult]
    }
    
    extension [Self <: FindResult](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplacePatternResult extends StObject {
    
    var replacePatternPositions: js.Array[Double]
    
    var searchPatternPositions: js.Array[Double]
    
    var status: Double
  }
  object ReplacePatternResult {
    
    inline def apply(
      replacePatternPositions: js.Array[Double],
      searchPatternPositions: js.Array[Double],
      status: Double
    ): ReplacePatternResult = {
      val __obj = js.Dynamic.literal(replacePatternPositions = replacePatternPositions.asInstanceOf[js.Any], searchPatternPositions = searchPatternPositions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplacePatternResult]
    }
    
    extension [Self <: ReplacePatternResult](x: Self) {
      
      inline def setReplacePatternPositions(value: js.Array[Double]): Self = StObject.set(x, "replacePatternPositions", value.asInstanceOf[js.Any])
      
      inline def setReplacePatternPositionsVarargs(value: Double*): Self = StObject.set(x, "replacePatternPositions", js.Array(value*))
      
      inline def setSearchPatternPositions(value: js.Array[Double]): Self = StObject.set(x, "searchPatternPositions", value.asInstanceOf[js.Any])
      
      inline def setSearchPatternPositionsVarargs(value: Double*): Self = StObject.set(x, "searchPatternPositions", js.Array(value*))
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
