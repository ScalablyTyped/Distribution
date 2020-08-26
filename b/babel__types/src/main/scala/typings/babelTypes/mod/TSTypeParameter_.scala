package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameter_
  extends BaseNode
     with _Node {
  var constraint: TSType | Null = js.native
  var default: TSType | Null = js.native
  var name: String = js.native
  @JSName("type")
  var type_TSTypeParameter_ : TSTypeParameter = js.native
}

object TSTypeParameter_ {
  @scala.inline
  def apply(name: String, `type`: TSTypeParameter): TSTypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeParameter_]
  }
  @scala.inline
  implicit class TSTypeParameter_Ops[Self <: TSTypeParameter_] (val x: Self) extends AnyVal {
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
    def setType(value: TSTypeParameter): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstraint(value: TSType): Self = this.set("constraint", value.asInstanceOf[js.Any])
    @scala.inline
    def setConstraintNull: Self = this.set("constraint", null)
    @scala.inline
    def setDefault(value: TSType): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
  }
  
}

