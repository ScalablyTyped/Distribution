package typings.bnDotJs.bnDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MPrime extends js.Object {
  var k: BN
  var n: Double
  var name: String
  var p: BN
}

object MPrime {
  @scala.inline
  def apply(k: BN, n: Double, name: String, p: BN): MPrime = {
    val __obj = js.Dynamic.literal(k = k, n = n, name = name, p = p)
  
    __obj.asInstanceOf[MPrime]
  }
}

