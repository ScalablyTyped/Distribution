package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSDeclareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSDeclareFunction_
  extends Declaration
     with BaseNode
     with Statement {
  
  var async: Boolean = js.native
  
  var declare: Boolean | Null = js.native
  
  var generator: Boolean = js.native
  
  var id: Identifier_ | Null = js.native
  
  var params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_] = js.native
  
  var returnType: TSTypeAnnotation_ | Noop_ | Null = js.native
  
  var typeParameters: TSTypeParameterDeclaration_ | Noop_ | Null = js.native
  
  @JSName("type")
  var type_TSDeclareFunction_ : TSDeclareFunction = js.native
}
object TSDeclareFunction_ {
  
  @scala.inline
  def apply(
    async: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: TSDeclareFunction
  ): TSDeclareFunction_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSDeclareFunction_]
  }
  
  @scala.inline
  implicit class TSDeclareFunction_Ops[Self <: TSDeclareFunction_] (val x: Self) extends AnyVal {
    
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
    def setGenerator(value: Boolean): Self = this.set("generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: (Identifier_ | Pattern | RestElement_ | TSParameterProperty_)*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSDeclareFunction): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclare(value: Boolean): Self = this.set("declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = this.set("declare", null)
    
    @scala.inline
    def setId(value: Identifier_): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setReturnType(value: TSTypeAnnotation_ | Noop_): Self = this.set("returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypeNull: Self = this.set("returnType", null)
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclaration_ | Noop_): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}
