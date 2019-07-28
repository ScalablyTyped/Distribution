package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Express extends js.Object {
  def express(): js.Any
}

object Anon_Express {
  @scala.inline
  def apply(express: () => js.Any): Anon_Express = {
    val __obj = js.Dynamic.literal(express = js.Any.fromFunction0(express))
  
    __obj.asInstanceOf[Anon_Express]
  }
}

