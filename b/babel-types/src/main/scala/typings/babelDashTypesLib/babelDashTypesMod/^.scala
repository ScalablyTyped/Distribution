package typings
package babelDashTypesLib.babelDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val react: ReactHelpers = js.native
  def TSAnyKeyword(): babelDashTypesLib.babelDashTypesMod.TSAnyKeyword = js.native
  def TSArrayType(elementType: TSType): babelDashTypesLib.babelDashTypesMod.TSArrayType = js.native
  def TSAsExpression(expression: Expression, typeAnnotation: TSType): babelDashTypesLib.babelDashTypesMod.TSAsExpression = js.native
  def TSBooleanKeyword(): babelDashTypesLib.babelDashTypesMod.TSBooleanKeyword = js.native
  def TSCallSignatureDeclaration(): babelDashTypesLib.babelDashTypesMod.TSCallSignatureDeclaration = js.native
  def TSCallSignatureDeclaration(typeParameters: TypeParameterDeclaration): babelDashTypesLib.babelDashTypesMod.TSCallSignatureDeclaration = js.native
  def TSCallSignatureDeclaration(typeParameters: TypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): babelDashTypesLib.babelDashTypesMod.TSCallSignatureDeclaration = js.native
  def TSCallSignatureDeclaration(
    typeParameters: TypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): babelDashTypesLib.babelDashTypesMod.TSCallSignatureDeclaration = js.native
  def TSConstructSignatureDeclaration(): TSTypeElement = js.native
  def TSConstructSignatureDeclaration(typeParameters: TypeParameterDeclaration): TSTypeElement = js.native
  def TSConstructSignatureDeclaration(typeParameters: TypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSTypeElement = js.native
  def TSConstructSignatureDeclaration(
    typeParameters: TypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSTypeElement = js.native
  def TSConstructorType(): babelDashTypesLib.babelDashTypesMod.TSConstructorType = js.native
  def TSConstructorType(typeParameters: TypeParameterDeclaration): babelDashTypesLib.babelDashTypesMod.TSConstructorType = js.native
  def TSConstructorType(typeParameters: TypeParameterDeclaration, typeAnnotation: TSTypeAnnotation): babelDashTypesLib.babelDashTypesMod.TSConstructorType = js.native
  def TSDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[LVal]
  ): babelDashTypesLib.babelDashTypesMod.TSDeclareFunction = js.native
  def TSDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[LVal],
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): babelDashTypesLib.babelDashTypesMod.TSDeclareFunction = js.native
  def TSDeclareMethod(
    decorators: js.UndefOr[js.Array[Decorator] | scala.Null],
    key: Expression,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[LVal]
  ): babelDashTypesLib.babelDashTypesMod.TSDeclareMethod = js.native
  def TSDeclareMethod(
    decorators: js.UndefOr[js.Array[Decorator] | scala.Null],
    key: Expression,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[LVal],
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): babelDashTypesLib.babelDashTypesMod.TSDeclareMethod = js.native
  def TSEnumDeclaration(id: Identifier, members: js.Array[TSEnumMember]): babelDashTypesLib.babelDashTypesMod.TSEnumDeclaration = js.native
  def TSEnumMember(id: Identifier): babelDashTypesLib.babelDashTypesMod.TSEnumMember = js.native
  def TSEnumMember(id: Identifier, initializer: Expression): babelDashTypesLib.babelDashTypesMod.TSEnumMember = js.native
  def TSEnumMember(id: StringLiteral): babelDashTypesLib.babelDashTypesMod.TSEnumMember = js.native
  def TSEnumMember(id: StringLiteral, initializer: Expression): babelDashTypesLib.babelDashTypesMod.TSEnumMember = js.native
  def TSExportAssignment(expression: Expression): babelDashTypesLib.babelDashTypesMod.TSExportAssignment = js.native
  def TSExpressionWithTypeArguments(expression: TSEntityName): babelDashTypesLib.babelDashTypesMod.TSExpressionWithTypeArguments = js.native
  def TSExpressionWithTypeArguments(expression: TSEntityName, typeParameters: TypeParameterInstantiation): babelDashTypesLib.babelDashTypesMod.TSExpressionWithTypeArguments = js.native
  def TSExternalModuleReference(expression: StringLiteral): babelDashTypesLib.babelDashTypesMod.TSExternalModuleReference = js.native
  def TSFunctionType(): babelDashTypesLib.babelDashTypesMod.TSFunctionType = js.native
  def TSFunctionType(typeParameters: TypeParameterDeclaration): babelDashTypesLib.babelDashTypesMod.TSFunctionType = js.native
  def TSFunctionType(typeParameters: TypeParameterDeclaration, typeAnnotation: TSTypeAnnotation): babelDashTypesLib.babelDashTypesMod.TSFunctionType = js.native
  def TSImportEqualsDeclaration(id: Identifier, moduleReference: TSEntityName): babelDashTypesLib.babelDashTypesMod.TSImportEqualsDeclaration = js.native
  def TSImportEqualsDeclaration(id: Identifier, moduleReference: TSExternalModuleReference): babelDashTypesLib.babelDashTypesMod.TSImportEqualsDeclaration = js.native
  def TSIndexSignature(parameters: js.Array[Identifier]): babelDashTypesLib.babelDashTypesMod.TSIndexSignature = js.native
  def TSIndexSignature(parameters: js.Array[Identifier], typeAnnotation: TSTypeAnnotation): babelDashTypesLib.babelDashTypesMod.TSIndexSignature = js.native
  def TSIndexedAccessType(objectType: TSType, indexType: TSType): babelDashTypesLib.babelDashTypesMod.TSIndexedAccessType = js.native
  def TSInterfaceBody(body: js.Array[TSTypeElement]): babelDashTypesLib.babelDashTypesMod.TSInterfaceBody = js.native
  def TSInterfaceDeclaration(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): babelDashTypesLib.babelDashTypesMod.TSInterfaceDeclaration = js.native
  def TSInterfaceDeclaration(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    extends_ : js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): babelDashTypesLib.babelDashTypesMod.TSInterfaceDeclaration = js.native
  def TSInterfaceDeclaration(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    extends_ : scala.Null,
    body: TSInterfaceBody
  ): babelDashTypesLib.babelDashTypesMod.TSInterfaceDeclaration = js.native
  def TSInterfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): babelDashTypesLib.babelDashTypesMod.TSInterfaceDeclaration = js.native
  def TSInterfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    extends_ : js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): babelDashTypesLib.babelDashTypesMod.TSInterfaceDeclaration = js.native
  def TSInterfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    extends_ : scala.Null,
    body: TSInterfaceBody
  ): babelDashTypesLib.babelDashTypesMod.TSInterfaceDeclaration = js.native
  def TSInterfaceDeclaration(
    id: Identifier,
    typeParameters: scala.Null,
    extends_ : js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): babelDashTypesLib.babelDashTypesMod.TSInterfaceDeclaration = js.native
  def TSInterfaceDeclaration(
    id: Identifier,
    typeParameters: scala.Null,
    extends_ : js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): babelDashTypesLib.babelDashTypesMod.TSInterfaceDeclaration = js.native
  def TSInterfaceDeclaration(id: Identifier, typeParameters: scala.Null, extends_ : scala.Null, body: TSInterfaceBody): babelDashTypesLib.babelDashTypesMod.TSInterfaceDeclaration = js.native
  def TSIntersectionType(types: js.Array[TSType]): babelDashTypesLib.babelDashTypesMod.TSIntersectionType = js.native
  def TSLiteralType(literal: BooleanLiteral): babelDashTypesLib.babelDashTypesMod.TSLiteralType = js.native
  def TSLiteralType(literal: NumericLiteral): babelDashTypesLib.babelDashTypesMod.TSLiteralType = js.native
  def TSLiteralType(literal: StringLiteral): babelDashTypesLib.babelDashTypesMod.TSLiteralType = js.native
  def TSMappedType(typeParameter: TypeParameter): babelDashTypesLib.babelDashTypesMod.TSMappedType = js.native
  def TSMappedType(typeParameter: TypeParameter, typeAnnotation: TSType): babelDashTypesLib.babelDashTypesMod.TSMappedType = js.native
  def TSMethodSignature(key: Expression): babelDashTypesLib.babelDashTypesMod.TSMethodSignature = js.native
  def TSMethodSignature(key: Expression, typeParameters: TypeParameterDeclaration): babelDashTypesLib.babelDashTypesMod.TSMethodSignature = js.native
  def TSMethodSignature(
    key: Expression,
    typeParameters: TypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement]
  ): babelDashTypesLib.babelDashTypesMod.TSMethodSignature = js.native
  def TSMethodSignature(
    key: Expression,
    typeParameters: TypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): babelDashTypesLib.babelDashTypesMod.TSMethodSignature = js.native
  def TSModuleBlock(body: js.Array[Statement]): babelDashTypesLib.babelDashTypesMod.TSModuleBlock = js.native
  def TSModuleDeclaration(id: Identifier, body: TSModuleBlock): babelDashTypesLib.babelDashTypesMod.TSModuleDeclaration = js.native
  def TSModuleDeclaration(id: Identifier, body: TSModuleDeclaration): babelDashTypesLib.babelDashTypesMod.TSModuleDeclaration = js.native
  def TSModuleDeclaration(id: StringLiteral, body: TSModuleBlock): babelDashTypesLib.babelDashTypesMod.TSModuleDeclaration = js.native
  def TSModuleDeclaration(id: StringLiteral, body: TSModuleDeclaration): babelDashTypesLib.babelDashTypesMod.TSModuleDeclaration = js.native
  def TSNamespaceExportDeclaration(id: Identifier): babelDashTypesLib.babelDashTypesMod.TSNamespaceExportDeclaration = js.native
  def TSNeverKeyword(): babelDashTypesLib.babelDashTypesMod.TSNeverKeyword = js.native
  def TSNonNullExpression(expression: Expression): babelDashTypesLib.babelDashTypesMod.TSNonNullExpression = js.native
  def TSNullKeyword(): babelDashTypesLib.babelDashTypesMod.TSNullKeyword = js.native
  def TSNumberKeyword(): babelDashTypesLib.babelDashTypesMod.TSNumberKeyword = js.native
  def TSObjectKeyword(): babelDashTypesLib.babelDashTypesMod.TSObjectKeyword = js.native
  def TSParameterProperty(parameter: AssignmentPattern): babelDashTypesLib.babelDashTypesMod.TSParameterProperty = js.native
  def TSParameterProperty(parameter: Identifier): babelDashTypesLib.babelDashTypesMod.TSParameterProperty = js.native
  def TSParenthesizedType(typeAnnotation: TSType): babelDashTypesLib.babelDashTypesMod.TSParenthesizedType = js.native
  def TSPropertySignature(key: Expression): babelDashTypesLib.babelDashTypesMod.TSPropertySignature = js.native
  def TSPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation): babelDashTypesLib.babelDashTypesMod.TSPropertySignature = js.native
  def TSPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression): babelDashTypesLib.babelDashTypesMod.TSPropertySignature = js.native
  def TSQualifiedName(left: TSEntityName, right: Identifier): babelDashTypesLib.babelDashTypesMod.TSQualifiedName = js.native
  def TSStringKeyword(): babelDashTypesLib.babelDashTypesMod.TSStringKeyword = js.native
  def TSSymbolKeyword(): babelDashTypesLib.babelDashTypesMod.TSSymbolKeyword = js.native
  def TSThisType(): babelDashTypesLib.babelDashTypesMod.TSThisType = js.native
  def TSTupleType(elementTypes: js.Array[TSType]): babelDashTypesLib.babelDashTypesMod.TSTupleType = js.native
  def TSTypeAliasDeclaration(id: Identifier, typeParameters: TypeParameterDeclaration, typeAnnotation: TSType): babelDashTypesLib.babelDashTypesMod.TSTypeAliasDeclaration = js.native
  def TSTypeAliasDeclaration(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSType): babelDashTypesLib.babelDashTypesMod.TSTypeAliasDeclaration = js.native
  def TSTypeAliasDeclaration(id: Identifier, typeParameters: scala.Null, typeAnnotation: TSType): babelDashTypesLib.babelDashTypesMod.TSTypeAliasDeclaration = js.native
  def TSTypeAnnotation(typeAnnotation: TSType): babelDashTypesLib.babelDashTypesMod.TSTypeAnnotation = js.native
  def TSTypeAssertion(typeAnnotation: TSType, expression: Expression): babelDashTypesLib.babelDashTypesMod.TSTypeAssertion = js.native
  def TSTypeLiteral(members: js.Array[TSTypeElement]): babelDashTypesLib.babelDashTypesMod.TSTypeLiteral = js.native
  def TSTypeOperator(typeAnnotation: TSType): babelDashTypesLib.babelDashTypesMod.TSTypeOperator = js.native
  def TSTypeParameter(): babelDashTypesLib.babelDashTypesMod.TSTypeParameter = js.native
  def TSTypeParameter(constraint: TSType): babelDashTypesLib.babelDashTypesMod.TSTypeParameter = js.native
  def TSTypeParameter(constraint: TSType, default_ : TSType): babelDashTypesLib.babelDashTypesMod.TSTypeParameter = js.native
  def TSTypeParameterDeclaration(params: js.Array[TSTypeParameter]): babelDashTypesLib.babelDashTypesMod.TSTypeParameterDeclaration = js.native
  def TSTypeParameterInstantiation(params: js.Array[TSType]): babelDashTypesLib.babelDashTypesMod.TSTypeParameterInstantiation = js.native
  def TSTypePredicate(parameterName: Identifier, typeAnnotation: TSTypeAnnotation): babelDashTypesLib.babelDashTypesMod.TSTypePredicate = js.native
  def TSTypePredicate(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation): babelDashTypesLib.babelDashTypesMod.TSTypePredicate = js.native
  def TSTypeQuery(exprName: TSEntityName): babelDashTypesLib.babelDashTypesMod.TSTypeQuery = js.native
  def TSTypeReference(typeName: TSEntityName): babelDashTypesLib.babelDashTypesMod.TSTypeReference = js.native
  def TSTypeReference(typeName: TSEntityName, typeParameters: TypeParameterInstantiation): babelDashTypesLib.babelDashTypesMod.TSTypeReference = js.native
  def TSUndefinedKeyword(): babelDashTypesLib.babelDashTypesMod.TSUndefinedKeyword = js.native
  def TSUnionType(types: js.Array[TSType]): babelDashTypesLib.babelDashTypesMod.TSUnionType = js.native
  def TSVoidKeyword(): babelDashTypesLib.babelDashTypesMod.TSVoidKeyword = js.native
  def anyTypeAnnotation(): AnyTypeAnnotation = js.native
  def arrayExpression(): ArrayExpression = js.native
  def arrayExpression(elements: js.Array[scala.Null | Expression | SpreadElement]): ArrayExpression = js.native
  def arrayPattern(): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[Expression]): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[Expression], typeAnnotation: TypeAnnotation): ArrayPattern = js.native
  def arrayTypeAnnotation(): ArrayTypeAnnotation = js.native
  def arrayTypeAnnotation(elementType: FlowTypeAnnotation): ArrayTypeAnnotation = js.native
  def arrowFunctionExpression(): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[LVal]): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[LVal], body: BlockStatement): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[LVal], body: BlockStatement, async: scala.Boolean): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[LVal], body: Expression): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[LVal], body: Expression, async: scala.Boolean): ArrowFunctionExpression = js.native
  def assertAnyTypeAnnotation(): scala.Unit = js.native
  def assertAnyTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertAnyTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertAnyTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertAnyTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertArrayExpression(): scala.Unit = js.native
  def assertArrayExpression(node: js.Object): scala.Unit = js.native
  def assertArrayExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertArrayExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertArrayExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertArrayPattern(): scala.Unit = js.native
  def assertArrayPattern(node: js.Object): scala.Unit = js.native
  def assertArrayPattern(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertArrayPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertArrayPattern(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertArrayTypeAnnotation(): scala.Unit = js.native
  def assertArrayTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertArrayTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertArrayTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertArrayTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertArrowFunctionExpression(): scala.Unit = js.native
  def assertArrowFunctionExpression(node: js.Object): scala.Unit = js.native
  def assertArrowFunctionExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertArrowFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertArrowFunctionExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertAssignmentExpression(): scala.Unit = js.native
  def assertAssignmentExpression(node: js.Object): scala.Unit = js.native
  def assertAssignmentExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertAssignmentExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertAssignmentExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertAssignmentPattern(): scala.Unit = js.native
  def assertAssignmentPattern(node: js.Object): scala.Unit = js.native
  def assertAssignmentPattern(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertAssignmentPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertAssignmentPattern(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertAwaitExpression(): scala.Unit = js.native
  def assertAwaitExpression(node: js.Object): scala.Unit = js.native
  def assertAwaitExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertAwaitExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertAwaitExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertBinary(): scala.Unit = js.native
  def assertBinary(node: js.Object): scala.Unit = js.native
  def assertBinary(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertBinary(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertBinary(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertBinaryExpression(): scala.Unit = js.native
  def assertBinaryExpression(node: js.Object): scala.Unit = js.native
  def assertBinaryExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertBinaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertBinaryExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertBindExpression(): scala.Unit = js.native
  def assertBindExpression(node: js.Object): scala.Unit = js.native
  def assertBindExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertBindExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertBindExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertBlock(): scala.Unit = js.native
  def assertBlock(node: js.Object): scala.Unit = js.native
  def assertBlock(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertBlock(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertBlockParent(): scala.Unit = js.native
  def assertBlockParent(node: js.Object): scala.Unit = js.native
  def assertBlockParent(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertBlockParent(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertBlockParent(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertBlockStatement(): scala.Unit = js.native
  def assertBlockStatement(node: js.Object): scala.Unit = js.native
  def assertBlockStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertBlockStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertBlockStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertBooleanLiteral(): scala.Unit = js.native
  def assertBooleanLiteral(node: js.Object): scala.Unit = js.native
  def assertBooleanLiteral(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertBooleanLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertBooleanLiteral(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertBooleanLiteralTypeAnnotation(): scala.Unit = js.native
  def assertBooleanLiteralTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertBooleanLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertBooleanLiteralTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertBooleanTypeAnnotation(): scala.Unit = js.native
  def assertBooleanTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertBooleanTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertBooleanTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertBooleanTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertBreakStatement(): scala.Unit = js.native
  def assertBreakStatement(node: js.Object): scala.Unit = js.native
  def assertBreakStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertBreakStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertBreakStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertCallExpression(): scala.Unit = js.native
  def assertCallExpression(node: js.Object): scala.Unit = js.native
  def assertCallExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertCallExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertCallExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertCatchClause(): scala.Unit = js.native
  def assertCatchClause(node: js.Object): scala.Unit = js.native
  def assertCatchClause(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertCatchClause(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertCatchClause(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertClass(): scala.Unit = js.native
  def assertClass(node: js.Object): scala.Unit = js.native
  def assertClass(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertClass(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertClass(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertClassBody(): scala.Unit = js.native
  def assertClassBody(node: js.Object): scala.Unit = js.native
  def assertClassBody(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertClassBody(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertClassBody(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertClassDeclaration(): scala.Unit = js.native
  def assertClassDeclaration(node: js.Object): scala.Unit = js.native
  def assertClassDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertClassDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertClassDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertClassExpression(): scala.Unit = js.native
  def assertClassExpression(node: js.Object): scala.Unit = js.native
  def assertClassExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertClassExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertClassExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertClassImplements(): scala.Unit = js.native
  def assertClassImplements(node: js.Object): scala.Unit = js.native
  def assertClassImplements(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertClassImplements(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertClassImplements(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertClassMethod(): scala.Unit = js.native
  def assertClassMethod(node: js.Object): scala.Unit = js.native
  def assertClassMethod(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertClassMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertClassMethod(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertClassProperty(): scala.Unit = js.native
  def assertClassProperty(node: js.Object): scala.Unit = js.native
  def assertClassProperty(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertClassProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertClassProperty(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertCompletionStatement(): scala.Unit = js.native
  def assertCompletionStatement(node: js.Object): scala.Unit = js.native
  def assertCompletionStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertCompletionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertCompletionStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertConditional(): scala.Unit = js.native
  def assertConditional(node: js.Object): scala.Unit = js.native
  def assertConditional(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertConditional(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertConditional(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertConditionalExpression(): scala.Unit = js.native
  def assertConditionalExpression(node: js.Object): scala.Unit = js.native
  def assertConditionalExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertConditionalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertConditionalExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertContinueStatement(): scala.Unit = js.native
  def assertContinueStatement(node: js.Object): scala.Unit = js.native
  def assertContinueStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertContinueStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertContinueStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDebuggerStatement(): scala.Unit = js.native
  def assertDebuggerStatement(node: js.Object): scala.Unit = js.native
  def assertDebuggerStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDebuggerStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDebuggerStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDeclaration(): scala.Unit = js.native
  def assertDeclaration(node: js.Object): scala.Unit = js.native
  def assertDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDeclareClass(): scala.Unit = js.native
  def assertDeclareClass(node: js.Object): scala.Unit = js.native
  def assertDeclareClass(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDeclareClass(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDeclareClass(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDeclareFunction(): scala.Unit = js.native
  def assertDeclareFunction(node: js.Object): scala.Unit = js.native
  def assertDeclareFunction(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDeclareFunction(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDeclareInterface(): scala.Unit = js.native
  def assertDeclareInterface(node: js.Object): scala.Unit = js.native
  def assertDeclareInterface(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDeclareInterface(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDeclareInterface(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDeclareModule(): scala.Unit = js.native
  def assertDeclareModule(node: js.Object): scala.Unit = js.native
  def assertDeclareModule(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDeclareModule(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDeclareModule(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDeclareTypeAlias(): scala.Unit = js.native
  def assertDeclareTypeAlias(node: js.Object): scala.Unit = js.native
  def assertDeclareTypeAlias(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDeclareTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDeclareTypeAlias(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDeclareVariable(): scala.Unit = js.native
  def assertDeclareVariable(node: js.Object): scala.Unit = js.native
  def assertDeclareVariable(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDeclareVariable(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDeclareVariable(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDecorator(): scala.Unit = js.native
  def assertDecorator(node: js.Object): scala.Unit = js.native
  def assertDecorator(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDecorator(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDecorator(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDirective(): scala.Unit = js.native
  def assertDirective(node: js.Object): scala.Unit = js.native
  def assertDirective(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDirective(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDirective(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDirectiveLiteral(): scala.Unit = js.native
  def assertDirectiveLiteral(node: js.Object): scala.Unit = js.native
  def assertDirectiveLiteral(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDirectiveLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDirectiveLiteral(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDoExpression(): scala.Unit = js.native
  def assertDoExpression(node: js.Object): scala.Unit = js.native
  def assertDoExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDoExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDoExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertDoWhileStatement(): scala.Unit = js.native
  def assertDoWhileStatement(node: js.Object): scala.Unit = js.native
  def assertDoWhileStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertDoWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertDoWhileStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertEmptyStatement(): scala.Unit = js.native
  def assertEmptyStatement(node: js.Object): scala.Unit = js.native
  def assertEmptyStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertEmptyStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertEmptyStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertExistentialTypeParam(): scala.Unit = js.native
  def assertExistentialTypeParam(node: js.Object): scala.Unit = js.native
  def assertExistentialTypeParam(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertExistentialTypeParam(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertExistentialTypeParam(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertExportAllDeclaration(): scala.Unit = js.native
  def assertExportAllDeclaration(node: js.Object): scala.Unit = js.native
  def assertExportAllDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertExportAllDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertExportAllDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertExportDeclaration(): scala.Unit = js.native
  def assertExportDeclaration(node: js.Object): scala.Unit = js.native
  def assertExportDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertExportDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertExportDefaultDeclaration(): scala.Unit = js.native
  def assertExportDefaultDeclaration(node: js.Object): scala.Unit = js.native
  def assertExportDefaultDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertExportDefaultDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertExportDefaultDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertExportDefaultSpecifier(): scala.Unit = js.native
  def assertExportDefaultSpecifier(node: js.Object): scala.Unit = js.native
  def assertExportDefaultSpecifier(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertExportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertExportDefaultSpecifier(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertExportNamedDeclaration(): scala.Unit = js.native
  def assertExportNamedDeclaration(node: js.Object): scala.Unit = js.native
  def assertExportNamedDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertExportNamedDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertExportNamedDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertExportNamespaceSpecifier(): scala.Unit = js.native
  def assertExportNamespaceSpecifier(node: js.Object): scala.Unit = js.native
  def assertExportNamespaceSpecifier(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertExportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertExportNamespaceSpecifier(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertExportSpecifier(): scala.Unit = js.native
  def assertExportSpecifier(node: js.Object): scala.Unit = js.native
  def assertExportSpecifier(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertExportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertExportSpecifier(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertExpression(): scala.Unit = js.native
  def assertExpression(node: js.Object): scala.Unit = js.native
  def assertExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertExpressionStatement(): scala.Unit = js.native
  def assertExpressionStatement(node: js.Object): scala.Unit = js.native
  def assertExpressionStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertExpressionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertExpressionStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertExpressionWrapper(): scala.Unit = js.native
  def assertExpressionWrapper(node: js.Object): scala.Unit = js.native
  def assertExpressionWrapper(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertExpressionWrapper(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertExpressionWrapper(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertFile(): scala.Unit = js.native
  def assertFile(node: js.Object): scala.Unit = js.native
  def assertFile(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertFile(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertFile(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertFlow(): scala.Unit = js.native
  def assertFlow(node: js.Object): scala.Unit = js.native
  def assertFlow(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertFlow(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertFlow(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertFlowBaseAnnotation(): scala.Unit = js.native
  def assertFlowBaseAnnotation(node: js.Object): scala.Unit = js.native
  def assertFlowBaseAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertFlowBaseAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertFlowBaseAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertFlowDeclaration(): scala.Unit = js.native
  def assertFlowDeclaration(node: js.Object): scala.Unit = js.native
  def assertFlowDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertFlowDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertFlowDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertFor(): scala.Unit = js.native
  def assertFor(node: js.Object): scala.Unit = js.native
  def assertFor(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertFor(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertFor(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertForInStatement(): scala.Unit = js.native
  def assertForInStatement(node: js.Object): scala.Unit = js.native
  def assertForInStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertForInStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertForInStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertForOfStatement(): scala.Unit = js.native
  def assertForOfStatement(node: js.Object): scala.Unit = js.native
  def assertForOfStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertForOfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertForOfStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertForStatement(): scala.Unit = js.native
  def assertForStatement(node: js.Object): scala.Unit = js.native
  def assertForStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertForStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertForStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertForXStatement(): scala.Unit = js.native
  def assertForXStatement(node: js.Object): scala.Unit = js.native
  def assertForXStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertForXStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertForXStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertFunction(): scala.Unit = js.native
  def assertFunction(node: js.Object): scala.Unit = js.native
  def assertFunction(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertFunction(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertFunctionDeclaration(): scala.Unit = js.native
  def assertFunctionDeclaration(node: js.Object): scala.Unit = js.native
  def assertFunctionDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertFunctionDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertFunctionDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertFunctionExpression(): scala.Unit = js.native
  def assertFunctionExpression(node: js.Object): scala.Unit = js.native
  def assertFunctionExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertFunctionExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertFunctionParent(): scala.Unit = js.native
  def assertFunctionParent(node: js.Object): scala.Unit = js.native
  def assertFunctionParent(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertFunctionParent(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertFunctionParent(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertFunctionTypeAnnotation(): scala.Unit = js.native
  def assertFunctionTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertFunctionTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertFunctionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertFunctionTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertFunctionTypeParam(): scala.Unit = js.native
  def assertFunctionTypeParam(node: js.Object): scala.Unit = js.native
  def assertFunctionTypeParam(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertFunctionTypeParam(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertFunctionTypeParam(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertGenericTypeAnnotation(): scala.Unit = js.native
  def assertGenericTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertGenericTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertGenericTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertGenericTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertIdentifier(): scala.Unit = js.native
  def assertIdentifier(node: js.Object): scala.Unit = js.native
  def assertIdentifier(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertIdentifier(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertIfStatement(): scala.Unit = js.native
  def assertIfStatement(node: js.Object): scala.Unit = js.native
  def assertIfStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertIfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertIfStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertImmutable(): scala.Unit = js.native
  def assertImmutable(node: js.Object): scala.Unit = js.native
  def assertImmutable(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertImmutable(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertImmutable(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertImportDeclaration(): scala.Unit = js.native
  def assertImportDeclaration(node: js.Object): scala.Unit = js.native
  def assertImportDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertImportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertImportDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertImportDefaultSpecifier(): scala.Unit = js.native
  def assertImportDefaultSpecifier(node: js.Object): scala.Unit = js.native
  def assertImportDefaultSpecifier(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertImportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertImportDefaultSpecifier(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertImportNamespaceSpecifier(): scala.Unit = js.native
  def assertImportNamespaceSpecifier(node: js.Object): scala.Unit = js.native
  def assertImportNamespaceSpecifier(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertImportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertImportNamespaceSpecifier(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertImportSpecifier(): scala.Unit = js.native
  def assertImportSpecifier(node: js.Object): scala.Unit = js.native
  def assertImportSpecifier(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertImportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertImportSpecifier(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertInterfaceDeclaration(): scala.Unit = js.native
  def assertInterfaceDeclaration(node: js.Object): scala.Unit = js.native
  def assertInterfaceDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertInterfaceDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertInterfaceExtends(): scala.Unit = js.native
  def assertInterfaceExtends(node: js.Object): scala.Unit = js.native
  def assertInterfaceExtends(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertInterfaceExtends(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertInterfaceExtends(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertIntersectionTypeAnnotation(): scala.Unit = js.native
  def assertIntersectionTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertIntersectionTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertIntersectionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertIntersectionTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSX(): scala.Unit = js.native
  def assertJSX(node: js.Object): scala.Unit = js.native
  def assertJSX(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSX(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSX(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSXAttribute(): scala.Unit = js.native
  def assertJSXAttribute(node: js.Object): scala.Unit = js.native
  def assertJSXAttribute(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSXAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSXAttribute(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSXClosingElement(): scala.Unit = js.native
  def assertJSXClosingElement(node: js.Object): scala.Unit = js.native
  def assertJSXClosingElement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSXClosingElement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSXClosingElement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSXElement(): scala.Unit = js.native
  def assertJSXElement(node: js.Object): scala.Unit = js.native
  def assertJSXElement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSXElement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSXElement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSXEmptyExpression(): scala.Unit = js.native
  def assertJSXEmptyExpression(node: js.Object): scala.Unit = js.native
  def assertJSXEmptyExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSXEmptyExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSXEmptyExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSXExpressionContainer(): scala.Unit = js.native
  def assertJSXExpressionContainer(node: js.Object): scala.Unit = js.native
  def assertJSXExpressionContainer(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSXExpressionContainer(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSXExpressionContainer(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSXIdentifier(): scala.Unit = js.native
  def assertJSXIdentifier(node: js.Object): scala.Unit = js.native
  def assertJSXIdentifier(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSXIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSXIdentifier(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSXMemberExpression(): scala.Unit = js.native
  def assertJSXMemberExpression(node: js.Object): scala.Unit = js.native
  def assertJSXMemberExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSXMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSXMemberExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSXNamespacedName(): scala.Unit = js.native
  def assertJSXNamespacedName(node: js.Object): scala.Unit = js.native
  def assertJSXNamespacedName(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSXNamespacedName(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSXNamespacedName(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSXOpeningElement(): scala.Unit = js.native
  def assertJSXOpeningElement(node: js.Object): scala.Unit = js.native
  def assertJSXOpeningElement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSXOpeningElement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSXOpeningElement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSXSpreadAttribute(): scala.Unit = js.native
  def assertJSXSpreadAttribute(node: js.Object): scala.Unit = js.native
  def assertJSXSpreadAttribute(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSXSpreadAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSXSpreadAttribute(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertJSXText(): scala.Unit = js.native
  def assertJSXText(node: js.Object): scala.Unit = js.native
  def assertJSXText(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertJSXText(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertJSXText(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertLVal(): scala.Unit = js.native
  def assertLVal(node: js.Object): scala.Unit = js.native
  def assertLVal(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertLVal(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertLVal(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertLabeledStatement(): scala.Unit = js.native
  def assertLabeledStatement(node: js.Object): scala.Unit = js.native
  def assertLabeledStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertLabeledStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertLabeledStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertLiteral(): scala.Unit = js.native
  def assertLiteral(node: js.Object): scala.Unit = js.native
  def assertLiteral(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertLiteral(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertLogicalExpression(): scala.Unit = js.native
  def assertLogicalExpression(node: js.Object): scala.Unit = js.native
  def assertLogicalExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertLogicalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertLogicalExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertLoop(): scala.Unit = js.native
  def assertLoop(node: js.Object): scala.Unit = js.native
  def assertLoop(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertLoop(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertLoop(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertMemberExpression(): scala.Unit = js.native
  def assertMemberExpression(node: js.Object): scala.Unit = js.native
  def assertMemberExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertMemberExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertMetaProperty(): scala.Unit = js.native
  def assertMetaProperty(node: js.Object): scala.Unit = js.native
  def assertMetaProperty(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertMetaProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertMetaProperty(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertMethod(): scala.Unit = js.native
  def assertMethod(node: js.Object): scala.Unit = js.native
  def assertMethod(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertMethod(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertMixedTypeAnnotation(): scala.Unit = js.native
  def assertMixedTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertMixedTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertMixedTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertMixedTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertModuleDeclaration(): scala.Unit = js.native
  def assertModuleDeclaration(node: js.Object): scala.Unit = js.native
  def assertModuleDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertModuleDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertModuleSpecifier(): scala.Unit = js.native
  def assertModuleSpecifier(node: js.Object): scala.Unit = js.native
  def assertModuleSpecifier(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertModuleSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertModuleSpecifier(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertNewExpression(): scala.Unit = js.native
  def assertNewExpression(node: js.Object): scala.Unit = js.native
  def assertNewExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertNewExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertNewExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertNoop(): scala.Unit = js.native
  def assertNoop(node: js.Object): scala.Unit = js.native
  def assertNoop(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertNoop(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertNoop(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertNullLiteral(): scala.Unit = js.native
  def assertNullLiteral(node: js.Object): scala.Unit = js.native
  def assertNullLiteral(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertNullLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertNullLiteral(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertNullLiteralTypeAnnotation(): scala.Unit = js.native
  def assertNullLiteralTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertNullLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertNullLiteralTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertNullableTypeAnnotation(): scala.Unit = js.native
  def assertNullableTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertNullableTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertNullableTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertNullableTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertNumberLiteral(): scala.Unit = js.native
  def assertNumberLiteral(node: js.Object): scala.Unit = js.native
  def assertNumberLiteral(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertNumberLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertNumberLiteral(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertNumberTypeAnnotation(): scala.Unit = js.native
  def assertNumberTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertNumberTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertNumberTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertNumberTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertNumericLiteral(): scala.Unit = js.native
  def assertNumericLiteral(node: js.Object): scala.Unit = js.native
  def assertNumericLiteral(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertNumericLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertNumericLiteral(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertNumericLiteralTypeAnnotation(): scala.Unit = js.native
  def assertNumericLiteralTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertNumericLiteralTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertNumericLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertNumericLiteralTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertObjectExpression(): scala.Unit = js.native
  def assertObjectExpression(node: js.Object): scala.Unit = js.native
  def assertObjectExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertObjectExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertObjectExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertObjectMember(): scala.Unit = js.native
  def assertObjectMember(node: js.Object): scala.Unit = js.native
  def assertObjectMember(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertObjectMember(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertObjectMember(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertObjectMethod(): scala.Unit = js.native
  def assertObjectMethod(node: js.Object): scala.Unit = js.native
  def assertObjectMethod(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertObjectMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertObjectMethod(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertObjectPattern(): scala.Unit = js.native
  def assertObjectPattern(node: js.Object): scala.Unit = js.native
  def assertObjectPattern(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertObjectPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertObjectPattern(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertObjectProperty(): scala.Unit = js.native
  def assertObjectProperty(node: js.Object): scala.Unit = js.native
  def assertObjectProperty(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertObjectProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertObjectProperty(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertObjectTypeAnnotation(): scala.Unit = js.native
  def assertObjectTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertObjectTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertObjectTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertObjectTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertObjectTypeCallProperty(): scala.Unit = js.native
  def assertObjectTypeCallProperty(node: js.Object): scala.Unit = js.native
  def assertObjectTypeCallProperty(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertObjectTypeCallProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertObjectTypeCallProperty(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertObjectTypeIndexer(): scala.Unit = js.native
  def assertObjectTypeIndexer(node: js.Object): scala.Unit = js.native
  def assertObjectTypeIndexer(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertObjectTypeIndexer(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertObjectTypeIndexer(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertObjectTypeProperty(): scala.Unit = js.native
  def assertObjectTypeProperty(node: js.Object): scala.Unit = js.native
  def assertObjectTypeProperty(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertObjectTypeProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertObjectTypeProperty(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertParenthesizedExpression(): scala.Unit = js.native
  def assertParenthesizedExpression(node: js.Object): scala.Unit = js.native
  def assertParenthesizedExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertParenthesizedExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertParenthesizedExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertPattern(): scala.Unit = js.native
  def assertPattern(node: js.Object): scala.Unit = js.native
  def assertPattern(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertPattern(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertProgram(): scala.Unit = js.native
  def assertProgram(node: js.Object): scala.Unit = js.native
  def assertProgram(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertProgram(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertProgram(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertProperty(): scala.Unit = js.native
  def assertProperty(node: js.Object): scala.Unit = js.native
  def assertProperty(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertProperty(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertPureish(): scala.Unit = js.native
  def assertPureish(node: js.Object): scala.Unit = js.native
  def assertPureish(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertPureish(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertPureish(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertQualifiedTypeIdentifier(): scala.Unit = js.native
  def assertQualifiedTypeIdentifier(node: js.Object): scala.Unit = js.native
  def assertQualifiedTypeIdentifier(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertQualifiedTypeIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertQualifiedTypeIdentifier(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertRegExpLiteral(): scala.Unit = js.native
  def assertRegExpLiteral(node: js.Object): scala.Unit = js.native
  def assertRegExpLiteral(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertRegExpLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertRegExpLiteral(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertRegexLiteral(): scala.Unit = js.native
  def assertRegexLiteral(node: js.Object): scala.Unit = js.native
  def assertRegexLiteral(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertRegexLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertRegexLiteral(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertRestElement(): scala.Unit = js.native
  def assertRestElement(node: js.Object): scala.Unit = js.native
  def assertRestElement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertRestElement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertRestElement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertRestProperty(): scala.Unit = js.native
  def assertRestProperty(node: js.Object): scala.Unit = js.native
  def assertRestProperty(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertRestProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertRestProperty(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertReturnStatement(): scala.Unit = js.native
  def assertReturnStatement(node: js.Object): scala.Unit = js.native
  def assertReturnStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertReturnStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertReturnStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertScopable(): scala.Unit = js.native
  def assertScopable(node: js.Object): scala.Unit = js.native
  def assertScopable(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertScopable(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertScopable(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertSequenceExpression(): scala.Unit = js.native
  def assertSequenceExpression(node: js.Object): scala.Unit = js.native
  def assertSequenceExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertSequenceExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertSequenceExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertSpreadElement(): scala.Unit = js.native
  def assertSpreadElement(node: js.Object): scala.Unit = js.native
  def assertSpreadElement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertSpreadElement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertSpreadElement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertSpreadProperty(): scala.Unit = js.native
  def assertSpreadProperty(node: js.Object): scala.Unit = js.native
  def assertSpreadProperty(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertSpreadProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertSpreadProperty(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertStatement(): scala.Unit = js.native
  def assertStatement(node: js.Object): scala.Unit = js.native
  def assertStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertStringLiteral(): scala.Unit = js.native
  def assertStringLiteral(node: js.Object): scala.Unit = js.native
  def assertStringLiteral(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertStringLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertStringLiteral(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertStringLiteralTypeAnnotation(): scala.Unit = js.native
  def assertStringLiteralTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertStringLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertStringLiteralTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertStringTypeAnnotation(): scala.Unit = js.native
  def assertStringTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertStringTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertStringTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertStringTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertSuper(): scala.Unit = js.native
  def assertSuper(node: js.Object): scala.Unit = js.native
  def assertSuper(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertSuper(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertSuper(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertSwitchCase(): scala.Unit = js.native
  def assertSwitchCase(node: js.Object): scala.Unit = js.native
  def assertSwitchCase(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertSwitchCase(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertSwitchCase(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertSwitchStatement(): scala.Unit = js.native
  def assertSwitchStatement(node: js.Object): scala.Unit = js.native
  def assertSwitchStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertSwitchStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertSwitchStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSAnyKeyword(): scala.Unit = js.native
  def assertTSAnyKeyword(node: js.Object): scala.Unit = js.native
  def assertTSAnyKeyword(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSAnyKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSAnyKeyword(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSArrayType(): scala.Unit = js.native
  def assertTSArrayType(node: js.Object): scala.Unit = js.native
  def assertTSArrayType(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSArrayType(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSArrayType(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSAsExpression(): scala.Unit = js.native
  def assertTSAsExpression(node: js.Object): scala.Unit = js.native
  def assertTSAsExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSAsExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSAsExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSBooleanKeyword(): scala.Unit = js.native
  def assertTSBooleanKeyword(node: js.Object): scala.Unit = js.native
  def assertTSBooleanKeyword(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSBooleanKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSBooleanKeyword(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSCallSignatureDeclaration(): scala.Unit = js.native
  def assertTSCallSignatureDeclaration(node: js.Object): scala.Unit = js.native
  def assertTSCallSignatureDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSCallSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSCallSignatureDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSConstructSignatureDeclaration(): scala.Unit = js.native
  def assertTSConstructSignatureDeclaration(node: js.Object): scala.Unit = js.native
  def assertTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSConstructSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSConstructSignatureDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSConstructorType(): scala.Unit = js.native
  def assertTSConstructorType(node: js.Object): scala.Unit = js.native
  def assertTSConstructorType(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSConstructorType(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSConstructorType(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSDeclareFunction(): scala.Unit = js.native
  def assertTSDeclareFunction(node: js.Object): scala.Unit = js.native
  def assertTSDeclareFunction(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSDeclareFunction(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSDeclareMethod(): scala.Unit = js.native
  def assertTSDeclareMethod(node: js.Object): scala.Unit = js.native
  def assertTSDeclareMethod(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSDeclareMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSDeclareMethod(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSEnumDeclaration(): scala.Unit = js.native
  def assertTSEnumDeclaration(node: js.Object): scala.Unit = js.native
  def assertTSEnumDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSEnumDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSEnumDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSEnumMember(): scala.Unit = js.native
  def assertTSEnumMember(node: js.Object): scala.Unit = js.native
  def assertTSEnumMember(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSEnumMember(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSEnumMember(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSExportAssignment(): scala.Unit = js.native
  def assertTSExportAssignment(node: js.Object): scala.Unit = js.native
  def assertTSExportAssignment(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSExportAssignment(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSExportAssignment(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSExpressionWithTypeArguments(): scala.Unit = js.native
  def assertTSExpressionWithTypeArguments(node: js.Object): scala.Unit = js.native
  def assertTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSExpressionWithTypeArguments(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSExpressionWithTypeArguments(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSExternalModuleReference(): scala.Unit = js.native
  def assertTSExternalModuleReference(node: js.Object): scala.Unit = js.native
  def assertTSExternalModuleReference(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSExternalModuleReference(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSExternalModuleReference(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSFunctionType(): scala.Unit = js.native
  def assertTSFunctionType(node: js.Object): scala.Unit = js.native
  def assertTSFunctionType(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSFunctionType(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSFunctionType(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSImportEqualsDeclaration(): scala.Unit = js.native
  def assertTSImportEqualsDeclaration(node: js.Object): scala.Unit = js.native
  def assertTSImportEqualsDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSImportEqualsDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSImportEqualsDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSIndexSignature(): scala.Unit = js.native
  def assertTSIndexSignature(node: js.Object): scala.Unit = js.native
  def assertTSIndexSignature(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSIndexSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSIndexSignature(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSIndexedAccessType(): scala.Unit = js.native
  def assertTSIndexedAccessType(node: js.Object): scala.Unit = js.native
  def assertTSIndexedAccessType(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSIndexedAccessType(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSIndexedAccessType(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSInterfaceBody(): scala.Unit = js.native
  def assertTSInterfaceBody(node: js.Object): scala.Unit = js.native
  def assertTSInterfaceBody(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSInterfaceBody(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSInterfaceBody(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSInterfaceDeclaration(): scala.Unit = js.native
  def assertTSInterfaceDeclaration(node: js.Object): scala.Unit = js.native
  def assertTSInterfaceDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSInterfaceDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSIntersectionType(): scala.Unit = js.native
  def assertTSIntersectionType(node: js.Object): scala.Unit = js.native
  def assertTSIntersectionType(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSIntersectionType(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSIntersectionType(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSLiteralType(): scala.Unit = js.native
  def assertTSLiteralType(node: js.Object): scala.Unit = js.native
  def assertTSLiteralType(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSLiteralType(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSLiteralType(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSMappedType(): scala.Unit = js.native
  def assertTSMappedType(node: js.Object): scala.Unit = js.native
  def assertTSMappedType(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSMappedType(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSMappedType(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSMethodSignature(): scala.Unit = js.native
  def assertTSMethodSignature(node: js.Object): scala.Unit = js.native
  def assertTSMethodSignature(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSMethodSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSMethodSignature(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSModuleBlock(): scala.Unit = js.native
  def assertTSModuleBlock(node: js.Object): scala.Unit = js.native
  def assertTSModuleBlock(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSModuleBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSModuleBlock(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSModuleDeclaration(): scala.Unit = js.native
  def assertTSModuleDeclaration(node: js.Object): scala.Unit = js.native
  def assertTSModuleDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSModuleDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSNamespaceExportDeclaration(): scala.Unit = js.native
  def assertTSNamespaceExportDeclaration(node: js.Object): scala.Unit = js.native
  def assertTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSNamespaceExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSNamespaceExportDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSNeverKeyword(): scala.Unit = js.native
  def assertTSNeverKeyword(node: js.Object): scala.Unit = js.native
  def assertTSNeverKeyword(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSNeverKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSNeverKeyword(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSNonNullExpression(): scala.Unit = js.native
  def assertTSNonNullExpression(node: js.Object): scala.Unit = js.native
  def assertTSNonNullExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSNonNullExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSNonNullExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSNullKeyword(): scala.Unit = js.native
  def assertTSNullKeyword(node: js.Object): scala.Unit = js.native
  def assertTSNullKeyword(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSNullKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSNullKeyword(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSNumberKeyword(): scala.Unit = js.native
  def assertTSNumberKeyword(node: js.Object): scala.Unit = js.native
  def assertTSNumberKeyword(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSNumberKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSNumberKeyword(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSObjectKeyword(): scala.Unit = js.native
  def assertTSObjectKeyword(node: js.Object): scala.Unit = js.native
  def assertTSObjectKeyword(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSObjectKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSObjectKeyword(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSParameterProperty(): scala.Unit = js.native
  def assertTSParameterProperty(node: js.Object): scala.Unit = js.native
  def assertTSParameterProperty(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSParameterProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSParameterProperty(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSParenthesizedType(): scala.Unit = js.native
  def assertTSParenthesizedType(node: js.Object): scala.Unit = js.native
  def assertTSParenthesizedType(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSParenthesizedType(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSParenthesizedType(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSPropertySignature(): scala.Unit = js.native
  def assertTSPropertySignature(node: js.Object): scala.Unit = js.native
  def assertTSPropertySignature(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSPropertySignature(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSPropertySignature(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSQualifiedName(): scala.Unit = js.native
  def assertTSQualifiedName(node: js.Object): scala.Unit = js.native
  def assertTSQualifiedName(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSQualifiedName(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSQualifiedName(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSStringKeyword(): scala.Unit = js.native
  def assertTSStringKeyword(node: js.Object): scala.Unit = js.native
  def assertTSStringKeyword(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSStringKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSStringKeyword(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSSymbolKeyword(): scala.Unit = js.native
  def assertTSSymbolKeyword(node: js.Object): scala.Unit = js.native
  def assertTSSymbolKeyword(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSSymbolKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSSymbolKeyword(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSThisType(): scala.Unit = js.native
  def assertTSThisType(node: js.Object): scala.Unit = js.native
  def assertTSThisType(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSThisType(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSThisType(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTupleType(): scala.Unit = js.native
  def assertTSTupleType(node: js.Object): scala.Unit = js.native
  def assertTSTupleType(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTupleType(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTupleType(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTypeAliasDeclaration(): scala.Unit = js.native
  def assertTSTypeAliasDeclaration(node: js.Object): scala.Unit = js.native
  def assertTSTypeAliasDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTypeAliasDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTypeAliasDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTypeAnnotation(): scala.Unit = js.native
  def assertTSTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertTSTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTypeAssertion(): scala.Unit = js.native
  def assertTSTypeAssertion(node: js.Object): scala.Unit = js.native
  def assertTSTypeAssertion(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTypeAssertion(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTypeAssertion(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTypeLiteral(): scala.Unit = js.native
  def assertTSTypeLiteral(node: js.Object): scala.Unit = js.native
  def assertTSTypeLiteral(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTypeLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTypeLiteral(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTypeOperator(): scala.Unit = js.native
  def assertTSTypeOperator(node: js.Object): scala.Unit = js.native
  def assertTSTypeOperator(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTypeOperator(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTypeOperator(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTypeParameter(): scala.Unit = js.native
  def assertTSTypeParameter(node: js.Object): scala.Unit = js.native
  def assertTSTypeParameter(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTypeParameter(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTypeParameterDeclaration(): scala.Unit = js.native
  def assertTSTypeParameterDeclaration(node: js.Object): scala.Unit = js.native
  def assertTSTypeParameterDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTypeParameterDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTypeParameterInstantiation(): scala.Unit = js.native
  def assertTSTypeParameterInstantiation(node: js.Object): scala.Unit = js.native
  def assertTSTypeParameterInstantiation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTypeParameterInstantiation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTypePredicate(): scala.Unit = js.native
  def assertTSTypePredicate(node: js.Object): scala.Unit = js.native
  def assertTSTypePredicate(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTypePredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTypePredicate(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTypeQuery(): scala.Unit = js.native
  def assertTSTypeQuery(node: js.Object): scala.Unit = js.native
  def assertTSTypeQuery(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTypeQuery(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTypeQuery(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSTypeReference(): scala.Unit = js.native
  def assertTSTypeReference(node: js.Object): scala.Unit = js.native
  def assertTSTypeReference(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSTypeReference(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSTypeReference(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSUndefinedKeyword(): scala.Unit = js.native
  def assertTSUndefinedKeyword(node: js.Object): scala.Unit = js.native
  def assertTSUndefinedKeyword(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSUndefinedKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSUndefinedKeyword(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSUnionType(): scala.Unit = js.native
  def assertTSUnionType(node: js.Object): scala.Unit = js.native
  def assertTSUnionType(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSUnionType(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSUnionType(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTSVoidKeyword(): scala.Unit = js.native
  def assertTSVoidKeyword(node: js.Object): scala.Unit = js.native
  def assertTSVoidKeyword(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTSVoidKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTSVoidKeyword(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTaggedTemplateExpression(): scala.Unit = js.native
  def assertTaggedTemplateExpression(node: js.Object): scala.Unit = js.native
  def assertTaggedTemplateExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTaggedTemplateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTaggedTemplateExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTemplateElement(): scala.Unit = js.native
  def assertTemplateElement(node: js.Object): scala.Unit = js.native
  def assertTemplateElement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTemplateElement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTemplateElement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTemplateLiteral(): scala.Unit = js.native
  def assertTemplateLiteral(node: js.Object): scala.Unit = js.native
  def assertTemplateLiteral(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTemplateLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTemplateLiteral(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTerminatorless(): scala.Unit = js.native
  def assertTerminatorless(node: js.Object): scala.Unit = js.native
  def assertTerminatorless(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTerminatorless(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTerminatorless(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertThisExpression(): scala.Unit = js.native
  def assertThisExpression(node: js.Object): scala.Unit = js.native
  def assertThisExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertThisExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertThisExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertThisTypeAnnotation(): scala.Unit = js.native
  def assertThisTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertThisTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertThisTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertThisTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertThrowStatement(): scala.Unit = js.native
  def assertThrowStatement(node: js.Object): scala.Unit = js.native
  def assertThrowStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertThrowStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertThrowStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTryStatement(): scala.Unit = js.native
  def assertTryStatement(node: js.Object): scala.Unit = js.native
  def assertTryStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTryStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTryStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTupleTypeAnnotation(): scala.Unit = js.native
  def assertTupleTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertTupleTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTupleTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTupleTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTypeAlias(): scala.Unit = js.native
  def assertTypeAlias(node: js.Object): scala.Unit = js.native
  def assertTypeAlias(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTypeAlias(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTypeAnnotation(): scala.Unit = js.native
  def assertTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTypeCastExpression(): scala.Unit = js.native
  def assertTypeCastExpression(node: js.Object): scala.Unit = js.native
  def assertTypeCastExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTypeCastExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTypeCastExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTypeParameter(): scala.Unit = js.native
  def assertTypeParameter(node: js.Object): scala.Unit = js.native
  def assertTypeParameter(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTypeParameter(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTypeParameterDeclaration(): scala.Unit = js.native
  def assertTypeParameterDeclaration(node: js.Object): scala.Unit = js.native
  def assertTypeParameterDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTypeParameterDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTypeParameterInstantiation(): scala.Unit = js.native
  def assertTypeParameterInstantiation(node: js.Object): scala.Unit = js.native
  def assertTypeParameterInstantiation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTypeParameterInstantiation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertTypeofTypeAnnotation(): scala.Unit = js.native
  def assertTypeofTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertTypeofTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertTypeofTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertTypeofTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertUnaryExpression(): scala.Unit = js.native
  def assertUnaryExpression(node: js.Object): scala.Unit = js.native
  def assertUnaryExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertUnaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertUnaryExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertUnaryLike(): scala.Unit = js.native
  def assertUnaryLike(node: js.Object): scala.Unit = js.native
  def assertUnaryLike(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertUnaryLike(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertUnaryLike(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertUnionTypeAnnotation(): scala.Unit = js.native
  def assertUnionTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertUnionTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertUnionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertUnionTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertUpdateExpression(): scala.Unit = js.native
  def assertUpdateExpression(node: js.Object): scala.Unit = js.native
  def assertUpdateExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertUpdateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertUpdateExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertUserWhitespacable(): scala.Unit = js.native
  def assertUserWhitespacable(node: js.Object): scala.Unit = js.native
  def assertUserWhitespacable(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertUserWhitespacable(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertUserWhitespacable(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertVariableDeclaration(): scala.Unit = js.native
  def assertVariableDeclaration(node: js.Object): scala.Unit = js.native
  def assertVariableDeclaration(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertVariableDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertVariableDeclaration(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertVariableDeclarator(): scala.Unit = js.native
  def assertVariableDeclarator(node: js.Object): scala.Unit = js.native
  def assertVariableDeclarator(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertVariableDeclarator(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertVariableDeclarator(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertVoidTypeAnnotation(): scala.Unit = js.native
  def assertVoidTypeAnnotation(node: js.Object): scala.Unit = js.native
  def assertVoidTypeAnnotation(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertVoidTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertVoidTypeAnnotation(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertWhile(): scala.Unit = js.native
  def assertWhile(node: js.Object): scala.Unit = js.native
  def assertWhile(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertWhile(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertWhile(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertWhileStatement(): scala.Unit = js.native
  def assertWhileStatement(node: js.Object): scala.Unit = js.native
  def assertWhileStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertWhileStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertWithStatement(): scala.Unit = js.native
  def assertWithStatement(node: js.Object): scala.Unit = js.native
  def assertWithStatement(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertWithStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertWithStatement(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assertYieldExpression(): scala.Unit = js.native
  def assertYieldExpression(node: js.Object): scala.Unit = js.native
  def assertYieldExpression(node: js.Object, opts: js.Object): scala.Unit = js.native
  def assertYieldExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Unit = js.native
  def assertYieldExpression(node: scala.Null, opts: js.Object): scala.Unit = js.native
  def assignmentExpression(): AssignmentExpression = js.native
  def assignmentExpression(operator: java.lang.String): AssignmentExpression = js.native
  def assignmentExpression(operator: java.lang.String, left: LVal): AssignmentExpression = js.native
  def assignmentExpression(operator: java.lang.String, left: LVal, right: Expression): AssignmentExpression = js.native
  def assignmentPattern(): AssignmentPattern = js.native
  def assignmentPattern(left: Identifier): AssignmentPattern = js.native
  def assignmentPattern(left: Identifier, right: Expression): AssignmentPattern = js.native
  def awaitExpression(): AwaitExpression = js.native
  def awaitExpression(argument: Expression): AwaitExpression = js.native
  def binaryExpression(): BinaryExpression = js.native
  def binaryExpression(
    operator: babelDashTypesLib.babelDashTypesLibStrings.`+` | babelDashTypesLib.babelDashTypesLibStrings.`-` | babelDashTypesLib.babelDashTypesLibStrings.`/` | babelDashTypesLib.babelDashTypesLibStrings.`%` | babelDashTypesLib.babelDashTypesLibStrings.`*` | babelDashTypesLib.babelDashTypesLibStrings.`**` | babelDashTypesLib.babelDashTypesLibStrings.`&` | babelDashTypesLib.babelDashTypesLibStrings.`|` | babelDashTypesLib.babelDashTypesLibStrings.`>>` | babelDashTypesLib.babelDashTypesLibStrings.`>>>` | babelDashTypesLib.babelDashTypesLibStrings.`<<` | babelDashTypesLib.babelDashTypesLibStrings.`_backtick^_backtick` | babelDashTypesLib.babelDashTypesLibStrings.`==` | babelDashTypesLib.babelDashTypesLibStrings.`===` | babelDashTypesLib.babelDashTypesLibStrings.`!=` | babelDashTypesLib.babelDashTypesLibStrings.`!==` | babelDashTypesLib.babelDashTypesLibStrings.in | babelDashTypesLib.babelDashTypesLibStrings.instanceof | babelDashTypesLib.babelDashTypesLibStrings.`>` | babelDashTypesLib.babelDashTypesLibStrings.`<` | babelDashTypesLib.babelDashTypesLibStrings.`>=` | babelDashTypesLib.babelDashTypesLibStrings.`<=`
  ): BinaryExpression = js.native
  def binaryExpression(
    operator: babelDashTypesLib.babelDashTypesLibStrings.`+` | babelDashTypesLib.babelDashTypesLibStrings.`-` | babelDashTypesLib.babelDashTypesLibStrings.`/` | babelDashTypesLib.babelDashTypesLibStrings.`%` | babelDashTypesLib.babelDashTypesLibStrings.`*` | babelDashTypesLib.babelDashTypesLibStrings.`**` | babelDashTypesLib.babelDashTypesLibStrings.`&` | babelDashTypesLib.babelDashTypesLibStrings.`|` | babelDashTypesLib.babelDashTypesLibStrings.`>>` | babelDashTypesLib.babelDashTypesLibStrings.`>>>` | babelDashTypesLib.babelDashTypesLibStrings.`<<` | babelDashTypesLib.babelDashTypesLibStrings.`_backtick^_backtick` | babelDashTypesLib.babelDashTypesLibStrings.`==` | babelDashTypesLib.babelDashTypesLibStrings.`===` | babelDashTypesLib.babelDashTypesLibStrings.`!=` | babelDashTypesLib.babelDashTypesLibStrings.`!==` | babelDashTypesLib.babelDashTypesLibStrings.in | babelDashTypesLib.babelDashTypesLibStrings.instanceof | babelDashTypesLib.babelDashTypesLibStrings.`>` | babelDashTypesLib.babelDashTypesLibStrings.`<` | babelDashTypesLib.babelDashTypesLibStrings.`>=` | babelDashTypesLib.babelDashTypesLibStrings.`<=`,
    left: Expression
  ): BinaryExpression = js.native
  def binaryExpression(
    operator: babelDashTypesLib.babelDashTypesLibStrings.`+` | babelDashTypesLib.babelDashTypesLibStrings.`-` | babelDashTypesLib.babelDashTypesLibStrings.`/` | babelDashTypesLib.babelDashTypesLibStrings.`%` | babelDashTypesLib.babelDashTypesLibStrings.`*` | babelDashTypesLib.babelDashTypesLibStrings.`**` | babelDashTypesLib.babelDashTypesLibStrings.`&` | babelDashTypesLib.babelDashTypesLibStrings.`|` | babelDashTypesLib.babelDashTypesLibStrings.`>>` | babelDashTypesLib.babelDashTypesLibStrings.`>>>` | babelDashTypesLib.babelDashTypesLibStrings.`<<` | babelDashTypesLib.babelDashTypesLibStrings.`_backtick^_backtick` | babelDashTypesLib.babelDashTypesLibStrings.`==` | babelDashTypesLib.babelDashTypesLibStrings.`===` | babelDashTypesLib.babelDashTypesLibStrings.`!=` | babelDashTypesLib.babelDashTypesLibStrings.`!==` | babelDashTypesLib.babelDashTypesLibStrings.in | babelDashTypesLib.babelDashTypesLibStrings.instanceof | babelDashTypesLib.babelDashTypesLibStrings.`>` | babelDashTypesLib.babelDashTypesLibStrings.`<` | babelDashTypesLib.babelDashTypesLibStrings.`>=` | babelDashTypesLib.babelDashTypesLibStrings.`<=`,
    left: Expression,
    right: Expression
  ): BinaryExpression = js.native
  def bindExpression(): BindExpression = js.native
  def bindExpression(`object`: Expression): BindExpression = js.native
  def bindExpression(`object`: Expression, callee: Expression): BindExpression = js.native
  def blockStatement(): BlockStatement = js.native
  def blockStatement(body: js.Array[Statement]): BlockStatement = js.native
  def blockStatement(body: js.Array[Statement], directives: js.Array[Directive]): BlockStatement = js.native
  def booleanLiteral(): BooleanLiteral = js.native
  def booleanLiteral(value: scala.Boolean): BooleanLiteral = js.native
  def booleanLiteralTypeAnnotation(): BooleanLiteralTypeAnnotation = js.native
  def booleanTypeAnnotation(): BooleanTypeAnnotation = js.native
  def breakStatement(): BreakStatement = js.native
  def breakStatement(label: Identifier): BreakStatement = js.native
  def callExpression(): CallExpression = js.native
  def callExpression(callee: Expression): CallExpression = js.native
  def callExpression(callee: Expression, _arguments: js.Array[Expression | SpreadElement]): CallExpression = js.native
  def catchClause(): CatchClause = js.native
  def catchClause(param: Identifier): CatchClause = js.native
  def catchClause(param: Identifier, body: BlockStatement): CatchClause = js.native
  def classBody(): ClassBody = js.native
  def classBody(body: js.Array[ClassMethod | ClassProperty]): ClassBody = js.native
  def classDeclaration(): ClassDeclaration = js.native
  def classDeclaration(id: Identifier): ClassDeclaration = js.native
  def classDeclaration(id: Identifier, superClass: Expression): ClassDeclaration = js.native
  def classDeclaration(id: Identifier, superClass: Expression, body: ClassBody): ClassDeclaration = js.native
  def classDeclaration(id: Identifier, superClass: Expression, body: ClassBody, decorators: js.Array[Decorator]): ClassDeclaration = js.native
  def classExpression(): ClassExpression = js.native
  def classExpression(id: Identifier): ClassExpression = js.native
  def classExpression(id: Identifier, superClass: Expression): ClassExpression = js.native
  def classExpression(id: Identifier, superClass: Expression, body: ClassBody): ClassExpression = js.native
  def classExpression(id: Identifier, superClass: Expression, body: ClassBody, decorators: js.Array[Decorator]): ClassExpression = js.native
  def classImplements(): ClassImplements = js.native
  def classImplements(id: Identifier): ClassImplements = js.native
  def classImplements(id: Identifier, typeParameters: TypeParameterInstantiation): ClassImplements = js.native
  @JSName("classMethod")
  def classMethod_constructor(
    kind: js.UndefOr[babelDashTypesLib.babelDashTypesLibStrings.constructor],
    key: js.UndefOr[Expression],
    params: js.UndefOr[js.Array[LVal]],
    body: js.UndefOr[BlockStatement],
    computed: js.UndefOr[scala.Boolean],
    _static: js.UndefOr[scala.Boolean]
  ): ClassMethod = js.native
  @JSName("classMethod")
  def classMethod_get(
    kind: js.UndefOr[babelDashTypesLib.babelDashTypesLibStrings.get],
    key: js.UndefOr[Expression],
    params: js.UndefOr[js.Array[LVal]],
    body: js.UndefOr[BlockStatement],
    computed: js.UndefOr[scala.Boolean],
    _static: js.UndefOr[scala.Boolean]
  ): ClassMethod = js.native
  @JSName("classMethod")
  def classMethod_method(
    kind: js.UndefOr[babelDashTypesLib.babelDashTypesLibStrings.method],
    key: js.UndefOr[Expression],
    params: js.UndefOr[js.Array[LVal]],
    body: js.UndefOr[BlockStatement],
    computed: js.UndefOr[scala.Boolean],
    _static: js.UndefOr[scala.Boolean]
  ): ClassMethod = js.native
  @JSName("classMethod")
  def classMethod_set(
    kind: js.UndefOr[babelDashTypesLib.babelDashTypesLibStrings.set],
    key: js.UndefOr[Expression],
    params: js.UndefOr[js.Array[LVal]],
    body: js.UndefOr[BlockStatement],
    computed: js.UndefOr[scala.Boolean],
    _static: js.UndefOr[scala.Boolean]
  ): ClassMethod = js.native
  def classProperty(): ClassProperty = js.native
  def classProperty(key: Identifier): ClassProperty = js.native
  def classProperty(key: Identifier, value: Expression): ClassProperty = js.native
  def classProperty(key: Identifier, value: Expression, typeAnnotation: TypeAnnotation): ClassProperty = js.native
  def classProperty(
    key: Identifier,
    value: Expression,
    typeAnnotation: TypeAnnotation,
    decorators: js.Array[Decorator]
  ): ClassProperty = js.native
  def conditionalExpression(): ConditionalExpression = js.native
  def conditionalExpression(test: Expression): ConditionalExpression = js.native
  def conditionalExpression(test: Expression, consequent: Expression): ConditionalExpression = js.native
  def conditionalExpression(test: Expression, consequent: Expression, alternate: Expression): ConditionalExpression = js.native
  def continueStatement(): ContinueStatement = js.native
  def continueStatement(label: Identifier): ContinueStatement = js.native
  def debuggerStatement(): DebuggerStatement = js.native
  def declareClass(): DeclareClass = js.native
  def declareClass(id: Identifier): DeclareClass = js.native
  def declareClass(id: Identifier, typeParameters: TypeParameterDeclaration): DeclareClass = js.native
  def declareClass(id: Identifier, typeParameters: TypeParameterDeclaration, _extends: js.Array[InterfaceExtends]): DeclareClass = js.native
  def declareClass(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    _extends: js.Array[InterfaceExtends],
    body: ObjectTypeAnnotation
  ): DeclareClass = js.native
  def declareFunction(): DeclareFunction = js.native
  def declareFunction(id: Identifier): DeclareFunction = js.native
  def declareInterface(): DeclareInterface = js.native
  def declareInterface(id: Identifier): DeclareInterface = js.native
  def declareInterface(id: Identifier, typeParameters: TypeParameterDeclaration): DeclareInterface = js.native
  def declareInterface(id: Identifier, typeParameters: TypeParameterDeclaration, _extends: js.Array[InterfaceExtends]): DeclareInterface = js.native
  def declareInterface(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    _extends: js.Array[InterfaceExtends],
    body: ObjectTypeAnnotation
  ): DeclareInterface = js.native
  def declareModule(): DeclareModule = js.native
  def declareModule(id: Identifier): DeclareModule = js.native
  def declareModule(id: Identifier, body: BlockStatement): DeclareModule = js.native
  def declareModule(id: StringLiteral): DeclareModule = js.native
  def declareModule(id: StringLiteral, body: BlockStatement): DeclareModule = js.native
  def declareTypeAlias(): DeclareTypeAlias = js.native
  def declareTypeAlias(id: Identifier): DeclareTypeAlias = js.native
  def declareTypeAlias(id: Identifier, typeParameters: TypeParameterDeclaration): DeclareTypeAlias = js.native
  def declareTypeAlias(id: Identifier, typeParameters: TypeParameterDeclaration, right: FlowTypeAnnotation): DeclareTypeAlias = js.native
  def declareVariable(): DeclareVariable = js.native
  def declareVariable(id: Identifier): DeclareVariable = js.native
  def decorator(): Decorator = js.native
  def decorator(expression: Expression): Decorator = js.native
  def directive(): Directive = js.native
  def directive(value: DirectiveLiteral): Directive = js.native
  def directiveLiteral(): DirectiveLiteral = js.native
  def directiveLiteral(value: java.lang.String): DirectiveLiteral = js.native
  def doExpression(): DoExpression = js.native
  def doExpression(body: BlockStatement): DoExpression = js.native
  def doWhileStatement(): DoWhileStatement = js.native
  def doWhileStatement(test: Expression): DoWhileStatement = js.native
  def doWhileStatement(test: Expression, body: Statement): DoWhileStatement = js.native
  def emptyStatement(): EmptyStatement = js.native
  def existentialTypeParam(): ExistentialTypeParam = js.native
  def exportAllDeclaration(): ExportAllDeclaration = js.native
  def exportAllDeclaration(source: StringLiteral): ExportAllDeclaration = js.native
  def exportDefaultDeclaration(): ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: ClassDeclaration): ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: Expression): ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: FunctionDeclaration): ExportDefaultDeclaration = js.native
  def exportDefaultSpecifier(): ExportDefaultSpecifier = js.native
  def exportDefaultSpecifier(exported: Identifier): ExportDefaultSpecifier = js.native
  def exportNamedDeclaration(): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: Declaration): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: Declaration, specifiers: js.Array[ExportSpecifier]): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(declaration: Declaration, specifiers: js.Array[ExportSpecifier], source: StringLiteral): ExportNamedDeclaration = js.native
  def exportNamespaceSpecifier(): ExportNamespaceSpecifier = js.native
  def exportNamespaceSpecifier(exported: Identifier): ExportNamespaceSpecifier = js.native
  def exportSpecifier(): ExportSpecifier = js.native
  def exportSpecifier(local: Identifier): ExportSpecifier = js.native
  def exportSpecifier(local: Identifier, exported: Identifier): ExportSpecifier = js.native
  def expressionStatement(): ExpressionStatement = js.native
  def expressionStatement(expression: Expression): ExpressionStatement = js.native
  def file(): File = js.native
  def file(program: Program): File = js.native
  def file(program: Program, comments: js.Array[Comment]): File = js.native
  def file(program: Program, comments: js.Array[Comment], tokens: js.Array[_]): File = js.native
  def forInStatement(): ForInStatement = js.native
  def forInStatement(left: LVal): ForInStatement = js.native
  def forInStatement(left: LVal, right: Expression): ForInStatement = js.native
  def forInStatement(left: LVal, right: Expression, body: Statement): ForInStatement = js.native
  def forInStatement(left: VariableDeclaration): ForInStatement = js.native
  def forInStatement(left: VariableDeclaration, right: Expression): ForInStatement = js.native
  def forInStatement(left: VariableDeclaration, right: Expression, body: Statement): ForInStatement = js.native
  def forOfStatement(): ForOfStatement = js.native
  def forOfStatement(left: LVal): ForOfStatement = js.native
  def forOfStatement(left: LVal, right: Expression): ForOfStatement = js.native
  def forOfStatement(left: LVal, right: Expression, body: Statement): ForOfStatement = js.native
  def forOfStatement(left: VariableDeclaration): ForOfStatement = js.native
  def forOfStatement(left: VariableDeclaration, right: Expression): ForOfStatement = js.native
  def forOfStatement(left: VariableDeclaration, right: Expression, body: Statement): ForOfStatement = js.native
  def forStatement(): ForStatement = js.native
  def forStatement(init: Expression): ForStatement = js.native
  def forStatement(init: Expression, test: Expression): ForStatement = js.native
  def forStatement(init: Expression, test: Expression, update: Expression): ForStatement = js.native
  def forStatement(init: Expression, test: Expression, update: Expression, body: Statement): ForStatement = js.native
  def forStatement(init: VariableDeclaration): ForStatement = js.native
  def forStatement(init: VariableDeclaration, test: Expression): ForStatement = js.native
  def forStatement(init: VariableDeclaration, test: Expression, update: Expression): ForStatement = js.native
  def forStatement(init: VariableDeclaration, test: Expression, update: Expression, body: Statement): ForStatement = js.native
  def functionDeclaration(): FunctionDeclaration = js.native
  def functionDeclaration(id: Identifier): FunctionDeclaration = js.native
  def functionDeclaration(id: Identifier, params: js.Array[LVal]): FunctionDeclaration = js.native
  def functionDeclaration(id: Identifier, params: js.Array[LVal], body: BlockStatement): FunctionDeclaration = js.native
  def functionDeclaration(id: Identifier, params: js.Array[LVal], body: BlockStatement, generator: scala.Boolean): FunctionDeclaration = js.native
  def functionDeclaration(
    id: Identifier,
    params: js.Array[LVal],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): FunctionDeclaration = js.native
  def functionExpression(): FunctionExpression = js.native
  def functionExpression(id: Identifier): FunctionExpression = js.native
  def functionExpression(id: Identifier, params: js.Array[LVal]): FunctionExpression = js.native
  def functionExpression(id: Identifier, params: js.Array[LVal], body: BlockStatement): FunctionExpression = js.native
  def functionExpression(id: Identifier, params: js.Array[LVal], body: BlockStatement, generator: scala.Boolean): FunctionExpression = js.native
  def functionExpression(
    id: Identifier,
    params: js.Array[LVal],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): FunctionExpression = js.native
  def functionTypeAnnotation(): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(typeParameters: TypeParameterDeclaration): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(typeParameters: TypeParameterDeclaration, params: js.Array[FunctionTypeParam]): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: TypeParameterDeclaration,
    params: js.Array[FunctionTypeParam],
    rest: FunctionTypeParam
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: TypeParameterDeclaration,
    params: js.Array[FunctionTypeParam],
    rest: FunctionTypeParam,
    returnType: FlowTypeAnnotation
  ): FunctionTypeAnnotation = js.native
  def functionTypeParam(): FunctionTypeParam = js.native
  def functionTypeParam(name: Identifier): FunctionTypeParam = js.native
  def functionTypeParam(name: Identifier, typeAnnotation: FlowTypeAnnotation): FunctionTypeParam = js.native
  def genericTypeAnnotation(): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: Identifier): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: Identifier, typeParameters: TypeParameterInstantiation): GenericTypeAnnotation = js.native
  def identifier(): Identifier = js.native
  def identifier(name: java.lang.String): Identifier = js.native
  def ifStatement(): IfStatement = js.native
  def ifStatement(test: Expression): IfStatement = js.native
  def ifStatement(test: Expression, consequent: Statement): IfStatement = js.native
  def ifStatement(test: Expression, consequent: Statement, alternate: Statement): IfStatement = js.native
  def importDeclaration(): ImportDeclaration = js.native
  def importDeclaration(specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier]): ImportDeclaration = js.native
  def importDeclaration(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral
  ): ImportDeclaration = js.native
  def importDefaultSpecifier(): ImportDefaultSpecifier = js.native
  def importDefaultSpecifier(local: Identifier): ImportDefaultSpecifier = js.native
  def importNamespaceSpecifier(): ImportNamespaceSpecifier = js.native
  def importNamespaceSpecifier(local: Identifier): ImportNamespaceSpecifier = js.native
  def importSpecifier(): ImportSpecifier = js.native
  def importSpecifier(local: Identifier): ImportSpecifier = js.native
  def importSpecifier(local: Identifier, imported: Identifier): ImportSpecifier = js.native
  def interfaceDeclaration(): InterfaceDeclaration = js.native
  def interfaceDeclaration(id: Identifier): InterfaceDeclaration = js.native
  def interfaceDeclaration(id: Identifier, typeParameters: TypeParameterDeclaration): InterfaceDeclaration = js.native
  def interfaceDeclaration(id: Identifier, typeParameters: TypeParameterDeclaration, _extends: js.Array[InterfaceExtends]): InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    _extends: js.Array[InterfaceExtends],
    body: ObjectTypeAnnotation
  ): InterfaceDeclaration = js.native
  def interfaceExtends(): InterfaceExtends = js.native
  def interfaceExtends(id: Identifier): InterfaceExtends = js.native
  def interfaceExtends(id: Identifier, typeParameters: TypeParameterInstantiation): InterfaceExtends = js.native
  def intersectionTypeAnnotation(): IntersectionTypeAnnotation = js.native
  def intersectionTypeAnnotation(types: js.Array[FlowTypeAnnotation]): IntersectionTypeAnnotation = js.native
  def isAnyTypeAnnotation(): /* is babel-types.babel-types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.Object): /* is babel-types.babel-types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isArrayExpression(): /* is babel-types.babel-types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: js.Object): /* is babel-types.babel-types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ArrayExpression */ scala.Boolean = js.native
  def isArrayPattern(): /* is babel-types.babel-types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: js.Object): /* is babel-types.babel-types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ArrayPattern */ scala.Boolean = js.native
  def isArrayTypeAnnotation(): /* is babel-types.babel-types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object): /* is babel-types.babel-types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrowFunctionExpression(): /* is babel-types.babel-types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object): /* is babel-types.babel-types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isAssignmentExpression(): /* is babel-types.babel-types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object): /* is babel-types.babel-types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentPattern(): /* is babel-types.babel-types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object): /* is babel-types.babel-types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.AssignmentPattern */ scala.Boolean = js.native
  def isAwaitExpression(): /* is babel-types.babel-types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: js.Object): /* is babel-types.babel-types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.AwaitExpression */ scala.Boolean = js.native
  def isBinary(): /* is babel-types.babel-types.Binary */ scala.Boolean = js.native
  def isBinary(node: js.Object): /* is babel-types.babel-types.Binary */ scala.Boolean = js.native
  def isBinary(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Binary */ scala.Boolean = js.native
  def isBinary(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Binary */ scala.Boolean = js.native
  def isBinary(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Binary */ scala.Boolean = js.native
  def isBinaryExpression(): /* is babel-types.babel-types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: js.Object): /* is babel-types.babel-types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.BinaryExpression */ scala.Boolean = js.native
  def isBindExpression(): /* is babel-types.babel-types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.Object): /* is babel-types.babel-types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.BindExpression */ scala.Boolean = js.native
  def isBindingIdentifier(): /* is babel-types.babel-types.Identifier */ scala.Boolean = js.native
  def isBindingIdentifier(node: js.Object): /* is babel-types.babel-types.Identifier */ scala.Boolean = js.native
  def isBindingIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Identifier */ scala.Boolean = js.native
  def isBindingIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Identifier */ scala.Boolean = js.native
  def isBindingIdentifier(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Identifier */ scala.Boolean = js.native
  def isBlock(): /* is babel-types.babel-types.Block */ scala.Boolean = js.native
  def isBlock(node: js.Object): /* is babel-types.babel-types.Block */ scala.Boolean = js.native
  def isBlock(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Block */ scala.Boolean = js.native
  def isBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Block */ scala.Boolean = js.native
  def isBlock(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Block */ scala.Boolean = js.native
  def isBlockParent(): /* is babel-types.babel-types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: js.Object): /* is babel-types.babel-types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.BlockParent */ scala.Boolean = js.native
  def isBlockScoped(): scala.Boolean = js.native
  def isBlockScoped(node: js.Object): scala.Boolean = js.native
  def isBlockScoped(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isBlockScoped(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isBlockScoped(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isBlockStatement(): /* is babel-types.babel-types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: js.Object): /* is babel-types.babel-types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.BlockStatement */ scala.Boolean = js.native
  def isBooleanLiteral(): /* is babel-types.babel-types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object): /* is babel-types.babel-types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(): /* is babel-types.babel-types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(): /* is babel-types.babel-types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object): /* is babel-types.babel-types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBreakStatement(): /* is babel-types.babel-types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: js.Object): /* is babel-types.babel-types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.BreakStatement */ scala.Boolean = js.native
  def isCallExpression(): /* is babel-types.babel-types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: js.Object): /* is babel-types.babel-types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.CallExpression */ scala.Boolean = js.native
  def isCatchClause(): /* is babel-types.babel-types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: js.Object): /* is babel-types.babel-types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: js.Object, opts: js.Object): /* is babel-types.babel-types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.CatchClause */ scala.Boolean = js.native
  def isClass(): /* is babel-types.babel-types.Class */ scala.Boolean = js.native
  def isClass(node: js.Object): /* is babel-types.babel-types.Class */ scala.Boolean = js.native
  def isClass(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Class */ scala.Boolean = js.native
  def isClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Class */ scala.Boolean = js.native
  def isClass(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Class */ scala.Boolean = js.native
  def isClassBody(): /* is babel-types.babel-types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: js.Object): /* is babel-types.babel-types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ClassBody */ scala.Boolean = js.native
  def isClassDeclaration(): /* is babel-types.babel-types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: js.Object): /* is babel-types.babel-types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ClassDeclaration */ scala.Boolean = js.native
  def isClassExpression(): /* is babel-types.babel-types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: js.Object): /* is babel-types.babel-types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ClassExpression */ scala.Boolean = js.native
  def isClassImplements(): /* is babel-types.babel-types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: js.Object): /* is babel-types.babel-types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ClassImplements */ scala.Boolean = js.native
  def isClassMethod(): /* is babel-types.babel-types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: js.Object): /* is babel-types.babel-types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ClassMethod */ scala.Boolean = js.native
  def isClassProperty(): /* is babel-types.babel-types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.Object): /* is babel-types.babel-types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ClassProperty */ scala.Boolean = js.native
  def isCompletionStatement(): /* is babel-types.babel-types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: js.Object): /* is babel-types.babel-types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.CompletionStatement */ scala.Boolean = js.native
  def isConditional(): /* is babel-types.babel-types.Conditional */ scala.Boolean = js.native
  def isConditional(node: js.Object): /* is babel-types.babel-types.Conditional */ scala.Boolean = js.native
  def isConditional(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Conditional */ scala.Boolean = js.native
  def isConditional(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Conditional */ scala.Boolean = js.native
  def isConditional(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Conditional */ scala.Boolean = js.native
  def isConditionalExpression(): /* is babel-types.babel-types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: js.Object): /* is babel-types.babel-types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ConditionalExpression */ scala.Boolean = js.native
  def isContinueStatement(): /* is babel-types.babel-types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: js.Object): /* is babel-types.babel-types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ContinueStatement */ scala.Boolean = js.native
  def isDebuggerStatement(): /* is babel-types.babel-types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object): /* is babel-types.babel-types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.DebuggerStatement */ scala.Boolean = js.native
  def isDeclaration(): /* is babel-types.babel-types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: js.Object): /* is babel-types.babel-types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Declaration */ scala.Boolean = js.native
  def isDeclareClass(): /* is babel-types.babel-types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: js.Object): /* is babel-types.babel-types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.DeclareClass */ scala.Boolean = js.native
  def isDeclareFunction(): /* is babel-types.babel-types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: js.Object): /* is babel-types.babel-types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareInterface(): /* is babel-types.babel-types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: js.Object): /* is babel-types.babel-types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareModule(): /* is babel-types.babel-types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: js.Object): /* is babel-types.babel-types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.DeclareModule */ scala.Boolean = js.native
  def isDeclareTypeAlias(): /* is babel-types.babel-types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object): /* is babel-types.babel-types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareVariable(): /* is babel-types.babel-types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: js.Object): /* is babel-types.babel-types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.DeclareVariable */ scala.Boolean = js.native
  def isDecorator(): /* is babel-types.babel-types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: js.Object): /* is babel-types.babel-types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Decorator */ scala.Boolean = js.native
  def isDirective(): /* is babel-types.babel-types.Directive */ scala.Boolean = js.native
  def isDirective(node: js.Object): /* is babel-types.babel-types.Directive */ scala.Boolean = js.native
  def isDirective(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Directive */ scala.Boolean = js.native
  def isDirective(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Directive */ scala.Boolean = js.native
  def isDirective(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Directive */ scala.Boolean = js.native
  def isDirectiveLiteral(): /* is babel-types.babel-types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object): /* is babel-types.babel-types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.DirectiveLiteral */ scala.Boolean = js.native
  def isDoExpression(): /* is babel-types.babel-types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: js.Object): /* is babel-types.babel-types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.DoExpression */ scala.Boolean = js.native
  def isDoWhileStatement(): /* is babel-types.babel-types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object): /* is babel-types.babel-types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.DoWhileStatement */ scala.Boolean = js.native
  def isEmptyStatement(): /* is babel-types.babel-types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.Object): /* is babel-types.babel-types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.EmptyStatement */ scala.Boolean = js.native
  def isExistentialTypeParam(): /* is babel-types.babel-types.ExistentialTypeParam */ scala.Boolean = js.native
  def isExistentialTypeParam(node: js.Object): /* is babel-types.babel-types.ExistentialTypeParam */ scala.Boolean = js.native
  def isExistentialTypeParam(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExistentialTypeParam */ scala.Boolean = js.native
  def isExistentialTypeParam(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ExistentialTypeParam */ scala.Boolean = js.native
  def isExistentialTypeParam(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ExistentialTypeParam */ scala.Boolean = js.native
  def isExportAllDeclaration(): /* is babel-types.babel-types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object): /* is babel-types.babel-types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(): /* is babel-types.babel-types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.Object): /* is babel-types.babel-types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(): /* is babel-types.babel-types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object): /* is babel-types.babel-types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultSpecifier(): /* is babel-types.babel-types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object): /* is babel-types.babel-types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportNamedDeclaration(): /* is babel-types.babel-types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object): /* is babel-types.babel-types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(): /* is babel-types.babel-types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object): /* is babel-types.babel-types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(): /* is babel-types.babel-types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.Object): /* is babel-types.babel-types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ExportSpecifier */ scala.Boolean = js.native
  def isExpression(): /* is babel-types.babel-types.Expression */ scala.Boolean = js.native
  def isExpression(node: js.Object): /* is babel-types.babel-types.Expression */ scala.Boolean = js.native
  def isExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Expression */ scala.Boolean = js.native
  def isExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Expression */ scala.Boolean = js.native
  def isExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Expression */ scala.Boolean = js.native
  def isExpressionStatement(): /* is babel-types.babel-types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: js.Object): /* is babel-types.babel-types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionWrapper(): /* is babel-types.babel-types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object): /* is babel-types.babel-types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ExpressionWrapper */ scala.Boolean = js.native
  def isFile(): /* is babel-types.babel-types.File */ scala.Boolean = js.native
  def isFile(node: js.Object): /* is babel-types.babel-types.File */ scala.Boolean = js.native
  def isFile(node: js.Object, opts: js.Object): /* is babel-types.babel-types.File */ scala.Boolean = js.native
  def isFile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.File */ scala.Boolean = js.native
  def isFile(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.File */ scala.Boolean = js.native
  def isFlow(): /* is babel-types.babel-types.Flow */ scala.Boolean = js.native
  def isFlow(node: js.Object): /* is babel-types.babel-types.Flow */ scala.Boolean = js.native
  def isFlow(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Flow */ scala.Boolean = js.native
  def isFlow(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Flow */ scala.Boolean = js.native
  def isFlow(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Flow */ scala.Boolean = js.native
  def isFlowBaseAnnotation(): /* is babel-types.babel-types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object): /* is babel-types.babel-types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowDeclaration(): /* is babel-types.babel-types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object): /* is babel-types.babel-types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.FlowDeclaration */ scala.Boolean = js.native
  def isFor(): /* is babel-types.babel-types.For */ scala.Boolean = js.native
  def isFor(node: js.Object): /* is babel-types.babel-types.For */ scala.Boolean = js.native
  def isFor(node: js.Object, opts: js.Object): /* is babel-types.babel-types.For */ scala.Boolean = js.native
  def isFor(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.For */ scala.Boolean = js.native
  def isFor(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.For */ scala.Boolean = js.native
  def isForInStatement(): /* is babel-types.babel-types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: js.Object): /* is babel-types.babel-types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ForInStatement */ scala.Boolean = js.native
  def isForOfStatement(): /* is babel-types.babel-types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.Object): /* is babel-types.babel-types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ForOfStatement */ scala.Boolean = js.native
  def isForStatement(): /* is babel-types.babel-types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: js.Object): /* is babel-types.babel-types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ForStatement */ scala.Boolean = js.native
  def isForXStatement(): /* is babel-types.babel-types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.Object): /* is babel-types.babel-types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ForXStatement */ scala.Boolean = js.native
  def isFunction(): /* is babel-types.babel-types.Function */ scala.Boolean = js.native
  def isFunction(node: js.Object): /* is babel-types.babel-types.Function */ scala.Boolean = js.native
  def isFunction(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Function */ scala.Boolean = js.native
  def isFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Function */ scala.Boolean = js.native
  def isFunction(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Function */ scala.Boolean = js.native
  def isFunctionDeclaration(): /* is babel-types.babel-types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object): /* is babel-types.babel-types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionExpression(): /* is babel-types.babel-types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: js.Object): /* is babel-types.babel-types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionParent(): /* is babel-types.babel-types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: js.Object): /* is babel-types.babel-types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.FunctionParent */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(): /* is babel-types.babel-types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object): /* is babel-types.babel-types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeParam(): /* is babel-types.babel-types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object): /* is babel-types.babel-types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object, opts: js.Object): /* is babel-types.babel-types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.FunctionTypeParam */ scala.Boolean = js.native
  def isGenerated(): scala.Boolean = js.native
  def isGenerated(node: js.Object): scala.Boolean = js.native
  def isGenerated(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isGenerated(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isGenerated(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isGenericTypeAnnotation(): /* is babel-types.babel-types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object): /* is babel-types.babel-types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isIdentifier(): /* is babel-types.babel-types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: js.Object): /* is babel-types.babel-types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Identifier */ scala.Boolean = js.native
  def isIfStatement(): /* is babel-types.babel-types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: js.Object): /* is babel-types.babel-types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.IfStatement */ scala.Boolean = js.native
  def isImmutable(): /* is babel-types.babel-types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: js.Object): /* is babel-types.babel-types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Immutable */ scala.Boolean = js.native
  def isImportDeclaration(): /* is babel-types.babel-types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: js.Object): /* is babel-types.babel-types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDefaultSpecifier(): /* is babel-types.babel-types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object): /* is babel-types.babel-types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(): /* is babel-types.babel-types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object): /* is babel-types.babel-types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(): /* is babel-types.babel-types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.Object): /* is babel-types.babel-types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ImportSpecifier */ scala.Boolean = js.native
  def isInterfaceDeclaration(): /* is babel-types.babel-types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object): /* is babel-types.babel-types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceExtends(): /* is babel-types.babel-types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object): /* is babel-types.babel-types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object, opts: js.Object): /* is babel-types.babel-types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.InterfaceExtends */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(): /* is babel-types.babel-types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object): /* is babel-types.babel-types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isJSX(): /* is babel-types.babel-types.JSX */ scala.Boolean = js.native
  def isJSX(node: js.Object): /* is babel-types.babel-types.JSX */ scala.Boolean = js.native
  def isJSX(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSX */ scala.Boolean = js.native
  def isJSX(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSX */ scala.Boolean = js.native
  def isJSX(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSX */ scala.Boolean = js.native
  def isJSXAttribute(): /* is babel-types.babel-types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: js.Object): /* is babel-types.babel-types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSXAttribute */ scala.Boolean = js.native
  def isJSXClosingElement(): /* is babel-types.babel-types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object): /* is babel-types.babel-types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXElement(): /* is babel-types.babel-types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: js.Object): /* is babel-types.babel-types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSXElement */ scala.Boolean = js.native
  def isJSXEmptyExpression(): /* is babel-types.babel-types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object): /* is babel-types.babel-types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXExpressionContainer(): /* is babel-types.babel-types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object): /* is babel-types.babel-types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXIdentifier(): /* is babel-types.babel-types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object): /* is babel-types.babel-types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXMemberExpression(): /* is babel-types.babel-types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object): /* is babel-types.babel-types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXNamespacedName(): /* is babel-types.babel-types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object): /* is babel-types.babel-types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXOpeningElement(): /* is babel-types.babel-types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object): /* is babel-types.babel-types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXSpreadAttribute(): /* is babel-types.babel-types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object): /* is babel-types.babel-types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXText(): /* is babel-types.babel-types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: js.Object): /* is babel-types.babel-types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: js.Object, opts: js.Object): /* is babel-types.babel-types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.JSXText */ scala.Boolean = js.native
  def isLVal(): /* is babel-types.babel-types.LVal */ scala.Boolean = js.native
  def isLVal(node: js.Object): /* is babel-types.babel-types.LVal */ scala.Boolean = js.native
  def isLVal(node: js.Object, opts: js.Object): /* is babel-types.babel-types.LVal */ scala.Boolean = js.native
  def isLVal(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.LVal */ scala.Boolean = js.native
  def isLVal(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.LVal */ scala.Boolean = js.native
  def isLabeledStatement(): /* is babel-types.babel-types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: js.Object): /* is babel-types.babel-types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.LabeledStatement */ scala.Boolean = js.native
  def isLiteral(): /* is babel-types.babel-types.Literal */ scala.Boolean = js.native
  def isLiteral(node: js.Object): /* is babel-types.babel-types.Literal */ scala.Boolean = js.native
  def isLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Literal */ scala.Boolean = js.native
  def isLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Literal */ scala.Boolean = js.native
  def isLiteral(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Literal */ scala.Boolean = js.native
  def isLogicalExpression(): /* is babel-types.babel-types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: js.Object): /* is babel-types.babel-types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.LogicalExpression */ scala.Boolean = js.native
  def isLoop(): /* is babel-types.babel-types.Loop */ scala.Boolean = js.native
  def isLoop(node: js.Object): /* is babel-types.babel-types.Loop */ scala.Boolean = js.native
  def isLoop(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Loop */ scala.Boolean = js.native
  def isLoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Loop */ scala.Boolean = js.native
  def isLoop(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Loop */ scala.Boolean = js.native
  def isMemberExpression(): /* is babel-types.babel-types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: js.Object): /* is babel-types.babel-types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.MemberExpression */ scala.Boolean = js.native
  def isMetaProperty(): /* is babel-types.babel-types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: js.Object): /* is babel-types.babel-types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.MetaProperty */ scala.Boolean = js.native
  def isMethod(): /* is babel-types.babel-types.Method */ scala.Boolean = js.native
  def isMethod(node: js.Object): /* is babel-types.babel-types.Method */ scala.Boolean = js.native
  def isMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Method */ scala.Boolean = js.native
  def isMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Method */ scala.Boolean = js.native
  def isMethod(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Method */ scala.Boolean = js.native
  def isMixedTypeAnnotation(): /* is babel-types.babel-types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object): /* is babel-types.babel-types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isModuleDeclaration(): /* is babel-types.babel-types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object): /* is babel-types.babel-types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleSpecifier(): /* is babel-types.babel-types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object): /* is babel-types.babel-types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ModuleSpecifier */ scala.Boolean = js.native
  def isNewExpression(): /* is babel-types.babel-types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: js.Object): /* is babel-types.babel-types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.NewExpression */ scala.Boolean = js.native
  def isNoop(): /* is babel-types.babel-types.Noop */ scala.Boolean = js.native
  def isNoop(node: js.Object): /* is babel-types.babel-types.Noop */ scala.Boolean = js.native
  def isNoop(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Noop */ scala.Boolean = js.native
  def isNoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Noop */ scala.Boolean = js.native
  def isNoop(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Noop */ scala.Boolean = js.native
  def isNullLiteral(): /* is babel-types.babel-types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: js.Object): /* is babel-types.babel-types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(): /* is babel-types.babel-types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(): /* is babel-types.babel-types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object): /* is babel-types.babel-types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteral(): /* is babel-types.babel-types.NumericLiteral */ scala.Boolean = js.native
  def isNumberLiteral(node: js.Object): /* is babel-types.babel-types.NumericLiteral */ scala.Boolean = js.native
  def isNumberLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ scala.Boolean = js.native
  def isNumberLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ scala.Boolean = js.native
  def isNumberLiteral(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ scala.Boolean = js.native
  def isNumberTypeAnnotation(): /* is babel-types.babel-types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object): /* is babel-types.babel-types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumericLiteral(): /* is babel-types.babel-types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: js.Object): /* is babel-types.babel-types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteralTypeAnnotation(): /* is babel-types.babel-types.NumericLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumericLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types.NumericLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumericLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.NumericLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumericLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.NumericLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumericLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.NumericLiteralTypeAnnotation */ scala.Boolean = js.native
  def isObjectExpression(): /* is babel-types.babel-types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: js.Object): /* is babel-types.babel-types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ObjectExpression */ scala.Boolean = js.native
  def isObjectMember(): /* is babel-types.babel-types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: js.Object): /* is babel-types.babel-types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ObjectMember */ scala.Boolean = js.native
  def isObjectMethod(): /* is babel-types.babel-types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: js.Object): /* is babel-types.babel-types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ObjectMethod */ scala.Boolean = js.native
  def isObjectPattern(): /* is babel-types.babel-types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: js.Object): /* is babel-types.babel-types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ObjectPattern */ scala.Boolean = js.native
  def isObjectProperty(): /* is babel-types.babel-types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: js.Object): /* is babel-types.babel-types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ObjectProperty */ scala.Boolean = js.native
  def isObjectTypeAnnotation(): /* is babel-types.babel-types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object): /* is babel-types.babel-types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeCallProperty(): /* is babel-types.babel-types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object): /* is babel-types.babel-types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeIndexer(): /* is babel-types.babel-types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object): /* is babel-types.babel-types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeProperty(): /* is babel-types.babel-types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object): /* is babel-types.babel-types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ObjectTypeProperty */ scala.Boolean = js.native
  def isParenthesizedExpression(): /* is babel-types.babel-types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object): /* is babel-types.babel-types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ParenthesizedExpression */ scala.Boolean = js.native
  def isPattern(): /* is babel-types.babel-types.Pattern */ scala.Boolean = js.native
  def isPattern(node: js.Object): /* is babel-types.babel-types.Pattern */ scala.Boolean = js.native
  def isPattern(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Pattern */ scala.Boolean = js.native
  def isPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Pattern */ scala.Boolean = js.native
  def isPattern(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Pattern */ scala.Boolean = js.native
  def isProgram(): /* is babel-types.babel-types.Program */ scala.Boolean = js.native
  def isProgram(node: js.Object): /* is babel-types.babel-types.Program */ scala.Boolean = js.native
  def isProgram(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Program */ scala.Boolean = js.native
  def isProgram(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Program */ scala.Boolean = js.native
  def isProgram(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Program */ scala.Boolean = js.native
  def isProperty(): /* is babel-types.babel-types.Property */ scala.Boolean = js.native
  def isProperty(node: js.Object): /* is babel-types.babel-types.Property */ scala.Boolean = js.native
  def isProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Property */ scala.Boolean = js.native
  def isProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Property */ scala.Boolean = js.native
  def isProperty(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Property */ scala.Boolean = js.native
  def isPure(): scala.Boolean = js.native
  def isPure(node: js.Object): scala.Boolean = js.native
  def isPure(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isPure(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isPure(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isPureish(): /* is babel-types.babel-types.Pureish */ scala.Boolean = js.native
  def isPureish(node: js.Object): /* is babel-types.babel-types.Pureish */ scala.Boolean = js.native
  def isPureish(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Pureish */ scala.Boolean = js.native
  def isPureish(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Pureish */ scala.Boolean = js.native
  def isPureish(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Pureish */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(): /* is babel-types.babel-types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object): /* is babel-types.babel-types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* is babel-types.babel-types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isReferenced(): scala.Boolean = js.native
  def isReferenced(node: js.Object): scala.Boolean = js.native
  def isReferenced(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isReferenced(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isReferenced(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isReferencedIdentifier(): scala.Boolean = js.native
  def isReferencedIdentifier(node: js.Object): scala.Boolean = js.native
  def isReferencedIdentifier(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isReferencedIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isReferencedIdentifier(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isReferencedMemberExpression(): /* is babel-types.babel-types.MemberExpression */ scala.Boolean = js.native
  def isReferencedMemberExpression(node: js.Object): /* is babel-types.babel-types.MemberExpression */ scala.Boolean = js.native
  def isReferencedMemberExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.MemberExpression */ scala.Boolean = js.native
  def isReferencedMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.MemberExpression */ scala.Boolean = js.native
  def isReferencedMemberExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.MemberExpression */ scala.Boolean = js.native
  def isRegExpLiteral(): /* is babel-types.babel-types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object): /* is babel-types.babel-types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ scala.Boolean = js.native
  def isRegexLiteral(): /* is babel-types.babel-types.RegExpLiteral */ scala.Boolean = js.native
  def isRegexLiteral(node: js.Object): /* is babel-types.babel-types.RegExpLiteral */ scala.Boolean = js.native
  def isRegexLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ scala.Boolean = js.native
  def isRegexLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ scala.Boolean = js.native
  def isRegexLiteral(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.RegExpLiteral */ scala.Boolean = js.native
  def isRestElement(): /* is babel-types.babel-types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: js.Object): /* is babel-types.babel-types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.RestElement */ scala.Boolean = js.native
  def isRestProperty(): /* is babel-types.babel-types.RestProperty */ scala.Boolean = js.native
  def isRestProperty(node: js.Object): /* is babel-types.babel-types.RestProperty */ scala.Boolean = js.native
  def isRestProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.RestProperty */ scala.Boolean = js.native
  def isRestProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.RestProperty */ scala.Boolean = js.native
  def isRestProperty(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.RestProperty */ scala.Boolean = js.native
  def isReturnStatement(): /* is babel-types.babel-types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: js.Object): /* is babel-types.babel-types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ReturnStatement */ scala.Boolean = js.native
  def isScopable(): /* is babel-types.babel-types.Scopable */ scala.Boolean = js.native
  def isScopable(node: js.Object): /* is babel-types.babel-types.Scopable */ scala.Boolean = js.native
  def isScopable(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Scopable */ scala.Boolean = js.native
  def isScopable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Scopable */ scala.Boolean = js.native
  def isScopable(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Scopable */ scala.Boolean = js.native
  def isScope(): /* is babel-types.babel-types.Scopable */ scala.Boolean = js.native
  def isScope(node: js.Object): /* is babel-types.babel-types.Scopable */ scala.Boolean = js.native
  def isScope(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Scopable */ scala.Boolean = js.native
  def isScope(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Scopable */ scala.Boolean = js.native
  def isScope(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Scopable */ scala.Boolean = js.native
  def isSequenceExpression(): /* is babel-types.babel-types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: js.Object): /* is babel-types.babel-types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.SequenceExpression */ scala.Boolean = js.native
  def isSpreadElement(): /* is babel-types.babel-types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: js.Object): /* is babel-types.babel-types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.SpreadElement */ scala.Boolean = js.native
  def isSpreadProperty(): /* is babel-types.babel-types.SpreadProperty */ scala.Boolean = js.native
  def isSpreadProperty(node: js.Object): /* is babel-types.babel-types.SpreadProperty */ scala.Boolean = js.native
  def isSpreadProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.SpreadProperty */ scala.Boolean = js.native
  def isSpreadProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.SpreadProperty */ scala.Boolean = js.native
  def isSpreadProperty(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.SpreadProperty */ scala.Boolean = js.native
  def isStatement(): /* is babel-types.babel-types.Statement */ scala.Boolean = js.native
  def isStatement(node: js.Object): /* is babel-types.babel-types.Statement */ scala.Boolean = js.native
  def isStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Statement */ scala.Boolean = js.native
  def isStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Statement */ scala.Boolean = js.native
  def isStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Statement */ scala.Boolean = js.native
  def isStringLiteral(): /* is babel-types.babel-types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: js.Object): /* is babel-types.babel-types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(): /* is babel-types.babel-types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object): /* is babel-types.babel-types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(): /* is babel-types.babel-types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object): /* is babel-types.babel-types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.StringTypeAnnotation */ scala.Boolean = js.native
  def isSuper(): /* is babel-types.babel-types.Super */ scala.Boolean = js.native
  def isSuper(node: js.Object): /* is babel-types.babel-types.Super */ scala.Boolean = js.native
  def isSuper(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Super */ scala.Boolean = js.native
  def isSuper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Super */ scala.Boolean = js.native
  def isSuper(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Super */ scala.Boolean = js.native
  def isSwitchCase(): /* is babel-types.babel-types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: js.Object): /* is babel-types.babel-types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: js.Object, opts: js.Object): /* is babel-types.babel-types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.SwitchCase */ scala.Boolean = js.native
  def isSwitchStatement(): /* is babel-types.babel-types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: js.Object): /* is babel-types.babel-types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.SwitchStatement */ scala.Boolean = js.native
  def isTSAnyKeyword(): /* is babel-types.babel-types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object): /* is babel-types.babel-types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSArrayType(): /* is babel-types.babel-types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: js.Object): /* is babel-types.babel-types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSArrayType */ scala.Boolean = js.native
  def isTSAsExpression(): /* is babel-types.babel-types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: js.Object): /* is babel-types.babel-types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSAsExpression */ scala.Boolean = js.native
  def isTSBooleanKeyword(): /* is babel-types.babel-types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object): /* is babel-types.babel-types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(): /* is babel-types.babel-types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object): /* is babel-types.babel-types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(): /* is babel-types.babel-types.TSTypeElement */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object): /* is babel-types.babel-types.TSTypeElement */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeElement */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypeElement */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypeElement */ scala.Boolean = js.native
  def isTSConstructorType(): /* is babel-types.babel-types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: js.Object): /* is babel-types.babel-types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSConstructorType */ scala.Boolean = js.native
  def isTSDeclareFunction(): /* is babel-types.babel-types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object): /* is babel-types.babel-types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareMethod(): /* is babel-types.babel-types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object): /* is babel-types.babel-types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSEnumDeclaration(): /* is babel-types.babel-types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object): /* is babel-types.babel-types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumMember(): /* is babel-types.babel-types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: js.Object): /* is babel-types.babel-types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSEnumMember */ scala.Boolean = js.native
  def isTSExportAssignment(): /* is babel-types.babel-types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object): /* is babel-types.babel-types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(): /* is babel-types.babel-types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object): /* is babel-types.babel-types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExternalModuleReference(): /* is babel-types.babel-types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object): /* is babel-types.babel-types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSFunctionType(): /* is babel-types.babel-types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: js.Object): /* is babel-types.babel-types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSFunctionType */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(): /* is babel-types.babel-types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object): /* is babel-types.babel-types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSIndexSignature(): /* is babel-types.babel-types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object): /* is babel-types.babel-types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexedAccessType(): /* is babel-types.babel-types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object): /* is babel-types.babel-types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSInterfaceBody(): /* is babel-types.babel-types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object): /* is babel-types.babel-types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(): /* is babel-types.babel-types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object): /* is babel-types.babel-types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSIntersectionType(): /* is babel-types.babel-types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object): /* is babel-types.babel-types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSIntersectionType */ scala.Boolean = js.native
  def isTSLiteralType(): /* is babel-types.babel-types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.Object): /* is babel-types.babel-types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSLiteralType */ scala.Boolean = js.native
  def isTSMappedType(): /* is babel-types.babel-types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: js.Object): /* is babel-types.babel-types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSMappedType */ scala.Boolean = js.native
  def isTSMethodSignature(): /* is babel-types.babel-types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object): /* is babel-types.babel-types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSMethodSignature */ scala.Boolean = js.native
  def isTSModuleBlock(): /* is babel-types.babel-types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object): /* is babel-types.babel-types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleDeclaration(): /* is babel-types.babel-types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object): /* is babel-types.babel-types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(): /* is babel-types.babel-types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object): /* is babel-types.babel-types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNeverKeyword(): /* is babel-types.babel-types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object): /* is babel-types.babel-types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNonNullExpression(): /* is babel-types.babel-types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object): /* is babel-types.babel-types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNullKeyword(): /* is babel-types.babel-types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object): /* is babel-types.babel-types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(): /* is babel-types.babel-types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object): /* is babel-types.babel-types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(): /* is babel-types.babel-types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object): /* is babel-types.babel-types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSParameterProperty(): /* is babel-types.babel-types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object): /* is babel-types.babel-types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParenthesizedType(): /* is babel-types.babel-types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object): /* is babel-types.babel-types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSPropertySignature(): /* is babel-types.babel-types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object): /* is babel-types.babel-types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSPropertySignature */ scala.Boolean = js.native
  def isTSQualifiedName(): /* is babel-types.babel-types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object): /* is babel-types.babel-types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSQualifiedName */ scala.Boolean = js.native
  def isTSStringKeyword(): /* is babel-types.babel-types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object): /* is babel-types.babel-types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSStringKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(): /* is babel-types.babel-types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object): /* is babel-types.babel-types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSThisType(): /* is babel-types.babel-types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: js.Object): /* is babel-types.babel-types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSThisType */ scala.Boolean = js.native
  def isTSTupleType(): /* is babel-types.babel-types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: js.Object): /* is babel-types.babel-types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTupleType */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(): /* is babel-types.babel-types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object): /* is babel-types.babel-types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAnnotation(): /* is babel-types.babel-types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object): /* is babel-types.babel-types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAssertion(): /* is babel-types.babel-types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object): /* is babel-types.babel-types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeLiteral(): /* is babel-types.babel-types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object): /* is babel-types.babel-types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeOperator(): /* is babel-types.babel-types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object): /* is babel-types.babel-types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeParameter(): /* is babel-types.babel-types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object): /* is babel-types.babel-types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(): /* is babel-types.babel-types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object): /* is babel-types.babel-types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(): /* is babel-types.babel-types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object): /* is babel-types.babel-types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypePredicate(): /* is babel-types.babel-types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object): /* is babel-types.babel-types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypeQuery(): /* is babel-types.babel-types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object): /* is babel-types.babel-types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeReference(): /* is babel-types.babel-types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: js.Object): /* is babel-types.babel-types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSTypeReference */ scala.Boolean = js.native
  def isTSUndefinedKeyword(): /* is babel-types.babel-types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object): /* is babel-types.babel-types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUnionType(): /* is babel-types.babel-types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: js.Object): /* is babel-types.babel-types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSUnionType */ scala.Boolean = js.native
  def isTSVoidKeyword(): /* is babel-types.babel-types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object): /* is babel-types.babel-types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TSVoidKeyword */ scala.Boolean = js.native
  def isTaggedTemplateExpression(): /* is babel-types.babel-types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object): /* is babel-types.babel-types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTemplateElement(): /* is babel-types.babel-types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: js.Object): /* is babel-types.babel-types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TemplateElement */ scala.Boolean = js.native
  def isTemplateLiteral(): /* is babel-types.babel-types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object): /* is babel-types.babel-types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TemplateLiteral */ scala.Boolean = js.native
  def isTerminatorless(): /* is babel-types.babel-types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: js.Object): /* is babel-types.babel-types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: js.Object, opts: js.Object): /* is babel-types.babel-types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.Terminatorless */ scala.Boolean = js.native
  def isThisExpression(): /* is babel-types.babel-types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: js.Object): /* is babel-types.babel-types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ThisExpression */ scala.Boolean = js.native
  def isThisTypeAnnotation(): /* is babel-types.babel-types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object): /* is babel-types.babel-types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThrowStatement(): /* is babel-types.babel-types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: js.Object): /* is babel-types.babel-types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.ThrowStatement */ scala.Boolean = js.native
  def isTryStatement(): /* is babel-types.babel-types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.Object): /* is babel-types.babel-types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TryStatement */ scala.Boolean = js.native
  def isTupleTypeAnnotation(): /* is babel-types.babel-types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object): /* is babel-types.babel-types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTypeAlias(): /* is babel-types.babel-types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: js.Object): /* is babel-types.babel-types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TypeAlias */ scala.Boolean = js.native
  def isTypeAnnotation(): /* is babel-types.babel-types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object): /* is babel-types.babel-types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeCastExpression(): /* is babel-types.babel-types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object): /* is babel-types.babel-types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeParameter(): /* is babel-types.babel-types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: js.Object): /* is babel-types.babel-types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameterDeclaration(): /* is babel-types.babel-types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object): /* is babel-types.babel-types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterInstantiation(): /* is babel-types.babel-types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object): /* is babel-types.babel-types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(): /* is babel-types.babel-types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object): /* is babel-types.babel-types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isUnaryExpression(): /* is babel-types.babel-types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: js.Object): /* is babel-types.babel-types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryLike(): /* is babel-types.babel-types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: js.Object): /* is babel-types.babel-types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: js.Object, opts: js.Object): /* is babel-types.babel-types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.UnaryLike */ scala.Boolean = js.native
  def isUnionTypeAnnotation(): /* is babel-types.babel-types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object): /* is babel-types.babel-types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUpdateExpression(): /* is babel-types.babel-types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: js.Object): /* is babel-types.babel-types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.UpdateExpression */ scala.Boolean = js.native
  def isUser(): scala.Boolean = js.native
  def isUser(node: js.Object): scala.Boolean = js.native
  def isUser(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isUser(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isUser(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isUserWhitespacable(): /* is babel-types.babel-types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object): /* is babel-types.babel-types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object, opts: js.Object): /* is babel-types.babel-types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.UserWhitespacable */ scala.Boolean = js.native
  def isVar(): /* is babel-types.babel-types.VariableDeclaration */ scala.Boolean = js.native
  def isVar(node: js.Object): /* is babel-types.babel-types.VariableDeclaration */ scala.Boolean = js.native
  def isVar(node: js.Object, opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ scala.Boolean = js.native
  def isVar(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ scala.Boolean = js.native
  def isVar(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(): /* is babel-types.babel-types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object): /* is babel-types.babel-types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object, opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclarator(): /* is babel-types.babel-types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object): /* is babel-types.babel-types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object, opts: js.Object): /* is babel-types.babel-types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.VariableDeclarator */ scala.Boolean = js.native
  def isVoidTypeAnnotation(): /* is babel-types.babel-types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object): /* is babel-types.babel-types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object, opts: js.Object): /* is babel-types.babel-types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isWhile(): /* is babel-types.babel-types.While */ scala.Boolean = js.native
  def isWhile(node: js.Object): /* is babel-types.babel-types.While */ scala.Boolean = js.native
  def isWhile(node: js.Object, opts: js.Object): /* is babel-types.babel-types.While */ scala.Boolean = js.native
  def isWhile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.While */ scala.Boolean = js.native
  def isWhile(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.While */ scala.Boolean = js.native
  def isWhileStatement(): /* is babel-types.babel-types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: js.Object): /* is babel-types.babel-types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.WhileStatement */ scala.Boolean = js.native
  def isWithStatement(): /* is babel-types.babel-types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.Object): /* is babel-types.babel-types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.Object, opts: js.Object): /* is babel-types.babel-types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.WithStatement */ scala.Boolean = js.native
  def isYieldExpression(): /* is babel-types.babel-types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: js.Object): /* is babel-types.babel-types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: js.Object, opts: js.Object): /* is babel-types.babel-types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is babel-types.babel-types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: scala.Null, opts: js.Object): /* is babel-types.babel-types.YieldExpression */ scala.Boolean = js.native
  def jSXAttribute(): JSXAttribute = js.native
  def jSXAttribute(name: JSXIdentifier): JSXAttribute = js.native
  def jSXAttribute(name: JSXIdentifier, value: JSXElement): JSXAttribute = js.native
  def jSXAttribute(name: JSXIdentifier, value: JSXExpressionContainer): JSXAttribute = js.native
  def jSXAttribute(name: JSXIdentifier, value: StringLiteral): JSXAttribute = js.native
  def jSXAttribute(name: JSXNamespacedName): JSXAttribute = js.native
  def jSXAttribute(name: JSXNamespacedName, value: JSXElement): JSXAttribute = js.native
  def jSXAttribute(name: JSXNamespacedName, value: JSXExpressionContainer): JSXAttribute = js.native
  def jSXAttribute(name: JSXNamespacedName, value: StringLiteral): JSXAttribute = js.native
  def jSXClosingElement(): JSXClosingElement = js.native
  def jSXClosingElement(name: JSXIdentifier): JSXClosingElement = js.native
  def jSXClosingElement(name: JSXMemberExpression): JSXClosingElement = js.native
  def jSXElement(): JSXElement = js.native
  def jSXElement(openingElement: JSXOpeningElement): JSXElement = js.native
  def jSXElement(openingElement: JSXOpeningElement, closingElement: JSXClosingElement): JSXElement = js.native
  def jSXElement(
    openingElement: JSXOpeningElement,
    closingElement: JSXClosingElement,
    children: js.Array[JSXElement | JSXExpressionContainer | JSXText]
  ): JSXElement = js.native
  def jSXElement(
    openingElement: JSXOpeningElement,
    closingElement: JSXClosingElement,
    children: js.Array[JSXElement | JSXExpressionContainer | JSXText],
    selfClosing: scala.Boolean
  ): JSXElement = js.native
  def jSXEmptyExpression(): JSXEmptyExpression = js.native
  def jSXExpressionContainer(): JSXExpressionContainer = js.native
  def jSXExpressionContainer(expression: Expression): JSXExpressionContainer = js.native
  def jSXIdentifier(): JSXIdentifier = js.native
  def jSXIdentifier(name: java.lang.String): JSXIdentifier = js.native
  def jSXMemberExpression(): JSXMemberExpression = js.native
  def jSXMemberExpression(`object`: JSXIdentifier): JSXMemberExpression = js.native
  def jSXMemberExpression(`object`: JSXIdentifier, property: JSXIdentifier): JSXMemberExpression = js.native
  def jSXMemberExpression(`object`: JSXMemberExpression): JSXMemberExpression = js.native
  def jSXMemberExpression(`object`: JSXMemberExpression, property: JSXIdentifier): JSXMemberExpression = js.native
  def jSXNamespacedName(): JSXNamespacedName = js.native
  def jSXNamespacedName(namespace: JSXIdentifier): JSXNamespacedName = js.native
  def jSXNamespacedName(namespace: JSXIdentifier, name: JSXIdentifier): JSXNamespacedName = js.native
  def jSXOpeningElement(): JSXOpeningElement = js.native
  def jSXOpeningElement(name: JSXIdentifier): JSXOpeningElement = js.native
  def jSXOpeningElement(name: JSXIdentifier, attributes: js.Array[JSXAttribute]): JSXOpeningElement = js.native
  def jSXOpeningElement(name: JSXIdentifier, attributes: js.Array[JSXAttribute], selfClosing: scala.Boolean): JSXOpeningElement = js.native
  def jSXOpeningElement(name: JSXMemberExpression): JSXOpeningElement = js.native
  def jSXOpeningElement(name: JSXMemberExpression, attributes: js.Array[JSXAttribute]): JSXOpeningElement = js.native
  def jSXOpeningElement(name: JSXMemberExpression, attributes: js.Array[JSXAttribute], selfClosing: scala.Boolean): JSXOpeningElement = js.native
  def jSXSpreadAttribute(): JSXSpreadAttribute = js.native
  def jSXSpreadAttribute(argument: Expression): JSXSpreadAttribute = js.native
  def jSXText(): JSXText = js.native
  def jSXText(value: java.lang.String): JSXText = js.native
  def labeledStatement(): LabeledStatement = js.native
  def labeledStatement(label: Identifier): LabeledStatement = js.native
  def labeledStatement(label: Identifier, body: Statement): LabeledStatement = js.native
  def logicalExpression(): LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_&&`(operator: babelDashTypesLib.babelDashTypesLibStrings.`&&`): LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_&&`(operator: babelDashTypesLib.babelDashTypesLibStrings.`&&`, left: Expression): LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_&&`(operator: babelDashTypesLib.babelDashTypesLibStrings.`&&`, left: Expression, right: Expression): LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_||`(operator: babelDashTypesLib.babelDashTypesLibStrings.`||`): LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_||`(operator: babelDashTypesLib.babelDashTypesLibStrings.`||`, left: Expression): LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_||`(operator: babelDashTypesLib.babelDashTypesLibStrings.`||`, left: Expression, right: Expression): LogicalExpression = js.native
  def memberExpression(): MemberExpression = js.native
  def memberExpression(`object`: Expression): MemberExpression = js.native
  def memberExpression(`object`: Expression, property: Expression): MemberExpression = js.native
  def memberExpression(`object`: Expression, property: Expression, computed: scala.Boolean): MemberExpression = js.native
  def memberExpression(`object`: Super): MemberExpression = js.native
  def memberExpression(`object`: Super, property: Expression): MemberExpression = js.native
  def memberExpression(`object`: Super, property: Expression, computed: scala.Boolean): MemberExpression = js.native
  def metaProperty(): MetaProperty = js.native
  def metaProperty(meta: java.lang.String): MetaProperty = js.native
  def metaProperty(meta: java.lang.String, property: java.lang.String): MetaProperty = js.native
  def mixedTypeAnnotation(): MixedTypeAnnotation = js.native
  def newExpression(): NewExpression = js.native
  def newExpression(callee: Expression): NewExpression = js.native
  def newExpression(callee: Expression, _arguments: js.Array[Expression | SpreadElement]): NewExpression = js.native
  def newExpression(callee: Super): NewExpression = js.native
  def newExpression(callee: Super, _arguments: js.Array[Expression | SpreadElement]): NewExpression = js.native
  def noop(): Noop = js.native
  def nullLiteral(): NullLiteral = js.native
  def nullLiteralTypeAnnotation(): NullLiteralTypeAnnotation = js.native
  def nullableTypeAnnotation(): NullableTypeAnnotation = js.native
  def nullableTypeAnnotation(typeAnnotation: FlowTypeAnnotation): NullableTypeAnnotation = js.native
  def numberTypeAnnotation(): NumberTypeAnnotation = js.native
  def numericLiteral(): NumericLiteral = js.native
  def numericLiteral(value: scala.Double): NumericLiteral = js.native
  def numericLiteralTypeAnnotation(): NumericLiteralTypeAnnotation = js.native
  def objectExpression(): ObjectExpression = js.native
  def objectExpression(properties: js.Array[ObjectProperty | ObjectMethod | SpreadProperty]): ObjectExpression = js.native
  def objectMethod(): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(kind: babelDashTypesLib.babelDashTypesLibStrings.get): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(kind: babelDashTypesLib.babelDashTypesLibStrings.get, key: Expression): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(kind: babelDashTypesLib.babelDashTypesLibStrings.get, key: Expression, params: js.Array[LVal]): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(
    kind: babelDashTypesLib.babelDashTypesLibStrings.get,
    key: Expression,
    params: js.Array[LVal],
    body: BlockStatement
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_get(
    kind: babelDashTypesLib.babelDashTypesLibStrings.get,
    key: Expression,
    params: js.Array[LVal],
    body: BlockStatement,
    computed: scala.Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(kind: babelDashTypesLib.babelDashTypesLibStrings.method): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(kind: babelDashTypesLib.babelDashTypesLibStrings.method, key: Expression): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(kind: babelDashTypesLib.babelDashTypesLibStrings.method, key: Expression, params: js.Array[LVal]): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(
    kind: babelDashTypesLib.babelDashTypesLibStrings.method,
    key: Expression,
    params: js.Array[LVal],
    body: BlockStatement
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_method(
    kind: babelDashTypesLib.babelDashTypesLibStrings.method,
    key: Expression,
    params: js.Array[LVal],
    body: BlockStatement,
    computed: scala.Boolean
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(kind: babelDashTypesLib.babelDashTypesLibStrings.set): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(kind: babelDashTypesLib.babelDashTypesLibStrings.set, key: Expression): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(kind: babelDashTypesLib.babelDashTypesLibStrings.set, key: Expression, params: js.Array[LVal]): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(
    kind: babelDashTypesLib.babelDashTypesLibStrings.set,
    key: Expression,
    params: js.Array[LVal],
    body: BlockStatement
  ): ObjectMethod = js.native
  @JSName("objectMethod")
  def objectMethod_set(
    kind: babelDashTypesLib.babelDashTypesLibStrings.set,
    key: Expression,
    params: js.Array[LVal],
    body: BlockStatement,
    computed: scala.Boolean
  ): ObjectMethod = js.native
  def objectPattern(): ObjectPattern = js.native
  def objectPattern(properties: js.Array[AssignmentProperty | RestProperty]): ObjectPattern = js.native
  def objectPattern(properties: js.Array[AssignmentProperty | RestProperty], typeAnnotation: TypeAnnotation): ObjectPattern = js.native
  def objectProperty(): ObjectProperty = js.native
  def objectProperty(key: Expression): ObjectProperty = js.native
  def objectProperty(key: Expression, value: Expression): ObjectProperty = js.native
  def objectProperty(key: Expression, value: Expression, computed: scala.Boolean): ObjectProperty = js.native
  def objectProperty(key: Expression, value: Expression, computed: scala.Boolean, shorthand: scala.Boolean): ObjectProperty = js.native
  def objectProperty(
    key: Expression,
    value: Expression,
    computed: scala.Boolean,
    shorthand: scala.Boolean,
    decorators: js.Array[Decorator]
  ): ObjectProperty = js.native
  def objectTypeAnnotation(): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(properties: js.Array[ObjectTypeProperty]): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(properties: js.Array[ObjectTypeProperty], indexers: js.Array[ObjectTypeIndexer]): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty]
  ): ObjectTypeAnnotation = js.native
  def objectTypeCallProperty(): ObjectTypeCallProperty = js.native
  def objectTypeCallProperty(value: FlowTypeAnnotation): ObjectTypeCallProperty = js.native
  def objectTypeIndexer(): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Expression): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Expression, key: FlowTypeAnnotation): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Expression, key: FlowTypeAnnotation, value: FlowTypeAnnotation): ObjectTypeIndexer = js.native
  def objectTypeProperty(): ObjectTypeProperty = js.native
  def objectTypeProperty(key: Expression): ObjectTypeProperty = js.native
  def objectTypeProperty(key: Expression, value: FlowTypeAnnotation): ObjectTypeProperty = js.native
  def parenthesizedExpression(): ParenthesizedExpression = js.native
  def parenthesizedExpression(expression: Expression): ParenthesizedExpression = js.native
  def program(): Program = js.native
  def program(body: js.Array[Statement | ModuleDeclaration]): Program = js.native
  def program(body: js.Array[Statement | ModuleDeclaration], directives: js.Array[Directive]): Program = js.native
  def qualifiedTypeIdentifier(): QualifiedTypeIdentifier = js.native
  def qualifiedTypeIdentifier(id: Identifier): QualifiedTypeIdentifier = js.native
  def qualifiedTypeIdentifier(id: Identifier, qualification: Identifier): QualifiedTypeIdentifier = js.native
  def qualifiedTypeIdentifier(id: Identifier, qualification: QualifiedTypeIdentifier): QualifiedTypeIdentifier = js.native
  def regExpLiteral(): RegExpLiteral = js.native
  def regExpLiteral(pattern: java.lang.String): RegExpLiteral = js.native
  def regExpLiteral(pattern: java.lang.String, flags: java.lang.String): RegExpLiteral = js.native
  def restElement(): RestElement = js.native
  def restElement(argument: LVal): RestElement = js.native
  def restElement(argument: LVal, typeAnnotation: TypeAnnotation): RestElement = js.native
  def restProperty(): RestProperty = js.native
  def restProperty(argument: LVal): RestProperty = js.native
  def returnStatement(): ReturnStatement = js.native
  def returnStatement(argument: Expression): ReturnStatement = js.native
  def sequenceExpression(): SequenceExpression = js.native
  def sequenceExpression(expressions: js.Array[Expression]): SequenceExpression = js.native
  def spreadElement(): SpreadElement = js.native
  def spreadElement(argument: Expression): SpreadElement = js.native
  def spreadProperty(): SpreadProperty = js.native
  def spreadProperty(argument: Expression): SpreadProperty = js.native
  def stringLiteral(): StringLiteral = js.native
  def stringLiteral(value: java.lang.String): StringLiteral = js.native
  def stringLiteralTypeAnnotation(): StringLiteralTypeAnnotation = js.native
  def stringTypeAnnotation(): StringTypeAnnotation = js.native
  def switchCase(): SwitchCase = js.native
  def switchCase(test: Expression): SwitchCase = js.native
  def switchCase(test: Expression, consequent: js.Array[Statement]): SwitchCase = js.native
  def switchStatement(): SwitchStatement = js.native
  def switchStatement(discriminant: Expression): SwitchStatement = js.native
  def switchStatement(discriminant: Expression, cases: js.Array[SwitchCase]): SwitchStatement = js.native
  def taggedTemplateExpression(): TaggedTemplateExpression = js.native
  def taggedTemplateExpression(tag: Expression): TaggedTemplateExpression = js.native
  def taggedTemplateExpression(tag: Expression, quasi: TemplateLiteral): TaggedTemplateExpression = js.native
  def templateElement(): TemplateElement = js.native
  def templateElement(value: babelDashTypesLib.Anon_CookedRaw): TemplateElement = js.native
  def templateElement(value: babelDashTypesLib.Anon_CookedRaw, tail: scala.Boolean): TemplateElement = js.native
  def templateLiteral(): TemplateLiteral = js.native
  def templateLiteral(quasis: js.Array[TemplateElement]): TemplateLiteral = js.native
  def templateLiteral(quasis: js.Array[TemplateElement], expressions: js.Array[Expression]): TemplateLiteral = js.native
  def thisExpression(): ThisExpression = js.native
  def thisTypeAnnotation(): ThisTypeAnnotation = js.native
  def throwStatement(): ThrowStatement = js.native
  def throwStatement(argument: Expression): ThrowStatement = js.native
  def tryStatement(): TryStatement = js.native
  def tryStatement(block: BlockStatement): TryStatement = js.native
  def tryStatement(block: BlockStatement, handler: CatchClause): TryStatement = js.native
  def tryStatement(block: BlockStatement, handler: CatchClause, finalizer: BlockStatement): TryStatement = js.native
  def tupleTypeAnnotation(): TupleTypeAnnotation = js.native
  def tupleTypeAnnotation(types: js.Array[FlowTypeAnnotation]): TupleTypeAnnotation = js.native
  def typeAlias(): TypeAlias = js.native
  def typeAlias(id: Identifier): TypeAlias = js.native
  def typeAlias(id: Identifier, typeParameters: TypeParameterDeclaration): TypeAlias = js.native
  def typeAlias(id: Identifier, typeParameters: TypeParameterDeclaration, right: FlowTypeAnnotation): TypeAlias = js.native
  def typeAnnotation(): TypeAnnotation = js.native
  def typeAnnotation(typeAnnotation: FlowTypeAnnotation): TypeAnnotation = js.native
  def typeCastExpression(): TypeCastExpression = js.native
  def typeCastExpression(expression: Expression): TypeCastExpression = js.native
  def typeCastExpression(expression: Expression, typeAnnotation: FlowTypeAnnotation): TypeCastExpression = js.native
  def typeParameter(): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, default_ : Flow): TypeParameter = js.native
  def typeParameterDeclaration(): TypeParameterDeclaration = js.native
  def typeParameterDeclaration(params: js.Array[Identifier]): TypeParameterDeclaration = js.native
  def typeParameterInstantiation(): TypeParameterInstantiation = js.native
  def typeParameterInstantiation(params: js.Array[FlowTypeAnnotation]): TypeParameterInstantiation = js.native
  def typeofTypeAnnotation(): TypeofTypeAnnotation = js.native
  def typeofTypeAnnotation(argument: FlowTypeAnnotation): TypeofTypeAnnotation = js.native
  def unaryExpression(): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_!`(operator: babelDashTypesLib.babelDashTypesLibStrings.`!`): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_!`(operator: babelDashTypesLib.babelDashTypesLibStrings.`!`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_!`(
    operator: babelDashTypesLib.babelDashTypesLibStrings.`!`,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_+`(operator: babelDashTypesLib.babelDashTypesLibStrings.`+`): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_+`(operator: babelDashTypesLib.babelDashTypesLibStrings.`+`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_+`(
    operator: babelDashTypesLib.babelDashTypesLibStrings.`+`,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_++`(operator: babelDashTypesLib.babelDashTypesLibStrings.`++`): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_++`(operator: babelDashTypesLib.babelDashTypesLibStrings.`++`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_++`(
    operator: babelDashTypesLib.babelDashTypesLibStrings.`++`,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_-`(operator: babelDashTypesLib.babelDashTypesLibStrings.`-`): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_-`(operator: babelDashTypesLib.babelDashTypesLibStrings.`-`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_-`(
    operator: babelDashTypesLib.babelDashTypesLibStrings.`-`,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_--`(operator: babelDashTypesLib.babelDashTypesLibStrings.`--`): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_--`(operator: babelDashTypesLib.babelDashTypesLibStrings.`--`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_--`(
    operator: babelDashTypesLib.babelDashTypesLibStrings.`--`,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(operator: babelDashTypesLib.babelDashTypesLibStrings.delete): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(operator: babelDashTypesLib.babelDashTypesLibStrings.delete, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(
    operator: babelDashTypesLib.babelDashTypesLibStrings.delete,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(operator: babelDashTypesLib.babelDashTypesLibStrings.typeof): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(operator: babelDashTypesLib.babelDashTypesLibStrings.typeof, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(
    operator: babelDashTypesLib.babelDashTypesLibStrings.typeof,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(operator: babelDashTypesLib.babelDashTypesLibStrings.void): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(operator: babelDashTypesLib.babelDashTypesLibStrings.void, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(
    operator: babelDashTypesLib.babelDashTypesLibStrings.void,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_~`(operator: babelDashTypesLib.babelDashTypesLibStrings.`~`): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_~`(operator: babelDashTypesLib.babelDashTypesLibStrings.`~`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_~`(
    operator: babelDashTypesLib.babelDashTypesLibStrings.`~`,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  def unionTypeAnnotation(): UnionTypeAnnotation = js.native
  def unionTypeAnnotation(types: js.Array[FlowTypeAnnotation]): UnionTypeAnnotation = js.native
  def updateExpression(): UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_++`(operator: babelDashTypesLib.babelDashTypesLibStrings.`++`): UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_++`(operator: babelDashTypesLib.babelDashTypesLibStrings.`++`, argument: Expression): UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_++`(
    operator: babelDashTypesLib.babelDashTypesLibStrings.`++`,
    argument: Expression,
    prefix: scala.Boolean
  ): UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_--`(operator: babelDashTypesLib.babelDashTypesLibStrings.`--`): UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_--`(operator: babelDashTypesLib.babelDashTypesLibStrings.`--`, argument: Expression): UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_--`(
    operator: babelDashTypesLib.babelDashTypesLibStrings.`--`,
    argument: Expression,
    prefix: scala.Boolean
  ): UpdateExpression = js.native
  def variableDeclaration(): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(kind: babelDashTypesLib.babelDashTypesLibStrings.const): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(kind: babelDashTypesLib.babelDashTypesLibStrings.const, declarations: js.Array[VariableDeclarator]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(kind: babelDashTypesLib.babelDashTypesLibStrings.let): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(kind: babelDashTypesLib.babelDashTypesLibStrings.let, declarations: js.Array[VariableDeclarator]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(kind: babelDashTypesLib.babelDashTypesLibStrings.`var`): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(kind: babelDashTypesLib.babelDashTypesLibStrings.`var`, declarations: js.Array[VariableDeclarator]): VariableDeclaration = js.native
  def variableDeclarator(): VariableDeclarator = js.native
  def variableDeclarator(id: LVal): VariableDeclarator = js.native
  def variableDeclarator(id: LVal, init: Expression): VariableDeclarator = js.native
  def voidTypeAnnotation(): VoidTypeAnnotation = js.native
  def whileStatement(): WhileStatement = js.native
  def whileStatement(test: Expression): WhileStatement = js.native
  def whileStatement(test: Expression, body: BlockStatement): WhileStatement = js.native
  def whileStatement(test: Expression, body: Statement): WhileStatement = js.native
  def withStatement(): WithStatement = js.native
  def withStatement(`object`: Expression): WithStatement = js.native
  def withStatement(`object`: Expression, body: BlockStatement): WithStatement = js.native
  def withStatement(`object`: Expression, body: Statement): WithStatement = js.native
  def yieldExpression(): YieldExpression = js.native
  def yieldExpression(argument: Expression): YieldExpression = js.native
  def yieldExpression(argument: Expression, delegate: scala.Boolean): YieldExpression = js.native
}

