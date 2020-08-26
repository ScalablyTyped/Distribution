package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSMappedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSMappedType_
  extends TSType
     with BaseNode {
  var optional: Boolean | Null = js.native
  var readonly: Boolean | Null = js.native
  var typeAnnotation: TSType | Null = js.native
  var typeParameter: TSTypeParameter_ = js.native
  @JSName("type")
  var type_TSMappedType_ : TSMappedType = js.native
}

object TSMappedType_ {
  @scala.inline
  def apply(`type`: TSMappedType, typeParameter: TSTypeParameter_): TSMappedType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSMappedType_]
  }
  @scala.inline
  implicit class TSMappedType_Ops[Self <: TSMappedType_] (val x: Self) extends AnyVal {
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
    def setType(value: TSMappedType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeParameter(value: TSTypeParameter_): Self = this.set("typeParameter", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalNull: Self = this.set("optional", null)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadonlyNull: Self = this.set("readonly", null)
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotationNull: Self = this.set("typeAnnotation", null)
  }
  
}

