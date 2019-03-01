package typings
package bnDotJsLib.bnDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MPrime extends js.Object {
  var k: BN
  var n: scala.Double
  var name: java.lang.String
  var p: BN
}

object MPrime {
  @scala.inline
  def apply(k: BN, n: scala.Double, name: java.lang.String, p: BN): MPrime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("k")(k)
    __obj.updateDynamic("n")(n)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("p")(p)
    __obj.asInstanceOf[MPrime]
  }
}

