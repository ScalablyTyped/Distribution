package typings.babelTypes.ts36Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
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
trait TSType extends js.Object
object TSType {
  
  @scala.inline
  def TSTypeQuery(
    end: Double,
    exprName: TSEntityName,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSTypeQuery
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exprName = exprName.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSUndefinedKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSUndefinedKeyword
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSParenthesizedType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSParenthesizedType,
    typeAnnotation: TSType
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSIndexedAccessType(
    end: Double,
    indexType: TSType,
    loc: SourceLocation,
    objectType: TSType,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSIndexedAccessType
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], indexType = indexType.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSMappedType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSMappedType,
    typeParameter: TypeParameter_
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSSymbolKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSSymbolKeyword
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSConstructorType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSConstructorType
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSLiteralType(
    end: Double,
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSLiteralType
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], literal = literal.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSTypeOperator(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSTypeOperator,
    typeAnnotation: TSType
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSThisType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSThisType
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSNeverKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSNeverKeyword
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSTypePredicate(
    end: Double,
    loc: SourceLocation,
    parameterName: Identifier_ | TSThisType,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSTypePredicate,
    typeAnnotation: TSTypeAnnotation
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSTypeLiteral(
    end: Double,
    loc: SourceLocation,
    members: js.Array[TSTypeElement],
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSTypeLiteral
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSFunctionType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSFunctionType
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSAnyKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSAnyKeyword
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSNumberKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSNumberKeyword
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSBooleanKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSBooleanKeyword
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSObjectKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSObjectKeyword
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSTypeReference(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSTypeReference,
    typeName: TSEntityName
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSVoidKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSVoidKeyword
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSArrayType(
    elementType: TSType,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSArrayType
  ): TSType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSUnionType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSUnionType,
    types: js.Array[TSType]
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSTupleType(
    elementTypes: js.Array[TSType],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSTupleType
  ): TSType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSExpressionWithTypeArguments(
    end: Double,
    expression: TSEntityName,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSStringKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSStringKeyword
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSNullKeyword(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSNullKeyword
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
  
  @scala.inline
  def TSIntersectionType(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSIntersectionType,
    types: js.Array[TSType]
  ): TSType = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSType]
  }
}
