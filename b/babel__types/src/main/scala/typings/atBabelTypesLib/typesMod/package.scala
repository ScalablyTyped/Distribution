package typings
package atBabelTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Binary = BinaryExpression | LogicalExpression
  type Block = BlockStatement | Program
  type BlockParent = BlockStatement | CatchClause | DoWhileStatement | ForInStatement | ForStatement | FunctionDeclaration | FunctionExpression | Program | ObjectMethod | SwitchStatement | WhileStatement | ArrowFunctionExpression | ForOfStatement | ClassMethod
  type Class = ClassDeclaration | ClassExpression
  type Comment = CommentBlock | CommentLine
  type CompletionStatement = BreakStatement | ContinueStatement | ReturnStatement | ThrowStatement
  type Conditional = ConditionalExpression | IfStatement
  type Declaration = FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExportAllDeclaration | ExportDefaultDeclaration | ExportNamedDeclaration | ImportDeclaration | DeclareClass | DeclareFunction | DeclareInterface | DeclareModule | DeclareModuleExports | DeclareTypeAlias | DeclareOpaqueType | DeclareVariable | DeclareExportDeclaration | DeclareExportAllDeclaration | InterfaceDeclaration | OpaqueType | TypeAlias | TSDeclareFunction | TSInterfaceDeclaration | TSTypeAliasDeclaration | TSEnumDeclaration | TSModuleDeclaration
  type ExportDeclaration = ExportAllDeclaration | ExportDefaultDeclaration | ExportNamedDeclaration
  type Expression = ArrayExpression | AssignmentExpression | BinaryExpression | CallExpression | ConditionalExpression | FunctionExpression | Identifier | StringLiteral | NumericLiteral | NullLiteral | BooleanLiteral | RegExpLiteral | LogicalExpression | MemberExpression | NewExpression | ObjectExpression | SequenceExpression | ThisExpression | UnaryExpression | UpdateExpression | ArrowFunctionExpression | ClassExpression | MetaProperty | Super | TaggedTemplateExpression | TemplateLiteral | YieldExpression | TypeCastExpression | JSXElement | JSXFragment | ParenthesizedExpression | AwaitExpression | BindExpression | OptionalMemberExpression | PipelinePrimaryTopicReference | OptionalCallExpression | Import | DoExpression | BigIntLiteral | TSAsExpression | TSTypeAssertion | TSNonNullExpression
  type ExpressionWrapper = ExpressionStatement | TypeCastExpression | ParenthesizedExpression
  type Flow = /* LimitUnionLength: was union type with length 53 */js.Any
  type FlowBaseAnnotation = AnyTypeAnnotation | BooleanTypeAnnotation | NullLiteralTypeAnnotation | MixedTypeAnnotation | EmptyTypeAnnotation | NumberTypeAnnotation | StringTypeAnnotation | ThisTypeAnnotation | VoidTypeAnnotation
  type FlowDeclaration = DeclareClass | DeclareFunction | DeclareInterface | DeclareModule | DeclareModuleExports | DeclareTypeAlias | DeclareOpaqueType | DeclareVariable | DeclareExportDeclaration | DeclareExportAllDeclaration | InterfaceDeclaration | OpaqueType | TypeAlias
  type FlowPredicate = DeclaredPredicate | InferredPredicate
  type FlowType = AnyTypeAnnotation | ArrayTypeAnnotation | BooleanTypeAnnotation | BooleanLiteralTypeAnnotation | NullLiteralTypeAnnotation | ExistsTypeAnnotation | FunctionTypeAnnotation | GenericTypeAnnotation | InterfaceTypeAnnotation | IntersectionTypeAnnotation | MixedTypeAnnotation | EmptyTypeAnnotation | NullableTypeAnnotation | NumberLiteralTypeAnnotation | NumberTypeAnnotation | ObjectTypeAnnotation | StringLiteralTypeAnnotation | StringTypeAnnotation | ThisTypeAnnotation | TupleTypeAnnotation | TypeofTypeAnnotation | UnionTypeAnnotation | VoidTypeAnnotation
  type For = ForInStatement | ForStatement | ForOfStatement
  type ForXStatement = ForInStatement | ForOfStatement
  type Function = FunctionDeclaration | FunctionExpression | ObjectMethod | ArrowFunctionExpression | ClassMethod | ClassPrivateMethod
  type FunctionParent = FunctionDeclaration | FunctionExpression | ObjectMethod | ArrowFunctionExpression | ClassMethod
  type Immutable = StringLiteral | NumericLiteral | NullLiteral | BooleanLiteral | JSXAttribute | JSXClosingElement | JSXElement | JSXExpressionContainer | JSXSpreadChild | JSXOpeningElement | JSXText | JSXFragment | JSXOpeningFragment | JSXClosingFragment | BigIntLiteral
  type JSX = JSXAttribute | JSXClosingElement | JSXElement | JSXEmptyExpression | JSXExpressionContainer | JSXSpreadChild | JSXIdentifier | JSXMemberExpression | JSXNamespacedName | JSXOpeningElement | JSXSpreadAttribute | JSXText | JSXFragment | JSXOpeningFragment | JSXClosingFragment
  type LVal = Identifier | MemberExpression | RestElement | AssignmentPattern | ArrayPattern | ObjectPattern | TSParameterProperty
  type Literal = StringLiteral | NumericLiteral | NullLiteral | BooleanLiteral | RegExpLiteral | TemplateLiteral | BigIntLiteral
  type Loop = DoWhileStatement | ForInStatement | ForStatement | WhileStatement | ForOfStatement
  type Method = ObjectMethod | ClassMethod | ClassPrivateMethod
  type ModuleDeclaration = ExportAllDeclaration | ExportDefaultDeclaration | ExportNamedDeclaration | ImportDeclaration
  type ModuleSpecifier = ExportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier | ImportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier
  type Node = /* LimitUnionLength: was union type with length 266 */js.Any
  type NumberLiteral = NumericLiteral
  type ObjectMember = ObjectMethod | ObjectProperty
  type Pattern = AssignmentPattern | ArrayPattern | ObjectPattern
  type PatternLike = Identifier | RestElement | AssignmentPattern | ArrayPattern | ObjectPattern
  type Private = ClassPrivateProperty | ClassPrivateMethod | PrivateName
  type Property = ObjectProperty | ClassProperty | ClassPrivateProperty
  type Pureish = FunctionDeclaration | FunctionExpression | StringLiteral | NumericLiteral | NullLiteral | BooleanLiteral | ArrowFunctionExpression | ClassDeclaration | ClassExpression | BigIntLiteral
  type RegexLiteral = RegExpLiteral
  type RestProperty = RestElement
  type Scopable = BlockStatement | CatchClause | DoWhileStatement | ForInStatement | ForStatement | FunctionDeclaration | FunctionExpression | Program | ObjectMethod | SwitchStatement | WhileStatement | ArrowFunctionExpression | ClassDeclaration | ClassExpression | ForOfStatement | ClassMethod
  type SpreadProperty = SpreadElement
  type Statement = BlockStatement | BreakStatement | ContinueStatement | DebuggerStatement | DoWhileStatement | EmptyStatement | ExpressionStatement | ForInStatement | ForStatement | FunctionDeclaration | IfStatement | LabeledStatement | ReturnStatement | SwitchStatement | ThrowStatement | TryStatement | VariableDeclaration | WhileStatement | WithStatement | ClassDeclaration | ExportAllDeclaration | ExportDefaultDeclaration | ExportNamedDeclaration | ForOfStatement | ImportDeclaration | DeclareClass | DeclareFunction | DeclareInterface | DeclareModule | DeclareModuleExports | DeclareTypeAlias | DeclareOpaqueType | DeclareVariable | DeclareExportDeclaration | DeclareExportAllDeclaration | InterfaceDeclaration | OpaqueType | TypeAlias | TSDeclareFunction | TSInterfaceDeclaration | TSTypeAliasDeclaration | TSEnumDeclaration | TSModuleDeclaration | TSImportEqualsDeclaration | TSExportAssignment | TSNamespaceExportDeclaration
  type TSEntityName = Identifier | TSQualifiedName
  type TSType = TSAnyKeyword | TSUnknownKeyword | TSNumberKeyword | TSObjectKeyword | TSBooleanKeyword | TSStringKeyword | TSSymbolKeyword | TSVoidKeyword | TSUndefinedKeyword | TSNullKeyword | TSNeverKeyword | TSThisType | TSFunctionType | TSConstructorType | TSTypeReference | TSTypePredicate | TSTypeQuery | TSTypeLiteral | TSArrayType | TSTupleType | TSOptionalType | TSRestType | TSUnionType | TSIntersectionType | TSConditionalType | TSInferType | TSParenthesizedType | TSTypeOperator | TSIndexedAccessType | TSMappedType | TSLiteralType | TSExpressionWithTypeArguments
  type TSTypeElement = TSCallSignatureDeclaration | TSConstructSignatureDeclaration | TSPropertySignature | TSMethodSignature | TSIndexSignature
  type Terminatorless = BreakStatement | ContinueStatement | ReturnStatement | ThrowStatement | YieldExpression | AwaitExpression
  type TraversalAncestors = js.Array[atBabelTypesLib.Anon_Node]
  type TraversalHandler[T] = js.Function3[/* node */ Node, /* parent */ TraversalAncestors, /* type */ T, scala.Unit]
  type UnaryLike = UnaryExpression | SpreadElement
  type UserWhitespacable = ObjectMethod | ObjectProperty | ObjectTypeInternalSlot | ObjectTypeCallProperty | ObjectTypeIndexer | ObjectTypeProperty | ObjectTypeSpreadProperty
  type While = DoWhileStatement | WhileStatement
}
