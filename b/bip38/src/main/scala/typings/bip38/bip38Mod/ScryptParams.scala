package typings.bip38.bip38Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScryptParams extends js.Object {
  var N: Double
  var p: Double
  var r: Double
}

object ScryptParams {
  @scala.inline
  def apply(N: Double, p: Double, r: Double): ScryptParams = {
    val __obj = js.Dynamic.literal(N = N, p = p, r = r)
  
    __obj.asInstanceOf[ScryptParams]
  }
}

