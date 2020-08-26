package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSEnumMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSEnumMember_
  extends BaseNode
     with _Node {
  var id: Identifier_ | StringLiteral_ = js.native
  var initializer: Expression | Null = js.native
  @JSName("type")
  var type_TSEnumMember_ : TSEnumMember = js.native
}

object TSEnumMember_ {
  @scala.inline
  def apply(id: Identifier_ | StringLiteral_, `type`: TSEnumMember): TSEnumMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEnumMember_]
  }
  @scala.inline
  implicit class TSEnumMember_Ops[Self <: TSEnumMember_] (val x: Self) extends AnyVal {
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
    def setId(value: Identifier_ | StringLiteral_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TSEnumMember): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitializer(value: Expression): Self = this.set("initializer", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitializerNull: Self = this.set("initializer", null)
  }
  
}

