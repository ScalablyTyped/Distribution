package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.FunctionDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait FunctionDeclaration_
  extends BlockParent
     with BaseNode
     with Declaration
     with Function
     with FunctionParent
     with Pureish
     with Scopable
     with Statement {
  var async: Boolean = js.native
  var body: BlockStatement_ = js.native
  var declare: Boolean | Null = js.native
  var generator: Boolean = js.native
  var id: Identifier_ | Null = js.native
  var params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_] = js.native
  var returnType: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null = js.native
  var typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ | Null = js.native
  @JSName("type")
  var type_FunctionDeclaration_ : FunctionDeclaration = js.native
}

object FunctionDeclaration_ {
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: FunctionDeclaration
  ): FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration_]
  }
  @scala.inline
  implicit class FunctionDeclaration_Ops[Self <: FunctionDeclaration_] (val x: Self) extends AnyVal {
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: BlockStatement_): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerator(value: Boolean): Self = this.set("generator", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: (Identifier_ | Pattern | RestElement_ | TSParameterProperty_)*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: FunctionDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclare(value: Boolean): Self = this.set("declare", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclareNull: Self = this.set("declare", null)
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setReturnType(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnTypeNull: Self = this.set("returnType", null)
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
  
}

