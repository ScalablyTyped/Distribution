package typings.bytestreamjs

import typings.bytestreamjs.anon.Id
import typings.bytestreamjs.byteStreamMod.ByteStream
import typings.bytestreamjs.byteStreamMod.FindFirstInResult
import typings.bytestreamjs.byteStreamMod.FindFirstNotInResult
import typings.bytestreamjs.byteStreamMod.FindFirstSequenceResult
import typings.bytestreamjs.byteStreamMod.FindPairedArraysResult
import typings.bytestreamjs.byteStreamMod.FindPairedPatternsResult
import typings.bytestreamjs.byteStreamMod.FindResult
import typings.bytestreamjs.byteStreamMod.ReplacePatternResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object seqStreamMod {
  
  @JSImport("bytestreamjs/build/types/seq_stream", "SeqStream")
  @js.native
  /**
    * Constructor for "SeqStream" class
    * @param parameters
    */
  open class SeqStream () extends StObject {
    def this(parameters: SeqStreamParameters) = this()
    
    /**
      * Length of the major stream
      */
    /* private */ var _length: Any = js.native
    
    /**
      * Start position to search
      */
    /* private */ var _start: Any = js.native
    
    /**
      * Major stream
      */
    /* private */ var _stream: Any = js.native
    
    /**
      * Append a new "Stream" content to the current "Stream"
      * @param stream A new "stream" to append to current "stream"
      */
    def append(stream: ByteStream): Unit = js.native
    
    /**
      * Length of a block when append information to major stream
      */
    var appendBlock: Double = js.native
    
    /**
      * Append a new char to the current "Stream"
      * @param char A new char to append to current "stream"
      */
    def appendChar(char: Double): Unit = js.native
    
    /**
      * Append a new number to the current "Stream"
      * @param number A new signed 16-bit integer to append to current "stream"
      */
    def appendInt16(number: Double): Unit = js.native
    
    /**
      * Append a new number to the current "Stream"
      * @param number A new signed 32-bit integer to append to current "stream"
      */
    def appendInt32(number: Double): Unit = js.native
    
    /**
      * Append a new number to the current "Stream"
      * @param number A new unsigned 16-bit integer to append to current "stream"
      */
    def appendUint16(number: Double): Unit = js.native
    
    /**
      * Append a new number to the current "Stream"
      * @param number A new unsigned 24-bit integer to append to current "stream"
      */
    def appendUint24(number: Double): Unit = js.native
    
    /**
      * Append a new number to the current "Stream"
      * @param number A new unsigned 32-bit integer to append to current "stream"
      */
    def appendUint32(number: Double): Unit = js.native
    
    /**
      * Append a "view" content to the current "Stream"
      * @param view A new "view" to append to current "stream"
      */
    def appendView(view: js.typedarray.Uint8Array): Unit = js.native
    
    /**
      * Flag to search in backward direction
      */
    var backward: Boolean = js.native
    
    /* protected */ def beforeAppend(size: Double): Unit = js.native
    
    /**
      * Return ArrayBuffer with having value of existing SeqStream length
      * @return
      */
    def buffer: js.typedarray.ArrayBuffer = js.native
    
    /**
      * Find all positions of any pattern from input array
      * @param patterns Array with patterns which should be found
      * @returns
      */
    def findAllIn(patterns: js.Array[ByteStream]): js.Array[FindResult] = js.native
    
    /**
      * Find all positions of data, not included in patterns from input array
      * @param patterns Array with patterns which should be omitted
      * @returns
      */
    def findAllNotIn(patterns: js.Array[ByteStream]): js.Array[FindFirstNotInResult] = js.native
    
    /**
      * Find position of a sequence of any patterns from input array
      * @param patterns Array with patterns which should be found
      * @returns
      */
    def findAllSequences(patterns: js.Array[ByteStream]): js.Array[FindFirstSequenceResult] = js.native
    
    /**
      * Find first position of any pattern from input array
      * @param patterns Array with patterns which should be found
      * @param gap Maximum gap between start position and position of nearest object
      * @returns
      */
    def findFirstIn(patterns: js.Array[ByteStream]): FindFirstInResult | Id = js.native
    def findFirstIn(patterns: js.Array[ByteStream], gap: Double): FindFirstInResult | Id = js.native
    
    /**
      * Find first position of data, not included in patterns from input array
      * @param patterns Array with patterns which should be omitted
      * @param gap Maximum gap between start position and position of nearest object
      * @returns
      */
    def findFirstNotIn(patterns: js.Array[ByteStream]): FindFirstNotInResult = js.native
    def findFirstNotIn(patterns: js.Array[ByteStream], gap: Double): FindFirstNotInResult = js.native
    
    /**
      * Find position of a sequence of any patterns from input array
      * @param patterns Array with patterns which should be omitted
      * @param length Length to search sequence for
      * @param gap Maximum gap between start position and position of nearest object
      * @returns
      */
    def findFirstSequence(patterns: js.Array[ByteStream]): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], length: Double): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], length: Double, gap: Double): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], length: Null, gap: Double): FindFirstSequenceResult = js.native
    def findFirstSequence(patterns: js.Array[ByteStream], length: Unit, gap: Double): FindFirstSequenceResult = js.native
    
    /**
      * Find all paired patterns in the stream
      * @param leftPatterns Array of left patterns to search for
      * @param rightPatterns Array of right patterns to search for
      * @param gap Maximum gap between start position and position of nearest object
      * @returns
      */
    def findPairedArrays(leftPatterns: js.Array[ByteStream], rightPatterns: js.Array[ByteStream]): js.Array[FindPairedArraysResult] = js.native
    def findPairedArrays(leftPatterns: js.Array[ByteStream], rightPatterns: js.Array[ByteStream], gap: Double): js.Array[FindPairedArraysResult] = js.native
    
    /**
      * Find all paired patterns in the stream
      * @param leftPattern Left pattern to search for
      * @param rightPattern Right pattern to search for
      * @param gap Maximum gap between start position and position of nearest object
      * @returns
      */
    def findPairedPatterns(leftPattern: ByteStream, rightPattern: ByteStream): js.Array[FindPairedPatternsResult] = js.native
    def findPairedPatterns(leftPattern: ByteStream, rightPattern: ByteStream, gap: Double): js.Array[FindPairedPatternsResult] = js.native
    
    /**
      * Find any byte pattern in "ByteStream"
      * @param pattern Stream having pattern value
      * @param ga Maximum gap between start position and position of nearest object
      * @returns
      */
    def findPattern(pattern: ByteStream): Double = js.native
    def findPattern(pattern: ByteStream, gap: Double): Double = js.native
    
    /**
      * Get a block of data
      * @param size Size of the data block to get
      * @param changeLength Should we change "length" and "start" value after reading the data block
      * @returns
      */
    def getBlock(size: Double): js.typedarray.Uint8Array = js.native
    def getBlock(size: Double, changeLength: Boolean): js.typedarray.Uint8Array = js.native
    
    /**
      * Get 2-byte signed integer value
      * @param changeLength Should we change "length" and "start" value after reading the data block
      * @returns
      */
    def getInt16(): Double = js.native
    def getInt16(changeLength: Boolean): Double = js.native
    
    /**
      * Get 4-byte signed integer value
      * @param changeLength Should we change "length" and "start" value after reading the data block
      * @returns
      */
    def getInt32(): Double = js.native
    def getInt32(changeLength: Boolean): Double = js.native
    
    /**
      * Get 2-byte unsigned integer value
      * @param changeLength Should we change "length" and "start" value after reading the data block
      * @returns
      */
    def getUint16(): Double = js.native
    def getUint16(changeLength: Boolean): Double = js.native
    
    /**
      * Get 3-byte unsigned integer value
      * @param changeLength Should we change "length" and "start" value after reading the data block
      * @returns
      */
    def getUint24(): Double = js.native
    def getUint24(changeLength: Boolean): Double = js.native
    
    /**
      * Get 4-byte unsigned integer value
      * @param changeLength Should we change "length" and "start" value after reading the data block
      * @returns
      */
    def getUint32(): Double = js.native
    def getUint32(changeLength: Boolean): Double = js.native
    
    /**
      * Getter for "length" property
      * @returns
      */
    def length: Double = js.native
    /**
      * Setter for "length" property
      * @param value
      */
    def length_=(value: Double): Unit = js.native
    
    var prevLength: Double = js.native
    
    var prevStart: Double = js.native
    
    /**
      * Replace one patter with other
      * @param searchPattern The pattern to search for
      * @param replacePattern The pattern to replace initial pattern
      * @returns
      */
    def replacePattern(searchPattern: ByteStream, replacePattern: ByteStream): ReplacePatternResult = js.native
    
    /**
      * Reset current position of the "SeqStream"
      */
    def resetPosition(): Unit = js.native
    
    /**
      * Skip of any pattern from input array
      * @param patterns Array with patterns which should be omitted
      * @returns
      */
    def skipNotPatterns(patterns: js.Array[ByteStream]): Double = js.native
    
    /**
      * Skip of any pattern from input array
      * @param patterns Array with patterns which should be omitted
      * @returns
      */
    def skipPatterns(patterns: js.Array[ByteStream]): Double = js.native
    
    /**
      * Getter for "start" property
      * @returns
      */
    def start: Double = js.native
    /**
      * Setter for "start" property
      * @param value
      */
    def start_=(value: Double): Unit = js.native
    
    /**
      * Getter for "stream" property
      */
    def stream: ByteStream = js.native
    /**
      * Setter for "stream" property
      */
    def stream_=(value: ByteStream): Unit = js.native
  }
  /* static members */
  object SeqStream {
    
    @JSImport("bytestreamjs/build/types/seq_stream", "SeqStream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bytestreamjs/build/types/seq_stream", "SeqStream.APPEND_BLOCK")
    @js.native
    def APPEND_BLOCK: Double = js.native
    inline def APPEND_BLOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APPEND_BLOCK")(x.asInstanceOf[js.Any])
  }
  
  trait SeqStreamBaseParameters
    extends StObject
       with SeqStreamParameters {
    
    var appendBlock: js.UndefOr[Double] = js.undefined
    
    var backward: js.UndefOr[Boolean] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object SeqStreamBaseParameters {
    
    inline def apply(): SeqStreamBaseParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeqStreamBaseParameters]
    }
    
    extension [Self <: SeqStreamBaseParameters](x: Self) {
      
      inline def setAppendBlock(value: Double): Self = StObject.set(x, "appendBlock", value.asInstanceOf[js.Any])
      
      inline def setAppendBlockUndefined: Self = StObject.set(x, "appendBlock", js.undefined)
      
      inline def setBackward(value: Boolean): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
      
      inline def setBackwardUndefined: Self = StObject.set(x, "backward", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.bytestreamjs.seqStreamMod.SeqStreamParameters because Already inherited */ trait SeqStreamBufferParameters
    extends StObject
       with SeqStreamBaseParameters {
    
    var buffer: js.typedarray.ArrayBuffer
  }
  object SeqStreamBufferParameters {
    
    inline def apply(buffer: js.typedarray.ArrayBuffer): SeqStreamBufferParameters = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeqStreamBufferParameters]
    }
    
    extension [Self <: SeqStreamBufferParameters](x: Self) {
      
      inline def setBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeqStreamHexParameters
    extends StObject
       with SeqStreamParameters {
    
    var hexstring: String
  }
  object SeqStreamHexParameters {
    
    inline def apply(hexstring: String): SeqStreamHexParameters = {
      val __obj = js.Dynamic.literal(hexstring = hexstring.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeqStreamHexParameters]
    }
    
    extension [Self <: SeqStreamHexParameters](x: Self) {
      
      inline def setHexstring(value: String): Self = StObject.set(x, "hexstring", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.bytestreamjs.seqStreamMod.SeqStreamParameters because Already inherited */ trait SeqStreamLengthParameters
    extends StObject
       with SeqStreamBaseParameters {
    
    var length: Double
  }
  object SeqStreamLengthParameters {
    
    inline def apply(length: Double): SeqStreamLengthParameters = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeqStreamLengthParameters]
    }
    
    extension [Self <: SeqStreamLengthParameters](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.bytestreamjs.seqStreamMod.SeqStreamBaseParameters
    - typings.bytestreamjs.seqStreamMod.SeqStreamLengthParameters
    - typings.bytestreamjs.seqStreamMod.SeqStreamBufferParameters
    - typings.bytestreamjs.seqStreamMod.SeqStreamStreamParameters
    - typings.bytestreamjs.seqStreamMod.SeqStreamViewParameters
    - typings.bytestreamjs.seqStreamMod.SeqStreamStringParameters
    - typings.bytestreamjs.seqStreamMod.SeqStreamHexParameters
  */
  trait SeqStreamParameters extends StObject
  object SeqStreamParameters {
    
    inline def SeqStreamBaseParameters(): typings.bytestreamjs.seqStreamMod.SeqStreamBaseParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.bytestreamjs.seqStreamMod.SeqStreamBaseParameters]
    }
    
    inline def SeqStreamBufferParameters(buffer: js.typedarray.ArrayBuffer): typings.bytestreamjs.seqStreamMod.SeqStreamBufferParameters = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.seqStreamMod.SeqStreamBufferParameters]
    }
    
    inline def SeqStreamHexParameters(hexstring: String): typings.bytestreamjs.seqStreamMod.SeqStreamHexParameters = {
      val __obj = js.Dynamic.literal(hexstring = hexstring.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.seqStreamMod.SeqStreamHexParameters]
    }
    
    inline def SeqStreamLengthParameters(length: Double): typings.bytestreamjs.seqStreamMod.SeqStreamLengthParameters = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.seqStreamMod.SeqStreamLengthParameters]
    }
    
    inline def SeqStreamStreamParameters(stream: ByteStream): typings.bytestreamjs.seqStreamMod.SeqStreamStreamParameters = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.seqStreamMod.SeqStreamStreamParameters]
    }
    
    inline def SeqStreamStringParameters(string: String): typings.bytestreamjs.seqStreamMod.SeqStreamStringParameters = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.seqStreamMod.SeqStreamStringParameters]
    }
    
    inline def SeqStreamViewParameters(view: js.typedarray.Uint8Array): typings.bytestreamjs.seqStreamMod.SeqStreamViewParameters = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.bytestreamjs.seqStreamMod.SeqStreamViewParameters]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.bytestreamjs.seqStreamMod.SeqStreamParameters because Already inherited */ trait SeqStreamStreamParameters
    extends StObject
       with SeqStreamBaseParameters {
    
    var stream: ByteStream
  }
  object SeqStreamStreamParameters {
    
    inline def apply(stream: ByteStream): SeqStreamStreamParameters = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeqStreamStreamParameters]
    }
    
    extension [Self <: SeqStreamStreamParameters](x: Self) {
      
      inline def setStream(value: ByteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait SeqStreamStringParameters
    extends StObject
       with SeqStreamParameters {
    
    var string: String
  }
  object SeqStreamStringParameters {
    
    inline def apply(string: String): SeqStreamStringParameters = {
      val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeqStreamStringParameters]
    }
    
    extension [Self <: SeqStreamStringParameters](x: Self) {
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.bytestreamjs.seqStreamMod.SeqStreamParameters because Already inherited */ trait SeqStreamViewParameters
    extends StObject
       with SeqStreamBaseParameters {
    
    var view: js.typedarray.Uint8Array
  }
  object SeqStreamViewParameters {
    
    inline def apply(view: js.typedarray.Uint8Array): SeqStreamViewParameters = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeqStreamViewParameters]
    }
    
    extension [Self <: SeqStreamViewParameters](x: Self) {
      
      inline def setView(value: js.typedarray.Uint8Array): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
