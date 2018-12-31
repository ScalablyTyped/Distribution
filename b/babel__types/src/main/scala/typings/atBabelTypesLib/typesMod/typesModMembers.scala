package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", JSImport.Namespace)
@js.native
object typesModMembers extends js.Object {
  def anyTypeAnnotation(): AnyTypeAnnotation = js.native
  def arrayExpression(): ArrayExpression = js.native
  def arrayExpression(elements: js.Array[scala.Null | Expression | SpreadElement]): ArrayExpression = js.native
  def arrayPattern(elements: js.Array[PatternLike]): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: js.Array[Decorator]): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: js.Array[Decorator], typeAnnotation: Noop): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: js.Array[Decorator], typeAnnotation: TSTypeAnnotation): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: js.Array[Decorator], typeAnnotation: TypeAnnotation): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: scala.Null, typeAnnotation: Noop): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: scala.Null, typeAnnotation: TSTypeAnnotation): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: scala.Null, typeAnnotation: TypeAnnotation): ArrayPattern = js.native
  def arrayTypeAnnotation(elementType: FlowType): ArrayTypeAnnotation = js.native
  def arrowFunctionExpression(params: js.Array[LVal], body: BlockStatement | Expression): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(params: js.Array[LVal], body: BlockStatement | Expression, async: scala.Boolean): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[LVal],
    body: BlockStatement | Expression,
    async: scala.Boolean,
    expression: scala.Boolean
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[LVal],
    body: BlockStatement | Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[LVal],
    body: BlockStatement | Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[LVal],
    body: BlockStatement | Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): ArrowFunctionExpression = js.native
  def assignmentExpression(operator: java.lang.String, left: LVal, right: Expression): AssignmentExpression = js.native
  def assignmentPattern(left: Identifier | ObjectPattern | ArrayPattern, right: Expression): AssignmentPattern = js.native
  def assignmentPattern(
    left: Identifier | ObjectPattern | ArrayPattern,
    right: Expression,
    decorators: js.Array[Decorator]
  ): AssignmentPattern = js.native
  def assignmentPattern(
    left: Identifier | ObjectPattern | ArrayPattern,
    right: Expression,
    decorators: js.Array[Decorator],
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop
  ): AssignmentPattern = js.native
  def awaitExpression(argument: Expression): AwaitExpression = js.native
  def bigIntLiteral(value: java.lang.String): BigIntLiteral = js.native
  def binaryExpression(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`+` | atBabelTypesLib.atBabelTypesLibStrings.`-` | atBabelTypesLib.atBabelTypesLibStrings.`/` | atBabelTypesLib.atBabelTypesLibStrings.`%` | atBabelTypesLib.atBabelTypesLibStrings.`*` | atBabelTypesLib.atBabelTypesLibStrings.`**` | atBabelTypesLib.atBabelTypesLibStrings.`&` | atBabelTypesLib.atBabelTypesLibStrings.`|` | atBabelTypesLib.atBabelTypesLibStrings.`>>` | atBabelTypesLib.atBabelTypesLibStrings.`>>>` | atBabelTypesLib.atBabelTypesLibStrings.`<<` | atBabelTypesLib.atBabelTypesLibStrings.`^` | atBabelTypesLib.atBabelTypesLibStrings.`==` | atBabelTypesLib.atBabelTypesLibStrings.`===` | atBabelTypesLib.atBabelTypesLibStrings.`!=` | atBabelTypesLib.atBabelTypesLibStrings.`!==` | atBabelTypesLib.atBabelTypesLibStrings.in | atBabelTypesLib.atBabelTypesLibStrings.instanceof | atBabelTypesLib.atBabelTypesLibStrings.`>` | atBabelTypesLib.atBabelTypesLibStrings.`<` | atBabelTypesLib.atBabelTypesLibStrings.`>=` | atBabelTypesLib.atBabelTypesLibStrings.`<=`,
    left: Expression,
    right: Expression
  ): BinaryExpression = js.native
  def bindExpression(`object`: js.Any, callee: js.Any): BindExpression = js.native
  def blockStatement(body: js.Array[Statement]): BlockStatement = js.native
  def blockStatement(body: js.Array[Statement], directives: js.Array[Directive]): BlockStatement = js.native
  def booleanLiteral(value: scala.Boolean): BooleanLiteral = js.native
  def booleanLiteralTypeAnnotation(value: scala.Boolean): BooleanLiteralTypeAnnotation = js.native
  def booleanTypeAnnotation(): BooleanTypeAnnotation = js.native
  def breakStatement(): BreakStatement = js.native
  def breakStatement(label: Identifier): BreakStatement = js.native
  def callExpression(callee: Expression, _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement]): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: TypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: TypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: scala.Null,
    typeArguments: TypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: scala.Null,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: scala.Null,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  def catchClause(param: Identifier, body: BlockStatement): CatchClause = js.native
  def catchClause(param: js.UndefOr[scala.Nothing], body: BlockStatement): CatchClause = js.native
  def catchClause(param: scala.Null, body: BlockStatement): CatchClause = js.native
  def classBody(
    body: js.Array[
      ClassMethod | ClassPrivateMethod | ClassProperty | ClassPrivateProperty | TSDeclareMethod | TSIndexSignature
    ]
  ): ClassBody = js.native
  def classDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    superClass: js.UndefOr[Expression | scala.Null],
    body: ClassBody,
    decorators: js.UndefOr[js.Array[Decorator] | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    declare: js.UndefOr[scala.Boolean | scala.Null],
    _implements: js.UndefOr[(js.Array[TSExpressionWithTypeArguments | ClassImplements]) | scala.Null],
    mixins: js.UndefOr[js.Any | scala.Null],
    superTypeParameters: js.UndefOr[TypeParameterInstantiation | TSTypeParameterInstantiation | scala.Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null]
  ): ClassDeclaration = js.native
  def classExpression(
    id: js.UndefOr[Identifier | scala.Null],
    superClass: js.UndefOr[Expression | scala.Null],
    body: ClassBody
  ): ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[Identifier | scala.Null],
    superClass: js.UndefOr[Expression | scala.Null],
    body: ClassBody,
    decorators: js.Array[Decorator]
  ): ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[Identifier | scala.Null],
    superClass: js.UndefOr[Expression | scala.Null],
    body: ClassBody,
    decorators: js.Array[Decorator],
    _implements: js.Array[TSExpressionWithTypeArguments | ClassImplements]
  ): ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[Identifier | scala.Null],
    superClass: js.UndefOr[Expression | scala.Null],
    body: ClassBody,
    decorators: js.Array[Decorator],
    _implements: js.Array[TSExpressionWithTypeArguments | ClassImplements],
    mixins: js.Any
  ): ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[Identifier | scala.Null],
    superClass: js.UndefOr[Expression | scala.Null],
    body: ClassBody,
    decorators: js.Array[Decorator],
    _implements: js.Array[TSExpressionWithTypeArguments | ClassImplements],
    mixins: js.Any,
    superTypeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation
  ): ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[Identifier | scala.Null],
    superClass: js.UndefOr[Expression | scala.Null],
    body: ClassBody,
    decorators: js.Array[Decorator],
    _implements: js.Array[TSExpressionWithTypeArguments | ClassImplements],
    mixins: js.Any,
    superTypeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): ClassExpression = js.native
  def classImplements(id: Identifier): ClassImplements = js.native
  def classImplements(id: Identifier, typeParameters: TypeParameterInstantiation): ClassImplements = js.native
  def classMethod(
    kind: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.constructor
    ],
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    params: js.Array[LVal],
    body: BlockStatement,
    computed: js.UndefOr[scala.Boolean],
    _static: js.UndefOr[scala.Boolean | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    returnType: js.UndefOr[TypeAnnotation | TSTypeAnnotation | Noop | scala.Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null]
  ): ClassMethod = js.native
  def classPrivateMethod(
    kind: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.constructor
    ],
    key: PrivateName,
    params: js.Array[LVal],
    body: BlockStatement,
    _static: js.UndefOr[scala.Boolean | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    computed: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    returnType: js.UndefOr[js.Any | scala.Null],
    typeParameters: js.UndefOr[js.Any | scala.Null]
  ): ClassPrivateMethod = js.native
  def classPrivateProperty(key: PrivateName): ClassPrivateProperty = js.native
  def classPrivateProperty(key: PrivateName, value: Expression): ClassPrivateProperty = js.native
  def classProperty(
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    value: js.UndefOr[Expression | scala.Null],
    typeAnnotation: js.UndefOr[TypeAnnotation | TSTypeAnnotation | Noop | scala.Null],
    decorators: js.UndefOr[js.Array[Decorator] | scala.Null],
    computed: js.UndefOr[scala.Boolean],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    accessibility: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    definite: js.UndefOr[scala.Boolean | scala.Null],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    readonly: js.UndefOr[scala.Boolean | scala.Null],
    _static: js.UndefOr[scala.Boolean | scala.Null]
  ): ClassProperty = js.native
  def clone[T /* <: Node */](n: T): T = js.native
  def cloneDeep[T /* <: Node */](n: T): T = js.native
  def conditionalExpression(test: Expression, consequent: Expression, alternate: Expression): ConditionalExpression = js.native
  def continueStatement(): ContinueStatement = js.native
  def continueStatement(label: Identifier): ContinueStatement = js.native
  def debuggerStatement(): DebuggerStatement = js.native
  def declareClass(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterInstantiation | scala.Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | scala.Null],
    body: ObjectTypeAnnotation
  ): DeclareClass = js.native
  def declareClass(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterInstantiation | scala.Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | scala.Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements]
  ): DeclareClass = js.native
  def declareClass(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterInstantiation | scala.Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | scala.Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements],
    mixins: js.Array[InterfaceExtends]
  ): DeclareClass = js.native
  def declareExportAllDeclaration(source: StringLiteral): DeclareExportAllDeclaration = js.native
  def declareExportAllDeclaration(
    source: StringLiteral,
    exportKind: js.Tuple2[
      atBabelTypesLib.atBabelTypesLibStrings.`type`, 
      atBabelTypesLib.atBabelTypesLibStrings.value
    ]
  ): DeclareExportAllDeclaration = js.native
  def declareExportDeclaration(): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Flow): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Flow, specifiers: js.Array[ExportNamespaceSpecifier | ExportSpecifier]): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: Flow,
    specifiers: js.Array[ExportNamespaceSpecifier | ExportSpecifier],
    source: StringLiteral
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: Flow,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    _default: scala.Boolean
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: Flow,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: scala.Null,
    _default: scala.Boolean
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Flow, specifiers: scala.Null, source: StringLiteral): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Flow, specifiers: scala.Null, source: StringLiteral, _default: scala.Boolean): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Flow, specifiers: scala.Null, source: scala.Null, _default: scala.Boolean): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: scala.Null, specifiers: js.Array[ExportNamespaceSpecifier | ExportSpecifier]): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[ExportNamespaceSpecifier | ExportSpecifier],
    source: StringLiteral
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    _default: scala.Boolean
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: scala.Null,
    _default: scala.Boolean
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: scala.Null, specifiers: scala.Null, source: StringLiteral): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: scala.Null, specifiers: scala.Null, source: StringLiteral, _default: scala.Boolean): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: scala.Null, specifiers: scala.Null, source: scala.Null, _default: scala.Boolean): DeclareExportDeclaration = js.native
  def declareFunction(id: Identifier): DeclareFunction = js.native
  def declareFunction(id: Identifier, predicate: DeclaredPredicate): DeclareFunction = js.native
  def declareInterface(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | scala.Null],
    body: ObjectTypeAnnotation
  ): DeclareInterface = js.native
  def declareInterface(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | scala.Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements]
  ): DeclareInterface = js.native
  def declareInterface(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | scala.Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements],
    mixins: js.Array[InterfaceExtends]
  ): DeclareInterface = js.native
  def declareModule(id: Identifier, body: BlockStatement): DeclareModule = js.native
  def declareModule(id: StringLiteral, body: BlockStatement): DeclareModule = js.native
  def declareModuleExports(typeAnnotation: TypeAnnotation): DeclareModuleExports = js.native
  @JSName("declareModule")
  def declareModule_CommonJS(id: Identifier, body: BlockStatement, kind: atBabelTypesLib.atBabelTypesLibStrings.CommonJS): DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_CommonJS(id: StringLiteral, body: BlockStatement, kind: atBabelTypesLib.atBabelTypesLibStrings.CommonJS): DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_ES(id: Identifier, body: BlockStatement, kind: atBabelTypesLib.atBabelTypesLibStrings.ES): DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_ES(id: StringLiteral, body: BlockStatement, kind: atBabelTypesLib.atBabelTypesLibStrings.ES): DeclareModule = js.native
  def declareOpaqueType(id: Identifier): DeclareOpaqueType = js.native
  def declareOpaqueType(id: Identifier, typeParameters: TypeParameterDeclaration): DeclareOpaqueType = js.native
  def declareOpaqueType(id: Identifier, typeParameters: TypeParameterDeclaration, supertype: FlowType): DeclareOpaqueType = js.native
  def declareOpaqueType(id: Identifier, typeParameters: scala.Null, supertype: FlowType): DeclareOpaqueType = js.native
  def declareTypeAlias(id: Identifier, typeParameters: TypeParameterDeclaration, right: FlowType): DeclareTypeAlias = js.native
  def declareTypeAlias(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], right: FlowType): DeclareTypeAlias = js.native
  def declareTypeAlias(id: Identifier, typeParameters: scala.Null, right: FlowType): DeclareTypeAlias = js.native
  def declareVariable(id: Identifier): DeclareVariable = js.native
  def declaredPredicate(value: Flow): DeclaredPredicate = js.native
  def decorator(expression: Expression): Decorator = js.native
  def directive(value: DirectiveLiteral): Directive = js.native
  def directiveLiteral(value: java.lang.String): DirectiveLiteral = js.native
  def doExpression(body: BlockStatement): DoExpression = js.native
  def doWhileStatement(test: Expression, body: Statement): DoWhileStatement = js.native
  def emptyStatement(): EmptyStatement = js.native
  def emptyTypeAnnotation(): EmptyTypeAnnotation = js.native
  def existsTypeAnnotation(): ExistsTypeAnnotation = js.native
  def exportAllDeclaration(source: StringLiteral): ExportAllDeclaration = js.native
  def exportDefaultDeclaration(declaration: ClassDeclaration): ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: Expression): ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: FunctionDeclaration): ExportDefaultDeclaration = js.native
  def exportDefaultDeclaration(declaration: TSDeclareFunction): ExportDefaultDeclaration = js.native
  def exportDefaultSpecifier(exported: Identifier): ExportDefaultSpecifier = js.native
  def exportNamedDeclaration(
    declaration: Declaration | js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportDefaultSpecifier | ExportNamespaceSpecifier | ExportSpecifier]
  ): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: Declaration | js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportDefaultSpecifier | ExportNamespaceSpecifier | ExportSpecifier],
    source: StringLiteral
  ): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[ExportDefaultSpecifier | ExportNamespaceSpecifier | ExportSpecifier]
  ): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: scala.Null,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral
  ): ExportNamedDeclaration = js.native
  def exportNamespaceSpecifier(exported: Identifier): ExportNamespaceSpecifier = js.native
  def exportSpecifier(local: Identifier, exported: Identifier): ExportSpecifier = js.native
  def expressionStatement(expression: Expression): ExpressionStatement = js.native
  def file(program: Program, comments: js.Any, tokens: js.Any): File = js.native
  def forInStatement(left: LVal, right: Expression, body: Statement): ForInStatement = js.native
  def forInStatement(left: VariableDeclaration, right: Expression, body: Statement): ForInStatement = js.native
  def forOfStatement(left: LVal, right: Expression, body: Statement): ForOfStatement = js.native
  def forOfStatement(left: LVal, right: Expression, body: Statement, _await: scala.Boolean): ForOfStatement = js.native
  def forOfStatement(left: VariableDeclaration, right: Expression, body: Statement): ForOfStatement = js.native
  def forOfStatement(left: VariableDeclaration, right: Expression, body: Statement, _await: scala.Boolean): ForOfStatement = js.native
  def forStatement(
    init: js.UndefOr[VariableDeclaration | Expression | scala.Null],
    test: js.UndefOr[Expression | scala.Null],
    update: js.UndefOr[Expression | scala.Null],
    body: Statement
  ): ForStatement = js.native
  def functionDeclaration(id: js.UndefOr[Identifier | scala.Null], params: js.Array[LVal], body: BlockStatement): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[LVal],
    body: BlockStatement,
    generator: scala.Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[LVal],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[LVal],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[LVal],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[LVal],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): FunctionDeclaration = js.native
  def functionExpression(id: js.UndefOr[Identifier | scala.Null], params: js.Array[LVal], body: BlockStatement): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[LVal],
    body: BlockStatement,
    generator: scala.Boolean
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[LVal],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[LVal],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[LVal],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): FunctionExpression = js.native
  def functionTypeAnnotation(
    typeParameters: TypeParameterDeclaration,
    params: js.Array[FunctionTypeParam],
    rest: FunctionTypeParam,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: TypeParameterDeclaration,
    params: js.Array[FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: TypeParameterDeclaration,
    params: js.Array[FunctionTypeParam],
    rest: scala.Null,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[FunctionTypeParam],
    rest: FunctionTypeParam,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[FunctionTypeParam],
    rest: scala.Null,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[FunctionTypeParam],
    rest: FunctionTypeParam,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[FunctionTypeParam],
    rest: scala.Null,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeParam(name: Identifier, typeAnnotation: FlowType): FunctionTypeParam = js.native
  def functionTypeParam(name: Identifier, typeAnnotation: FlowType, optional: scala.Boolean): FunctionTypeParam = js.native
  def functionTypeParam(name: js.UndefOr[scala.Nothing], typeAnnotation: FlowType): FunctionTypeParam = js.native
  def functionTypeParam(name: js.UndefOr[scala.Nothing], typeAnnotation: FlowType, optional: scala.Boolean): FunctionTypeParam = js.native
  def functionTypeParam(name: scala.Null, typeAnnotation: FlowType): FunctionTypeParam = js.native
  def functionTypeParam(name: scala.Null, typeAnnotation: FlowType, optional: scala.Boolean): FunctionTypeParam = js.native
  def genericTypeAnnotation(id: Identifier): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: Identifier, typeParameters: TypeParameterInstantiation): GenericTypeAnnotation = js.native
  def identifier(name: java.lang.String): Identifier = js.native
  def identifier(name: java.lang.String, decorators: js.Array[Decorator]): Identifier = js.native
  def identifier(name: java.lang.String, decorators: js.Array[Decorator], optional: scala.Boolean): Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[Decorator],
    optional: scala.Boolean,
    typeAnnotation: Noop
  ): Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[Decorator],
    optional: scala.Boolean,
    typeAnnotation: TSTypeAnnotation
  ): Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[Decorator],
    optional: scala.Boolean,
    typeAnnotation: TypeAnnotation
  ): Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[Decorator],
    optional: scala.Null,
    typeAnnotation: Noop
  ): Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[Decorator],
    optional: scala.Null,
    typeAnnotation: TSTypeAnnotation
  ): Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: js.Array[Decorator],
    optional: scala.Null,
    typeAnnotation: TypeAnnotation
  ): Identifier = js.native
  def identifier(name: java.lang.String, decorators: scala.Null, optional: scala.Boolean): Identifier = js.native
  def identifier(name: java.lang.String, decorators: scala.Null, optional: scala.Boolean, typeAnnotation: Noop): Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Boolean,
    typeAnnotation: TSTypeAnnotation
  ): Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Boolean,
    typeAnnotation: TypeAnnotation
  ): Identifier = js.native
  def identifier(name: java.lang.String, decorators: scala.Null, optional: scala.Null, typeAnnotation: Noop): Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Null,
    typeAnnotation: TSTypeAnnotation
  ): Identifier = js.native
  def identifier(
    name: java.lang.String,
    decorators: scala.Null,
    optional: scala.Null,
    typeAnnotation: TypeAnnotation
  ): Identifier = js.native
  def ifStatement(test: Expression, consequent: Statement): IfStatement = js.native
  def ifStatement(test: Expression, consequent: Statement, alternate: Statement): IfStatement = js.native
  def importDeclaration(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral
  ): ImportDeclaration = js.native
  def importDefaultSpecifier(local: Identifier): ImportDefaultSpecifier = js.native
  def importNamespaceSpecifier(local: Identifier): ImportNamespaceSpecifier = js.native
  def importSpecifier(local: Identifier, imported: Identifier): ImportSpecifier = js.native
  @JSName("importSpecifier")
  def importSpecifier_type(local: Identifier, imported: Identifier, importKind: atBabelTypesLib.atBabelTypesLibStrings.`type`): ImportSpecifier = js.native
  @JSName("importSpecifier")
  def importSpecifier_typeof(local: Identifier, imported: Identifier, importKind: atBabelTypesLib.atBabelTypesLibStrings.typeof): ImportSpecifier = js.native
  def inferredPredicate(): InferredPredicate = js.native
  def interfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | scala.Null],
    body: ObjectTypeAnnotation
  ): InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | scala.Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements]
  ): InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | scala.Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements],
    mixins: js.Array[InterfaceExtends]
  ): InterfaceDeclaration = js.native
  def interfaceExtends(id: Identifier): InterfaceExtends = js.native
  def interfaceExtends(id: Identifier, typeParameters: TypeParameterInstantiation): InterfaceExtends = js.native
  def interfaceTypeAnnotation(_extends: js.Array[InterfaceExtends], body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(_extends: js.UndefOr[scala.Nothing], body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(_extends: scala.Null, body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
  def interpreterDirective(value: java.lang.String): InterpreterDirective = js.native
  def intersectionTypeAnnotation(types: js.Array[FlowType]): IntersectionTypeAnnotation = js.native
  def isAnyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isArrayExpression(node: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayPattern(node: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAwaitExpression(node: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isBigIntLiteral(node: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBigIntLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBinary(node: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinary(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinaryExpression(node: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBlock(node: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlockParent(node: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockStatement(node: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBreakStatement(node: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isCallExpression(node: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCatchClause(node: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isClass(node: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClassBody(node: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassDeclaration(node: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassExpression(node: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassImplements(node: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassMethod(node: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateProperty(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassPrivateProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isCompletionStatement(node: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isConditional(node: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditional(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditionalExpression(node: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isContinueStatement(node: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDeclaration(node: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclareClass(node: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareInterface(node: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareModule(node: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModuleExports(node: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareModuleExports(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareVariable(node: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclaredPredicate(node: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDeclaredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDecorator(node: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDirective(node: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDoExpression(node: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExpression(node: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpressionStatement(node: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isFile(node: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFlow(node: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlow(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowPredicate(node: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowType(node: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFlowType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFor(node: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isFor(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isForInStatement(node: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForStatement(node: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isFunction(node: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionParent(node: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isIdentifier(node: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIfStatement(node: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isImmutable(node: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImport(node: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImport(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isInferredPredicate(node: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInferredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterpreterDirective(node: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isInterpreterDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isJSX(node: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSX(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSXAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingFragment(node: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXClosingFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXElement(node: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXFragment(node: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadChild(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXSpreadChild(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXText(node: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isLVal(node: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLVal(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLabeledStatement(node: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLiteral(node: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLogicalExpression(node: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLoop(node: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isLoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isMemberExpression(node: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMetaProperty(node: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMethod(node: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isNewExpression(node: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNoop(node: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNullLiteral(node: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteral(node: js.Object): scala.Boolean = js.native
  def isNumberLiteral(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumericLiteral(node: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isObjectExpression(node: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectMember(node: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMethod(node: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectPattern(node: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isOpaqueType(node: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOptionalCallExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isPattern(node: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPatternLike(node: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPatternLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPipelineBareFunction(node: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelineBareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPrivate(node: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivateName(node: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isPrivateName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isProgram(node: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProgram(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProperty(node: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isPureish(node: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isPureish(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegexLiteral(node: js.Object): scala.Boolean = js.native
  def isRegexLiteral(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isRestElement(node: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestProperty(node: js.Object): scala.Boolean = js.native
  def isRestProperty(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isReturnStatement(node: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isScopable(node: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isScopable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isSequenceExpression(node: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSpreadElement(node: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadProperty(node: js.Object): scala.Boolean = js.native
  def isSpreadProperty(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isStatement(node: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStringLiteral(node: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isSuper(node: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSuper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSwitchCase(node: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchStatement(node: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSArrayType(node: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSAsExpression(node: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSConditionalType(node: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConditionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructorType(node: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSEntityName(node: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEntityName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumMember(node: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSFunctionType(node: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSInferType(node: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInferType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSMappedType(node: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSOptionalType(node: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSOptionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSRestType(node: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSRestType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSThisType(node: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSTupleType(node: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSType(node: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeElement(node: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeReference(node: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUnionType(node: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTemplateElement(node: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTerminatorless(node: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isThisExpression(node: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThrowStatement(node: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTypeAlias(node: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isUnaryExpression(node: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryLike(node: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUpdateExpression(node: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariance(node: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVariance(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isWhile(node: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhileStatement(node: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isYieldExpression(node: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def jsxAttribute(name: JSXIdentifier): JSXAttribute = js.native
  def jsxAttribute(name: JSXIdentifier, value: JSXElement): JSXAttribute = js.native
  def jsxAttribute(name: JSXIdentifier, value: JSXExpressionContainer): JSXAttribute = js.native
  def jsxAttribute(name: JSXIdentifier, value: JSXFragment): JSXAttribute = js.native
  def jsxAttribute(name: JSXIdentifier, value: StringLiteral): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedName): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedName, value: JSXElement): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedName, value: JSXExpressionContainer): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedName, value: JSXFragment): JSXAttribute = js.native
  def jsxAttribute(name: JSXNamespacedName, value: StringLiteral): JSXAttribute = js.native
  def jsxClosingElement(name: JSXIdentifier): JSXClosingElement = js.native
  def jsxClosingElement(name: JSXMemberExpression): JSXClosingElement = js.native
  def jsxClosingFragment(): JSXClosingFragment = js.native
  def jsxElement(
    openingElement: JSXOpeningElement,
    closingElement: JSXClosingElement,
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    selfClosing: js.Any
  ): JSXElement = js.native
  def jsxElement(
    openingElement: JSXOpeningElement,
    closingElement: js.UndefOr[scala.Nothing],
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    selfClosing: js.Any
  ): JSXElement = js.native
  def jsxElement(
    openingElement: JSXOpeningElement,
    closingElement: scala.Null,
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    selfClosing: js.Any
  ): JSXElement = js.native
  def jsxEmptyExpression(): JSXEmptyExpression = js.native
  def jsxExpressionContainer(expression: Expression): JSXExpressionContainer = js.native
  def jsxExpressionContainer(expression: JSXEmptyExpression): JSXExpressionContainer = js.native
  def jsxFragment(
    openingFragment: JSXOpeningFragment,
    closingFragment: JSXClosingFragment,
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment]
  ): JSXFragment = js.native
  def jsxIdentifier(name: java.lang.String): JSXIdentifier = js.native
  def jsxMemberExpression(`object`: JSXIdentifier, property: JSXIdentifier): JSXMemberExpression = js.native
  def jsxMemberExpression(`object`: JSXMemberExpression, property: JSXIdentifier): JSXMemberExpression = js.native
  def jsxNamespacedName(namespace: JSXIdentifier, name: JSXIdentifier): JSXNamespacedName = js.native
  def jsxOpeningElement(name: JSXIdentifier, attributes: js.Array[JSXAttribute | JSXSpreadAttribute]): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXIdentifier,
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    selfClosing: scala.Boolean
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXIdentifier,
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    selfClosing: scala.Boolean,
    typeParameters: TSTypeParameterInstantiation
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXIdentifier,
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    selfClosing: scala.Boolean,
    typeParameters: TypeParameterInstantiation
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXMemberExpression, attributes: js.Array[JSXAttribute | JSXSpreadAttribute]): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXMemberExpression,
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    selfClosing: scala.Boolean
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXMemberExpression,
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    selfClosing: scala.Boolean,
    typeParameters: TSTypeParameterInstantiation
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXMemberExpression,
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    selfClosing: scala.Boolean,
    typeParameters: TypeParameterInstantiation
  ): JSXOpeningElement = js.native
  def jsxOpeningFragment(): JSXOpeningFragment = js.native
  def jsxSpreadAttribute(argument: Expression): JSXSpreadAttribute = js.native
  def jsxSpreadChild(expression: Expression): JSXSpreadChild = js.native
  def jsxText(value: java.lang.String): JSXText = js.native
  def labeledStatement(label: Identifier, body: Statement): LabeledStatement = js.native
  @JSName("logicalExpression")
  def `logicalExpression_&&`(operator: atBabelTypesLib.atBabelTypesLibStrings.`&&`, left: Expression, right: Expression): LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_??`(operator: atBabelTypesLib.atBabelTypesLibStrings.`??`, left: Expression, right: Expression): LogicalExpression = js.native
  @JSName("logicalExpression")
  def `logicalExpression_||`(operator: atBabelTypesLib.atBabelTypesLibStrings.`||`, left: Expression, right: Expression): LogicalExpression = js.native
  def memberExpression(`object`: Expression, property: js.Any): MemberExpression = js.native
  def memberExpression(`object`: Expression, property: js.Any, computed: scala.Boolean): MemberExpression = js.native
  def memberExpression(
    `object`: Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`
  ): MemberExpression = js.native
  def memberExpression(
    `object`: Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`
  ): MemberExpression = js.native
  def metaProperty(meta: Identifier, property: Identifier): MetaProperty = js.native
  def mixedTypeAnnotation(): MixedTypeAnnotation = js.native
  def newExpression(callee: Expression, _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement]): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: TypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: TypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: scala.Null,
    typeArguments: TypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: scala.Null,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: scala.Null,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  def noop(): Noop = js.native
  def nullLiteral(): NullLiteral = js.native
  def nullLiteralTypeAnnotation(): NullLiteralTypeAnnotation = js.native
  def nullableTypeAnnotation(typeAnnotation: FlowType): NullableTypeAnnotation = js.native
  def numberLiteralTypeAnnotation(value: scala.Double): NumberLiteralTypeAnnotation = js.native
  def numberTypeAnnotation(): NumberTypeAnnotation = js.native
  def numericLiteral(value: scala.Double): NumericLiteral = js.native
  def objectExpression(properties: js.Array[ObjectMethod | ObjectProperty | SpreadElement]): ObjectExpression = js.native
  def objectMethod(
    kind: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set
    ],
    key: js.Any,
    params: js.Array[LVal],
    body: BlockStatement,
    computed: js.UndefOr[scala.Boolean],
    async: js.UndefOr[scala.Boolean],
    decorators: js.UndefOr[js.Array[Decorator] | scala.Null],
    generator: js.UndefOr[scala.Boolean],
    returnType: js.UndefOr[TypeAnnotation | TSTypeAnnotation | Noop | scala.Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | scala.Null]
  ): ObjectMethod = js.native
  def objectPattern(properties: js.Array[ObjectProperty | RestElement]): ObjectPattern = js.native
  def objectPattern(properties: js.Array[ObjectProperty | RestElement], decorators: js.Array[Decorator]): ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: js.Array[Decorator],
    typeAnnotation: Noop
  ): ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: js.Array[Decorator],
    typeAnnotation: TSTypeAnnotation
  ): ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: js.Array[Decorator],
    typeAnnotation: TypeAnnotation
  ): ObjectPattern = js.native
  def objectPattern(properties: js.Array[RestElement | ObjectProperty], decorators: scala.Null, typeAnnotation: Noop): ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: scala.Null,
    typeAnnotation: TSTypeAnnotation
  ): ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: scala.Null,
    typeAnnotation: TypeAnnotation
  ): ObjectPattern = js.native
  def objectProperty(key: js.Any, value: Expression | PatternLike): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: Expression | PatternLike, computed: scala.Boolean): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: Expression | PatternLike, computed: scala.Boolean, shorthand: scala.Boolean): ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: Expression | PatternLike,
    computed: scala.Boolean,
    shorthand: scala.Boolean,
    decorators: js.Array[Decorator]
  ): ObjectProperty = js.native
  def objectTypeAnnotation(properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty]): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[ObjectTypeInternalSlot]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: scala.Null,
    callProperties: js.Array[ObjectTypeCallProperty]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: scala.Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: scala.Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: scala.Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: scala.Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: scala.Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[ObjectTypeInternalSlot]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: scala.Null,
    callProperties: scala.Null,
    internalSlots: scala.Null,
    exact: scala.Boolean,
    inexact: scala.Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeCallProperty(value: FlowType): ObjectTypeCallProperty = js.native
  def objectTypeCallProperty(value: FlowType, _static: scala.Boolean): ObjectTypeCallProperty = js.native
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType, variance: Variance): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType, variance: Variance, _static: scala.Boolean): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType, variance: scala.Null, _static: scala.Boolean): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: js.UndefOr[scala.Nothing], key: FlowType, value: FlowType): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: js.UndefOr[scala.Nothing], key: FlowType, value: FlowType, variance: Variance): ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: FlowType,
    value: FlowType,
    variance: Variance,
    _static: scala.Boolean
  ): ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: FlowType,
    value: FlowType,
    variance: scala.Null,
    _static: scala.Boolean
  ): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: scala.Null, key: FlowType, value: FlowType): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: scala.Null, key: FlowType, value: FlowType, variance: Variance): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: scala.Null, key: FlowType, value: FlowType, variance: Variance, _static: scala.Boolean): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: scala.Null, key: FlowType, value: FlowType, variance: scala.Null, _static: scala.Boolean): ObjectTypeIndexer = js.native
  def objectTypeInternalSlot(
    id: Identifier,
    value: FlowType,
    optional: scala.Boolean,
    _static: scala.Boolean,
    method: scala.Boolean
  ): ObjectTypeInternalSlot = js.native
  def objectTypeProperty(key: Identifier | StringLiteral, value: FlowType): ObjectTypeProperty = js.native
  def objectTypeProperty(key: Identifier | StringLiteral, value: FlowType, variance: Variance): ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: Identifier | StringLiteral,
    value: FlowType,
    variance: Variance,
    kind: atBabelTypesLib.atBabelTypesLibStrings.init | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set
  ): ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: Identifier | StringLiteral,
    value: FlowType,
    variance: Variance,
    kind: atBabelTypesLib.atBabelTypesLibStrings.init | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set,
    optional: scala.Boolean
  ): ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: Identifier | StringLiteral,
    value: FlowType,
    variance: Variance,
    kind: atBabelTypesLib.atBabelTypesLibStrings.init | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean
  ): ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: Identifier | StringLiteral,
    value: FlowType,
    variance: Variance,
    kind: atBabelTypesLib.atBabelTypesLibStrings.init | atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set,
    optional: scala.Boolean,
    proto: scala.Boolean,
    _static: scala.Boolean
  ): ObjectTypeProperty = js.native
  def objectTypeSpreadProperty(argument: FlowType): ObjectTypeSpreadProperty = js.native
  def opaqueType(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    supertype: FlowType | js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    supertype: scala.Null,
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: FlowType | js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: scala.Null,
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(
    id: Identifier,
    typeParameters: scala.Null,
    supertype: FlowType | js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(id: Identifier, typeParameters: scala.Null, supertype: scala.Null, impltype: FlowType): OpaqueType = js.native
  def optionalCallExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: scala.Boolean
  ): OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: scala.Boolean,
    typeArguments: TypeParameterInstantiation
  ): OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: scala.Boolean,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: scala.Boolean,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): OptionalCallExpression = js.native
  def optionalMemberExpression(
    `object`: Expression,
    property: js.Any,
    computed: js.UndefOr[scala.Nothing],
    optional: scala.Boolean
  ): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: Expression, property: js.Any, computed: scala.Boolean, optional: scala.Boolean): OptionalMemberExpression = js.native
  def parenthesizedExpression(expression: Expression): ParenthesizedExpression = js.native
  def pipelineBareFunction(callee: Expression): PipelineBareFunction = js.native
  def pipelinePrimaryTopicReference(): PipelinePrimaryTopicReference = js.native
  def pipelineTopicExpression(expression: Expression): PipelineTopicExpression = js.native
  def privateName(id: Identifier): PrivateName = js.native
  def program(body: js.Array[Statement]): Program = js.native
  def program(body: js.Array[Statement], directives: js.Array[Directive]): Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.module
  ): Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.module,
    interpreter: InterpreterDirective
  ): Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.module,
    interpreter: InterpreterDirective,
    sourceFile: java.lang.String
  ): Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.module,
    interpreter: scala.Null,
    sourceFile: java.lang.String
  ): Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.script
  ): Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.script,
    interpreter: InterpreterDirective
  ): Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.script,
    interpreter: InterpreterDirective,
    sourceFile: java.lang.String
  ): Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: atBabelTypesLib.atBabelTypesLibStrings.script,
    interpreter: scala.Null,
    sourceFile: java.lang.String
  ): Program = js.native
  def qualifiedTypeIdentifier(id: Identifier, qualification: Identifier): QualifiedTypeIdentifier = js.native
  def qualifiedTypeIdentifier(id: Identifier, qualification: QualifiedTypeIdentifier): QualifiedTypeIdentifier = js.native
  def regExpLiteral(pattern: java.lang.String): RegExpLiteral = js.native
  def regExpLiteral(pattern: java.lang.String, flags: java.lang.String): RegExpLiteral = js.native
  def removeProperties(n: Node): scala.Unit = js.native
  def removeProperties(n: Node, opts: atBabelTypesLib.Anon_PreserveComments): scala.Unit = js.native
  def removePropertiesDeep[T /* <: Node */](n: T): T = js.native
  def removePropertiesDeep[T /* <: Node */](n: T, opts: atBabelTypesLib.Anon_PreserveComments): T = js.native
  def restElement(argument: LVal): RestElement = js.native
  def restElement(argument: LVal, decorators: js.Array[Decorator]): RestElement = js.native
  def restElement(argument: LVal, decorators: js.Array[Decorator], typeAnnotation: Noop): RestElement = js.native
  def restElement(argument: LVal, decorators: js.Array[Decorator], typeAnnotation: TSTypeAnnotation): RestElement = js.native
  def restElement(argument: LVal, decorators: js.Array[Decorator], typeAnnotation: TypeAnnotation): RestElement = js.native
  def restElement(argument: LVal, decorators: scala.Null, typeAnnotation: Noop): RestElement = js.native
  def restElement(argument: LVal, decorators: scala.Null, typeAnnotation: TSTypeAnnotation): RestElement = js.native
  def restElement(argument: LVal, decorators: scala.Null, typeAnnotation: TypeAnnotation): RestElement = js.native
  def returnStatement(): ReturnStatement = js.native
  def returnStatement(argument: Expression): ReturnStatement = js.native
  def sequenceExpression(expressions: js.Array[Expression]): SequenceExpression = js.native
  def spreadElement(argument: Expression): SpreadElement = js.native
  def stringLiteral(value: java.lang.String): StringLiteral = js.native
  def stringLiteralTypeAnnotation(value: java.lang.String): StringLiteralTypeAnnotation = js.native
  def stringTypeAnnotation(): StringTypeAnnotation = js.native
  def switchCase(test: Expression | js.UndefOr[scala.Nothing], consequent: js.Array[Statement]): SwitchCase = js.native
  def switchCase(test: scala.Null, consequent: js.Array[Statement]): SwitchCase = js.native
  def switchStatement(discriminant: Expression, cases: js.Array[SwitchCase]): SwitchStatement = js.native
  def taggedTemplateExpression(tag: Expression, quasi: TemplateLiteral): TaggedTemplateExpression = js.native
  def taggedTemplateExpression(tag: Expression, quasi: TemplateLiteral, typeParameters: TSTypeParameterInstantiation): TaggedTemplateExpression = js.native
  def taggedTemplateExpression(tag: Expression, quasi: TemplateLiteral, typeParameters: TypeParameterInstantiation): TaggedTemplateExpression = js.native
  def templateElement(value: js.Any): TemplateElement = js.native
  def templateElement(value: js.Any, tail: scala.Boolean): TemplateElement = js.native
  def templateLiteral(quasis: js.Array[TemplateElement], expressions: js.Array[Expression]): TemplateLiteral = js.native
  def thisExpression(): ThisExpression = js.native
  def thisTypeAnnotation(): ThisTypeAnnotation = js.native
  def throwStatement(argument: Expression): ThrowStatement = js.native
  def traverse[T](n: Node, h: TraversalHandler[T]): scala.Unit = js.native
  def traverse[T](n: Node, h: TraversalHandlers[T]): scala.Unit = js.native
  def traverse[T](n: Node, h: TraversalHandlers[T], state: T): scala.Unit = js.native
  def traverse[T](n: Node, h: TraversalHandler[T], state: T): scala.Unit = js.native
  def tryStatement(block: BlockStatement): TryStatement = js.native
  def tryStatement(block: BlockStatement, handler: CatchClause): TryStatement = js.native
  def tryStatement(block: BlockStatement, handler: CatchClause, finalizer: BlockStatement): TryStatement = js.native
  def tryStatement(block: BlockStatement, handler: scala.Null, finalizer: BlockStatement): TryStatement = js.native
  def tsAnyKeyword(): TSAnyKeyword = js.native
  def tsArrayType(elementType: TSType): TSArrayType = js.native
  def tsAsExpression(expression: Expression, typeAnnotation: TSType): TSAsExpression = js.native
  def tsBooleanKeyword(): TSBooleanKeyword = js.native
  def tsCallSignatureDeclaration(): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(typeParameters: TSTypeParameterDeclaration): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(typeParameters: TSTypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: TSTypeParameterDeclaration,
    parameters: scala.Null,
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(typeParameters: scala.Null, parameters: js.Array[Identifier | RestElement]): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(typeParameters: scala.Null, parameters: scala.Null, typeAnnotation: TSTypeAnnotation): TSCallSignatureDeclaration = js.native
  def tsConditionalType(checkType: TSType, extendsType: TSType, trueType: TSType, falseType: TSType): TSConditionalType = js.native
  def tsConstructSignatureDeclaration(): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(typeParameters: TSTypeParameterDeclaration): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(typeParameters: TSTypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: TSTypeParameterDeclaration,
    parameters: scala.Null,
    typeAnnotation: TSTypeAnnotation
  ): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(typeParameters: scala.Null, parameters: js.Array[Identifier | RestElement]): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(typeParameters: scala.Null, parameters: scala.Null, typeAnnotation: TSTypeAnnotation): TSConstructSignatureDeclaration = js.native
  def tsConstructorType(): TSConstructorType = js.native
  def tsConstructorType(typeParameters: TSTypeParameterDeclaration): TSConstructorType = js.native
  def tsConstructorType(typeParameters: TSTypeParameterDeclaration, typeAnnotation: TSTypeAnnotation): TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: TSTypeParameterDeclaration,
    typeAnnotation: TSTypeAnnotation,
    parameters: js.Array[Identifier | RestElement]
  ): TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: TSTypeParameterDeclaration,
    typeAnnotation: scala.Null,
    parameters: js.Array[Identifier | RestElement]
  ): TSConstructorType = js.native
  def tsConstructorType(typeParameters: scala.Null, typeAnnotation: TSTypeAnnotation): TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: scala.Null,
    typeAnnotation: TSTypeAnnotation,
    parameters: js.Array[Identifier | RestElement]
  ): TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: scala.Null,
    typeAnnotation: scala.Null,
    parameters: js.Array[Identifier | RestElement]
  ): TSConstructorType = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[LVal]
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[LVal],
    returnType: TSTypeAnnotation | Noop
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[LVal],
    returnType: TSTypeAnnotation | Noop,
    async: scala.Boolean
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[LVal],
    returnType: TSTypeAnnotation | Noop,
    async: scala.Boolean,
    declare: scala.Boolean
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[LVal],
    returnType: TSTypeAnnotation | Noop,
    async: scala.Boolean,
    declare: scala.Boolean,
    generator: scala.Boolean
  ): TSDeclareFunction = js.native
  def tsDeclareMethod(
    decorators: js.UndefOr[js.Array[Decorator] | scala.Null],
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[LVal],
    returnType: js.UndefOr[TSTypeAnnotation | Noop | scala.Null],
    `abstract`: js.UndefOr[scala.Boolean | scala.Null],
    access: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    accessibility: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.public | atBabelTypesLib.atBabelTypesLibStrings.`private` | atBabelTypesLib.atBabelTypesLibStrings.`protected` | scala.Null
    ],
    async: js.UndefOr[scala.Boolean],
    computed: js.UndefOr[scala.Boolean],
    generator: js.UndefOr[scala.Boolean],
    kind: js.UndefOr[
      atBabelTypesLib.atBabelTypesLibStrings.get | atBabelTypesLib.atBabelTypesLibStrings.set | atBabelTypesLib.atBabelTypesLibStrings.method | atBabelTypesLib.atBabelTypesLibStrings.constructor
    ],
    optional: js.UndefOr[scala.Boolean | scala.Null],
    _static: js.UndefOr[scala.Boolean | scala.Null]
  ): TSDeclareMethod = js.native
  def tsEnumDeclaration(id: Identifier, members: js.Array[TSEnumMember]): TSEnumDeclaration = js.native
  def tsEnumDeclaration(id: Identifier, members: js.Array[TSEnumMember], _const: scala.Boolean): TSEnumDeclaration = js.native
  def tsEnumDeclaration(id: Identifier, members: js.Array[TSEnumMember], _const: scala.Boolean, declare: scala.Boolean): TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: scala.Boolean,
    declare: scala.Boolean,
    initializer: Expression
  ): TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: scala.Boolean,
    declare: scala.Null,
    initializer: Expression
  ): TSEnumDeclaration = js.native
  def tsEnumDeclaration(id: Identifier, members: js.Array[TSEnumMember], _const: scala.Null, declare: scala.Boolean): TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: scala.Null,
    declare: scala.Boolean,
    initializer: Expression
  ): TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: scala.Null,
    declare: scala.Null,
    initializer: Expression
  ): TSEnumDeclaration = js.native
  def tsEnumMember(id: Identifier): TSEnumMember = js.native
  def tsEnumMember(id: Identifier, initializer: Expression): TSEnumMember = js.native
  def tsEnumMember(id: StringLiteral): TSEnumMember = js.native
  def tsEnumMember(id: StringLiteral, initializer: Expression): TSEnumMember = js.native
  def tsExportAssignment(expression: Expression): TSExportAssignment = js.native
  def tsExpressionWithTypeArguments(expression: TSEntityName): TSExpressionWithTypeArguments = js.native
  def tsExpressionWithTypeArguments(expression: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSExpressionWithTypeArguments = js.native
  def tsExternalModuleReference(expression: StringLiteral): TSExternalModuleReference = js.native
  def tsFunctionType(): TSFunctionType = js.native
  def tsFunctionType(typeParameters: TSTypeParameterDeclaration): TSFunctionType = js.native
  def tsFunctionType(typeParameters: TSTypeParameterDeclaration, typeAnnotation: TSTypeAnnotation): TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: TSTypeParameterDeclaration,
    typeAnnotation: TSTypeAnnotation,
    parameters: js.Array[Identifier | RestElement]
  ): TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: TSTypeParameterDeclaration,
    typeAnnotation: scala.Null,
    parameters: js.Array[Identifier | RestElement]
  ): TSFunctionType = js.native
  def tsFunctionType(typeParameters: scala.Null, typeAnnotation: TSTypeAnnotation): TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: scala.Null,
    typeAnnotation: TSTypeAnnotation,
    parameters: js.Array[Identifier | RestElement]
  ): TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: scala.Null,
    typeAnnotation: scala.Null,
    parameters: js.Array[Identifier | RestElement]
  ): TSFunctionType = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSEntityName): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSEntityName, isExport: scala.Boolean): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSExternalModuleReference): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSExternalModuleReference, isExport: scala.Boolean): TSImportEqualsDeclaration = js.native
  def tsIndexSignature(parameters: js.Array[Identifier]): TSIndexSignature = js.native
  def tsIndexSignature(parameters: js.Array[Identifier], typeAnnotation: TSTypeAnnotation): TSIndexSignature = js.native
  def tsIndexSignature(parameters: js.Array[Identifier], typeAnnotation: TSTypeAnnotation, readonly: scala.Boolean): TSIndexSignature = js.native
  def tsIndexSignature(parameters: js.Array[Identifier], typeAnnotation: scala.Null, readonly: scala.Boolean): TSIndexSignature = js.native
  def tsIndexedAccessType(objectType: TSType, indexType: TSType): TSIndexedAccessType = js.native
  def tsInferType(typeParameter: TSTypeParameter): TSInferType = js.native
  def tsInterfaceBody(body: js.Array[TSTypeElement]): TSInterfaceBody = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody,
    declare: scala.Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody,
    declare: scala.Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: scala.Null,
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: scala.Null,
    body: TSInterfaceBody,
    declare: scala.Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody,
    declare: scala.Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody,
    declare: scala.Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: scala.Null,
    body: TSInterfaceBody,
    declare: scala.Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: scala.Null,
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody,
    declare: scala.Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: scala.Null,
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody,
    declare: scala.Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(id: Identifier, typeParameters: scala.Null, _extends: scala.Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: scala.Null,
    _extends: scala.Null,
    body: TSInterfaceBody,
    declare: scala.Boolean
  ): TSInterfaceDeclaration = js.native
  def tsIntersectionType(types: js.Array[TSType]): TSIntersectionType = js.native
  def tsLiteralType(literal: BooleanLiteral): TSLiteralType = js.native
  def tsLiteralType(literal: NumericLiteral): TSLiteralType = js.native
  def tsLiteralType(literal: StringLiteral): TSLiteralType = js.native
  def tsMappedType(typeParameter: TSTypeParameter): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameter, typeAnnotation: TSType): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameter, typeAnnotation: TSType, optional: scala.Boolean): TSMappedType = js.native
  def tsMappedType(
    typeParameter: TSTypeParameter,
    typeAnnotation: TSType,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): TSMappedType = js.native
  def tsMappedType(
    typeParameter: TSTypeParameter,
    typeAnnotation: TSType,
    optional: scala.Null,
    readonly: scala.Boolean
  ): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameter, typeAnnotation: scala.Null, optional: scala.Boolean): TSMappedType = js.native
  def tsMappedType(
    typeParameter: TSTypeParameter,
    typeAnnotation: scala.Null,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): TSMappedType = js.native
  def tsMappedType(
    typeParameter: TSTypeParameter,
    typeAnnotation: scala.Null,
    optional: scala.Null,
    readonly: scala.Boolean
  ): TSMappedType = js.native
  def tsMethodSignature(key: Expression): TSMethodSignature = js.native
  def tsMethodSignature(key: Expression, typeParameters: TSTypeParameterDeclaration): TSMethodSignature = js.native
  def tsMethodSignature(
    key: Expression,
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement]
  ): TSMethodSignature = js.native
  def tsMethodSignature(
    key: Expression,
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
  def tsMethodSignature(
    key: Expression,
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation,
    computed: scala.Boolean
  ): TSMethodSignature = js.native
  def tsMethodSignature(
    key: Expression,
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): TSMethodSignature = js.native
  def tsModuleBlock(body: js.Array[Statement]): TSModuleBlock = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleBlock): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleBlock, declare: scala.Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleBlock, declare: scala.Boolean, global: scala.Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleBlock, declare: scala.Null, global: scala.Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleDeclaration, declare: scala.Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleDeclaration, declare: scala.Boolean, global: scala.Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleDeclaration, declare: scala.Null, global: scala.Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleBlock): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleBlock, declare: scala.Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleBlock, declare: scala.Boolean, global: scala.Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleBlock, declare: scala.Null, global: scala.Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleDeclaration, declare: scala.Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleDeclaration, declare: scala.Boolean, global: scala.Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleDeclaration, declare: scala.Null, global: scala.Boolean): TSModuleDeclaration = js.native
  def tsNamespaceExportDeclaration(id: Identifier): TSNamespaceExportDeclaration = js.native
  def tsNeverKeyword(): TSNeverKeyword = js.native
  def tsNonNullExpression(expression: Expression): TSNonNullExpression = js.native
  def tsNullKeyword(): TSNullKeyword = js.native
  def tsNumberKeyword(): TSNumberKeyword = js.native
  def tsObjectKeyword(): TSObjectKeyword = js.native
  def tsOptionalType(typeAnnotation: TSType): TSOptionalType = js.native
  def tsParameterProperty(parameter: AssignmentPattern): TSParameterProperty = js.native
  def tsParameterProperty(parameter: AssignmentPattern, accessibility: scala.Null, readonly: scala.Boolean): TSParameterProperty = js.native
  def tsParameterProperty(parameter: Identifier): TSParameterProperty = js.native
  def tsParameterProperty(parameter: Identifier, accessibility: scala.Null, readonly: scala.Boolean): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(parameter: AssignmentPattern, accessibility: atBabelTypesLib.atBabelTypesLibStrings.`private`): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: AssignmentPattern,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`private`,
    readonly: scala.Boolean
  ): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(parameter: Identifier, accessibility: atBabelTypesLib.atBabelTypesLibStrings.`private`): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(
    parameter: Identifier,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`private`,
    readonly: scala.Boolean
  ): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(parameter: AssignmentPattern, accessibility: atBabelTypesLib.atBabelTypesLibStrings.`protected`): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: AssignmentPattern,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`protected`,
    readonly: scala.Boolean
  ): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(parameter: Identifier, accessibility: atBabelTypesLib.atBabelTypesLibStrings.`protected`): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(
    parameter: Identifier,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.`protected`,
    readonly: scala.Boolean
  ): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(parameter: AssignmentPattern, accessibility: atBabelTypesLib.atBabelTypesLibStrings.public): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: AssignmentPattern,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.public,
    readonly: scala.Boolean
  ): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(parameter: Identifier, accessibility: atBabelTypesLib.atBabelTypesLibStrings.public): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(
    parameter: Identifier,
    accessibility: atBabelTypesLib.atBabelTypesLibStrings.public,
    readonly: scala.Boolean
  ): TSParameterProperty = js.native
  def tsParenthesizedType(typeAnnotation: TSType): TSParenthesizedType = js.native
  def tsPropertySignature(key: Expression): TSPropertySignature = js.native
  def tsPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation): TSPropertySignature = js.native
  def tsPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression): TSPropertySignature = js.native
  def tsPropertySignature(
    key: Expression,
    typeAnnotation: TSTypeAnnotation,
    initializer: Expression,
    computed: scala.Boolean
  ): TSPropertySignature = js.native
  def tsPropertySignature(
    key: Expression,
    typeAnnotation: TSTypeAnnotation,
    initializer: Expression,
    computed: scala.Boolean,
    optional: scala.Boolean
  ): TSPropertySignature = js.native
  def tsPropertySignature(
    key: Expression,
    typeAnnotation: TSTypeAnnotation,
    initializer: Expression,
    computed: scala.Boolean,
    optional: scala.Boolean,
    readonly: scala.Boolean
  ): TSPropertySignature = js.native
  def tsQualifiedName(left: TSEntityName, right: Identifier): TSQualifiedName = js.native
  def tsRestType(typeAnnotation: TSType): TSRestType = js.native
  def tsStringKeyword(): TSStringKeyword = js.native
  def tsSymbolKeyword(): TSSymbolKeyword = js.native
  def tsThisType(): TSThisType = js.native
  def tsTupleType(elementTypes: js.Array[TSType]): TSTupleType = js.native
  def tsTypeAliasDeclaration(id: Identifier, typeParameters: TSTypeParameterDeclaration, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    typeAnnotation: TSType,
    declare: scala.Boolean
  ): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    typeAnnotation: TSType,
    declare: scala.Boolean
  ): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(id: Identifier, typeParameters: scala.Null, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(id: Identifier, typeParameters: scala.Null, typeAnnotation: TSType, declare: scala.Boolean): TSTypeAliasDeclaration = js.native
  def tsTypeAnnotation(typeAnnotation: TSType): TSTypeAnnotation = js.native
  def tsTypeAssertion(typeAnnotation: TSType, expression: Expression): TSTypeAssertion = js.native
  def tsTypeLiteral(members: js.Array[TSTypeElement]): TSTypeLiteral = js.native
  def tsTypeOperator(typeAnnotation: TSType): TSTypeOperator = js.native
  def tsTypeOperator(typeAnnotation: TSType, operator: java.lang.String): TSTypeOperator = js.native
  def tsTypeParameter(): TSTypeParameter = js.native
  def tsTypeParameter(constraint: TSType): TSTypeParameter = js.native
  def tsTypeParameter(constraint: TSType, _default: TSType): TSTypeParameter = js.native
  def tsTypeParameter(constraint: TSType, _default: TSType, name: java.lang.String): TSTypeParameter = js.native
  def tsTypeParameter(constraint: TSType, _default: scala.Null, name: java.lang.String): TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: TSType): TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: TSType, name: java.lang.String): TSTypeParameter = js.native
  def tsTypeParameter(constraint: scala.Null, _default: scala.Null, name: java.lang.String): TSTypeParameter = js.native
  def tsTypeParameterDeclaration(params: js.Array[TSTypeParameter]): TSTypeParameterDeclaration = js.native
  def tsTypeParameterInstantiation(params: js.Array[TSType]): TSTypeParameterInstantiation = js.native
  def tsTypePredicate(parameterName: Identifier, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
  def tsTypeQuery(exprName: TSEntityName): TSTypeQuery = js.native
  def tsTypeReference(typeName: TSEntityName): TSTypeReference = js.native
  def tsTypeReference(typeName: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSTypeReference = js.native
  def tsUndefinedKeyword(): TSUndefinedKeyword = js.native
  def tsUnionType(types: js.Array[TSType]): TSUnionType = js.native
  def tsUnknownKeyword(): TSUnknownKeyword = js.native
  def tsVoidKeyword(): TSVoidKeyword = js.native
  def tupleTypeAnnotation(types: js.Array[FlowType]): TupleTypeAnnotation = js.native
  def typeAlias(id: Identifier, typeParameters: TypeParameterDeclaration, right: FlowType): TypeAlias = js.native
  def typeAlias(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], right: FlowType): TypeAlias = js.native
  def typeAlias(id: Identifier, typeParameters: scala.Null, right: FlowType): TypeAlias = js.native
  def typeAnnotation(typeAnnotation: FlowType): TypeAnnotation = js.native
  def typeCastExpression(expression: Expression, typeAnnotation: TypeAnnotation): TypeCastExpression = js.native
  def typeParameter(): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: FlowType): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: FlowType, variance: Variance): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: FlowType, variance: Variance, name: java.lang.String): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: FlowType, variance: scala.Null, name: java.lang.String): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: scala.Null, variance: Variance): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: scala.Null, variance: Variance, name: java.lang.String): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: scala.Null, variance: scala.Null, name: java.lang.String): TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: FlowType): TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: FlowType, variance: Variance): TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: FlowType, variance: Variance, name: java.lang.String): TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: FlowType, variance: scala.Null, name: java.lang.String): TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: scala.Null, variance: Variance): TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: scala.Null, variance: Variance, name: java.lang.String): TypeParameter = js.native
  def typeParameter(bound: scala.Null, _default: scala.Null, variance: scala.Null, name: java.lang.String): TypeParameter = js.native
  def typeParameterDeclaration(params: js.Array[TypeParameter]): TypeParameterDeclaration = js.native
  def typeParameterInstantiation(params: js.Array[FlowType]): TypeParameterInstantiation = js.native
  def typeofTypeAnnotation(argument: FlowType): TypeofTypeAnnotation = js.native
  @JSName("unaryExpression")
  def `unaryExpression_!`(operator: atBabelTypesLib.atBabelTypesLibStrings.`!`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_!`(operator: atBabelTypesLib.atBabelTypesLibStrings.`!`, argument: Expression, prefix: scala.Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_+`(operator: atBabelTypesLib.atBabelTypesLibStrings.`+`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_+`(operator: atBabelTypesLib.atBabelTypesLibStrings.`+`, argument: Expression, prefix: scala.Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_-`(operator: atBabelTypesLib.atBabelTypesLibStrings.`-`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_-`(operator: atBabelTypesLib.atBabelTypesLibStrings.`-`, argument: Expression, prefix: scala.Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(operator: atBabelTypesLib.atBabelTypesLibStrings.delete, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(
    operator: atBabelTypesLib.atBabelTypesLibStrings.delete,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_throw(operator: atBabelTypesLib.atBabelTypesLibStrings.`throw`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_throw(
    operator: atBabelTypesLib.atBabelTypesLibStrings.`throw`,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(operator: atBabelTypesLib.atBabelTypesLibStrings.typeof, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(
    operator: atBabelTypesLib.atBabelTypesLibStrings.typeof,
    argument: Expression,
    prefix: scala.Boolean
  ): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(operator: atBabelTypesLib.atBabelTypesLibStrings.void, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(operator: atBabelTypesLib.atBabelTypesLibStrings.void, argument: Expression, prefix: scala.Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_~`(operator: atBabelTypesLib.atBabelTypesLibStrings.`~`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def `unaryExpression_~`(operator: atBabelTypesLib.atBabelTypesLibStrings.`~`, argument: Expression, prefix: scala.Boolean): UnaryExpression = js.native
  def unionTypeAnnotation(types: js.Array[FlowType]): UnionTypeAnnotation = js.native
  @JSName("updateExpression")
  def `updateExpression_++`(operator: atBabelTypesLib.atBabelTypesLibStrings.`++`, argument: Expression): UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_++`(operator: atBabelTypesLib.atBabelTypesLibStrings.`++`, argument: Expression, prefix: scala.Boolean): UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_--`(operator: atBabelTypesLib.atBabelTypesLibStrings.`--`, argument: Expression): UpdateExpression = js.native
  @JSName("updateExpression")
  def `updateExpression_--`(operator: atBabelTypesLib.atBabelTypesLibStrings.`--`, argument: Expression, prefix: scala.Boolean): UpdateExpression = js.native
  def validate(n: Node, key: java.lang.String, value: js.Any): scala.Unit = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(kind: atBabelTypesLib.atBabelTypesLibStrings.const, declarations: js.Array[VariableDeclarator]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(
    kind: atBabelTypesLib.atBabelTypesLibStrings.const,
    declarations: js.Array[VariableDeclarator],
    declare: scala.Boolean
  ): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(kind: atBabelTypesLib.atBabelTypesLibStrings.let, declarations: js.Array[VariableDeclarator]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(
    kind: atBabelTypesLib.atBabelTypesLibStrings.let,
    declarations: js.Array[VariableDeclarator],
    declare: scala.Boolean
  ): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(kind: atBabelTypesLib.atBabelTypesLibStrings.`var`, declarations: js.Array[VariableDeclarator]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(
    kind: atBabelTypesLib.atBabelTypesLibStrings.`var`,
    declarations: js.Array[VariableDeclarator],
    declare: scala.Boolean
  ): VariableDeclaration = js.native
  def variableDeclarator(id: LVal): VariableDeclarator = js.native
  def variableDeclarator(id: LVal, init: Expression): VariableDeclarator = js.native
  def variableDeclarator(id: LVal, init: Expression, definite: scala.Boolean): VariableDeclarator = js.native
  def variableDeclarator(id: LVal, init: scala.Null, definite: scala.Boolean): VariableDeclarator = js.native
  @JSName("variance")
  def variance_minus(kind: atBabelTypesLib.atBabelTypesLibStrings.minus): Variance = js.native
  @JSName("variance")
  def variance_plus(kind: atBabelTypesLib.atBabelTypesLibStrings.plus): Variance = js.native
  def voidTypeAnnotation(): VoidTypeAnnotation = js.native
  def whileStatement(test: Expression, body: BlockStatement): WhileStatement = js.native
  def whileStatement(test: Expression, body: Statement): WhileStatement = js.native
  def withStatement(`object`: Expression, body: BlockStatement): WithStatement = js.native
  def withStatement(`object`: Expression, body: Statement): WithStatement = js.native
  def yieldExpression(): YieldExpression = js.native
  def yieldExpression(argument: Expression): YieldExpression = js.native
  def yieldExpression(argument: Expression, delegate: scala.Boolean): YieldExpression = js.native
  def yieldExpression(argument: scala.Null, delegate: scala.Boolean): YieldExpression = js.native
}

