package typings.cborg

import typings.cborg.interfaceMod.EncodeOptions
import typings.cborg.jsonDecodeMod.DecodeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonMod {
  
  @JSImport("cborg/types/lib/json/json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cborg/types/lib/json/json", "Tokenizer")
  @js.native
  open class Tokenizer protected ()
    extends typings.cborg.jsonDecodeMod.Tokenizer {
    /**
      * @param {Uint8Array} data
      * @param {DecodeOptions} options
      */
    def this(data: js.typedarray.Uint8Array) = this()
    def this(data: js.typedarray.Uint8Array, options: DecodeOptions) = this()
  }
  
  inline def decode(data: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(data: js.typedarray.Uint8Array, options: typings.cborg.interfaceMod.DecodeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encode(data: Any): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encode(data: Any, options: EncodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
