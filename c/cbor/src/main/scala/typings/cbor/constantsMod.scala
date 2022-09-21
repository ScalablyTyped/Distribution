package typings.cbor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("cbor/types/lib/constants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object BI {
    
    @JSImport("cbor/types/lib/constants", "BI.MAXINT32")
    @js.native
    val MAXINT32: js.BigInt = js.native
    
    @JSImport("cbor/types/lib/constants", "BI.MAXINT64")
    @js.native
    val MAXINT64: js.BigInt = js.native
    
    @JSImport("cbor/types/lib/constants", "BI.MINUS_ONE")
    @js.native
    val MINUS_ONE: js.BigInt = js.native
    
    @JSImport("cbor/types/lib/constants", "BI.NEG_MAX")
    @js.native
    val NEG_MAX: js.BigInt = js.native
    
    @JSImport("cbor/types/lib/constants", "BI.SHIFT32")
    @js.native
    val SHIFT32: js.BigInt = js.native
  }
  
  object MT {
    
    @JSImport("cbor/types/lib/constants", "MT.ARRAY")
    @js.native
    val ARRAY: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "MT.BYTE_STRING")
    @js.native
    val BYTE_STRING: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "MT.MAP")
    @js.native
    val MAP: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "MT.NEG_INT")
    @js.native
    val NEG_INT: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "MT.POS_INT")
    @js.native
    val POS_INT: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "MT.SIMPLE_FLOAT")
    @js.native
    val SIMPLE_FLOAT: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "MT.TAG")
    @js.native
    val TAG: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "MT.UTF8_STRING")
    @js.native
    val UTF8_STRING: Double = js.native
  }
  type MT = Double
  
  object NUMBYTES {
    
    @JSImport("cbor/types/lib/constants", "NUMBYTES.EIGHT")
    @js.native
    val EIGHT: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "NUMBYTES.FOUR")
    @js.native
    val FOUR: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "NUMBYTES.INDEFINITE")
    @js.native
    val INDEFINITE: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "NUMBYTES.ONE")
    @js.native
    val ONE: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "NUMBYTES.TWO")
    @js.native
    val TWO: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "NUMBYTES.ZERO")
    @js.native
    val ZERO: Double = js.native
  }
  type NUMBYTES = Double
  
  @JSImport("cbor/types/lib/constants", "SHIFT32")
  @js.native
  def SHIFT32: Double = js.native
  inline def SHIFT32_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHIFT32")(x.asInstanceOf[js.Any])
  
  object SIMPLE {
    
    @JSImport("cbor/types/lib/constants", "SIMPLE.FALSE")
    @js.native
    val FALSE: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "SIMPLE.NULL")
    @js.native
    val NULL: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "SIMPLE.TRUE")
    @js.native
    val TRUE: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "SIMPLE.UNDEFINED")
    @js.native
    val UNDEFINED: Double = js.native
  }
  type SIMPLE = Double
  
  object SYMS {
    
    @JSImport("cbor/types/lib/constants", "SYMS.BREAK")
    @js.native
    val BREAK: js.Symbol = js.native
    
    @JSImport("cbor/types/lib/constants", "SYMS.NULL_1")
    @js.native
    val NULL_1: js.Symbol = js.native
    
    @JSImport("cbor/types/lib/constants", "SYMS.PARENT")
    @js.native
    val PARENT: js.Symbol = js.native
    
    @JSImport("cbor/types/lib/constants", "SYMS.STREAM")
    @js.native
    val STREAM: js.Symbol = js.native
    
    @JSImport("cbor/types/lib/constants", "SYMS.UNDEFINED_1")
    @js.native
    val UNDEFINED_1: js.Symbol = js.native
  }
  
  object TAG {
    
    @JSImport("cbor/types/lib/constants", "TAG.BASE16_EXPECTED")
    @js.native
    val BASE16_EXPECTED: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.BASE64")
    @js.native
    val BASE64: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.BASE64URL")
    @js.native
    val BASE64URL: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.BASE64URL_EXPECTED")
    @js.native
    val BASE64URL_EXPECTED: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.BASE64_EXPECTED")
    @js.native
    val BASE64_EXPECTED: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.BIGFLOAT")
    @js.native
    val BIGFLOAT: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.CBOR")
    @js.native
    val CBOR: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.DATE_EPOCH")
    @js.native
    val DATE_EPOCH: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.DATE_STRING")
    @js.native
    val DATE_STRING: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.DECIMAL_FRAC")
    @js.native
    val DECIMAL_FRAC: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.MIME")
    @js.native
    val MIME: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.NEG_BIGINT")
    @js.native
    val NEG_BIGINT: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.POS_BIGINT")
    @js.native
    val POS_BIGINT: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.REGEXP")
    @js.native
    val REGEXP: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.SET")
    @js.native
    val SET: Double = js.native
    
    @JSImport("cbor/types/lib/constants", "TAG.URI")
    @js.native
    val URI: Double = js.native
  }
  type TAG = Double
}
