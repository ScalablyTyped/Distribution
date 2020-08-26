package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.WithStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait WithStatement_
  extends Statement
     with BaseNode {
  var body: Statement = js.native
  var `object`: Expression = js.native
  @JSName("type")
  var type_WithStatement_ : WithStatement = js.native
}

object WithStatement_ {
  @scala.inline
  def apply(body: Statement, `object`: Expression, `type`: WithStatement): WithStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStatement_]
  }
  @scala.inline
  implicit class WithStatement_Ops[Self <: WithStatement_] (val x: Self) extends AnyVal {
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
    def setObject(value: Expression): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: WithStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

