package typings.co

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNextAnonDoneFalse extends js.Object {
  def next(): AnonDoneFalse
}

object AnonNextAnonDoneFalse {
  @scala.inline
  def apply(next: () => AnonDoneFalse): AnonNextAnonDoneFalse = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
  
    __obj.asInstanceOf[AnonNextAnonDoneFalse]
  }
}

