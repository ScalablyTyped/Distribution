package typings.babelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreserveComments extends js.Object {
  var preserveComments: Boolean
}

object AnonPreserveComments {
  @scala.inline
  def apply(preserveComments: Boolean): AnonPreserveComments = {
    val __obj = js.Dynamic.literal(preserveComments = preserveComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreserveComments]
  }
}

