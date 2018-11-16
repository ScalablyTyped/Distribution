package typings
package babelDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object babelDashTypesMod {
  type Binary = BinaryExpression | LogicalExpression
  type Block = BlockStatement | Program
  type BlockParent = BlockStatement | DoWhileStatement | ForInStatement | ForStatement | FunctionDeclaration | FunctionExpression | Program | ObjectMethod | SwitchStatement | WhileStatement | ArrowFunctionExpression | ForOfStatement | ClassMethod
  type Class = ClassDeclaration | ClassExpression
  type CompletionStatement = BreakStatement | ContinueStatement | ReturnStatement | ThrowStatement
  type Conditional = ConditionalExpression | IfStatement
  type Declaration = FunctionDeclaration | VariableDeclaration | ClassDeclaration | ExportAllDeclaration | ExportDefaultDeclaration | ExportNamedDeclaration | ImportDeclaration | DeclareClass | DeclareFunction | DeclareInterface | DeclareModule | DeclareTypeAlias | DeclareVariable | InterfaceDeclaration | TypeAlias | TSDeclareFunction | TSEnumDeclaration | TSInterfaceDeclaration | TSModuleDeclaration | TSTypeAliasDeclaration
  type ExportDeclaration = ExportAllDeclaration | ExportDefaultDeclaration | ExportNamedDeclaration
  type Expression = ArrayExpression | AssignmentExpression | BinaryExpression | CallExpression | ConditionalExpression | FunctionExpression | Identifier | StringLiteral | NumericLiteral | BooleanLiteral | NullLiteral | RegExpLiteral | LogicalExpression | MemberExpression | NewExpression | ObjectExpression | SequenceExpression | ThisExpression | UnaryExpression | UpdateExpression | ArrowFunctionExpression | ClassExpression | MetaProperty | Super | TaggedTemplateExpression | TemplateLiteral | YieldExpression | TypeCastExpression | JSXElement | JSXEmptyExpression | JSXIdentifier | JSXMemberExpression | ParenthesizedExpression | AwaitExpression | BindExpression | DoExpression | TSAsExpression | TSNonNullExpression | TSTypeAssertion
  type ExpressionWrapper = ExpressionStatement | TypeCastExpression | ParenthesizedExpression
  type Flow = AnyTypeAnnotation | ArrayTypeAnnotation | BooleanTypeAnnotation | BooleanLiteralTypeAnnotation | ClassImplements | ClassProperty | DeclareClass | DeclareFunction | DeclareInterface | DeclareModule | DeclareTypeAlias | DeclareVariable | ExistentialTypeParam | FunctionTypeAnnotation | FunctionTypeParam | GenericTypeAnnotation | InterfaceExtends | InterfaceDeclaration | IntersectionTypeAnnotation | MixedTypeAnnotation | NullableTypeAnnotation | NumericLiteralTypeAnnotation | NumberTypeAnnotation | StringLiteralTypeAnnotation | StringTypeAnnotation | ThisTypeAnnotation | TupleTypeAnnotation | TypeofTypeAnnotation | TypeAlias | TypeAnnotation | TypeCastExpression | TypeParameterDeclaration | TypeParameterInstantiation | ObjectTypeAnnotation | ObjectTypeCallProperty | ObjectTypeIndexer | ObjectTypeProperty | QualifiedTypeIdentifier | UnionTypeAnnotation | VoidTypeAnnotation
  type FlowBaseAnnotation = AnyTypeAnnotation | BooleanTypeAnnotation | MixedTypeAnnotation | NumberTypeAnnotation | StringTypeAnnotation | ThisTypeAnnotation | VoidTypeAnnotation
  type FlowDeclaration = DeclareClass | DeclareFunction | DeclareInterface | DeclareModule | DeclareTypeAlias | DeclareVariable | InterfaceDeclaration | TypeAlias
  type FlowTypeAnnotation = AnyTypeAnnotation | ArrayTypeAnnotation | BooleanTypeAnnotation | BooleanLiteralTypeAnnotation | FunctionTypeAnnotation | GenericTypeAnnotation | IntersectionTypeAnnotation | MixedTypeAnnotation | NullableTypeAnnotation | NumericLiteralTypeAnnotation | NumberTypeAnnotation | StringLiteralTypeAnnotation | StringTypeAnnotation | ThisTypeAnnotation | TupleTypeAnnotation | TypeofTypeAnnotation | TypeAnnotation | ObjectTypeAnnotation | UnionTypeAnnotation | VoidTypeAnnotation
  type For = ForInStatement | ForStatement | ForOfStatement
  type ForXStatement = ForInStatement | ForOfStatement
  type Function = FunctionDeclaration | FunctionExpression | ObjectMethod | ArrowFunctionExpression | ClassMethod
  type FunctionParent = FunctionDeclaration | FunctionExpression | Program | ObjectMethod | ArrowFunctionExpression | ClassMethod
  type Immutable = StringLiteral | NumericLiteral | BooleanLiteral | NullLiteral | JSXAttribute | JSXClosingElement | JSXElement | JSXExpressionContainer | JSXOpeningElement
  type JSX = JSXAttribute | JSXClosingElement | JSXElement | JSXEmptyExpression | JSXExpressionContainer | JSXIdentifier | JSXMemberExpression | JSXNamespacedName | JSXOpeningElement | JSXSpreadAttribute | JSXText
  type LVal = Identifier | MemberExpression | RestElement | AssignmentPattern | ArrayPattern | ObjectPattern | TSParameterProperty
  type Literal = StringLiteral | NumericLiteral | BooleanLiteral | NullLiteral | RegExpLiteral | TemplateLiteral
  type Loop = DoWhileStatement | ForInStatement | ForStatement | WhileStatement | ForOfStatement
  type Method = ObjectMethod | ClassMethod
  type ModuleDeclaration = ExportAllDeclaration | ExportDefaultDeclaration | ExportNamedDeclaration | ImportDeclaration
  type ModuleSpecifier = ExportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier | ImportSpecifier | ExportDefaultSpecifier | ExportNamespaceSpecifier
  type ObjectMember = ObjectMethod | ObjectProperty
  type Pattern = AssignmentPattern | ArrayPattern | ObjectPattern
  type Property = ObjectProperty | ClassProperty
  type Pureish = FunctionDeclaration | FunctionExpression | StringLiteral | NumericLiteral | BooleanLiteral | NullLiteral | ArrowFunctionExpression | ClassDeclaration | ClassExpression
  type Scopable = BlockStatement | CatchClause | DoWhileStatement | ForInStatement | ForStatement | FunctionDeclaration | FunctionExpression | Program | ObjectMethod | SwitchStatement | WhileStatement | ArrowFunctionExpression | ClassDeclaration | ClassExpression | ForOfStatement | ClassMethod
  type Statement = BlockStatement | BreakStatement | ContinueStatement | DebuggerStatement | DoWhileStatement | EmptyStatement | ExpressionStatement | ForInStatement | ForStatement | FunctionDeclaration | IfStatement | LabeledStatement | ReturnStatement | SwitchStatement | ThrowStatement | TryStatement | VariableDeclaration | WhileStatement | WithStatement | ClassDeclaration | ExportAllDeclaration | ExportDefaultDeclaration | ExportNamedDeclaration | ForOfStatement | ImportDeclaration | DeclareClass | DeclareFunction | DeclareInterface | DeclareModule | DeclareTypeAlias | DeclareVariable | InterfaceDeclaration | TypeAlias | TSDeclareFunction | TSEnumDeclaration | TSExportAssignment | TSImportEqualsDeclaration | TSInterfaceDeclaration | TSModuleDeclaration | TSNamespaceExportDeclaration | TSTypeAliasDeclaration
  type TSEntityName = Identifier | TSQualifiedName
  type TSType = TSAnyKeyword | TSArrayType | TSBooleanKeyword | TSConstructorType | TSExpressionWithTypeArguments | TSFunctionType | TSIndexedAccessType | TSIntersectionType | TSLiteralType | TSMappedType | TSNeverKeyword | TSNullKeyword | TSNumberKeyword | TSObjectKeyword | TSParenthesizedType | TSStringKeyword | TSSymbolKeyword | TSThisType | TSTupleType | TSTypeLiteral | TSTypeOperator | TSTypePredicate | TSTypeQuery | TSTypeReference | TSUndefinedKeyword | TSUnionType | TSVoidKeyword
  type TSTypeElement = TSCallSignatureDeclaration | TSConstructSignatureDeclaration | TSIndexSignature | TSMethodSignature | TSPropertySignature
  type Terminatorless = BreakStatement | ContinueStatement | ReturnStatement | ThrowStatement | YieldExpression | AwaitExpression
  type UnaryLike = UnaryExpression | SpreadElement | RestProperty | SpreadProperty
  type UserWhitespacable = ObjectMethod | ObjectProperty | ObjectTypeCallProperty | ObjectTypeIndexer | ObjectTypeProperty
  type While = DoWhileStatement | WhileStatement
}
