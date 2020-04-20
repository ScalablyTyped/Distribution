package typings.bitcoinjsLib.addressMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bech32Result extends js.Object {
  var data: Buffer
  var prefix: String
  var version: Double
}

object Bech32Result {
  @scala.inline
  def apply(data: Buffer, prefix: String, version: Double): Bech32Result = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bech32Result]
  }
}

