package typings.brorand.brorandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait rand extends js.Object {
  def getByte(): Double
}

object rand {
  @scala.inline
  def apply(getByte: () => Double): rand = {
    val __obj = js.Dynamic.literal(getByte = js.Any.fromFunction0(getByte))
  
    __obj.asInstanceOf[rand]
  }
}

