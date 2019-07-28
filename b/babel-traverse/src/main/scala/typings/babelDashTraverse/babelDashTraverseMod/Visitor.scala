package typings.babelDashTraverse.babelDashTraverseMod

import typings.babelDashTypes.babelDashTypesMod.AnyTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.ArrayExpression
import typings.babelDashTypes.babelDashTypesMod.ArrayPattern
import typings.babelDashTypes.babelDashTypesMod.ArrayTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.ArrowFunctionExpression
import typings.babelDashTypes.babelDashTypesMod.AssignmentExpression
import typings.babelDashTypes.babelDashTypesMod.AssignmentPattern
import typings.babelDashTypes.babelDashTypesMod.AwaitExpression
import typings.babelDashTypes.babelDashTypesMod.Binary
import typings.babelDashTypes.babelDashTypesMod.BinaryExpression
import typings.babelDashTypes.babelDashTypesMod.BindExpression
import typings.babelDashTypes.babelDashTypesMod.Block
import typings.babelDashTypes.babelDashTypesMod.BlockParent
import typings.babelDashTypes.babelDashTypesMod.BlockStatement
import typings.babelDashTypes.babelDashTypesMod.BooleanLiteral
import typings.babelDashTypes.babelDashTypesMod.BooleanLiteralTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.BooleanTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.BreakStatement
import typings.babelDashTypes.babelDashTypesMod.CallExpression
import typings.babelDashTypes.babelDashTypesMod.CatchClause
import typings.babelDashTypes.babelDashTypesMod.Class
import typings.babelDashTypes.babelDashTypesMod.ClassBody
import typings.babelDashTypes.babelDashTypesMod.ClassDeclaration
import typings.babelDashTypes.babelDashTypesMod.ClassExpression
import typings.babelDashTypes.babelDashTypesMod.ClassImplements
import typings.babelDashTypes.babelDashTypesMod.ClassMethod
import typings.babelDashTypes.babelDashTypesMod.ClassProperty
import typings.babelDashTypes.babelDashTypesMod.CompletionStatement
import typings.babelDashTypes.babelDashTypesMod.Conditional
import typings.babelDashTypes.babelDashTypesMod.ConditionalExpression
import typings.babelDashTypes.babelDashTypesMod.ContinueStatement
import typings.babelDashTypes.babelDashTypesMod.DebuggerStatement
import typings.babelDashTypes.babelDashTypesMod.Declaration
import typings.babelDashTypes.babelDashTypesMod.DeclareClass
import typings.babelDashTypes.babelDashTypesMod.DeclareFunction
import typings.babelDashTypes.babelDashTypesMod.DeclareInterface
import typings.babelDashTypes.babelDashTypesMod.DeclareModule
import typings.babelDashTypes.babelDashTypesMod.DeclareTypeAlias
import typings.babelDashTypes.babelDashTypesMod.DeclareVariable
import typings.babelDashTypes.babelDashTypesMod.Decorator
import typings.babelDashTypes.babelDashTypesMod.Directive
import typings.babelDashTypes.babelDashTypesMod.DirectiveLiteral
import typings.babelDashTypes.babelDashTypesMod.DoExpression
import typings.babelDashTypes.babelDashTypesMod.DoWhileStatement
import typings.babelDashTypes.babelDashTypesMod.EmptyStatement
import typings.babelDashTypes.babelDashTypesMod.ExistentialTypeParam
import typings.babelDashTypes.babelDashTypesMod.ExportAllDeclaration
import typings.babelDashTypes.babelDashTypesMod.ExportDeclaration
import typings.babelDashTypes.babelDashTypesMod.ExportDefaultDeclaration
import typings.babelDashTypes.babelDashTypesMod.ExportDefaultSpecifier
import typings.babelDashTypes.babelDashTypesMod.ExportNamedDeclaration
import typings.babelDashTypes.babelDashTypesMod.ExportNamespaceSpecifier
import typings.babelDashTypes.babelDashTypesMod.ExportSpecifier
import typings.babelDashTypes.babelDashTypesMod.Expression
import typings.babelDashTypes.babelDashTypesMod.ExpressionStatement
import typings.babelDashTypes.babelDashTypesMod.ExpressionWrapper
import typings.babelDashTypes.babelDashTypesMod.File
import typings.babelDashTypes.babelDashTypesMod.Flow
import typings.babelDashTypes.babelDashTypesMod.FlowBaseAnnotation
import typings.babelDashTypes.babelDashTypesMod.FlowDeclaration
import typings.babelDashTypes.babelDashTypesMod.For
import typings.babelDashTypes.babelDashTypesMod.ForInStatement
import typings.babelDashTypes.babelDashTypesMod.ForOfStatement
import typings.babelDashTypes.babelDashTypesMod.ForStatement
import typings.babelDashTypes.babelDashTypesMod.ForXStatement
import typings.babelDashTypes.babelDashTypesMod.Function
import typings.babelDashTypes.babelDashTypesMod.FunctionDeclaration
import typings.babelDashTypes.babelDashTypesMod.FunctionExpression
import typings.babelDashTypes.babelDashTypesMod.FunctionParent
import typings.babelDashTypes.babelDashTypesMod.FunctionTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.FunctionTypeParam
import typings.babelDashTypes.babelDashTypesMod.GenericTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.Identifier
import typings.babelDashTypes.babelDashTypesMod.IfStatement
import typings.babelDashTypes.babelDashTypesMod.Immutable
import typings.babelDashTypes.babelDashTypesMod.ImportDeclaration
import typings.babelDashTypes.babelDashTypesMod.ImportDefaultSpecifier
import typings.babelDashTypes.babelDashTypesMod.ImportNamespaceSpecifier
import typings.babelDashTypes.babelDashTypesMod.ImportSpecifier
import typings.babelDashTypes.babelDashTypesMod.InterfaceDeclaration
import typings.babelDashTypes.babelDashTypesMod.InterfaceExtends
import typings.babelDashTypes.babelDashTypesMod.IntersectionTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.JSX
import typings.babelDashTypes.babelDashTypesMod.JSXAttribute
import typings.babelDashTypes.babelDashTypesMod.JSXClosingElement
import typings.babelDashTypes.babelDashTypesMod.JSXElement
import typings.babelDashTypes.babelDashTypesMod.JSXEmptyExpression
import typings.babelDashTypes.babelDashTypesMod.JSXExpressionContainer
import typings.babelDashTypes.babelDashTypesMod.JSXIdentifier
import typings.babelDashTypes.babelDashTypesMod.JSXMemberExpression
import typings.babelDashTypes.babelDashTypesMod.JSXNamespacedName
import typings.babelDashTypes.babelDashTypesMod.JSXOpeningElement
import typings.babelDashTypes.babelDashTypesMod.JSXSpreadAttribute
import typings.babelDashTypes.babelDashTypesMod.JSXText
import typings.babelDashTypes.babelDashTypesMod.LVal
import typings.babelDashTypes.babelDashTypesMod.LabeledStatement
import typings.babelDashTypes.babelDashTypesMod.Literal
import typings.babelDashTypes.babelDashTypesMod.LogicalExpression
import typings.babelDashTypes.babelDashTypesMod.Loop
import typings.babelDashTypes.babelDashTypesMod.MemberExpression
import typings.babelDashTypes.babelDashTypesMod.MetaProperty
import typings.babelDashTypes.babelDashTypesMod.Method
import typings.babelDashTypes.babelDashTypesMod.MixedTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.ModuleDeclaration
import typings.babelDashTypes.babelDashTypesMod.ModuleSpecifier
import typings.babelDashTypes.babelDashTypesMod.NewExpression
import typings.babelDashTypes.babelDashTypesMod.Noop
import typings.babelDashTypes.babelDashTypesMod.NullLiteral
import typings.babelDashTypes.babelDashTypesMod.NullLiteralTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.NullableTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.NumberTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.NumericLiteral
import typings.babelDashTypes.babelDashTypesMod.NumericLiteralTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.ObjectExpression
import typings.babelDashTypes.babelDashTypesMod.ObjectMember
import typings.babelDashTypes.babelDashTypesMod.ObjectMethod
import typings.babelDashTypes.babelDashTypesMod.ObjectPattern
import typings.babelDashTypes.babelDashTypesMod.ObjectProperty
import typings.babelDashTypes.babelDashTypesMod.ObjectTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.ObjectTypeCallProperty
import typings.babelDashTypes.babelDashTypesMod.ObjectTypeIndexer
import typings.babelDashTypes.babelDashTypesMod.ObjectTypeProperty
import typings.babelDashTypes.babelDashTypesMod.ParenthesizedExpression
import typings.babelDashTypes.babelDashTypesMod.Pattern
import typings.babelDashTypes.babelDashTypesMod.Program
import typings.babelDashTypes.babelDashTypesMod.Property
import typings.babelDashTypes.babelDashTypesMod.Pureish
import typings.babelDashTypes.babelDashTypesMod.QualifiedTypeIdentifier
import typings.babelDashTypes.babelDashTypesMod.RegExpLiteral
import typings.babelDashTypes.babelDashTypesMod.RestElement
import typings.babelDashTypes.babelDashTypesMod.RestProperty
import typings.babelDashTypes.babelDashTypesMod.ReturnStatement
import typings.babelDashTypes.babelDashTypesMod.Scopable
import typings.babelDashTypes.babelDashTypesMod.SequenceExpression
import typings.babelDashTypes.babelDashTypesMod.SpreadElement
import typings.babelDashTypes.babelDashTypesMod.SpreadProperty
import typings.babelDashTypes.babelDashTypesMod.Statement
import typings.babelDashTypes.babelDashTypesMod.StringLiteral
import typings.babelDashTypes.babelDashTypesMod.StringLiteralTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.StringTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.Super
import typings.babelDashTypes.babelDashTypesMod.SwitchCase
import typings.babelDashTypes.babelDashTypesMod.SwitchStatement
import typings.babelDashTypes.babelDashTypesMod.TaggedTemplateExpression
import typings.babelDashTypes.babelDashTypesMod.TemplateElement
import typings.babelDashTypes.babelDashTypesMod.TemplateLiteral
import typings.babelDashTypes.babelDashTypesMod.Terminatorless
import typings.babelDashTypes.babelDashTypesMod.ThisExpression
import typings.babelDashTypes.babelDashTypesMod.ThisTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.ThrowStatement
import typings.babelDashTypes.babelDashTypesMod.TryStatement
import typings.babelDashTypes.babelDashTypesMod.TupleTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.TypeAlias
import typings.babelDashTypes.babelDashTypesMod.TypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.TypeCastExpression
import typings.babelDashTypes.babelDashTypesMod.TypeParameterDeclaration
import typings.babelDashTypes.babelDashTypesMod.TypeParameterInstantiation
import typings.babelDashTypes.babelDashTypesMod.TypeofTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.UnaryExpression
import typings.babelDashTypes.babelDashTypesMod.UnaryLike
import typings.babelDashTypes.babelDashTypesMod.UnionTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.UpdateExpression
import typings.babelDashTypes.babelDashTypesMod.UserWhitespacable
import typings.babelDashTypes.babelDashTypesMod.VariableDeclaration
import typings.babelDashTypes.babelDashTypesMod.VariableDeclarator
import typings.babelDashTypes.babelDashTypesMod.VoidTypeAnnotation
import typings.babelDashTypes.babelDashTypesMod.While
import typings.babelDashTypes.babelDashTypesMod.WhileStatement
import typings.babelDashTypes.babelDashTypesMod.WithStatement
import typings.babelDashTypes.babelDashTypesMod.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor[S] extends VisitNodeObject[Node] {
  var AnyTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.AnyTypeAnnotation]] = js.undefined
  var ArrayExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ArrayExpression]] = js.undefined
  var ArrayPattern: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ArrayPattern]] = js.undefined
  var ArrayTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ArrayTypeAnnotation]] = js.undefined
  var ArrowFunctionExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ArrowFunctionExpression]] = js.undefined
  var AssignmentExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.AssignmentExpression]] = js.undefined
  var AssignmentPattern: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.AssignmentPattern]] = js.undefined
  var AwaitExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.AwaitExpression]] = js.undefined
  var Binary: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Binary]] = js.undefined
  var BinaryExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.BinaryExpression]] = js.undefined
  var BindExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.BindExpression]] = js.undefined
  var Block: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Block]] = js.undefined
  var BlockParent: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.BlockParent]] = js.undefined
  var BlockStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.BlockStatement]] = js.undefined
  var BooleanLiteral: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.BooleanLiteral]] = js.undefined
  var BooleanLiteralTypeAnnotation: js.UndefOr[
    VisitNode[S, typings.babelDashTypes.babelDashTypesMod.BooleanLiteralTypeAnnotation]
  ] = js.undefined
  var BooleanTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.BooleanTypeAnnotation]] = js.undefined
  var BreakStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.BreakStatement]] = js.undefined
  var CallExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.CallExpression]] = js.undefined
  var CatchClause: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.CatchClause]] = js.undefined
  var Class: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Class]] = js.undefined
  var ClassBody: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ClassBody]] = js.undefined
  var ClassDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ClassDeclaration]] = js.undefined
  var ClassExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ClassExpression]] = js.undefined
  var ClassImplements: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ClassImplements]] = js.undefined
  var ClassMethod: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ClassMethod]] = js.undefined
  var ClassProperty: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ClassProperty]] = js.undefined
  var CompletionStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.CompletionStatement]] = js.undefined
  var Conditional: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Conditional]] = js.undefined
  var ConditionalExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ConditionalExpression]] = js.undefined
  var ContinueStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ContinueStatement]] = js.undefined
  var DebuggerStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.DebuggerStatement]] = js.undefined
  var Declaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Declaration]] = js.undefined
  var DeclareClass: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.DeclareClass]] = js.undefined
  var DeclareFunction: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.DeclareFunction]] = js.undefined
  var DeclareInterface: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.DeclareInterface]] = js.undefined
  var DeclareModule: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.DeclareModule]] = js.undefined
  var DeclareTypeAlias: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.DeclareTypeAlias]] = js.undefined
  var DeclareVariable: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.DeclareVariable]] = js.undefined
  var Decorator: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Decorator]] = js.undefined
  var Directive: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Directive]] = js.undefined
  var DirectiveLiteral: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.DirectiveLiteral]] = js.undefined
  var DoExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.DoExpression]] = js.undefined
  var DoWhileStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.DoWhileStatement]] = js.undefined
  var EmptyStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.EmptyStatement]] = js.undefined
  var ExistentialTypeParam: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ExistentialTypeParam]] = js.undefined
  var ExportAllDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ExportAllDeclaration]] = js.undefined
  var ExportDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ExportDeclaration]] = js.undefined
  var ExportDefaultDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ExportDefaultDeclaration]] = js.undefined
  var ExportDefaultSpecifier: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ExportDefaultSpecifier]] = js.undefined
  var ExportNamedDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ExportNamedDeclaration]] = js.undefined
  var ExportNamespaceSpecifier: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ExportNamespaceSpecifier]] = js.undefined
  var ExportSpecifier: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ExportSpecifier]] = js.undefined
  var Expression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Expression]] = js.undefined
  var ExpressionStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ExpressionStatement]] = js.undefined
  var ExpressionWrapper: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ExpressionWrapper]] = js.undefined
  var File: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.File]] = js.undefined
  var Flow: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Flow]] = js.undefined
  var FlowBaseAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.FlowBaseAnnotation]] = js.undefined
  var FlowDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.FlowDeclaration]] = js.undefined
  var For: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.For]] = js.undefined
  var ForInStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ForInStatement]] = js.undefined
  var ForOfStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ForOfStatement]] = js.undefined
  var ForStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ForStatement]] = js.undefined
  var ForXStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ForXStatement]] = js.undefined
  var Function: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Function]] = js.undefined
  var FunctionDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.FunctionDeclaration]] = js.undefined
  var FunctionExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.FunctionExpression]] = js.undefined
  var FunctionParent: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.FunctionParent]] = js.undefined
  var FunctionTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.FunctionTypeAnnotation]] = js.undefined
  var FunctionTypeParam: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.FunctionTypeParam]] = js.undefined
  var GenericTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.GenericTypeAnnotation]] = js.undefined
  var Identifier: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Identifier]] = js.undefined
  var IfStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.IfStatement]] = js.undefined
  var Immutable: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Immutable]] = js.undefined
  var ImportDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ImportDeclaration]] = js.undefined
  var ImportDefaultSpecifier: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ImportDefaultSpecifier]] = js.undefined
  var ImportNamespaceSpecifier: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ImportNamespaceSpecifier]] = js.undefined
  var ImportSpecifier: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ImportSpecifier]] = js.undefined
  var InterfaceDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.InterfaceDeclaration]] = js.undefined
  var InterfaceExtends: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.InterfaceExtends]] = js.undefined
  var IntersectionTypeAnnotation: js.UndefOr[
    VisitNode[S, typings.babelDashTypes.babelDashTypesMod.IntersectionTypeAnnotation]
  ] = js.undefined
  var JSX: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSX]] = js.undefined
  var JSXAttribute: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSXAttribute]] = js.undefined
  var JSXClosingElement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSXClosingElement]] = js.undefined
  var JSXElement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSXElement]] = js.undefined
  var JSXEmptyExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSXEmptyExpression]] = js.undefined
  var JSXExpressionContainer: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSXExpressionContainer]] = js.undefined
  var JSXIdentifier: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSXIdentifier]] = js.undefined
  var JSXMemberExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSXMemberExpression]] = js.undefined
  var JSXNamespacedName: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSXNamespacedName]] = js.undefined
  var JSXOpeningElement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSXOpeningElement]] = js.undefined
  var JSXSpreadAttribute: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSXSpreadAttribute]] = js.undefined
  var JSXText: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.JSXText]] = js.undefined
  var LVal: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.LVal]] = js.undefined
  var LabeledStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.LabeledStatement]] = js.undefined
  var Literal: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Literal]] = js.undefined
  var LogicalExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.LogicalExpression]] = js.undefined
  var Loop: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Loop]] = js.undefined
  var MemberExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.MemberExpression]] = js.undefined
  var MetaProperty: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.MetaProperty]] = js.undefined
  var Method: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Method]] = js.undefined
  var MixedTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.MixedTypeAnnotation]] = js.undefined
  var ModuleDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ModuleDeclaration]] = js.undefined
  var ModuleSpecifier: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ModuleSpecifier]] = js.undefined
  var NewExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.NewExpression]] = js.undefined
  var Noop: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Noop]] = js.undefined
  var NullLiteral: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.NullLiteral]] = js.undefined
  var NullLiteralTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.NullLiteralTypeAnnotation]] = js.undefined
  var NullableTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.NullableTypeAnnotation]] = js.undefined
  var NumberTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.NumberTypeAnnotation]] = js.undefined
  var NumericLiteral: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.NumericLiteral]] = js.undefined
  var NumericLiteralTypeAnnotation: js.UndefOr[
    VisitNode[S, typings.babelDashTypes.babelDashTypesMod.NumericLiteralTypeAnnotation]
  ] = js.undefined
  var ObjectExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ObjectExpression]] = js.undefined
  var ObjectMember: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ObjectMember]] = js.undefined
  var ObjectMethod: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ObjectMethod]] = js.undefined
  var ObjectPattern: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ObjectPattern]] = js.undefined
  var ObjectProperty: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ObjectProperty]] = js.undefined
  var ObjectTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ObjectTypeAnnotation]] = js.undefined
  var ObjectTypeCallProperty: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ObjectTypeCallProperty]] = js.undefined
  var ObjectTypeIndexer: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ObjectTypeIndexer]] = js.undefined
  var ObjectTypeProperty: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ObjectTypeProperty]] = js.undefined
  var ParenthesizedExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ParenthesizedExpression]] = js.undefined
  var Pattern: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Pattern]] = js.undefined
  var Program: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Program]] = js.undefined
  var Property: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Property]] = js.undefined
  var Pureish: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Pureish]] = js.undefined
  var QualifiedTypeIdentifier: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.QualifiedTypeIdentifier]] = js.undefined
  var RegExpLiteral: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.RegExpLiteral]] = js.undefined
  var RestElement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.RestElement]] = js.undefined
  var RestProperty: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.RestProperty]] = js.undefined
  var ReturnStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ReturnStatement]] = js.undefined
  var Scopable: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Scopable]] = js.undefined
  var Scope: js.UndefOr[VisitNode[S, Scopable]] = js.undefined
  var SequenceExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.SequenceExpression]] = js.undefined
  var SpreadElement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.SpreadElement]] = js.undefined
  var SpreadProperty: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.SpreadProperty]] = js.undefined
  var Statement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Statement]] = js.undefined
  var StringLiteral: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.StringLiteral]] = js.undefined
  var StringLiteralTypeAnnotation: js.UndefOr[
    VisitNode[S, typings.babelDashTypes.babelDashTypesMod.StringLiteralTypeAnnotation]
  ] = js.undefined
  var StringTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.StringTypeAnnotation]] = js.undefined
  var Super: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Super]] = js.undefined
  var SwitchCase: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.SwitchCase]] = js.undefined
  var SwitchStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.SwitchStatement]] = js.undefined
  var TaggedTemplateExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.TaggedTemplateExpression]] = js.undefined
  var TemplateElement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.TemplateElement]] = js.undefined
  var TemplateLiteral: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.TemplateLiteral]] = js.undefined
  var Terminatorless: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.Terminatorless]] = js.undefined
  var ThisExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ThisExpression]] = js.undefined
  var ThisTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ThisTypeAnnotation]] = js.undefined
  var ThrowStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.ThrowStatement]] = js.undefined
  var TryStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.TryStatement]] = js.undefined
  var TupleTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.TupleTypeAnnotation]] = js.undefined
  var TypeAlias: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.TypeAlias]] = js.undefined
  var TypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.TypeAnnotation]] = js.undefined
  var TypeCastExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.TypeCastExpression]] = js.undefined
  var TypeParameterDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.TypeParameterDeclaration]] = js.undefined
  var TypeParameterInstantiation: js.UndefOr[
    VisitNode[S, typings.babelDashTypes.babelDashTypesMod.TypeParameterInstantiation]
  ] = js.undefined
  var TypeofTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.TypeofTypeAnnotation]] = js.undefined
  var UnaryExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.UnaryExpression]] = js.undefined
  var UnaryLike: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.UnaryLike]] = js.undefined
  var UnionTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.UnionTypeAnnotation]] = js.undefined
  var UpdateExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.UpdateExpression]] = js.undefined
  var UserWhitespacable: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.UserWhitespacable]] = js.undefined
  var VariableDeclaration: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.VariableDeclaration]] = js.undefined
  var VariableDeclarator: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.VariableDeclarator]] = js.undefined
  var VoidTypeAnnotation: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.VoidTypeAnnotation]] = js.undefined
  var While: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.While]] = js.undefined
  var WhileStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.WhileStatement]] = js.undefined
  var WithStatement: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.WithStatement]] = js.undefined
  var YieldExpression: js.UndefOr[VisitNode[S, typings.babelDashTypes.babelDashTypesMod.YieldExpression]] = js.undefined
}

object Visitor {
  @scala.inline
  def apply[S](
    AnyTypeAnnotation: VisitNode[S, AnyTypeAnnotation] = null,
    ArrayExpression: VisitNode[S, ArrayExpression] = null,
    ArrayPattern: VisitNode[S, ArrayPattern] = null,
    ArrayTypeAnnotation: VisitNode[S, ArrayTypeAnnotation] = null,
    ArrowFunctionExpression: VisitNode[S, ArrowFunctionExpression] = null,
    AssignmentExpression: VisitNode[S, AssignmentExpression] = null,
    AssignmentPattern: VisitNode[S, AssignmentPattern] = null,
    AwaitExpression: VisitNode[S, AwaitExpression] = null,
    Binary: VisitNode[S, Binary] = null,
    BinaryExpression: VisitNode[S, BinaryExpression] = null,
    BindExpression: VisitNode[S, BindExpression] = null,
    Block: VisitNode[S, Block] = null,
    BlockParent: VisitNode[S, BlockParent] = null,
    BlockStatement: VisitNode[S, BlockStatement] = null,
    BooleanLiteral: VisitNode[S, BooleanLiteral] = null,
    BooleanLiteralTypeAnnotation: VisitNode[S, BooleanLiteralTypeAnnotation] = null,
    BooleanTypeAnnotation: VisitNode[S, BooleanTypeAnnotation] = null,
    BreakStatement: VisitNode[S, BreakStatement] = null,
    CallExpression: VisitNode[S, CallExpression] = null,
    CatchClause: VisitNode[S, CatchClause] = null,
    Class: VisitNode[S, Class] = null,
    ClassBody: VisitNode[S, ClassBody] = null,
    ClassDeclaration: VisitNode[S, ClassDeclaration] = null,
    ClassExpression: VisitNode[S, ClassExpression] = null,
    ClassImplements: VisitNode[S, ClassImplements] = null,
    ClassMethod: VisitNode[S, ClassMethod] = null,
    ClassProperty: VisitNode[S, ClassProperty] = null,
    CompletionStatement: VisitNode[S, CompletionStatement] = null,
    Conditional: VisitNode[S, Conditional] = null,
    ConditionalExpression: VisitNode[S, ConditionalExpression] = null,
    ContinueStatement: VisitNode[S, ContinueStatement] = null,
    DebuggerStatement: VisitNode[S, DebuggerStatement] = null,
    Declaration: VisitNode[S, Declaration] = null,
    DeclareClass: VisitNode[S, DeclareClass] = null,
    DeclareFunction: VisitNode[S, DeclareFunction] = null,
    DeclareInterface: VisitNode[S, DeclareInterface] = null,
    DeclareModule: VisitNode[S, DeclareModule] = null,
    DeclareTypeAlias: VisitNode[S, DeclareTypeAlias] = null,
    DeclareVariable: VisitNode[S, DeclareVariable] = null,
    Decorator: VisitNode[S, Decorator] = null,
    Directive: VisitNode[S, Directive] = null,
    DirectiveLiteral: VisitNode[S, DirectiveLiteral] = null,
    DoExpression: VisitNode[S, DoExpression] = null,
    DoWhileStatement: VisitNode[S, DoWhileStatement] = null,
    EmptyStatement: VisitNode[S, EmptyStatement] = null,
    ExistentialTypeParam: VisitNode[S, ExistentialTypeParam] = null,
    ExportAllDeclaration: VisitNode[S, ExportAllDeclaration] = null,
    ExportDeclaration: VisitNode[S, ExportDeclaration] = null,
    ExportDefaultDeclaration: VisitNode[S, ExportDefaultDeclaration] = null,
    ExportDefaultSpecifier: VisitNode[S, ExportDefaultSpecifier] = null,
    ExportNamedDeclaration: VisitNode[S, ExportNamedDeclaration] = null,
    ExportNamespaceSpecifier: VisitNode[S, ExportNamespaceSpecifier] = null,
    ExportSpecifier: VisitNode[S, ExportSpecifier] = null,
    Expression: VisitNode[S, Expression] = null,
    ExpressionStatement: VisitNode[S, ExpressionStatement] = null,
    ExpressionWrapper: VisitNode[S, ExpressionWrapper] = null,
    File: VisitNode[S, File] = null,
    Flow: VisitNode[S, Flow] = null,
    FlowBaseAnnotation: VisitNode[S, FlowBaseAnnotation] = null,
    FlowDeclaration: VisitNode[S, FlowDeclaration] = null,
    For: VisitNode[S, For] = null,
    ForInStatement: VisitNode[S, ForInStatement] = null,
    ForOfStatement: VisitNode[S, ForOfStatement] = null,
    ForStatement: VisitNode[S, ForStatement] = null,
    ForXStatement: VisitNode[S, ForXStatement] = null,
    Function: VisitNode[S, Function] = null,
    FunctionDeclaration: VisitNode[S, FunctionDeclaration] = null,
    FunctionExpression: VisitNode[S, FunctionExpression] = null,
    FunctionParent: VisitNode[S, FunctionParent] = null,
    FunctionTypeAnnotation: VisitNode[S, FunctionTypeAnnotation] = null,
    FunctionTypeParam: VisitNode[S, FunctionTypeParam] = null,
    GenericTypeAnnotation: VisitNode[S, GenericTypeAnnotation] = null,
    Identifier: VisitNode[S, Identifier] = null,
    IfStatement: VisitNode[S, IfStatement] = null,
    Immutable: VisitNode[S, Immutable] = null,
    ImportDeclaration: VisitNode[S, ImportDeclaration] = null,
    ImportDefaultSpecifier: VisitNode[S, ImportDefaultSpecifier] = null,
    ImportNamespaceSpecifier: VisitNode[S, ImportNamespaceSpecifier] = null,
    ImportSpecifier: VisitNode[S, ImportSpecifier] = null,
    InterfaceDeclaration: VisitNode[S, InterfaceDeclaration] = null,
    InterfaceExtends: VisitNode[S, InterfaceExtends] = null,
    IntersectionTypeAnnotation: VisitNode[S, IntersectionTypeAnnotation] = null,
    JSX: VisitNode[S, JSX] = null,
    JSXAttribute: VisitNode[S, JSXAttribute] = null,
    JSXClosingElement: VisitNode[S, JSXClosingElement] = null,
    JSXElement: VisitNode[S, JSXElement] = null,
    JSXEmptyExpression: VisitNode[S, JSXEmptyExpression] = null,
    JSXExpressionContainer: VisitNode[S, JSXExpressionContainer] = null,
    JSXIdentifier: VisitNode[S, JSXIdentifier] = null,
    JSXMemberExpression: VisitNode[S, JSXMemberExpression] = null,
    JSXNamespacedName: VisitNode[S, JSXNamespacedName] = null,
    JSXOpeningElement: VisitNode[S, JSXOpeningElement] = null,
    JSXSpreadAttribute: VisitNode[S, JSXSpreadAttribute] = null,
    JSXText: VisitNode[S, JSXText] = null,
    LVal: VisitNode[S, LVal] = null,
    LabeledStatement: VisitNode[S, LabeledStatement] = null,
    Literal: VisitNode[S, Literal] = null,
    LogicalExpression: VisitNode[S, LogicalExpression] = null,
    Loop: VisitNode[S, Loop] = null,
    MemberExpression: VisitNode[S, MemberExpression] = null,
    MetaProperty: VisitNode[S, MetaProperty] = null,
    Method: VisitNode[S, Method] = null,
    MixedTypeAnnotation: VisitNode[S, MixedTypeAnnotation] = null,
    ModuleDeclaration: VisitNode[S, ModuleDeclaration] = null,
    ModuleSpecifier: VisitNode[S, ModuleSpecifier] = null,
    NewExpression: VisitNode[S, NewExpression] = null,
    Noop: VisitNode[S, Noop] = null,
    NullLiteral: VisitNode[S, NullLiteral] = null,
    NullLiteralTypeAnnotation: VisitNode[S, NullLiteralTypeAnnotation] = null,
    NullableTypeAnnotation: VisitNode[S, NullableTypeAnnotation] = null,
    NumberTypeAnnotation: VisitNode[S, NumberTypeAnnotation] = null,
    NumericLiteral: VisitNode[S, NumericLiteral] = null,
    NumericLiteralTypeAnnotation: VisitNode[S, NumericLiteralTypeAnnotation] = null,
    ObjectExpression: VisitNode[S, ObjectExpression] = null,
    ObjectMember: VisitNode[S, ObjectMember] = null,
    ObjectMethod: VisitNode[S, ObjectMethod] = null,
    ObjectPattern: VisitNode[S, ObjectPattern] = null,
    ObjectProperty: VisitNode[S, ObjectProperty] = null,
    ObjectTypeAnnotation: VisitNode[S, ObjectTypeAnnotation] = null,
    ObjectTypeCallProperty: VisitNode[S, ObjectTypeCallProperty] = null,
    ObjectTypeIndexer: VisitNode[S, ObjectTypeIndexer] = null,
    ObjectTypeProperty: VisitNode[S, ObjectTypeProperty] = null,
    ParenthesizedExpression: VisitNode[S, ParenthesizedExpression] = null,
    Pattern: VisitNode[S, Pattern] = null,
    Program: VisitNode[S, Program] = null,
    Property: VisitNode[S, Property] = null,
    Pureish: VisitNode[S, Pureish] = null,
    QualifiedTypeIdentifier: VisitNode[S, QualifiedTypeIdentifier] = null,
    RegExpLiteral: VisitNode[S, RegExpLiteral] = null,
    RestElement: VisitNode[S, RestElement] = null,
    RestProperty: VisitNode[S, RestProperty] = null,
    ReturnStatement: VisitNode[S, ReturnStatement] = null,
    Scopable: VisitNode[S, Scopable] = null,
    Scope: VisitNode[S, Scopable] = null,
    SequenceExpression: VisitNode[S, SequenceExpression] = null,
    SpreadElement: VisitNode[S, SpreadElement] = null,
    SpreadProperty: VisitNode[S, SpreadProperty] = null,
    Statement: VisitNode[S, Statement] = null,
    StringLiteral: VisitNode[S, StringLiteral] = null,
    StringLiteralTypeAnnotation: VisitNode[S, StringLiteralTypeAnnotation] = null,
    StringTypeAnnotation: VisitNode[S, StringTypeAnnotation] = null,
    Super: VisitNode[S, Super] = null,
    SwitchCase: VisitNode[S, SwitchCase] = null,
    SwitchStatement: VisitNode[S, SwitchStatement] = null,
    TaggedTemplateExpression: VisitNode[S, TaggedTemplateExpression] = null,
    TemplateElement: VisitNode[S, TemplateElement] = null,
    TemplateLiteral: VisitNode[S, TemplateLiteral] = null,
    Terminatorless: VisitNode[S, Terminatorless] = null,
    ThisExpression: VisitNode[S, ThisExpression] = null,
    ThisTypeAnnotation: VisitNode[S, ThisTypeAnnotation] = null,
    ThrowStatement: VisitNode[S, ThrowStatement] = null,
    TryStatement: VisitNode[S, TryStatement] = null,
    TupleTypeAnnotation: VisitNode[S, TupleTypeAnnotation] = null,
    TypeAlias: VisitNode[S, TypeAlias] = null,
    TypeAnnotation: VisitNode[S, TypeAnnotation] = null,
    TypeCastExpression: VisitNode[S, TypeCastExpression] = null,
    TypeParameterDeclaration: VisitNode[S, TypeParameterDeclaration] = null,
    TypeParameterInstantiation: VisitNode[S, TypeParameterInstantiation] = null,
    TypeofTypeAnnotation: VisitNode[S, TypeofTypeAnnotation] = null,
    UnaryExpression: VisitNode[S, UnaryExpression] = null,
    UnaryLike: VisitNode[S, UnaryLike] = null,
    UnionTypeAnnotation: VisitNode[S, UnionTypeAnnotation] = null,
    UpdateExpression: VisitNode[S, UpdateExpression] = null,
    UserWhitespacable: VisitNode[S, UserWhitespacable] = null,
    VariableDeclaration: VisitNode[S, VariableDeclaration] = null,
    VariableDeclarator: VisitNode[S, VariableDeclarator] = null,
    VoidTypeAnnotation: VisitNode[S, VoidTypeAnnotation] = null,
    While: VisitNode[S, While] = null,
    WhileStatement: VisitNode[S, WhileStatement] = null,
    WithStatement: VisitNode[S, WithStatement] = null,
    YieldExpression: VisitNode[S, YieldExpression] = null,
    enter: (/* path */ NodePath[Node], /* state */ js.Any) => Unit = null,
    exit: (/* path */ NodePath[Node], /* state */ js.Any) => Unit = null
  ): Visitor[S] = {
    val __obj = js.Dynamic.literal()
    if (AnyTypeAnnotation != null) __obj.updateDynamic("AnyTypeAnnotation")(AnyTypeAnnotation.asInstanceOf[js.Any])
    if (ArrayExpression != null) __obj.updateDynamic("ArrayExpression")(ArrayExpression.asInstanceOf[js.Any])
    if (ArrayPattern != null) __obj.updateDynamic("ArrayPattern")(ArrayPattern.asInstanceOf[js.Any])
    if (ArrayTypeAnnotation != null) __obj.updateDynamic("ArrayTypeAnnotation")(ArrayTypeAnnotation.asInstanceOf[js.Any])
    if (ArrowFunctionExpression != null) __obj.updateDynamic("ArrowFunctionExpression")(ArrowFunctionExpression.asInstanceOf[js.Any])
    if (AssignmentExpression != null) __obj.updateDynamic("AssignmentExpression")(AssignmentExpression.asInstanceOf[js.Any])
    if (AssignmentPattern != null) __obj.updateDynamic("AssignmentPattern")(AssignmentPattern.asInstanceOf[js.Any])
    if (AwaitExpression != null) __obj.updateDynamic("AwaitExpression")(AwaitExpression.asInstanceOf[js.Any])
    if (Binary != null) __obj.updateDynamic("Binary")(Binary.asInstanceOf[js.Any])
    if (BinaryExpression != null) __obj.updateDynamic("BinaryExpression")(BinaryExpression.asInstanceOf[js.Any])
    if (BindExpression != null) __obj.updateDynamic("BindExpression")(BindExpression.asInstanceOf[js.Any])
    if (Block != null) __obj.updateDynamic("Block")(Block.asInstanceOf[js.Any])
    if (BlockParent != null) __obj.updateDynamic("BlockParent")(BlockParent.asInstanceOf[js.Any])
    if (BlockStatement != null) __obj.updateDynamic("BlockStatement")(BlockStatement.asInstanceOf[js.Any])
    if (BooleanLiteral != null) __obj.updateDynamic("BooleanLiteral")(BooleanLiteral.asInstanceOf[js.Any])
    if (BooleanLiteralTypeAnnotation != null) __obj.updateDynamic("BooleanLiteralTypeAnnotation")(BooleanLiteralTypeAnnotation.asInstanceOf[js.Any])
    if (BooleanTypeAnnotation != null) __obj.updateDynamic("BooleanTypeAnnotation")(BooleanTypeAnnotation.asInstanceOf[js.Any])
    if (BreakStatement != null) __obj.updateDynamic("BreakStatement")(BreakStatement.asInstanceOf[js.Any])
    if (CallExpression != null) __obj.updateDynamic("CallExpression")(CallExpression.asInstanceOf[js.Any])
    if (CatchClause != null) __obj.updateDynamic("CatchClause")(CatchClause.asInstanceOf[js.Any])
    if (Class != null) __obj.updateDynamic("Class")(Class.asInstanceOf[js.Any])
    if (ClassBody != null) __obj.updateDynamic("ClassBody")(ClassBody.asInstanceOf[js.Any])
    if (ClassDeclaration != null) __obj.updateDynamic("ClassDeclaration")(ClassDeclaration.asInstanceOf[js.Any])
    if (ClassExpression != null) __obj.updateDynamic("ClassExpression")(ClassExpression.asInstanceOf[js.Any])
    if (ClassImplements != null) __obj.updateDynamic("ClassImplements")(ClassImplements.asInstanceOf[js.Any])
    if (ClassMethod != null) __obj.updateDynamic("ClassMethod")(ClassMethod.asInstanceOf[js.Any])
    if (ClassProperty != null) __obj.updateDynamic("ClassProperty")(ClassProperty.asInstanceOf[js.Any])
    if (CompletionStatement != null) __obj.updateDynamic("CompletionStatement")(CompletionStatement.asInstanceOf[js.Any])
    if (Conditional != null) __obj.updateDynamic("Conditional")(Conditional.asInstanceOf[js.Any])
    if (ConditionalExpression != null) __obj.updateDynamic("ConditionalExpression")(ConditionalExpression.asInstanceOf[js.Any])
    if (ContinueStatement != null) __obj.updateDynamic("ContinueStatement")(ContinueStatement.asInstanceOf[js.Any])
    if (DebuggerStatement != null) __obj.updateDynamic("DebuggerStatement")(DebuggerStatement.asInstanceOf[js.Any])
    if (Declaration != null) __obj.updateDynamic("Declaration")(Declaration.asInstanceOf[js.Any])
    if (DeclareClass != null) __obj.updateDynamic("DeclareClass")(DeclareClass.asInstanceOf[js.Any])
    if (DeclareFunction != null) __obj.updateDynamic("DeclareFunction")(DeclareFunction.asInstanceOf[js.Any])
    if (DeclareInterface != null) __obj.updateDynamic("DeclareInterface")(DeclareInterface.asInstanceOf[js.Any])
    if (DeclareModule != null) __obj.updateDynamic("DeclareModule")(DeclareModule.asInstanceOf[js.Any])
    if (DeclareTypeAlias != null) __obj.updateDynamic("DeclareTypeAlias")(DeclareTypeAlias.asInstanceOf[js.Any])
    if (DeclareVariable != null) __obj.updateDynamic("DeclareVariable")(DeclareVariable.asInstanceOf[js.Any])
    if (Decorator != null) __obj.updateDynamic("Decorator")(Decorator.asInstanceOf[js.Any])
    if (Directive != null) __obj.updateDynamic("Directive")(Directive.asInstanceOf[js.Any])
    if (DirectiveLiteral != null) __obj.updateDynamic("DirectiveLiteral")(DirectiveLiteral.asInstanceOf[js.Any])
    if (DoExpression != null) __obj.updateDynamic("DoExpression")(DoExpression.asInstanceOf[js.Any])
    if (DoWhileStatement != null) __obj.updateDynamic("DoWhileStatement")(DoWhileStatement.asInstanceOf[js.Any])
    if (EmptyStatement != null) __obj.updateDynamic("EmptyStatement")(EmptyStatement.asInstanceOf[js.Any])
    if (ExistentialTypeParam != null) __obj.updateDynamic("ExistentialTypeParam")(ExistentialTypeParam.asInstanceOf[js.Any])
    if (ExportAllDeclaration != null) __obj.updateDynamic("ExportAllDeclaration")(ExportAllDeclaration.asInstanceOf[js.Any])
    if (ExportDeclaration != null) __obj.updateDynamic("ExportDeclaration")(ExportDeclaration.asInstanceOf[js.Any])
    if (ExportDefaultDeclaration != null) __obj.updateDynamic("ExportDefaultDeclaration")(ExportDefaultDeclaration.asInstanceOf[js.Any])
    if (ExportDefaultSpecifier != null) __obj.updateDynamic("ExportDefaultSpecifier")(ExportDefaultSpecifier.asInstanceOf[js.Any])
    if (ExportNamedDeclaration != null) __obj.updateDynamic("ExportNamedDeclaration")(ExportNamedDeclaration.asInstanceOf[js.Any])
    if (ExportNamespaceSpecifier != null) __obj.updateDynamic("ExportNamespaceSpecifier")(ExportNamespaceSpecifier.asInstanceOf[js.Any])
    if (ExportSpecifier != null) __obj.updateDynamic("ExportSpecifier")(ExportSpecifier.asInstanceOf[js.Any])
    if (Expression != null) __obj.updateDynamic("Expression")(Expression.asInstanceOf[js.Any])
    if (ExpressionStatement != null) __obj.updateDynamic("ExpressionStatement")(ExpressionStatement.asInstanceOf[js.Any])
    if (ExpressionWrapper != null) __obj.updateDynamic("ExpressionWrapper")(ExpressionWrapper.asInstanceOf[js.Any])
    if (File != null) __obj.updateDynamic("File")(File.asInstanceOf[js.Any])
    if (Flow != null) __obj.updateDynamic("Flow")(Flow.asInstanceOf[js.Any])
    if (FlowBaseAnnotation != null) __obj.updateDynamic("FlowBaseAnnotation")(FlowBaseAnnotation.asInstanceOf[js.Any])
    if (FlowDeclaration != null) __obj.updateDynamic("FlowDeclaration")(FlowDeclaration.asInstanceOf[js.Any])
    if (For != null) __obj.updateDynamic("For")(For.asInstanceOf[js.Any])
    if (ForInStatement != null) __obj.updateDynamic("ForInStatement")(ForInStatement.asInstanceOf[js.Any])
    if (ForOfStatement != null) __obj.updateDynamic("ForOfStatement")(ForOfStatement.asInstanceOf[js.Any])
    if (ForStatement != null) __obj.updateDynamic("ForStatement")(ForStatement.asInstanceOf[js.Any])
    if (ForXStatement != null) __obj.updateDynamic("ForXStatement")(ForXStatement.asInstanceOf[js.Any])
    if (Function != null) __obj.updateDynamic("Function")(Function.asInstanceOf[js.Any])
    if (FunctionDeclaration != null) __obj.updateDynamic("FunctionDeclaration")(FunctionDeclaration.asInstanceOf[js.Any])
    if (FunctionExpression != null) __obj.updateDynamic("FunctionExpression")(FunctionExpression.asInstanceOf[js.Any])
    if (FunctionParent != null) __obj.updateDynamic("FunctionParent")(FunctionParent.asInstanceOf[js.Any])
    if (FunctionTypeAnnotation != null) __obj.updateDynamic("FunctionTypeAnnotation")(FunctionTypeAnnotation.asInstanceOf[js.Any])
    if (FunctionTypeParam != null) __obj.updateDynamic("FunctionTypeParam")(FunctionTypeParam.asInstanceOf[js.Any])
    if (GenericTypeAnnotation != null) __obj.updateDynamic("GenericTypeAnnotation")(GenericTypeAnnotation.asInstanceOf[js.Any])
    if (Identifier != null) __obj.updateDynamic("Identifier")(Identifier.asInstanceOf[js.Any])
    if (IfStatement != null) __obj.updateDynamic("IfStatement")(IfStatement.asInstanceOf[js.Any])
    if (Immutable != null) __obj.updateDynamic("Immutable")(Immutable.asInstanceOf[js.Any])
    if (ImportDeclaration != null) __obj.updateDynamic("ImportDeclaration")(ImportDeclaration.asInstanceOf[js.Any])
    if (ImportDefaultSpecifier != null) __obj.updateDynamic("ImportDefaultSpecifier")(ImportDefaultSpecifier.asInstanceOf[js.Any])
    if (ImportNamespaceSpecifier != null) __obj.updateDynamic("ImportNamespaceSpecifier")(ImportNamespaceSpecifier.asInstanceOf[js.Any])
    if (ImportSpecifier != null) __obj.updateDynamic("ImportSpecifier")(ImportSpecifier.asInstanceOf[js.Any])
    if (InterfaceDeclaration != null) __obj.updateDynamic("InterfaceDeclaration")(InterfaceDeclaration.asInstanceOf[js.Any])
    if (InterfaceExtends != null) __obj.updateDynamic("InterfaceExtends")(InterfaceExtends.asInstanceOf[js.Any])
    if (IntersectionTypeAnnotation != null) __obj.updateDynamic("IntersectionTypeAnnotation")(IntersectionTypeAnnotation.asInstanceOf[js.Any])
    if (JSX != null) __obj.updateDynamic("JSX")(JSX.asInstanceOf[js.Any])
    if (JSXAttribute != null) __obj.updateDynamic("JSXAttribute")(JSXAttribute.asInstanceOf[js.Any])
    if (JSXClosingElement != null) __obj.updateDynamic("JSXClosingElement")(JSXClosingElement.asInstanceOf[js.Any])
    if (JSXElement != null) __obj.updateDynamic("JSXElement")(JSXElement.asInstanceOf[js.Any])
    if (JSXEmptyExpression != null) __obj.updateDynamic("JSXEmptyExpression")(JSXEmptyExpression.asInstanceOf[js.Any])
    if (JSXExpressionContainer != null) __obj.updateDynamic("JSXExpressionContainer")(JSXExpressionContainer.asInstanceOf[js.Any])
    if (JSXIdentifier != null) __obj.updateDynamic("JSXIdentifier")(JSXIdentifier.asInstanceOf[js.Any])
    if (JSXMemberExpression != null) __obj.updateDynamic("JSXMemberExpression")(JSXMemberExpression.asInstanceOf[js.Any])
    if (JSXNamespacedName != null) __obj.updateDynamic("JSXNamespacedName")(JSXNamespacedName.asInstanceOf[js.Any])
    if (JSXOpeningElement != null) __obj.updateDynamic("JSXOpeningElement")(JSXOpeningElement.asInstanceOf[js.Any])
    if (JSXSpreadAttribute != null) __obj.updateDynamic("JSXSpreadAttribute")(JSXSpreadAttribute.asInstanceOf[js.Any])
    if (JSXText != null) __obj.updateDynamic("JSXText")(JSXText.asInstanceOf[js.Any])
    if (LVal != null) __obj.updateDynamic("LVal")(LVal.asInstanceOf[js.Any])
    if (LabeledStatement != null) __obj.updateDynamic("LabeledStatement")(LabeledStatement.asInstanceOf[js.Any])
    if (Literal != null) __obj.updateDynamic("Literal")(Literal.asInstanceOf[js.Any])
    if (LogicalExpression != null) __obj.updateDynamic("LogicalExpression")(LogicalExpression.asInstanceOf[js.Any])
    if (Loop != null) __obj.updateDynamic("Loop")(Loop.asInstanceOf[js.Any])
    if (MemberExpression != null) __obj.updateDynamic("MemberExpression")(MemberExpression.asInstanceOf[js.Any])
    if (MetaProperty != null) __obj.updateDynamic("MetaProperty")(MetaProperty.asInstanceOf[js.Any])
    if (Method != null) __obj.updateDynamic("Method")(Method.asInstanceOf[js.Any])
    if (MixedTypeAnnotation != null) __obj.updateDynamic("MixedTypeAnnotation")(MixedTypeAnnotation.asInstanceOf[js.Any])
    if (ModuleDeclaration != null) __obj.updateDynamic("ModuleDeclaration")(ModuleDeclaration.asInstanceOf[js.Any])
    if (ModuleSpecifier != null) __obj.updateDynamic("ModuleSpecifier")(ModuleSpecifier.asInstanceOf[js.Any])
    if (NewExpression != null) __obj.updateDynamic("NewExpression")(NewExpression.asInstanceOf[js.Any])
    if (Noop != null) __obj.updateDynamic("Noop")(Noop.asInstanceOf[js.Any])
    if (NullLiteral != null) __obj.updateDynamic("NullLiteral")(NullLiteral.asInstanceOf[js.Any])
    if (NullLiteralTypeAnnotation != null) __obj.updateDynamic("NullLiteralTypeAnnotation")(NullLiteralTypeAnnotation.asInstanceOf[js.Any])
    if (NullableTypeAnnotation != null) __obj.updateDynamic("NullableTypeAnnotation")(NullableTypeAnnotation.asInstanceOf[js.Any])
    if (NumberTypeAnnotation != null) __obj.updateDynamic("NumberTypeAnnotation")(NumberTypeAnnotation.asInstanceOf[js.Any])
    if (NumericLiteral != null) __obj.updateDynamic("NumericLiteral")(NumericLiteral.asInstanceOf[js.Any])
    if (NumericLiteralTypeAnnotation != null) __obj.updateDynamic("NumericLiteralTypeAnnotation")(NumericLiteralTypeAnnotation.asInstanceOf[js.Any])
    if (ObjectExpression != null) __obj.updateDynamic("ObjectExpression")(ObjectExpression.asInstanceOf[js.Any])
    if (ObjectMember != null) __obj.updateDynamic("ObjectMember")(ObjectMember.asInstanceOf[js.Any])
    if (ObjectMethod != null) __obj.updateDynamic("ObjectMethod")(ObjectMethod.asInstanceOf[js.Any])
    if (ObjectPattern != null) __obj.updateDynamic("ObjectPattern")(ObjectPattern.asInstanceOf[js.Any])
    if (ObjectProperty != null) __obj.updateDynamic("ObjectProperty")(ObjectProperty.asInstanceOf[js.Any])
    if (ObjectTypeAnnotation != null) __obj.updateDynamic("ObjectTypeAnnotation")(ObjectTypeAnnotation.asInstanceOf[js.Any])
    if (ObjectTypeCallProperty != null) __obj.updateDynamic("ObjectTypeCallProperty")(ObjectTypeCallProperty.asInstanceOf[js.Any])
    if (ObjectTypeIndexer != null) __obj.updateDynamic("ObjectTypeIndexer")(ObjectTypeIndexer.asInstanceOf[js.Any])
    if (ObjectTypeProperty != null) __obj.updateDynamic("ObjectTypeProperty")(ObjectTypeProperty.asInstanceOf[js.Any])
    if (ParenthesizedExpression != null) __obj.updateDynamic("ParenthesizedExpression")(ParenthesizedExpression.asInstanceOf[js.Any])
    if (Pattern != null) __obj.updateDynamic("Pattern")(Pattern.asInstanceOf[js.Any])
    if (Program != null) __obj.updateDynamic("Program")(Program.asInstanceOf[js.Any])
    if (Property != null) __obj.updateDynamic("Property")(Property.asInstanceOf[js.Any])
    if (Pureish != null) __obj.updateDynamic("Pureish")(Pureish.asInstanceOf[js.Any])
    if (QualifiedTypeIdentifier != null) __obj.updateDynamic("QualifiedTypeIdentifier")(QualifiedTypeIdentifier.asInstanceOf[js.Any])
    if (RegExpLiteral != null) __obj.updateDynamic("RegExpLiteral")(RegExpLiteral.asInstanceOf[js.Any])
    if (RestElement != null) __obj.updateDynamic("RestElement")(RestElement.asInstanceOf[js.Any])
    if (RestProperty != null) __obj.updateDynamic("RestProperty")(RestProperty.asInstanceOf[js.Any])
    if (ReturnStatement != null) __obj.updateDynamic("ReturnStatement")(ReturnStatement.asInstanceOf[js.Any])
    if (Scopable != null) __obj.updateDynamic("Scopable")(Scopable.asInstanceOf[js.Any])
    if (Scope != null) __obj.updateDynamic("Scope")(Scope.asInstanceOf[js.Any])
    if (SequenceExpression != null) __obj.updateDynamic("SequenceExpression")(SequenceExpression.asInstanceOf[js.Any])
    if (SpreadElement != null) __obj.updateDynamic("SpreadElement")(SpreadElement.asInstanceOf[js.Any])
    if (SpreadProperty != null) __obj.updateDynamic("SpreadProperty")(SpreadProperty.asInstanceOf[js.Any])
    if (Statement != null) __obj.updateDynamic("Statement")(Statement.asInstanceOf[js.Any])
    if (StringLiteral != null) __obj.updateDynamic("StringLiteral")(StringLiteral.asInstanceOf[js.Any])
    if (StringLiteralTypeAnnotation != null) __obj.updateDynamic("StringLiteralTypeAnnotation")(StringLiteralTypeAnnotation.asInstanceOf[js.Any])
    if (StringTypeAnnotation != null) __obj.updateDynamic("StringTypeAnnotation")(StringTypeAnnotation.asInstanceOf[js.Any])
    if (Super != null) __obj.updateDynamic("Super")(Super.asInstanceOf[js.Any])
    if (SwitchCase != null) __obj.updateDynamic("SwitchCase")(SwitchCase.asInstanceOf[js.Any])
    if (SwitchStatement != null) __obj.updateDynamic("SwitchStatement")(SwitchStatement.asInstanceOf[js.Any])
    if (TaggedTemplateExpression != null) __obj.updateDynamic("TaggedTemplateExpression")(TaggedTemplateExpression.asInstanceOf[js.Any])
    if (TemplateElement != null) __obj.updateDynamic("TemplateElement")(TemplateElement.asInstanceOf[js.Any])
    if (TemplateLiteral != null) __obj.updateDynamic("TemplateLiteral")(TemplateLiteral.asInstanceOf[js.Any])
    if (Terminatorless != null) __obj.updateDynamic("Terminatorless")(Terminatorless.asInstanceOf[js.Any])
    if (ThisExpression != null) __obj.updateDynamic("ThisExpression")(ThisExpression.asInstanceOf[js.Any])
    if (ThisTypeAnnotation != null) __obj.updateDynamic("ThisTypeAnnotation")(ThisTypeAnnotation.asInstanceOf[js.Any])
    if (ThrowStatement != null) __obj.updateDynamic("ThrowStatement")(ThrowStatement.asInstanceOf[js.Any])
    if (TryStatement != null) __obj.updateDynamic("TryStatement")(TryStatement.asInstanceOf[js.Any])
    if (TupleTypeAnnotation != null) __obj.updateDynamic("TupleTypeAnnotation")(TupleTypeAnnotation.asInstanceOf[js.Any])
    if (TypeAlias != null) __obj.updateDynamic("TypeAlias")(TypeAlias.asInstanceOf[js.Any])
    if (TypeAnnotation != null) __obj.updateDynamic("TypeAnnotation")(TypeAnnotation.asInstanceOf[js.Any])
    if (TypeCastExpression != null) __obj.updateDynamic("TypeCastExpression")(TypeCastExpression.asInstanceOf[js.Any])
    if (TypeParameterDeclaration != null) __obj.updateDynamic("TypeParameterDeclaration")(TypeParameterDeclaration.asInstanceOf[js.Any])
    if (TypeParameterInstantiation != null) __obj.updateDynamic("TypeParameterInstantiation")(TypeParameterInstantiation.asInstanceOf[js.Any])
    if (TypeofTypeAnnotation != null) __obj.updateDynamic("TypeofTypeAnnotation")(TypeofTypeAnnotation.asInstanceOf[js.Any])
    if (UnaryExpression != null) __obj.updateDynamic("UnaryExpression")(UnaryExpression.asInstanceOf[js.Any])
    if (UnaryLike != null) __obj.updateDynamic("UnaryLike")(UnaryLike.asInstanceOf[js.Any])
    if (UnionTypeAnnotation != null) __obj.updateDynamic("UnionTypeAnnotation")(UnionTypeAnnotation.asInstanceOf[js.Any])
    if (UpdateExpression != null) __obj.updateDynamic("UpdateExpression")(UpdateExpression.asInstanceOf[js.Any])
    if (UserWhitespacable != null) __obj.updateDynamic("UserWhitespacable")(UserWhitespacable.asInstanceOf[js.Any])
    if (VariableDeclaration != null) __obj.updateDynamic("VariableDeclaration")(VariableDeclaration.asInstanceOf[js.Any])
    if (VariableDeclarator != null) __obj.updateDynamic("VariableDeclarator")(VariableDeclarator.asInstanceOf[js.Any])
    if (VoidTypeAnnotation != null) __obj.updateDynamic("VoidTypeAnnotation")(VoidTypeAnnotation.asInstanceOf[js.Any])
    if (While != null) __obj.updateDynamic("While")(While.asInstanceOf[js.Any])
    if (WhileStatement != null) __obj.updateDynamic("WhileStatement")(WhileStatement.asInstanceOf[js.Any])
    if (WithStatement != null) __obj.updateDynamic("WithStatement")(WithStatement.asInstanceOf[js.Any])
    if (YieldExpression != null) __obj.updateDynamic("YieldExpression")(YieldExpression.asInstanceOf[js.Any])
    if (enter != null) __obj.updateDynamic("enter")(js.Any.fromFunction2(enter))
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction2(exit))
    __obj.asInstanceOf[Visitor[S]]
  }
}

