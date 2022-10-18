package typings.chainsafeLibp2pNoise

import typings.chainsafeLibp2pNoise.distSrcHandshakeMod.MessageBuffer
import typings.itLengthPrefixed.mod.LengthDecoderFunction
import typings.itLengthPrefixed.mod.LengthEncoderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcEncoderMod {
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/encoder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decode0(input: js.typedarray.Uint8Array): MessageBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode0")(input.asInstanceOf[js.Any]).asInstanceOf[MessageBuffer]
  
  inline def decode1(input: js.typedarray.Uint8Array): MessageBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode1")(input.asInstanceOf[js.Any]).asInstanceOf[MessageBuffer]
  
  inline def decode2(input: js.typedarray.Uint8Array): MessageBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode2")(input.asInstanceOf[js.Any]).asInstanceOf[MessageBuffer]
  
  inline def encode0(message: MessageBuffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode0")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encode1(message: MessageBuffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode1")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def encode2(message: MessageBuffer): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode2")(message.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/encoder", "uint16BEDecode")
  @js.native
  val uint16BEDecode: LengthDecoderFunction = js.native
  
  @JSImport("@chainsafe/libp2p-noise/dist/src/encoder", "uint16BEEncode")
  @js.native
  val uint16BEEncode: LengthEncoderFunction = js.native
}
