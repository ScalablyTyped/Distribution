package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DoExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait DoExpression_
  extends Expression
     with BaseNode {
  var body: BlockStatement_ = js.native
  @JSName("type")
  var type_DoExpression_ : DoExpression = js.native
}

object DoExpression_ {
  @scala.inline
  def apply(body: BlockStatement_, `type`: DoExpression): DoExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoExpression_]
  }
  @scala.inline
  implicit class DoExpression_Ops[Self <: DoExpression_] (val x: Self) extends AnyVal {
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
    def setBody(value: BlockStatement_): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DoExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

