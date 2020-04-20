package typings.co

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  def next(): AnonDone
}

object AnonNext {
  @scala.inline
  def apply(next: () => AnonDone): AnonNext = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[AnonNext]
  }
}

