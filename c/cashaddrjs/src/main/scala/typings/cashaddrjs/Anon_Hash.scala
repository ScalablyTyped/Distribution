package typings.cashaddrjs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: Uint8Array
  var prefix: String
  var `type`: String
}

object Anon_Hash {
  @scala.inline
  def apply(hash: Uint8Array, prefix: String, `type`: String): Anon_Hash = {
    val __obj = js.Dynamic.literal(hash = hash, prefix = prefix)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Hash]
  }
}

