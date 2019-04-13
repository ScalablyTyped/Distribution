package typings
package cryptoDashJsLib.cryptoDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  def create(): js.Any
}

object Base {
  @scala.inline
  def apply(create: () => js.Any): Base = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction0(create))
  
    __obj.asInstanceOf[Base]
  }
}

