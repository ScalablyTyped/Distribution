package typings.awsSdkEventstreamMarshaller

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/eventstream-marshaller/dist/cjs/Int64", JSImport.Namespace)
@js.native
object int64Mod extends js.Object {
  
  @js.native
  class Int64 protected ()
    extends typings.awsSdkTypes.eventStreamMod.Int64 {
    def this(bytes: Uint8Array) = this()
  }
  /* static members */
  @js.native
  object Int64 extends js.Object {
    
    def fromNumber(number: Double): Int64 = js.native
  }
}
