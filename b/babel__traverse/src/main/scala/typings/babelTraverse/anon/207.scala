package typings.babelTraverse.anon

import typings.babelTraverse.babelTraverseStrings.IntersectionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `207` extends js.Object {
  var `type`: IntersectionTypeAnnotation = js.native
}

object `207` {
  @scala.inline
  def apply(`type`: IntersectionTypeAnnotation): `207` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`207`]
  }
  @scala.inline
  implicit class `207Ops`[Self <: `207`] (val x: Self) extends AnyVal {
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
    def setType(value: IntersectionTypeAnnotation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

