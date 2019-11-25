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
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MPrime]
  }
}

