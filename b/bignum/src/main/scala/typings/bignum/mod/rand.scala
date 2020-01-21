package typings.bignum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bignum", "rand")
@js.native
object rand extends js.Object {
  def apply(n: BigNumCompatible): BigNum = js.native
  def apply(n: BigNumCompatible, upperBound: BigNumCompatible): BigNum = js.native
}

