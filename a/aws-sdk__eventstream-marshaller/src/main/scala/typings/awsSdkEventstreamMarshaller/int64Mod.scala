package typings.awsSdkEventstreamMarshaller

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int64Mod {
  
  @JSImport("@aws-sdk/eventstream-marshaller/dist/cjs/Int64", "Int64")
  @js.native
  class Int64 protected ()
    extends typings.awsSdkTypes.eventStreamMod.Int64 {
    def this(bytes: Uint8Array) = this()
  }
  /* static members */
  object Int64 {
    
    @JSImport("@aws-sdk/eventstream-marshaller/dist/cjs/Int64", "Int64.fromNumber")
    @js.native
    def fromNumber(number: Double): Int64 = js.native
  }
}
