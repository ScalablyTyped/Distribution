package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.FunctionDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionDeclaration_
  extends Node
     with BlockParent
     with Declaration
     with Function
     with FunctionParent
     with Pureish
     with Scopable
     with Statement {
  
  var async: Boolean = js.native
  
  var body: BlockStatement_ = js.native
  
  var generator: Boolean = js.native
  
  var id: Identifier_ = js.native
  
  var params: js.Array[LVal] = js.native
  
  var returnType: js.UndefOr[TypeAnnotation_] = js.native
  
  var typeParameters: js.UndefOr[TypeParameterDeclaration_] = js.native
  
  @JSName("type")
  var type_FunctionDeclaration_ : FunctionDeclaration = js.native
}
object FunctionDeclaration_ {
  
  @scala.inline
  def apply(
    async: Boolean,
    body: BlockStatement_,
    end: Double,
    generator: Boolean,
    id: Identifier_,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double,
    `type`: FunctionDeclaration
  ): FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDeclaration_]
  }
  
  @scala.inline
  implicit class FunctionDeclaration_MutableBuilder[Self <: FunctionDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: BlockStatement_): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: js.Array[LVal]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: LVal*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: TypeAnnotation_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    @scala.inline
    def setType(value: FunctionDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
