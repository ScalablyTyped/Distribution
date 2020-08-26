package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ObjectPattern_
  extends LVal
     with BaseNode
     with Pattern
     with PatternLike {
  var decorators: js.Array[Decorator_] | Null = js.native
  var properties: js.Array[RestElement_ | ObjectProperty_] = js.native
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null = js.native
  @JSName("type")
  var type_ObjectPattern_ : ObjectPattern = js.native
}

object ObjectPattern_ {
  @scala.inline
  def apply(properties: js.Array[RestElement_ | ObjectProperty_], `type`: ObjectPattern): ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern_]
  }
  @scala.inline
  implicit class ObjectPattern_Ops[Self <: ObjectPattern_] (val x: Self) extends AnyVal {
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
    def setPropertiesVarargs(value: (RestElement_ | ObjectProperty_)*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[RestElement_ | ObjectProperty_]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ObjectPattern): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = this.set("decorators", js.Array(value :_*))
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorsNull: Self = this.set("decorators", null)
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotationNull: Self = this.set("typeAnnotation", null)
  }
  
}

