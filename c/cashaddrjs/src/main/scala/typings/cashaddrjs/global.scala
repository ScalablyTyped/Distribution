package typings.cashaddrjs

import typings.cashaddrjs.anon.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object cashaddr {
    
    @JSGlobal("cashaddr")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("cashaddr.ValidationError")
    @js.native
    open class ValidationError protected ()
      extends typings.cashaddrjs.mod.ValidationError {
      def this(message: String) = this()
    }
    
    inline def decode(address: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(address.asInstanceOf[js.Any]).asInstanceOf[Hash]
    
    inline def encode(prefix: String, `type`: String, hash: js.typedarray.Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
