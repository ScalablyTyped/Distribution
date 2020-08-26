package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclaredPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait DeclaredPredicate_
  extends Flow
     with BaseNode
     with FlowPredicate {
  @JSName("type")
  var type_DeclaredPredicate_ : DeclaredPredicate = js.native
  var value: Flow = js.native
}

object DeclaredPredicate_ {
  @scala.inline
  def apply(`type`: DeclaredPredicate, value: Flow): DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclaredPredicate_]
  }
  @scala.inline
  implicit class DeclaredPredicate_Ops[Self <: DeclaredPredicate_] (val x: Self) extends AnyVal {
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
    def setType(value: DeclaredPredicate): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Flow): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

