package typings
package bip38Lib.bip38Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScryptParams extends js.Object {
  var N: scala.Double
  var p: scala.Double
  var r: scala.Double
}

object ScryptParams {
  @scala.inline
  def apply(N: scala.Double, p: scala.Double, r: scala.Double): ScryptParams = {
    val __obj = js.Dynamic.literal(N = N, p = p, r = r)
  
    __obj.asInstanceOf[ScryptParams]
  }
}

