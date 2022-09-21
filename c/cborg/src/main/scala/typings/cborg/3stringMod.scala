package typings.cborg

import typings.cborg.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `3stringMod` {
  
  @JSImport("cborg/types/lib/3string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeString16(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeString16")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeString32(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeString32")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeString64(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeString64")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeString8(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeString8")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeStringCompact(data: js.typedarray.Uint8Array, pos: Double, minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeStringCompact")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  object encodeString {
    
    inline def apply(buf: typings.cborg.`2bytesMod`.Bl, token: Token): Unit = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("cborg/types/lib/3string", "encodeString")
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
