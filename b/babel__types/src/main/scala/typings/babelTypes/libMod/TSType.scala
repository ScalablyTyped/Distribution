package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.TSAnyKeyword
  - typings.babelTypes.libMod.TSBooleanKeyword
  - typings.babelTypes.libMod.TSBigIntKeyword
  - typings.babelTypes.libMod.TSIntrinsicKeyword
  - typings.babelTypes.libMod.TSNeverKeyword
  - typings.babelTypes.libMod.TSNullKeyword
  - typings.babelTypes.libMod.TSNumberKeyword
  - typings.babelTypes.libMod.TSObjectKeyword
  - typings.babelTypes.libMod.TSStringKeyword
  - typings.babelTypes.libMod.TSSymbolKeyword
  - typings.babelTypes.libMod.TSUndefinedKeyword
  - typings.babelTypes.libMod.TSUnknownKeyword
  - typings.babelTypes.libMod.TSVoidKeyword
  - typings.babelTypes.libMod.TSThisType
  - typings.babelTypes.libMod.TSFunctionType
  - typings.babelTypes.libMod.TSConstructorType
  - typings.babelTypes.libMod.TSTypeReference
  - typings.babelTypes.libMod.TSTypePredicate
  - typings.babelTypes.libMod.TSTypeQuery
  - typings.babelTypes.libMod.TSTypeLiteral
  - typings.babelTypes.libMod.TSArrayType
  - typings.babelTypes.libMod.TSTupleType
  - typings.babelTypes.libMod.TSOptionalType
  - typings.babelTypes.libMod.TSRestType
  - typings.babelTypes.libMod.TSUnionType
  - typings.babelTypes.libMod.TSIntersectionType
  - typings.babelTypes.libMod.TSConditionalType
  - typings.babelTypes.libMod.TSInferType
  - typings.babelTypes.libMod.TSParenthesizedType
  - typings.babelTypes.libMod.TSTypeOperator
  - typings.babelTypes.libMod.TSIndexedAccessType
  - typings.babelTypes.libMod.TSMappedType
  - typings.babelTypes.libMod.TSLiteralType
  - typings.babelTypes.libMod.TSExpressionWithTypeArguments
  - typings.babelTypes.libMod.TSImportType
*/
trait TSType extends StObject
object TSType {
  
  inline def TSAnyKeyword(): typings.babelTypes.libMod.TSAnyKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSAnyKeyword]
  }
  
  inline def TSArrayType(elementType: TSType): typings.babelTypes.libMod.TSArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSArrayType]
  }
  
  inline def TSBigIntKeyword(): typings.babelTypes.libMod.TSBigIntKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSBigIntKeyword]
  }
  
  inline def TSBooleanKeyword(): typings.babelTypes.libMod.TSBooleanKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSBooleanKeyword]
  }
  
  inline def TSConditionalType(checkType: TSType, extendsType: TSType, falseType: TSType, trueType: TSType): typings.babelTypes.libMod.TSConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConditionalType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConditionalType]
  }
  
  inline def TSConstructorType(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSConstructorType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConstructorType]
  }
  
  inline def TSExpressionWithTypeArguments(expression: TSEntityName): typings.babelTypes.libMod.TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSExpressionWithTypeArguments]
  }
  
  inline def TSFunctionType(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSFunctionType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSFunctionType]
  }
  
  inline def TSImportType(argument: StringLiteral_): typings.babelTypes.libMod.TSImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSImportType]
  }
  
  inline def TSIndexedAccessType(indexType: TSType, objectType: TSType): typings.babelTypes.libMod.TSIndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIndexedAccessType]
  }
  
  inline def TSInferType(typeParameter: TSTypeParameter): typings.babelTypes.libMod.TSInferType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSInferType]
  }
  
  inline def TSIntersectionType(types: js.Array[TSType]): typings.babelTypes.libMod.TSIntersectionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIntersectionType]
  }
  
  inline def TSIntrinsicKeyword(): typings.babelTypes.libMod.TSIntrinsicKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIntrinsicKeyword]
  }
  
  inline def TSLiteralType(
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_ | TemplateLiteral_ | UnaryExpression_
  ): typings.babelTypes.libMod.TSLiteralType = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSLiteralType]
  }
  
  inline def TSMappedType(typeParameter: TSTypeParameter): typings.babelTypes.libMod.TSMappedType = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSMappedType]
  }
  
  inline def TSNeverKeyword(): typings.babelTypes.libMod.TSNeverKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNeverKeyword]
  }
  
  inline def TSNullKeyword(): typings.babelTypes.libMod.TSNullKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNullKeyword]
  }
  
  inline def TSNumberKeyword(): typings.babelTypes.libMod.TSNumberKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNumberKeyword]
  }
  
  inline def TSObjectKeyword(): typings.babelTypes.libMod.TSObjectKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSObjectKeyword]
  }
  
  inline def TSOptionalType(typeAnnotation: TSType): typings.babelTypes.libMod.TSOptionalType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSOptionalType]
  }
  
  inline def TSParenthesizedType(typeAnnotation: TSType): typings.babelTypes.libMod.TSParenthesizedType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSParenthesizedType]
  }
  
  inline def TSRestType(typeAnnotation: TSType): typings.babelTypes.libMod.TSRestType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSRestType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSRestType]
  }
  
  inline def TSStringKeyword(): typings.babelTypes.libMod.TSStringKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSStringKeyword]
  }
  
  inline def TSSymbolKeyword(): typings.babelTypes.libMod.TSSymbolKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSSymbolKeyword]
  }
  
  inline def TSThisType(): typings.babelTypes.libMod.TSThisType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSThisType]
  }
  
  inline def TSTupleType(elementTypes: js.Array[TSType | TSNamedTupleMember]): typings.babelTypes.libMod.TSTupleType = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTupleType]
  }
  
  inline def TSTypeLiteral(members: js.Array[TSTypeElement]): typings.babelTypes.libMod.TSTypeLiteral = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeLiteral]
  }
  
  inline def TSTypeOperator(operator: String, typeAnnotation: TSType): typings.babelTypes.libMod.TSTypeOperator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeOperator]
  }
  
  inline def TSTypePredicate(parameterName: Identifier_ | TSThisType): typings.babelTypes.libMod.TSTypePredicate = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypePredicate]
  }
  
  inline def TSTypeQuery(exprName: TSEntityName | TSImportType): typings.babelTypes.libMod.TSTypeQuery = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeQuery]
  }
  
  inline def TSTypeReference(typeName: TSEntityName): typings.babelTypes.libMod.TSTypeReference = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeReference]
  }
  
  inline def TSUndefinedKeyword(): typings.babelTypes.libMod.TSUndefinedKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSUndefinedKeyword]
  }
  
  inline def TSUnionType(types: js.Array[TSType]): typings.babelTypes.libMod.TSUnionType = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSUnionType]
  }
  
  inline def TSUnknownKeyword(): typings.babelTypes.libMod.TSUnknownKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSUnknownKeyword]
  }
  
  inline def TSVoidKeyword(): typings.babelTypes.libMod.TSVoidKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSVoidKeyword]
  }
}
