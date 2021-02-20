package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSAnyKeyword
import typings.babelTypes.babelTypesStrings.TSArrayType
import typings.babelTypes.babelTypesStrings.TSBigIntKeyword
import typings.babelTypes.babelTypesStrings.TSBooleanKeyword
import typings.babelTypes.babelTypesStrings.TSConditionalType
import typings.babelTypes.babelTypesStrings.TSConstructorType
import typings.babelTypes.babelTypesStrings.TSExpressionWithTypeArguments
import typings.babelTypes.babelTypesStrings.TSFunctionType
import typings.babelTypes.babelTypesStrings.TSImportType
import typings.babelTypes.babelTypesStrings.TSIndexedAccessType
import typings.babelTypes.babelTypesStrings.TSInferType
import typings.babelTypes.babelTypesStrings.TSIntersectionType
import typings.babelTypes.babelTypesStrings.TSIntrinsicKeyword
import typings.babelTypes.babelTypesStrings.TSLiteralType
import typings.babelTypes.babelTypesStrings.TSMappedType
import typings.babelTypes.babelTypesStrings.TSNeverKeyword
import typings.babelTypes.babelTypesStrings.TSNullKeyword
import typings.babelTypes.babelTypesStrings.TSNumberKeyword
import typings.babelTypes.babelTypesStrings.TSObjectKeyword
import typings.babelTypes.babelTypesStrings.TSOptionalType
import typings.babelTypes.babelTypesStrings.TSParenthesizedType
import typings.babelTypes.babelTypesStrings.TSRestType
import typings.babelTypes.babelTypesStrings.TSStringKeyword
import typings.babelTypes.babelTypesStrings.TSSymbolKeyword
import typings.babelTypes.babelTypesStrings.TSThisType
import typings.babelTypes.babelTypesStrings.TSTupleType
import typings.babelTypes.babelTypesStrings.TSTypeLiteral
import typings.babelTypes.babelTypesStrings.TSTypeOperator
import typings.babelTypes.babelTypesStrings.TSTypePredicate
import typings.babelTypes.babelTypesStrings.TSTypeQuery
import typings.babelTypes.babelTypesStrings.TSTypeReference
import typings.babelTypes.babelTypesStrings.TSUndefinedKeyword
import typings.babelTypes.babelTypesStrings.TSUnionType
import typings.babelTypes.babelTypesStrings.TSUnknownKeyword
import typings.babelTypes.babelTypesStrings.TSVoidKeyword
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.TSAnyKeyword_
  - typings.babelTypes.mod.TSBooleanKeyword_
  - typings.babelTypes.mod.TSBigIntKeyword_
  - typings.babelTypes.mod.TSIntrinsicKeyword_
  - typings.babelTypes.mod.TSNeverKeyword_
  - typings.babelTypes.mod.TSNullKeyword_
  - typings.babelTypes.mod.TSNumberKeyword_
  - typings.babelTypes.mod.TSObjectKeyword_
  - typings.babelTypes.mod.TSStringKeyword_
  - typings.babelTypes.mod.TSSymbolKeyword_
  - typings.babelTypes.mod.TSUndefinedKeyword_
  - typings.babelTypes.mod.TSUnknownKeyword_
  - typings.babelTypes.mod.TSVoidKeyword_
  - typings.babelTypes.mod.TSThisType_
  - typings.babelTypes.mod.TSFunctionType_
  - typings.babelTypes.mod.TSConstructorType_
  - typings.babelTypes.mod.TSTypeReference_
  - typings.babelTypes.mod.TSTypePredicate_
  - typings.babelTypes.mod.TSTypeQuery_
  - typings.babelTypes.mod.TSTypeLiteral_
  - typings.babelTypes.mod.TSArrayType_
  - typings.babelTypes.mod.TSTupleType_
  - typings.babelTypes.mod.TSOptionalType_
  - typings.babelTypes.mod.TSRestType_
  - typings.babelTypes.mod.TSUnionType_
  - typings.babelTypes.mod.TSIntersectionType_
  - typings.babelTypes.mod.TSConditionalType_
  - typings.babelTypes.mod.TSInferType_
  - typings.babelTypes.mod.TSParenthesizedType_
  - typings.babelTypes.mod.TSTypeOperator_
  - typings.babelTypes.mod.TSIndexedAccessType_
  - typings.babelTypes.mod.TSMappedType_
  - typings.babelTypes.mod.TSLiteralType_
  - typings.babelTypes.mod.TSExpressionWithTypeArguments_
  - typings.babelTypes.mod.TSImportType_
*/
trait TSType extends _Node
object TSType {
  
  @scala.inline
  def TSAnyKeyword_(`type`: TSAnyKeyword): typings.babelTypes.mod.TSAnyKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSAnyKeyword_]
  }
  
  @scala.inline
  def TSArrayType_(elementType: TSType, `type`: TSArrayType): typings.babelTypes.mod.TSArrayType_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSArrayType_]
  }
  
  @scala.inline
  def TSBigIntKeyword_(`type`: TSBigIntKeyword): typings.babelTypes.mod.TSBigIntKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSBigIntKeyword_]
  }
  
  @scala.inline
  def TSBooleanKeyword_(`type`: TSBooleanKeyword): typings.babelTypes.mod.TSBooleanKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSBooleanKeyword_]
  }
  
  @scala.inline
  def TSConditionalType_(
    checkType: TSType,
    extendsType: TSType,
    falseType: TSType,
    trueType: TSType,
    `type`: TSConditionalType
  ): typings.babelTypes.mod.TSConditionalType_ = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSConditionalType_]
  }
  
  @scala.inline
  def TSConstructorType_(parameters: js.Array[Identifier_ | RestElement_], `type`: TSConstructorType): typings.babelTypes.mod.TSConstructorType_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSConstructorType_]
  }
  
  @scala.inline
  def TSExpressionWithTypeArguments_(expression: TSEntityName, `type`: TSExpressionWithTypeArguments): typings.babelTypes.mod.TSExpressionWithTypeArguments_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSExpressionWithTypeArguments_]
  }
  
  @scala.inline
  def TSFunctionType_(parameters: js.Array[Identifier_ | RestElement_], `type`: TSFunctionType): typings.babelTypes.mod.TSFunctionType_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSFunctionType_]
  }
  
  @scala.inline
  def TSImportType_(argument: StringLiteral_, `type`: TSImportType): typings.babelTypes.mod.TSImportType_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSImportType_]
  }
  
  @scala.inline
  def TSIndexedAccessType_(indexType: TSType, objectType: TSType, `type`: TSIndexedAccessType): typings.babelTypes.mod.TSIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSIndexedAccessType_]
  }
  
  @scala.inline
  def TSInferType_(`type`: TSInferType, typeParameter: TSTypeParameter_): typings.babelTypes.mod.TSInferType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSInferType_]
  }
  
  @scala.inline
  def TSIntersectionType_(`type`: TSIntersectionType, types: js.Array[TSType]): typings.babelTypes.mod.TSIntersectionType_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSIntersectionType_]
  }
  
  @scala.inline
  def TSIntrinsicKeyword_(`type`: TSIntrinsicKeyword): typings.babelTypes.mod.TSIntrinsicKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSIntrinsicKeyword_]
  }
  
  @scala.inline
  def TSLiteralType_(
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_,
    `type`: TSLiteralType
  ): typings.babelTypes.mod.TSLiteralType_ = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSLiteralType_]
  }
  
  @scala.inline
  def TSMappedType_(`type`: TSMappedType, typeParameter: TSTypeParameter_): typings.babelTypes.mod.TSMappedType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSMappedType_]
  }
  
  @scala.inline
  def TSNeverKeyword_(`type`: TSNeverKeyword): typings.babelTypes.mod.TSNeverKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSNeverKeyword_]
  }
  
  @scala.inline
  def TSNullKeyword_(`type`: TSNullKeyword): typings.babelTypes.mod.TSNullKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSNullKeyword_]
  }
  
  @scala.inline
  def TSNumberKeyword_(`type`: TSNumberKeyword): typings.babelTypes.mod.TSNumberKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSNumberKeyword_]
  }
  
  @scala.inline
  def TSObjectKeyword_(`type`: TSObjectKeyword): typings.babelTypes.mod.TSObjectKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSObjectKeyword_]
  }
  
  @scala.inline
  def TSOptionalType_(`type`: TSOptionalType, typeAnnotation: TSType): typings.babelTypes.mod.TSOptionalType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSOptionalType_]
  }
  
  @scala.inline
  def TSParenthesizedType_(`type`: TSParenthesizedType, typeAnnotation: TSType): typings.babelTypes.mod.TSParenthesizedType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSParenthesizedType_]
  }
  
  @scala.inline
  def TSRestType_(`type`: TSRestType, typeAnnotation: TSType): typings.babelTypes.mod.TSRestType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSRestType_]
  }
  
  @scala.inline
  def TSStringKeyword_(`type`: TSStringKeyword): typings.babelTypes.mod.TSStringKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSStringKeyword_]
  }
  
  @scala.inline
  def TSSymbolKeyword_(`type`: TSSymbolKeyword): typings.babelTypes.mod.TSSymbolKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSSymbolKeyword_]
  }
  
  @scala.inline
  def TSThisType_(`type`: TSThisType): typings.babelTypes.mod.TSThisType_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSThisType_]
  }
  
  @scala.inline
  def TSTupleType_(elementTypes: js.Array[TSType | TSNamedTupleMember_], `type`: TSTupleType): typings.babelTypes.mod.TSTupleType_ = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSTupleType_]
  }
  
  @scala.inline
  def TSTypeLiteral_(members: js.Array[TSTypeElement], `type`: TSTypeLiteral): typings.babelTypes.mod.TSTypeLiteral_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeLiteral_]
  }
  
  @scala.inline
  def TSTypeOperator_(operator: String, `type`: TSTypeOperator, typeAnnotation: TSType): typings.babelTypes.mod.TSTypeOperator_ = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeOperator_]
  }
  
  @scala.inline
  def TSTypePredicate_(parameterName: Identifier_ | TSThisType_, `type`: TSTypePredicate): typings.babelTypes.mod.TSTypePredicate_ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypePredicate_]
  }
  
  @scala.inline
  def TSTypeQuery_(exprName: TSEntityName | TSImportType_, `type`: TSTypeQuery): typings.babelTypes.mod.TSTypeQuery_ = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeQuery_]
  }
  
  @scala.inline
  def TSTypeReference_(`type`: TSTypeReference, typeName: TSEntityName): typings.babelTypes.mod.TSTypeReference_ = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeReference_]
  }
  
  @scala.inline
  def TSUndefinedKeyword_(`type`: TSUndefinedKeyword): typings.babelTypes.mod.TSUndefinedKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSUndefinedKeyword_]
  }
  
  @scala.inline
  def TSUnionType_(`type`: TSUnionType, types: js.Array[TSType]): typings.babelTypes.mod.TSUnionType_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSUnionType_]
  }
  
  @scala.inline
  def TSUnknownKeyword_(`type`: TSUnknownKeyword): typings.babelTypes.mod.TSUnknownKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSUnknownKeyword_]
  }
  
  @scala.inline
  def TSVoidKeyword_(`type`: TSVoidKeyword): typings.babelTypes.mod.TSVoidKeyword_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TSVoidKeyword_]
  }
}
