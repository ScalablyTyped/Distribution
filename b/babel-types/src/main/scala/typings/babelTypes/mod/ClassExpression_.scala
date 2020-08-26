package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassExpression_
  extends Node
     with Class
     with Expression
     with Pureish
     with Scopable {
  var body: ClassBody_ = js.native
  var decorators: js.UndefOr[js.Array[Decorator_]] = js.native
  var id: Identifier_ = js.native
  var implements: js.UndefOr[js.Array[ClassImplements_]] = js.native
  var mixins: js.UndefOr[js.Array[_]] = js.native
  var superClass: Expression = js.native
  var superTypeParameters: js.UndefOr[TypeParameterInstantiation_] = js.native
  var typeParameters: js.UndefOr[TypeParameterDeclaration_] = js.native
  @JSName("type")
  var type_ClassExpression_ : ClassExpression = js.native
}

object ClassExpression_ {
  @scala.inline
  def apply(
    body: ClassBody_,
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    superClass: Expression,
    `type`: ClassExpression
  ): ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassExpression_]
  }
  @scala.inline
  implicit class ClassExpression_Ops[Self <: ClassExpression_] (val x: Self) extends AnyVal {
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
    def setBody(value: ClassBody_): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuperClass(value: Expression): Self = this.set("superClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ClassExpression): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = this.set("decorators", js.Array(value :_*))
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    @scala.inline
    def setImplementsVarargs(value: ClassImplements_ *): Self = this.set("implements", js.Array(value :_*))
    @scala.inline
    def setImplements(value: js.Array[ClassImplements_]): Self = this.set("implements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplements: Self = this.set("implements", js.undefined)
    @scala.inline
    def setMixinsVarargs(value: js.Any*): Self = this.set("mixins", js.Array(value :_*))
    @scala.inline
    def setMixins(value: js.Array[_]): Self = this.set("mixins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixins: Self = this.set("mixins", js.undefined)
    @scala.inline
    def setSuperTypeParameters(value: TypeParameterInstantiation_): Self = this.set("superTypeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuperTypeParameters: Self = this.set("superTypeParameters", js.undefined)
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeParameters: Self = this.set("typeParameters", js.undefined)
  }
  
}

