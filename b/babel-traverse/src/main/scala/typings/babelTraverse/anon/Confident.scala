package typings.babelTraverse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Confident extends js.Object {
  var confident: Boolean
  var value: js.Any
}

object Confident {
  @scala.inline
  def apply(confident: Boolean, value: js.Any): Confident = {
    val __obj = js.Dynamic.literal(confident = confident.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confident]
  }
}

