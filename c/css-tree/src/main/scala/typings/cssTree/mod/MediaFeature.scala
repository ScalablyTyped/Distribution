package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaFeature
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var name: String = js.native
  @JSName("type")
  var type_MediaFeature: typings.cssTree.cssTreeStrings.MediaFeature = js.native
  var value: Identifier | NumberNode | Dimension | Ratio | Null = js.native
}

object MediaFeature {
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.MediaFeature): MediaFeature = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaFeature]
  }
  @scala.inline
  implicit class MediaFeatureOps[Self <: MediaFeature] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.MediaFeature): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Identifier | NumberNode | Dimension | Ratio): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

