package typings.cashaddrjs

import typings.cashaddrjs.anon.Hash
import typings.std.Error
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cashaddrjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cashaddrjs", "ValidationError")
  @js.native
  class ValidationError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def decode(address: String): Hash = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(address.asInstanceOf[js.Any]).asInstanceOf[Hash]
  
  inline def encode(prefix: String, `type`: String, hash: Uint8Array): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(prefix.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[String]
}
