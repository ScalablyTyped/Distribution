package typings.beats.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bin extends js.Object {
  var decay: Double
  var hi: Double
  var lo: Double
  var threshold: Double
}

object Bin {
  @scala.inline
  def apply(decay: Double, hi: Double, lo: Double, threshold: Double): Bin = {
    val __obj = js.Dynamic.literal(decay = decay.asInstanceOf[js.Any], hi = hi.asInstanceOf[js.Any], lo = lo.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Bin]
  }
}

