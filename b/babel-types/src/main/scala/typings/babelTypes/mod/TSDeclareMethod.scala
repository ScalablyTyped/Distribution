package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method
import typings.babelTypes.babelTypesStrings.public
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSDeclareMethod
  extends StObject
     with Node {
  
  var `abstract`: Boolean | Null
  
  var access: public | `private` | `protected` | Null
  
  var accessibility: public | `private` | `protected` | Null
  
  var async: Boolean
  
  var computed: Boolean
  
  var decorators: js.Array[Decorator_] | Null
  
  var generator: Boolean
  
  var key: Expression
  
  var kind: get | set | method | constructor
  
  var optional: Boolean | Null
  
  var params: js.Array[LVal]
  
  var returnType: TypeAnnotation_ | TSTypeAnnotation | Noop_ | Null
  
  var static: Boolean | Null
  
  var typeParameters: TypeParameterDeclaration_ | Noop_ | Null
  
  @JSName("type")
  var type_TSDeclareMethod: typings.babelTypes.babelTypesStrings.TSDeclareMethod
}
object TSDeclareMethod {
  
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: js.Array[Decorator_], key: Expression, typeParameters: Null, params: js.Array[LVal]): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: js.Array[Decorator_], key: Expression, typeParameters: Unit, params: js.Array[LVal]): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Unit,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Unit,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Unit,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: js.Array[Decorator_], key: Expression, typeParameters: Noop_, params: js.Array[LVal]): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: js.Array[Decorator_],
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: Null, key: Expression, typeParameters: Null, params: js.Array[LVal]): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: Null, key: Expression, typeParameters: Null, params: js.Array[LVal], returnType: Noop_): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: Null, key: Expression, typeParameters: Unit, params: js.Array[LVal]): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: Null, key: Expression, typeParameters: Unit, params: js.Array[LVal], returnType: Noop_): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Unit,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Unit,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: Null, key: Expression, typeParameters: Noop_, params: js.Array[LVal]): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Null,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: Unit, key: Expression, typeParameters: Null, params: js.Array[LVal]): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: Unit, key: Expression, typeParameters: Null, params: js.Array[LVal], returnType: Noop_): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Unit,
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Unit,
    key: Expression,
    typeParameters: Null,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: Unit, key: Expression, typeParameters: Unit, params: js.Array[LVal]): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: Unit, key: Expression, typeParameters: Unit, params: js.Array[LVal], returnType: Noop_): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Unit,
    key: Expression,
    typeParameters: Unit,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Unit,
    key: Expression,
    typeParameters: Unit,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(decorators: Unit, key: Expression, typeParameters: Noop_, params: js.Array[LVal]): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Unit,
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Unit,
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Unit,
    key: Expression,
    typeParameters: Noop_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Unit,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal]
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Unit,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: Noop_
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Unit,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TSTypeAnnotation
  ): TSDeclareMethod = js.native
  @JSImport("babel-types", "TSDeclareMethod")
  @js.native
  def apply(
    decorators: Unit,
    key: Expression,
    typeParameters: TypeParameterDeclaration_,
    params: js.Array[LVal],
    returnType: TypeAnnotation_
  ): TSDeclareMethod = js.native
  
  extension [Self <: TSDeclareMethod](x: Self) {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractNull: Self = StObject.set(x, "abstract", null)
    
    inline def setAccess(value: public | `private` | `protected`): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessNull: Self = StObject.set(x, "access", null)
    
    inline def setAccessibility(value: public | `private` | `protected`): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value*))
    
    inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: get | set | method | constructor): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setParams(value: js.Array[LVal]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: LVal*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturnType(value: TypeAnnotation_ | TSTypeAnnotation | Noop_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticNull: Self = StObject.set(x, "static", null)
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSDeclareMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclaration_ | Noop_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
