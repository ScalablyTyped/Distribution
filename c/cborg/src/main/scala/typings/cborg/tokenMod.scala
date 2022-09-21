package typings.cborg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenMod {
  
  @JSImport("cborg/types/lib/token", "Token")
  @js.native
  open class Token protected () extends StObject {
    /**
      * @param {Type} type
      * @param {any} [value]
      * @param {number} [encodedLength]
      */
    def this(`type`: Type) = this()
    def this(`type`: Type, value: Any) = this()
    def this(`type`: Type, value: Any, encodedLength: Double) = this()
    def this(`type`: Type, value: Unit, encodedLength: Double) = this()
    
    /** @type {Uint8Array|undefined} */
    var byteValue: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    /** @type {Uint8Array|undefined} */
    var encodedBytes: js.UndefOr[js.typedarray.Uint8Array] = js.native
    
    var encodedLength: js.UndefOr[Double] = js.native
    
    var `type`: Type = js.native
    
    var value: Any = js.native
  }
  
  @JSImport("cborg/types/lib/token", "Type")
  @js.native
  open class Type protected () extends StObject {
    /**
      * @param {number} major
      * @param {string} name
      * @param {boolean} terminal
      */
    def this(major: Double, name: String, terminal: Boolean) = this()
    
    /**
      * @param {Type} typ
      * @returns {number}
      */
    def compare(typ: Type): Double = js.native
    
    var major: Double = js.native
    
    var majorEncoded: Double = js.native
    
    var name: String = js.native
    
    var terminal: Boolean = js.native
  }
  object Type {
    
    @JSImport("cborg/types/lib/token", "Type.array")
    @js.native
    val array: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type._break")
    @js.native
    val break: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type.bytes")
    @js.native
    val bytes: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type._false")
    @js.native
    val `false`: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type.float")
    @js.native
    val float: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type.map")
    @js.native
    val map: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type.negint")
    @js.native
    val negint: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type._null")
    @js.native
    val `null`: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type.string")
    @js.native
    val string: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type.tag")
    @js.native
    val tag: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type._true")
    @js.native
    val `true`: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type.uint")
    @js.native
    val uint: Type = js.native
    
    @JSImport("cborg/types/lib/token", "Type.undefined")
    @js.native
    val undefined: Type = js.native
  }
}
