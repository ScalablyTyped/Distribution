package typings
package atBabelTypesLib.atBabelTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def anyTypeAnnotation(): AnyTypeAnnotation = js.native
  def argumentPlaceholder(): ArgumentPlaceholder = js.native
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
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: scala.Boolean
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: scala.Boolean,
    expression: scala.Boolean
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement | Expression,
    async: scala.Boolean,
    expression: scala.Boolean,
    generator: scala.Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): ArrowFunctionExpression = js.native
  def arrowFunctionExpression(
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
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
    operator: atBabelTypesLib.atBabelTypesLibStrings.`+` | atBabelTypesLib.atBabelTypesLibStrings.`-` | atBabelTypesLib.atBabelTypesLibStrings.`/` | atBabelTypesLib.atBabelTypesLibStrings.`%` | atBabelTypesLib.atBabelTypesLibStrings.`*` | atBabelTypesLib.atBabelTypesLibStrings.`**` | atBabelTypesLib.atBabelTypesLibStrings.`&` | atBabelTypesLib.atBabelTypesLibStrings.`|` | atBabelTypesLib.atBabelTypesLibStrings.`>>` | atBabelTypesLib.atBabelTypesLibStrings.`>>>` | atBabelTypesLib.atBabelTypesLibStrings.`<<` | atBabelTypesLib.atBabelTypesLibStrings.`_backtick^_backtick` | atBabelTypesLib.atBabelTypesLibStrings.`==` | atBabelTypesLib.atBabelTypesLibStrings.`===` | atBabelTypesLib.atBabelTypesLibStrings.`!=` | atBabelTypesLib.atBabelTypesLibStrings.`!==` | atBabelTypesLib.atBabelTypesLibStrings.in | atBabelTypesLib.atBabelTypesLibStrings.instanceof | atBabelTypesLib.atBabelTypesLibStrings.`>` | atBabelTypesLib.atBabelTypesLibStrings.`<` | atBabelTypesLib.atBabelTypesLibStrings.`>=` | atBabelTypesLib.atBabelTypesLibStrings.`<=`,
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
  def callExpression(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement]
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: scala.Null,
    typeArguments: TypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: scala.Null,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  def callExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: scala.Null,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: TypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_false(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: TypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  @JSName("callExpression")
  def callExpression_true(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): CallExpression = js.native
  def catchClause(param: js.UndefOr[scala.Nothing], body: BlockStatement): CatchClause = js.native
  def catchClause(param: Identifier, body: BlockStatement): CatchClause = js.native
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
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
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
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
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
  def clone(n: AnyTypeAnnotation): AnyTypeAnnotation = js.native
  def clone(n: ArgumentPlaceholder): ArgumentPlaceholder = js.native
  def clone(n: ArrayExpression): ArrayExpression = js.native
  def clone(n: ArrayPattern): ArrayPattern = js.native
  def clone(n: ArrayTypeAnnotation): ArrayTypeAnnotation = js.native
  def clone(n: ArrowFunctionExpression): ArrowFunctionExpression = js.native
  def clone(n: AssignmentExpression): AssignmentExpression = js.native
  def clone(n: AssignmentPattern): AssignmentPattern = js.native
  def clone(n: AwaitExpression): AwaitExpression = js.native
  def clone(n: BigIntLiteral): BigIntLiteral = js.native
  def clone(n: BinaryExpression): BinaryExpression = js.native
  def clone(n: BindExpression): BindExpression = js.native
  def clone(n: BlockStatement): BlockStatement = js.native
  def clone(n: BooleanLiteral): BooleanLiteral = js.native
  def clone(n: BooleanLiteralTypeAnnotation): BooleanLiteralTypeAnnotation = js.native
  def clone(n: BooleanTypeAnnotation): BooleanTypeAnnotation = js.native
  def clone(n: BreakStatement): BreakStatement = js.native
  def clone(n: CallExpression): CallExpression = js.native
  def clone(n: CatchClause): CatchClause = js.native
  def clone(n: ClassBody): ClassBody = js.native
  def clone(n: ClassDeclaration): ClassDeclaration = js.native
  def clone(n: ClassExpression): ClassExpression = js.native
  def clone(n: ClassImplements): ClassImplements = js.native
  def clone(n: ClassMethod): ClassMethod = js.native
  def clone(n: ClassPrivateMethod): ClassPrivateMethod = js.native
  def clone(n: ClassPrivateProperty): ClassPrivateProperty = js.native
  def clone(n: ClassProperty): ClassProperty = js.native
  def clone(n: ConditionalExpression): ConditionalExpression = js.native
  def clone(n: ContinueStatement): ContinueStatement = js.native
  def clone(n: DebuggerStatement): DebuggerStatement = js.native
  def clone(n: DeclareClass): DeclareClass = js.native
  def clone(n: DeclareExportAllDeclaration): DeclareExportAllDeclaration = js.native
  def clone(n: DeclareExportDeclaration): DeclareExportDeclaration = js.native
  def clone(n: DeclareFunction): DeclareFunction = js.native
  def clone(n: DeclareInterface): DeclareInterface = js.native
  def clone(n: DeclareModule): DeclareModule = js.native
  def clone(n: DeclareModuleExports): DeclareModuleExports = js.native
  def clone(n: DeclareOpaqueType): DeclareOpaqueType = js.native
  def clone(n: DeclareTypeAlias): DeclareTypeAlias = js.native
  def clone(n: DeclareVariable): DeclareVariable = js.native
  def clone(n: DeclaredPredicate): DeclaredPredicate = js.native
  def clone(n: Decorator): Decorator = js.native
  def clone(n: Directive): Directive = js.native
  def clone(n: DirectiveLiteral): DirectiveLiteral = js.native
  def clone(n: DoExpression): DoExpression = js.native
  def clone(n: DoWhileStatement): DoWhileStatement = js.native
  def clone(n: EmptyStatement): EmptyStatement = js.native
  def clone(n: EmptyTypeAnnotation): EmptyTypeAnnotation = js.native
  def clone(n: ExistsTypeAnnotation): ExistsTypeAnnotation = js.native
  def clone(n: ExportAllDeclaration): ExportAllDeclaration = js.native
  def clone(n: ExportDefaultDeclaration): ExportDefaultDeclaration = js.native
  def clone(n: ExportDefaultSpecifier): ExportDefaultSpecifier = js.native
  def clone(n: ExportNamedDeclaration): ExportNamedDeclaration = js.native
  def clone(n: ExportNamespaceSpecifier): ExportNamespaceSpecifier = js.native
  def clone(n: ExportSpecifier): ExportSpecifier = js.native
  def clone(n: ExpressionStatement): ExpressionStatement = js.native
  def clone(n: File): File = js.native
  def clone(n: ForInStatement): ForInStatement = js.native
  def clone(n: ForOfStatement): ForOfStatement = js.native
  def clone(n: ForStatement): ForStatement = js.native
  def clone(n: FunctionDeclaration): FunctionDeclaration = js.native
  def clone(n: FunctionExpression): FunctionExpression = js.native
  def clone(n: FunctionTypeAnnotation): FunctionTypeAnnotation = js.native
  def clone(n: FunctionTypeParam): FunctionTypeParam = js.native
  def clone(n: GenericTypeAnnotation): GenericTypeAnnotation = js.native
  def clone(n: Identifier): Identifier = js.native
  def clone(n: IfStatement): IfStatement = js.native
  def clone(n: Import): Import = js.native
  def clone(n: ImportDeclaration): ImportDeclaration = js.native
  def clone(n: ImportDefaultSpecifier): ImportDefaultSpecifier = js.native
  def clone(n: ImportNamespaceSpecifier): ImportNamespaceSpecifier = js.native
  def clone(n: ImportSpecifier): ImportSpecifier = js.native
  def clone(n: InferredPredicate): InferredPredicate = js.native
  def clone(n: InterfaceDeclaration): InterfaceDeclaration = js.native
  def clone(n: InterfaceExtends): InterfaceExtends = js.native
  def clone(n: InterfaceTypeAnnotation): InterfaceTypeAnnotation = js.native
  def clone(n: InterpreterDirective): InterpreterDirective = js.native
  def clone(n: IntersectionTypeAnnotation): IntersectionTypeAnnotation = js.native
  def clone(n: JSXAttribute): JSXAttribute = js.native
  def clone(n: JSXClosingElement): JSXClosingElement = js.native
  def clone(n: JSXClosingFragment): JSXClosingFragment = js.native
  def clone(n: JSXElement): JSXElement = js.native
  def clone(n: JSXEmptyExpression): JSXEmptyExpression = js.native
  def clone(n: JSXExpressionContainer): JSXExpressionContainer = js.native
  def clone(n: JSXFragment): JSXFragment = js.native
  def clone(n: JSXIdentifier): JSXIdentifier = js.native
  def clone(n: JSXMemberExpression): JSXMemberExpression = js.native
  def clone(n: JSXNamespacedName): JSXNamespacedName = js.native
  def clone(n: JSXOpeningElement): JSXOpeningElement = js.native
  def clone(n: JSXOpeningFragment): JSXOpeningFragment = js.native
  def clone(n: JSXSpreadAttribute): JSXSpreadAttribute = js.native
  def clone(n: JSXSpreadChild): JSXSpreadChild = js.native
  def clone(n: JSXText): JSXText = js.native
  def clone(n: LabeledStatement): LabeledStatement = js.native
  def clone(n: LogicalExpression): LogicalExpression = js.native
  def clone(n: MemberExpression): MemberExpression = js.native
  def clone(n: MetaProperty): MetaProperty = js.native
  def clone(n: MixedTypeAnnotation): MixedTypeAnnotation = js.native
  def clone(n: NewExpression): NewExpression = js.native
  def clone(n: Noop): Noop = js.native
  def clone(n: NullLiteral): NullLiteral = js.native
  def clone(n: NullLiteralTypeAnnotation): NullLiteralTypeAnnotation = js.native
  def clone(n: NullableTypeAnnotation): NullableTypeAnnotation = js.native
  def clone(n: NumberLiteralTypeAnnotation): NumberLiteralTypeAnnotation = js.native
  def clone(n: NumberTypeAnnotation): NumberTypeAnnotation = js.native
  def clone(n: NumericLiteral): NumericLiteral = js.native
  def clone(n: ObjectExpression): ObjectExpression = js.native
  def clone(n: ObjectMethod): ObjectMethod = js.native
  def clone(n: ObjectPattern): ObjectPattern = js.native
  def clone(n: ObjectProperty): ObjectProperty = js.native
  def clone(n: ObjectTypeAnnotation): ObjectTypeAnnotation = js.native
  def clone(n: ObjectTypeCallProperty): ObjectTypeCallProperty = js.native
  def clone(n: ObjectTypeIndexer): ObjectTypeIndexer = js.native
  def clone(n: ObjectTypeInternalSlot): ObjectTypeInternalSlot = js.native
  def clone(n: ObjectTypeProperty): ObjectTypeProperty = js.native
  def clone(n: ObjectTypeSpreadProperty): ObjectTypeSpreadProperty = js.native
  def clone(n: OpaqueType): OpaqueType = js.native
  def clone(n: OptionalCallExpression): OptionalCallExpression = js.native
  def clone(n: OptionalMemberExpression): OptionalMemberExpression = js.native
  def clone(n: ParenthesizedExpression): ParenthesizedExpression = js.native
  def clone(n: PipelineBareFunction): PipelineBareFunction = js.native
  def clone(n: PipelinePrimaryTopicReference): PipelinePrimaryTopicReference = js.native
  def clone(n: PipelineTopicExpression): PipelineTopicExpression = js.native
  def clone(n: Placeholder): Placeholder = js.native
  def clone(n: PrivateName): PrivateName = js.native
  def clone(n: Program): Program = js.native
  def clone(n: QualifiedTypeIdentifier): QualifiedTypeIdentifier = js.native
  def clone(n: RegExpLiteral): RegExpLiteral = js.native
  def clone(n: RestElement): RestElement = js.native
  def clone(n: ReturnStatement): ReturnStatement = js.native
  def clone(n: SequenceExpression): SequenceExpression = js.native
  def clone(n: SpreadElement): SpreadElement = js.native
  def clone(n: StringLiteral): StringLiteral = js.native
  def clone(n: StringLiteralTypeAnnotation): StringLiteralTypeAnnotation = js.native
  def clone(n: StringTypeAnnotation): StringTypeAnnotation = js.native
  def clone(n: Super): Super = js.native
  def clone(n: SwitchCase): SwitchCase = js.native
  def clone(n: SwitchStatement): SwitchStatement = js.native
  def clone(n: TSAnyKeyword): TSAnyKeyword = js.native
  def clone(n: TSArrayType): TSArrayType = js.native
  def clone(n: TSAsExpression): TSAsExpression = js.native
  def clone(n: TSBooleanKeyword): TSBooleanKeyword = js.native
  def clone(n: TSCallSignatureDeclaration): TSCallSignatureDeclaration = js.native
  def clone(n: TSConditionalType): TSConditionalType = js.native
  def clone(n: TSConstructSignatureDeclaration): TSConstructSignatureDeclaration = js.native
  def clone(n: TSConstructorType): TSConstructorType = js.native
  def clone(n: TSDeclareFunction): TSDeclareFunction = js.native
  def clone(n: TSDeclareMethod): TSDeclareMethod = js.native
  def clone(n: TSEnumDeclaration): TSEnumDeclaration = js.native
  def clone(n: TSEnumMember): TSEnumMember = js.native
  def clone(n: TSExportAssignment): TSExportAssignment = js.native
  def clone(n: TSExpressionWithTypeArguments): TSExpressionWithTypeArguments = js.native
  def clone(n: TSExternalModuleReference): TSExternalModuleReference = js.native
  def clone(n: TSFunctionType): TSFunctionType = js.native
  def clone(n: TSImportEqualsDeclaration): TSImportEqualsDeclaration = js.native
  def clone(n: TSImportType): TSImportType = js.native
  def clone(n: TSIndexSignature): TSIndexSignature = js.native
  def clone(n: TSIndexedAccessType): TSIndexedAccessType = js.native
  def clone(n: TSInferType): TSInferType = js.native
  def clone(n: TSInterfaceBody): TSInterfaceBody = js.native
  def clone(n: TSInterfaceDeclaration): TSInterfaceDeclaration = js.native
  def clone(n: TSIntersectionType): TSIntersectionType = js.native
  def clone(n: TSLiteralType): TSLiteralType = js.native
  def clone(n: TSMappedType): TSMappedType = js.native
  def clone(n: TSMethodSignature): TSMethodSignature = js.native
  def clone(n: TSModuleBlock): TSModuleBlock = js.native
  def clone(n: TSModuleDeclaration): TSModuleDeclaration = js.native
  def clone(n: TSNamespaceExportDeclaration): TSNamespaceExportDeclaration = js.native
  def clone(n: TSNeverKeyword): TSNeverKeyword = js.native
  def clone(n: TSNonNullExpression): TSNonNullExpression = js.native
  def clone(n: TSNullKeyword): TSNullKeyword = js.native
  def clone(n: TSNumberKeyword): TSNumberKeyword = js.native
  def clone(n: TSObjectKeyword): TSObjectKeyword = js.native
  def clone(n: TSOptionalType): TSOptionalType = js.native
  def clone(n: TSParameterProperty): TSParameterProperty = js.native
  def clone(n: TSParenthesizedType): TSParenthesizedType = js.native
  def clone(n: TSPropertySignature): TSPropertySignature = js.native
  def clone(n: TSQualifiedName): TSQualifiedName = js.native
  def clone(n: TSRestType): TSRestType = js.native
  def clone(n: TSStringKeyword): TSStringKeyword = js.native
  def clone(n: TSSymbolKeyword): TSSymbolKeyword = js.native
  def clone(n: TSThisType): TSThisType = js.native
  def clone(n: TSTupleType): TSTupleType = js.native
  def clone(n: TSTypeAliasDeclaration): TSTypeAliasDeclaration = js.native
  def clone(n: TSTypeAnnotation): TSTypeAnnotation = js.native
  def clone(n: TSTypeAssertion): TSTypeAssertion = js.native
  def clone(n: TSTypeLiteral): TSTypeLiteral = js.native
  def clone(n: TSTypeOperator): TSTypeOperator = js.native
  def clone(n: TSTypeParameter): TSTypeParameter = js.native
  def clone(n: TSTypeParameterDeclaration): TSTypeParameterDeclaration = js.native
  def clone(n: TSTypeParameterInstantiation): TSTypeParameterInstantiation = js.native
  def clone(n: TSTypePredicate): TSTypePredicate = js.native
  def clone(n: TSTypeQuery): TSTypeQuery = js.native
  def clone(n: TSTypeReference): TSTypeReference = js.native
  def clone(n: TSUndefinedKeyword): TSUndefinedKeyword = js.native
  def clone(n: TSUnionType): TSUnionType = js.native
  def clone(n: TSUnknownKeyword): TSUnknownKeyword = js.native
  def clone(n: TSVoidKeyword): TSVoidKeyword = js.native
  def clone(n: TaggedTemplateExpression): TaggedTemplateExpression = js.native
  def clone(n: TemplateElement): TemplateElement = js.native
  def clone(n: TemplateLiteral): TemplateLiteral = js.native
  def clone(n: ThisExpression): ThisExpression = js.native
  def clone(n: ThisTypeAnnotation): ThisTypeAnnotation = js.native
  def clone(n: ThrowStatement): ThrowStatement = js.native
  def clone(n: TryStatement): TryStatement = js.native
  def clone(n: TupleTypeAnnotation): TupleTypeAnnotation = js.native
  def clone(n: TypeAlias): TypeAlias = js.native
  def clone(n: TypeAnnotation): TypeAnnotation = js.native
  def clone(n: TypeCastExpression): TypeCastExpression = js.native
  def clone(n: TypeParameter): TypeParameter = js.native
  def clone(n: TypeParameterDeclaration): TypeParameterDeclaration = js.native
  def clone(n: TypeParameterInstantiation): TypeParameterInstantiation = js.native
  def clone(n: TypeofTypeAnnotation): TypeofTypeAnnotation = js.native
  def clone(n: UnaryExpression): UnaryExpression = js.native
  def clone(n: UnionTypeAnnotation): UnionTypeAnnotation = js.native
  def clone(n: UpdateExpression): UpdateExpression = js.native
  def clone(n: VariableDeclaration): VariableDeclaration = js.native
  def clone(n: VariableDeclarator): VariableDeclarator = js.native
  def clone(n: Variance): Variance = js.native
  def clone(n: VoidTypeAnnotation): VoidTypeAnnotation = js.native
  def clone(n: WhileStatement): WhileStatement = js.native
  def clone(n: WithStatement): WithStatement = js.native
  def clone(n: YieldExpression): YieldExpression = js.native
  def cloneDeep(n: AnyTypeAnnotation): AnyTypeAnnotation = js.native
  def cloneDeep(n: ArgumentPlaceholder): ArgumentPlaceholder = js.native
  def cloneDeep(n: ArrayExpression): ArrayExpression = js.native
  def cloneDeep(n: ArrayPattern): ArrayPattern = js.native
  def cloneDeep(n: ArrayTypeAnnotation): ArrayTypeAnnotation = js.native
  def cloneDeep(n: ArrowFunctionExpression): ArrowFunctionExpression = js.native
  def cloneDeep(n: AssignmentExpression): AssignmentExpression = js.native
  def cloneDeep(n: AssignmentPattern): AssignmentPattern = js.native
  def cloneDeep(n: AwaitExpression): AwaitExpression = js.native
  def cloneDeep(n: BigIntLiteral): BigIntLiteral = js.native
  def cloneDeep(n: BinaryExpression): BinaryExpression = js.native
  def cloneDeep(n: BindExpression): BindExpression = js.native
  def cloneDeep(n: BlockStatement): BlockStatement = js.native
  def cloneDeep(n: BooleanLiteral): BooleanLiteral = js.native
  def cloneDeep(n: BooleanLiteralTypeAnnotation): BooleanLiteralTypeAnnotation = js.native
  def cloneDeep(n: BooleanTypeAnnotation): BooleanTypeAnnotation = js.native
  def cloneDeep(n: BreakStatement): BreakStatement = js.native
  def cloneDeep(n: CallExpression): CallExpression = js.native
  def cloneDeep(n: CatchClause): CatchClause = js.native
  def cloneDeep(n: ClassBody): ClassBody = js.native
  def cloneDeep(n: ClassDeclaration): ClassDeclaration = js.native
  def cloneDeep(n: ClassExpression): ClassExpression = js.native
  def cloneDeep(n: ClassImplements): ClassImplements = js.native
  def cloneDeep(n: ClassMethod): ClassMethod = js.native
  def cloneDeep(n: ClassPrivateMethod): ClassPrivateMethod = js.native
  def cloneDeep(n: ClassPrivateProperty): ClassPrivateProperty = js.native
  def cloneDeep(n: ClassProperty): ClassProperty = js.native
  def cloneDeep(n: ConditionalExpression): ConditionalExpression = js.native
  def cloneDeep(n: ContinueStatement): ContinueStatement = js.native
  def cloneDeep(n: DebuggerStatement): DebuggerStatement = js.native
  def cloneDeep(n: DeclareClass): DeclareClass = js.native
  def cloneDeep(n: DeclareExportAllDeclaration): DeclareExportAllDeclaration = js.native
  def cloneDeep(n: DeclareExportDeclaration): DeclareExportDeclaration = js.native
  def cloneDeep(n: DeclareFunction): DeclareFunction = js.native
  def cloneDeep(n: DeclareInterface): DeclareInterface = js.native
  def cloneDeep(n: DeclareModule): DeclareModule = js.native
  def cloneDeep(n: DeclareModuleExports): DeclareModuleExports = js.native
  def cloneDeep(n: DeclareOpaqueType): DeclareOpaqueType = js.native
  def cloneDeep(n: DeclareTypeAlias): DeclareTypeAlias = js.native
  def cloneDeep(n: DeclareVariable): DeclareVariable = js.native
  def cloneDeep(n: DeclaredPredicate): DeclaredPredicate = js.native
  def cloneDeep(n: Decorator): Decorator = js.native
  def cloneDeep(n: Directive): Directive = js.native
  def cloneDeep(n: DirectiveLiteral): DirectiveLiteral = js.native
  def cloneDeep(n: DoExpression): DoExpression = js.native
  def cloneDeep(n: DoWhileStatement): DoWhileStatement = js.native
  def cloneDeep(n: EmptyStatement): EmptyStatement = js.native
  def cloneDeep(n: EmptyTypeAnnotation): EmptyTypeAnnotation = js.native
  def cloneDeep(n: ExistsTypeAnnotation): ExistsTypeAnnotation = js.native
  def cloneDeep(n: ExportAllDeclaration): ExportAllDeclaration = js.native
  def cloneDeep(n: ExportDefaultDeclaration): ExportDefaultDeclaration = js.native
  def cloneDeep(n: ExportDefaultSpecifier): ExportDefaultSpecifier = js.native
  def cloneDeep(n: ExportNamedDeclaration): ExportNamedDeclaration = js.native
  def cloneDeep(n: ExportNamespaceSpecifier): ExportNamespaceSpecifier = js.native
  def cloneDeep(n: ExportSpecifier): ExportSpecifier = js.native
  def cloneDeep(n: ExpressionStatement): ExpressionStatement = js.native
  def cloneDeep(n: File): File = js.native
  def cloneDeep(n: ForInStatement): ForInStatement = js.native
  def cloneDeep(n: ForOfStatement): ForOfStatement = js.native
  def cloneDeep(n: ForStatement): ForStatement = js.native
  def cloneDeep(n: FunctionDeclaration): FunctionDeclaration = js.native
  def cloneDeep(n: FunctionExpression): FunctionExpression = js.native
  def cloneDeep(n: FunctionTypeAnnotation): FunctionTypeAnnotation = js.native
  def cloneDeep(n: FunctionTypeParam): FunctionTypeParam = js.native
  def cloneDeep(n: GenericTypeAnnotation): GenericTypeAnnotation = js.native
  def cloneDeep(n: Identifier): Identifier = js.native
  def cloneDeep(n: IfStatement): IfStatement = js.native
  def cloneDeep(n: Import): Import = js.native
  def cloneDeep(n: ImportDeclaration): ImportDeclaration = js.native
  def cloneDeep(n: ImportDefaultSpecifier): ImportDefaultSpecifier = js.native
  def cloneDeep(n: ImportNamespaceSpecifier): ImportNamespaceSpecifier = js.native
  def cloneDeep(n: ImportSpecifier): ImportSpecifier = js.native
  def cloneDeep(n: InferredPredicate): InferredPredicate = js.native
  def cloneDeep(n: InterfaceDeclaration): InterfaceDeclaration = js.native
  def cloneDeep(n: InterfaceExtends): InterfaceExtends = js.native
  def cloneDeep(n: InterfaceTypeAnnotation): InterfaceTypeAnnotation = js.native
  def cloneDeep(n: InterpreterDirective): InterpreterDirective = js.native
  def cloneDeep(n: IntersectionTypeAnnotation): IntersectionTypeAnnotation = js.native
  def cloneDeep(n: JSXAttribute): JSXAttribute = js.native
  def cloneDeep(n: JSXClosingElement): JSXClosingElement = js.native
  def cloneDeep(n: JSXClosingFragment): JSXClosingFragment = js.native
  def cloneDeep(n: JSXElement): JSXElement = js.native
  def cloneDeep(n: JSXEmptyExpression): JSXEmptyExpression = js.native
  def cloneDeep(n: JSXExpressionContainer): JSXExpressionContainer = js.native
  def cloneDeep(n: JSXFragment): JSXFragment = js.native
  def cloneDeep(n: JSXIdentifier): JSXIdentifier = js.native
  def cloneDeep(n: JSXMemberExpression): JSXMemberExpression = js.native
  def cloneDeep(n: JSXNamespacedName): JSXNamespacedName = js.native
  def cloneDeep(n: JSXOpeningElement): JSXOpeningElement = js.native
  def cloneDeep(n: JSXOpeningFragment): JSXOpeningFragment = js.native
  def cloneDeep(n: JSXSpreadAttribute): JSXSpreadAttribute = js.native
  def cloneDeep(n: JSXSpreadChild): JSXSpreadChild = js.native
  def cloneDeep(n: JSXText): JSXText = js.native
  def cloneDeep(n: LabeledStatement): LabeledStatement = js.native
  def cloneDeep(n: LogicalExpression): LogicalExpression = js.native
  def cloneDeep(n: MemberExpression): MemberExpression = js.native
  def cloneDeep(n: MetaProperty): MetaProperty = js.native
  def cloneDeep(n: MixedTypeAnnotation): MixedTypeAnnotation = js.native
  def cloneDeep(n: NewExpression): NewExpression = js.native
  def cloneDeep(n: Noop): Noop = js.native
  def cloneDeep(n: NullLiteral): NullLiteral = js.native
  def cloneDeep(n: NullLiteralTypeAnnotation): NullLiteralTypeAnnotation = js.native
  def cloneDeep(n: NullableTypeAnnotation): NullableTypeAnnotation = js.native
  def cloneDeep(n: NumberLiteralTypeAnnotation): NumberLiteralTypeAnnotation = js.native
  def cloneDeep(n: NumberTypeAnnotation): NumberTypeAnnotation = js.native
  def cloneDeep(n: NumericLiteral): NumericLiteral = js.native
  def cloneDeep(n: ObjectExpression): ObjectExpression = js.native
  def cloneDeep(n: ObjectMethod): ObjectMethod = js.native
  def cloneDeep(n: ObjectPattern): ObjectPattern = js.native
  def cloneDeep(n: ObjectProperty): ObjectProperty = js.native
  def cloneDeep(n: ObjectTypeAnnotation): ObjectTypeAnnotation = js.native
  def cloneDeep(n: ObjectTypeCallProperty): ObjectTypeCallProperty = js.native
  def cloneDeep(n: ObjectTypeIndexer): ObjectTypeIndexer = js.native
  def cloneDeep(n: ObjectTypeInternalSlot): ObjectTypeInternalSlot = js.native
  def cloneDeep(n: ObjectTypeProperty): ObjectTypeProperty = js.native
  def cloneDeep(n: ObjectTypeSpreadProperty): ObjectTypeSpreadProperty = js.native
  def cloneDeep(n: OpaqueType): OpaqueType = js.native
  def cloneDeep(n: OptionalCallExpression): OptionalCallExpression = js.native
  def cloneDeep(n: OptionalMemberExpression): OptionalMemberExpression = js.native
  def cloneDeep(n: ParenthesizedExpression): ParenthesizedExpression = js.native
  def cloneDeep(n: PipelineBareFunction): PipelineBareFunction = js.native
  def cloneDeep(n: PipelinePrimaryTopicReference): PipelinePrimaryTopicReference = js.native
  def cloneDeep(n: PipelineTopicExpression): PipelineTopicExpression = js.native
  def cloneDeep(n: Placeholder): Placeholder = js.native
  def cloneDeep(n: PrivateName): PrivateName = js.native
  def cloneDeep(n: Program): Program = js.native
  def cloneDeep(n: QualifiedTypeIdentifier): QualifiedTypeIdentifier = js.native
  def cloneDeep(n: RegExpLiteral): RegExpLiteral = js.native
  def cloneDeep(n: RestElement): RestElement = js.native
  def cloneDeep(n: ReturnStatement): ReturnStatement = js.native
  def cloneDeep(n: SequenceExpression): SequenceExpression = js.native
  def cloneDeep(n: SpreadElement): SpreadElement = js.native
  def cloneDeep(n: StringLiteral): StringLiteral = js.native
  def cloneDeep(n: StringLiteralTypeAnnotation): StringLiteralTypeAnnotation = js.native
  def cloneDeep(n: StringTypeAnnotation): StringTypeAnnotation = js.native
  def cloneDeep(n: Super): Super = js.native
  def cloneDeep(n: SwitchCase): SwitchCase = js.native
  def cloneDeep(n: SwitchStatement): SwitchStatement = js.native
  def cloneDeep(n: TSAnyKeyword): TSAnyKeyword = js.native
  def cloneDeep(n: TSArrayType): TSArrayType = js.native
  def cloneDeep(n: TSAsExpression): TSAsExpression = js.native
  def cloneDeep(n: TSBooleanKeyword): TSBooleanKeyword = js.native
  def cloneDeep(n: TSCallSignatureDeclaration): TSCallSignatureDeclaration = js.native
  def cloneDeep(n: TSConditionalType): TSConditionalType = js.native
  def cloneDeep(n: TSConstructSignatureDeclaration): TSConstructSignatureDeclaration = js.native
  def cloneDeep(n: TSConstructorType): TSConstructorType = js.native
  def cloneDeep(n: TSDeclareFunction): TSDeclareFunction = js.native
  def cloneDeep(n: TSDeclareMethod): TSDeclareMethod = js.native
  def cloneDeep(n: TSEnumDeclaration): TSEnumDeclaration = js.native
  def cloneDeep(n: TSEnumMember): TSEnumMember = js.native
  def cloneDeep(n: TSExportAssignment): TSExportAssignment = js.native
  def cloneDeep(n: TSExpressionWithTypeArguments): TSExpressionWithTypeArguments = js.native
  def cloneDeep(n: TSExternalModuleReference): TSExternalModuleReference = js.native
  def cloneDeep(n: TSFunctionType): TSFunctionType = js.native
  def cloneDeep(n: TSImportEqualsDeclaration): TSImportEqualsDeclaration = js.native
  def cloneDeep(n: TSImportType): TSImportType = js.native
  def cloneDeep(n: TSIndexSignature): TSIndexSignature = js.native
  def cloneDeep(n: TSIndexedAccessType): TSIndexedAccessType = js.native
  def cloneDeep(n: TSInferType): TSInferType = js.native
  def cloneDeep(n: TSInterfaceBody): TSInterfaceBody = js.native
  def cloneDeep(n: TSInterfaceDeclaration): TSInterfaceDeclaration = js.native
  def cloneDeep(n: TSIntersectionType): TSIntersectionType = js.native
  def cloneDeep(n: TSLiteralType): TSLiteralType = js.native
  def cloneDeep(n: TSMappedType): TSMappedType = js.native
  def cloneDeep(n: TSMethodSignature): TSMethodSignature = js.native
  def cloneDeep(n: TSModuleBlock): TSModuleBlock = js.native
  def cloneDeep(n: TSModuleDeclaration): TSModuleDeclaration = js.native
  def cloneDeep(n: TSNamespaceExportDeclaration): TSNamespaceExportDeclaration = js.native
  def cloneDeep(n: TSNeverKeyword): TSNeverKeyword = js.native
  def cloneDeep(n: TSNonNullExpression): TSNonNullExpression = js.native
  def cloneDeep(n: TSNullKeyword): TSNullKeyword = js.native
  def cloneDeep(n: TSNumberKeyword): TSNumberKeyword = js.native
  def cloneDeep(n: TSObjectKeyword): TSObjectKeyword = js.native
  def cloneDeep(n: TSOptionalType): TSOptionalType = js.native
  def cloneDeep(n: TSParameterProperty): TSParameterProperty = js.native
  def cloneDeep(n: TSParenthesizedType): TSParenthesizedType = js.native
  def cloneDeep(n: TSPropertySignature): TSPropertySignature = js.native
  def cloneDeep(n: TSQualifiedName): TSQualifiedName = js.native
  def cloneDeep(n: TSRestType): TSRestType = js.native
  def cloneDeep(n: TSStringKeyword): TSStringKeyword = js.native
  def cloneDeep(n: TSSymbolKeyword): TSSymbolKeyword = js.native
  def cloneDeep(n: TSThisType): TSThisType = js.native
  def cloneDeep(n: TSTupleType): TSTupleType = js.native
  def cloneDeep(n: TSTypeAliasDeclaration): TSTypeAliasDeclaration = js.native
  def cloneDeep(n: TSTypeAnnotation): TSTypeAnnotation = js.native
  def cloneDeep(n: TSTypeAssertion): TSTypeAssertion = js.native
  def cloneDeep(n: TSTypeLiteral): TSTypeLiteral = js.native
  def cloneDeep(n: TSTypeOperator): TSTypeOperator = js.native
  def cloneDeep(n: TSTypeParameter): TSTypeParameter = js.native
  def cloneDeep(n: TSTypeParameterDeclaration): TSTypeParameterDeclaration = js.native
  def cloneDeep(n: TSTypeParameterInstantiation): TSTypeParameterInstantiation = js.native
  def cloneDeep(n: TSTypePredicate): TSTypePredicate = js.native
  def cloneDeep(n: TSTypeQuery): TSTypeQuery = js.native
  def cloneDeep(n: TSTypeReference): TSTypeReference = js.native
  def cloneDeep(n: TSUndefinedKeyword): TSUndefinedKeyword = js.native
  def cloneDeep(n: TSUnionType): TSUnionType = js.native
  def cloneDeep(n: TSUnknownKeyword): TSUnknownKeyword = js.native
  def cloneDeep(n: TSVoidKeyword): TSVoidKeyword = js.native
  def cloneDeep(n: TaggedTemplateExpression): TaggedTemplateExpression = js.native
  def cloneDeep(n: TemplateElement): TemplateElement = js.native
  def cloneDeep(n: TemplateLiteral): TemplateLiteral = js.native
  def cloneDeep(n: ThisExpression): ThisExpression = js.native
  def cloneDeep(n: ThisTypeAnnotation): ThisTypeAnnotation = js.native
  def cloneDeep(n: ThrowStatement): ThrowStatement = js.native
  def cloneDeep(n: TryStatement): TryStatement = js.native
  def cloneDeep(n: TupleTypeAnnotation): TupleTypeAnnotation = js.native
  def cloneDeep(n: TypeAlias): TypeAlias = js.native
  def cloneDeep(n: TypeAnnotation): TypeAnnotation = js.native
  def cloneDeep(n: TypeCastExpression): TypeCastExpression = js.native
  def cloneDeep(n: TypeParameter): TypeParameter = js.native
  def cloneDeep(n: TypeParameterDeclaration): TypeParameterDeclaration = js.native
  def cloneDeep(n: TypeParameterInstantiation): TypeParameterInstantiation = js.native
  def cloneDeep(n: TypeofTypeAnnotation): TypeofTypeAnnotation = js.native
  def cloneDeep(n: UnaryExpression): UnaryExpression = js.native
  def cloneDeep(n: UnionTypeAnnotation): UnionTypeAnnotation = js.native
  def cloneDeep(n: UpdateExpression): UpdateExpression = js.native
  def cloneDeep(n: VariableDeclaration): VariableDeclaration = js.native
  def cloneDeep(n: VariableDeclarator): VariableDeclarator = js.native
  def cloneDeep(n: Variance): Variance = js.native
  def cloneDeep(n: VoidTypeAnnotation): VoidTypeAnnotation = js.native
  def cloneDeep(n: WhileStatement): WhileStatement = js.native
  def cloneDeep(n: WithStatement): WithStatement = js.native
  def cloneDeep(n: YieldExpression): YieldExpression = js.native
  def conditionalExpression(test: Expression, consequent: Expression, alternate: Expression): ConditionalExpression = js.native
  def continueStatement(): ContinueStatement = js.native
  def continueStatement(label: Identifier): ContinueStatement = js.native
  def debuggerStatement(): DebuggerStatement = js.native
  def declareClass(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | scala.Null],
    body: ObjectTypeAnnotation
  ): DeclareClass = js.native
  def declareClass(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | scala.Null],
    _extends: js.UndefOr[js.Array[InterfaceExtends] | scala.Null],
    body: ObjectTypeAnnotation,
    _implements: js.Array[ClassImplements]
  ): DeclareClass = js.native
  def declareClass(
    id: Identifier,
    typeParameters: js.UndefOr[TypeParameterDeclaration | scala.Null],
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
  def declareTypeAlias(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], right: FlowType): DeclareTypeAlias = js.native
  def declareTypeAlias(id: Identifier, typeParameters: TypeParameterDeclaration, right: FlowType): DeclareTypeAlias = js.native
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
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportDefaultSpecifier | ExportNamespaceSpecifier | ExportSpecifier]
  ): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: js.UndefOr[scala.Nothing],
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
    source: StringLiteral
  ): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: Declaration,
    specifiers: js.Array[ExportDefaultSpecifier | ExportNamespaceSpecifier | ExportSpecifier]
  ): ExportNamedDeclaration = js.native
  def exportNamedDeclaration(
    declaration: Declaration,
    specifiers: js.Array[ExportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier],
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
  def functionDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: scala.Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): FunctionDeclaration = js.native
  def functionDeclaration(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    declare: scala.Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop,
    typeParameters: TypeParameterDeclaration | TSTypeParameterDeclaration | Noop
  ): FunctionDeclaration = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: scala.Boolean
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
    returnType: TypeAnnotation | TSTypeAnnotation | Noop
  ): FunctionExpression = js.native
  def functionExpression(
    id: js.UndefOr[Identifier | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    body: BlockStatement,
    generator: scala.Boolean,
    async: scala.Boolean,
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
    rest: FunctionTypeParam,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: js.UndefOr[scala.Nothing],
    params: js.Array[FunctionTypeParam],
    rest: scala.Null,
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
    rest: FunctionTypeParam,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: TypeParameterDeclaration,
    params: js.Array[FunctionTypeParam],
    rest: scala.Null,
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
    rest: FunctionTypeParam,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeAnnotation(
    typeParameters: scala.Null,
    params: js.Array[FunctionTypeParam],
    rest: scala.Null,
    returnType: FlowType
  ): FunctionTypeAnnotation = js.native
  def functionTypeParam(name: js.UndefOr[scala.Nothing], typeAnnotation: FlowType): FunctionTypeParam = js.native
  def functionTypeParam(name: js.UndefOr[scala.Nothing], typeAnnotation: FlowType, optional: scala.Boolean): FunctionTypeParam = js.native
  def functionTypeParam(name: Identifier, typeAnnotation: FlowType): FunctionTypeParam = js.native
  def functionTypeParam(name: Identifier, typeAnnotation: FlowType, optional: scala.Boolean): FunctionTypeParam = js.native
  def functionTypeParam(name: scala.Null, typeAnnotation: FlowType): FunctionTypeParam = js.native
  def functionTypeParam(name: scala.Null, typeAnnotation: FlowType, optional: scala.Boolean): FunctionTypeParam = js.native
  def genericTypeAnnotation(id: Identifier): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: Identifier, typeParameters: TypeParameterInstantiation): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: QualifiedTypeIdentifier): GenericTypeAnnotation = js.native
  def genericTypeAnnotation(id: QualifiedTypeIdentifier, typeParameters: TypeParameterInstantiation): GenericTypeAnnotation = js.native
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
    specifiers: js.Array[ImportDefaultSpecifier | ImportNamespaceSpecifier | ImportSpecifier],
    source: StringLiteral
  ): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_type(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral,
    importKind: atBabelTypesLib.atBabelTypesLibStrings.`type`
  ): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_typeof(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral,
    importKind: atBabelTypesLib.atBabelTypesLibStrings.typeof
  ): ImportDeclaration = js.native
  @JSName("importDeclaration")
  def importDeclaration_value(
    specifiers: js.Array[ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier],
    source: StringLiteral,
    importKind: atBabelTypesLib.atBabelTypesLibStrings.value
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
  def interfaceExtends(id: QualifiedTypeIdentifier): InterfaceExtends = js.native
  def interfaceExtends(id: QualifiedTypeIdentifier, typeParameters: TypeParameterInstantiation): InterfaceExtends = js.native
  def interfaceTypeAnnotation(_extends: js.UndefOr[scala.Nothing], body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(_extends: js.Array[InterfaceExtends], body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
  def interfaceTypeAnnotation(_extends: scala.Null, body: ObjectTypeAnnotation): InterfaceTypeAnnotation = js.native
  def interpreterDirective(value: java.lang.String): InterpreterDirective = js.native
  def intersectionTypeAnnotation(types: js.Array[FlowType]): IntersectionTypeAnnotation = js.native
  def isAnyTypeAnnotation(): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isAnyTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.AnyTypeAnnotation */ scala.Boolean = js.native
  def isArgumentPlaceholder(): /* is @babel/types.@babel/types.ArgumentPlaceholder */ scala.Boolean = js.native
  def isArgumentPlaceholder(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ scala.Boolean = js.native
  def isArgumentPlaceholder(node: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ scala.Boolean = js.native
  def isArgumentPlaceholder(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ scala.Boolean = js.native
  def isArgumentPlaceholder(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ArgumentPlaceholder */ scala.Boolean = js.native
  def isArrayExpression(): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayExpression */ scala.Boolean = js.native
  def isArrayPattern(): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayPattern(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayPattern */ scala.Boolean = js.native
  def isArrayTypeAnnotation(): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrayTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ArrayTypeAnnotation */ scala.Boolean = js.native
  def isArrowFunctionExpression(): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isArrowFunctionExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ArrowFunctionExpression */ scala.Boolean = js.native
  def isAssignmentExpression(): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.AssignmentExpression */ scala.Boolean = js.native
  def isAssignmentPattern(): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAssignmentPattern(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.AssignmentPattern */ scala.Boolean = js.native
  def isAwaitExpression(): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isAwaitExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.AwaitExpression */ scala.Boolean = js.native
  def isBigIntLiteral(): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBigIntLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBigIntLiteral(node: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBigIntLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBigIntLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BigIntLiteral */ scala.Boolean = js.native
  def isBinary(): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinary(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinary(node: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinary(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinary(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Binary */ scala.Boolean = js.native
  def isBinaryExpression(): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBinaryExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BinaryExpression */ scala.Boolean = js.native
  def isBindExpression(): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBindExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BindExpression */ scala.Boolean = js.native
  def isBlock(): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlock(node: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlock(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Block */ scala.Boolean = js.native
  def isBlockParent(): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockParent(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BlockParent */ scala.Boolean = js.native
  def isBlockStatement(): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBlockStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BlockStatement */ scala.Boolean = js.native
  def isBooleanLiteral(): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteral */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanLiteralTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BooleanTypeAnnotation */ scala.Boolean = js.native
  def isBreakStatement(): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isBreakStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.BreakStatement */ scala.Boolean = js.native
  def isCallExpression(): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCallExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.CallExpression */ scala.Boolean = js.native
  def isCatchClause(): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isCatchClause(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.CatchClause */ scala.Boolean = js.native
  def isClass(): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClass(node: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClass(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Class */ scala.Boolean = js.native
  def isClassBody(): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassBody(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassBody */ scala.Boolean = js.native
  def isClassDeclaration(): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassDeclaration */ scala.Boolean = js.native
  def isClassExpression(): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassExpression */ scala.Boolean = js.native
  def isClassImplements(): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassImplements(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassImplements */ scala.Boolean = js.native
  def isClassMethod(): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassMethod(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateMethod(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateMethod */ scala.Boolean = js.native
  def isClassPrivateProperty(): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassPrivateProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassPrivateProperty(node: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassPrivateProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassPrivateProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassPrivateProperty */ scala.Boolean = js.native
  def isClassProperty(): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isClassProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ClassProperty */ scala.Boolean = js.native
  def isCompletionStatement(): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isCompletionStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.CompletionStatement */ scala.Boolean = js.native
  def isConditional(): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditional(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditional(node: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditional(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditional(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Conditional */ scala.Boolean = js.native
  def isConditionalExpression(): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isConditionalExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ConditionalExpression */ scala.Boolean = js.native
  def isContinueStatement(): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isContinueStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ContinueStatement */ scala.Boolean = js.native
  def isDebuggerStatement(): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDebuggerStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DebuggerStatement */ scala.Boolean = js.native
  def isDeclaration(): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Declaration */ scala.Boolean = js.native
  def isDeclareClass(): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareClass(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareClass */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportAllDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportAllDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareExportDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareExportDeclaration */ scala.Boolean = js.native
  def isDeclareFunction(): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareFunction(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareFunction */ scala.Boolean = js.native
  def isDeclareInterface(): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareInterface(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareInterface */ scala.Boolean = js.native
  def isDeclareModule(): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModule(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareModule */ scala.Boolean = js.native
  def isDeclareModuleExports(): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareModuleExports(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareModuleExports(node: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareModuleExports(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareModuleExports(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareModuleExports */ scala.Boolean = js.native
  def isDeclareOpaqueType(): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareOpaqueType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareOpaqueType */ scala.Boolean = js.native
  def isDeclareTypeAlias(): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareTypeAlias(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareTypeAlias */ scala.Boolean = js.native
  def isDeclareVariable(): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclareVariable(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclareVariable */ scala.Boolean = js.native
  def isDeclaredPredicate(): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDeclaredPredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDeclaredPredicate(node: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDeclaredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDeclaredPredicate(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DeclaredPredicate */ scala.Boolean = js.native
  def isDecorator(): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDecorator(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Decorator */ scala.Boolean = js.native
  def isDirective(): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirective(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirective(node: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirective(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Directive */ scala.Boolean = js.native
  def isDirectiveLiteral(): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDirectiveLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DirectiveLiteral */ scala.Boolean = js.native
  def isDoExpression(): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DoExpression */ scala.Boolean = js.native
  def isDoWhileStatement(): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isDoWhileStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.DoWhileStatement */ scala.Boolean = js.native
  def isEmptyStatement(): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.EmptyStatement */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isEmptyTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.EmptyTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExistsTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExistsTypeAnnotation */ scala.Boolean = js.native
  def isExportAllDeclaration(): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportAllDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportAllDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultDeclaration */ scala.Boolean = js.native
  def isExportDefaultSpecifier(): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportDefaultSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportDefaultSpecifier */ scala.Boolean = js.native
  def isExportNamedDeclaration(): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamedDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportNamedDeclaration */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportNamespaceSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExportSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExportSpecifier */ scala.Boolean = js.native
  def isExpression(): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpression(node: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Expression */ scala.Boolean = js.native
  def isExpressionStatement(): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExpressionStatement */ scala.Boolean = js.native
  def isExpressionWrapper(): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isExpressionWrapper(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ExpressionWrapper */ scala.Boolean = js.native
  def isFile(): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFile(node: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFile(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.File */ scala.Boolean = js.native
  def isFlow(): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlow(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlow(node: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlow(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlow(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Flow */ scala.Boolean = js.native
  def isFlowBaseAnnotation(): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowBaseAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FlowBaseAnnotation */ scala.Boolean = js.native
  def isFlowDeclaration(): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FlowDeclaration */ scala.Boolean = js.native
  def isFlowPredicate(): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowPredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowPredicate(node: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowPredicate(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FlowPredicate */ scala.Boolean = js.native
  def isFlowType(): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFlowType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFlowType(node: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFlowType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFlowType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FlowType */ scala.Boolean = js.native
  def isFor(): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isFor(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isFor(node: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isFor(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isFor(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.For */ scala.Boolean = js.native
  def isForInStatement(): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForInStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ForInStatement */ scala.Boolean = js.native
  def isForOfStatement(): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForOfStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ForOfStatement */ scala.Boolean = js.native
  def isForStatement(): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ForStatement */ scala.Boolean = js.native
  def isForXStatement(): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isForXStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ForXStatement */ scala.Boolean = js.native
  def isFunction(): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunction(node: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunction(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Function */ scala.Boolean = js.native
  def isFunctionDeclaration(): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionDeclaration */ scala.Boolean = js.native
  def isFunctionExpression(): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionExpression */ scala.Boolean = js.native
  def isFunctionParent(): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionParent(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionParent */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeAnnotation */ scala.Boolean = js.native
  def isFunctionTypeParam(): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isFunctionTypeParam(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.FunctionTypeParam */ scala.Boolean = js.native
  def isGenericTypeAnnotation(): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isGenericTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.GenericTypeAnnotation */ scala.Boolean = js.native
  def isIdentifier(): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIdentifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Identifier */ scala.Boolean = js.native
  def isIfStatement(): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isIfStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.IfStatement */ scala.Boolean = js.native
  def isImmutable(): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImmutable(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Immutable */ scala.Boolean = js.native
  def isImport(): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImport(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImport(node: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImport(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImport(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Import */ scala.Boolean = js.native
  def isImportDeclaration(): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ImportDeclaration */ scala.Boolean = js.native
  def isImportDefaultSpecifier(): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportDefaultSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ImportDefaultSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ImportNamespaceSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isImportSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ImportSpecifier */ scala.Boolean = js.native
  def isInferredPredicate(): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInferredPredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInferredPredicate(node: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInferredPredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInferredPredicate(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.InferredPredicate */ scala.Boolean = js.native
  def isInterfaceDeclaration(): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceDeclaration */ scala.Boolean = js.native
  def isInterfaceExtends(): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceExtends(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceExtends */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterfaceTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.InterfaceTypeAnnotation */ scala.Boolean = js.native
  def isInterpreterDirective(): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isInterpreterDirective(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isInterpreterDirective(node: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isInterpreterDirective(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isInterpreterDirective(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.InterpreterDirective */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.IntersectionTypeAnnotation */ scala.Boolean = js.native
  def isJSX(): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSX(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSX(node: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSX(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSX(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSX */ scala.Boolean = js.native
  def isJSXAttribute(): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXAttribute(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXAttribute */ scala.Boolean = js.native
  def isJSXClosingElement(): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingElement */ scala.Boolean = js.native
  def isJSXClosingFragment(): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXClosingFragment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXClosingFragment(node: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXClosingFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXClosingFragment(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXClosingFragment */ scala.Boolean = js.native
  def isJSXElement(): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXElement */ scala.Boolean = js.native
  def isJSXEmptyExpression(): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXEmptyExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXEmptyExpression */ scala.Boolean = js.native
  def isJSXExpressionContainer(): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXExpressionContainer(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXExpressionContainer */ scala.Boolean = js.native
  def isJSXFragment(): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXFragment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXFragment(node: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXFragment(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXFragment */ scala.Boolean = js.native
  def isJSXIdentifier(): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXIdentifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXIdentifier */ scala.Boolean = js.native
  def isJSXMemberExpression(): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXMemberExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXMemberExpression */ scala.Boolean = js.native
  def isJSXNamespacedName(): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXNamespacedName(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXNamespacedName */ scala.Boolean = js.native
  def isJSXOpeningElement(): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningElement */ scala.Boolean = js.native
  def isJSXOpeningFragment(): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXOpeningFragment(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXOpeningFragment */ scala.Boolean = js.native
  def isJSXSpreadAttribute(): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadAttribute(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadAttribute */ scala.Boolean = js.native
  def isJSXSpreadChild(): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXSpreadChild(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXSpreadChild(node: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXSpreadChild(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXSpreadChild(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXSpreadChild */ scala.Boolean = js.native
  def isJSXText(): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isJSXText(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.JSXText */ scala.Boolean = js.native
  def isLVal(): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLVal(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLVal(node: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLVal(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLVal(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.LVal */ scala.Boolean = js.native
  def isLabeledStatement(): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLabeledStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.LabeledStatement */ scala.Boolean = js.native
  def isLiteral(): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLiteral(node: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Literal */ scala.Boolean = js.native
  def isLogicalExpression(): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLogicalExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.LogicalExpression */ scala.Boolean = js.native
  def isLoop(): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isLoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isLoop(node: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isLoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isLoop(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Loop */ scala.Boolean = js.native
  def isMemberExpression(): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMemberExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.MemberExpression */ scala.Boolean = js.native
  def isMetaProperty(): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMetaProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.MetaProperty */ scala.Boolean = js.native
  def isMethod(): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMethod(node: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMethod(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Method */ scala.Boolean = js.native
  def isMixedTypeAnnotation(): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isMixedTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.MixedTypeAnnotation */ scala.Boolean = js.native
  def isModuleDeclaration(): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ModuleDeclaration */ scala.Boolean = js.native
  def isModuleSpecifier(): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isModuleSpecifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ModuleSpecifier */ scala.Boolean = js.native
  def isNewExpression(): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNewExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NewExpression */ scala.Boolean = js.native
  def isNoop(): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNoop(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNoop(node: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNoop(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNoop(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Noop */ scala.Boolean = js.native
  def isNullLiteral(): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NullLiteral */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NullLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNullableTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NullableTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteral(): scala.Boolean = js.native
  def isNumberLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isNumberLiteral(node: js.Object): scala.Boolean = js.native
  def isNumberLiteral(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isNumberLiteral(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NumberLiteralTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumberTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NumberTypeAnnotation */ scala.Boolean = js.native
  def isNumericLiteral(): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isNumericLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.NumericLiteral */ scala.Boolean = js.native
  def isObjectExpression(): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectExpression */ scala.Boolean = js.native
  def isObjectMember(): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMember(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectMember */ scala.Boolean = js.native
  def isObjectMethod(): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectMethod(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectMethod */ scala.Boolean = js.native
  def isObjectPattern(): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectPattern(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectPattern */ scala.Boolean = js.native
  def isObjectProperty(): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectProperty */ scala.Boolean = js.native
  def isObjectTypeAnnotation(): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeAnnotation */ scala.Boolean = js.native
  def isObjectTypeCallProperty(): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeCallProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeCallProperty */ scala.Boolean = js.native
  def isObjectTypeIndexer(): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeIndexer(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeIndexer */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeInternalSlot(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeInternalSlot */ scala.Boolean = js.native
  def isObjectTypeProperty(): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isObjectTypeSpreadProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ObjectTypeSpreadProperty */ scala.Boolean = js.native
  def isOpaqueType(): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOpaqueType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOpaqueType(node: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOpaqueType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOpaqueType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.OpaqueType */ scala.Boolean = js.native
  def isOptionalCallExpression(): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalCallExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalCallExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalCallExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalCallExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.OptionalCallExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isOptionalMemberExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.OptionalMemberExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isParenthesizedExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ParenthesizedExpression */ scala.Boolean = js.native
  def isPattern(): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPattern(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPattern(node: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPattern(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPattern(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Pattern */ scala.Boolean = js.native
  def isPatternLike(): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPatternLike(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPatternLike(node: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPatternLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPatternLike(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.PatternLike */ scala.Boolean = js.native
  def isPipelineBareFunction(): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelineBareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelineBareFunction(node: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelineBareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelineBareFunction(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.PipelineBareFunction */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelinePrimaryTopicReference(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.PipelinePrimaryTopicReference */ scala.Boolean = js.native
  def isPipelineTopicExpression(): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPipelineTopicExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.PipelineTopicExpression */ scala.Boolean = js.native
  def isPlaceholder(): /* is @babel/types.@babel/types.Placeholder */ scala.Boolean = js.native
  def isPlaceholder(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ scala.Boolean = js.native
  def isPlaceholder(node: js.Object): /* is @babel/types.@babel/types.Placeholder */ scala.Boolean = js.native
  def isPlaceholder(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ scala.Boolean = js.native
  def isPlaceholder(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Placeholder */ scala.Boolean = js.native
  def isPrivate(): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivate(node: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivate(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Private */ scala.Boolean = js.native
  def isPrivateName(): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isPrivateName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isPrivateName(node: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isPrivateName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isPrivateName(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.PrivateName */ scala.Boolean = js.native
  def isProgram(): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProgram(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProgram(node: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProgram(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProgram(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Program */ scala.Boolean = js.native
  def isProperty(): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isProperty(node: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Property */ scala.Boolean = js.native
  def isPureish(): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isPureish(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isPureish(node: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isPureish(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isPureish(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Pureish */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.QualifiedTypeIdentifier */ scala.Boolean = js.native
  def isRegExpLiteral(): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegExpLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.RegExpLiteral */ scala.Boolean = js.native
  def isRegexLiteral(): scala.Boolean = js.native
  def isRegexLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isRegexLiteral(node: js.Object): scala.Boolean = js.native
  def isRegexLiteral(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isRegexLiteral(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isRestElement(): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.RestElement */ scala.Boolean = js.native
  def isRestProperty(): scala.Boolean = js.native
  def isRestProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isRestProperty(node: js.Object): scala.Boolean = js.native
  def isRestProperty(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isRestProperty(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isReturnStatement(): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isReturnStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ReturnStatement */ scala.Boolean = js.native
  def isScopable(): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isScopable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isScopable(node: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isScopable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isScopable(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Scopable */ scala.Boolean = js.native
  def isSequenceExpression(): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSequenceExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.SequenceExpression */ scala.Boolean = js.native
  def isSpreadElement(): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.SpreadElement */ scala.Boolean = js.native
  def isSpreadProperty(): scala.Boolean = js.native
  def isSpreadProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): scala.Boolean = js.native
  def isSpreadProperty(node: js.Object): scala.Boolean = js.native
  def isSpreadProperty(node: js.Object, opts: js.Object): scala.Boolean = js.native
  def isSpreadProperty(node: scala.Null, opts: js.Object): scala.Boolean = js.native
  def isStatement(): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStatement(node: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Statement */ scala.Boolean = js.native
  def isStringLiteral(): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.StringLiteral */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.StringLiteralTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isStringTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.StringTypeAnnotation */ scala.Boolean = js.native
  def isSuper(): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSuper(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSuper(node: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSuper(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSuper(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Super */ scala.Boolean = js.native
  def isSwitchCase(): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchCase(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.SwitchCase */ scala.Boolean = js.native
  def isSwitchStatement(): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isSwitchStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.SwitchStatement */ scala.Boolean = js.native
  def isTSAnyKeyword(): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSAnyKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSAnyKeyword */ scala.Boolean = js.native
  def isTSArrayType(): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSArrayType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSArrayType */ scala.Boolean = js.native
  def isTSAsExpression(): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSAsExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSAsExpression */ scala.Boolean = js.native
  def isTSBooleanKeyword(): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSBooleanKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSBooleanKeyword */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSCallSignatureDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSCallSignatureDeclaration */ scala.Boolean = js.native
  def isTSConditionalType(): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConditionalType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConditionalType(node: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConditionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConditionalType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSConditionalType */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructSignatureDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSConstructSignatureDeclaration */ scala.Boolean = js.native
  def isTSConstructorType(): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSConstructorType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSConstructorType */ scala.Boolean = js.native
  def isTSDeclareFunction(): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareFunction(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareFunction */ scala.Boolean = js.native
  def isTSDeclareMethod(): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSDeclareMethod(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSDeclareMethod */ scala.Boolean = js.native
  def isTSEntityName(): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEntityName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEntityName(node: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEntityName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEntityName(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSEntityName */ scala.Boolean = js.native
  def isTSEnumDeclaration(): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSEnumDeclaration */ scala.Boolean = js.native
  def isTSEnumMember(): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSEnumMember(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSEnumMember */ scala.Boolean = js.native
  def isTSExportAssignment(): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExportAssignment(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSExportAssignment */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExpressionWithTypeArguments(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSExpressionWithTypeArguments */ scala.Boolean = js.native
  def isTSExternalModuleReference(): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSExternalModuleReference(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSExternalModuleReference */ scala.Boolean = js.native
  def isTSFunctionType(): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSFunctionType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSFunctionType */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportEqualsDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSImportEqualsDeclaration */ scala.Boolean = js.native
  def isTSImportType(): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSImportType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSImportType(node: js.Object): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSImportType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSImportType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSImportType */ scala.Boolean = js.native
  def isTSIndexSignature(): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexSignature(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSIndexSignature */ scala.Boolean = js.native
  def isTSIndexedAccessType(): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSIndexedAccessType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSIndexedAccessType */ scala.Boolean = js.native
  def isTSInferType(): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInferType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInferType(node: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInferType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInferType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSInferType */ scala.Boolean = js.native
  def isTSInterfaceBody(): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceBody(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceBody */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSInterfaceDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSInterfaceDeclaration */ scala.Boolean = js.native
  def isTSIntersectionType(): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSIntersectionType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSIntersectionType */ scala.Boolean = js.native
  def isTSLiteralType(): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSLiteralType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSLiteralType */ scala.Boolean = js.native
  def isTSMappedType(): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMappedType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSMappedType */ scala.Boolean = js.native
  def isTSMethodSignature(): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSMethodSignature(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSMethodSignature */ scala.Boolean = js.native
  def isTSModuleBlock(): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleBlock(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSModuleBlock */ scala.Boolean = js.native
  def isTSModuleDeclaration(): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSModuleDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSModuleDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNamespaceExportDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSNamespaceExportDeclaration */ scala.Boolean = js.native
  def isTSNeverKeyword(): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNeverKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSNeverKeyword */ scala.Boolean = js.native
  def isTSNonNullExpression(): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNonNullExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSNonNullExpression */ scala.Boolean = js.native
  def isTSNullKeyword(): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNullKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSNullKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSNumberKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSNumberKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSObjectKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSObjectKeyword */ scala.Boolean = js.native
  def isTSOptionalType(): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSOptionalType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSOptionalType(node: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSOptionalType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSOptionalType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSOptionalType */ scala.Boolean = js.native
  def isTSParameterProperty(): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParameterProperty(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSParameterProperty */ scala.Boolean = js.native
  def isTSParenthesizedType(): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSParenthesizedType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSParenthesizedType */ scala.Boolean = js.native
  def isTSPropertySignature(): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSPropertySignature(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSPropertySignature */ scala.Boolean = js.native
  def isTSQualifiedName(): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSQualifiedName(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSQualifiedName */ scala.Boolean = js.native
  def isTSRestType(): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSRestType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSRestType(node: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSRestType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSRestType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSRestType */ scala.Boolean = js.native
  def isTSStringKeyword(): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSStringKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSStringKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSSymbolKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSSymbolKeyword */ scala.Boolean = js.native
  def isTSThisType(): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSThisType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSThisType */ scala.Boolean = js.native
  def isTSTupleType(): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSTupleType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTupleType */ scala.Boolean = js.native
  def isTSType(): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSType(node: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSType */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAliasDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAliasDeclaration */ scala.Boolean = js.native
  def isTSTypeAnnotation(): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAnnotation */ scala.Boolean = js.native
  def isTSTypeAssertion(): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeAssertion(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeAssertion */ scala.Boolean = js.native
  def isTSTypeElement(): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeElement(node: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeElement */ scala.Boolean = js.native
  def isTSTypeLiteral(): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeLiteral */ scala.Boolean = js.native
  def isTSTypeOperator(): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeOperator(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeOperator */ scala.Boolean = js.native
  def isTSTypeParameter(): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameter(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameter */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterDeclaration */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypeParameterInstantiation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeParameterInstantiation */ scala.Boolean = js.native
  def isTSTypePredicate(): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypePredicate(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypePredicate */ scala.Boolean = js.native
  def isTSTypeQuery(): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeQuery(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeQuery */ scala.Boolean = js.native
  def isTSTypeReference(): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSTypeReference(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSTypeReference */ scala.Boolean = js.native
  def isTSUndefinedKeyword(): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUndefinedKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSUndefinedKeyword */ scala.Boolean = js.native
  def isTSUnionType(): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnionType(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSUnionType */ scala.Boolean = js.native
  def isTSUnknownKeyword(): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSUnknownKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSUnknownKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTSVoidKeyword(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TSVoidKeyword */ scala.Boolean = js.native
  def isTaggedTemplateExpression(): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTaggedTemplateExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TaggedTemplateExpression */ scala.Boolean = js.native
  def isTemplateElement(): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateElement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TemplateElement */ scala.Boolean = js.native
  def isTemplateLiteral(): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTemplateLiteral(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TemplateLiteral */ scala.Boolean = js.native
  def isTerminatorless(): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isTerminatorless(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Terminatorless */ scala.Boolean = js.native
  def isThisExpression(): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ThisExpression */ scala.Boolean = js.native
  def isThisTypeAnnotation(): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThisTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ThisTypeAnnotation */ scala.Boolean = js.native
  def isThrowStatement(): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isThrowStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.ThrowStatement */ scala.Boolean = js.native
  def isTryStatement(): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTryStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TryStatement */ scala.Boolean = js.native
  def isTupleTypeAnnotation(): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTupleTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TupleTypeAnnotation */ scala.Boolean = js.native
  def isTypeAlias(): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAlias(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeAlias */ scala.Boolean = js.native
  def isTypeAnnotation(): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeAnnotation */ scala.Boolean = js.native
  def isTypeCastExpression(): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeCastExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeCastExpression */ scala.Boolean = js.native
  def isTypeParameter(): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameter(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameter */ scala.Boolean = js.native
  def isTypeParameterDeclaration(): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterDeclaration */ scala.Boolean = js.native
  def isTypeParameterInstantiation(): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeParameterInstantiation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeParameterInstantiation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.TypeofTypeAnnotation */ scala.Boolean = js.native
  def isUnaryExpression(): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.UnaryExpression */ scala.Boolean = js.native
  def isUnaryLike(): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnaryLike(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.UnaryLike */ scala.Boolean = js.native
  def isUnionTypeAnnotation(): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUnionTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.UnionTypeAnnotation */ scala.Boolean = js.native
  def isUpdateExpression(): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUpdateExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.UpdateExpression */ scala.Boolean = js.native
  def isUserWhitespacable(): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isUserWhitespacable(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.UserWhitespacable */ scala.Boolean = js.native
  def isVariableDeclaration(): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclaration(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclaration */ scala.Boolean = js.native
  def isVariableDeclarator(): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariableDeclarator(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.VariableDeclarator */ scala.Boolean = js.native
  def isVariance(): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVariance(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVariance(node: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVariance(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVariance(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.Variance */ scala.Boolean = js.native
  def isVoidTypeAnnotation(): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isVoidTypeAnnotation(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.VoidTypeAnnotation */ scala.Boolean = js.native
  def isWhile(): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhile(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhile(node: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhile(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhile(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.While */ scala.Boolean = js.native
  def isWhileStatement(): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWhileStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.WhileStatement */ scala.Boolean = js.native
  def isWithStatement(): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isWithStatement(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.WithStatement */ scala.Boolean = js.native
  def isYieldExpression(): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: js.UndefOr[scala.Nothing], opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: js.Object, opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
  def isYieldExpression(node: scala.Null, opts: js.Object): /* is @babel/types.@babel/types.YieldExpression */ scala.Boolean = js.native
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
    closingElement: JSXClosingElement,
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
  def logicalExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`&&`, left: Expression, right: Expression): LogicalExpression = js.native
  def logicalExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`??`, left: Expression, right: Expression): LogicalExpression = js.native
  def logicalExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`||`, left: Expression, right: Expression): LogicalExpression = js.native
  def memberExpression(`object`: Expression, property: js.Any): MemberExpression = js.native
  def memberExpression(`object`: Expression, property: js.Any, computed: scala.Boolean): MemberExpression = js.native
  @JSName("memberExpression")
  def memberExpression_false(
    `object`: Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`
  ): MemberExpression = js.native
  @JSName("memberExpression")
  def memberExpression_true(
    `object`: Expression,
    property: js.Any,
    computed: scala.Boolean,
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`
  ): MemberExpression = js.native
  def metaProperty(meta: Identifier, property: Identifier): MetaProperty = js.native
  def mixedTypeAnnotation(): MixedTypeAnnotation = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement]
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: scala.Null,
    typeArguments: TypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: scala.Null,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  def newExpression(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: scala.Null,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: TypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_false(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`false`,
    typeArguments: scala.Null,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: Expression,
    _arguments: js.Array[ArgumentPlaceholder | Expression | JSXNamespacedName | SpreadElement],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: TypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
    typeArguments: TypeParameterInstantiation,
    typeParameters: TSTypeParameterInstantiation
  ): NewExpression = js.native
  @JSName("newExpression")
  def newExpression_true(
    callee: Expression,
    _arguments: js.Array[Expression | SpreadElement | JSXNamespacedName | ArgumentPlaceholder],
    optional: atBabelTypesLib.atBabelTypesLibNumbers.`true`,
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
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
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
  def objectProperty(key: js.Any, value: Expression): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: Expression, computed: scala.Boolean): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: Expression, computed: scala.Boolean, shorthand: scala.Boolean): ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: Expression,
    computed: scala.Boolean,
    shorthand: scala.Boolean,
    decorators: js.Array[Decorator]
  ): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: PatternLike): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: PatternLike, computed: scala.Boolean): ObjectProperty = js.native
  def objectProperty(key: js.Any, value: PatternLike, computed: scala.Boolean, shorthand: scala.Boolean): ObjectProperty = js.native
  def objectProperty(
    key: js.Any,
    value: PatternLike,
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
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType, variance: Variance): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType, variance: Variance, _static: scala.Boolean): ObjectTypeIndexer = js.native
  def objectTypeIndexer(id: Identifier, key: FlowType, value: FlowType, variance: scala.Null, _static: scala.Boolean): ObjectTypeIndexer = js.native
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
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], supertype: FlowType, impltype: FlowType): OpaqueType = js.native
  def opaqueType(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    supertype: scala.Null,
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    supertype: js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(id: Identifier, typeParameters: TypeParameterDeclaration, supertype: FlowType, impltype: FlowType): OpaqueType = js.native
  def opaqueType(
    id: Identifier,
    typeParameters: TypeParameterDeclaration,
    supertype: scala.Null,
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(
    id: Identifier,
    typeParameters: scala.Null,
    supertype: js.UndefOr[scala.Nothing],
    impltype: FlowType
  ): OpaqueType = js.native
  def opaqueType(id: Identifier, typeParameters: scala.Null, supertype: FlowType, impltype: FlowType): OpaqueType = js.native
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
  @JSName("placeholder")
  def placeholder_BlockStatement(expectedNode: atBabelTypesLib.atBabelTypesLibStrings.BlockStatement, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_ClassBody(expectedNode: atBabelTypesLib.atBabelTypesLibStrings.ClassBody, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Declaration(expectedNode: atBabelTypesLib.atBabelTypesLibStrings.Declaration, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Expression(expectedNode: atBabelTypesLib.atBabelTypesLibStrings.Expression, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Identifier(expectedNode: atBabelTypesLib.atBabelTypesLibStrings.Identifier, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Pattern(expectedNode: atBabelTypesLib.atBabelTypesLibStrings.Pattern, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_Statement(expectedNode: atBabelTypesLib.atBabelTypesLibStrings.Statement, name: Identifier): Placeholder = js.native
  @JSName("placeholder")
  def placeholder_StringLiteral(expectedNode: atBabelTypesLib.atBabelTypesLibStrings.StringLiteral, name: Identifier): Placeholder = js.native
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
  def removePropertiesDeep(n: AnyTypeAnnotation): AnyTypeAnnotation = js.native
  def removePropertiesDeep(n: AnyTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): AnyTypeAnnotation = js.native
  def removePropertiesDeep(n: ArgumentPlaceholder): ArgumentPlaceholder = js.native
  def removePropertiesDeep(n: ArgumentPlaceholder, opts: atBabelTypesLib.Anon_PreserveComments): ArgumentPlaceholder = js.native
  def removePropertiesDeep(n: ArrayExpression): ArrayExpression = js.native
  def removePropertiesDeep(n: ArrayExpression, opts: atBabelTypesLib.Anon_PreserveComments): ArrayExpression = js.native
  def removePropertiesDeep(n: ArrayPattern): ArrayPattern = js.native
  def removePropertiesDeep(n: ArrayPattern, opts: atBabelTypesLib.Anon_PreserveComments): ArrayPattern = js.native
  def removePropertiesDeep(n: ArrayTypeAnnotation): ArrayTypeAnnotation = js.native
  def removePropertiesDeep(n: ArrayTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): ArrayTypeAnnotation = js.native
  def removePropertiesDeep(n: ArrowFunctionExpression): ArrowFunctionExpression = js.native
  def removePropertiesDeep(n: ArrowFunctionExpression, opts: atBabelTypesLib.Anon_PreserveComments): ArrowFunctionExpression = js.native
  def removePropertiesDeep(n: AssignmentExpression): AssignmentExpression = js.native
  def removePropertiesDeep(n: AssignmentExpression, opts: atBabelTypesLib.Anon_PreserveComments): AssignmentExpression = js.native
  def removePropertiesDeep(n: AssignmentPattern): AssignmentPattern = js.native
  def removePropertiesDeep(n: AssignmentPattern, opts: atBabelTypesLib.Anon_PreserveComments): AssignmentPattern = js.native
  def removePropertiesDeep(n: AwaitExpression): AwaitExpression = js.native
  def removePropertiesDeep(n: AwaitExpression, opts: atBabelTypesLib.Anon_PreserveComments): AwaitExpression = js.native
  def removePropertiesDeep(n: BigIntLiteral): BigIntLiteral = js.native
  def removePropertiesDeep(n: BigIntLiteral, opts: atBabelTypesLib.Anon_PreserveComments): BigIntLiteral = js.native
  def removePropertiesDeep(n: BinaryExpression): BinaryExpression = js.native
  def removePropertiesDeep(n: BinaryExpression, opts: atBabelTypesLib.Anon_PreserveComments): BinaryExpression = js.native
  def removePropertiesDeep(n: BindExpression): BindExpression = js.native
  def removePropertiesDeep(n: BindExpression, opts: atBabelTypesLib.Anon_PreserveComments): BindExpression = js.native
  def removePropertiesDeep(n: BlockStatement): BlockStatement = js.native
  def removePropertiesDeep(n: BlockStatement, opts: atBabelTypesLib.Anon_PreserveComments): BlockStatement = js.native
  def removePropertiesDeep(n: BooleanLiteral): BooleanLiteral = js.native
  def removePropertiesDeep(n: BooleanLiteralTypeAnnotation): BooleanLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: BooleanLiteralTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): BooleanLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: BooleanLiteral, opts: atBabelTypesLib.Anon_PreserveComments): BooleanLiteral = js.native
  def removePropertiesDeep(n: BooleanTypeAnnotation): BooleanTypeAnnotation = js.native
  def removePropertiesDeep(n: BooleanTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): BooleanTypeAnnotation = js.native
  def removePropertiesDeep(n: BreakStatement): BreakStatement = js.native
  def removePropertiesDeep(n: BreakStatement, opts: atBabelTypesLib.Anon_PreserveComments): BreakStatement = js.native
  def removePropertiesDeep(n: CallExpression): CallExpression = js.native
  def removePropertiesDeep(n: CallExpression, opts: atBabelTypesLib.Anon_PreserveComments): CallExpression = js.native
  def removePropertiesDeep(n: CatchClause): CatchClause = js.native
  def removePropertiesDeep(n: CatchClause, opts: atBabelTypesLib.Anon_PreserveComments): CatchClause = js.native
  def removePropertiesDeep(n: ClassBody): ClassBody = js.native
  def removePropertiesDeep(n: ClassBody, opts: atBabelTypesLib.Anon_PreserveComments): ClassBody = js.native
  def removePropertiesDeep(n: ClassDeclaration): ClassDeclaration = js.native
  def removePropertiesDeep(n: ClassDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): ClassDeclaration = js.native
  def removePropertiesDeep(n: ClassExpression): ClassExpression = js.native
  def removePropertiesDeep(n: ClassExpression, opts: atBabelTypesLib.Anon_PreserveComments): ClassExpression = js.native
  def removePropertiesDeep(n: ClassImplements): ClassImplements = js.native
  def removePropertiesDeep(n: ClassImplements, opts: atBabelTypesLib.Anon_PreserveComments): ClassImplements = js.native
  def removePropertiesDeep(n: ClassMethod): ClassMethod = js.native
  def removePropertiesDeep(n: ClassMethod, opts: atBabelTypesLib.Anon_PreserveComments): ClassMethod = js.native
  def removePropertiesDeep(n: ClassPrivateMethod): ClassPrivateMethod = js.native
  def removePropertiesDeep(n: ClassPrivateMethod, opts: atBabelTypesLib.Anon_PreserveComments): ClassPrivateMethod = js.native
  def removePropertiesDeep(n: ClassPrivateProperty): ClassPrivateProperty = js.native
  def removePropertiesDeep(n: ClassPrivateProperty, opts: atBabelTypesLib.Anon_PreserveComments): ClassPrivateProperty = js.native
  def removePropertiesDeep(n: ClassProperty): ClassProperty = js.native
  def removePropertiesDeep(n: ClassProperty, opts: atBabelTypesLib.Anon_PreserveComments): ClassProperty = js.native
  def removePropertiesDeep(n: ConditionalExpression): ConditionalExpression = js.native
  def removePropertiesDeep(n: ConditionalExpression, opts: atBabelTypesLib.Anon_PreserveComments): ConditionalExpression = js.native
  def removePropertiesDeep(n: ContinueStatement): ContinueStatement = js.native
  def removePropertiesDeep(n: ContinueStatement, opts: atBabelTypesLib.Anon_PreserveComments): ContinueStatement = js.native
  def removePropertiesDeep(n: DebuggerStatement): DebuggerStatement = js.native
  def removePropertiesDeep(n: DebuggerStatement, opts: atBabelTypesLib.Anon_PreserveComments): DebuggerStatement = js.native
  def removePropertiesDeep(n: DeclareClass): DeclareClass = js.native
  def removePropertiesDeep(n: DeclareClass, opts: atBabelTypesLib.Anon_PreserveComments): DeclareClass = js.native
  def removePropertiesDeep(n: DeclareExportAllDeclaration): DeclareExportAllDeclaration = js.native
  def removePropertiesDeep(n: DeclareExportAllDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): DeclareExportAllDeclaration = js.native
  def removePropertiesDeep(n: DeclareExportDeclaration): DeclareExportDeclaration = js.native
  def removePropertiesDeep(n: DeclareExportDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): DeclareExportDeclaration = js.native
  def removePropertiesDeep(n: DeclareFunction): DeclareFunction = js.native
  def removePropertiesDeep(n: DeclareFunction, opts: atBabelTypesLib.Anon_PreserveComments): DeclareFunction = js.native
  def removePropertiesDeep(n: DeclareInterface): DeclareInterface = js.native
  def removePropertiesDeep(n: DeclareInterface, opts: atBabelTypesLib.Anon_PreserveComments): DeclareInterface = js.native
  def removePropertiesDeep(n: DeclareModule): DeclareModule = js.native
  def removePropertiesDeep(n: DeclareModuleExports): DeclareModuleExports = js.native
  def removePropertiesDeep(n: DeclareModuleExports, opts: atBabelTypesLib.Anon_PreserveComments): DeclareModuleExports = js.native
  def removePropertiesDeep(n: DeclareModule, opts: atBabelTypesLib.Anon_PreserveComments): DeclareModule = js.native
  def removePropertiesDeep(n: DeclareOpaqueType): DeclareOpaqueType = js.native
  def removePropertiesDeep(n: DeclareOpaqueType, opts: atBabelTypesLib.Anon_PreserveComments): DeclareOpaqueType = js.native
  def removePropertiesDeep(n: DeclareTypeAlias): DeclareTypeAlias = js.native
  def removePropertiesDeep(n: DeclareTypeAlias, opts: atBabelTypesLib.Anon_PreserveComments): DeclareTypeAlias = js.native
  def removePropertiesDeep(n: DeclareVariable): DeclareVariable = js.native
  def removePropertiesDeep(n: DeclareVariable, opts: atBabelTypesLib.Anon_PreserveComments): DeclareVariable = js.native
  def removePropertiesDeep(n: DeclaredPredicate): DeclaredPredicate = js.native
  def removePropertiesDeep(n: DeclaredPredicate, opts: atBabelTypesLib.Anon_PreserveComments): DeclaredPredicate = js.native
  def removePropertiesDeep(n: Decorator): Decorator = js.native
  def removePropertiesDeep(n: Decorator, opts: atBabelTypesLib.Anon_PreserveComments): Decorator = js.native
  def removePropertiesDeep(n: Directive): Directive = js.native
  def removePropertiesDeep(n: DirectiveLiteral): DirectiveLiteral = js.native
  def removePropertiesDeep(n: DirectiveLiteral, opts: atBabelTypesLib.Anon_PreserveComments): DirectiveLiteral = js.native
  def removePropertiesDeep(n: Directive, opts: atBabelTypesLib.Anon_PreserveComments): Directive = js.native
  def removePropertiesDeep(n: DoExpression): DoExpression = js.native
  def removePropertiesDeep(n: DoExpression, opts: atBabelTypesLib.Anon_PreserveComments): DoExpression = js.native
  def removePropertiesDeep(n: DoWhileStatement): DoWhileStatement = js.native
  def removePropertiesDeep(n: DoWhileStatement, opts: atBabelTypesLib.Anon_PreserveComments): DoWhileStatement = js.native
  def removePropertiesDeep(n: EmptyStatement): EmptyStatement = js.native
  def removePropertiesDeep(n: EmptyStatement, opts: atBabelTypesLib.Anon_PreserveComments): EmptyStatement = js.native
  def removePropertiesDeep(n: EmptyTypeAnnotation): EmptyTypeAnnotation = js.native
  def removePropertiesDeep(n: EmptyTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): EmptyTypeAnnotation = js.native
  def removePropertiesDeep(n: ExistsTypeAnnotation): ExistsTypeAnnotation = js.native
  def removePropertiesDeep(n: ExistsTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): ExistsTypeAnnotation = js.native
  def removePropertiesDeep(n: ExportAllDeclaration): ExportAllDeclaration = js.native
  def removePropertiesDeep(n: ExportAllDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): ExportAllDeclaration = js.native
  def removePropertiesDeep(n: ExportDefaultDeclaration): ExportDefaultDeclaration = js.native
  def removePropertiesDeep(n: ExportDefaultDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): ExportDefaultDeclaration = js.native
  def removePropertiesDeep(n: ExportDefaultSpecifier): ExportDefaultSpecifier = js.native
  def removePropertiesDeep(n: ExportDefaultSpecifier, opts: atBabelTypesLib.Anon_PreserveComments): ExportDefaultSpecifier = js.native
  def removePropertiesDeep(n: ExportNamedDeclaration): ExportNamedDeclaration = js.native
  def removePropertiesDeep(n: ExportNamedDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): ExportNamedDeclaration = js.native
  def removePropertiesDeep(n: ExportNamespaceSpecifier): ExportNamespaceSpecifier = js.native
  def removePropertiesDeep(n: ExportNamespaceSpecifier, opts: atBabelTypesLib.Anon_PreserveComments): ExportNamespaceSpecifier = js.native
  def removePropertiesDeep(n: ExportSpecifier): ExportSpecifier = js.native
  def removePropertiesDeep(n: ExportSpecifier, opts: atBabelTypesLib.Anon_PreserveComments): ExportSpecifier = js.native
  def removePropertiesDeep(n: ExpressionStatement): ExpressionStatement = js.native
  def removePropertiesDeep(n: ExpressionStatement, opts: atBabelTypesLib.Anon_PreserveComments): ExpressionStatement = js.native
  def removePropertiesDeep(n: File): File = js.native
  def removePropertiesDeep(n: File, opts: atBabelTypesLib.Anon_PreserveComments): File = js.native
  def removePropertiesDeep(n: ForInStatement): ForInStatement = js.native
  def removePropertiesDeep(n: ForInStatement, opts: atBabelTypesLib.Anon_PreserveComments): ForInStatement = js.native
  def removePropertiesDeep(n: ForOfStatement): ForOfStatement = js.native
  def removePropertiesDeep(n: ForOfStatement, opts: atBabelTypesLib.Anon_PreserveComments): ForOfStatement = js.native
  def removePropertiesDeep(n: ForStatement): ForStatement = js.native
  def removePropertiesDeep(n: ForStatement, opts: atBabelTypesLib.Anon_PreserveComments): ForStatement = js.native
  def removePropertiesDeep(n: FunctionDeclaration): FunctionDeclaration = js.native
  def removePropertiesDeep(n: FunctionDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): FunctionDeclaration = js.native
  def removePropertiesDeep(n: FunctionExpression): FunctionExpression = js.native
  def removePropertiesDeep(n: FunctionExpression, opts: atBabelTypesLib.Anon_PreserveComments): FunctionExpression = js.native
  def removePropertiesDeep(n: FunctionTypeAnnotation): FunctionTypeAnnotation = js.native
  def removePropertiesDeep(n: FunctionTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): FunctionTypeAnnotation = js.native
  def removePropertiesDeep(n: FunctionTypeParam): FunctionTypeParam = js.native
  def removePropertiesDeep(n: FunctionTypeParam, opts: atBabelTypesLib.Anon_PreserveComments): FunctionTypeParam = js.native
  def removePropertiesDeep(n: GenericTypeAnnotation): GenericTypeAnnotation = js.native
  def removePropertiesDeep(n: GenericTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): GenericTypeAnnotation = js.native
  def removePropertiesDeep(n: Identifier): Identifier = js.native
  def removePropertiesDeep(n: Identifier, opts: atBabelTypesLib.Anon_PreserveComments): Identifier = js.native
  def removePropertiesDeep(n: IfStatement): IfStatement = js.native
  def removePropertiesDeep(n: IfStatement, opts: atBabelTypesLib.Anon_PreserveComments): IfStatement = js.native
  def removePropertiesDeep(n: Import): Import = js.native
  def removePropertiesDeep(n: ImportDeclaration): ImportDeclaration = js.native
  def removePropertiesDeep(n: ImportDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): ImportDeclaration = js.native
  def removePropertiesDeep(n: ImportDefaultSpecifier): ImportDefaultSpecifier = js.native
  def removePropertiesDeep(n: ImportDefaultSpecifier, opts: atBabelTypesLib.Anon_PreserveComments): ImportDefaultSpecifier = js.native
  def removePropertiesDeep(n: ImportNamespaceSpecifier): ImportNamespaceSpecifier = js.native
  def removePropertiesDeep(n: ImportNamespaceSpecifier, opts: atBabelTypesLib.Anon_PreserveComments): ImportNamespaceSpecifier = js.native
  def removePropertiesDeep(n: ImportSpecifier): ImportSpecifier = js.native
  def removePropertiesDeep(n: ImportSpecifier, opts: atBabelTypesLib.Anon_PreserveComments): ImportSpecifier = js.native
  def removePropertiesDeep(n: Import, opts: atBabelTypesLib.Anon_PreserveComments): Import = js.native
  def removePropertiesDeep(n: InferredPredicate): InferredPredicate = js.native
  def removePropertiesDeep(n: InferredPredicate, opts: atBabelTypesLib.Anon_PreserveComments): InferredPredicate = js.native
  def removePropertiesDeep(n: InterfaceDeclaration): InterfaceDeclaration = js.native
  def removePropertiesDeep(n: InterfaceDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): InterfaceDeclaration = js.native
  def removePropertiesDeep(n: InterfaceExtends): InterfaceExtends = js.native
  def removePropertiesDeep(n: InterfaceExtends, opts: atBabelTypesLib.Anon_PreserveComments): InterfaceExtends = js.native
  def removePropertiesDeep(n: InterfaceTypeAnnotation): InterfaceTypeAnnotation = js.native
  def removePropertiesDeep(n: InterfaceTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): InterfaceTypeAnnotation = js.native
  def removePropertiesDeep(n: InterpreterDirective): InterpreterDirective = js.native
  def removePropertiesDeep(n: InterpreterDirective, opts: atBabelTypesLib.Anon_PreserveComments): InterpreterDirective = js.native
  def removePropertiesDeep(n: IntersectionTypeAnnotation): IntersectionTypeAnnotation = js.native
  def removePropertiesDeep(n: IntersectionTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): IntersectionTypeAnnotation = js.native
  def removePropertiesDeep(n: JSXAttribute): JSXAttribute = js.native
  def removePropertiesDeep(n: JSXAttribute, opts: atBabelTypesLib.Anon_PreserveComments): JSXAttribute = js.native
  def removePropertiesDeep(n: JSXClosingElement): JSXClosingElement = js.native
  def removePropertiesDeep(n: JSXClosingElement, opts: atBabelTypesLib.Anon_PreserveComments): JSXClosingElement = js.native
  def removePropertiesDeep(n: JSXClosingFragment): JSXClosingFragment = js.native
  def removePropertiesDeep(n: JSXClosingFragment, opts: atBabelTypesLib.Anon_PreserveComments): JSXClosingFragment = js.native
  def removePropertiesDeep(n: JSXElement): JSXElement = js.native
  def removePropertiesDeep(n: JSXElement, opts: atBabelTypesLib.Anon_PreserveComments): JSXElement = js.native
  def removePropertiesDeep(n: JSXEmptyExpression): JSXEmptyExpression = js.native
  def removePropertiesDeep(n: JSXEmptyExpression, opts: atBabelTypesLib.Anon_PreserveComments): JSXEmptyExpression = js.native
  def removePropertiesDeep(n: JSXExpressionContainer): JSXExpressionContainer = js.native
  def removePropertiesDeep(n: JSXExpressionContainer, opts: atBabelTypesLib.Anon_PreserveComments): JSXExpressionContainer = js.native
  def removePropertiesDeep(n: JSXFragment): JSXFragment = js.native
  def removePropertiesDeep(n: JSXFragment, opts: atBabelTypesLib.Anon_PreserveComments): JSXFragment = js.native
  def removePropertiesDeep(n: JSXIdentifier): JSXIdentifier = js.native
  def removePropertiesDeep(n: JSXIdentifier, opts: atBabelTypesLib.Anon_PreserveComments): JSXIdentifier = js.native
  def removePropertiesDeep(n: JSXMemberExpression): JSXMemberExpression = js.native
  def removePropertiesDeep(n: JSXMemberExpression, opts: atBabelTypesLib.Anon_PreserveComments): JSXMemberExpression = js.native
  def removePropertiesDeep(n: JSXNamespacedName): JSXNamespacedName = js.native
  def removePropertiesDeep(n: JSXNamespacedName, opts: atBabelTypesLib.Anon_PreserveComments): JSXNamespacedName = js.native
  def removePropertiesDeep(n: JSXOpeningElement): JSXOpeningElement = js.native
  def removePropertiesDeep(n: JSXOpeningElement, opts: atBabelTypesLib.Anon_PreserveComments): JSXOpeningElement = js.native
  def removePropertiesDeep(n: JSXOpeningFragment): JSXOpeningFragment = js.native
  def removePropertiesDeep(n: JSXOpeningFragment, opts: atBabelTypesLib.Anon_PreserveComments): JSXOpeningFragment = js.native
  def removePropertiesDeep(n: JSXSpreadAttribute): JSXSpreadAttribute = js.native
  def removePropertiesDeep(n: JSXSpreadAttribute, opts: atBabelTypesLib.Anon_PreserveComments): JSXSpreadAttribute = js.native
  def removePropertiesDeep(n: JSXSpreadChild): JSXSpreadChild = js.native
  def removePropertiesDeep(n: JSXSpreadChild, opts: atBabelTypesLib.Anon_PreserveComments): JSXSpreadChild = js.native
  def removePropertiesDeep(n: JSXText): JSXText = js.native
  def removePropertiesDeep(n: JSXText, opts: atBabelTypesLib.Anon_PreserveComments): JSXText = js.native
  def removePropertiesDeep(n: LabeledStatement): LabeledStatement = js.native
  def removePropertiesDeep(n: LabeledStatement, opts: atBabelTypesLib.Anon_PreserveComments): LabeledStatement = js.native
  def removePropertiesDeep(n: LogicalExpression): LogicalExpression = js.native
  def removePropertiesDeep(n: LogicalExpression, opts: atBabelTypesLib.Anon_PreserveComments): LogicalExpression = js.native
  def removePropertiesDeep(n: MemberExpression): MemberExpression = js.native
  def removePropertiesDeep(n: MemberExpression, opts: atBabelTypesLib.Anon_PreserveComments): MemberExpression = js.native
  def removePropertiesDeep(n: MetaProperty): MetaProperty = js.native
  def removePropertiesDeep(n: MetaProperty, opts: atBabelTypesLib.Anon_PreserveComments): MetaProperty = js.native
  def removePropertiesDeep(n: MixedTypeAnnotation): MixedTypeAnnotation = js.native
  def removePropertiesDeep(n: MixedTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): MixedTypeAnnotation = js.native
  def removePropertiesDeep(n: NewExpression): NewExpression = js.native
  def removePropertiesDeep(n: NewExpression, opts: atBabelTypesLib.Anon_PreserveComments): NewExpression = js.native
  def removePropertiesDeep(n: Noop): Noop = js.native
  def removePropertiesDeep(n: Noop, opts: atBabelTypesLib.Anon_PreserveComments): Noop = js.native
  def removePropertiesDeep(n: NullLiteral): NullLiteral = js.native
  def removePropertiesDeep(n: NullLiteralTypeAnnotation): NullLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: NullLiteralTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): NullLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: NullLiteral, opts: atBabelTypesLib.Anon_PreserveComments): NullLiteral = js.native
  def removePropertiesDeep(n: NullableTypeAnnotation): NullableTypeAnnotation = js.native
  def removePropertiesDeep(n: NullableTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): NullableTypeAnnotation = js.native
  def removePropertiesDeep(n: NumberLiteralTypeAnnotation): NumberLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: NumberLiteralTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): NumberLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: NumberTypeAnnotation): NumberTypeAnnotation = js.native
  def removePropertiesDeep(n: NumberTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): NumberTypeAnnotation = js.native
  def removePropertiesDeep(n: NumericLiteral): NumericLiteral = js.native
  def removePropertiesDeep(n: NumericLiteral, opts: atBabelTypesLib.Anon_PreserveComments): NumericLiteral = js.native
  def removePropertiesDeep(n: ObjectExpression): ObjectExpression = js.native
  def removePropertiesDeep(n: ObjectExpression, opts: atBabelTypesLib.Anon_PreserveComments): ObjectExpression = js.native
  def removePropertiesDeep(n: ObjectMethod): ObjectMethod = js.native
  def removePropertiesDeep(n: ObjectMethod, opts: atBabelTypesLib.Anon_PreserveComments): ObjectMethod = js.native
  def removePropertiesDeep(n: ObjectPattern): ObjectPattern = js.native
  def removePropertiesDeep(n: ObjectPattern, opts: atBabelTypesLib.Anon_PreserveComments): ObjectPattern = js.native
  def removePropertiesDeep(n: ObjectProperty): ObjectProperty = js.native
  def removePropertiesDeep(n: ObjectProperty, opts: atBabelTypesLib.Anon_PreserveComments): ObjectProperty = js.native
  def removePropertiesDeep(n: ObjectTypeAnnotation): ObjectTypeAnnotation = js.native
  def removePropertiesDeep(n: ObjectTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): ObjectTypeAnnotation = js.native
  def removePropertiesDeep(n: ObjectTypeCallProperty): ObjectTypeCallProperty = js.native
  def removePropertiesDeep(n: ObjectTypeCallProperty, opts: atBabelTypesLib.Anon_PreserveComments): ObjectTypeCallProperty = js.native
  def removePropertiesDeep(n: ObjectTypeIndexer): ObjectTypeIndexer = js.native
  def removePropertiesDeep(n: ObjectTypeIndexer, opts: atBabelTypesLib.Anon_PreserveComments): ObjectTypeIndexer = js.native
  def removePropertiesDeep(n: ObjectTypeInternalSlot): ObjectTypeInternalSlot = js.native
  def removePropertiesDeep(n: ObjectTypeInternalSlot, opts: atBabelTypesLib.Anon_PreserveComments): ObjectTypeInternalSlot = js.native
  def removePropertiesDeep(n: ObjectTypeProperty): ObjectTypeProperty = js.native
  def removePropertiesDeep(n: ObjectTypeProperty, opts: atBabelTypesLib.Anon_PreserveComments): ObjectTypeProperty = js.native
  def removePropertiesDeep(n: ObjectTypeSpreadProperty): ObjectTypeSpreadProperty = js.native
  def removePropertiesDeep(n: ObjectTypeSpreadProperty, opts: atBabelTypesLib.Anon_PreserveComments): ObjectTypeSpreadProperty = js.native
  def removePropertiesDeep(n: OpaqueType): OpaqueType = js.native
  def removePropertiesDeep(n: OpaqueType, opts: atBabelTypesLib.Anon_PreserveComments): OpaqueType = js.native
  def removePropertiesDeep(n: OptionalCallExpression): OptionalCallExpression = js.native
  def removePropertiesDeep(n: OptionalCallExpression, opts: atBabelTypesLib.Anon_PreserveComments): OptionalCallExpression = js.native
  def removePropertiesDeep(n: OptionalMemberExpression): OptionalMemberExpression = js.native
  def removePropertiesDeep(n: OptionalMemberExpression, opts: atBabelTypesLib.Anon_PreserveComments): OptionalMemberExpression = js.native
  def removePropertiesDeep(n: ParenthesizedExpression): ParenthesizedExpression = js.native
  def removePropertiesDeep(n: ParenthesizedExpression, opts: atBabelTypesLib.Anon_PreserveComments): ParenthesizedExpression = js.native
  def removePropertiesDeep(n: PipelineBareFunction): PipelineBareFunction = js.native
  def removePropertiesDeep(n: PipelineBareFunction, opts: atBabelTypesLib.Anon_PreserveComments): PipelineBareFunction = js.native
  def removePropertiesDeep(n: PipelinePrimaryTopicReference): PipelinePrimaryTopicReference = js.native
  def removePropertiesDeep(n: PipelinePrimaryTopicReference, opts: atBabelTypesLib.Anon_PreserveComments): PipelinePrimaryTopicReference = js.native
  def removePropertiesDeep(n: PipelineTopicExpression): PipelineTopicExpression = js.native
  def removePropertiesDeep(n: PipelineTopicExpression, opts: atBabelTypesLib.Anon_PreserveComments): PipelineTopicExpression = js.native
  def removePropertiesDeep(n: Placeholder): Placeholder = js.native
  def removePropertiesDeep(n: Placeholder, opts: atBabelTypesLib.Anon_PreserveComments): Placeholder = js.native
  def removePropertiesDeep(n: PrivateName): PrivateName = js.native
  def removePropertiesDeep(n: PrivateName, opts: atBabelTypesLib.Anon_PreserveComments): PrivateName = js.native
  def removePropertiesDeep(n: Program): Program = js.native
  def removePropertiesDeep(n: Program, opts: atBabelTypesLib.Anon_PreserveComments): Program = js.native
  def removePropertiesDeep(n: QualifiedTypeIdentifier): QualifiedTypeIdentifier = js.native
  def removePropertiesDeep(n: QualifiedTypeIdentifier, opts: atBabelTypesLib.Anon_PreserveComments): QualifiedTypeIdentifier = js.native
  def removePropertiesDeep(n: RegExpLiteral): RegExpLiteral = js.native
  def removePropertiesDeep(n: RegExpLiteral, opts: atBabelTypesLib.Anon_PreserveComments): RegExpLiteral = js.native
  def removePropertiesDeep(n: RestElement): RestElement = js.native
  def removePropertiesDeep(n: RestElement, opts: atBabelTypesLib.Anon_PreserveComments): RestElement = js.native
  def removePropertiesDeep(n: ReturnStatement): ReturnStatement = js.native
  def removePropertiesDeep(n: ReturnStatement, opts: atBabelTypesLib.Anon_PreserveComments): ReturnStatement = js.native
  def removePropertiesDeep(n: SequenceExpression): SequenceExpression = js.native
  def removePropertiesDeep(n: SequenceExpression, opts: atBabelTypesLib.Anon_PreserveComments): SequenceExpression = js.native
  def removePropertiesDeep(n: SpreadElement): SpreadElement = js.native
  def removePropertiesDeep(n: SpreadElement, opts: atBabelTypesLib.Anon_PreserveComments): SpreadElement = js.native
  def removePropertiesDeep(n: StringLiteral): StringLiteral = js.native
  def removePropertiesDeep(n: StringLiteralTypeAnnotation): StringLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: StringLiteralTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): StringLiteralTypeAnnotation = js.native
  def removePropertiesDeep(n: StringLiteral, opts: atBabelTypesLib.Anon_PreserveComments): StringLiteral = js.native
  def removePropertiesDeep(n: StringTypeAnnotation): StringTypeAnnotation = js.native
  def removePropertiesDeep(n: StringTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): StringTypeAnnotation = js.native
  def removePropertiesDeep(n: Super): Super = js.native
  def removePropertiesDeep(n: Super, opts: atBabelTypesLib.Anon_PreserveComments): Super = js.native
  def removePropertiesDeep(n: SwitchCase): SwitchCase = js.native
  def removePropertiesDeep(n: SwitchCase, opts: atBabelTypesLib.Anon_PreserveComments): SwitchCase = js.native
  def removePropertiesDeep(n: SwitchStatement): SwitchStatement = js.native
  def removePropertiesDeep(n: SwitchStatement, opts: atBabelTypesLib.Anon_PreserveComments): SwitchStatement = js.native
  def removePropertiesDeep(n: TSAnyKeyword): TSAnyKeyword = js.native
  def removePropertiesDeep(n: TSAnyKeyword, opts: atBabelTypesLib.Anon_PreserveComments): TSAnyKeyword = js.native
  def removePropertiesDeep(n: TSArrayType): TSArrayType = js.native
  def removePropertiesDeep(n: TSArrayType, opts: atBabelTypesLib.Anon_PreserveComments): TSArrayType = js.native
  def removePropertiesDeep(n: TSAsExpression): TSAsExpression = js.native
  def removePropertiesDeep(n: TSAsExpression, opts: atBabelTypesLib.Anon_PreserveComments): TSAsExpression = js.native
  def removePropertiesDeep(n: TSBooleanKeyword): TSBooleanKeyword = js.native
  def removePropertiesDeep(n: TSBooleanKeyword, opts: atBabelTypesLib.Anon_PreserveComments): TSBooleanKeyword = js.native
  def removePropertiesDeep(n: TSCallSignatureDeclaration): TSCallSignatureDeclaration = js.native
  def removePropertiesDeep(n: TSCallSignatureDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): TSCallSignatureDeclaration = js.native
  def removePropertiesDeep(n: TSConditionalType): TSConditionalType = js.native
  def removePropertiesDeep(n: TSConditionalType, opts: atBabelTypesLib.Anon_PreserveComments): TSConditionalType = js.native
  def removePropertiesDeep(n: TSConstructSignatureDeclaration): TSConstructSignatureDeclaration = js.native
  def removePropertiesDeep(n: TSConstructSignatureDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): TSConstructSignatureDeclaration = js.native
  def removePropertiesDeep(n: TSConstructorType): TSConstructorType = js.native
  def removePropertiesDeep(n: TSConstructorType, opts: atBabelTypesLib.Anon_PreserveComments): TSConstructorType = js.native
  def removePropertiesDeep(n: TSDeclareFunction): TSDeclareFunction = js.native
  def removePropertiesDeep(n: TSDeclareFunction, opts: atBabelTypesLib.Anon_PreserveComments): TSDeclareFunction = js.native
  def removePropertiesDeep(n: TSDeclareMethod): TSDeclareMethod = js.native
  def removePropertiesDeep(n: TSDeclareMethod, opts: atBabelTypesLib.Anon_PreserveComments): TSDeclareMethod = js.native
  def removePropertiesDeep(n: TSEnumDeclaration): TSEnumDeclaration = js.native
  def removePropertiesDeep(n: TSEnumDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): TSEnumDeclaration = js.native
  def removePropertiesDeep(n: TSEnumMember): TSEnumMember = js.native
  def removePropertiesDeep(n: TSEnumMember, opts: atBabelTypesLib.Anon_PreserveComments): TSEnumMember = js.native
  def removePropertiesDeep(n: TSExportAssignment): TSExportAssignment = js.native
  def removePropertiesDeep(n: TSExportAssignment, opts: atBabelTypesLib.Anon_PreserveComments): TSExportAssignment = js.native
  def removePropertiesDeep(n: TSExpressionWithTypeArguments): TSExpressionWithTypeArguments = js.native
  def removePropertiesDeep(n: TSExpressionWithTypeArguments, opts: atBabelTypesLib.Anon_PreserveComments): TSExpressionWithTypeArguments = js.native
  def removePropertiesDeep(n: TSExternalModuleReference): TSExternalModuleReference = js.native
  def removePropertiesDeep(n: TSExternalModuleReference, opts: atBabelTypesLib.Anon_PreserveComments): TSExternalModuleReference = js.native
  def removePropertiesDeep(n: TSFunctionType): TSFunctionType = js.native
  def removePropertiesDeep(n: TSFunctionType, opts: atBabelTypesLib.Anon_PreserveComments): TSFunctionType = js.native
  def removePropertiesDeep(n: TSImportEqualsDeclaration): TSImportEqualsDeclaration = js.native
  def removePropertiesDeep(n: TSImportEqualsDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): TSImportEqualsDeclaration = js.native
  def removePropertiesDeep(n: TSImportType): TSImportType = js.native
  def removePropertiesDeep(n: TSImportType, opts: atBabelTypesLib.Anon_PreserveComments): TSImportType = js.native
  def removePropertiesDeep(n: TSIndexSignature): TSIndexSignature = js.native
  def removePropertiesDeep(n: TSIndexSignature, opts: atBabelTypesLib.Anon_PreserveComments): TSIndexSignature = js.native
  def removePropertiesDeep(n: TSIndexedAccessType): TSIndexedAccessType = js.native
  def removePropertiesDeep(n: TSIndexedAccessType, opts: atBabelTypesLib.Anon_PreserveComments): TSIndexedAccessType = js.native
  def removePropertiesDeep(n: TSInferType): TSInferType = js.native
  def removePropertiesDeep(n: TSInferType, opts: atBabelTypesLib.Anon_PreserveComments): TSInferType = js.native
  def removePropertiesDeep(n: TSInterfaceBody): TSInterfaceBody = js.native
  def removePropertiesDeep(n: TSInterfaceBody, opts: atBabelTypesLib.Anon_PreserveComments): TSInterfaceBody = js.native
  def removePropertiesDeep(n: TSInterfaceDeclaration): TSInterfaceDeclaration = js.native
  def removePropertiesDeep(n: TSInterfaceDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): TSInterfaceDeclaration = js.native
  def removePropertiesDeep(n: TSIntersectionType): TSIntersectionType = js.native
  def removePropertiesDeep(n: TSIntersectionType, opts: atBabelTypesLib.Anon_PreserveComments): TSIntersectionType = js.native
  def removePropertiesDeep(n: TSLiteralType): TSLiteralType = js.native
  def removePropertiesDeep(n: TSLiteralType, opts: atBabelTypesLib.Anon_PreserveComments): TSLiteralType = js.native
  def removePropertiesDeep(n: TSMappedType): TSMappedType = js.native
  def removePropertiesDeep(n: TSMappedType, opts: atBabelTypesLib.Anon_PreserveComments): TSMappedType = js.native
  def removePropertiesDeep(n: TSMethodSignature): TSMethodSignature = js.native
  def removePropertiesDeep(n: TSMethodSignature, opts: atBabelTypesLib.Anon_PreserveComments): TSMethodSignature = js.native
  def removePropertiesDeep(n: TSModuleBlock): TSModuleBlock = js.native
  def removePropertiesDeep(n: TSModuleBlock, opts: atBabelTypesLib.Anon_PreserveComments): TSModuleBlock = js.native
  def removePropertiesDeep(n: TSModuleDeclaration): TSModuleDeclaration = js.native
  def removePropertiesDeep(n: TSModuleDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): TSModuleDeclaration = js.native
  def removePropertiesDeep(n: TSNamespaceExportDeclaration): TSNamespaceExportDeclaration = js.native
  def removePropertiesDeep(n: TSNamespaceExportDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): TSNamespaceExportDeclaration = js.native
  def removePropertiesDeep(n: TSNeverKeyword): TSNeverKeyword = js.native
  def removePropertiesDeep(n: TSNeverKeyword, opts: atBabelTypesLib.Anon_PreserveComments): TSNeverKeyword = js.native
  def removePropertiesDeep(n: TSNonNullExpression): TSNonNullExpression = js.native
  def removePropertiesDeep(n: TSNonNullExpression, opts: atBabelTypesLib.Anon_PreserveComments): TSNonNullExpression = js.native
  def removePropertiesDeep(n: TSNullKeyword): TSNullKeyword = js.native
  def removePropertiesDeep(n: TSNullKeyword, opts: atBabelTypesLib.Anon_PreserveComments): TSNullKeyword = js.native
  def removePropertiesDeep(n: TSNumberKeyword): TSNumberKeyword = js.native
  def removePropertiesDeep(n: TSNumberKeyword, opts: atBabelTypesLib.Anon_PreserveComments): TSNumberKeyword = js.native
  def removePropertiesDeep(n: TSObjectKeyword): TSObjectKeyword = js.native
  def removePropertiesDeep(n: TSObjectKeyword, opts: atBabelTypesLib.Anon_PreserveComments): TSObjectKeyword = js.native
  def removePropertiesDeep(n: TSOptionalType): TSOptionalType = js.native
  def removePropertiesDeep(n: TSOptionalType, opts: atBabelTypesLib.Anon_PreserveComments): TSOptionalType = js.native
  def removePropertiesDeep(n: TSParameterProperty): TSParameterProperty = js.native
  def removePropertiesDeep(n: TSParameterProperty, opts: atBabelTypesLib.Anon_PreserveComments): TSParameterProperty = js.native
  def removePropertiesDeep(n: TSParenthesizedType): TSParenthesizedType = js.native
  def removePropertiesDeep(n: TSParenthesizedType, opts: atBabelTypesLib.Anon_PreserveComments): TSParenthesizedType = js.native
  def removePropertiesDeep(n: TSPropertySignature): TSPropertySignature = js.native
  def removePropertiesDeep(n: TSPropertySignature, opts: atBabelTypesLib.Anon_PreserveComments): TSPropertySignature = js.native
  def removePropertiesDeep(n: TSQualifiedName): TSQualifiedName = js.native
  def removePropertiesDeep(n: TSQualifiedName, opts: atBabelTypesLib.Anon_PreserveComments): TSQualifiedName = js.native
  def removePropertiesDeep(n: TSRestType): TSRestType = js.native
  def removePropertiesDeep(n: TSRestType, opts: atBabelTypesLib.Anon_PreserveComments): TSRestType = js.native
  def removePropertiesDeep(n: TSStringKeyword): TSStringKeyword = js.native
  def removePropertiesDeep(n: TSStringKeyword, opts: atBabelTypesLib.Anon_PreserveComments): TSStringKeyword = js.native
  def removePropertiesDeep(n: TSSymbolKeyword): TSSymbolKeyword = js.native
  def removePropertiesDeep(n: TSSymbolKeyword, opts: atBabelTypesLib.Anon_PreserveComments): TSSymbolKeyword = js.native
  def removePropertiesDeep(n: TSThisType): TSThisType = js.native
  def removePropertiesDeep(n: TSThisType, opts: atBabelTypesLib.Anon_PreserveComments): TSThisType = js.native
  def removePropertiesDeep(n: TSTupleType): TSTupleType = js.native
  def removePropertiesDeep(n: TSTupleType, opts: atBabelTypesLib.Anon_PreserveComments): TSTupleType = js.native
  def removePropertiesDeep(n: TSTypeAliasDeclaration): TSTypeAliasDeclaration = js.native
  def removePropertiesDeep(n: TSTypeAliasDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): TSTypeAliasDeclaration = js.native
  def removePropertiesDeep(n: TSTypeAnnotation): TSTypeAnnotation = js.native
  def removePropertiesDeep(n: TSTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): TSTypeAnnotation = js.native
  def removePropertiesDeep(n: TSTypeAssertion): TSTypeAssertion = js.native
  def removePropertiesDeep(n: TSTypeAssertion, opts: atBabelTypesLib.Anon_PreserveComments): TSTypeAssertion = js.native
  def removePropertiesDeep(n: TSTypeLiteral): TSTypeLiteral = js.native
  def removePropertiesDeep(n: TSTypeLiteral, opts: atBabelTypesLib.Anon_PreserveComments): TSTypeLiteral = js.native
  def removePropertiesDeep(n: TSTypeOperator): TSTypeOperator = js.native
  def removePropertiesDeep(n: TSTypeOperator, opts: atBabelTypesLib.Anon_PreserveComments): TSTypeOperator = js.native
  def removePropertiesDeep(n: TSTypeParameter): TSTypeParameter = js.native
  def removePropertiesDeep(n: TSTypeParameterDeclaration): TSTypeParameterDeclaration = js.native
  def removePropertiesDeep(n: TSTypeParameterDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): TSTypeParameterDeclaration = js.native
  def removePropertiesDeep(n: TSTypeParameterInstantiation): TSTypeParameterInstantiation = js.native
  def removePropertiesDeep(n: TSTypeParameterInstantiation, opts: atBabelTypesLib.Anon_PreserveComments): TSTypeParameterInstantiation = js.native
  def removePropertiesDeep(n: TSTypeParameter, opts: atBabelTypesLib.Anon_PreserveComments): TSTypeParameter = js.native
  def removePropertiesDeep(n: TSTypePredicate): TSTypePredicate = js.native
  def removePropertiesDeep(n: TSTypePredicate, opts: atBabelTypesLib.Anon_PreserveComments): TSTypePredicate = js.native
  def removePropertiesDeep(n: TSTypeQuery): TSTypeQuery = js.native
  def removePropertiesDeep(n: TSTypeQuery, opts: atBabelTypesLib.Anon_PreserveComments): TSTypeQuery = js.native
  def removePropertiesDeep(n: TSTypeReference): TSTypeReference = js.native
  def removePropertiesDeep(n: TSTypeReference, opts: atBabelTypesLib.Anon_PreserveComments): TSTypeReference = js.native
  def removePropertiesDeep(n: TSUndefinedKeyword): TSUndefinedKeyword = js.native
  def removePropertiesDeep(n: TSUndefinedKeyword, opts: atBabelTypesLib.Anon_PreserveComments): TSUndefinedKeyword = js.native
  def removePropertiesDeep(n: TSUnionType): TSUnionType = js.native
  def removePropertiesDeep(n: TSUnionType, opts: atBabelTypesLib.Anon_PreserveComments): TSUnionType = js.native
  def removePropertiesDeep(n: TSUnknownKeyword): TSUnknownKeyword = js.native
  def removePropertiesDeep(n: TSUnknownKeyword, opts: atBabelTypesLib.Anon_PreserveComments): TSUnknownKeyword = js.native
  def removePropertiesDeep(n: TSVoidKeyword): TSVoidKeyword = js.native
  def removePropertiesDeep(n: TSVoidKeyword, opts: atBabelTypesLib.Anon_PreserveComments): TSVoidKeyword = js.native
  def removePropertiesDeep(n: TaggedTemplateExpression): TaggedTemplateExpression = js.native
  def removePropertiesDeep(n: TaggedTemplateExpression, opts: atBabelTypesLib.Anon_PreserveComments): TaggedTemplateExpression = js.native
  def removePropertiesDeep(n: TemplateElement): TemplateElement = js.native
  def removePropertiesDeep(n: TemplateElement, opts: atBabelTypesLib.Anon_PreserveComments): TemplateElement = js.native
  def removePropertiesDeep(n: TemplateLiteral): TemplateLiteral = js.native
  def removePropertiesDeep(n: TemplateLiteral, opts: atBabelTypesLib.Anon_PreserveComments): TemplateLiteral = js.native
  def removePropertiesDeep(n: ThisExpression): ThisExpression = js.native
  def removePropertiesDeep(n: ThisExpression, opts: atBabelTypesLib.Anon_PreserveComments): ThisExpression = js.native
  def removePropertiesDeep(n: ThisTypeAnnotation): ThisTypeAnnotation = js.native
  def removePropertiesDeep(n: ThisTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): ThisTypeAnnotation = js.native
  def removePropertiesDeep(n: ThrowStatement): ThrowStatement = js.native
  def removePropertiesDeep(n: ThrowStatement, opts: atBabelTypesLib.Anon_PreserveComments): ThrowStatement = js.native
  def removePropertiesDeep(n: TryStatement): TryStatement = js.native
  def removePropertiesDeep(n: TryStatement, opts: atBabelTypesLib.Anon_PreserveComments): TryStatement = js.native
  def removePropertiesDeep(n: TupleTypeAnnotation): TupleTypeAnnotation = js.native
  def removePropertiesDeep(n: TupleTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): TupleTypeAnnotation = js.native
  def removePropertiesDeep(n: TypeAlias): TypeAlias = js.native
  def removePropertiesDeep(n: TypeAlias, opts: atBabelTypesLib.Anon_PreserveComments): TypeAlias = js.native
  def removePropertiesDeep(n: TypeAnnotation): TypeAnnotation = js.native
  def removePropertiesDeep(n: TypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): TypeAnnotation = js.native
  def removePropertiesDeep(n: TypeCastExpression): TypeCastExpression = js.native
  def removePropertiesDeep(n: TypeCastExpression, opts: atBabelTypesLib.Anon_PreserveComments): TypeCastExpression = js.native
  def removePropertiesDeep(n: TypeParameter): TypeParameter = js.native
  def removePropertiesDeep(n: TypeParameterDeclaration): TypeParameterDeclaration = js.native
  def removePropertiesDeep(n: TypeParameterDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): TypeParameterDeclaration = js.native
  def removePropertiesDeep(n: TypeParameterInstantiation): TypeParameterInstantiation = js.native
  def removePropertiesDeep(n: TypeParameterInstantiation, opts: atBabelTypesLib.Anon_PreserveComments): TypeParameterInstantiation = js.native
  def removePropertiesDeep(n: TypeParameter, opts: atBabelTypesLib.Anon_PreserveComments): TypeParameter = js.native
  def removePropertiesDeep(n: TypeofTypeAnnotation): TypeofTypeAnnotation = js.native
  def removePropertiesDeep(n: TypeofTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): TypeofTypeAnnotation = js.native
  def removePropertiesDeep(n: UnaryExpression): UnaryExpression = js.native
  def removePropertiesDeep(n: UnaryExpression, opts: atBabelTypesLib.Anon_PreserveComments): UnaryExpression = js.native
  def removePropertiesDeep(n: UnionTypeAnnotation): UnionTypeAnnotation = js.native
  def removePropertiesDeep(n: UnionTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): UnionTypeAnnotation = js.native
  def removePropertiesDeep(n: UpdateExpression): UpdateExpression = js.native
  def removePropertiesDeep(n: UpdateExpression, opts: atBabelTypesLib.Anon_PreserveComments): UpdateExpression = js.native
  def removePropertiesDeep(n: VariableDeclaration): VariableDeclaration = js.native
  def removePropertiesDeep(n: VariableDeclaration, opts: atBabelTypesLib.Anon_PreserveComments): VariableDeclaration = js.native
  def removePropertiesDeep(n: VariableDeclarator): VariableDeclarator = js.native
  def removePropertiesDeep(n: VariableDeclarator, opts: atBabelTypesLib.Anon_PreserveComments): VariableDeclarator = js.native
  def removePropertiesDeep(n: Variance): Variance = js.native
  def removePropertiesDeep(n: Variance, opts: atBabelTypesLib.Anon_PreserveComments): Variance = js.native
  def removePropertiesDeep(n: VoidTypeAnnotation): VoidTypeAnnotation = js.native
  def removePropertiesDeep(n: VoidTypeAnnotation, opts: atBabelTypesLib.Anon_PreserveComments): VoidTypeAnnotation = js.native
  def removePropertiesDeep(n: WhileStatement): WhileStatement = js.native
  def removePropertiesDeep(n: WhileStatement, opts: atBabelTypesLib.Anon_PreserveComments): WhileStatement = js.native
  def removePropertiesDeep(n: WithStatement): WithStatement = js.native
  def removePropertiesDeep(n: WithStatement, opts: atBabelTypesLib.Anon_PreserveComments): WithStatement = js.native
  def removePropertiesDeep(n: YieldExpression): YieldExpression = js.native
  def removePropertiesDeep(n: YieldExpression, opts: atBabelTypesLib.Anon_PreserveComments): YieldExpression = js.native
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
  def switchCase(test: js.UndefOr[scala.Nothing], consequent: js.Array[Statement]): SwitchCase = js.native
  def switchCase(test: Expression, consequent: js.Array[Statement]): SwitchCase = js.native
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
  def tsCallSignatureDeclaration(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier | RestElement]): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(typeParameters: TSTypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(typeParameters: scala.Null, parameters: js.Array[Identifier | RestElement]): TSCallSignatureDeclaration = js.native
  def tsCallSignatureDeclaration(
    typeParameters: scala.Null,
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
  def tsConstructSignatureDeclaration(typeParameters: TSTypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(typeParameters: scala.Null, parameters: js.Array[Identifier | RestElement]): TSConstructSignatureDeclaration = js.native
  def tsConstructSignatureDeclaration(
    typeParameters: scala.Null,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructSignatureDeclaration = js.native
  def tsConstructorType(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier | RestElement]): TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructorType = js.native
  def tsConstructorType(typeParameters: TSTypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructorType = js.native
  def tsConstructorType(typeParameters: scala.Null, parameters: js.Array[Identifier | RestElement]): TSConstructorType = js.native
  def tsConstructorType(
    typeParameters: scala.Null,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSConstructorType = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty]
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop,
    async: scala.Boolean
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop,
    async: scala.Boolean,
    declare: scala.Boolean
  ): TSDeclareFunction = js.native
  def tsDeclareFunction(
    id: js.UndefOr[Identifier | scala.Null],
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
    returnType: TSTypeAnnotation | Noop,
    async: scala.Boolean,
    declare: scala.Boolean,
    generator: scala.Boolean
  ): TSDeclareFunction = js.native
  def tsDeclareMethod(
    decorators: js.UndefOr[js.Array[Decorator] | scala.Null],
    key: Identifier | StringLiteral | NumericLiteral | Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | Noop | scala.Null],
    params: js.Array[Identifier | Pattern | RestElement | TSParameterProperty],
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
  def tsFunctionType(typeParameters: js.UndefOr[scala.Nothing], parameters: js.Array[Identifier | RestElement]): TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: js.UndefOr[scala.Nothing],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSFunctionType = js.native
  def tsFunctionType(typeParameters: TSTypeParameterDeclaration, parameters: js.Array[Identifier | RestElement]): TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: TSTypeParameterDeclaration,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSFunctionType = js.native
  def tsFunctionType(typeParameters: scala.Null, parameters: js.Array[Identifier | RestElement]): TSFunctionType = js.native
  def tsFunctionType(
    typeParameters: scala.Null,
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSFunctionType = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSEntityName): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSEntityName, isExport: scala.Boolean): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSExternalModuleReference): TSImportEqualsDeclaration = js.native
  def tsImportEqualsDeclaration(id: Identifier, moduleReference: TSExternalModuleReference, isExport: scala.Boolean): TSImportEqualsDeclaration = js.native
  def tsImportType(argument: StringLiteral): TSImportType = js.native
  def tsImportType(argument: StringLiteral, qualifier: TSEntityName): TSImportType = js.native
  def tsImportType(argument: StringLiteral, qualifier: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSImportType = js.native
  def tsImportType(argument: StringLiteral, qualifier: scala.Null, typeParameters: TSTypeParameterInstantiation): TSImportType = js.native
  def tsIndexSignature(parameters: js.Array[Identifier]): TSIndexSignature = js.native
  def tsIndexSignature(parameters: js.Array[Identifier], typeAnnotation: TSTypeAnnotation): TSIndexSignature = js.native
  def tsIndexSignature(parameters: js.Array[Identifier], typeAnnotation: TSTypeAnnotation, readonly: scala.Boolean): TSIndexSignature = js.native
  def tsIndexSignature(parameters: js.Array[Identifier], typeAnnotation: scala.Null, readonly: scala.Boolean): TSIndexSignature = js.native
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
  def tsMethodSignature(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | scala.Null],
    parameters: js.Array[Identifier | RestElement]
  ): TSMethodSignature = js.native
  def tsMethodSignature(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | scala.Null],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation
  ): TSMethodSignature = js.native
  def tsMethodSignature(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | scala.Null],
    parameters: js.Array[Identifier | RestElement],
    typeAnnotation: TSTypeAnnotation,
    computed: scala.Boolean
  ): TSMethodSignature = js.native
  def tsMethodSignature(
    key: Expression,
    typeParameters: js.UndefOr[TSTypeParameterDeclaration | scala.Null],
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
  def tsTypeAliasDeclaration(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: Identifier,
    typeParameters: js.UndefOr[scala.Nothing],
    typeAnnotation: TSType,
    declare: scala.Boolean
  ): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(id: Identifier, typeParameters: TSTypeParameterDeclaration, typeAnnotation: TSType): TSTypeAliasDeclaration = js.native
  def tsTypeAliasDeclaration(
    id: Identifier,
    typeParameters: TSTypeParameterDeclaration,
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
  def tsTypeQuery(exprName: TSImportType): TSTypeQuery = js.native
  def tsTypeReference(typeName: TSEntityName): TSTypeReference = js.native
  def tsTypeReference(typeName: TSEntityName, typeParameters: TSTypeParameterInstantiation): TSTypeReference = js.native
  def tsUndefinedKeyword(): TSUndefinedKeyword = js.native
  def tsUnionType(types: js.Array[TSType]): TSUnionType = js.native
  def tsUnknownKeyword(): TSUnknownKeyword = js.native
  def tsVoidKeyword(): TSVoidKeyword = js.native
  def tupleTypeAnnotation(types: js.Array[FlowType]): TupleTypeAnnotation = js.native
  def typeAlias(id: Identifier, typeParameters: js.UndefOr[scala.Nothing], right: FlowType): TypeAlias = js.native
  def typeAlias(id: Identifier, typeParameters: TypeParameterDeclaration, right: FlowType): TypeAlias = js.native
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
  def unaryExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`!`, argument: Expression): UnaryExpression = js.native
  def unaryExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`!`, argument: Expression, prefix: scala.Boolean): UnaryExpression = js.native
  def unaryExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`+`, argument: Expression): UnaryExpression = js.native
  def unaryExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`+`, argument: Expression, prefix: scala.Boolean): UnaryExpression = js.native
  def unaryExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`-`, argument: Expression): UnaryExpression = js.native
  def unaryExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`-`, argument: Expression, prefix: scala.Boolean): UnaryExpression = js.native
  def unaryExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`~`, argument: Expression): UnaryExpression = js.native
  def unaryExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`~`, argument: Expression, prefix: scala.Boolean): UnaryExpression = js.native
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
  def unionTypeAnnotation(types: js.Array[FlowType]): UnionTypeAnnotation = js.native
  def updateExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`++`, argument: Expression): UpdateExpression = js.native
  def updateExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`++`, argument: Expression, prefix: scala.Boolean): UpdateExpression = js.native
  def updateExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`--`, argument: Expression): UpdateExpression = js.native
  def updateExpression(operator: atBabelTypesLib.atBabelTypesLibStrings.`--`, argument: Expression, prefix: scala.Boolean): UpdateExpression = js.native
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

