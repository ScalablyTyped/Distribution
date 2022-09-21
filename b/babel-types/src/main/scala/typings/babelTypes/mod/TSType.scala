package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.TSAnyKeyword
  - typings.babelTypes.mod.TSArrayType
  - typings.babelTypes.mod.TSBooleanKeyword
  - typings.babelTypes.mod.TSConstructorType
  - typings.babelTypes.mod.TSExpressionWithTypeArguments
  - typings.babelTypes.mod.TSFunctionType
  - typings.babelTypes.mod.TSIndexedAccessType
  - typings.babelTypes.mod.TSIntersectionType
  - typings.babelTypes.mod.TSLiteralType
  - typings.babelTypes.mod.TSMappedType
  - typings.babelTypes.mod.TSNeverKeyword
  - typings.babelTypes.mod.TSNullKeyword
  - typings.babelTypes.mod.TSNumberKeyword
  - typings.babelTypes.mod.TSObjectKeyword
  - typings.babelTypes.mod.TSParenthesizedType
  - typings.babelTypes.mod.TSStringKeyword
  - typings.babelTypes.mod.TSSymbolKeyword
  - typings.babelTypes.mod.TSThisType
  - typings.babelTypes.mod.TSTupleType
  - typings.babelTypes.mod.TSTypeLiteral
  - typings.babelTypes.mod.TSTypeOperator
  - typings.babelTypes.mod.TSTypePredicate
  - typings.babelTypes.mod.TSTypeQuery
  - typings.babelTypes.mod.TSTypeReference
  - typings.babelTypes.mod.TSUndefinedKeyword
  - typings.babelTypes.mod.TSUnionType
  - typings.babelTypes.mod.TSVoidKeyword
*/
trait TSType extends StObject
object TSType {
  
  inline def TSAnyKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSAnyKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSAnyKeyword]
  }
  
  inline def TSArrayType(elementType: TSType, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSArrayType]
  }
  
  inline def TSBooleanKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSBooleanKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSBooleanKeyword]
  }
  
  inline def TSConstructorType(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSConstructorType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSConstructorType]
  }
  
  inline def TSExpressionWithTypeArguments(end: Double, expression: TSEntityName, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = null)
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[typings.babelTypes.mod.TSExpressionWithTypeArguments]
  }
  
  inline def TSFunctionType(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSFunctionType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSFunctionType]
  }
  
  inline def TSIndexedAccessType(end: Double, indexType: TSType, loc: SourceLocation, objectType: TSType, start: Double): typings.babelTypes.mod.TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], indexType = indexType.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSIndexedAccessType]
  }
  
  inline def TSIntersectionType(end: Double, loc: SourceLocation, start: Double, types: js.Array[TSType]): typings.babelTypes.mod.TSIntersectionType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSIntersectionType]
  }
  
  inline def TSLiteralType(
    end: Double,
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_,
    loc: SourceLocation,
    start: Double
  ): typings.babelTypes.mod.TSLiteralType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], literal = literal.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSLiteralType]
  }
  
  inline def TSMappedType(end: Double, loc: SourceLocation, start: Double, typeParameter: TypeParameter_): typings.babelTypes.mod.TSMappedType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameter = typeParameter.asInstanceOf[js.Any], optional = null, readonly = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSMappedType]
  }
  
  inline def TSNeverKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSNeverKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNeverKeyword]
  }
  
  inline def TSNullKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSNullKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNullKeyword]
  }
  
  inline def TSNumberKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSNumberKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNumberKeyword]
  }
  
  inline def TSObjectKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSObjectKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSObjectKeyword]
  }
  
  inline def TSParenthesizedType(end: Double, loc: SourceLocation, start: Double, typeAnnotation: TSType): typings.babelTypes.mod.TSParenthesizedType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSParenthesizedType]
  }
  
  inline def TSStringKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSStringKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSStringKeyword]
  }
  
  inline def TSSymbolKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSSymbolKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSSymbolKeyword]
  }
  
  inline def TSThisType(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSThisType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSThisType]
  }
  
  inline def TSTupleType(elementTypes: js.Array[TSType], end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTupleType]
  }
  
  inline def TSTypeLiteral(end: Double, loc: SourceLocation, members: js.Array[TSTypeElement], start: Double): typings.babelTypes.mod.TSTypeLiteral = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeLiteral]
  }
  
  inline def TSTypeOperator(end: Double, loc: SourceLocation, start: Double, typeAnnotation: TSType): typings.babelTypes.mod.TSTypeOperator = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], operator = null)
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeOperator]
  }
  
  inline def TSTypePredicate(
    end: Double,
    loc: SourceLocation,
    parameterName: Identifier_ | TSThisType,
    start: Double,
    typeAnnotation: TSTypeAnnotation
  ): typings.babelTypes.mod.TSTypePredicate = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypePredicate]
  }
  
  inline def TSTypeQuery(end: Double, exprName: TSEntityName, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSTypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exprName = exprName.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeQuery]
  }
  
  inline def TSTypeReference(end: Double, loc: SourceLocation, start: Double, typeName: TSEntityName): typings.babelTypes.mod.TSTypeReference = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any], typeParameters = null)
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeReference]
  }
  
  inline def TSUndefinedKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSUndefinedKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSUndefinedKeyword]
  }
  
  inline def TSUnionType(end: Double, loc: SourceLocation, start: Double, types: js.Array[TSType]): typings.babelTypes.mod.TSUnionType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSUnionType]
  }
  
  inline def TSVoidKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.mod.TSVoidKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSVoidKeyword]
  }
}
