package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Declaration
  extends CssNodeCommon
     with CssNode {
  var important: Boolean | String = js.native
  var property: String = js.native
  @JSName("type")
  var type_Declaration: typings.cssTree.cssTreeStrings.Declaration = js.native
  var value: Value | Raw = js.native
}

object Declaration {
  @scala.inline
  def apply(
    important: Boolean | String,
    property: String,
    `type`: typings.cssTree.cssTreeStrings.Declaration,
    value: Value | Raw
  ): Declaration = {
    val __obj = js.Dynamic.literal(important = important.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Declaration]
  }
  @scala.inline
  implicit class DeclarationOps[Self <: Declaration] (val x: Self) extends AnyVal {
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
    def setImportant(value: Boolean | String): Self = this.set("important", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Declaration): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Value | Raw): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

