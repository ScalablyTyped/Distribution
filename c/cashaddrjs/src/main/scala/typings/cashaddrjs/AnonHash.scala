package typings.cashaddrjs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHash extends js.Object {
  var hash: Uint8Array
  var prefix: String
  var `type`: String
}

object AnonHash {
  @scala.inline
  def apply(hash: Uint8Array, prefix: String, `type`: String): AnonHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHash]
  }
}

