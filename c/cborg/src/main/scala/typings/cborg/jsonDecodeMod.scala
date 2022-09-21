package typings.cborg

import typings.cborg.tokenMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsonDecodeMod {
  
  @JSImport("cborg/types/lib/json/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cborg/types/lib/json/decode", "Tokenizer")
  @js.native
  open class Tokenizer protected ()
    extends StObject
       with typings.cborg.interfaceMod.DecodeTokenizer {
    /**
      * @param {Uint8Array} data
      * @param {DecodeOptions} options
      */
    def this(data: js.typedarray.Uint8Array) = this()
    def this(data: js.typedarray.Uint8Array, options: DecodeOptions) = this()
    
    /**
      * @returns {number}
      */
    def ch(): Double = js.native
    
    /**
      * @returns {string}
      */
    def currentMode(): String = js.native
    
    var data: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    override def done(): Boolean = js.native
    
    /**
      * @param {number[]} str
      */
    def expect(str: js.Array[Double]): Unit = js.native
    
    var lastToken: String = js.native
    
    /** @type {string[]} */
    var modeStack: js.Array[String] = js.native
    
    /* CompleteClass */
    override def next(): Token = js.native
    
    var options: typings.cborg.interfaceMod.DecodeOptions = js.native
    
    def parseNumber(): Token = js.native
    
    /**
      * @returns {Token}
      */
    def parseString(): Token = js.native
    
    /**
      * @returns {Token}
      */
    def parseValue(): Token = js.native
    
    var pos: Double = js.native
    
    def skipWhitespace(): Unit = js.native
  }
  
  inline def decode(data: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(data: js.typedarray.Uint8Array, options: typings.cborg.interfaceMod.DecodeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type DecodeOptions = typings.cborg.interfaceMod.DecodeOptions
  
  type DecodeTokenizer = typings.cborg.interfaceMod.DecodeTokenizer
}
