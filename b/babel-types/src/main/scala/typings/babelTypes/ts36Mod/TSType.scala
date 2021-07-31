package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.TSAnyKeyword
  - typings.babelTypes.ts36Mod.TSArrayType
  - typings.babelTypes.ts36Mod.TSBooleanKeyword
  - typings.babelTypes.ts36Mod.TSConstructorType
  - typings.babelTypes.ts36Mod.TSExpressionWithTypeArguments
  - typings.babelTypes.ts36Mod.TSFunctionType
  - typings.babelTypes.ts36Mod.TSIndexedAccessType
  - typings.babelTypes.ts36Mod.TSIntersectionType
  - typings.babelTypes.ts36Mod.TSLiteralType
  - typings.babelTypes.ts36Mod.TSMappedType
  - typings.babelTypes.ts36Mod.TSNeverKeyword
  - typings.babelTypes.ts36Mod.TSNullKeyword
  - typings.babelTypes.ts36Mod.TSNumberKeyword
  - typings.babelTypes.ts36Mod.TSObjectKeyword
  - typings.babelTypes.ts36Mod.TSParenthesizedType
  - typings.babelTypes.ts36Mod.TSStringKeyword
  - typings.babelTypes.ts36Mod.TSSymbolKeyword
  - typings.babelTypes.ts36Mod.TSThisType
  - typings.babelTypes.ts36Mod.TSTupleType
  - typings.babelTypes.ts36Mod.TSTypeLiteral
  - typings.babelTypes.ts36Mod.TSTypeOperator
  - typings.babelTypes.ts36Mod.TSTypePredicate
  - typings.babelTypes.ts36Mod.TSTypeQuery
  - typings.babelTypes.ts36Mod.TSTypeReference
  - typings.babelTypes.ts36Mod.TSUndefinedKeyword
  - typings.babelTypes.ts36Mod.TSUnionType
  - typings.babelTypes.ts36Mod.TSVoidKeyword
*/
trait TSType extends StObject
object TSType {
  
  @scala.inline
  def TSAnyKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSAnyKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSAnyKeyword]
  }
  
  @scala.inline
  def TSArrayType(elementType: TSType, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSArrayType]
  }
  
  @scala.inline
  def TSBooleanKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSBooleanKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSBooleanKeyword]
  }
  
  @scala.inline
  def TSConstructorType(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSConstructorType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSConstructorType]
  }
  
  @scala.inline
  def TSExpressionWithTypeArguments(end: Double, expression: TSEntityName, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = null)
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSExpressionWithTypeArguments]
  }
  
  @scala.inline
  def TSFunctionType(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSFunctionType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], parameters = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSFunctionType]
  }
  
  @scala.inline
  def TSIndexedAccessType(end: Double, indexType: TSType, loc: SourceLocation, objectType: TSType, start: Double): typings.babelTypes.ts36Mod.TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], indexType = indexType.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSIndexedAccessType]
  }
  
  @scala.inline
  def TSIntersectionType(end: Double, loc: SourceLocation, start: Double, types: js.Array[TSType]): typings.babelTypes.ts36Mod.TSIntersectionType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSIntersectionType]
  }
  
  @scala.inline
  def TSLiteralType(
    end: Double,
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_,
    loc: SourceLocation,
    start: Double
  ): typings.babelTypes.ts36Mod.TSLiteralType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], literal = literal.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSLiteralType]
  }
  
  @scala.inline
  def TSMappedType(end: Double, loc: SourceLocation, start: Double, typeParameter: TypeParameter_): typings.babelTypes.ts36Mod.TSMappedType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameter = typeParameter.asInstanceOf[js.Any], optional = null, readonly = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSMappedType]
  }
  
  @scala.inline
  def TSNeverKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSNeverKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSNeverKeyword]
  }
  
  @scala.inline
  def TSNullKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSNullKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSNullKeyword]
  }
  
  @scala.inline
  def TSNumberKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSNumberKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSNumberKeyword]
  }
  
  @scala.inline
  def TSObjectKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSObjectKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSObjectKeyword]
  }
  
  @scala.inline
  def TSParenthesizedType(end: Double, loc: SourceLocation, start: Double, typeAnnotation: TSType): typings.babelTypes.ts36Mod.TSParenthesizedType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSParenthesizedType]
  }
  
  @scala.inline
  def TSStringKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSStringKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSStringKeyword]
  }
  
  @scala.inline
  def TSSymbolKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSSymbolKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSSymbolKeyword]
  }
  
  @scala.inline
  def TSThisType(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSThisType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSThisType]
  }
  
  @scala.inline
  def TSTupleType(elementTypes: js.Array[TSType], end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSTupleType]
  }
  
  @scala.inline
  def TSTypeLiteral(end: Double, loc: SourceLocation, members: js.Array[TSTypeElement], start: Double): typings.babelTypes.ts36Mod.TSTypeLiteral = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSTypeLiteral]
  }
  
  @scala.inline
  def TSTypeOperator(end: Double, loc: SourceLocation, start: Double, typeAnnotation: TSType): typings.babelTypes.ts36Mod.TSTypeOperator = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], operator = null)
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSTypeOperator]
  }
  
  @scala.inline
  def TSTypePredicate(
    end: Double,
    loc: SourceLocation,
    parameterName: Identifier_ | TSThisType,
    start: Double,
    typeAnnotation: TSTypeAnnotation
  ): typings.babelTypes.ts36Mod.TSTypePredicate = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSTypePredicate]
  }
  
  @scala.inline
  def TSTypeQuery(end: Double, exprName: TSEntityName, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSTypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exprName = exprName.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSTypeQuery]
  }
  
  @scala.inline
  def TSTypeReference(end: Double, loc: SourceLocation, start: Double, typeName: TSEntityName): typings.babelTypes.ts36Mod.TSTypeReference = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any], typeParameters = null)
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSTypeReference]
  }
  
  @scala.inline
  def TSUndefinedKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSUndefinedKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSUndefinedKeyword]
  }
  
  @scala.inline
  def TSUnionType(end: Double, loc: SourceLocation, start: Double, types: js.Array[TSType]): typings.babelTypes.ts36Mod.TSUnionType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSUnionType]
  }
  
  @scala.inline
  def TSVoidKeyword(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSVoidKeyword = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSVoidKeyword]
  }
}
