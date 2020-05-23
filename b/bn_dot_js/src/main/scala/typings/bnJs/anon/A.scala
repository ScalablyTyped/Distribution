package typings.bnJs.anon

import typings.bnJs.mod.BN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait A extends js.Object {
  var a: BN
  var b: BN
  var gcd: BN
}

object A {
  @scala.inline
  def apply(a: BN, b: BN, gcd: BN): A = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], gcd = gcd.asInstanceOf[js.Any])
    __obj.asInstanceOf[A]
  }
}

