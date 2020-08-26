package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.TSExpressionWithTypeArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `142` extends js.Object {
  var `type`: TSExpressionWithTypeArguments = js.native
}

object `142` {
  @scala.inline
  def apply(`type`: TSExpressionWithTypeArguments): `142` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`142`]
  }
  @scala.inline
  implicit class `142Ops`[Self <: `142`] (val x: Self) extends AnyVal {
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
    def setType(value: TSExpressionWithTypeArguments): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

