package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.PipelineTopicExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `102` extends js.Object {
  var `type`: PipelineTopicExpression = js.native
}

object `102` {
  @scala.inline
  def apply(`type`: PipelineTopicExpression): `102` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`102`]
  }
  @scala.inline
  implicit class `102Ops`[Self <: `102`] (val x: Self) extends AnyVal {
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
    def setType(value: PipelineTopicExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

