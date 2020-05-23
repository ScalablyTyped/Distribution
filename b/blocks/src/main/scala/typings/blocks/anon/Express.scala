package typings.blocks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Express extends js.Object {
  def express(): js.Any
}

object Express {
  @scala.inline
  def apply(express: () => js.Any): Express = {
    val __obj = js.Dynamic.literal(express = js.Any.fromFunction0(express))
    __obj.asInstanceOf[Express]
  }
}

