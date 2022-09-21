package typings.cborg

import typings.cborg.interfaceMod.OptionalTypeEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cborg/types/cborg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cborg/types/cborg", "Token")
  @js.native
  open class Token protected ()
    extends typings.cborg.tokenMod.Token {
    /**
      * @param {Type} type
      * @param {any} [value]
      * @param {number} [encodedLength]
      */
    def this(`type`: typings.cborg.tokenMod.Type) = this()
    def this(`type`: typings.cborg.tokenMod.Type, value: Any) = this()
    def this(`type`: typings.cborg.tokenMod.Type, value: Any, encodedLength: Double) = this()
    def this(`type`: typings.cborg.tokenMod.Type, value: Unit, encodedLength: Double) = this()
  }
  
  @JSImport("cborg/types/cborg", "Type")
  @js.native
  open class Type protected ()
    extends typings.cborg.tokenMod.Type {
    /**
      * @param {number} major
      * @param {string} name
      * @param {boolean} terminal
      */
    def this(major: Double, name: String, terminal: Boolean) = this()
  }
  object Type {
    
    @JSImport("cborg/types/cborg", "Type.array")
    @js.native
    val array: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type._break")
    @js.native
    val break: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.bytes")
    @js.native
    val bytes: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type._false")
    @js.native
    val `false`: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.float")
    @js.native
    val float: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.map")
    @js.native
    val map: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.negint")
    @js.native
    val negint: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type._null")
    @js.native
    val `null`: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.string")
    @js.native
    val string: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.tag")
    @js.native
    val tag: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type._true")
    @js.native
    val `true`: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.uint")
    @js.native
    val uint: typings.cborg.tokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.undefined")
    @js.native
    val undefined: typings.cborg.tokenMod.Type = js.native
  }
  
  inline def decode(data: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(data: js.typedarray.Uint8Array, options: typings.cborg.interfaceMod.DecodeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encode(data: Any): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encode(data: Any, options: typings.cborg.interfaceMod.EncodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  type DecodeOptions = typings.cborg.interfaceMod.DecodeOptions
  
  type EncodeOptions = typings.cborg.interfaceMod.EncodeOptions
  
  type TagDecoder = typings.cborg.interfaceMod.TagDecoder
  
  type TypeEncoder = OptionalTypeEncoder
}
