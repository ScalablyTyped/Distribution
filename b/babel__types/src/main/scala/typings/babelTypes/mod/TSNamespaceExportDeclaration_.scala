package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSNamespaceExportDeclaration_
  extends Statement
     with BaseNode {
  var id: Identifier_ = js.native
  @JSName("type")
  var type_TSNamespaceExportDeclaration_ : TSNamespaceExportDeclaration = js.native
}

object TSNamespaceExportDeclaration_ {
  @scala.inline
  def apply(id: Identifier_, `type`: TSNamespaceExportDeclaration): TSNamespaceExportDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSNamespaceExportDeclaration_]
  }
  @scala.inline
  implicit class TSNamespaceExportDeclaration_Ops[Self <: TSNamespaceExportDeclaration_] (val x: Self) extends AnyVal {
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
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TSNamespaceExportDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

