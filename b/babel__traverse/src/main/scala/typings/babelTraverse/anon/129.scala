package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.InferredPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `129` extends js.Object {
  var `type`: InferredPredicate = js.native
}

object `129` {
  @scala.inline
  def apply(`type`: InferredPredicate): `129` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`129`]
  }
  @scala.inline
  implicit class `129Ops`[Self <: `129`] (val x: Self) extends AnyVal {
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
    def setType(value: InferredPredicate): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

