package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.TSAnyKeyword__
  - typings.babelTypes.libMod.TSBooleanKeyword__
  - typings.babelTypes.libMod.TSBigIntKeyword__
  - typings.babelTypes.libMod.TSIntrinsicKeyword__
  - typings.babelTypes.libMod.TSNeverKeyword__
  - typings.babelTypes.libMod.TSNullKeyword__
  - typings.babelTypes.libMod.TSNumberKeyword__
  - typings.babelTypes.libMod.TSObjectKeyword__
  - typings.babelTypes.libMod.TSStringKeyword__
  - typings.babelTypes.libMod.TSSymbolKeyword__
  - typings.babelTypes.libMod.TSUndefinedKeyword__
  - typings.babelTypes.libMod.TSUnknownKeyword__
  - typings.babelTypes.libMod.TSVoidKeyword__
  - typings.babelTypes.libMod.TSThisType__
  - typings.babelTypes.libMod.TSFunctionType__
  - typings.babelTypes.libMod.TSConstructorType__
  - typings.babelTypes.libMod.TSTypeReference__
  - typings.babelTypes.libMod.TSTypePredicate__
  - typings.babelTypes.libMod.TSTypeQuery__
  - typings.babelTypes.libMod.TSTypeLiteral__
  - typings.babelTypes.libMod.TSArrayType__
  - typings.babelTypes.libMod.TSTupleType__
  - typings.babelTypes.libMod.TSOptionalType__
  - typings.babelTypes.libMod.TSRestType__
  - typings.babelTypes.libMod.TSUnionType__
  - typings.babelTypes.libMod.TSIntersectionType__
  - typings.babelTypes.libMod.TSConditionalType__
  - typings.babelTypes.libMod.TSInferType__
  - typings.babelTypes.libMod.TSParenthesizedType__
  - typings.babelTypes.libMod.TSTypeOperator__
  - typings.babelTypes.libMod.TSIndexedAccessType__
  - typings.babelTypes.libMod.TSMappedType__
  - typings.babelTypes.libMod.TSLiteralType__
  - typings.babelTypes.libMod.TSExpressionWithTypeArguments__
  - typings.babelTypes.libMod.TSImportType__
*/
trait TSType extends StObject
object TSType {
  
  inline def TSAnyKeyword__(): typings.babelTypes.libMod.TSAnyKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSAnyKeyword__]
  }
  
  inline def TSArrayType__(elementType: TSType): typings.babelTypes.libMod.TSArrayType__ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSArrayType__]
  }
  
  inline def TSBigIntKeyword__(): typings.babelTypes.libMod.TSBigIntKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSBigIntKeyword__]
  }
  
  inline def TSBooleanKeyword__(): typings.babelTypes.libMod.TSBooleanKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSBooleanKeyword__]
  }
  
  inline def TSConditionalType__(checkType: TSType, extendsType: TSType, falseType: TSType, trueType: TSType): typings.babelTypes.libMod.TSConditionalType__ = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConditionalType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConditionalType__]
  }
  
  inline def TSConstructorType__(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSConstructorType__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConstructorType__]
  }
  
  inline def TSExpressionWithTypeArguments__(expression: TSEntityName): typings.babelTypes.libMod.TSExpressionWithTypeArguments__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSExpressionWithTypeArguments__]
  }
  
  inline def TSFunctionType__(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSFunctionType__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSFunctionType__]
  }
  
  inline def TSImportType__(argument: StringLiteral_): typings.babelTypes.libMod.TSImportType__ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSImportType__]
  }
  
  inline def TSIndexedAccessType__(indexType: TSType, objectType: TSType): typings.babelTypes.libMod.TSIndexedAccessType__ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIndexedAccessType__]
  }
  
  inline def TSInferType__(typeParameter: TSTypeParameter__): typings.babelTypes.libMod.TSInferType__ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSInferType__]
  }
  
  inline def TSIntersectionType__(types: js.Array[TSType]): typings.babelTypes.libMod.TSIntersectionType__ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIntersectionType__]
  }
  
  inline def TSIntrinsicKeyword__(): typings.babelTypes.libMod.TSIntrinsicKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIntrinsicKeyword__]
  }
  
  inline def TSLiteralType__(
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_ | TemplateLiteral_ | UnaryExpression_
  ): typings.babelTypes.libMod.TSLiteralType__ = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSLiteralType__]
  }
  
  inline def TSMappedType__(typeParameter: TSTypeParameter__): typings.babelTypes.libMod.TSMappedType__ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSMappedType__]
  }
  
  inline def TSNeverKeyword__(): typings.babelTypes.libMod.TSNeverKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNeverKeyword__]
  }
  
  inline def TSNullKeyword__(): typings.babelTypes.libMod.TSNullKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNullKeyword__]
  }
  
  inline def TSNumberKeyword__(): typings.babelTypes.libMod.TSNumberKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNumberKeyword__]
  }
  
  inline def TSObjectKeyword__(): typings.babelTypes.libMod.TSObjectKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSObjectKeyword__]
  }
  
  inline def TSOptionalType__(typeAnnotation: TSType): typings.babelTypes.libMod.TSOptionalType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSOptionalType__]
  }
  
  inline def TSParenthesizedType__(typeAnnotation: TSType): typings.babelTypes.libMod.TSParenthesizedType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSParenthesizedType__]
  }
  
  inline def TSRestType__(typeAnnotation: TSType): typings.babelTypes.libMod.TSRestType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSRestType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSRestType__]
  }
  
  inline def TSStringKeyword__(): typings.babelTypes.libMod.TSStringKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSStringKeyword__]
  }
  
  inline def TSSymbolKeyword__(): typings.babelTypes.libMod.TSSymbolKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSSymbolKeyword__]
  }
  
  inline def TSThisType__(): typings.babelTypes.libMod.TSThisType__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSThisType__]
  }
  
  inline def TSTupleType__(elementTypes: js.Array[TSType | TSNamedTupleMember__]): typings.babelTypes.libMod.TSTupleType__ = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTupleType__]
  }
  
  inline def TSTypeLiteral__(members: js.Array[TSTypeElement]): typings.babelTypes.libMod.TSTypeLiteral__ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeLiteral__]
  }
  
  inline def TSTypeOperator__(operator: String, typeAnnotation: TSType): typings.babelTypes.libMod.TSTypeOperator__ = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeOperator__]
  }
  
  inline def TSTypePredicate__(parameterName: Identifier_ | TSThisType__): typings.babelTypes.libMod.TSTypePredicate__ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypePredicate__]
  }
  
  inline def TSTypeQuery__(exprName: TSEntityName | TSImportType__): typings.babelTypes.libMod.TSTypeQuery__ = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeQuery__]
  }
  
  inline def TSTypeReference__(typeName: TSEntityName): typings.babelTypes.libMod.TSTypeReference__ = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeReference__]
  }
  
  inline def TSUndefinedKeyword__(): typings.babelTypes.libMod.TSUndefinedKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSUndefinedKeyword__]
  }
  
  inline def TSUnionType__(types: js.Array[TSType]): typings.babelTypes.libMod.TSUnionType__ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSUnionType__]
  }
  
  inline def TSUnknownKeyword__(): typings.babelTypes.libMod.TSUnknownKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSUnknownKeyword__]
  }
  
  inline def TSVoidKeyword__(): typings.babelTypes.libMod.TSVoidKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSVoidKeyword__]
  }
}
