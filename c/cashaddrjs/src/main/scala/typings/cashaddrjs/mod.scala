package typings.cashaddrjs

import typings.cashaddrjs.anon.Hash
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cashaddrjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(address: String): Hash = js.native
  
  def encode(prefix: String, `type`: String, hash: Uint8Array): String = js.native
  
  @js.native
  class ValidationError protected () extends Error {
    def this(message: String) = this()
  }
}
