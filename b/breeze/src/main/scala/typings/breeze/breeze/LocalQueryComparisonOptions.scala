package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalQueryComparisonOptions extends js.Object {
  def setAsDefault(): Unit
}

object LocalQueryComparisonOptions {
  @scala.inline
  def apply(setAsDefault: () => Unit): LocalQueryComparisonOptions = {
    val __obj = js.Dynamic.literal(setAsDefault = js.Any.fromFunction0(setAsDefault))
    __obj.asInstanceOf[LocalQueryComparisonOptions]
  }
}

