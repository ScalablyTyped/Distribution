package typings.cborg

import typings.cborg.typesInterfaceMod.OptionalTypeEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCborgMod {
  
  @JSImport("cborg/types/cborg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cborg/types/cborg", "Token")
  @js.native
  open class Token protected ()
    extends typings.cborg.typesLibTokenMod.Token {
    /**
      * @param {Type} type
      * @param {any} [value]
      * @param {number} [encodedLength]
      */
    def this(`type`: typings.cborg.typesLibTokenMod.Type) = this()
    def this(`type`: typings.cborg.typesLibTokenMod.Type, value: Any) = this()
    def this(`type`: typings.cborg.typesLibTokenMod.Type, value: Any, encodedLength: Double) = this()
    def this(`type`: typings.cborg.typesLibTokenMod.Type, value: Unit, encodedLength: Double) = this()
  }
  
  @JSImport("cborg/types/cborg", "Type")
  @js.native
  open class Type protected ()
    extends typings.cborg.typesLibTokenMod.Type {
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
    val array: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type._break")
    @js.native
    val break: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.bytes")
    @js.native
    val bytes: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type._false")
    @js.native
    val `false`: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.float")
    @js.native
    val float: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.map")
    @js.native
    val map: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.negint")
    @js.native
    val negint: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type._null")
    @js.native
    val `null`: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.string")
    @js.native
    val string: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.tag")
    @js.native
    val tag: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type._true")
    @js.native
    val `true`: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.uint")
    @js.native
    val uint: typings.cborg.typesLibTokenMod.Type = js.native
    
    @JSImport("cborg/types/cborg", "Type.undefined")
    @js.native
    val undefined: typings.cborg.typesLibTokenMod.Type = js.native
  }
  
  inline def decode(data: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def decode(data: js.typedarray.Uint8Array, options: typings.cborg.typesInterfaceMod.DecodeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def encode(data: Any): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def encode(data: Any, options: typings.cborg.typesInterfaceMod.EncodeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  type DecodeOptions = typings.cborg.typesInterfaceMod.DecodeOptions
  
  type EncodeOptions = typings.cborg.typesInterfaceMod.EncodeOptions
  
  type TagDecoder = typings.cborg.typesInterfaceMod.TagDecoder
  
  type TypeEncoder = OptionalTypeEncoder
}
