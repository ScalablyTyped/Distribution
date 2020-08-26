package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.LabeledStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait LabeledStatement_
  extends Statement
     with BaseNode {
  var body: Statement = js.native
  var label: Identifier_ = js.native
  @JSName("type")
  var type_LabeledStatement_ : LabeledStatement = js.native
}

object LabeledStatement_ {
  @scala.inline
  def apply(body: Statement, label: Identifier_, `type`: LabeledStatement): LabeledStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabeledStatement_]
  }
  @scala.inline
  implicit class LabeledStatement_Ops[Self <: LabeledStatement_] (val x: Self) extends AnyVal {
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
    def setBody(value: Statement): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: Identifier_): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: LabeledStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

