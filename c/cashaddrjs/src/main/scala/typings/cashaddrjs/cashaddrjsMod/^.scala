package typings.cashaddrjs.cashaddrjsMod

import typings.cashaddrjs.Anon_Hash
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cashaddrjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(address: String): Anon_Hash = js.native
  def encode(prefix: String, `type`: String, hash: Uint8Array): String = js.native
}

