package typings.bnDotJs

import typings.bnDotJs.bnDotJsMod.BN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A extends js.Object {
  var a: BN
  var b: BN
  var gcd: BN
}

object Anon_A {
  @scala.inline
  def apply(a: BN, b: BN, gcd: BN): Anon_A = {
    val __obj = js.Dynamic.literal(a = a, b = b, gcd = gcd)
  
    __obj.asInstanceOf[Anon_A]
  }
}

