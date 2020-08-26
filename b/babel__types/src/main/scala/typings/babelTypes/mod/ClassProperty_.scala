package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassProperty
import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ClassProperty_
  extends Property
     with BaseNode {
  var `abstract`: Boolean | Null = js.native
  var accessibility: public | `private` | `protected` | Null = js.native
  var computed: Boolean = js.native
  var declare: Boolean | Null = js.native
  var decorators: js.Array[Decorator_] | Null = js.native
  var definite: Boolean | Null = js.native
  var key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression = js.native
  var optional: Boolean | Null = js.native
  var readonly: Boolean | Null = js.native
  var static: Boolean = js.native
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null = js.native
  @JSName("type")
  var type_ClassProperty_ : ClassProperty = js.native
  var value: Expression | Null = js.native
}

object ClassProperty_ {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    static: Boolean,
    `type`: ClassProperty
  ): ClassProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassProperty_]
  }
  @scala.inline
  implicit class ClassProperty_Ops[Self <: ClassProperty_] (val x: Self) extends AnyVal {
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
    def setComputed(value: Boolean): Self = this.set("computed", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ClassProperty): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbstract(value: Boolean): Self = this.set("abstract", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbstractNull: Self = this.set("abstract", null)
    @scala.inline
    def setAccessibility(value: public | `private` | `protected`): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibilityNull: Self = this.set("accessibility", null)
    @scala.inline
    def setDeclare(value: Boolean): Self = this.set("declare", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclareNull: Self = this.set("declare", null)
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = this.set("decorators", js.Array(value :_*))
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorsNull: Self = this.set("decorators", null)
    @scala.inline
    def setDefinite(value: Boolean): Self = this.set("definite", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefiniteNull: Self = this.set("definite", null)
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalNull: Self = this.set("optional", null)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadonlyNull: Self = this.set("readonly", null)
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotationNull: Self = this.set("typeAnnotation", null)
    @scala.inline
    def setValue(value: Expression): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
  
}

