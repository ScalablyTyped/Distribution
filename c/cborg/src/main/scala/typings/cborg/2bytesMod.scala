package typings.cborg

import typings.cborg.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `2bytesMod` {
  
  @JSImport("cborg/types/lib/2bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareBytes(b1: js.typedarray.Uint8Array, b2: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareBytes")(b1.asInstanceOf[js.Any], b2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def decodeBytes16(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBytes16")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeBytes32(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBytes32")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeBytes64(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBytes64")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeBytes8(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBytes8")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeBytesCompact(data: js.typedarray.Uint8Array, pos: Double, minor: Double, _options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeBytesCompact")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], minor.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  object encodeBytes {
    
    inline def apply(buf: Bl, token: Token): Unit = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("cborg/types/lib/2bytes", "encodeBytes")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {Token} tok1
      * @param {Token} tok2
      * @returns {number}
      */
    inline def compareTokens(tok1: Token, tok2: Token): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTokens")(tok1.asInstanceOf[js.Any], tok2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * @param {Token} token
      * @returns {number}
      */
    inline def encodedSize(token: Token): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodedSize")(token.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  type Bl = typings.cborg.blMod.Bl
  
  type DecodeOptions = typings.cborg.interfaceMod.DecodeOptions
}
