package typings.babelTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PreserveComments extends js.Object {
  var preserveComments: Boolean = js.native
}

object PreserveComments {
  @scala.inline
  def apply(preserveComments: Boolean): PreserveComments = {
    val __obj = js.Dynamic.literal(preserveComments = preserveComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveComments]
  }
  @scala.inline
  implicit class PreserveCommentsOps[Self <: PreserveComments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreserveComments(value: Boolean): Self = this.set("preserveComments", value.asInstanceOf[js.Any])
  }
  
}

