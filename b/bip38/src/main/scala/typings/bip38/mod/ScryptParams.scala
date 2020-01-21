package typings.bip38.mod

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
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScryptParams]
  }
}

