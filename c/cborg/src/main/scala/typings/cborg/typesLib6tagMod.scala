package typings.cborg

import typings.cborg.typesLibTokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLib6tagMod {
  
  @JSImport("cborg/types/lib/6tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeTag16(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeTag16")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeTag32(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeTag32")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeTag64(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeTag64")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeTag8(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeTag8")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeTagCompact(_data: js.typedarray.Uint8Array, _pos: Double, minor: Double, _options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeTagCompact")(_data.asInstanceOf[js.Any], _pos.asInstanceOf[js.Any], minor.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  object encodeTag {
    
    inline def apply(buf: Bl, token: Token): Unit = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("cborg/types/lib/6tag", "encodeTag")
    @js.native
    val ^ : js.Any = js.native
    
    inline def compareTokens(tok1: Token, tok2: Token): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareTokens")(tok1.asInstanceOf[js.Any], tok2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * @param {Token} token
      * @returns {number}
      */
    inline def encodedSize(token: Token): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodedSize")(token.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  type Bl = typings.cborg.typesLibBlMod.Bl
  
  type DecodeOptions = typings.cborg.typesInterfaceMod.DecodeOptions
}
