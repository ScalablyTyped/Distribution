package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CDO
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_CDO: typings.cssTree.cssTreeStrings.CDO = js.native
}

object CDO {
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.CDO): CDO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDO]
  }
  @scala.inline
  implicit class CDOOps[Self <: CDO] (val x: Self) extends AnyVal {
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
    def setType(value: typings.cssTree.cssTreeStrings.CDO): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

