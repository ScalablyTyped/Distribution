package typings.babelTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreserveComments extends js.Object {
  var preserveComments: Boolean
}

object PreserveComments {
  @scala.inline
  def apply(preserveComments: Boolean): PreserveComments = {
    val __obj = js.Dynamic.literal(preserveComments = preserveComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveComments]
  }
}

