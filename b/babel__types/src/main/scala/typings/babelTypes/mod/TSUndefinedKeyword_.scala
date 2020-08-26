package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSUndefinedKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSUndefinedKeyword_
  extends TSBaseType
     with BaseNode
     with TSType {
  @JSName("type")
  var type_TSUndefinedKeyword_ : TSUndefinedKeyword = js.native
}

object TSUndefinedKeyword_ {
  @scala.inline
  def apply(`type`: TSUndefinedKeyword): TSUndefinedKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSUndefinedKeyword_]
  }
  @scala.inline
  implicit class TSUndefinedKeyword_Ops[Self <: TSUndefinedKeyword_] (val x: Self) extends AnyVal {
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
    def setType(value: TSUndefinedKeyword): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

