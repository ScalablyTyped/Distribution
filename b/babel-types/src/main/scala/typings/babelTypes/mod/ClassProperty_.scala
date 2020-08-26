package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassProperty_
  extends Node
     with Flow
     with Property {
  var decorators: js.UndefOr[js.Array[Decorator_]] = js.native
  var key: Identifier_ = js.native
  var typeAnnotation: js.UndefOr[TypeAnnotation_] = js.native
  @JSName("type")
  var type_ClassProperty_ : ClassProperty = js.native
  var value: Expression = js.native
}

object ClassProperty_ {
  @scala.inline
  def apply(
    end: Double,
    key: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ClassProperty,
    value: Expression
  ): ClassProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
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
    def setKey(value: Identifier_): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ClassProperty): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Expression): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = this.set("decorators", js.Array(value :_*))
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAnnotation: Self = this.set("typeAnnotation", js.undefined)
  }
  
}

