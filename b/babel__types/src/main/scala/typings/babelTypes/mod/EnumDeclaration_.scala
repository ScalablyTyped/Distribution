package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.EnumDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait EnumDeclaration_
  extends Declaration
     with BaseNode
     with Statement {
  var body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_ = js.native
  var id: Identifier_ = js.native
  @JSName("type")
  var type_EnumDeclaration_ : EnumDeclaration = js.native
}

object EnumDeclaration_ {
  @scala.inline
  def apply(
    body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_,
    id: Identifier_,
    `type`: EnumDeclaration
  ): EnumDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumDeclaration_]
  }
  @scala.inline
  implicit class EnumDeclaration_Ops[Self <: EnumDeclaration_] (val x: Self) extends AnyVal {
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
    def setBody(value: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: EnumDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

