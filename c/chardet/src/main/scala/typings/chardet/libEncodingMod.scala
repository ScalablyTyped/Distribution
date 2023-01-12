package typings.chardet

import typings.chardet.libMatchMod.Match
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEncodingMod {
  
  trait Context extends StObject {
    
    var byteStats: js.Array[Double]
    
    var c1Bytes: Boolean
    
    var inputBytes: js.typedarray.Uint8Array
    
    var inputLen: Double
    
    var rawInput: js.typedarray.Uint8Array
    
    var rawLen: Double
  }
  object Context {
    
    inline def apply(
      byteStats: js.Array[Double],
      c1Bytes: Boolean,
      inputBytes: js.typedarray.Uint8Array,
      inputLen: Double,
      rawInput: js.typedarray.Uint8Array,
      rawLen: Double
    ): Context = {
      val __obj = js.Dynamic.literal(byteStats = byteStats.asInstanceOf[js.Any], c1Bytes = c1Bytes.asInstanceOf[js.Any], inputBytes = inputBytes.asInstanceOf[js.Any], inputLen = inputLen.asInstanceOf[js.Any], rawInput = rawInput.asInstanceOf[js.Any], rawLen = rawLen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setByteStats(value: js.Array[Double]): Self = StObject.set(x, "byteStats", value.asInstanceOf[js.Any])
      
      inline def setByteStatsVarargs(value: Double*): Self = StObject.set(x, "byteStats", js.Array(value*))
      
      inline def setC1Bytes(value: Boolean): Self = StObject.set(x, "c1Bytes", value.asInstanceOf[js.Any])
      
      inline def setInputBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "inputBytes", value.asInstanceOf[js.Any])
      
      inline def setInputLen(value: Double): Self = StObject.set(x, "inputLen", value.asInstanceOf[js.Any])
      
      inline def setRawInput(value: js.typedarray.Uint8Array): Self = StObject.set(x, "rawInput", value.asInstanceOf[js.Any])
      
      inline def setRawLen(value: Double): Self = StObject.set(x, "rawLen", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Recogniser extends StObject {
    
    var language: js.UndefOr[js.Function0[js.UndefOr[String]]] = js.native
    
    def `match`(input: Context): Match | Null = js.native
    
    def name(): String = js.native
    def name(input: Context): String = js.native
  }
}
