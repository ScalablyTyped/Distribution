package typings.bytestreamjs

import typings.bytestreamjs.buildTypesBitStreamMod.BitStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSeqBitStreamMod {
  
  @JSImport("bytestreamjs/build/types/seq_bit_stream", "SeqBitStream")
  @js.native
  open class SeqBitStream () extends StObject {
    def this(parameters: SeqBitStreamParameters) = this()
    
    /* private */ var _length: Any = js.native
    
    /* private */ var _start: Any = js.native
    
    /* private */ var _stream: Any = js.native
    
    var appendBlock: Double = js.native
    
    var backward: Boolean = js.native
    
    /**
      * Get next "length" bits from the stream
      * @param length Number of bits to read
      * @returns
      */
    def getBits(): BitStream = js.native
    def getBits(length: Double): BitStream = js.native
    
    /**
      * Get number value representation of the next "length" bits from the stream, preliminary reversed
      * @param length Number of bits to read
      * @returns
      */
    def getBitsReversedValue(length: Double): Double = js.native
    
    /**
      * Get string representation for the next "length" bits from the stream
      * @param length Number of bits to read
      * @returns
      */
    def getBitsString(length: Double): String = js.native
    
    def length: Double = js.native
    def length_=(value: Double): Unit = js.native
    
    var prevLength: Double = js.native
    
    var prevStart: Double = js.native
    
    def start: Double = js.native
    def start_=(value: Double): Unit = js.native
    
    def stream: BitStream = js.native
    def stream_=(value: BitStream): Unit = js.native
  }
  
  trait SeqBitStreamParameters extends StObject {
    
    var appendBlock: js.UndefOr[Double] = js.undefined
    
    var backward: js.UndefOr[Boolean] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var stream: js.UndefOr[BitStream] = js.undefined
  }
  object SeqBitStreamParameters {
    
    inline def apply(): SeqBitStreamParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SeqBitStreamParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeqBitStreamParameters] (val x: Self) extends AnyVal {
      
      inline def setAppendBlock(value: Double): Self = StObject.set(x, "appendBlock", value.asInstanceOf[js.Any])
      
      inline def setAppendBlockUndefined: Self = StObject.set(x, "appendBlock", js.undefined)
      
      inline def setBackward(value: Boolean): Self = StObject.set(x, "backward", value.asInstanceOf[js.Any])
      
      inline def setBackwardUndefined: Self = StObject.set(x, "backward", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStream(value: BitStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
}
