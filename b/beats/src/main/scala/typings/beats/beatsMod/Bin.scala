package typings.beats.beatsMod

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
    val __obj = js.Dynamic.literal(decay = decay, hi = hi, lo = lo, threshold = threshold)
  
    __obj.asInstanceOf[Bin]
  }
}

