package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSDeclareFunction
  extends StObject
     with Node
     with Declaration
     with Statement {
  
  var async: Boolean
  
  var declare: Boolean | Null
  
  var generator: Boolean
  
  var id: Identifier_ | Null
  
  var params: js.Array[LVal]
  
  var returnType: TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null
  
  var typeParameters: TypeParameterDeclaration_ | Noop_ | Null
  
  @JSName("type")
  var type_TSDeclareFunction: typings.babelTypes.babelTypesStrings.TSDeclareFunction
}
object TSDeclareFunction {
  
  @JSImport("babel-types/ts3.6", "TSDeclareFunction")
  @js.native
  def apply(
    id: js.UndefOr[Identifier_ | Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration_ | Noop_ | Null],
    params: js.Array[LVal],
    returnType: js.UndefOr[TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null]
  ): TSDeclareFunction = js.native
  
  @scala.inline
  implicit class TSDeclareFunctionMutableBuilder[Self <: TSDeclareFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    @scala.inline
    def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setParams(value: js.Array[LVal]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: LVal*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: TypeAnnotation_ | TSTypeAnnotation | Noop_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSDeclareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclaration_ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
