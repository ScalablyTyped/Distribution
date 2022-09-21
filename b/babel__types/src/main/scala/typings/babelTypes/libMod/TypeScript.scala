package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method_
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.TSParameterProperty
  - typings.babelTypes.libMod.TSDeclareFunction
  - typings.babelTypes.libMod.TSDeclareMethod
  - typings.babelTypes.libMod.TSQualifiedName
  - typings.babelTypes.libMod.TSCallSignatureDeclaration
  - typings.babelTypes.libMod.TSConstructSignatureDeclaration
  - typings.babelTypes.libMod.TSPropertySignature
  - typings.babelTypes.libMod.TSMethodSignature
  - typings.babelTypes.libMod.TSIndexSignature
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
  - typings.babelTypes.libMod.TSNamedTupleMember
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
  - typings.babelTypes.libMod.TSInterfaceDeclaration
  - typings.babelTypes.libMod.TSInterfaceBody
  - typings.babelTypes.libMod.TSTypeAliasDeclaration
  - typings.babelTypes.libMod.TSInstantiationExpression
  - typings.babelTypes.libMod.TSAsExpression
  - typings.babelTypes.libMod.TSTypeAssertion
  - typings.babelTypes.libMod.TSEnumDeclaration
  - typings.babelTypes.libMod.TSEnumMember
  - typings.babelTypes.libMod.TSModuleDeclaration
  - typings.babelTypes.libMod.TSModuleBlock
  - typings.babelTypes.libMod.TSImportType
  - typings.babelTypes.libMod.TSImportEqualsDeclaration
  - typings.babelTypes.libMod.TSExternalModuleReference
  - typings.babelTypes.libMod.TSNonNullExpression
  - typings.babelTypes.libMod.TSExportAssignment
  - typings.babelTypes.libMod.TSNamespaceExportDeclaration
  - typings.babelTypes.libMod.TSTypeAnnotation
  - typings.babelTypes.libMod.TSTypeParameterInstantiation
  - typings.babelTypes.libMod.TSTypeParameterDeclaration
  - typings.babelTypes.libMod.TSTypeParameter
*/
trait TypeScript extends StObject
object TypeScript {
  
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
  
  inline def TSAsExpression(expression: Expression, typeAnnotation: TSType): typings.babelTypes.libMod.TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSAsExpression]
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
  
  inline def TSCallSignatureDeclaration(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSCallSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSCallSignatureDeclaration]
  }
  
  inline def TSConditionalType(checkType: TSType, extendsType: TSType, falseType: TSType, trueType: TSType): typings.babelTypes.libMod.TSConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConditionalType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConditionalType]
  }
  
  inline def TSConstructSignatureDeclaration(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSConstructSignatureDeclaration = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConstructSignatureDeclaration]
  }
  
  inline def TSConstructorType(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSConstructorType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConstructorType]
  }
  
  inline def TSDeclareFunction(params: js.Array[Identifier_ | Pattern | RestElement_]): typings.babelTypes.libMod.TSDeclareFunction = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSDeclareFunction]
  }
  
  inline def TSDeclareMethod(
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty]
  ): typings.babelTypes.libMod.TSDeclareMethod = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSDeclareMethod")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSDeclareMethod]
  }
  
  inline def TSEnumDeclaration(id: Identifier_, members: js.Array[TSEnumMember]): typings.babelTypes.libMod.TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSEnumDeclaration]
  }
  
  inline def TSEnumMember(id: Identifier_ | StringLiteral_): typings.babelTypes.libMod.TSEnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSEnumMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSEnumMember]
  }
  
  inline def TSExportAssignment(expression: Expression): typings.babelTypes.libMod.TSExportAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExportAssignment")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSExportAssignment]
  }
  
  inline def TSExpressionWithTypeArguments(expression: TSEntityName): typings.babelTypes.libMod.TSExpressionWithTypeArguments = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSExpressionWithTypeArguments]
  }
  
  inline def TSExternalModuleReference(expression: StringLiteral_): typings.babelTypes.libMod.TSExternalModuleReference = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExternalModuleReference")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSExternalModuleReference]
  }
  
  inline def TSFunctionType(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSFunctionType = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSFunctionType]
  }
  
  inline def TSImportEqualsDeclaration(id: Identifier_, isExport: Boolean, moduleReference: TSEntityName | TSExternalModuleReference): typings.babelTypes.libMod.TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportEqualsDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSImportEqualsDeclaration]
  }
  
  inline def TSImportType(argument: StringLiteral_): typings.babelTypes.libMod.TSImportType = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSImportType]
  }
  
  inline def TSIndexSignature(parameters: js.Array[Identifier_]): typings.babelTypes.libMod.TSIndexSignature = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIndexSignature]
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
  
  inline def TSInstantiationExpression(expression: Expression): typings.babelTypes.libMod.TSInstantiationExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInstantiationExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSInstantiationExpression]
  }
  
  inline def TSInterfaceBody(body: js.Array[TSTypeElement]): typings.babelTypes.libMod.TSInterfaceBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInterfaceBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSInterfaceBody]
  }
  
  inline def TSInterfaceDeclaration(body: TSInterfaceBody, id: Identifier_): typings.babelTypes.libMod.TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSInterfaceDeclaration]
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
  
  inline def TSMethodSignature(key: Expression, kind: method_ | get | set, parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSMethodSignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSMethodSignature]
  }
  
  inline def TSModuleBlock(body: js.Array[Statement]): typings.babelTypes.libMod.TSModuleBlock = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSModuleBlock]
  }
  
  inline def TSModuleDeclaration(
    body: TSModuleBlock | typings.babelTypes.libMod.TSModuleDeclaration,
    id: Identifier_ | StringLiteral_
  ): typings.babelTypes.libMod.TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSModuleDeclaration]
  }
  
  inline def TSNamedTupleMember(elementType: TSType, label: Identifier_, optional: Boolean): typings.babelTypes.libMod.TSNamedTupleMember = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNamedTupleMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNamedTupleMember]
  }
  
  inline def TSNamespaceExportDeclaration(id: Identifier_): typings.babelTypes.libMod.TSNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNamespaceExportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNamespaceExportDeclaration]
  }
  
  inline def TSNeverKeyword(): typings.babelTypes.libMod.TSNeverKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNeverKeyword]
  }
  
  inline def TSNonNullExpression(expression: Expression): typings.babelTypes.libMod.TSNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNonNullExpression]
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
  
  inline def TSParameterProperty(parameter: Identifier_ | AssignmentPattern_): typings.babelTypes.libMod.TSParameterProperty = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSParameterProperty]
  }
  
  inline def TSParenthesizedType(typeAnnotation: TSType): typings.babelTypes.libMod.TSParenthesizedType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSParenthesizedType]
  }
  
  inline def TSPropertySignature(key: Expression, kind: get | set): typings.babelTypes.libMod.TSPropertySignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSPropertySignature]
  }
  
  inline def TSQualifiedName(left: TSEntityName, right: Identifier_): typings.babelTypes.libMod.TSQualifiedName = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSQualifiedName")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSQualifiedName]
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
  
  inline def TSTypeAliasDeclaration(id: Identifier_, typeAnnotation: TSType): typings.babelTypes.libMod.TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeAliasDeclaration]
  }
  
  inline def TSTypeAnnotation(typeAnnotation: TSType): typings.babelTypes.libMod.TSTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeAnnotation]
  }
  
  inline def TSTypeAssertion(expression: Expression, typeAnnotation: TSType): typings.babelTypes.libMod.TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeAssertion]
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
  
  inline def TSTypeParameter(name: String): typings.babelTypes.libMod.TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameter")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeParameter]
  }
  
  inline def TSTypeParameterDeclaration(params: js.Array[TSTypeParameter]): typings.babelTypes.libMod.TSTypeParameterDeclaration = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameterDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeParameterDeclaration]
  }
  
  inline def TSTypeParameterInstantiation(params: js.Array[TSType]): typings.babelTypes.libMod.TSTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameterInstantiation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeParameterInstantiation]
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
