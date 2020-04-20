package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpress extends js.Object {
  def express(): js.Any
}

object AnonExpress {
  @scala.inline
  def apply(express: () => js.Any): AnonExpress = {
    val __obj = js.Dynamic.literal(express = js.Any.fromFunction0(express))
    __obj.asInstanceOf[AnonExpress]
  }
}

