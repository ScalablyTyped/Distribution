package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.Anon_Cooked
import typings.atBabelTypes.Anon_PreserveComments
import typings.atBabelTypes.atBabelTypesNumbers.`false`
import typings.atBabelTypes.atBabelTypesNumbers.`true`
import typings.atBabelTypes.atBabelTypesStrings.CommonJS
import typings.atBabelTypes.atBabelTypesStrings.ES
import typings.atBabelTypes.atBabelTypesStrings.`!==`
import typings.atBabelTypes.atBabelTypesStrings.`!=`
import typings.atBabelTypes.atBabelTypesStrings.`!`
import typings.atBabelTypes.atBabelTypesStrings.`%`
import typings.atBabelTypes.atBabelTypesStrings.`&&`
import typings.atBabelTypes.atBabelTypesStrings.`&`
import typings.atBabelTypes.atBabelTypesStrings.`**`
import typings.atBabelTypes.atBabelTypesStrings.`++`
import typings.atBabelTypes.atBabelTypesStrings.`+`
import typings.atBabelTypes.atBabelTypesStrings.`--`
import typings.atBabelTypes.atBabelTypesStrings.`-`
import typings.atBabelTypes.atBabelTypesStrings.`/`
import typings.atBabelTypes.atBabelTypesStrings.`<<`
import typings.atBabelTypes.atBabelTypesStrings.`<=`
import typings.atBabelTypes.atBabelTypesStrings.`<`
import typings.atBabelTypes.atBabelTypesStrings.`===`
import typings.atBabelTypes.atBabelTypesStrings.`==`
import typings.atBabelTypes.atBabelTypesStrings.`>=`
import typings.atBabelTypes.atBabelTypesStrings.`>>>`
import typings.atBabelTypes.atBabelTypesStrings.`>>`
import typings.atBabelTypes.atBabelTypesStrings.`>`
import typings.atBabelTypes.atBabelTypesStrings.`??`
import typings.atBabelTypes.atBabelTypesStrings.`_backtick^_backtick`
import typings.atBabelTypes.atBabelTypesStrings.`private`
import typings.atBabelTypes.atBabelTypesStrings.`protected`
import typings.atBabelTypes.atBabelTypesStrings.`throw`
import typings.atBabelTypes.atBabelTypesStrings.`type`
import typings.atBabelTypes.atBabelTypesStrings.`var`
import typings.atBabelTypes.atBabelTypesStrings.`||`
import typings.atBabelTypes.atBabelTypesStrings.`~`
import typings.atBabelTypes.atBabelTypesStrings.const
import typings.atBabelTypes.atBabelTypesStrings.constructor
import typings.atBabelTypes.atBabelTypesStrings.delete
import typings.atBabelTypes.atBabelTypesStrings.get
import typings.atBabelTypes.atBabelTypesStrings.in
import typings.atBabelTypes.atBabelTypesStrings.init
import typings.atBabelTypes.atBabelTypesStrings.instanceof
import typings.atBabelTypes.atBabelTypesStrings.let
import typings.atBabelTypes.atBabelTypesStrings.method
import typings.atBabelTypes.atBabelTypesStrings.minus
import typings.atBabelTypes.atBabelTypesStrings.module
import typings.atBabelTypes.atBabelTypesStrings.plus
import typings.atBabelTypes.atBabelTypesStrings.public
import typings.atBabelTypes.atBabelTypesStrings.script
import typings.atBabelTypes.atBabelTypesStrings.set
import typings.atBabelTypes.atBabelTypesStrings.typeof
import typings.atBabelTypes.atBabelTypesStrings.value
import typings.atBabelTypes.atBabelTypesStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def anyTypeAnnotation(): AnyTypeAnnotation = js.native
  def argumentPlaceholder(): ArgumentPlaceholder = js.native
  def arrayExpression(): ArrayExpression = js.native
  def arrayExpression(elements: js.Array[Null | Expression | SpreadElement]): ArrayExpression = js.native
  def arrayPattern(elements: js.Array[PatternLike]): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: js.Array[Decorator]): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: js.Array[Decorator], typeAnnotation: Noop): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: js.Array[Decorator], typeAnnotation: TSTypeAnnotation): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: js.Array[Decorator], typeAnnotation: TypeAnnotation): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: Null, typeAnnotation: Noop): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: Null, typeAnnotation: TSTypeAnnotation): ArrayPattern = js.native
  def arrayPattern(elements: js.Array[PatternLike], decorators: Null, typeAnnotation: TypeAnnotation): ArrayPattern = js.native
  def arrayTypeAnnotation(elementType: FlowType): ArrayTypeAnnotation = js.native
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: Boolean
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: Boolean,
    expression: Boolean
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: Boolean,
    expression: Boolean,
    generator: Boolean
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: Boolean,
    expression: Boolean,
    generator: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: Boolean,
    expression: Boolean,
    generator: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): ArrowFunctionExpression = js.native
  def assignmentExpression(operator: String, left: LVal, right: Expression): AssignmentExpression = js.native
  def assignmentPattern(left: Identifier | ObjectPattern | ArrayPattern | MemberExpression, right: Expression): AssignmentPattern = js.native
  def assignmentPattern(
    left: Identifier | ObjectPattern | ArrayPattern | MemberExpression,
    right: Expression,
    decorators: js.Array[Decorator]
  ): AssignmentPattern = js.native
  def assignmentPattern(
    left: Identifier | ObjectPattern | ArrayPattern | MemberExpression,
    right: Expression,
    decorators: js.Array[Decorator],
    typeAnnotation: TypeAnnotation | TSTypeAnnotation | Noop
  ): AssignmentPattern = js.native
  def awaitExpression(argument: Expression): AwaitExpression = js.native
  def bigIntLiteral(value: String): BigIntLiteral = js.native
  def binaryExpression(
    operator: `+` | `-` | `/` | `%` | typings.atBabelTypes.atBabelTypesStrings.`*` | `**` | `&` | typings.atBabelTypes.atBabelTypesStrings.`|` | `>>` | `>>>` | `<<` | `_backtick^_backtick` | `==` | `===` | `!=` | `!==` | in | instanceof | `>` | `<` | `>=` | `<=`,
    left: Expression,
    right: Expression
  ): BinaryExpression = js.native
  def bindExpression(`object`: js.Any, callee: js.Any): BindExpression = js.native
  def blockStatement(body: js.Array[Statement]): BlockStatement = js.native
  def blockStatement(body: js.Array[Statement], directives: js.Array[Directive]): BlockStatement = js.native
  def booleanLiteral(value: Boolean): BooleanLiteral = js.native
  def booleanLiteralTypeAnnotation(value: Boolean): BooleanLiteralTypeAnnotation = js.native
  def booleanTypeAnnotation(): BooleanTypeAnnotation = js.native
  def breakStatement(): BreakStatement = js.native
  def breakStatement(label: Identifier): BreakStatement = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement]
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: Null,
    typeArguments: Null,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: Null,
    typeArguments: TypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: Null,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: `false`
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: `false`,
    typeArguments: Null,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: `false`,
    typeArguments: TypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: `false`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: `true`
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: `true`,
    typeArguments: Null,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: `true`,
    typeArguments: TypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: `true`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  def catchClause(param: js.UndefOr[scala.Nothing], body: BlockStatement): CatchClause = js.native
  def catchClause(param: Null, body: BlockStatement): CatchClause = js.native
  def catchClause(param: Identifier, body: BlockStatement): CatchClause = js.native
  def classBody(
    body: js.Array[
      ClassMethod | ClassPrivateMethod | ClassProperty | ClassPrivateProperty | TSDeclareMethod | TSIndexSignature
    ]
  ): ClassBody = js.native
  def classDeclaration(
    id: js.UndefOr[Identifier | Null],
    superClass: js.UndefOr[Expression | Null],
    body: ClassBody,
    decorators: js.UndefOr[js.Array[Decorator] | Null],
    `abstract`: js.UndefOr[Boolean | Null],
    declare: js.UndefOr[Boolean | Null],
    _implements: js.UndefOr[(js.Array[TSExpressionWithTypeArguments | ClassImplements]) | Null],
    mixins: js.UndefOr[js.Any | Null],
    superTypeParameters: js.UndefOr[TypeParameterInstantiation | TSTypeParameterInstantiation | Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | Null]
  ): ClassDeclaration = js.native
  def classExpression(id: js.UndefOr[Identifier | Null], superClass: js.UndefOr[Expression | Null], body: ClassBody): ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[Identifier | Null],
    superClass: js.UndefOr[Expression | Null],
    body: ClassBody,
    decorators: js.Array[Decorator]
  ): ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[Identifier | Null],
    superClass: js.UndefOr[Expression | Null],
    body: ClassBody,
    decorators: js.Array[Decorator],
    _implements: js.Array[TSExpressionWithTypeArguments | ClassImplements]
  ): ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[Identifier | Null],
    superClass: js.UndefOr[Expression | Null],
    body: ClassBody,
    decorators: js.Array[Decorator],
    _implements: js.Array[TSExpressionWithTypeArguments | ClassImplements],
    mixins: js.Any
  ): ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[Identifier | Null],
    superClass: js.UndefOr[Expression | Null],
    body: ClassBody,
    decorators: js.Array[Decorator],
    _implements: js.Array[TSExpressionWithTypeArguments | ClassImplements],
    mixins: js.Any,
    superTypeParameters: TypeParameterInstantiation | TSTypeParameterInstantiation
  ): ClassExpression = js.native
  def classExpression(
    id: js.UndefOr[Identifier | Null],
    superClass: js.UndefOr[Expression | Null],
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
    kind: js.UndefOr[get | set | method | constructor],
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    computed: js.UndefOr[Boolean],
    _static: js.UndefOr[Boolean | Null],
    `abstract`: js.UndefOr[Boolean | Null],
    access: js.UndefOr[public | `private` | `protected` | Null],
    accessibility: js.UndefOr[public | `private` | `protected` | Null],
    async: js.UndefOr[Boolean],
    decorators: js.UndefOr[js.Array[Decorator] | Null],
    generator: js.UndefOr[Boolean],
    optional: js.UndefOr[Boolean | Null],
    returnType: js.UndefOr[TypeAnnotation | TSTypeAnnotation | Noop | Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | Null]
  ): ClassMethod = js.native
  def classPrivateMethod(
    kind: js.UndefOr[get | set | method | constructor],
    key: PrivateName,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    _static: js.UndefOr[Boolean | Null],
    `abstract`: js.UndefOr[Boolean | Null],
    access: js.UndefOr[public | `private` | `protected` | Null],
    accessibility: js.UndefOr[public | `private` | `protected` | Null],
    async: js.UndefOr[Boolean],
    computed: js.UndefOr[Boolean],
    decorators: js.UndefOr[js.Array[Decorator] | Null],
    generator: js.UndefOr[Boolean],
    optional: js.UndefOr[Boolean | Null],
    returnType: js.UndefOr[js.Any | Null],
    typeParameters: js.UndefOr[js.Any | Null]
  ): ClassPrivateMethod = js.native
  def classPrivateProperty(key: PrivateName): ClassPrivateProperty = js.native
  def classPrivateProperty(key: PrivateName, value: Expression): ClassPrivateProperty = js.native
  def classProperty(
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    value: js.UndefOr[Expression | Null],
    typeAnnotation: js.UndefOr[TypeAnnotation | TSTypeAnnotation | Noop | Null],
    decorators: js.UndefOr[js.Array[Decorator] | Null],
    computed: js.UndefOr[Boolean],
    `abstract`: js.UndefOr[Boolean | Null],
    accessibility: js.UndefOr[public | `private` | `protected` | Null],
    definite: js.UndefOr[Boolean | Null],
    optional: js.UndefOr[Boolean | Null],
    readonly: js.UndefOr[Boolean | Null],
    _static: js.UndefOr[Boolean | Null]
  ): ClassProperty = js.native
  def clone[T /* <: Node */](n: T): T = js.native
  def cloneDeep[T /* <: Node */](n: T): T = js.native
  def conditionalExpression(test: Expression, consequent: Expression, alternate: Expression): ConditionalExpression = js.native
  def continueStatement(): ContinueStatement = js.native
  def continueStatement(label: Identifier): ContinueStatement = js.native
  def debuggerStatement(): DebuggerStatement = js.native
  def declareClass(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation
  ): DeclareClass = js.native
  def declareClass(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements]
  ): DeclareClass = js.native
  def declareClass(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements],
    mixins: js.Array[InterfaceExtends]
  ): DeclareClass = js.native
  def declareExportAllDeclaration(source: StringLiteral): DeclareExportAllDeclaration = js.native
  @JSName("declareExportAllDeclaration")
  def declareExportAllDeclaration_type(source: StringLiteral, exportKind: `type`): DeclareExportAllDeclaration = js.native
  @JSName("declareExportAllDeclaration")
  def declareExportAllDeclaration_value(source: StringLiteral, exportKind: value): DeclareExportAllDeclaration = js.native
  def declareExportDeclaration(): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Null, specifiers: js.Array[ExportNamespaceSpecifier | ExportSpecifier]): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: Null,
    _default: Boolean
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: Null,
    specifiers: js.Array[ExportNamespaceSpecifier | ExportSpecifier],
    source: StringLiteral
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    _default: Boolean
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Null, specifiers: Null, source: Null, _default: Boolean): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Null, specifiers: Null, source: StringLiteral): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Null, specifiers: Null, source: StringLiteral, _default: Boolean): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Flow): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Flow, specifiers: js.Array[ExportNamespaceSpecifier | ExportSpecifier]): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: Flow,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: Null,
    _default: Boolean
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: Flow,
    specifiers: js.Array[ExportNamespaceSpecifier | ExportSpecifier],
    source: StringLiteral
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(
    declaration: Flow,
    specifiers: js.Array[ExportSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    _default: Boolean
  ): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Flow, specifiers: Null, source: Null, _default: Boolean): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Flow, specifiers: Null, source: StringLiteral): DeclareExportDeclaration = js.native
  def declareExportDeclaration(declaration: Flow, specifiers: Null, source: StringLiteral, _default: Boolean): DeclareExportDeclaration = js.native
  def declareFunction(id: Identifier): DeclareFunction = js.native
  def declareFunction(id: Identifier, predicate: DeclaredPredicate): DeclareFunction = js.native
  def declareInterface(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation
  ): DeclareInterface = js.native
  def declareInterface(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements]
  ): DeclareInterface = js.native
  def declareInterface(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements],
    mixins: js.Array[InterfaceExtends]
  ): DeclareInterface = js.native
  def declareModule(id: Identifier, body: BlockStatement): DeclareModule = js.native
  def declareModule(id: StringLiteral, body: BlockStatement): DeclareModule = js.native
  def declareModuleExports(typeAnnotation: TypeAnnotation): DeclareModuleExports = js.native
  @JSName("declareModule")
  def declareModule_CommonJS(id: Identifier, body: BlockStatement, kind: CommonJS): DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_CommonJS(id: StringLiteral, body: BlockStatement, kind: CommonJS): DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_ES(id: Identifier, body: BlockStatement, kind: ES): DeclareModule = js.native
  @JSName("declareModule")
  def declareModule_ES(id: StringLiteral, body: BlockStatement, kind: ES): DeclareModule = js.native
  def declareOpaqueType(id: Identifier): DeclareOpaqueType = js.native
  def declareOpaqueType(id: Identifier, typeParameters: Null, supertype: FlowType): DeclareOpaqueType = js.native
  def declareOpaqueType(id: Identifier, typeParameters: TypeParameterDeclaration): DeclareOpaqueType = js.native
  def declareOpaqueType(id: Identifier, typeParameters: TypeParameterDeclaration, supertype: FlowType): DeclareOpaqueType = js.native
  def declareTypeAlias(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], right: FlowType): DeclareTypeAlias = js.native
  def declareTypeAlias(id: Identifier, typeParameters: Null, right: FlowType): DeclareTypeAlias = js.native
  def declareTypeAlias(id: Identifier, typeParameters: TypeParameterDeclaration, right: FlowType): DeclareTypeAlias = js.native
  def declareVariable(id: Identifier): DeclareVariable = js.native
  def declaredPredicate(value: Flow): DeclaredPredicate = js.native
  def decorator(expression: Expression): Decorator = js.native
  def directive(value: DirectiveLiteral): Directive = js.native
  def directiveLiteral(value: String): DirectiveLiteral = js.native
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
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportDefaultSpecifier | ExportNamespaceSpecifier | ExportSpecifier]
  ): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportDefaultSpecifier | ExportNamespaceSpecifier | ExportSpecifier],
    source: StringLiteral
  ): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: Null,
    specifiers: js.Array[ExportDefaultSpecifier | ExportNamespaceSpecifier | ExportSpecifier]
  ): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: Null,
    specifiers: js.Array[ExportDefaultSpecifier | ExportNamespaceSpecifier | ExportSpecifier],
    source: StringLiteral
  ): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: Declaration,
    specifiers: js.Array[ExportDefaultSpecifier | ExportNamespaceSpecifier | ExportSpecifier]
  ): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: Declaration,
    specifiers: js.Array[ExportDefaultSpecifier | ExportNamespaceSpecifier | ExportSpecifier],
    source: StringLiteral
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: Null,
    exportKind: `type`
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    exportKind: `type`
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: Null,
    exportKind: `type`
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    exportKind: `type`
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: Declaration,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: Null,
    exportKind: `type`
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_type(
    declaration: Declaration,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    exportKind: `type`
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: Null,
    exportKind: value
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    exportKind: value
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: Null,
    exportKind: value
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: Null,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    exportKind: value
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: Declaration,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: Null,
    exportKind: value
  ): ExportNamedDeclaration = js.native
  @JSName("exportNamedDeclaration")
  def exportNamedDeclaration_value(
    declaration: Declaration,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral,
    exportKind: value
  ): ExportNamedDeclaration = js.native
  def exportNamespaceSpecifier(exported: Identifier): ExportNamespaceSpecifier = js.native
  def exportSpecifier(local: Identifier, exported: Identifier): ExportSpecifier = js.native
  def expressionStatement(expression: Expression): ExpressionStatement = js.native
  def file(program: Program, comments: js.Any, tokens: js.Any): File = js.native
  def forInStatement(left: LVal, right: Expression, body: Statement): ForInStatement = js.native
  def forInStatement(left: VariableDeclaration, right: Expression, body: Statement): ForInStatement = js.native
  def forOfStatement(left: LVal, right: Expression, body: Statement): ForOfStatement = js.native
  def forOfStatement(left: LVal, right: Expression, body: Statement, _await: Boolean): ForOfStatement = js.native
  def forOfStatement(left: VariableDeclaration, right: Expression, body: Statement): ForOfStatement = js.native
  def forOfStatement(left: VariableDeclaration, right: Expression, body: Statement, _await: Boolean): ForOfStatement = js.native
  def forStatement(
    init: js.UndefOr[VariableDeclaration | Expression | Null],
    test: js.UndefOr[Expression | Null],
    update: js.UndefOr[Expression | Null],
    body: Statement
  ): ForStatement = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean,
    declare: Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean,
    declare: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean,
    declare: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): FunctionDeclaration = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: Boolean,
    async: Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): FunctionExpression = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[FunctionTypeParam],
    rest: Null,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[FunctionTypeParam],
    rest: FunctionTypeParam,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: Null,
    params: js.Array[FunctionTypeParam],
    rest: js.UndefOr[scala.Nothing],
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(typeParameters: Null, params: js.Array[FunctionTypeParam], rest: Null, returnType: FlowType): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: Null,
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
    rest: Null,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: TypeParameterDeclaration,
    params: js.Array[FunctionTypeParam],
    rest: FunctionTypeParam,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeParam(name: js.UndefOr[scala.Nothing], typeAnnotation: FlowType): FunctionTypeParam = js.native
  def functionTypeParam(name: js.UndefOr[scala.Nothing], typeAnnotation: FlowType, optional: Boolean): FunctionTypeParam = js.native
  def functionTypeParam(name: Null, typeAnnotation: FlowType): FunctionTypeParam = js.native
  def functionTypeParam(name: Null, typeAnnotation: FlowType, optional: Boolean): FunctionTypeParam = js.native
  def functionTypeParam(name: Identifier, typeAnnotation: FlowType): FunctionTypeParam = js.native
  def functionTypeParam(name: Identifier, typeAnnotation: FlowType, optional: Boolean): FunctionTypeParam = js.native
  def genericTypeAnnotation(id: Identifier): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: Identifier, typeParameters: TypeParameterInstantiation): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: QualifiedTypeIdentifier): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: QualifiedTypeIdentifier, typeParameters: TypeParameterInstantiation): GenericTypeAnnotation = js.native
  def identifier(name: String): Identifier = js.native
  def identifier(name: String, decorators: js.Array[Decorator]): Identifier = js.native
  def identifier(name: String, decorators: js.Array[Decorator], optional: Boolean): Identifier = js.native
  def identifier(name: String, decorators: js.Array[Decorator], optional: Boolean, typeAnnotation: Noop): Identifier = js.native
  def identifier(name: String, decorators: js.Array[Decorator], optional: Boolean, typeAnnotation: TSTypeAnnotation): Identifier = js.native
  def identifier(name: String, decorators: js.Array[Decorator], optional: Boolean, typeAnnotation: TypeAnnotation): Identifier = js.native
  def identifier(name: String, decorators: js.Array[Decorator], optional: Null, typeAnnotation: Noop): Identifier = js.native
  def identifier(name: String, decorators: js.Array[Decorator], optional: Null, typeAnnotation: TSTypeAnnotation): Identifier = js.native
  def identifier(name: String, decorators: js.Array[Decorator], optional: Null, typeAnnotation: TypeAnnotation): Identifier = js.native
  def identifier(name: String, decorators: Null, optional: Boolean): Identifier = js.native
  def identifier(name: String, decorators: Null, optional: Boolean, typeAnnotation: Noop): Identifier = js.native
  def identifier(name: String, decorators: Null, optional: Boolean, typeAnnotation: TSTypeAnnotation): Identifier = js.native
  def identifier(name: String, decorators: Null, optional: Boolean, typeAnnotation: TypeAnnotation): Identifier = js.native
  def identifier(name: String, decorators: Null, optional: Null, typeAnnotation: Noop): Identifier = js.native
  def identifier(name: String, decorators: Null, optional: Null, typeAnnotation: TSTypeAnnotation): Identifier = js.native
  def identifier(name: String, decorators: Null, optional: Null, typeAnnotation: TypeAnnotation): Identifier = js.native
  def ifStatement(test: Expression, consequent: Statement): IfStatement = js.native
  def ifStatement(test: Expression, consequent: Statement, alternate: Statement): IfStatement = js.native
  def importDeclaration(
    specifiers: js.Array[ImportDefaultSpecifier | ImportNamespaceSpecifier | ImportSpecifier],
    source: StringLiteral
  ): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_type(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral,
    importKind: `type`
  ): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_typeof(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral,
    importKind: typeof
  ): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_value(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral,
    importKind: value
  ): ImportDeclaration = js.native
  def importDefaultSpecifier(local: Identifier): ImportDefaultSpecifier = js.native
  def importNamespaceSpecifier(local: Identifier): ImportNamespaceSpecifier = js.native
  def importSpecifier(local: Identifier, imported: Identifier): ImportSpecifier = js.native
  @JSName("importSpecifier")
  def importSpecifier_type(local: Identifier, imported: Identifier, importKind: `type`): ImportSpecifier = js.native
  @JSName("importSpecifier")
  def importSpecifier_typeof(local: Identifier, imported: Identifier, importKind: typeof): ImportSpecifier = js.native
  def inferredPredicate(): InferredPredicate = js.native
  def interfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation
  ): InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements]
  ): InterfaceDeclaration = js.native
  def interfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements],
    mixins: js.Array[InterfaceExtends]
  ): InterfaceDeclaration = js.native
  def interfaceExtends(id: Identifier): InterfaceExtends = js.native
  def interfaceExtends(id: Identifier, typeParameters: TypeParameterInstantiation): InterfaceExtends = js.native
  def interfaceExtends(id: QualifiedTypeIdentifier): InterfaceExtends = js.native
  def interfaceExtends(id: QualifiedTypeIdentifier, typeParameters: TypeParameterInstantiation): InterfaceExtends = js.native
  def interfaceTypeAnnotation(_extends: js.UndefOr[scala.Nothing], body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(_extends: js.Array[InterfaceExtends], body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(_extends: Null, body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
  def interpreterDirective(value: String): InterpreterDirective = js.native
  def intersectionTypeAnnotation(types: js.Array[FlowType]): IntersectionTypeAnnotation = js.native
  def isAnyTypeAnnotation(): /* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean = js.native
  def isAnyTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean = js.native
  def isAnyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean = js.native
  def isAnyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean = js.native
  def isAnyTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ Boolean = js.native
  def isArgumentPlaceholder(): /* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean = js.native
  def isArgumentPlaceholder(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean = js.native
  def isArgumentPlaceholder(node: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean = js.native
  def isArgumentPlaceholder(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean = js.native
  def isArgumentPlaceholder(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ Boolean = js.native
  def isArrayExpression(): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = js.native
  def isArrayExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = js.native
  def isArrayExpression(node: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = js.native
  def isArrayExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = js.native
  def isArrayExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ Boolean = js.native
  def isArrayPattern(): /* is @babel/types.@babel/types.ArrayPattern */ Boolean = js.native
  def isArrayPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ Boolean = js.native
  def isArrayPattern(node: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ Boolean = js.native
  def isArrayPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ Boolean = js.native
  def isArrayPattern(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ Boolean = js.native
  def isArrayTypeAnnotation(): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean = js.native
  def isArrayTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean = js.native
  def isArrayTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ Boolean = js.native
  def isArrowFunctionExpression(): /* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean = js.native
  def isArrowFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean = js.native
  def isArrowFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean = js.native
  def isArrowFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean = js.native
  def isArrowFunctionExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ Boolean = js.native
  def isAssignmentExpression(): /* is @babel/types.@babel/types.AssignmentExpression */ Boolean = js.native
  def isAssignmentExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ Boolean = js.native
  def isAssignmentExpression(node: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ Boolean = js.native
  def isAssignmentExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ Boolean = js.native
  def isAssignmentExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ Boolean = js.native
  def isAssignmentPattern(): /* is @babel/types.@babel/types.AssignmentPattern */ Boolean = js.native
  def isAssignmentPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ Boolean = js.native
  def isAssignmentPattern(node: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ Boolean = js.native
  def isAssignmentPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ Boolean = js.native
  def isAssignmentPattern(node: Null, opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ Boolean = js.native
  def isAwaitExpression(): /* is @babel/types.@babel/types.AwaitExpression */ Boolean = js.native
  def isAwaitExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ Boolean = js.native
  def isAwaitExpression(node: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ Boolean = js.native
  def isAwaitExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ Boolean = js.native
  def isAwaitExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ Boolean = js.native
  def isBigIntLiteral(): /* is @babel/types.@babel/types.BigIntLiteral */ Boolean = js.native
  def isBigIntLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ Boolean = js.native
  def isBigIntLiteral(node: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ Boolean = js.native
  def isBigIntLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ Boolean = js.native
  def isBigIntLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ Boolean = js.native
  def isBinary(): /* is @babel/types.@babel/types.Binary */ Boolean = js.native
  def isBinary(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Binary */ Boolean = js.native
  def isBinary(node: js.Object): /* is @babel/types.@babel/types.Binary */ Boolean = js.native
  def isBinary(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Binary */ Boolean = js.native
  def isBinary(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Binary */ Boolean = js.native
  def isBinaryExpression(): /* is @babel/types.@babel/types.BinaryExpression */ Boolean = js.native
  def isBinaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ Boolean = js.native
  def isBinaryExpression(node: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ Boolean = js.native
  def isBinaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ Boolean = js.native
  def isBinaryExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ Boolean = js.native
  def isBindExpression(): /* is @babel/types.@babel/types.BindExpression */ Boolean = js.native
  def isBindExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ Boolean = js.native
  def isBindExpression(node: js.Object): /* is @babel/types.@babel/types.BindExpression */ Boolean = js.native
  def isBindExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ Boolean = js.native
  def isBindExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ Boolean = js.native
  def isBlock(): /* is @babel/types.@babel/types.Block */ Boolean = js.native
  def isBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Block */ Boolean = js.native
  def isBlock(node: js.Object): /* is @babel/types.@babel/types.Block */ Boolean = js.native
  def isBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Block */ Boolean = js.native
  def isBlock(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Block */ Boolean = js.native
  def isBlockParent(): /* is @babel/types.@babel/types.BlockParent */ Boolean = js.native
  def isBlockParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ Boolean = js.native
  def isBlockParent(node: js.Object): /* is @babel/types.@babel/types.BlockParent */ Boolean = js.native
  def isBlockParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ Boolean = js.native
  def isBlockParent(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ Boolean = js.native
  def isBlockStatement(): /* is @babel/types.@babel/types.BlockStatement */ Boolean = js.native
  def isBlockStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ Boolean = js.native
  def isBlockStatement(node: js.Object): /* is @babel/types.@babel/types.BlockStatement */ Boolean = js.native
  def isBlockStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ Boolean = js.native
  def isBlockStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ Boolean = js.native
  def isBooleanLiteral(): /* is @babel/types.@babel/types.BooleanLiteral */ Boolean = js.native
  def isBooleanLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ Boolean = js.native
  def isBooleanLiteral(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ Boolean = js.native
  def isBooleanLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ Boolean = js.native
  def isBooleanLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ Boolean = js.native
  def isBooleanLiteralTypeAnnotation(): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ Boolean = js.native
  def isBooleanTypeAnnotation(): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean = js.native
  def isBooleanTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean = js.native
  def isBooleanTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ Boolean = js.native
  def isBreakStatement(): /* is @babel/types.@babel/types.BreakStatement */ Boolean = js.native
  def isBreakStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ Boolean = js.native
  def isBreakStatement(node: js.Object): /* is @babel/types.@babel/types.BreakStatement */ Boolean = js.native
  def isBreakStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ Boolean = js.native
  def isBreakStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ Boolean = js.native
  def isCallExpression(): /* is @babel/types.@babel/types.CallExpression */ Boolean = js.native
  def isCallExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = js.native
  def isCallExpression(node: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = js.native
  def isCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = js.native
  def isCallExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ Boolean = js.native
  def isCatchClause(): /* is @babel/types.@babel/types.CatchClause */ Boolean = js.native
  def isCatchClause(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ Boolean = js.native
  def isCatchClause(node: js.Object): /* is @babel/types.@babel/types.CatchClause */ Boolean = js.native
  def isCatchClause(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ Boolean = js.native
  def isCatchClause(node: Null, opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ Boolean = js.native
  def isClass(): /* is @babel/types.@babel/types.Class */ Boolean = js.native
  def isClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Class */ Boolean = js.native
  def isClass(node: js.Object): /* is @babel/types.@babel/types.Class */ Boolean = js.native
  def isClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Class */ Boolean = js.native
  def isClass(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Class */ Boolean = js.native
  def isClassBody(): /* is @babel/types.@babel/types.ClassBody */ Boolean = js.native
  def isClassBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ Boolean = js.native
  def isClassBody(node: js.Object): /* is @babel/types.@babel/types.ClassBody */ Boolean = js.native
  def isClassBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ Boolean = js.native
  def isClassBody(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ Boolean = js.native
  def isClassDeclaration(): /* is @babel/types.@babel/types.ClassDeclaration */ Boolean = js.native
  def isClassDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ Boolean = js.native
  def isClassDeclaration(node: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ Boolean = js.native
  def isClassDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ Boolean = js.native
  def isClassDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ Boolean = js.native
  def isClassExpression(): /* is @babel/types.@babel/types.ClassExpression */ Boolean = js.native
  def isClassExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ Boolean = js.native
  def isClassExpression(node: js.Object): /* is @babel/types.@babel/types.ClassExpression */ Boolean = js.native
  def isClassExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ Boolean = js.native
  def isClassExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ Boolean = js.native
  def isClassImplements(): /* is @babel/types.@babel/types.ClassImplements */ Boolean = js.native
  def isClassImplements(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ Boolean = js.native
  def isClassImplements(node: js.Object): /* is @babel/types.@babel/types.ClassImplements */ Boolean = js.native
  def isClassImplements(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ Boolean = js.native
  def isClassImplements(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ Boolean = js.native
  def isClassMethod(): /* is @babel/types.@babel/types.ClassMethod */ Boolean = js.native
  def isClassMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ Boolean = js.native
  def isClassMethod(node: js.Object): /* is @babel/types.@babel/types.ClassMethod */ Boolean = js.native
  def isClassMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ Boolean = js.native
  def isClassMethod(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ Boolean = js.native
  def isClassPrivateMethod(): /* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean = js.native
  def isClassPrivateMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean = js.native
  def isClassPrivateMethod(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean = js.native
  def isClassPrivateMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean = js.native
  def isClassPrivateMethod(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ Boolean = js.native
  def isClassPrivateProperty(): /* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean = js.native
  def isClassPrivateProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean = js.native
  def isClassPrivateProperty(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean = js.native
  def isClassPrivateProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean = js.native
  def isClassPrivateProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ Boolean = js.native
  def isClassProperty(): /* is @babel/types.@babel/types.ClassProperty */ Boolean = js.native
  def isClassProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ Boolean = js.native
  def isClassProperty(node: js.Object): /* is @babel/types.@babel/types.ClassProperty */ Boolean = js.native
  def isClassProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ Boolean = js.native
  def isClassProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ Boolean = js.native
  def isCompletionStatement(): /* is @babel/types.@babel/types.CompletionStatement */ Boolean = js.native
  def isCompletionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ Boolean = js.native
  def isCompletionStatement(node: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ Boolean = js.native
  def isCompletionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ Boolean = js.native
  def isCompletionStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ Boolean = js.native
  def isConditional(): /* is @babel/types.@babel/types.Conditional */ Boolean = js.native
  def isConditional(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Conditional */ Boolean = js.native
  def isConditional(node: js.Object): /* is @babel/types.@babel/types.Conditional */ Boolean = js.native
  def isConditional(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Conditional */ Boolean = js.native
  def isConditional(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Conditional */ Boolean = js.native
  def isConditionalExpression(): /* is @babel/types.@babel/types.ConditionalExpression */ Boolean = js.native
  def isConditionalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ Boolean = js.native
  def isConditionalExpression(node: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ Boolean = js.native
  def isConditionalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ Boolean = js.native
  def isConditionalExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ Boolean = js.native
  def isContinueStatement(): /* is @babel/types.@babel/types.ContinueStatement */ Boolean = js.native
  def isContinueStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ Boolean = js.native
  def isContinueStatement(node: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ Boolean = js.native
  def isContinueStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ Boolean = js.native
  def isContinueStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ Boolean = js.native
  def isDebuggerStatement(): /* is @babel/types.@babel/types.DebuggerStatement */ Boolean = js.native
  def isDebuggerStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ Boolean = js.native
  def isDebuggerStatement(node: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ Boolean = js.native
  def isDebuggerStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ Boolean = js.native
  def isDebuggerStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ Boolean = js.native
  def isDeclaration(): /* is @babel/types.@babel/types.Declaration */ Boolean = js.native
  def isDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Declaration */ Boolean = js.native
  def isDeclaration(node: js.Object): /* is @babel/types.@babel/types.Declaration */ Boolean = js.native
  def isDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Declaration */ Boolean = js.native
  def isDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Declaration */ Boolean = js.native
  def isDeclareClass(): /* is @babel/types.@babel/types.DeclareClass */ Boolean = js.native
  def isDeclareClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ Boolean = js.native
  def isDeclareClass(node: js.Object): /* is @babel/types.@babel/types.DeclareClass */ Boolean = js.native
  def isDeclareClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ Boolean = js.native
  def isDeclareClass(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ Boolean = js.native
  def isDeclareExportAllDeclaration(): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean = js.native
  def isDeclareExportAllDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ Boolean = js.native
  def isDeclareExportDeclaration(): /* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean = js.native
  def isDeclareExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean = js.native
  def isDeclareExportDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ Boolean = js.native
  def isDeclareFunction(): /* is @babel/types.@babel/types.DeclareFunction */ Boolean = js.native
  def isDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ Boolean = js.native
  def isDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ Boolean = js.native
  def isDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ Boolean = js.native
  def isDeclareFunction(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ Boolean = js.native
  def isDeclareInterface(): /* is @babel/types.@babel/types.DeclareInterface */ Boolean = js.native
  def isDeclareInterface(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ Boolean = js.native
  def isDeclareInterface(node: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ Boolean = js.native
  def isDeclareInterface(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ Boolean = js.native
  def isDeclareInterface(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ Boolean = js.native
  def isDeclareModule(): /* is @babel/types.@babel/types.DeclareModule */ Boolean = js.native
  def isDeclareModule(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ Boolean = js.native
  def isDeclareModule(node: js.Object): /* is @babel/types.@babel/types.DeclareModule */ Boolean = js.native
  def isDeclareModule(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ Boolean = js.native
  def isDeclareModule(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ Boolean = js.native
  def isDeclareModuleExports(): /* is @babel/types.@babel/types.DeclareModuleExports */ Boolean = js.native
  def isDeclareModuleExports(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ Boolean = js.native
  def isDeclareModuleExports(node: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ Boolean = js.native
  def isDeclareModuleExports(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ Boolean = js.native
  def isDeclareModuleExports(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ Boolean = js.native
  def isDeclareOpaqueType(): /* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean = js.native
  def isDeclareOpaqueType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean = js.native
  def isDeclareOpaqueType(node: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean = js.native
  def isDeclareOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean = js.native
  def isDeclareOpaqueType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ Boolean = js.native
  def isDeclareTypeAlias(): /* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean = js.native
  def isDeclareTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean = js.native
  def isDeclareTypeAlias(node: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean = js.native
  def isDeclareTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean = js.native
  def isDeclareTypeAlias(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ Boolean = js.native
  def isDeclareVariable(): /* is @babel/types.@babel/types.DeclareVariable */ Boolean = js.native
  def isDeclareVariable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ Boolean = js.native
  def isDeclareVariable(node: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ Boolean = js.native
  def isDeclareVariable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ Boolean = js.native
  def isDeclareVariable(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ Boolean = js.native
  def isDeclaredPredicate(): /* is @babel/types.@babel/types.DeclaredPredicate */ Boolean = js.native
  def isDeclaredPredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ Boolean = js.native
  def isDeclaredPredicate(node: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ Boolean = js.native
  def isDeclaredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ Boolean = js.native
  def isDeclaredPredicate(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ Boolean = js.native
  def isDecorator(): /* is @babel/types.@babel/types.Decorator */ Boolean = js.native
  def isDecorator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Decorator */ Boolean = js.native
  def isDecorator(node: js.Object): /* is @babel/types.@babel/types.Decorator */ Boolean = js.native
  def isDecorator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Decorator */ Boolean = js.native
  def isDecorator(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Decorator */ Boolean = js.native
  def isDirective(): /* is @babel/types.@babel/types.Directive */ Boolean = js.native
  def isDirective(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Directive */ Boolean = js.native
  def isDirective(node: js.Object): /* is @babel/types.@babel/types.Directive */ Boolean = js.native
  def isDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Directive */ Boolean = js.native
  def isDirective(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Directive */ Boolean = js.native
  def isDirectiveLiteral(): /* is @babel/types.@babel/types.DirectiveLiteral */ Boolean = js.native
  def isDirectiveLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ Boolean = js.native
  def isDirectiveLiteral(node: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ Boolean = js.native
  def isDirectiveLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ Boolean = js.native
  def isDirectiveLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ Boolean = js.native
  def isDoExpression(): /* is @babel/types.@babel/types.DoExpression */ Boolean = js.native
  def isDoExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ Boolean = js.native
  def isDoExpression(node: js.Object): /* is @babel/types.@babel/types.DoExpression */ Boolean = js.native
  def isDoExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ Boolean = js.native
  def isDoExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ Boolean = js.native
  def isDoWhileStatement(): /* is @babel/types.@babel/types.DoWhileStatement */ Boolean = js.native
  def isDoWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ Boolean = js.native
  def isDoWhileStatement(node: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ Boolean = js.native
  def isDoWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ Boolean = js.native
  def isDoWhileStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ Boolean = js.native
  def isEmptyStatement(): /* is @babel/types.@babel/types.EmptyStatement */ Boolean = js.native
  def isEmptyStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ Boolean = js.native
  def isEmptyStatement(node: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ Boolean = js.native
  def isEmptyStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ Boolean = js.native
  def isEmptyStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ Boolean = js.native
  def isEmptyTypeAnnotation(): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean = js.native
  def isEmptyTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean = js.native
  def isEmptyTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ Boolean = js.native
  def isExistsTypeAnnotation(): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean = js.native
  def isExistsTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean = js.native
  def isExistsTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ Boolean = js.native
  def isExportAllDeclaration(): /* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean = js.native
  def isExportAllDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean = js.native
  def isExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean = js.native
  def isExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean = js.native
  def isExportAllDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ Boolean = js.native
  def isExportDeclaration(): /* is @babel/types.@babel/types.ExportDeclaration */ Boolean = js.native
  def isExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ Boolean = js.native
  def isExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ Boolean = js.native
  def isExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ Boolean = js.native
  def isExportDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ Boolean = js.native
  def isExportDefaultDeclaration(): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean = js.native
  def isExportDefaultDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean = js.native
  def isExportDefaultDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ Boolean = js.native
  def isExportDefaultSpecifier(): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean = js.native
  def isExportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean = js.native
  def isExportDefaultSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ Boolean = js.native
  def isExportNamedDeclaration(): /* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean = js.native
  def isExportNamedDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean = js.native
  def isExportNamedDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean = js.native
  def isExportNamedDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean = js.native
  def isExportNamedDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ Boolean = js.native
  def isExportNamespaceSpecifier(): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean = js.native
  def isExportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean = js.native
  def isExportNamespaceSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ Boolean = js.native
  def isExportSpecifier(): /* is @babel/types.@babel/types.ExportSpecifier */ Boolean = js.native
  def isExportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ Boolean = js.native
  def isExportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ Boolean = js.native
  def isExportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ Boolean = js.native
  def isExportSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ Boolean = js.native
  def isExpression(): /* is @babel/types.@babel/types.Expression */ Boolean = js.native
  def isExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Expression */ Boolean = js.native
  def isExpression(node: js.Object): /* is @babel/types.@babel/types.Expression */ Boolean = js.native
  def isExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Expression */ Boolean = js.native
  def isExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Expression */ Boolean = js.native
  def isExpressionStatement(): /* is @babel/types.@babel/types.ExpressionStatement */ Boolean = js.native
  def isExpressionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ Boolean = js.native
  def isExpressionStatement(node: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ Boolean = js.native
  def isExpressionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ Boolean = js.native
  def isExpressionStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ Boolean = js.native
  def isExpressionWrapper(): /* is @babel/types.@babel/types.ExpressionWrapper */ Boolean = js.native
  def isExpressionWrapper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ Boolean = js.native
  def isExpressionWrapper(node: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ Boolean = js.native
  def isExpressionWrapper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ Boolean = js.native
  def isExpressionWrapper(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ Boolean = js.native
  def isFile(): /* is @babel/types.@babel/types.File */ Boolean = js.native
  def isFile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.File */ Boolean = js.native
  def isFile(node: js.Object): /* is @babel/types.@babel/types.File */ Boolean = js.native
  def isFile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.File */ Boolean = js.native
  def isFile(node: Null, opts: js.Object): /* is @babel/types.@babel/types.File */ Boolean = js.native
  def isFlow(): /* is @babel/types.@babel/types.Flow */ Boolean = js.native
  def isFlow(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Flow */ Boolean = js.native
  def isFlow(node: js.Object): /* is @babel/types.@babel/types.Flow */ Boolean = js.native
  def isFlow(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Flow */ Boolean = js.native
  def isFlow(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Flow */ Boolean = js.native
  def isFlowBaseAnnotation(): /* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean = js.native
  def isFlowBaseAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean = js.native
  def isFlowBaseAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ Boolean = js.native
  def isFlowDeclaration(): /* is @babel/types.@babel/types.FlowDeclaration */ Boolean = js.native
  def isFlowDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ Boolean = js.native
  def isFlowDeclaration(node: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ Boolean = js.native
  def isFlowDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ Boolean = js.native
  def isFlowDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ Boolean = js.native
  def isFlowPredicate(): /* is @babel/types.@babel/types.FlowPredicate */ Boolean = js.native
  def isFlowPredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ Boolean = js.native
  def isFlowPredicate(node: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ Boolean = js.native
  def isFlowPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ Boolean = js.native
  def isFlowPredicate(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ Boolean = js.native
  def isFlowType(): /* is @babel/types.@babel/types.FlowType */ Boolean = js.native
  def isFlowType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowType */ Boolean = js.native
  def isFlowType(node: js.Object): /* is @babel/types.@babel/types.FlowType */ Boolean = js.native
  def isFlowType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowType */ Boolean = js.native
  def isFlowType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FlowType */ Boolean = js.native
  def isFor(): /* is @babel/types.@babel/types.For */ Boolean = js.native
  def isFor(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.For */ Boolean = js.native
  def isFor(node: js.Object): /* is @babel/types.@babel/types.For */ Boolean = js.native
  def isFor(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.For */ Boolean = js.native
  def isFor(node: Null, opts: js.Object): /* is @babel/types.@babel/types.For */ Boolean = js.native
  def isForInStatement(): /* is @babel/types.@babel/types.ForInStatement */ Boolean = js.native
  def isForInStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ Boolean = js.native
  def isForInStatement(node: js.Object): /* is @babel/types.@babel/types.ForInStatement */ Boolean = js.native
  def isForInStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ Boolean = js.native
  def isForInStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ Boolean = js.native
  def isForOfStatement(): /* is @babel/types.@babel/types.ForOfStatement */ Boolean = js.native
  def isForOfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ Boolean = js.native
  def isForOfStatement(node: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ Boolean = js.native
  def isForOfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ Boolean = js.native
  def isForOfStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ Boolean = js.native
  def isForStatement(): /* is @babel/types.@babel/types.ForStatement */ Boolean = js.native
  def isForStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ Boolean = js.native
  def isForStatement(node: js.Object): /* is @babel/types.@babel/types.ForStatement */ Boolean = js.native
  def isForStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ Boolean = js.native
  def isForStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ Boolean = js.native
  def isForXStatement(): /* is @babel/types.@babel/types.ForXStatement */ Boolean = js.native
  def isForXStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ Boolean = js.native
  def isForXStatement(node: js.Object): /* is @babel/types.@babel/types.ForXStatement */ Boolean = js.native
  def isForXStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ Boolean = js.native
  def isForXStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ Boolean = js.native
  def isFunction(): /* is @babel/types.@babel/types.Function */ Boolean = js.native
  def isFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Function */ Boolean = js.native
  def isFunction(node: js.Object): /* is @babel/types.@babel/types.Function */ Boolean = js.native
  def isFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Function */ Boolean = js.native
  def isFunction(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Function */ Boolean = js.native
  def isFunctionDeclaration(): /* is @babel/types.@babel/types.FunctionDeclaration */ Boolean = js.native
  def isFunctionDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ Boolean = js.native
  def isFunctionDeclaration(node: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ Boolean = js.native
  def isFunctionDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ Boolean = js.native
  def isFunctionDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ Boolean = js.native
  def isFunctionExpression(): /* is @babel/types.@babel/types.FunctionExpression */ Boolean = js.native
  def isFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ Boolean = js.native
  def isFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ Boolean = js.native
  def isFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ Boolean = js.native
  def isFunctionExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ Boolean = js.native
  def isFunctionParent(): /* is @babel/types.@babel/types.FunctionParent */ Boolean = js.native
  def isFunctionParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ Boolean = js.native
  def isFunctionParent(node: js.Object): /* is @babel/types.@babel/types.FunctionParent */ Boolean = js.native
  def isFunctionParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ Boolean = js.native
  def isFunctionParent(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ Boolean = js.native
  def isFunctionTypeAnnotation(): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean = js.native
  def isFunctionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean = js.native
  def isFunctionTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ Boolean = js.native
  def isFunctionTypeParam(): /* is @babel/types.@babel/types.FunctionTypeParam */ Boolean = js.native
  def isFunctionTypeParam(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ Boolean = js.native
  def isFunctionTypeParam(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ Boolean = js.native
  def isFunctionTypeParam(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ Boolean = js.native
  def isFunctionTypeParam(node: Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ Boolean = js.native
  def isGenericTypeAnnotation(): /* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean = js.native
  def isGenericTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean = js.native
  def isGenericTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ Boolean = js.native
  def isIdentifier(): /* is @babel/types.@babel/types.Identifier */ Boolean = js.native
  def isIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Identifier */ Boolean = js.native
  def isIdentifier(node: js.Object): /* is @babel/types.@babel/types.Identifier */ Boolean = js.native
  def isIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Identifier */ Boolean = js.native
  def isIdentifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Identifier */ Boolean = js.native
  def isIfStatement(): /* is @babel/types.@babel/types.IfStatement */ Boolean = js.native
  def isIfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ Boolean = js.native
  def isIfStatement(node: js.Object): /* is @babel/types.@babel/types.IfStatement */ Boolean = js.native
  def isIfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ Boolean = js.native
  def isIfStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ Boolean = js.native
  def isImmutable(): /* is @babel/types.@babel/types.Immutable */ Boolean = js.native
  def isImmutable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Immutable */ Boolean = js.native
  def isImmutable(node: js.Object): /* is @babel/types.@babel/types.Immutable */ Boolean = js.native
  def isImmutable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Immutable */ Boolean = js.native
  def isImmutable(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Immutable */ Boolean = js.native
  def isImport(): /* is @babel/types.@babel/types.Import */ Boolean = js.native
  def isImport(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Import */ Boolean = js.native
  def isImport(node: js.Object): /* is @babel/types.@babel/types.Import */ Boolean = js.native
  def isImport(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Import */ Boolean = js.native
  def isImport(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Import */ Boolean = js.native
  def isImportDeclaration(): /* is @babel/types.@babel/types.ImportDeclaration */ Boolean = js.native
  def isImportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ Boolean = js.native
  def isImportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ Boolean = js.native
  def isImportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ Boolean = js.native
  def isImportDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ Boolean = js.native
  def isImportDefaultSpecifier(): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean = js.native
  def isImportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean = js.native
  def isImportDefaultSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ Boolean = js.native
  def isImportNamespaceSpecifier(): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean = js.native
  def isImportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean = js.native
  def isImportNamespaceSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ Boolean = js.native
  def isImportSpecifier(): /* is @babel/types.@babel/types.ImportSpecifier */ Boolean = js.native
  def isImportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ Boolean = js.native
  def isImportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ Boolean = js.native
  def isImportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ Boolean = js.native
  def isImportSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ Boolean = js.native
  def isInferredPredicate(): /* is @babel/types.@babel/types.InferredPredicate */ Boolean = js.native
  def isInferredPredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ Boolean = js.native
  def isInferredPredicate(node: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ Boolean = js.native
  def isInferredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ Boolean = js.native
  def isInferredPredicate(node: Null, opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ Boolean = js.native
  def isInterfaceDeclaration(): /* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean = js.native
  def isInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean = js.native
  def isInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean = js.native
  def isInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean = js.native
  def isInterfaceDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ Boolean = js.native
  def isInterfaceExtends(): /* is @babel/types.@babel/types.InterfaceExtends */ Boolean = js.native
  def isInterfaceExtends(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ Boolean = js.native
  def isInterfaceExtends(node: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ Boolean = js.native
  def isInterfaceExtends(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ Boolean = js.native
  def isInterfaceExtends(node: Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ Boolean = js.native
  def isInterfaceTypeAnnotation(): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean = js.native
  def isInterfaceTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ Boolean = js.native
  def isInterpreterDirective(): /* is @babel/types.@babel/types.InterpreterDirective */ Boolean = js.native
  def isInterpreterDirective(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ Boolean = js.native
  def isInterpreterDirective(node: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ Boolean = js.native
  def isInterpreterDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ Boolean = js.native
  def isInterpreterDirective(node: Null, opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ Boolean = js.native
  def isIntersectionTypeAnnotation(): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean = js.native
  def isIntersectionTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ Boolean = js.native
  def isJSX(): /* is @babel/types.@babel/types.JSX */ Boolean = js.native
  def isJSX(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSX */ Boolean = js.native
  def isJSX(node: js.Object): /* is @babel/types.@babel/types.JSX */ Boolean = js.native
  def isJSX(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSX */ Boolean = js.native
  def isJSX(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSX */ Boolean = js.native
  def isJSXAttribute(): /* is @babel/types.@babel/types.JSXAttribute */ Boolean = js.native
  def isJSXAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ Boolean = js.native
  def isJSXAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ Boolean = js.native
  def isJSXAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ Boolean = js.native
  def isJSXAttribute(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ Boolean = js.native
  def isJSXClosingElement(): /* is @babel/types.@babel/types.JSXClosingElement */ Boolean = js.native
  def isJSXClosingElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ Boolean = js.native
  def isJSXClosingElement(node: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ Boolean = js.native
  def isJSXClosingElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ Boolean = js.native
  def isJSXClosingElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ Boolean = js.native
  def isJSXClosingFragment(): /* is @babel/types.@babel/types.JSXClosingFragment */ Boolean = js.native
  def isJSXClosingFragment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ Boolean = js.native
  def isJSXClosingFragment(node: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ Boolean = js.native
  def isJSXClosingFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ Boolean = js.native
  def isJSXClosingFragment(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ Boolean = js.native
  def isJSXElement(): /* is @babel/types.@babel/types.JSXElement */ Boolean = js.native
  def isJSXElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ Boolean = js.native
  def isJSXElement(node: js.Object): /* is @babel/types.@babel/types.JSXElement */ Boolean = js.native
  def isJSXElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ Boolean = js.native
  def isJSXElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ Boolean = js.native
  def isJSXEmptyExpression(): /* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean = js.native
  def isJSXEmptyExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean = js.native
  def isJSXEmptyExpression(node: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean = js.native
  def isJSXEmptyExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean = js.native
  def isJSXEmptyExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ Boolean = js.native
  def isJSXExpressionContainer(): /* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean = js.native
  def isJSXExpressionContainer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean = js.native
  def isJSXExpressionContainer(node: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean = js.native
  def isJSXExpressionContainer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean = js.native
  def isJSXExpressionContainer(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ Boolean = js.native
  def isJSXFragment(): /* is @babel/types.@babel/types.JSXFragment */ Boolean = js.native
  def isJSXFragment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ Boolean = js.native
  def isJSXFragment(node: js.Object): /* is @babel/types.@babel/types.JSXFragment */ Boolean = js.native
  def isJSXFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ Boolean = js.native
  def isJSXFragment(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ Boolean = js.native
  def isJSXIdentifier(): /* is @babel/types.@babel/types.JSXIdentifier */ Boolean = js.native
  def isJSXIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ Boolean = js.native
  def isJSXIdentifier(node: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ Boolean = js.native
  def isJSXIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ Boolean = js.native
  def isJSXIdentifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ Boolean = js.native
  def isJSXMemberExpression(): /* is @babel/types.@babel/types.JSXMemberExpression */ Boolean = js.native
  def isJSXMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ Boolean = js.native
  def isJSXMemberExpression(node: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ Boolean = js.native
  def isJSXMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ Boolean = js.native
  def isJSXMemberExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ Boolean = js.native
  def isJSXNamespacedName(): /* is @babel/types.@babel/types.JSXNamespacedName */ Boolean = js.native
  def isJSXNamespacedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ Boolean = js.native
  def isJSXNamespacedName(node: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ Boolean = js.native
  def isJSXNamespacedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ Boolean = js.native
  def isJSXNamespacedName(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ Boolean = js.native
  def isJSXOpeningElement(): /* is @babel/types.@babel/types.JSXOpeningElement */ Boolean = js.native
  def isJSXOpeningElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ Boolean = js.native
  def isJSXOpeningElement(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ Boolean = js.native
  def isJSXOpeningElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ Boolean = js.native
  def isJSXOpeningElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ Boolean = js.native
  def isJSXOpeningFragment(): /* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean = js.native
  def isJSXOpeningFragment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean = js.native
  def isJSXOpeningFragment(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean = js.native
  def isJSXOpeningFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean = js.native
  def isJSXOpeningFragment(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ Boolean = js.native
  def isJSXSpreadAttribute(): /* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean = js.native
  def isJSXSpreadAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean = js.native
  def isJSXSpreadAttribute(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ Boolean = js.native
  def isJSXSpreadChild(): /* is @babel/types.@babel/types.JSXSpreadChild */ Boolean = js.native
  def isJSXSpreadChild(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ Boolean = js.native
  def isJSXSpreadChild(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ Boolean = js.native
  def isJSXSpreadChild(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ Boolean = js.native
  def isJSXSpreadChild(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ Boolean = js.native
  def isJSXText(): /* is @babel/types.@babel/types.JSXText */ Boolean = js.native
  def isJSXText(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXText */ Boolean = js.native
  def isJSXText(node: js.Object): /* is @babel/types.@babel/types.JSXText */ Boolean = js.native
  def isJSXText(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXText */ Boolean = js.native
  def isJSXText(node: Null, opts: js.Object): /* is @babel/types.@babel/types.JSXText */ Boolean = js.native
  def isLVal(): /* is @babel/types.@babel/types.LVal */ Boolean = js.native
  def isLVal(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.LVal */ Boolean = js.native
  def isLVal(node: js.Object): /* is @babel/types.@babel/types.LVal */ Boolean = js.native
  def isLVal(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LVal */ Boolean = js.native
  def isLVal(node: Null, opts: js.Object): /* is @babel/types.@babel/types.LVal */ Boolean = js.native
  def isLabeledStatement(): /* is @babel/types.@babel/types.LabeledStatement */ Boolean = js.native
  def isLabeledStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ Boolean = js.native
  def isLabeledStatement(node: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ Boolean = js.native
  def isLabeledStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ Boolean = js.native
  def isLabeledStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ Boolean = js.native
  def isLiteral(): /* is @babel/types.@babel/types.Literal */ Boolean = js.native
  def isLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Literal */ Boolean = js.native
  def isLiteral(node: js.Object): /* is @babel/types.@babel/types.Literal */ Boolean = js.native
  def isLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Literal */ Boolean = js.native
  def isLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Literal */ Boolean = js.native
  def isLogicalExpression(): /* is @babel/types.@babel/types.LogicalExpression */ Boolean = js.native
  def isLogicalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ Boolean = js.native
  def isLogicalExpression(node: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ Boolean = js.native
  def isLogicalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ Boolean = js.native
  def isLogicalExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ Boolean = js.native
  def isLoop(): /* is @babel/types.@babel/types.Loop */ Boolean = js.native
  def isLoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Loop */ Boolean = js.native
  def isLoop(node: js.Object): /* is @babel/types.@babel/types.Loop */ Boolean = js.native
  def isLoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Loop */ Boolean = js.native
  def isLoop(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Loop */ Boolean = js.native
  def isMemberExpression(): /* is @babel/types.@babel/types.MemberExpression */ Boolean = js.native
  def isMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ Boolean = js.native
  def isMemberExpression(node: js.Object): /* is @babel/types.@babel/types.MemberExpression */ Boolean = js.native
  def isMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ Boolean = js.native
  def isMemberExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ Boolean = js.native
  def isMetaProperty(): /* is @babel/types.@babel/types.MetaProperty */ Boolean = js.native
  def isMetaProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ Boolean = js.native
  def isMetaProperty(node: js.Object): /* is @babel/types.@babel/types.MetaProperty */ Boolean = js.native
  def isMetaProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ Boolean = js.native
  def isMetaProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ Boolean = js.native
  def isMethod(): /* is @babel/types.@babel/types.Method */ Boolean = js.native
  def isMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Method */ Boolean = js.native
  def isMethod(node: js.Object): /* is @babel/types.@babel/types.Method */ Boolean = js.native
  def isMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Method */ Boolean = js.native
  def isMethod(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Method */ Boolean = js.native
  def isMixedTypeAnnotation(): /* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean = js.native
  def isMixedTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean = js.native
  def isMixedTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ Boolean = js.native
  def isModuleDeclaration(): /* is @babel/types.@babel/types.ModuleDeclaration */ Boolean = js.native
  def isModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ Boolean = js.native
  def isModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ Boolean = js.native
  def isModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ Boolean = js.native
  def isModuleDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ Boolean = js.native
  def isModuleSpecifier(): /* is @babel/types.@babel/types.ModuleSpecifier */ Boolean = js.native
  def isModuleSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ Boolean = js.native
  def isModuleSpecifier(node: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ Boolean = js.native
  def isModuleSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ Boolean = js.native
  def isModuleSpecifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ Boolean = js.native
  def isNewExpression(): /* is @babel/types.@babel/types.NewExpression */ Boolean = js.native
  def isNewExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ Boolean = js.native
  def isNewExpression(node: js.Object): /* is @babel/types.@babel/types.NewExpression */ Boolean = js.native
  def isNewExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ Boolean = js.native
  def isNewExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ Boolean = js.native
  def isNoop(): /* is @babel/types.@babel/types.Noop */ Boolean = js.native
  def isNoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Noop */ Boolean = js.native
  def isNoop(node: js.Object): /* is @babel/types.@babel/types.Noop */ Boolean = js.native
  def isNoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Noop */ Boolean = js.native
  def isNoop(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Noop */ Boolean = js.native
  def isNullLiteral(): /* is @babel/types.@babel/types.NullLiteral */ Boolean = js.native
  def isNullLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ Boolean = js.native
  def isNullLiteral(node: js.Object): /* is @babel/types.@babel/types.NullLiteral */ Boolean = js.native
  def isNullLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ Boolean = js.native
  def isNullLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ Boolean = js.native
  def isNullLiteralTypeAnnotation(): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean = js.native
  def isNullLiteralTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ Boolean = js.native
  def isNullableTypeAnnotation(): /* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean = js.native
  def isNullableTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean = js.native
  def isNullableTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ Boolean = js.native
  def isNumberLiteral(): Boolean = js.native
  def isNumberLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): Boolean = js.native
  def isNumberLiteral(node: js.Object): Boolean = js.native
  def isNumberLiteral(node: js.Object, opts: js.Object): Boolean = js.native
  def isNumberLiteral(node: Null, opts: js.Object): Boolean = js.native
  def isNumberLiteralTypeAnnotation(): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ Boolean = js.native
  def isNumberTypeAnnotation(): /* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean = js.native
  def isNumberTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean = js.native
  def isNumberTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ Boolean = js.native
  def isNumericLiteral(): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = js.native
  def isNumericLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = js.native
  def isNumericLiteral(node: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = js.native
  def isNumericLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = js.native
  def isNumericLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ Boolean = js.native
  def isObjectExpression(): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = js.native
  def isObjectExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = js.native
  def isObjectExpression(node: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = js.native
  def isObjectExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = js.native
  def isObjectExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ Boolean = js.native
  def isObjectMember(): /* is @babel/types.@babel/types.ObjectMember */ Boolean = js.native
  def isObjectMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ Boolean = js.native
  def isObjectMember(node: js.Object): /* is @babel/types.@babel/types.ObjectMember */ Boolean = js.native
  def isObjectMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ Boolean = js.native
  def isObjectMember(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ Boolean = js.native
  def isObjectMethod(): /* is @babel/types.@babel/types.ObjectMethod */ Boolean = js.native
  def isObjectMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ Boolean = js.native
  def isObjectMethod(node: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ Boolean = js.native
  def isObjectMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ Boolean = js.native
  def isObjectMethod(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ Boolean = js.native
  def isObjectPattern(): /* is @babel/types.@babel/types.ObjectPattern */ Boolean = js.native
  def isObjectPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ Boolean = js.native
  def isObjectPattern(node: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ Boolean = js.native
  def isObjectPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ Boolean = js.native
  def isObjectPattern(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ Boolean = js.native
  def isObjectProperty(): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = js.native
  def isObjectProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = js.native
  def isObjectProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = js.native
  def isObjectProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = js.native
  def isObjectProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ Boolean = js.native
  def isObjectTypeAnnotation(): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean = js.native
  def isObjectTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean = js.native
  def isObjectTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ Boolean = js.native
  def isObjectTypeCallProperty(): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean = js.native
  def isObjectTypeCallProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean = js.native
  def isObjectTypeCallProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ Boolean = js.native
  def isObjectTypeIndexer(): /* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean = js.native
  def isObjectTypeIndexer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean = js.native
  def isObjectTypeIndexer(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean = js.native
  def isObjectTypeIndexer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean = js.native
  def isObjectTypeIndexer(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ Boolean = js.native
  def isObjectTypeInternalSlot(): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean = js.native
  def isObjectTypeInternalSlot(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean = js.native
  def isObjectTypeInternalSlot(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ Boolean = js.native
  def isObjectTypeProperty(): /* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean = js.native
  def isObjectTypeProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean = js.native
  def isObjectTypeProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean = js.native
  def isObjectTypeProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean = js.native
  def isObjectTypeProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ Boolean = js.native
  def isObjectTypeSpreadProperty(): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean = js.native
  def isObjectTypeSpreadProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ Boolean = js.native
  def isOpaqueType(): /* is @babel/types.@babel/types.OpaqueType */ Boolean = js.native
  def isOpaqueType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ Boolean = js.native
  def isOpaqueType(node: js.Object): /* is @babel/types.@babel/types.OpaqueType */ Boolean = js.native
  def isOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ Boolean = js.native
  def isOpaqueType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ Boolean = js.native
  def isOptionalCallExpression(): /* is @babel/types.@babel/types.OptionalCallExpression */ Boolean = js.native
  def isOptionalCallExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ Boolean = js.native
  def isOptionalCallExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ Boolean = js.native
  def isOptionalCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ Boolean = js.native
  def isOptionalCallExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ Boolean = js.native
  def isOptionalMemberExpression(): /* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean = js.native
  def isOptionalMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean = js.native
  def isOptionalMemberExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean = js.native
  def isOptionalMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean = js.native
  def isOptionalMemberExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ Boolean = js.native
  def isParenthesizedExpression(): /* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean = js.native
  def isParenthesizedExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean = js.native
  def isParenthesizedExpression(node: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean = js.native
  def isParenthesizedExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean = js.native
  def isParenthesizedExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ Boolean = js.native
  def isPattern(): /* is @babel/types.@babel/types.Pattern */ Boolean = js.native
  def isPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Pattern */ Boolean = js.native
  def isPattern(node: js.Object): /* is @babel/types.@babel/types.Pattern */ Boolean = js.native
  def isPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pattern */ Boolean = js.native
  def isPattern(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Pattern */ Boolean = js.native
  def isPatternLike(): /* is @babel/types.@babel/types.PatternLike */ Boolean = js.native
  def isPatternLike(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ Boolean = js.native
  def isPatternLike(node: js.Object): /* is @babel/types.@babel/types.PatternLike */ Boolean = js.native
  def isPatternLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ Boolean = js.native
  def isPatternLike(node: Null, opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ Boolean = js.native
  def isPipelineBareFunction(): /* is @babel/types.@babel/types.PipelineBareFunction */ Boolean = js.native
  def isPipelineBareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ Boolean = js.native
  def isPipelineBareFunction(node: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ Boolean = js.native
  def isPipelineBareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ Boolean = js.native
  def isPipelineBareFunction(node: Null, opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ Boolean = js.native
  def isPipelinePrimaryTopicReference(): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean = js.native
  def isPipelinePrimaryTopicReference(node: Null, opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ Boolean = js.native
  def isPipelineTopicExpression(): /* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean = js.native
  def isPipelineTopicExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean = js.native
  def isPipelineTopicExpression(node: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean = js.native
  def isPipelineTopicExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean = js.native
  def isPipelineTopicExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ Boolean = js.native
  def isPlaceholder(): /* is @babel/types.@babel/types.Placeholder */ Boolean = js.native
  def isPlaceholder(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ Boolean = js.native
  def isPlaceholder(node: js.Object): /* is @babel/types.@babel/types.Placeholder */ Boolean = js.native
  def isPlaceholder(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ Boolean = js.native
  def isPlaceholder(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ Boolean = js.native
  def isPrivate(): /* is @babel/types.@babel/types.Private */ Boolean = js.native
  def isPrivate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Private */ Boolean = js.native
  def isPrivate(node: js.Object): /* is @babel/types.@babel/types.Private */ Boolean = js.native
  def isPrivate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Private */ Boolean = js.native
  def isPrivate(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Private */ Boolean = js.native
  def isPrivateName(): /* is @babel/types.@babel/types.PrivateName */ Boolean = js.native
  def isPrivateName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ Boolean = js.native
  def isPrivateName(node: js.Object): /* is @babel/types.@babel/types.PrivateName */ Boolean = js.native
  def isPrivateName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ Boolean = js.native
  def isPrivateName(node: Null, opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ Boolean = js.native
  def isProgram(): /* is @babel/types.@babel/types.Program */ Boolean = js.native
  def isProgram(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Program */ Boolean = js.native
  def isProgram(node: js.Object): /* is @babel/types.@babel/types.Program */ Boolean = js.native
  def isProgram(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Program */ Boolean = js.native
  def isProgram(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Program */ Boolean = js.native
  def isProperty(): /* is @babel/types.@babel/types.Property */ Boolean = js.native
  def isProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Property */ Boolean = js.native
  def isProperty(node: js.Object): /* is @babel/types.@babel/types.Property */ Boolean = js.native
  def isProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Property */ Boolean = js.native
  def isProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Property */ Boolean = js.native
  def isPureish(): /* is @babel/types.@babel/types.Pureish */ Boolean = js.native
  def isPureish(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Pureish */ Boolean = js.native
  def isPureish(node: js.Object): /* is @babel/types.@babel/types.Pureish */ Boolean = js.native
  def isPureish(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pureish */ Boolean = js.native
  def isPureish(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Pureish */ Boolean = js.native
  def isQualifiedTypeIdentifier(): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean = js.native
  def isQualifiedTypeIdentifier(node: Null, opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ Boolean = js.native
  def isRegExpLiteral(): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = js.native
  def isRegExpLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = js.native
  def isRegExpLiteral(node: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = js.native
  def isRegExpLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = js.native
  def isRegExpLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ Boolean = js.native
  def isRegexLiteral(): Boolean = js.native
  def isRegexLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): Boolean = js.native
  def isRegexLiteral(node: js.Object): Boolean = js.native
  def isRegexLiteral(node: js.Object, opts: js.Object): Boolean = js.native
  def isRegexLiteral(node: Null, opts: js.Object): Boolean = js.native
  def isRestElement(): /* is @babel/types.@babel/types.RestElement */ Boolean = js.native
  def isRestElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = js.native
  def isRestElement(node: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = js.native
  def isRestElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = js.native
  def isRestElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ Boolean = js.native
  def isRestProperty(): Boolean = js.native
  def isRestProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): Boolean = js.native
  def isRestProperty(node: js.Object): Boolean = js.native
  def isRestProperty(node: js.Object, opts: js.Object): Boolean = js.native
  def isRestProperty(node: Null, opts: js.Object): Boolean = js.native
  def isReturnStatement(): /* is @babel/types.@babel/types.ReturnStatement */ Boolean = js.native
  def isReturnStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ Boolean = js.native
  def isReturnStatement(node: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ Boolean = js.native
  def isReturnStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ Boolean = js.native
  def isReturnStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ Boolean = js.native
  def isScopable(): /* is @babel/types.@babel/types.Scopable */ Boolean = js.native
  def isScopable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Scopable */ Boolean = js.native
  def isScopable(node: js.Object): /* is @babel/types.@babel/types.Scopable */ Boolean = js.native
  def isScopable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Scopable */ Boolean = js.native
  def isScopable(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Scopable */ Boolean = js.native
  def isSequenceExpression(): /* is @babel/types.@babel/types.SequenceExpression */ Boolean = js.native
  def isSequenceExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ Boolean = js.native
  def isSequenceExpression(node: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ Boolean = js.native
  def isSequenceExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ Boolean = js.native
  def isSequenceExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ Boolean = js.native
  def isSpreadElement(): /* is @babel/types.@babel/types.SpreadElement */ Boolean = js.native
  def isSpreadElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = js.native
  def isSpreadElement(node: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = js.native
  def isSpreadElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = js.native
  def isSpreadElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ Boolean = js.native
  def isSpreadProperty(): Boolean = js.native
  def isSpreadProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): Boolean = js.native
  def isSpreadProperty(node: js.Object): Boolean = js.native
  def isSpreadProperty(node: js.Object, opts: js.Object): Boolean = js.native
  def isSpreadProperty(node: Null, opts: js.Object): Boolean = js.native
  def isStatement(): /* is @babel/types.@babel/types.Statement */ Boolean = js.native
  def isStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Statement */ Boolean = js.native
  def isStatement(node: js.Object): /* is @babel/types.@babel/types.Statement */ Boolean = js.native
  def isStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Statement */ Boolean = js.native
  def isStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Statement */ Boolean = js.native
  def isStringLiteral(): /* is @babel/types.@babel/types.StringLiteral */ Boolean = js.native
  def isStringLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = js.native
  def isStringLiteral(node: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = js.native
  def isStringLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = js.native
  def isStringLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ Boolean = js.native
  def isStringLiteralTypeAnnotation(): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean = js.native
  def isStringLiteralTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ Boolean = js.native
  def isStringTypeAnnotation(): /* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean = js.native
  def isStringTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean = js.native
  def isStringTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean = js.native
  def isStringTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean = js.native
  def isStringTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ Boolean = js.native
  def isSuper(): /* is @babel/types.@babel/types.Super */ Boolean = js.native
  def isSuper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Super */ Boolean = js.native
  def isSuper(node: js.Object): /* is @babel/types.@babel/types.Super */ Boolean = js.native
  def isSuper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Super */ Boolean = js.native
  def isSuper(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Super */ Boolean = js.native
  def isSwitchCase(): /* is @babel/types.@babel/types.SwitchCase */ Boolean = js.native
  def isSwitchCase(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ Boolean = js.native
  def isSwitchCase(node: js.Object): /* is @babel/types.@babel/types.SwitchCase */ Boolean = js.native
  def isSwitchCase(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ Boolean = js.native
  def isSwitchCase(node: Null, opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ Boolean = js.native
  def isSwitchStatement(): /* is @babel/types.@babel/types.SwitchStatement */ Boolean = js.native
  def isSwitchStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ Boolean = js.native
  def isSwitchStatement(node: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ Boolean = js.native
  def isSwitchStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ Boolean = js.native
  def isSwitchStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ Boolean = js.native
  def isTSAnyKeyword(): /* is @babel/types.@babel/types.TSAnyKeyword */ Boolean = js.native
  def isTSAnyKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ Boolean = js.native
  def isTSAnyKeyword(node: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ Boolean = js.native
  def isTSAnyKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ Boolean = js.native
  def isTSAnyKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ Boolean = js.native
  def isTSArrayType(): /* is @babel/types.@babel/types.TSArrayType */ Boolean = js.native
  def isTSArrayType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ Boolean = js.native
  def isTSArrayType(node: js.Object): /* is @babel/types.@babel/types.TSArrayType */ Boolean = js.native
  def isTSArrayType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ Boolean = js.native
  def isTSArrayType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ Boolean = js.native
  def isTSAsExpression(): /* is @babel/types.@babel/types.TSAsExpression */ Boolean = js.native
  def isTSAsExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ Boolean = js.native
  def isTSAsExpression(node: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ Boolean = js.native
  def isTSAsExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ Boolean = js.native
  def isTSAsExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ Boolean = js.native
  def isTSBooleanKeyword(): /* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean = js.native
  def isTSBooleanKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean = js.native
  def isTSBooleanKeyword(node: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean = js.native
  def isTSBooleanKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean = js.native
  def isTSBooleanKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ Boolean = js.native
  def isTSCallSignatureDeclaration(): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean = js.native
  def isTSCallSignatureDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ Boolean = js.native
  def isTSConditionalType(): /* is @babel/types.@babel/types.TSConditionalType */ Boolean = js.native
  def isTSConditionalType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ Boolean = js.native
  def isTSConditionalType(node: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ Boolean = js.native
  def isTSConditionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ Boolean = js.native
  def isTSConditionalType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ Boolean = js.native
  def isTSConstructSignatureDeclaration(): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean = js.native
  def isTSConstructSignatureDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ Boolean = js.native
  def isTSConstructorType(): /* is @babel/types.@babel/types.TSConstructorType */ Boolean = js.native
  def isTSConstructorType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ Boolean = js.native
  def isTSConstructorType(node: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ Boolean = js.native
  def isTSConstructorType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ Boolean = js.native
  def isTSConstructorType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ Boolean = js.native
  def isTSDeclareFunction(): /* is @babel/types.@babel/types.TSDeclareFunction */ Boolean = js.native
  def isTSDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ Boolean = js.native
  def isTSDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ Boolean = js.native
  def isTSDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ Boolean = js.native
  def isTSDeclareFunction(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ Boolean = js.native
  def isTSDeclareMethod(): /* is @babel/types.@babel/types.TSDeclareMethod */ Boolean = js.native
  def isTSDeclareMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ Boolean = js.native
  def isTSDeclareMethod(node: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ Boolean = js.native
  def isTSDeclareMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ Boolean = js.native
  def isTSDeclareMethod(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ Boolean = js.native
  def isTSEntityName(): /* is @babel/types.@babel/types.TSEntityName */ Boolean = js.native
  def isTSEntityName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ Boolean = js.native
  def isTSEntityName(node: js.Object): /* is @babel/types.@babel/types.TSEntityName */ Boolean = js.native
  def isTSEntityName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ Boolean = js.native
  def isTSEntityName(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ Boolean = js.native
  def isTSEnumDeclaration(): /* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean = js.native
  def isTSEnumDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean = js.native
  def isTSEnumDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean = js.native
  def isTSEnumDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean = js.native
  def isTSEnumDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ Boolean = js.native
  def isTSEnumMember(): /* is @babel/types.@babel/types.TSEnumMember */ Boolean = js.native
  def isTSEnumMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ Boolean = js.native
  def isTSEnumMember(node: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ Boolean = js.native
  def isTSEnumMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ Boolean = js.native
  def isTSEnumMember(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ Boolean = js.native
  def isTSExportAssignment(): /* is @babel/types.@babel/types.TSExportAssignment */ Boolean = js.native
  def isTSExportAssignment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ Boolean = js.native
  def isTSExportAssignment(node: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ Boolean = js.native
  def isTSExportAssignment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ Boolean = js.native
  def isTSExportAssignment(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ Boolean = js.native
  def isTSExpressionWithTypeArguments(): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean = js.native
  def isTSExpressionWithTypeArguments(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ Boolean = js.native
  def isTSExternalModuleReference(): /* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean = js.native
  def isTSExternalModuleReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean = js.native
  def isTSExternalModuleReference(node: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean = js.native
  def isTSExternalModuleReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean = js.native
  def isTSExternalModuleReference(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ Boolean = js.native
  def isTSFunctionType(): /* is @babel/types.@babel/types.TSFunctionType */ Boolean = js.native
  def isTSFunctionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ Boolean = js.native
  def isTSFunctionType(node: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ Boolean = js.native
  def isTSFunctionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ Boolean = js.native
  def isTSFunctionType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ Boolean = js.native
  def isTSImportEqualsDeclaration(): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean = js.native
  def isTSImportEqualsDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ Boolean = js.native
  def isTSImportType(): /* is @babel/types.@babel/types.TSImportType */ Boolean = js.native
  def isTSImportType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ Boolean = js.native
  def isTSImportType(node: js.Object): /* is @babel/types.@babel/types.TSImportType */ Boolean = js.native
  def isTSImportType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ Boolean = js.native
  def isTSImportType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ Boolean = js.native
  def isTSIndexSignature(): /* is @babel/types.@babel/types.TSIndexSignature */ Boolean = js.native
  def isTSIndexSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ Boolean = js.native
  def isTSIndexSignature(node: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ Boolean = js.native
  def isTSIndexSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ Boolean = js.native
  def isTSIndexSignature(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ Boolean = js.native
  def isTSIndexedAccessType(): /* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean = js.native
  def isTSIndexedAccessType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean = js.native
  def isTSIndexedAccessType(node: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean = js.native
  def isTSIndexedAccessType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean = js.native
  def isTSIndexedAccessType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ Boolean = js.native
  def isTSInferType(): /* is @babel/types.@babel/types.TSInferType */ Boolean = js.native
  def isTSInferType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ Boolean = js.native
  def isTSInferType(node: js.Object): /* is @babel/types.@babel/types.TSInferType */ Boolean = js.native
  def isTSInferType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ Boolean = js.native
  def isTSInferType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ Boolean = js.native
  def isTSInterfaceBody(): /* is @babel/types.@babel/types.TSInterfaceBody */ Boolean = js.native
  def isTSInterfaceBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ Boolean = js.native
  def isTSInterfaceBody(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ Boolean = js.native
  def isTSInterfaceBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ Boolean = js.native
  def isTSInterfaceBody(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ Boolean = js.native
  def isTSInterfaceDeclaration(): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean = js.native
  def isTSInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean = js.native
  def isTSInterfaceDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ Boolean = js.native
  def isTSIntersectionType(): /* is @babel/types.@babel/types.TSIntersectionType */ Boolean = js.native
  def isTSIntersectionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ Boolean = js.native
  def isTSIntersectionType(node: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ Boolean = js.native
  def isTSIntersectionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ Boolean = js.native
  def isTSIntersectionType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ Boolean = js.native
  def isTSLiteralType(): /* is @babel/types.@babel/types.TSLiteralType */ Boolean = js.native
  def isTSLiteralType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ Boolean = js.native
  def isTSLiteralType(node: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ Boolean = js.native
  def isTSLiteralType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ Boolean = js.native
  def isTSLiteralType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ Boolean = js.native
  def isTSMappedType(): /* is @babel/types.@babel/types.TSMappedType */ Boolean = js.native
  def isTSMappedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ Boolean = js.native
  def isTSMappedType(node: js.Object): /* is @babel/types.@babel/types.TSMappedType */ Boolean = js.native
  def isTSMappedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ Boolean = js.native
  def isTSMappedType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ Boolean = js.native
  def isTSMethodSignature(): /* is @babel/types.@babel/types.TSMethodSignature */ Boolean = js.native
  def isTSMethodSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ Boolean = js.native
  def isTSMethodSignature(node: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ Boolean = js.native
  def isTSMethodSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ Boolean = js.native
  def isTSMethodSignature(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ Boolean = js.native
  def isTSModuleBlock(): /* is @babel/types.@babel/types.TSModuleBlock */ Boolean = js.native
  def isTSModuleBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ Boolean = js.native
  def isTSModuleBlock(node: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ Boolean = js.native
  def isTSModuleBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ Boolean = js.native
  def isTSModuleBlock(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ Boolean = js.native
  def isTSModuleDeclaration(): /* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean = js.native
  def isTSModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean = js.native
  def isTSModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean = js.native
  def isTSModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean = js.native
  def isTSModuleDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ Boolean = js.native
  def isTSNamespaceExportDeclaration(): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean = js.native
  def isTSNamespaceExportDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ Boolean = js.native
  def isTSNeverKeyword(): /* is @babel/types.@babel/types.TSNeverKeyword */ Boolean = js.native
  def isTSNeverKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ Boolean = js.native
  def isTSNeverKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ Boolean = js.native
  def isTSNeverKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ Boolean = js.native
  def isTSNeverKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ Boolean = js.native
  def isTSNonNullExpression(): /* is @babel/types.@babel/types.TSNonNullExpression */ Boolean = js.native
  def isTSNonNullExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ Boolean = js.native
  def isTSNonNullExpression(node: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ Boolean = js.native
  def isTSNonNullExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ Boolean = js.native
  def isTSNonNullExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ Boolean = js.native
  def isTSNullKeyword(): /* is @babel/types.@babel/types.TSNullKeyword */ Boolean = js.native
  def isTSNullKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ Boolean = js.native
  def isTSNullKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ Boolean = js.native
  def isTSNullKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ Boolean = js.native
  def isTSNullKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ Boolean = js.native
  def isTSNumberKeyword(): /* is @babel/types.@babel/types.TSNumberKeyword */ Boolean = js.native
  def isTSNumberKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ Boolean = js.native
  def isTSNumberKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ Boolean = js.native
  def isTSNumberKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ Boolean = js.native
  def isTSNumberKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ Boolean = js.native
  def isTSObjectKeyword(): /* is @babel/types.@babel/types.TSObjectKeyword */ Boolean = js.native
  def isTSObjectKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ Boolean = js.native
  def isTSObjectKeyword(node: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ Boolean = js.native
  def isTSObjectKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ Boolean = js.native
  def isTSObjectKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ Boolean = js.native
  def isTSOptionalType(): /* is @babel/types.@babel/types.TSOptionalType */ Boolean = js.native
  def isTSOptionalType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ Boolean = js.native
  def isTSOptionalType(node: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ Boolean = js.native
  def isTSOptionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ Boolean = js.native
  def isTSOptionalType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ Boolean = js.native
  def isTSParameterProperty(): /* is @babel/types.@babel/types.TSParameterProperty */ Boolean = js.native
  def isTSParameterProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ Boolean = js.native
  def isTSParameterProperty(node: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ Boolean = js.native
  def isTSParameterProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ Boolean = js.native
  def isTSParameterProperty(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ Boolean = js.native
  def isTSParenthesizedType(): /* is @babel/types.@babel/types.TSParenthesizedType */ Boolean = js.native
  def isTSParenthesizedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ Boolean = js.native
  def isTSParenthesizedType(node: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ Boolean = js.native
  def isTSParenthesizedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ Boolean = js.native
  def isTSParenthesizedType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ Boolean = js.native
  def isTSPropertySignature(): /* is @babel/types.@babel/types.TSPropertySignature */ Boolean = js.native
  def isTSPropertySignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ Boolean = js.native
  def isTSPropertySignature(node: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ Boolean = js.native
  def isTSPropertySignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ Boolean = js.native
  def isTSPropertySignature(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ Boolean = js.native
  def isTSQualifiedName(): /* is @babel/types.@babel/types.TSQualifiedName */ Boolean = js.native
  def isTSQualifiedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ Boolean = js.native
  def isTSQualifiedName(node: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ Boolean = js.native
  def isTSQualifiedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ Boolean = js.native
  def isTSQualifiedName(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ Boolean = js.native
  def isTSRestType(): /* is @babel/types.@babel/types.TSRestType */ Boolean = js.native
  def isTSRestType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ Boolean = js.native
  def isTSRestType(node: js.Object): /* is @babel/types.@babel/types.TSRestType */ Boolean = js.native
  def isTSRestType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ Boolean = js.native
  def isTSRestType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ Boolean = js.native
  def isTSStringKeyword(): /* is @babel/types.@babel/types.TSStringKeyword */ Boolean = js.native
  def isTSStringKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ Boolean = js.native
  def isTSStringKeyword(node: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ Boolean = js.native
  def isTSStringKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ Boolean = js.native
  def isTSStringKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ Boolean = js.native
  def isTSSymbolKeyword(): /* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean = js.native
  def isTSSymbolKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean = js.native
  def isTSSymbolKeyword(node: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean = js.native
  def isTSSymbolKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean = js.native
  def isTSSymbolKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ Boolean = js.native
  def isTSThisType(): /* is @babel/types.@babel/types.TSThisType */ Boolean = js.native
  def isTSThisType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ Boolean = js.native
  def isTSThisType(node: js.Object): /* is @babel/types.@babel/types.TSThisType */ Boolean = js.native
  def isTSThisType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ Boolean = js.native
  def isTSThisType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ Boolean = js.native
  def isTSTupleType(): /* is @babel/types.@babel/types.TSTupleType */ Boolean = js.native
  def isTSTupleType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ Boolean = js.native
  def isTSTupleType(node: js.Object): /* is @babel/types.@babel/types.TSTupleType */ Boolean = js.native
  def isTSTupleType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ Boolean = js.native
  def isTSTupleType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ Boolean = js.native
  def isTSType(): /* is @babel/types.@babel/types.TSType */ Boolean = js.native
  def isTSType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSType */ Boolean = js.native
  def isTSType(node: js.Object): /* is @babel/types.@babel/types.TSType */ Boolean = js.native
  def isTSType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSType */ Boolean = js.native
  def isTSType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSType */ Boolean = js.native
  def isTSTypeAliasDeclaration(): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean = js.native
  def isTSTypeAliasDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ Boolean = js.native
  def isTSTypeAnnotation(): /* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean = js.native
  def isTSTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean = js.native
  def isTSTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean = js.native
  def isTSTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean = js.native
  def isTSTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ Boolean = js.native
  def isTSTypeAssertion(): /* is @babel/types.@babel/types.TSTypeAssertion */ Boolean = js.native
  def isTSTypeAssertion(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ Boolean = js.native
  def isTSTypeAssertion(node: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ Boolean = js.native
  def isTSTypeAssertion(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ Boolean = js.native
  def isTSTypeAssertion(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ Boolean = js.native
  def isTSTypeElement(): /* is @babel/types.@babel/types.TSTypeElement */ Boolean = js.native
  def isTSTypeElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ Boolean = js.native
  def isTSTypeElement(node: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ Boolean = js.native
  def isTSTypeElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ Boolean = js.native
  def isTSTypeElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ Boolean = js.native
  def isTSTypeLiteral(): /* is @babel/types.@babel/types.TSTypeLiteral */ Boolean = js.native
  def isTSTypeLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ Boolean = js.native
  def isTSTypeLiteral(node: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ Boolean = js.native
  def isTSTypeLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ Boolean = js.native
  def isTSTypeLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ Boolean = js.native
  def isTSTypeOperator(): /* is @babel/types.@babel/types.TSTypeOperator */ Boolean = js.native
  def isTSTypeOperator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ Boolean = js.native
  def isTSTypeOperator(node: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ Boolean = js.native
  def isTSTypeOperator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ Boolean = js.native
  def isTSTypeOperator(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ Boolean = js.native
  def isTSTypeParameter(): /* is @babel/types.@babel/types.TSTypeParameter */ Boolean = js.native
  def isTSTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ Boolean = js.native
  def isTSTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ Boolean = js.native
  def isTSTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ Boolean = js.native
  def isTSTypeParameter(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ Boolean = js.native
  def isTSTypeParameterDeclaration(): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean = js.native
  def isTSTypeParameterDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ Boolean = js.native
  def isTSTypeParameterInstantiation(): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean = js.native
  def isTSTypeParameterInstantiation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ Boolean = js.native
  def isTSTypePredicate(): /* is @babel/types.@babel/types.TSTypePredicate */ Boolean = js.native
  def isTSTypePredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ Boolean = js.native
  def isTSTypePredicate(node: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ Boolean = js.native
  def isTSTypePredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ Boolean = js.native
  def isTSTypePredicate(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ Boolean = js.native
  def isTSTypeQuery(): /* is @babel/types.@babel/types.TSTypeQuery */ Boolean = js.native
  def isTSTypeQuery(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ Boolean = js.native
  def isTSTypeQuery(node: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ Boolean = js.native
  def isTSTypeQuery(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ Boolean = js.native
  def isTSTypeQuery(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ Boolean = js.native
  def isTSTypeReference(): /* is @babel/types.@babel/types.TSTypeReference */ Boolean = js.native
  def isTSTypeReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ Boolean = js.native
  def isTSTypeReference(node: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ Boolean = js.native
  def isTSTypeReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ Boolean = js.native
  def isTSTypeReference(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ Boolean = js.native
  def isTSUndefinedKeyword(): /* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean = js.native
  def isTSUndefinedKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean = js.native
  def isTSUndefinedKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ Boolean = js.native
  def isTSUnionType(): /* is @babel/types.@babel/types.TSUnionType */ Boolean = js.native
  def isTSUnionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ Boolean = js.native
  def isTSUnionType(node: js.Object): /* is @babel/types.@babel/types.TSUnionType */ Boolean = js.native
  def isTSUnionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ Boolean = js.native
  def isTSUnionType(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ Boolean = js.native
  def isTSUnknownKeyword(): /* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean = js.native
  def isTSUnknownKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean = js.native
  def isTSUnknownKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean = js.native
  def isTSUnknownKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean = js.native
  def isTSUnknownKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ Boolean = js.native
  def isTSVoidKeyword(): /* is @babel/types.@babel/types.TSVoidKeyword */ Boolean = js.native
  def isTSVoidKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ Boolean = js.native
  def isTSVoidKeyword(node: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ Boolean = js.native
  def isTSVoidKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ Boolean = js.native
  def isTSVoidKeyword(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ Boolean = js.native
  def isTaggedTemplateExpression(): /* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean = js.native
  def isTaggedTemplateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean = js.native
  def isTaggedTemplateExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ Boolean = js.native
  def isTemplateElement(): /* is @babel/types.@babel/types.TemplateElement */ Boolean = js.native
  def isTemplateElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ Boolean = js.native
  def isTemplateElement(node: js.Object): /* is @babel/types.@babel/types.TemplateElement */ Boolean = js.native
  def isTemplateElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ Boolean = js.native
  def isTemplateElement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ Boolean = js.native
  def isTemplateLiteral(): /* is @babel/types.@babel/types.TemplateLiteral */ Boolean = js.native
  def isTemplateLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ Boolean = js.native
  def isTemplateLiteral(node: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ Boolean = js.native
  def isTemplateLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ Boolean = js.native
  def isTemplateLiteral(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ Boolean = js.native
  def isTerminatorless(): /* is @babel/types.@babel/types.Terminatorless */ Boolean = js.native
  def isTerminatorless(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ Boolean = js.native
  def isTerminatorless(node: js.Object): /* is @babel/types.@babel/types.Terminatorless */ Boolean = js.native
  def isTerminatorless(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ Boolean = js.native
  def isTerminatorless(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ Boolean = js.native
  def isThisExpression(): /* is @babel/types.@babel/types.ThisExpression */ Boolean = js.native
  def isThisExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ Boolean = js.native
  def isThisExpression(node: js.Object): /* is @babel/types.@babel/types.ThisExpression */ Boolean = js.native
  def isThisExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ Boolean = js.native
  def isThisExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ Boolean = js.native
  def isThisTypeAnnotation(): /* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean = js.native
  def isThisTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean = js.native
  def isThisTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean = js.native
  def isThisTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean = js.native
  def isThisTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ Boolean = js.native
  def isThrowStatement(): /* is @babel/types.@babel/types.ThrowStatement */ Boolean = js.native
  def isThrowStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ Boolean = js.native
  def isThrowStatement(node: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ Boolean = js.native
  def isThrowStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ Boolean = js.native
  def isThrowStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ Boolean = js.native
  def isTryStatement(): /* is @babel/types.@babel/types.TryStatement */ Boolean = js.native
  def isTryStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ Boolean = js.native
  def isTryStatement(node: js.Object): /* is @babel/types.@babel/types.TryStatement */ Boolean = js.native
  def isTryStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ Boolean = js.native
  def isTryStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ Boolean = js.native
  def isTupleTypeAnnotation(): /* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean = js.native
  def isTupleTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean = js.native
  def isTupleTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ Boolean = js.native
  def isTypeAlias(): /* is @babel/types.@babel/types.TypeAlias */ Boolean = js.native
  def isTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ Boolean = js.native
  def isTypeAlias(node: js.Object): /* is @babel/types.@babel/types.TypeAlias */ Boolean = js.native
  def isTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ Boolean = js.native
  def isTypeAlias(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ Boolean = js.native
  def isTypeAnnotation(): /* is @babel/types.@babel/types.TypeAnnotation */ Boolean = js.native
  def isTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ Boolean = js.native
  def isTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ Boolean = js.native
  def isTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ Boolean = js.native
  def isTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ Boolean = js.native
  def isTypeCastExpression(): /* is @babel/types.@babel/types.TypeCastExpression */ Boolean = js.native
  def isTypeCastExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ Boolean = js.native
  def isTypeCastExpression(node: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ Boolean = js.native
  def isTypeCastExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ Boolean = js.native
  def isTypeCastExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ Boolean = js.native
  def isTypeParameter(): /* is @babel/types.@babel/types.TypeParameter */ Boolean = js.native
  def isTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ Boolean = js.native
  def isTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TypeParameter */ Boolean = js.native
  def isTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ Boolean = js.native
  def isTypeParameter(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ Boolean = js.native
  def isTypeParameterDeclaration(): /* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean = js.native
  def isTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean = js.native
  def isTypeParameterDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ Boolean = js.native
  def isTypeParameterInstantiation(): /* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean = js.native
  def isTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean = js.native
  def isTypeParameterInstantiation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ Boolean = js.native
  def isTypeofTypeAnnotation(): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean = js.native
  def isTypeofTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean = js.native
  def isTypeofTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ Boolean = js.native
  def isUnaryExpression(): /* is @babel/types.@babel/types.UnaryExpression */ Boolean = js.native
  def isUnaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ Boolean = js.native
  def isUnaryExpression(node: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ Boolean = js.native
  def isUnaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ Boolean = js.native
  def isUnaryExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ Boolean = js.native
  def isUnaryLike(): /* is @babel/types.@babel/types.UnaryLike */ Boolean = js.native
  def isUnaryLike(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ Boolean = js.native
  def isUnaryLike(node: js.Object): /* is @babel/types.@babel/types.UnaryLike */ Boolean = js.native
  def isUnaryLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ Boolean = js.native
  def isUnaryLike(node: Null, opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ Boolean = js.native
  def isUnionTypeAnnotation(): /* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean = js.native
  def isUnionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean = js.native
  def isUnionTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ Boolean = js.native
  def isUpdateExpression(): /* is @babel/types.@babel/types.UpdateExpression */ Boolean = js.native
  def isUpdateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ Boolean = js.native
  def isUpdateExpression(node: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ Boolean = js.native
  def isUpdateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ Boolean = js.native
  def isUpdateExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ Boolean = js.native
  def isUserWhitespacable(): /* is @babel/types.@babel/types.UserWhitespacable */ Boolean = js.native
  def isUserWhitespacable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ Boolean = js.native
  def isUserWhitespacable(node: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ Boolean = js.native
  def isUserWhitespacable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ Boolean = js.native
  def isUserWhitespacable(node: Null, opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ Boolean = js.native
  def isVariableDeclaration(): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = js.native
  def isVariableDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = js.native
  def isVariableDeclaration(node: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = js.native
  def isVariableDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = js.native
  def isVariableDeclaration(node: Null, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ Boolean = js.native
  def isVariableDeclarator(): /* is @babel/types.@babel/types.VariableDeclarator */ Boolean = js.native
  def isVariableDeclarator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ Boolean = js.native
  def isVariableDeclarator(node: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ Boolean = js.native
  def isVariableDeclarator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ Boolean = js.native
  def isVariableDeclarator(node: Null, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ Boolean = js.native
  def isVariance(): /* is @babel/types.@babel/types.Variance */ Boolean = js.native
  def isVariance(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Variance */ Boolean = js.native
  def isVariance(node: js.Object): /* is @babel/types.@babel/types.Variance */ Boolean = js.native
  def isVariance(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Variance */ Boolean = js.native
  def isVariance(node: Null, opts: js.Object): /* is @babel/types.@babel/types.Variance */ Boolean = js.native
  def isVoidTypeAnnotation(): /* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean = js.native
  def isVoidTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean = js.native
  def isVoidTypeAnnotation(node: Null, opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ Boolean = js.native
  def isWhile(): /* is @babel/types.@babel/types.While */ Boolean = js.native
  def isWhile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.While */ Boolean = js.native
  def isWhile(node: js.Object): /* is @babel/types.@babel/types.While */ Boolean = js.native
  def isWhile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.While */ Boolean = js.native
  def isWhile(node: Null, opts: js.Object): /* is @babel/types.@babel/types.While */ Boolean = js.native
  def isWhileStatement(): /* is @babel/types.@babel/types.WhileStatement */ Boolean = js.native
  def isWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ Boolean = js.native
  def isWhileStatement(node: js.Object): /* is @babel/types.@babel/types.WhileStatement */ Boolean = js.native
  def isWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ Boolean = js.native
  def isWhileStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ Boolean = js.native
  def isWithStatement(): /* is @babel/types.@babel/types.WithStatement */ Boolean = js.native
  def isWithStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ Boolean = js.native
  def isWithStatement(node: js.Object): /* is @babel/types.@babel/types.WithStatement */ Boolean = js.native
  def isWithStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ Boolean = js.native
  def isWithStatement(node: Null, opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ Boolean = js.native
  def isYieldExpression(): /* is @babel/types.@babel/types.YieldExpression */ Boolean = js.native
  def isYieldExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ Boolean = js.native
  def isYieldExpression(node: js.Object): /* is @babel/types.@babel/types.YieldExpression */ Boolean = js.native
  def isYieldExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ Boolean = js.native
  def isYieldExpression(node: Null, opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ Boolean = js.native
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
    closingElement: js.UndefOr[scala.Nothing],
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    selfClosing: js.Any
  ): JSXElement = js.native
  def jsxElement(
    openingElement: JSXOpeningElement,
    closingElement: Null,
    children: js.Array[JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | JSXFragment],
    selfClosing: js.Any
  ): JSXElement = js.native
  def jsxElement(
    openingElement: JSXOpeningElement,
    closingElement: JSXClosingElement,
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
  def jsxIdentifier(name: String): JSXIdentifier = js.native
  def jsxMemberExpression(`object`: JSXIdentifier, property: JSXIdentifier): JSXMemberExpression = js.native
  def jsxMemberExpression(`object`: JSXMemberExpression, property: JSXIdentifier): JSXMemberExpression = js.native
  def jsxNamespacedName(namespace: JSXIdentifier, name: JSXIdentifier): JSXNamespacedName = js.native
  def jsxOpeningElement(name: JSXIdentifier, attributes: js.Array[JSXAttribute | JSXSpreadAttribute]): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXIdentifier, attributes: js.Array[JSXAttribute | JSXSpreadAttribute], selfClosing: Boolean): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXIdentifier,
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    selfClosing: Boolean,
    typeParameters: TSTypeParameterInstantiation
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXIdentifier,
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    selfClosing: Boolean,
    typeParameters: TypeParameterInstantiation
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(name: JSXMemberExpression, attributes: js.Array[JSXAttribute | JSXSpreadAttribute]): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXMemberExpression,
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    selfClosing: Boolean
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXMemberExpression,
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    selfClosing: Boolean,
    typeParameters: TSTypeParameterInstantiation
  ): JSXOpeningElement = js.native
  def jsxOpeningElement(
    name: JSXMemberExpression,
    attributes: js.Array[JSXAttribute | JSXSpreadAttribute],
    selfClosing: Boolean,
    typeParameters: TypeParameterInstantiation
  ): JSXOpeningElement = js.native
  def jsxOpeningFragment(): JSXOpeningFragment = js.native
  def jsxSpreadAttribute(argument: Expression): JSXSpreadAttribute = js.native
  def jsxSpreadChild(expression: Expression): JSXSpreadChild = js.native
  def jsxText(value: String): JSXText = js.native
  def labeledStatement(label: Identifier, body: Statement): LabeledStatement = js.native
  def logicalExpression(operator: `&&`, left: Expression, right: Expression): LogicalExpression = js.native
  def logicalExpression(operator: `??`, left: Expression, right: Expression): LogicalExpression = js.native
  def logicalExpression(operator: `||`, left: Expression, right: Expression): LogicalExpression = js.native
  def memberExpression(`object`: Expression, property: js.Any): MemberExpression = js.native
  def memberExpression(`object`: Expression, property: js.Any, computed: Boolean): MemberExpression = js.native
  @JSName("memberExpression")
  def memberExpression_false(`object`: Expression, property: js.Any, computed: Boolean, optional: `false`): MemberExpression = js.native
  @JSName("memberExpression")
  def memberExpression_true(`object`: Expression, property: js.Any, computed: Boolean, optional: `true`): MemberExpression = js.native
  def metaProperty(meta: Identifier, property: Identifier): MetaProperty = js.native
  def mixedTypeAnnotation(): MixedTypeAnnotation = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement]
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: Null,
    typeArguments: Null,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: Null,
    typeArguments: TypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: Null,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: `false`
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: `false`,
    typeArguments: Null,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: `false`,
    typeArguments: TypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: `false`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: `true`
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: `true`,
    typeArguments: Null,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: `true`,
    typeArguments: TypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: `true`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  def noop(): Noop = js.native
  def nullLiteral(): NullLiteral = js.native
  def nullLiteralTypeAnnotation(): NullLiteralTypeAnnotation = js.native
  def nullableTypeAnnotation(typeAnnotation: FlowType): NullableTypeAnnotation = js.native
  def numberLiteralTypeAnnotation(value: Double): NumberLiteralTypeAnnotation = js.native
  def numberTypeAnnotation(): NumberTypeAnnotation = js.native
  def numericLiteral(value: Double): NumericLiteral = js.native
  def objectExpression(properties: js.Array[ObjectMethod | ObjectProperty | SpreadElement]): ObjectExpression = js.native
  def objectMethod(
    kind: js.UndefOr[method | get | set],
    key: js.Any,
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    computed: js.UndefOr[Boolean],
    async: js.UndefOr[Boolean],
    decorators: js.UndefOr[js.Array[Decorator] | Null],
    generator: js.UndefOr[Boolean],
    returnType: js.UndefOr[TypeAnnotation | TSTypeAnnotation | Noop | Null],
    typeParameters: js.UndefOr[TypeParameterDeclaration | TSTypeParameterDeclaration | Noop | Null]
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
  def objectPattern(properties: js.Array[RestElement | ObjectProperty], decorators: Null, typeAnnotation: Noop): ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: Null,
    typeAnnotation: TSTypeAnnotation
  ): ObjectPattern = js.native
  def objectPattern(
    properties: js.Array[RestElement | ObjectProperty],
    decorators: Null,
    typeAnnotation: TypeAnnotation
  ): ObjectPattern = js.native
  def objectProperty(key: js.Any, value: Expression): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: Expression, computed: Boolean): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: Expression, computed: Boolean, shorthand: Boolean): ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: Expression,
    computed: Boolean,
    shorthand: Boolean,
    decorators: js.Array[Decorator]
  ): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: PatternLike): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: PatternLike, computed: Boolean): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: PatternLike, computed: Boolean, shorthand: Boolean): ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: PatternLike,
    computed: Boolean,
    shorthand: Boolean,
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
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: Null,
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: Null,
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: Null,
    internalSlots: Null,
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: js.Array[ObjectTypeIndexer],
    callProperties: Null,
    internalSlots: Null,
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: Null,
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: js.Array[ObjectTypeCallProperty],
    internalSlots: Null,
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot]
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: Null,
    internalSlots: js.Array[ObjectTypeInternalSlot],
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: Null,
    internalSlots: Null,
    exact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeAnnotation(
    properties: js.Array[ObjectTypeProperty | ObjectTypeSpreadProperty],
    indexers: Null,
    callProperties: Null,
    internalSlots: Null,
    exact: Boolean,
    inexact: Boolean
  ): ObjectTypeAnnotation = js.native
  def objectTypeCallProperty(value: FlowType): ObjectTypeCallProperty = js.native
  def objectTypeCallProperty(value: FlowType, _static: Boolean): ObjectTypeCallProperty = js.native
  def objectTypeIndexer(id: js.UndefOr[scala.Nothing], key: FlowType, value: FlowType): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: js.UndefOr[scala.Nothing], key: FlowType, value: FlowType, variance: Null, _static: Boolean): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: js.UndefOr[scala.Nothing], key: FlowType, value: FlowType, variance: Variance): ObjectTypeIndexer = js.native
  def objectTypeIndexer(
    id: js.UndefOr[scala.Nothing],
    key: FlowType,
    value: FlowType,
    variance: Variance,
    _static: Boolean
  ): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Null, key: FlowType, value: FlowType): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Null, key: FlowType, value: FlowType, variance: Null, _static: Boolean): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Null, key: FlowType, value: FlowType, variance: Variance): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Null, key: FlowType, value: FlowType, variance: Variance, _static: Boolean): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType, variance: Null, _static: Boolean): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType, variance: Variance): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType, variance: Variance, _static: Boolean): ObjectTypeIndexer = js.native
  def objectTypeInternalSlot(id: Identifier, value: FlowType, optional: Boolean, _static: Boolean, method: Boolean): ObjectTypeInternalSlot = js.native
  def objectTypeProperty(key: Identifier | StringLiteral, value: FlowType): ObjectTypeProperty = js.native
  def objectTypeProperty(key: Identifier | StringLiteral, value: FlowType, variance: Variance): ObjectTypeProperty = js.native
  def objectTypeProperty(key: Identifier | StringLiteral, value: FlowType, variance: Variance, kind: init | get | set): ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: Identifier | StringLiteral,
    value: FlowType,
    variance: Variance,
    kind: init | get | set,
    optional: Boolean
  ): ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: Identifier | StringLiteral,
    value: FlowType,
    variance: Variance,
    kind: init | get | set,
    optional: Boolean,
    proto: Boolean
  ): ObjectTypeProperty = js.native
  def objectTypeProperty(
    key: Identifier | StringLiteral,
    value: FlowType,
    variance: Variance,
    kind: init | get | set,
    optional: Boolean,
    proto: Boolean,
    _static: Boolean
  ): ObjectTypeProperty = js.native
  def objectTypeSpreadProperty(argument: FlowType): ObjectTypeSpreadProperty = js.native
  def opaqueType(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], supertype: Null, impltype: FlowType): OpaqueType = js.native
  def opaqueType(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], supertype: FlowType, impltype: FlowType): OpaqueType = js.native
  def opaqueType(id: Identifier, typeParameters: Null, supertype: js.UndefOr[scala.Nothing], impltype: FlowType): OpaqueType = js.native
  def opaqueType(id: Identifier, typeParameters: Null, supertype: Null, impltype: FlowType): OpaqueType = js.native
  def opaqueType(id: Identifier, typeParameters: Null, supertype: FlowType, impltype: FlowType): OpaqueType = js.native
  def opaqueType(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    supertype: js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(id: Identifier, typeParameters: TypeParameterDeclaration, supertype: Null, impltype: FlowType): OpaqueType = js.native
  def opaqueType(id: Identifier, typeParameters: TypeParameterDeclaration, supertype: FlowType, impltype: FlowType): OpaqueType = js.native
  def optionalCallExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: Boolean
  ): OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: Boolean,
    typeArguments: Null,
    typeParameters: TSTypeParameterInstantiation
  ): OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: Expression,
    _arguments: js.Array[Expression | JSXNamespacedName | SpreadElement],
    optional: Boolean,
    typeArguments: TypeParameterInstantiation
  ): OptionalCallExpression = js.native
  def optionalCallExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName],
    optional: Boolean,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): OptionalCallExpression = js.native
  def optionalMemberExpression(`object`: Expression, property: js.Any, computed: js.UndefOr[scala.Nothing], optional: Boolean): OptionalMemberExpression = js.native
  def optionalMemberExpression(`object`: Expression, property: js.Any, computed: Boolean, optional: Boolean): OptionalMemberExpression = js.native
  def parenthesizedExpression(expression: Expression): ParenthesizedExpression = js.native
  def pipelineBareFunction(callee: Expression): PipelineBareFunction = js.native
  def pipelinePrimaryTopicReference(): PipelinePrimaryTopicReference = js.native
  def pipelineTopicExpression(expression: Expression): PipelineTopicExpression = js.native
  @JSName("placeholder")
  def placeholder_BlockStatement(expectedNode: typings.atBabelTypes.atBabelTypesStrings.BlockStatement, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_ClassBody(expectedNode: typings.atBabelTypes.atBabelTypesStrings.ClassBody, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Declaration(expectedNode: typings.atBabelTypes.atBabelTypesStrings.Declaration, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Expression(expectedNode: typings.atBabelTypes.atBabelTypesStrings.Expression, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Identifier(expectedNode: typings.atBabelTypes.atBabelTypesStrings.Identifier, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Pattern(expectedNode: typings.atBabelTypes.atBabelTypesStrings.Pattern, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Statement(expectedNode: typings.atBabelTypes.atBabelTypesStrings.Statement, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_StringLiteral(expectedNode: typings.atBabelTypes.atBabelTypesStrings.StringLiteral, name: Identifier): Placeholder = js.native
  def privateName(id: Identifier): PrivateName = js.native
  def program(body: js.Array[Statement]): Program = js.native
  def program(body: js.Array[Statement], directives: js.Array[Directive]): Program = js.native
  @JSName("program")
  def program_module(body: js.Array[Statement], directives: js.Array[Directive], sourceType: module): Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: module,
    interpreter: Null,
    sourceFile: String
  ): Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: module,
    interpreter: InterpreterDirective
  ): Program = js.native
  @JSName("program")
  def program_module(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: module,
    interpreter: InterpreterDirective,
    sourceFile: String
  ): Program = js.native
  @JSName("program")
  def program_script(body: js.Array[Statement], directives: js.Array[Directive], sourceType: script): Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: script,
    interpreter: Null,
    sourceFile: String
  ): Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: script,
    interpreter: InterpreterDirective
  ): Program = js.native
  @JSName("program")
  def program_script(
    body: js.Array[Statement],
    directives: js.Array[Directive],
    sourceType: script,
    interpreter: InterpreterDirective,
    sourceFile: String
  ): Program = js.native
  def qualifiedTypeIdentifier(id: Identifier, qualification: Identifier): QualifiedTypeIdentifier = js.native
  def qualifiedTypeIdentifier(id: Identifier, qualification: QualifiedTypeIdentifier): QualifiedTypeIdentifier = js.native
  def regExpLiteral(pattern: String): RegExpLiteral = js.native
  def regExpLiteral(pattern: String, flags: String): RegExpLiteral = js.native
  def removeProperties(n: Node): Unit = js.native
  def removeProperties(n: Node, opts: Anon_PreserveComments): Unit = js.native
  def removePropertiesDeep[T /* <: Node */](n: T): T = js.native
  def removePropertiesDeep[T /* <: Node */](n: T, opts: Anon_PreserveComments): T = js.native
  def restElement(argument: LVal): RestElement = js.native
  def restElement(argument: LVal, decorators: js.Array[Decorator]): RestElement = js.native
  def restElement(argument: LVal, decorators: js.Array[Decorator], typeAnnotation: Noop): RestElement = js.native
  def restElement(argument: LVal, decorators: js.Array[Decorator], typeAnnotation: TSTypeAnnotation): RestElement = js.native
  def restElement(argument: LVal, decorators: js.Array[Decorator], typeAnnotation: TypeAnnotation): RestElement = js.native
  def restElement(argument: LVal, decorators: Null, typeAnnotation: Noop): RestElement = js.native
  def restElement(argument: LVal, decorators: Null, typeAnnotation: TSTypeAnnotation): RestElement = js.native
  def restElement(argument: LVal, decorators: Null, typeAnnotation: TypeAnnotation): RestElement = js.native
  def returnStatement(): ReturnStatement = js.native
  def returnStatement(argument: Expression): ReturnStatement = js.native
  def sequenceExpression(expressions: js.Array[Expression]): SequenceExpression = js.native
  def spreadElement(argument: Expression): SpreadElement = js.native
  def stringLiteral(value: String): StringLiteral = js.native
  def stringLiteralTypeAnnotation(value: String): StringLiteralTypeAnnotation = js.native
  def stringTypeAnnotation(): StringTypeAnnotation = js.native
  def switchCase(test: js.UndefOr[scala.Nothing], consequent: js.Array[Statement]): SwitchCase = js.native
  def switchCase(test: Null, consequent: js.Array[Statement]): SwitchCase = js.native
  def switchCase(test: Expression, consequent: js.Array[Statement]): SwitchCase = js.native
  def switchStatement(discriminant: Expression, cases: js.Array[SwitchCase]): SwitchStatement = js.native
  def taggedTemplateExpression(tag: Expression, quasi: TemplateLiteral): TaggedTemplateExpression = js.native
  def taggedTemplateExpression(tag: Expression, quasi: TemplateLiteral, typeParameters: TSTypeParameterInstantiation): TaggedTemplateExpression = js.native
  def taggedTemplateExpression(tag: Expression, quasi: TemplateLiteral, typeParameters: TypeParameterInstantiation): TaggedTemplateExpression = js.native
  def templateElement(value: Anon_Cooked): TemplateElement = js.native
  def templateElement(value: Anon_Cooked, tail: Boolean): TemplateElement = js.native
  def templateLiteral(quasis: js.Array[TemplateElement], expressions: js.Array[Expression]): TemplateLiteral = js.native
  def thisExpression(): ThisExpression = js.native
  def thisTypeAnnotation(): ThisTypeAnnotation = js.native
  def throwStatement(argument: Expression): ThrowStatement = js.native
  def traverse[T](n: Node, h: TraversalHandler[T]): Unit = js.native
  def traverse[T](n: Node, h: TraversalHandlers[T]): Unit = js.native
  def traverse[T](n: Node, h: TraversalHandlers[T], state: T): Unit = js.native
  def traverse[T](n: Node, h: TraversalHandler[T], state: T): Unit = js.native
  def tryStatement(block: BlockStatement): TryStatement = js.native
  def tryStatement(block: BlockStatement, handler: Null, finalizer: BlockStatement): TryStatement = js.native
  def tryStatement(block: BlockStatement, handler: CatchClause): TryStatement = js.native
  def tryStatement(block: BlockStatement, handler: CatchClause, finalizer: BlockStatement): TryStatement = js.native
  def tsAnyKeyword(): TSAnyKeyword = js.native
  def tsArrayType(elementType: TSType): TSArrayType = js.native
  def tsAsExpression(expression: Expression, typeAnnotation: TSType): TSAsExpression = js.native
  def tsBooleanKeyword(): TSBooleanKeyword = js.native
  def tsCallSignatureDeclaration(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier | RestElement]): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(typeParameters: Null, parameters: js.Array[Identifier | RestElement]): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: Null,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(typeParameters: TSTypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  def tsConditionalType(checkType: TSType, extendsType: TSType, trueType: TSType, falseType: TSType): TSConditionalType = js.native
  def tsConstructSignatureDeclaration(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier | RestElement]): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(typeParameters: Null, parameters: js.Array[Identifier | RestElement]): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: Null,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(typeParameters: TSTypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructSignatureDeclaration = js.native
  def tsConstructorType(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier | RestElement]): TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructorType = js.native
  def tsConstructorType(typeParameters: Null, parameters: js.Array[Identifier | RestElement]): TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: Null,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructorType = js.native
  def tsConstructorType(typeParameters: TSTypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructorType = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop,
    async: Boolean
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop,
    async: Boolean,
    declare: Boolean
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop,
    async: Boolean,
    declare: Boolean,
    generator: Boolean
  ): TSDeclareFunction = js.native
  def tsDeclareMethod(
    decorators: js.UndefOr[js.Array[Decorator] | Null],
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: js.UndefOr[TSTypeAnnotation | Noop | Null],
    `abstract`: js.UndefOr[Boolean | Null],
    access: js.UndefOr[public | `private` | `protected` | Null],
    accessibility: js.UndefOr[public | `private` | `protected` | Null],
    async: js.UndefOr[Boolean],
    computed: js.UndefOr[Boolean],
    generator: js.UndefOr[Boolean],
    kind: js.UndefOr[get | set | method | constructor],
    optional: js.UndefOr[Boolean | Null],
    _static: js.UndefOr[Boolean | Null]
  ): TSDeclareMethod = js.native
  def tsEnumDeclaration(id: Identifier, members: js.Array[TSEnumMember]): TSEnumDeclaration = js.native
  def tsEnumDeclaration(id: Identifier, members: js.Array[TSEnumMember], _const: Boolean): TSEnumDeclaration = js.native
  def tsEnumDeclaration(id: Identifier, members: js.Array[TSEnumMember], _const: Boolean, declare: Boolean): TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: Boolean,
    declare: Boolean,
    initializer: Expression
  ): TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: Boolean,
    declare: Null,
    initializer: Expression
  ): TSEnumDeclaration = js.native
  def tsEnumDeclaration(id: Identifier, members: js.Array[TSEnumMember], _const: Null, declare: Boolean): TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: Null,
    declare: Boolean,
    initializer: Expression
  ): TSEnumDeclaration = js.native
  def tsEnumDeclaration(
    id: Identifier,
    members: js.Array[TSEnumMember],
    _const: Null,
    declare: Null,
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
  def tsFunctionType(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier | RestElement]): TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSFunctionType = js.native
  def tsFunctionType(typeParameters: Null, parameters: js.Array[Identifier | RestElement]): TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: Null,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSFunctionType = js.native
  def tsFunctionType(typeParameters: TSTypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSFunctionType = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSEntityName): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSEntityName, isExport: Boolean): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSExternalModuleReference): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSExternalModuleReference, isExport: Boolean): TSImportEqualsDeclaration = js.native
  def tsImportType(argument: StringLiteral): TSImportType = js.native
  def tsImportType(argument: StringLiteral, qualifier: Null, typeParameters: TSTypeParameterInstantiation): TSImportType = js.native
  def tsImportType(argument: StringLiteral, qualifier: TSEntityName): TSImportType = js.native
  def tsImportType(argument: StringLiteral, qualifier: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSImportType = js.native
  def tsIndexSignature(parameters: js.Array[Identifier]): TSIndexSignature = js.native
  def tsIndexSignature(parameters: js.Array[Identifier], typeAnnotation: Null, readonly: Boolean): TSIndexSignature = js.native
  def tsIndexSignature(parameters: js.Array[Identifier], typeAnnotation: TSTypeAnnotation): TSIndexSignature = js.native
  def tsIndexSignature(parameters: js.Array[Identifier], typeAnnotation: TSTypeAnnotation, readonly: Boolean): TSIndexSignature = js.native
  def tsIndexedAccessType(objectType: TSType, indexType: TSType): TSIndexedAccessType = js.native
  def tsInferType(typeParameter: TSTypeParameter): TSInferType = js.native
  def tsInterfaceBody(body: js.Array[TSTypeElement]): TSInterfaceBody = js.native
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
    declare: Boolean
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
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], _extends: Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    _extends: Null,
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(id: Identifier, typeParameters: Null, _extends: js.UndefOr[scala.Nothing], body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: Null,
    _extends: js.UndefOr[scala.Nothing],
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: Null,
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: Null,
    _extends: js.Array[TSExpressionWithTypeArguments],
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(id: Identifier, typeParameters: Null, _extends: Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(id: Identifier, typeParameters: Null, _extends: Null, body: TSInterfaceBody, declare: Boolean): TSInterfaceDeclaration = js.native
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
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
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
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(id: Identifier, typeParameters: TSTypeParameterDeclaration, _extends: Null, body: TSInterfaceBody): TSInterfaceDeclaration = js.native
  def tsInterfaceDeclaration(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    _extends: Null,
    body: TSInterfaceBody,
    declare: Boolean
  ): TSInterfaceDeclaration = js.native
  def tsIntersectionType(types: js.Array[TSType]): TSIntersectionType = js.native
  def tsLiteralType(literal: BooleanLiteral): TSLiteralType = js.native
  def tsLiteralType(literal: NumericLiteral): TSLiteralType = js.native
  def tsLiteralType(literal: StringLiteral): TSLiteralType = js.native
  def tsMappedType(typeParameter: TSTypeParameter): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameter, typeAnnotation: Null, optional: Boolean): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameter, typeAnnotation: Null, optional: Boolean, readonly: Boolean): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameter, typeAnnotation: Null, optional: Null, readonly: Boolean): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameter, typeAnnotation: TSType): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameter, typeAnnotation: TSType, optional: Boolean): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameter, typeAnnotation: TSType, optional: Boolean, readonly: Boolean): TSMappedType = js.native
  def tsMappedType(typeParameter: TSTypeParameter, typeAnnotation: TSType, optional: Null, readonly: Boolean): TSMappedType = js.native
  def tsMethodSignature(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Null],
    parameters: js.Array[Identifier | RestElement]
  ): TSMethodSignature = js.native
  def tsMethodSignature(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Null],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
  def tsMethodSignature(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Null],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation,
    computed: Boolean
  ): TSMethodSignature = js.native
  def tsMethodSignature(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Null],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation,
    computed: Boolean,
    optional: Boolean
  ): TSMethodSignature = js.native
  def tsModuleBlock(body: js.Array[Statement]): TSModuleBlock = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleBlock): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleBlock, declare: Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleBlock, declare: Boolean, global: Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleBlock, declare: Null, global: Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleDeclaration, declare: Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleDeclaration, declare: Boolean, global: Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: Identifier, body: TSModuleDeclaration, declare: Null, global: Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleBlock): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleBlock, declare: Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleBlock, declare: Boolean, global: Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleBlock, declare: Null, global: Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleDeclaration): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleDeclaration, declare: Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleDeclaration, declare: Boolean, global: Boolean): TSModuleDeclaration = js.native
  def tsModuleDeclaration(id: StringLiteral, body: TSModuleDeclaration, declare: Null, global: Boolean): TSModuleDeclaration = js.native
  def tsNamespaceExportDeclaration(id: Identifier): TSNamespaceExportDeclaration = js.native
  def tsNeverKeyword(): TSNeverKeyword = js.native
  def tsNonNullExpression(expression: Expression): TSNonNullExpression = js.native
  def tsNullKeyword(): TSNullKeyword = js.native
  def tsNumberKeyword(): TSNumberKeyword = js.native
  def tsObjectKeyword(): TSObjectKeyword = js.native
  def tsOptionalType(typeAnnotation: TSType): TSOptionalType = js.native
  def tsParameterProperty(parameter: AssignmentPattern): TSParameterProperty = js.native
  def tsParameterProperty(parameter: AssignmentPattern, accessibility: Null, readonly: Boolean): TSParameterProperty = js.native
  def tsParameterProperty(parameter: Identifier): TSParameterProperty = js.native
  def tsParameterProperty(parameter: Identifier, accessibility: Null, readonly: Boolean): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(parameter: AssignmentPattern, accessibility: `private`): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(parameter: AssignmentPattern, accessibility: `private`, readonly: Boolean): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(parameter: Identifier, accessibility: `private`): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_private(parameter: Identifier, accessibility: `private`, readonly: Boolean): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(parameter: AssignmentPattern, accessibility: `protected`): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(parameter: AssignmentPattern, accessibility: `protected`, readonly: Boolean): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(parameter: Identifier, accessibility: `protected`): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_protected(parameter: Identifier, accessibility: `protected`, readonly: Boolean): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(parameter: AssignmentPattern, accessibility: public): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(parameter: AssignmentPattern, accessibility: public, readonly: Boolean): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(parameter: Identifier, accessibility: public): TSParameterProperty = js.native
  @JSName("tsParameterProperty")
  def tsParameterProperty_public(parameter: Identifier, accessibility: public, readonly: Boolean): TSParameterProperty = js.native
  def tsParenthesizedType(typeAnnotation: TSType): TSParenthesizedType = js.native
  def tsPropertySignature(key: Expression): TSPropertySignature = js.native
  def tsPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation): TSPropertySignature = js.native
  def tsPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression): TSPropertySignature = js.native
  def tsPropertySignature(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression, computed: Boolean): TSPropertySignature = js.native
  def tsPropertySignature(
    key: Expression,
    typeAnnotation: TSTypeAnnotation,
    initializer: Expression,
    computed: Boolean,
    optional: Boolean
  ): TSPropertySignature = js.native
  def tsPropertySignature(
    key: Expression,
    typeAnnotation: TSTypeAnnotation,
    initializer: Expression,
    computed: Boolean,
    optional: Boolean,
    readonly: Boolean
  ): TSPropertySignature = js.native
  def tsQualifiedName(left: TSEntityName, right: Identifier): TSQualifiedName = js.native
  def tsRestType(typeAnnotation: TSType): TSRestType = js.native
  def tsStringKeyword(): TSStringKeyword = js.native
  def tsSymbolKeyword(): TSSymbolKeyword = js.native
  def tsThisType(): TSThisType = js.native
  def tsTupleType(elementTypes: js.Array[TSType]): TSTupleType = js.native
  def tsTypeAliasDeclaration(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    typeAnnotation: TSType,
    declare: Boolean
  ): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(id: Identifier, typeParameters: Null, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(id: Identifier, typeParameters: Null, typeAnnotation: TSType, declare: Boolean): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(id: Identifier, typeParameters: TSTypeParameterDeclaration, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
    typeAnnotation: TSType,
    declare: Boolean
  ): TSTypeAliasDeclaration = js.native
  def tsTypeAnnotation(typeAnnotation: TSType): TSTypeAnnotation = js.native
  def tsTypeAssertion(typeAnnotation: TSType, expression: Expression): TSTypeAssertion = js.native
  def tsTypeLiteral(members: js.Array[TSTypeElement]): TSTypeLiteral = js.native
  def tsTypeOperator(typeAnnotation: TSType): TSTypeOperator = js.native
  def tsTypeOperator(typeAnnotation: TSType, operator: String): TSTypeOperator = js.native
  def tsTypeParameter(): TSTypeParameter = js.native
  def tsTypeParameter(constraint: Null, _default: Null, name: String): TSTypeParameter = js.native
  def tsTypeParameter(constraint: Null, _default: TSType): TSTypeParameter = js.native
  def tsTypeParameter(constraint: Null, _default: TSType, name: String): TSTypeParameter = js.native
  def tsTypeParameter(constraint: TSType): TSTypeParameter = js.native
  def tsTypeParameter(constraint: TSType, _default: Null, name: String): TSTypeParameter = js.native
  def tsTypeParameter(constraint: TSType, _default: TSType): TSTypeParameter = js.native
  def tsTypeParameter(constraint: TSType, _default: TSType, name: String): TSTypeParameter = js.native
  def tsTypeParameterDeclaration(params: js.Array[TSTypeParameter]): TSTypeParameterDeclaration = js.native
  def tsTypeParameterInstantiation(params: js.Array[TSType]): TSTypeParameterInstantiation = js.native
  def tsTypePredicate(parameterName: Identifier, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
  def tsTypePredicate(parameterName: TSThisType, typeAnnotation: TSTypeAnnotation): TSTypePredicate = js.native
  def tsTypeQuery(exprName: TSEntityName): TSTypeQuery = js.native
  def tsTypeQuery(exprName: TSImportType): TSTypeQuery = js.native
  def tsTypeReference(typeName: TSEntityName): TSTypeReference = js.native
  def tsTypeReference(typeName: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSTypeReference = js.native
  def tsUndefinedKeyword(): TSUndefinedKeyword = js.native
  def tsUnionType(types: js.Array[TSType]): TSUnionType = js.native
  def tsUnknownKeyword(): TSUnknownKeyword = js.native
  def tsVoidKeyword(): TSVoidKeyword = js.native
  def tupleTypeAnnotation(types: js.Array[FlowType]): TupleTypeAnnotation = js.native
  def typeAlias(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], right: FlowType): TypeAlias = js.native
  def typeAlias(id: Identifier, typeParameters: Null, right: FlowType): TypeAlias = js.native
  def typeAlias(id: Identifier, typeParameters: TypeParameterDeclaration, right: FlowType): TypeAlias = js.native
  def typeAnnotation(typeAnnotation: FlowType): TypeAnnotation = js.native
  def typeCastExpression(expression: Expression, typeAnnotation: TypeAnnotation): TypeCastExpression = js.native
  def typeParameter(): TypeParameter = js.native
  def typeParameter(bound: Null, _default: Null, variance: Null, name: String): TypeParameter = js.native
  def typeParameter(bound: Null, _default: Null, variance: Variance): TypeParameter = js.native
  def typeParameter(bound: Null, _default: Null, variance: Variance, name: String): TypeParameter = js.native
  def typeParameter(bound: Null, _default: FlowType): TypeParameter = js.native
  def typeParameter(bound: Null, _default: FlowType, variance: Null, name: String): TypeParameter = js.native
  def typeParameter(bound: Null, _default: FlowType, variance: Variance): TypeParameter = js.native
  def typeParameter(bound: Null, _default: FlowType, variance: Variance, name: String): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: Null, variance: Null, name: String): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: Null, variance: Variance): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: Null, variance: Variance, name: String): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: FlowType): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: FlowType, variance: Null, name: String): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: FlowType, variance: Variance): TypeParameter = js.native
  def typeParameter(bound: TypeAnnotation, _default: FlowType, variance: Variance, name: String): TypeParameter = js.native
  def typeParameterDeclaration(params: js.Array[TypeParameter]): TypeParameterDeclaration = js.native
  def typeParameterInstantiation(params: js.Array[FlowType]): TypeParameterInstantiation = js.native
  def typeofTypeAnnotation(argument: FlowType): TypeofTypeAnnotation = js.native
  def unaryExpression(operator: `!`, argument: Expression): UnaryExpression = js.native
  def unaryExpression(operator: `!`, argument: Expression, prefix: Boolean): UnaryExpression = js.native
  def unaryExpression(operator: `+`, argument: Expression): UnaryExpression = js.native
  def unaryExpression(operator: `+`, argument: Expression, prefix: Boolean): UnaryExpression = js.native
  def unaryExpression(operator: `-`, argument: Expression): UnaryExpression = js.native
  def unaryExpression(operator: `-`, argument: Expression, prefix: Boolean): UnaryExpression = js.native
  def unaryExpression(operator: `~`, argument: Expression): UnaryExpression = js.native
  def unaryExpression(operator: `~`, argument: Expression, prefix: Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(operator: delete, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_delete(operator: delete, argument: Expression, prefix: Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_throw(operator: `throw`, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_throw(operator: `throw`, argument: Expression, prefix: Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(operator: typeof, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_typeof(operator: typeof, argument: Expression, prefix: Boolean): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(operator: void, argument: Expression): UnaryExpression = js.native
  @JSName("unaryExpression")
  def unaryExpression_void(operator: void, argument: Expression, prefix: Boolean): UnaryExpression = js.native
  def unionTypeAnnotation(types: js.Array[FlowType]): UnionTypeAnnotation = js.native
  def updateExpression(operator: `++`, argument: Expression): UpdateExpression = js.native
  def updateExpression(operator: `++`, argument: Expression, prefix: Boolean): UpdateExpression = js.native
  def updateExpression(operator: `--`, argument: Expression): UpdateExpression = js.native
  def updateExpression(operator: `--`, argument: Expression, prefix: Boolean): UpdateExpression = js.native
  def validate(n: Node, key: String, value: js.Any): Unit = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(kind: const, declarations: js.Array[VariableDeclarator]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_const(kind: const, declarations: js.Array[VariableDeclarator], declare: Boolean): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(kind: let, declarations: js.Array[VariableDeclarator]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_let(kind: let, declarations: js.Array[VariableDeclarator], declare: Boolean): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(kind: `var`, declarations: js.Array[VariableDeclarator]): VariableDeclaration = js.native
  @JSName("variableDeclaration")
  def variableDeclaration_var(kind: `var`, declarations: js.Array[VariableDeclarator], declare: Boolean): VariableDeclaration = js.native
  def variableDeclarator(id: LVal): VariableDeclarator = js.native
  def variableDeclarator(id: LVal, init: Null, definite: Boolean): VariableDeclarator = js.native
  def variableDeclarator(id: LVal, init: Expression): VariableDeclarator = js.native
  def variableDeclarator(id: LVal, init: Expression, definite: Boolean): VariableDeclarator = js.native
  @JSName("variance")
  def variance_minus(kind: minus): Variance = js.native
  @JSName("variance")
  def variance_plus(kind: plus): Variance = js.native
  def voidTypeAnnotation(): VoidTypeAnnotation = js.native
  def whileStatement(test: Expression, body: BlockStatement): WhileStatement = js.native
  def whileStatement(test: Expression, body: Statement): WhileStatement = js.native
  def withStatement(`object`: Expression, body: BlockStatement): WithStatement = js.native
  def withStatement(`object`: Expression, body: Statement): WithStatement = js.native
  def yieldExpression(): YieldExpression = js.native
  def yieldExpression(argument: Null, delegate: Boolean): YieldExpression = js.native
  def yieldExpression(argument: Expression): YieldExpression = js.native
  def yieldExpression(argument: Expression, delegate: Boolean): YieldExpression = js.native
}

