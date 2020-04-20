package typings.bitcoinjsLib.addressMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base58CheckResult extends js.Object {
  var hash: Buffer
  var version: Double
}

object Base58CheckResult {
  @scala.inline
  def apply(hash: Buffer, version: Double): Base58CheckResult = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base58CheckResult]
  }
}

