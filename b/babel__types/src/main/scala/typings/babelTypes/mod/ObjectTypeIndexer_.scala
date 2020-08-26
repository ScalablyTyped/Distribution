package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeIndexer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ObjectTypeIndexer_
  extends Flow
     with BaseNode
     with UserWhitespacable {
  var id: Identifier_ | Null = js.native
  var key: FlowType = js.native
  var static: Boolean = js.native
  @JSName("type")
  var type_ObjectTypeIndexer_ : ObjectTypeIndexer = js.native
  var value: FlowType = js.native
  var variance: Variance_ | Null = js.native
}

object ObjectTypeIndexer_ {
  @scala.inline
  def apply(key: FlowType, static: Boolean, `type`: ObjectTypeIndexer, value: FlowType): ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeIndexer_]
  }
  @scala.inline
  implicit class ObjectTypeIndexer_Ops[Self <: ObjectTypeIndexer_] (val x: Self) extends AnyVal {
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
    def setKey(value: FlowType): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ObjectTypeIndexer): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: FlowType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setVariance(value: Variance_): Self = this.set("variance", value.asInstanceOf[js.Any])
    @scala.inline
    def setVarianceNull: Self = this.set("variance", null)
  }
  
}

