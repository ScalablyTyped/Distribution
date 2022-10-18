package typings.cborg

import typings.cborg.typesLibTokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLib0uintMod {
  
  @JSImport("cborg/types/lib/0uint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeUint16(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUint16")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeUint32(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUint32")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeUint64(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUint64")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  inline def decodeUint8(data: js.typedarray.Uint8Array, pos: Double, _minor: Double, options: DecodeOptions): Token = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeUint8")(data.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], _minor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Token]
  
  object encodeUint {
    
    inline def apply(buf: Bl, token: Token): Unit = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("cborg/types/lib/0uint", "encodeUint")
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
  
  object encodeUintValue {
    
    inline def apply(buf: Bl, major: Double, uint: js.BigInt): Unit = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], major.asInstanceOf[js.Any], uint.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(buf: Bl, major: Double, uint: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(buf.asInstanceOf[js.Any], major.asInstanceOf[js.Any], uint.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("cborg/types/lib/0uint", "encodeUintValue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {number} uint
      * @returns {number}
      */
    inline def encodedSize(uint: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("encodedSize")(uint.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  inline def readUint16(data: js.typedarray.Uint8Array, offset: Double, options: DecodeOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUint16")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readUint32(data: js.typedarray.Uint8Array, offset: Double, options: DecodeOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUint32")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readUint64(data: js.typedarray.Uint8Array, offset: Double, options: DecodeOptions): Double | js.BigInt = (^.asInstanceOf[js.Dynamic].applyDynamic("readUint64")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double | js.BigInt]
  
  inline def readUint8(data: js.typedarray.Uint8Array, offset: Double, options: DecodeOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUint8")(data.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("cborg/types/lib/0uint", "uintBoundaries")
  @js.native
  val uintBoundaries: js.Array[Double | js.BigInt] = js.native
  
  type Bl = typings.cborg.typesLibBlMod.Bl
  
  type DecodeOptions = typings.cborg.typesInterfaceMod.DecodeOptions
}
