package typings.charsetDetector

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * ICU based port of charset detection to javascript
    * @param input accept node Buffer, but will work with anything that follow such rules:
    *              - allow indexing by []
    *              - has .length
    *              - each numbered property is byte 0-255
    * @param matchers charset detectors, default value is `detect.DEFAULT_CS_RECOGNIZERS`
    * @returns array of matches sorted by most confident first
    */
  inline def apply(input: ArrayLike[Double]): js.Array[CharsetMatch] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Array[CharsetMatch]]
  inline def apply(input: ArrayLike[Double], matchers: js.Array[CharsetMatcher]): js.Array[CharsetMatch] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], matchers.asInstanceOf[js.Any])).asInstanceOf[js.Array[CharsetMatch]]
  
  @JSImport("charset-detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("charset-detector", "ALL_CS_RECOGNIZERS")
  @js.native
  val ALL_CS_RECOGNIZERS: js.Array[CharsetMatcher] = js.native
  
  @JSImport("charset-detector", "DEFAULT_CS_RECOGNIZERS")
  @js.native
  val DEFAULT_CS_RECOGNIZERS: js.Array[CharsetMatcher] = js.native
  
  /**
    * charset detect match result
    */
  trait CharsetMatch extends StObject {
    
    /**
      * name of charset
      * @example 'UTF-8'
      */
    var charsetName: String
    
    /**
      * confidence between 0 and 100
      */
    var confidence: Double
    
    /**
      * language of charset
      * @example 'zh'
      */
    var lang: js.UndefOr[String] = js.undefined
  }
  object CharsetMatch {
    
    inline def apply(charsetName: String, confidence: Double): CharsetMatch = {
      val __obj = js.Dynamic.literal(charsetName = charsetName.asInstanceOf[js.Any], confidence = confidence.asInstanceOf[js.Any])
      __obj.asInstanceOf[CharsetMatch]
    }
    
    extension [Self <: CharsetMatch](x: Self) {
      
      inline def setCharsetName(value: String): Self = StObject.set(x, "charsetName", value.asInstanceOf[js.Any])
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    }
  }
  
  type CharsetMatcher = js.Function2[/* input */ ArrayLike[Double], /* stats */ InputStats, CharsetMatch | Null]
  
  /**
    * input statics
    */
  trait InputStats extends StObject {
    
    /**
      * count of bytes, eg. `byteStats[32] === 17` means there are 17 bytes with value of `32` in the input
      */
    val byteStats: js.Array[Double]
    
    /**
      * whether input contains bytes larger that 0x7F (127)
      */
    val c1Bytes: Boolean
  }
  object InputStats {
    
    inline def apply(byteStats: js.Array[Double], c1Bytes: Boolean): InputStats = {
      val __obj = js.Dynamic.literal(byteStats = byteStats.asInstanceOf[js.Any], c1Bytes = c1Bytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputStats]
    }
    
    extension [Self <: InputStats](x: Self) {
      
      inline def setByteStats(value: js.Array[Double]): Self = StObject.set(x, "byteStats", value.asInstanceOf[js.Any])
      
      inline def setByteStatsVarargs(value: Double*): Self = StObject.set(x, "byteStats", js.Array(value*))
      
      inline def setC1Bytes(value: Boolean): Self = StObject.set(x, "c1Bytes", value.asInstanceOf[js.Any])
    }
  }
}
