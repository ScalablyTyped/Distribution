package typings.babelTraverse.mod

import typings.babelTypes.mod.AnyTypeAnnotation_
import typings.babelTypes.mod.ArrayExpression_
import typings.babelTypes.mod.ArrayPattern_
import typings.babelTypes.mod.ArrayTypeAnnotation_
import typings.babelTypes.mod.ArrowFunctionExpression_
import typings.babelTypes.mod.AssignmentExpression_
import typings.babelTypes.mod.AssignmentPattern_
import typings.babelTypes.mod.AwaitExpression_
import typings.babelTypes.mod.Binary
import typings.babelTypes.mod.BinaryExpression_
import typings.babelTypes.mod.BindExpression_
import typings.babelTypes.mod.Block
import typings.babelTypes.mod.BlockParent
import typings.babelTypes.mod.BlockStatement_
import typings.babelTypes.mod.BooleanLiteralTypeAnnotation_
import typings.babelTypes.mod.BooleanLiteral_
import typings.babelTypes.mod.BooleanTypeAnnotation_
import typings.babelTypes.mod.BreakStatement_
import typings.babelTypes.mod.CallExpression_
import typings.babelTypes.mod.CatchClause_
import typings.babelTypes.mod.Class
import typings.babelTypes.mod.ClassBody_
import typings.babelTypes.mod.ClassDeclaration_
import typings.babelTypes.mod.ClassExpression_
import typings.babelTypes.mod.ClassImplements_
import typings.babelTypes.mod.ClassMethod_
import typings.babelTypes.mod.ClassProperty_
import typings.babelTypes.mod.CompletionStatement
import typings.babelTypes.mod.Conditional
import typings.babelTypes.mod.ConditionalExpression_
import typings.babelTypes.mod.ContinueStatement_
import typings.babelTypes.mod.DebuggerStatement_
import typings.babelTypes.mod.Declaration
import typings.babelTypes.mod.DeclareClass_
import typings.babelTypes.mod.DeclareFunction_
import typings.babelTypes.mod.DeclareInterface_
import typings.babelTypes.mod.DeclareModule_
import typings.babelTypes.mod.DeclareTypeAlias_
import typings.babelTypes.mod.DeclareVariable_
import typings.babelTypes.mod.Decorator_
import typings.babelTypes.mod.DirectiveLiteral_
import typings.babelTypes.mod.Directive_
import typings.babelTypes.mod.DoExpression_
import typings.babelTypes.mod.DoWhileStatement_
import typings.babelTypes.mod.EmptyStatement_
import typings.babelTypes.mod.ExistentialTypeParam_
import typings.babelTypes.mod.ExportAllDeclaration_
import typings.babelTypes.mod.ExportDeclaration
import typings.babelTypes.mod.ExportDefaultDeclaration_
import typings.babelTypes.mod.ExportDefaultSpecifier_
import typings.babelTypes.mod.ExportNamedDeclaration_
import typings.babelTypes.mod.ExportNamespaceSpecifier_
import typings.babelTypes.mod.ExportSpecifier_
import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.ExpressionStatement_
import typings.babelTypes.mod.ExpressionWrapper
import typings.babelTypes.mod.File_
import typings.babelTypes.mod.Flow
import typings.babelTypes.mod.FlowBaseAnnotation
import typings.babelTypes.mod.FlowDeclaration
import typings.babelTypes.mod.For
import typings.babelTypes.mod.ForInStatement_
import typings.babelTypes.mod.ForOfStatement_
import typings.babelTypes.mod.ForStatement_
import typings.babelTypes.mod.ForXStatement
import typings.babelTypes.mod.Function
import typings.babelTypes.mod.FunctionDeclaration_
import typings.babelTypes.mod.FunctionExpression_
import typings.babelTypes.mod.FunctionParent
import typings.babelTypes.mod.FunctionTypeAnnotation_
import typings.babelTypes.mod.FunctionTypeParam_
import typings.babelTypes.mod.GenericTypeAnnotation_
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.IfStatement_
import typings.babelTypes.mod.Immutable
import typings.babelTypes.mod.ImportDeclaration_
import typings.babelTypes.mod.ImportDefaultSpecifier_
import typings.babelTypes.mod.ImportNamespaceSpecifier_
import typings.babelTypes.mod.ImportSpecifier_
import typings.babelTypes.mod.InterfaceDeclaration_
import typings.babelTypes.mod.InterfaceExtends_
import typings.babelTypes.mod.IntersectionTypeAnnotation_
import typings.babelTypes.mod.JSX
import typings.babelTypes.mod.JSXAttribute_
import typings.babelTypes.mod.JSXClosingElement_
import typings.babelTypes.mod.JSXElement_
import typings.babelTypes.mod.JSXEmptyExpression_
import typings.babelTypes.mod.JSXExpressionContainer_
import typings.babelTypes.mod.JSXIdentifier_
import typings.babelTypes.mod.JSXMemberExpression_
import typings.babelTypes.mod.JSXNamespacedName_
import typings.babelTypes.mod.JSXOpeningElement_
import typings.babelTypes.mod.JSXSpreadAttribute_
import typings.babelTypes.mod.JSXText_
import typings.babelTypes.mod.LVal
import typings.babelTypes.mod.LabeledStatement_
import typings.babelTypes.mod.Literal
import typings.babelTypes.mod.LogicalExpression_
import typings.babelTypes.mod.Loop
import typings.babelTypes.mod.MemberExpression_
import typings.babelTypes.mod.MetaProperty_
import typings.babelTypes.mod.Method
import typings.babelTypes.mod.MixedTypeAnnotation_
import typings.babelTypes.mod.ModuleDeclaration
import typings.babelTypes.mod.ModuleSpecifier
import typings.babelTypes.mod.NewExpression_
import typings.babelTypes.mod.Noop_
import typings.babelTypes.mod.NullLiteralTypeAnnotation_
import typings.babelTypes.mod.NullLiteral_
import typings.babelTypes.mod.NullableTypeAnnotation_
import typings.babelTypes.mod.NumberTypeAnnotation_
import typings.babelTypes.mod.NumericLiteralTypeAnnotation_
import typings.babelTypes.mod.NumericLiteral_
import typings.babelTypes.mod.ObjectExpression_
import typings.babelTypes.mod.ObjectMember
import typings.babelTypes.mod.ObjectMethod_
import typings.babelTypes.mod.ObjectPattern_
import typings.babelTypes.mod.ObjectProperty_
import typings.babelTypes.mod.ObjectTypeAnnotation_
import typings.babelTypes.mod.ObjectTypeCallProperty_
import typings.babelTypes.mod.ObjectTypeIndexer_
import typings.babelTypes.mod.ObjectTypeProperty_
import typings.babelTypes.mod.ParenthesizedExpression_
import typings.babelTypes.mod.Pattern
import typings.babelTypes.mod.Program_
import typings.babelTypes.mod.Property
import typings.babelTypes.mod.Pureish
import typings.babelTypes.mod.QualifiedTypeIdentifier_
import typings.babelTypes.mod.RegExpLiteral_
import typings.babelTypes.mod.RestElement_
import typings.babelTypes.mod.RestProperty_
import typings.babelTypes.mod.ReturnStatement_
import typings.babelTypes.mod.Scopable
import typings.babelTypes.mod.SequenceExpression_
import typings.babelTypes.mod.SpreadElement_
import typings.babelTypes.mod.SpreadProperty_
import typings.babelTypes.mod.Statement
import typings.babelTypes.mod.StringLiteralTypeAnnotation_
import typings.babelTypes.mod.StringLiteral_
import typings.babelTypes.mod.StringTypeAnnotation_
import typings.babelTypes.mod.Super
import typings.babelTypes.mod.SwitchCase_
import typings.babelTypes.mod.SwitchStatement_
import typings.babelTypes.mod.TaggedTemplateExpression_
import typings.babelTypes.mod.TemplateElement_
import typings.babelTypes.mod.TemplateLiteral_
import typings.babelTypes.mod.Terminatorless
import typings.babelTypes.mod.ThisExpression_
import typings.babelTypes.mod.ThisTypeAnnotation_
import typings.babelTypes.mod.ThrowStatement_
import typings.babelTypes.mod.TryStatement_
import typings.babelTypes.mod.TupleTypeAnnotation_
import typings.babelTypes.mod.TypeAlias_
import typings.babelTypes.mod.TypeAnnotation_
import typings.babelTypes.mod.TypeCastExpression_
import typings.babelTypes.mod.TypeParameterDeclaration_
import typings.babelTypes.mod.TypeParameterInstantiation_
import typings.babelTypes.mod.TypeofTypeAnnotation_
import typings.babelTypes.mod.UnaryExpression_
import typings.babelTypes.mod.UnaryLike
import typings.babelTypes.mod.UnionTypeAnnotation_
import typings.babelTypes.mod.UpdateExpression_
import typings.babelTypes.mod.UserWhitespacable
import typings.babelTypes.mod.VariableDeclaration_
import typings.babelTypes.mod.VariableDeclarator_
import typings.babelTypes.mod.VoidTypeAnnotation_
import typings.babelTypes.mod.While
import typings.babelTypes.mod.WhileStatement_
import typings.babelTypes.mod.WithStatement_
import typings.babelTypes.mod.YieldExpression_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor[S] extends VisitNodeObject[Node] {
  var AnyTypeAnnotation: js.UndefOr[VisitNode[S, AnyTypeAnnotation_]] = js.native
  var ArrayExpression: js.UndefOr[VisitNode[S, ArrayExpression_]] = js.native
  var ArrayPattern: js.UndefOr[VisitNode[S, ArrayPattern_]] = js.native
  var ArrayTypeAnnotation: js.UndefOr[VisitNode[S, ArrayTypeAnnotation_]] = js.native
  var ArrowFunctionExpression: js.UndefOr[VisitNode[S, ArrowFunctionExpression_]] = js.native
  var AssignmentExpression: js.UndefOr[VisitNode[S, AssignmentExpression_]] = js.native
  var AssignmentPattern: js.UndefOr[VisitNode[S, AssignmentPattern_]] = js.native
  var AwaitExpression: js.UndefOr[VisitNode[S, AwaitExpression_]] = js.native
  var Binary: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Binary]] = js.native
  var BinaryExpression: js.UndefOr[VisitNode[S, BinaryExpression_]] = js.native
  var BindExpression: js.UndefOr[VisitNode[S, BindExpression_]] = js.native
  var Block: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Block]] = js.native
  var BlockParent: js.UndefOr[VisitNode[S, typings.babelTypes.mod.BlockParent]] = js.native
  var BlockStatement: js.UndefOr[VisitNode[S, BlockStatement_]] = js.native
  var BooleanLiteral: js.UndefOr[VisitNode[S, BooleanLiteral_]] = js.native
  var BooleanLiteralTypeAnnotation: js.UndefOr[VisitNode[S, BooleanLiteralTypeAnnotation_]] = js.native
  var BooleanTypeAnnotation: js.UndefOr[VisitNode[S, BooleanTypeAnnotation_]] = js.native
  var BreakStatement: js.UndefOr[VisitNode[S, BreakStatement_]] = js.native
  var CallExpression: js.UndefOr[VisitNode[S, CallExpression_]] = js.native
  var CatchClause: js.UndefOr[VisitNode[S, CatchClause_]] = js.native
  var Class: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Class]] = js.native
  var ClassBody: js.UndefOr[VisitNode[S, ClassBody_]] = js.native
  var ClassDeclaration: js.UndefOr[VisitNode[S, ClassDeclaration_]] = js.native
  var ClassExpression: js.UndefOr[VisitNode[S, ClassExpression_]] = js.native
  var ClassImplements: js.UndefOr[VisitNode[S, ClassImplements_]] = js.native
  var ClassMethod: js.UndefOr[VisitNode[S, ClassMethod_]] = js.native
  var ClassProperty: js.UndefOr[VisitNode[S, ClassProperty_]] = js.native
  var CompletionStatement: js.UndefOr[VisitNode[S, typings.babelTypes.mod.CompletionStatement]] = js.native
  var Conditional: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Conditional]] = js.native
  var ConditionalExpression: js.UndefOr[VisitNode[S, ConditionalExpression_]] = js.native
  var ContinueStatement: js.UndefOr[VisitNode[S, ContinueStatement_]] = js.native
  var DebuggerStatement: js.UndefOr[VisitNode[S, DebuggerStatement_]] = js.native
  var Declaration: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Declaration]] = js.native
  var DeclareClass: js.UndefOr[VisitNode[S, DeclareClass_]] = js.native
  var DeclareFunction: js.UndefOr[VisitNode[S, DeclareFunction_]] = js.native
  var DeclareInterface: js.UndefOr[VisitNode[S, DeclareInterface_]] = js.native
  var DeclareModule: js.UndefOr[VisitNode[S, DeclareModule_]] = js.native
  var DeclareTypeAlias: js.UndefOr[VisitNode[S, DeclareTypeAlias_]] = js.native
  var DeclareVariable: js.UndefOr[VisitNode[S, DeclareVariable_]] = js.native
  var Decorator: js.UndefOr[VisitNode[S, Decorator_]] = js.native
  var Directive: js.UndefOr[VisitNode[S, Directive_]] = js.native
  var DirectiveLiteral: js.UndefOr[VisitNode[S, DirectiveLiteral_]] = js.native
  var DoExpression: js.UndefOr[VisitNode[S, DoExpression_]] = js.native
  var DoWhileStatement: js.UndefOr[VisitNode[S, DoWhileStatement_]] = js.native
  var EmptyStatement: js.UndefOr[VisitNode[S, EmptyStatement_]] = js.native
  var ExistentialTypeParam: js.UndefOr[VisitNode[S, ExistentialTypeParam_]] = js.native
  var ExportAllDeclaration: js.UndefOr[VisitNode[S, ExportAllDeclaration_]] = js.native
  var ExportDeclaration: js.UndefOr[VisitNode[S, typings.babelTypes.mod.ExportDeclaration]] = js.native
  var ExportDefaultDeclaration: js.UndefOr[VisitNode[S, ExportDefaultDeclaration_]] = js.native
  var ExportDefaultSpecifier: js.UndefOr[VisitNode[S, ExportDefaultSpecifier_]] = js.native
  var ExportNamedDeclaration: js.UndefOr[VisitNode[S, ExportNamedDeclaration_]] = js.native
  var ExportNamespaceSpecifier: js.UndefOr[VisitNode[S, ExportNamespaceSpecifier_]] = js.native
  var ExportSpecifier: js.UndefOr[VisitNode[S, ExportSpecifier_]] = js.native
  var Expression: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Expression]] = js.native
  var ExpressionStatement: js.UndefOr[VisitNode[S, ExpressionStatement_]] = js.native
  var ExpressionWrapper: js.UndefOr[VisitNode[S, typings.babelTypes.mod.ExpressionWrapper]] = js.native
  var File: js.UndefOr[VisitNode[S, File_]] = js.native
  var Flow: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Flow]] = js.native
  var FlowBaseAnnotation: js.UndefOr[VisitNode[S, typings.babelTypes.mod.FlowBaseAnnotation]] = js.native
  var FlowDeclaration: js.UndefOr[VisitNode[S, typings.babelTypes.mod.FlowDeclaration]] = js.native
  var For: js.UndefOr[VisitNode[S, typings.babelTypes.mod.For]] = js.native
  var ForInStatement: js.UndefOr[VisitNode[S, ForInStatement_]] = js.native
  var ForOfStatement: js.UndefOr[VisitNode[S, ForOfStatement_]] = js.native
  var ForStatement: js.UndefOr[VisitNode[S, ForStatement_]] = js.native
  var ForXStatement: js.UndefOr[VisitNode[S, typings.babelTypes.mod.ForXStatement]] = js.native
  var Function: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Function]] = js.native
  var FunctionDeclaration: js.UndefOr[VisitNode[S, FunctionDeclaration_]] = js.native
  var FunctionExpression: js.UndefOr[VisitNode[S, FunctionExpression_]] = js.native
  var FunctionParent: js.UndefOr[VisitNode[S, typings.babelTypes.mod.FunctionParent]] = js.native
  var FunctionTypeAnnotation: js.UndefOr[VisitNode[S, FunctionTypeAnnotation_]] = js.native
  var FunctionTypeParam: js.UndefOr[VisitNode[S, FunctionTypeParam_]] = js.native
  var GenericTypeAnnotation: js.UndefOr[VisitNode[S, GenericTypeAnnotation_]] = js.native
  var Identifier: js.UndefOr[VisitNode[S, Identifier_]] = js.native
  var IfStatement: js.UndefOr[VisitNode[S, IfStatement_]] = js.native
  var Immutable: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Immutable]] = js.native
  var ImportDeclaration: js.UndefOr[VisitNode[S, ImportDeclaration_]] = js.native
  var ImportDefaultSpecifier: js.UndefOr[VisitNode[S, ImportDefaultSpecifier_]] = js.native
  var ImportNamespaceSpecifier: js.UndefOr[VisitNode[S, ImportNamespaceSpecifier_]] = js.native
  var ImportSpecifier: js.UndefOr[VisitNode[S, ImportSpecifier_]] = js.native
  var InterfaceDeclaration: js.UndefOr[VisitNode[S, InterfaceDeclaration_]] = js.native
  var InterfaceExtends: js.UndefOr[VisitNode[S, InterfaceExtends_]] = js.native
  var IntersectionTypeAnnotation: js.UndefOr[VisitNode[S, IntersectionTypeAnnotation_]] = js.native
  var JSX: js.UndefOr[VisitNode[S, typings.babelTypes.mod.JSX]] = js.native
  var JSXAttribute: js.UndefOr[VisitNode[S, JSXAttribute_]] = js.native
  var JSXClosingElement: js.UndefOr[VisitNode[S, JSXClosingElement_]] = js.native
  var JSXElement: js.UndefOr[VisitNode[S, JSXElement_]] = js.native
  var JSXEmptyExpression: js.UndefOr[VisitNode[S, JSXEmptyExpression_]] = js.native
  var JSXExpressionContainer: js.UndefOr[VisitNode[S, JSXExpressionContainer_]] = js.native
  var JSXIdentifier: js.UndefOr[VisitNode[S, JSXIdentifier_]] = js.native
  var JSXMemberExpression: js.UndefOr[VisitNode[S, JSXMemberExpression_]] = js.native
  var JSXNamespacedName: js.UndefOr[VisitNode[S, JSXNamespacedName_]] = js.native
  var JSXOpeningElement: js.UndefOr[VisitNode[S, JSXOpeningElement_]] = js.native
  var JSXSpreadAttribute: js.UndefOr[VisitNode[S, JSXSpreadAttribute_]] = js.native
  var JSXText: js.UndefOr[VisitNode[S, JSXText_]] = js.native
  var LVal: js.UndefOr[VisitNode[S, typings.babelTypes.mod.LVal]] = js.native
  var LabeledStatement: js.UndefOr[VisitNode[S, LabeledStatement_]] = js.native
  var Literal: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Literal]] = js.native
  var LogicalExpression: js.UndefOr[VisitNode[S, LogicalExpression_]] = js.native
  var Loop: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Loop]] = js.native
  var MemberExpression: js.UndefOr[VisitNode[S, MemberExpression_]] = js.native
  var MetaProperty: js.UndefOr[VisitNode[S, MetaProperty_]] = js.native
  var Method: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Method]] = js.native
  var MixedTypeAnnotation: js.UndefOr[VisitNode[S, MixedTypeAnnotation_]] = js.native
  var ModuleDeclaration: js.UndefOr[VisitNode[S, typings.babelTypes.mod.ModuleDeclaration]] = js.native
  var ModuleSpecifier: js.UndefOr[VisitNode[S, typings.babelTypes.mod.ModuleSpecifier]] = js.native
  var NewExpression: js.UndefOr[VisitNode[S, NewExpression_]] = js.native
  var Noop: js.UndefOr[VisitNode[S, Noop_]] = js.native
  var NullLiteral: js.UndefOr[VisitNode[S, NullLiteral_]] = js.native
  var NullLiteralTypeAnnotation: js.UndefOr[VisitNode[S, NullLiteralTypeAnnotation_]] = js.native
  var NullableTypeAnnotation: js.UndefOr[VisitNode[S, NullableTypeAnnotation_]] = js.native
  var NumberTypeAnnotation: js.UndefOr[VisitNode[S, NumberTypeAnnotation_]] = js.native
  var NumericLiteral: js.UndefOr[VisitNode[S, NumericLiteral_]] = js.native
  var NumericLiteralTypeAnnotation: js.UndefOr[VisitNode[S, NumericLiteralTypeAnnotation_]] = js.native
  var ObjectExpression: js.UndefOr[VisitNode[S, ObjectExpression_]] = js.native
  var ObjectMember: js.UndefOr[VisitNode[S, typings.babelTypes.mod.ObjectMember]] = js.native
  var ObjectMethod: js.UndefOr[VisitNode[S, ObjectMethod_]] = js.native
  var ObjectPattern: js.UndefOr[VisitNode[S, ObjectPattern_]] = js.native
  var ObjectProperty: js.UndefOr[VisitNode[S, ObjectProperty_]] = js.native
  var ObjectTypeAnnotation: js.UndefOr[VisitNode[S, ObjectTypeAnnotation_]] = js.native
  var ObjectTypeCallProperty: js.UndefOr[VisitNode[S, ObjectTypeCallProperty_]] = js.native
  var ObjectTypeIndexer: js.UndefOr[VisitNode[S, ObjectTypeIndexer_]] = js.native
  var ObjectTypeProperty: js.UndefOr[VisitNode[S, ObjectTypeProperty_]] = js.native
  var ParenthesizedExpression: js.UndefOr[VisitNode[S, ParenthesizedExpression_]] = js.native
  var Pattern: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Pattern]] = js.native
  var Program: js.UndefOr[VisitNode[S, Program_]] = js.native
  var Property: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Property]] = js.native
  var Pureish: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Pureish]] = js.native
  var QualifiedTypeIdentifier: js.UndefOr[VisitNode[S, QualifiedTypeIdentifier_]] = js.native
  var RegExpLiteral: js.UndefOr[VisitNode[S, RegExpLiteral_]] = js.native
  var RestElement: js.UndefOr[VisitNode[S, RestElement_]] = js.native
  var RestProperty: js.UndefOr[VisitNode[S, RestProperty_]] = js.native
  var ReturnStatement: js.UndefOr[VisitNode[S, ReturnStatement_]] = js.native
  var Scopable: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Scopable]] = js.native
  var Scope: js.UndefOr[VisitNode[S, Scopable]] = js.native
  var SequenceExpression: js.UndefOr[VisitNode[S, SequenceExpression_]] = js.native
  var SpreadElement: js.UndefOr[VisitNode[S, SpreadElement_]] = js.native
  var SpreadProperty: js.UndefOr[VisitNode[S, SpreadProperty_]] = js.native
  var Statement: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Statement]] = js.native
  var StringLiteral: js.UndefOr[VisitNode[S, StringLiteral_]] = js.native
  var StringLiteralTypeAnnotation: js.UndefOr[VisitNode[S, StringLiteralTypeAnnotation_]] = js.native
  var StringTypeAnnotation: js.UndefOr[VisitNode[S, StringTypeAnnotation_]] = js.native
  var Super: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Super]] = js.native
  var SwitchCase: js.UndefOr[VisitNode[S, SwitchCase_]] = js.native
  var SwitchStatement: js.UndefOr[VisitNode[S, SwitchStatement_]] = js.native
  var TaggedTemplateExpression: js.UndefOr[VisitNode[S, TaggedTemplateExpression_]] = js.native
  var TemplateElement: js.UndefOr[VisitNode[S, TemplateElement_]] = js.native
  var TemplateLiteral: js.UndefOr[VisitNode[S, TemplateLiteral_]] = js.native
  var Terminatorless: js.UndefOr[VisitNode[S, typings.babelTypes.mod.Terminatorless]] = js.native
  var ThisExpression: js.UndefOr[VisitNode[S, ThisExpression_]] = js.native
  var ThisTypeAnnotation: js.UndefOr[VisitNode[S, ThisTypeAnnotation_]] = js.native
  var ThrowStatement: js.UndefOr[VisitNode[S, ThrowStatement_]] = js.native
  var TryStatement: js.UndefOr[VisitNode[S, TryStatement_]] = js.native
  var TupleTypeAnnotation: js.UndefOr[VisitNode[S, TupleTypeAnnotation_]] = js.native
  var TypeAlias: js.UndefOr[VisitNode[S, TypeAlias_]] = js.native
  var TypeAnnotation: js.UndefOr[VisitNode[S, TypeAnnotation_]] = js.native
  var TypeCastExpression: js.UndefOr[VisitNode[S, TypeCastExpression_]] = js.native
  var TypeParameterDeclaration: js.UndefOr[VisitNode[S, TypeParameterDeclaration_]] = js.native
  var TypeParameterInstantiation: js.UndefOr[VisitNode[S, TypeParameterInstantiation_]] = js.native
  var TypeofTypeAnnotation: js.UndefOr[VisitNode[S, TypeofTypeAnnotation_]] = js.native
  var UnaryExpression: js.UndefOr[VisitNode[S, UnaryExpression_]] = js.native
  var UnaryLike: js.UndefOr[VisitNode[S, typings.babelTypes.mod.UnaryLike]] = js.native
  var UnionTypeAnnotation: js.UndefOr[VisitNode[S, UnionTypeAnnotation_]] = js.native
  var UpdateExpression: js.UndefOr[VisitNode[S, UpdateExpression_]] = js.native
  var UserWhitespacable: js.UndefOr[VisitNode[S, typings.babelTypes.mod.UserWhitespacable]] = js.native
  var VariableDeclaration: js.UndefOr[VisitNode[S, VariableDeclaration_]] = js.native
  var VariableDeclarator: js.UndefOr[VisitNode[S, VariableDeclarator_]] = js.native
  var VoidTypeAnnotation: js.UndefOr[VisitNode[S, VoidTypeAnnotation_]] = js.native
  var While: js.UndefOr[VisitNode[S, typings.babelTypes.mod.While]] = js.native
  var WhileStatement: js.UndefOr[VisitNode[S, WhileStatement_]] = js.native
  var WithStatement: js.UndefOr[VisitNode[S, WithStatement_]] = js.native
  var YieldExpression: js.UndefOr[VisitNode[S, YieldExpression_]] = js.native
}

object Visitor {
  @scala.inline
  def apply[S](): Visitor[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visitor[S]]
  }
  @scala.inline
  implicit class VisitorOps[Self <: Visitor[_], S] (val x: Self with Visitor[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnyTypeAnnotation(value: VisitNode[S, AnyTypeAnnotation_]): Self = this.set("AnyTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyTypeAnnotation: Self = this.set("AnyTypeAnnotation", js.undefined)
    @scala.inline
    def setArrayExpression(value: VisitNode[S, ArrayExpression_]): Self = this.set("ArrayExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayExpression: Self = this.set("ArrayExpression", js.undefined)
    @scala.inline
    def setArrayPattern(value: VisitNode[S, ArrayPattern_]): Self = this.set("ArrayPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayPattern: Self = this.set("ArrayPattern", js.undefined)
    @scala.inline
    def setArrayTypeAnnotation(value: VisitNode[S, ArrayTypeAnnotation_]): Self = this.set("ArrayTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayTypeAnnotation: Self = this.set("ArrayTypeAnnotation", js.undefined)
    @scala.inline
    def setArrowFunctionExpression(value: VisitNode[S, ArrowFunctionExpression_]): Self = this.set("ArrowFunctionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowFunctionExpression: Self = this.set("ArrowFunctionExpression", js.undefined)
    @scala.inline
    def setAssignmentExpression(value: VisitNode[S, AssignmentExpression_]): Self = this.set("AssignmentExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentExpression: Self = this.set("AssignmentExpression", js.undefined)
    @scala.inline
    def setAssignmentPattern(value: VisitNode[S, AssignmentPattern_]): Self = this.set("AssignmentPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentPattern: Self = this.set("AssignmentPattern", js.undefined)
    @scala.inline
    def setAwaitExpression(value: VisitNode[S, AwaitExpression_]): Self = this.set("AwaitExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwaitExpression: Self = this.set("AwaitExpression", js.undefined)
    @scala.inline
    def setBinary(value: VisitNode[S, Binary]): Self = this.set("Binary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinary: Self = this.set("Binary", js.undefined)
    @scala.inline
    def setBinaryExpression(value: VisitNode[S, BinaryExpression_]): Self = this.set("BinaryExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryExpression: Self = this.set("BinaryExpression", js.undefined)
    @scala.inline
    def setBindExpression(value: VisitNode[S, BindExpression_]): Self = this.set("BindExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindExpression: Self = this.set("BindExpression", js.undefined)
    @scala.inline
    def setBlock(value: VisitNode[S, Block]): Self = this.set("Block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("Block", js.undefined)
    @scala.inline
    def setBlockParent(value: VisitNode[S, BlockParent]): Self = this.set("BlockParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockParent: Self = this.set("BlockParent", js.undefined)
    @scala.inline
    def setBlockStatement(value: VisitNode[S, BlockStatement_]): Self = this.set("BlockStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockStatement: Self = this.set("BlockStatement", js.undefined)
    @scala.inline
    def setBooleanLiteral(value: VisitNode[S, BooleanLiteral_]): Self = this.set("BooleanLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanLiteral: Self = this.set("BooleanLiteral", js.undefined)
    @scala.inline
    def setBooleanLiteralTypeAnnotation(value: VisitNode[S, BooleanLiteralTypeAnnotation_]): Self = this.set("BooleanLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanLiteralTypeAnnotation: Self = this.set("BooleanLiteralTypeAnnotation", js.undefined)
    @scala.inline
    def setBooleanTypeAnnotation(value: VisitNode[S, BooleanTypeAnnotation_]): Self = this.set("BooleanTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanTypeAnnotation: Self = this.set("BooleanTypeAnnotation", js.undefined)
    @scala.inline
    def setBreakStatement(value: VisitNode[S, BreakStatement_]): Self = this.set("BreakStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakStatement: Self = this.set("BreakStatement", js.undefined)
    @scala.inline
    def setCallExpression(value: VisitNode[S, CallExpression_]): Self = this.set("CallExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallExpression: Self = this.set("CallExpression", js.undefined)
    @scala.inline
    def setCatchClause(value: VisitNode[S, CatchClause_]): Self = this.set("CatchClause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatchClause: Self = this.set("CatchClause", js.undefined)
    @scala.inline
    def setClass(value: VisitNode[S, Class]): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("Class", js.undefined)
    @scala.inline
    def setClassBody(value: VisitNode[S, ClassBody_]): Self = this.set("ClassBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassBody: Self = this.set("ClassBody", js.undefined)
    @scala.inline
    def setClassDeclaration(value: VisitNode[S, ClassDeclaration_]): Self = this.set("ClassDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassDeclaration: Self = this.set("ClassDeclaration", js.undefined)
    @scala.inline
    def setClassExpression(value: VisitNode[S, ClassExpression_]): Self = this.set("ClassExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassExpression: Self = this.set("ClassExpression", js.undefined)
    @scala.inline
    def setClassImplements(value: VisitNode[S, ClassImplements_]): Self = this.set("ClassImplements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassImplements: Self = this.set("ClassImplements", js.undefined)
    @scala.inline
    def setClassMethod(value: VisitNode[S, ClassMethod_]): Self = this.set("ClassMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassMethod: Self = this.set("ClassMethod", js.undefined)
    @scala.inline
    def setClassProperty(value: VisitNode[S, ClassProperty_]): Self = this.set("ClassProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassProperty: Self = this.set("ClassProperty", js.undefined)
    @scala.inline
    def setCompletionStatement(value: VisitNode[S, CompletionStatement]): Self = this.set("CompletionStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletionStatement: Self = this.set("CompletionStatement", js.undefined)
    @scala.inline
    def setConditional(value: VisitNode[S, Conditional]): Self = this.set("Conditional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditional: Self = this.set("Conditional", js.undefined)
    @scala.inline
    def setConditionalExpression(value: VisitNode[S, ConditionalExpression_]): Self = this.set("ConditionalExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalExpression: Self = this.set("ConditionalExpression", js.undefined)
    @scala.inline
    def setContinueStatement(value: VisitNode[S, ContinueStatement_]): Self = this.set("ContinueStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueStatement: Self = this.set("ContinueStatement", js.undefined)
    @scala.inline
    def setDebuggerStatement(value: VisitNode[S, DebuggerStatement_]): Self = this.set("DebuggerStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebuggerStatement: Self = this.set("DebuggerStatement", js.undefined)
    @scala.inline
    def setDeclaration(value: VisitNode[S, Declaration]): Self = this.set("Declaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclaration: Self = this.set("Declaration", js.undefined)
    @scala.inline
    def setDeclareClass(value: VisitNode[S, DeclareClass_]): Self = this.set("DeclareClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareClass: Self = this.set("DeclareClass", js.undefined)
    @scala.inline
    def setDeclareFunction(value: VisitNode[S, DeclareFunction_]): Self = this.set("DeclareFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareFunction: Self = this.set("DeclareFunction", js.undefined)
    @scala.inline
    def setDeclareInterface(value: VisitNode[S, DeclareInterface_]): Self = this.set("DeclareInterface", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareInterface: Self = this.set("DeclareInterface", js.undefined)
    @scala.inline
    def setDeclareModule(value: VisitNode[S, DeclareModule_]): Self = this.set("DeclareModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareModule: Self = this.set("DeclareModule", js.undefined)
    @scala.inline
    def setDeclareTypeAlias(value: VisitNode[S, DeclareTypeAlias_]): Self = this.set("DeclareTypeAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareTypeAlias: Self = this.set("DeclareTypeAlias", js.undefined)
    @scala.inline
    def setDeclareVariable(value: VisitNode[S, DeclareVariable_]): Self = this.set("DeclareVariable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclareVariable: Self = this.set("DeclareVariable", js.undefined)
    @scala.inline
    def setDecorator(value: VisitNode[S, Decorator_]): Self = this.set("Decorator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorator: Self = this.set("Decorator", js.undefined)
    @scala.inline
    def setDirective(value: VisitNode[S, Directive_]): Self = this.set("Directive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirective: Self = this.set("Directive", js.undefined)
    @scala.inline
    def setDirectiveLiteral(value: VisitNode[S, DirectiveLiteral_]): Self = this.set("DirectiveLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectiveLiteral: Self = this.set("DirectiveLiteral", js.undefined)
    @scala.inline
    def setDoExpression(value: VisitNode[S, DoExpression_]): Self = this.set("DoExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoExpression: Self = this.set("DoExpression", js.undefined)
    @scala.inline
    def setDoWhileStatement(value: VisitNode[S, DoWhileStatement_]): Self = this.set("DoWhileStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoWhileStatement: Self = this.set("DoWhileStatement", js.undefined)
    @scala.inline
    def setEmptyStatement(value: VisitNode[S, EmptyStatement_]): Self = this.set("EmptyStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyStatement: Self = this.set("EmptyStatement", js.undefined)
    @scala.inline
    def setExistentialTypeParam(value: VisitNode[S, ExistentialTypeParam_]): Self = this.set("ExistentialTypeParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExistentialTypeParam: Self = this.set("ExistentialTypeParam", js.undefined)
    @scala.inline
    def setExportAllDeclaration(value: VisitNode[S, ExportAllDeclaration_]): Self = this.set("ExportAllDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportAllDeclaration: Self = this.set("ExportAllDeclaration", js.undefined)
    @scala.inline
    def setExportDeclaration(value: VisitNode[S, ExportDeclaration]): Self = this.set("ExportDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportDeclaration: Self = this.set("ExportDeclaration", js.undefined)
    @scala.inline
    def setExportDefaultDeclaration(value: VisitNode[S, ExportDefaultDeclaration_]): Self = this.set("ExportDefaultDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportDefaultDeclaration: Self = this.set("ExportDefaultDeclaration", js.undefined)
    @scala.inline
    def setExportDefaultSpecifier(value: VisitNode[S, ExportDefaultSpecifier_]): Self = this.set("ExportDefaultSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportDefaultSpecifier: Self = this.set("ExportDefaultSpecifier", js.undefined)
    @scala.inline
    def setExportNamedDeclaration(value: VisitNode[S, ExportNamedDeclaration_]): Self = this.set("ExportNamedDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportNamedDeclaration: Self = this.set("ExportNamedDeclaration", js.undefined)
    @scala.inline
    def setExportNamespaceSpecifier(value: VisitNode[S, ExportNamespaceSpecifier_]): Self = this.set("ExportNamespaceSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportNamespaceSpecifier: Self = this.set("ExportNamespaceSpecifier", js.undefined)
    @scala.inline
    def setExportSpecifier(value: VisitNode[S, ExportSpecifier_]): Self = this.set("ExportSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportSpecifier: Self = this.set("ExportSpecifier", js.undefined)
    @scala.inline
    def setExpression(value: VisitNode[S, Expression]): Self = this.set("Expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("Expression", js.undefined)
    @scala.inline
    def setExpressionStatement(value: VisitNode[S, ExpressionStatement_]): Self = this.set("ExpressionStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressionStatement: Self = this.set("ExpressionStatement", js.undefined)
    @scala.inline
    def setExpressionWrapper(value: VisitNode[S, ExpressionWrapper]): Self = this.set("ExpressionWrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressionWrapper: Self = this.set("ExpressionWrapper", js.undefined)
    @scala.inline
    def setFile(value: VisitNode[S, File_]): Self = this.set("File", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("File", js.undefined)
    @scala.inline
    def setFlow(value: VisitNode[S, Flow]): Self = this.set("Flow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlow: Self = this.set("Flow", js.undefined)
    @scala.inline
    def setFlowBaseAnnotation(value: VisitNode[S, FlowBaseAnnotation]): Self = this.set("FlowBaseAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowBaseAnnotation: Self = this.set("FlowBaseAnnotation", js.undefined)
    @scala.inline
    def setFlowDeclaration(value: VisitNode[S, FlowDeclaration]): Self = this.set("FlowDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlowDeclaration: Self = this.set("FlowDeclaration", js.undefined)
    @scala.inline
    def setFor(value: VisitNode[S, For]): Self = this.set("For", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFor: Self = this.set("For", js.undefined)
    @scala.inline
    def setForInStatement(value: VisitNode[S, ForInStatement_]): Self = this.set("ForInStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForInStatement: Self = this.set("ForInStatement", js.undefined)
    @scala.inline
    def setForOfStatement(value: VisitNode[S, ForOfStatement_]): Self = this.set("ForOfStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForOfStatement: Self = this.set("ForOfStatement", js.undefined)
    @scala.inline
    def setForStatement(value: VisitNode[S, ForStatement_]): Self = this.set("ForStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForStatement: Self = this.set("ForStatement", js.undefined)
    @scala.inline
    def setForXStatement(value: VisitNode[S, ForXStatement]): Self = this.set("ForXStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForXStatement: Self = this.set("ForXStatement", js.undefined)
    @scala.inline
    def setFunction(value: VisitNode[S, Function]): Self = this.set("Function", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunction: Self = this.set("Function", js.undefined)
    @scala.inline
    def setFunctionDeclaration(value: VisitNode[S, FunctionDeclaration_]): Self = this.set("FunctionDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionDeclaration: Self = this.set("FunctionDeclaration", js.undefined)
    @scala.inline
    def setFunctionExpression(value: VisitNode[S, FunctionExpression_]): Self = this.set("FunctionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionExpression: Self = this.set("FunctionExpression", js.undefined)
    @scala.inline
    def setFunctionParent(value: VisitNode[S, FunctionParent]): Self = this.set("FunctionParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionParent: Self = this.set("FunctionParent", js.undefined)
    @scala.inline
    def setFunctionTypeAnnotation(value: VisitNode[S, FunctionTypeAnnotation_]): Self = this.set("FunctionTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionTypeAnnotation: Self = this.set("FunctionTypeAnnotation", js.undefined)
    @scala.inline
    def setFunctionTypeParam(value: VisitNode[S, FunctionTypeParam_]): Self = this.set("FunctionTypeParam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionTypeParam: Self = this.set("FunctionTypeParam", js.undefined)
    @scala.inline
    def setGenericTypeAnnotation(value: VisitNode[S, GenericTypeAnnotation_]): Self = this.set("GenericTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenericTypeAnnotation: Self = this.set("GenericTypeAnnotation", js.undefined)
    @scala.inline
    def setIdentifier(value: VisitNode[S, Identifier_]): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("Identifier", js.undefined)
    @scala.inline
    def setIfStatement(value: VisitNode[S, IfStatement_]): Self = this.set("IfStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfStatement: Self = this.set("IfStatement", js.undefined)
    @scala.inline
    def setImmutable(value: VisitNode[S, Immutable]): Self = this.set("Immutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmutable: Self = this.set("Immutable", js.undefined)
    @scala.inline
    def setImportDeclaration(value: VisitNode[S, ImportDeclaration_]): Self = this.set("ImportDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportDeclaration: Self = this.set("ImportDeclaration", js.undefined)
    @scala.inline
    def setImportDefaultSpecifier(value: VisitNode[S, ImportDefaultSpecifier_]): Self = this.set("ImportDefaultSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportDefaultSpecifier: Self = this.set("ImportDefaultSpecifier", js.undefined)
    @scala.inline
    def setImportNamespaceSpecifier(value: VisitNode[S, ImportNamespaceSpecifier_]): Self = this.set("ImportNamespaceSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportNamespaceSpecifier: Self = this.set("ImportNamespaceSpecifier", js.undefined)
    @scala.inline
    def setImportSpecifier(value: VisitNode[S, ImportSpecifier_]): Self = this.set("ImportSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportSpecifier: Self = this.set("ImportSpecifier", js.undefined)
    @scala.inline
    def setInterfaceDeclaration(value: VisitNode[S, InterfaceDeclaration_]): Self = this.set("InterfaceDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceDeclaration: Self = this.set("InterfaceDeclaration", js.undefined)
    @scala.inline
    def setInterfaceExtends(value: VisitNode[S, InterfaceExtends_]): Self = this.set("InterfaceExtends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceExtends: Self = this.set("InterfaceExtends", js.undefined)
    @scala.inline
    def setIntersectionTypeAnnotation(value: VisitNode[S, IntersectionTypeAnnotation_]): Self = this.set("IntersectionTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntersectionTypeAnnotation: Self = this.set("IntersectionTypeAnnotation", js.undefined)
    @scala.inline
    def setJSX(value: VisitNode[S, JSX]): Self = this.set("JSX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSX: Self = this.set("JSX", js.undefined)
    @scala.inline
    def setJSXAttribute(value: VisitNode[S, JSXAttribute_]): Self = this.set("JSXAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSXAttribute: Self = this.set("JSXAttribute", js.undefined)
    @scala.inline
    def setJSXClosingElement(value: VisitNode[S, JSXClosingElement_]): Self = this.set("JSXClosingElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSXClosingElement: Self = this.set("JSXClosingElement", js.undefined)
    @scala.inline
    def setJSXElement(value: VisitNode[S, JSXElement_]): Self = this.set("JSXElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSXElement: Self = this.set("JSXElement", js.undefined)
    @scala.inline
    def setJSXEmptyExpression(value: VisitNode[S, JSXEmptyExpression_]): Self = this.set("JSXEmptyExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSXEmptyExpression: Self = this.set("JSXEmptyExpression", js.undefined)
    @scala.inline
    def setJSXExpressionContainer(value: VisitNode[S, JSXExpressionContainer_]): Self = this.set("JSXExpressionContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSXExpressionContainer: Self = this.set("JSXExpressionContainer", js.undefined)
    @scala.inline
    def setJSXIdentifier(value: VisitNode[S, JSXIdentifier_]): Self = this.set("JSXIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSXIdentifier: Self = this.set("JSXIdentifier", js.undefined)
    @scala.inline
    def setJSXMemberExpression(value: VisitNode[S, JSXMemberExpression_]): Self = this.set("JSXMemberExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSXMemberExpression: Self = this.set("JSXMemberExpression", js.undefined)
    @scala.inline
    def setJSXNamespacedName(value: VisitNode[S, JSXNamespacedName_]): Self = this.set("JSXNamespacedName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSXNamespacedName: Self = this.set("JSXNamespacedName", js.undefined)
    @scala.inline
    def setJSXOpeningElement(value: VisitNode[S, JSXOpeningElement_]): Self = this.set("JSXOpeningElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSXOpeningElement: Self = this.set("JSXOpeningElement", js.undefined)
    @scala.inline
    def setJSXSpreadAttribute(value: VisitNode[S, JSXSpreadAttribute_]): Self = this.set("JSXSpreadAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSXSpreadAttribute: Self = this.set("JSXSpreadAttribute", js.undefined)
    @scala.inline
    def setJSXText(value: VisitNode[S, JSXText_]): Self = this.set("JSXText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJSXText: Self = this.set("JSXText", js.undefined)
    @scala.inline
    def setLVal(value: VisitNode[S, LVal]): Self = this.set("LVal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLVal: Self = this.set("LVal", js.undefined)
    @scala.inline
    def setLabeledStatement(value: VisitNode[S, LabeledStatement_]): Self = this.set("LabeledStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabeledStatement: Self = this.set("LabeledStatement", js.undefined)
    @scala.inline
    def setLiteral(value: VisitNode[S, Literal]): Self = this.set("Literal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiteral: Self = this.set("Literal", js.undefined)
    @scala.inline
    def setLogicalExpression(value: VisitNode[S, LogicalExpression_]): Self = this.set("LogicalExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogicalExpression: Self = this.set("LogicalExpression", js.undefined)
    @scala.inline
    def setLoop(value: VisitNode[S, Loop]): Self = this.set("Loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("Loop", js.undefined)
    @scala.inline
    def setMemberExpression(value: VisitNode[S, MemberExpression_]): Self = this.set("MemberExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberExpression: Self = this.set("MemberExpression", js.undefined)
    @scala.inline
    def setMetaProperty(value: VisitNode[S, MetaProperty_]): Self = this.set("MetaProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetaProperty: Self = this.set("MetaProperty", js.undefined)
    @scala.inline
    def setMethod(value: VisitNode[S, Method]): Self = this.set("Method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("Method", js.undefined)
    @scala.inline
    def setMixedTypeAnnotation(value: VisitNode[S, MixedTypeAnnotation_]): Self = this.set("MixedTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixedTypeAnnotation: Self = this.set("MixedTypeAnnotation", js.undefined)
    @scala.inline
    def setModuleDeclaration(value: VisitNode[S, ModuleDeclaration]): Self = this.set("ModuleDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleDeclaration: Self = this.set("ModuleDeclaration", js.undefined)
    @scala.inline
    def setModuleSpecifier(value: VisitNode[S, ModuleSpecifier]): Self = this.set("ModuleSpecifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModuleSpecifier: Self = this.set("ModuleSpecifier", js.undefined)
    @scala.inline
    def setNewExpression(value: VisitNode[S, NewExpression_]): Self = this.set("NewExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewExpression: Self = this.set("NewExpression", js.undefined)
    @scala.inline
    def setNoop(value: VisitNode[S, Noop_]): Self = this.set("Noop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoop: Self = this.set("Noop", js.undefined)
    @scala.inline
    def setNullLiteral(value: VisitNode[S, NullLiteral_]): Self = this.set("NullLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullLiteral: Self = this.set("NullLiteral", js.undefined)
    @scala.inline
    def setNullLiteralTypeAnnotation(value: VisitNode[S, NullLiteralTypeAnnotation_]): Self = this.set("NullLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullLiteralTypeAnnotation: Self = this.set("NullLiteralTypeAnnotation", js.undefined)
    @scala.inline
    def setNullableTypeAnnotation(value: VisitNode[S, NullableTypeAnnotation_]): Self = this.set("NullableTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullableTypeAnnotation: Self = this.set("NullableTypeAnnotation", js.undefined)
    @scala.inline
    def setNumberTypeAnnotation(value: VisitNode[S, NumberTypeAnnotation_]): Self = this.set("NumberTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberTypeAnnotation: Self = this.set("NumberTypeAnnotation", js.undefined)
    @scala.inline
    def setNumericLiteral(value: VisitNode[S, NumericLiteral_]): Self = this.set("NumericLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericLiteral: Self = this.set("NumericLiteral", js.undefined)
    @scala.inline
    def setNumericLiteralTypeAnnotation(value: VisitNode[S, NumericLiteralTypeAnnotation_]): Self = this.set("NumericLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericLiteralTypeAnnotation: Self = this.set("NumericLiteralTypeAnnotation", js.undefined)
    @scala.inline
    def setObjectExpression(value: VisitNode[S, ObjectExpression_]): Self = this.set("ObjectExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectExpression: Self = this.set("ObjectExpression", js.undefined)
    @scala.inline
    def setObjectMember(value: VisitNode[S, ObjectMember]): Self = this.set("ObjectMember", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMember: Self = this.set("ObjectMember", js.undefined)
    @scala.inline
    def setObjectMethod(value: VisitNode[S, ObjectMethod_]): Self = this.set("ObjectMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMethod: Self = this.set("ObjectMethod", js.undefined)
    @scala.inline
    def setObjectPattern(value: VisitNode[S, ObjectPattern_]): Self = this.set("ObjectPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectPattern: Self = this.set("ObjectPattern", js.undefined)
    @scala.inline
    def setObjectProperty(value: VisitNode[S, ObjectProperty_]): Self = this.set("ObjectProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectProperty: Self = this.set("ObjectProperty", js.undefined)
    @scala.inline
    def setObjectTypeAnnotation(value: VisitNode[S, ObjectTypeAnnotation_]): Self = this.set("ObjectTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectTypeAnnotation: Self = this.set("ObjectTypeAnnotation", js.undefined)
    @scala.inline
    def setObjectTypeCallProperty(value: VisitNode[S, ObjectTypeCallProperty_]): Self = this.set("ObjectTypeCallProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectTypeCallProperty: Self = this.set("ObjectTypeCallProperty", js.undefined)
    @scala.inline
    def setObjectTypeIndexer(value: VisitNode[S, ObjectTypeIndexer_]): Self = this.set("ObjectTypeIndexer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectTypeIndexer: Self = this.set("ObjectTypeIndexer", js.undefined)
    @scala.inline
    def setObjectTypeProperty(value: VisitNode[S, ObjectTypeProperty_]): Self = this.set("ObjectTypeProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectTypeProperty: Self = this.set("ObjectTypeProperty", js.undefined)
    @scala.inline
    def setParenthesizedExpression(value: VisitNode[S, ParenthesizedExpression_]): Self = this.set("ParenthesizedExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParenthesizedExpression: Self = this.set("ParenthesizedExpression", js.undefined)
    @scala.inline
    def setPattern(value: VisitNode[S, Pattern]): Self = this.set("Pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("Pattern", js.undefined)
    @scala.inline
    def setProgram(value: VisitNode[S, Program_]): Self = this.set("Program", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgram: Self = this.set("Program", js.undefined)
    @scala.inline
    def setProperty(value: VisitNode[S, Property]): Self = this.set("Property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("Property", js.undefined)
    @scala.inline
    def setPureish(value: VisitNode[S, Pureish]): Self = this.set("Pureish", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePureish: Self = this.set("Pureish", js.undefined)
    @scala.inline
    def setQualifiedTypeIdentifier(value: VisitNode[S, QualifiedTypeIdentifier_]): Self = this.set("QualifiedTypeIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifiedTypeIdentifier: Self = this.set("QualifiedTypeIdentifier", js.undefined)
    @scala.inline
    def setRegExpLiteral(value: VisitNode[S, RegExpLiteral_]): Self = this.set("RegExpLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegExpLiteral: Self = this.set("RegExpLiteral", js.undefined)
    @scala.inline
    def setRestElement(value: VisitNode[S, RestElement_]): Self = this.set("RestElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestElement: Self = this.set("RestElement", js.undefined)
    @scala.inline
    def setRestProperty(value: VisitNode[S, RestProperty_]): Self = this.set("RestProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestProperty: Self = this.set("RestProperty", js.undefined)
    @scala.inline
    def setReturnStatement(value: VisitNode[S, ReturnStatement_]): Self = this.set("ReturnStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnStatement: Self = this.set("ReturnStatement", js.undefined)
    @scala.inline
    def setScopable(value: VisitNode[S, Scopable]): Self = this.set("Scopable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopable: Self = this.set("Scopable", js.undefined)
    @scala.inline
    def setScope(value: VisitNode[S, Scopable]): Self = this.set("Scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("Scope", js.undefined)
    @scala.inline
    def setSequenceExpression(value: VisitNode[S, SequenceExpression_]): Self = this.set("SequenceExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequenceExpression: Self = this.set("SequenceExpression", js.undefined)
    @scala.inline
    def setSpreadElement(value: VisitNode[S, SpreadElement_]): Self = this.set("SpreadElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadElement: Self = this.set("SpreadElement", js.undefined)
    @scala.inline
    def setSpreadProperty(value: VisitNode[S, SpreadProperty_]): Self = this.set("SpreadProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadProperty: Self = this.set("SpreadProperty", js.undefined)
    @scala.inline
    def setStatement(value: VisitNode[S, Statement]): Self = this.set("Statement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatement: Self = this.set("Statement", js.undefined)
    @scala.inline
    def setStringLiteral(value: VisitNode[S, StringLiteral_]): Self = this.set("StringLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringLiteral: Self = this.set("StringLiteral", js.undefined)
    @scala.inline
    def setStringLiteralTypeAnnotation(value: VisitNode[S, StringLiteralTypeAnnotation_]): Self = this.set("StringLiteralTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringLiteralTypeAnnotation: Self = this.set("StringLiteralTypeAnnotation", js.undefined)
    @scala.inline
    def setStringTypeAnnotation(value: VisitNode[S, StringTypeAnnotation_]): Self = this.set("StringTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringTypeAnnotation: Self = this.set("StringTypeAnnotation", js.undefined)
    @scala.inline
    def setSuper(value: VisitNode[S, Super]): Self = this.set("Super", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuper: Self = this.set("Super", js.undefined)
    @scala.inline
    def setSwitchCase(value: VisitNode[S, SwitchCase_]): Self = this.set("SwitchCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitchCase: Self = this.set("SwitchCase", js.undefined)
    @scala.inline
    def setSwitchStatement(value: VisitNode[S, SwitchStatement_]): Self = this.set("SwitchStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitchStatement: Self = this.set("SwitchStatement", js.undefined)
    @scala.inline
    def setTaggedTemplateExpression(value: VisitNode[S, TaggedTemplateExpression_]): Self = this.set("TaggedTemplateExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaggedTemplateExpression: Self = this.set("TaggedTemplateExpression", js.undefined)
    @scala.inline
    def setTemplateElement(value: VisitNode[S, TemplateElement_]): Self = this.set("TemplateElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateElement: Self = this.set("TemplateElement", js.undefined)
    @scala.inline
    def setTemplateLiteral(value: VisitNode[S, TemplateLiteral_]): Self = this.set("TemplateLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateLiteral: Self = this.set("TemplateLiteral", js.undefined)
    @scala.inline
    def setTerminatorless(value: VisitNode[S, Terminatorless]): Self = this.set("Terminatorless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminatorless: Self = this.set("Terminatorless", js.undefined)
    @scala.inline
    def setThisExpression(value: VisitNode[S, ThisExpression_]): Self = this.set("ThisExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThisExpression: Self = this.set("ThisExpression", js.undefined)
    @scala.inline
    def setThisTypeAnnotation(value: VisitNode[S, ThisTypeAnnotation_]): Self = this.set("ThisTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThisTypeAnnotation: Self = this.set("ThisTypeAnnotation", js.undefined)
    @scala.inline
    def setThrowStatement(value: VisitNode[S, ThrowStatement_]): Self = this.set("ThrowStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowStatement: Self = this.set("ThrowStatement", js.undefined)
    @scala.inline
    def setTryStatement(value: VisitNode[S, TryStatement_]): Self = this.set("TryStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTryStatement: Self = this.set("TryStatement", js.undefined)
    @scala.inline
    def setTupleTypeAnnotation(value: VisitNode[S, TupleTypeAnnotation_]): Self = this.set("TupleTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTupleTypeAnnotation: Self = this.set("TupleTypeAnnotation", js.undefined)
    @scala.inline
    def setTypeAlias(value: VisitNode[S, TypeAlias_]): Self = this.set("TypeAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAlias: Self = this.set("TypeAlias", js.undefined)
    @scala.inline
    def setTypeAnnotation(value: VisitNode[S, TypeAnnotation_]): Self = this.set("TypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAnnotation: Self = this.set("TypeAnnotation", js.undefined)
    @scala.inline
    def setTypeCastExpression(value: VisitNode[S, TypeCastExpression_]): Self = this.set("TypeCastExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeCastExpression: Self = this.set("TypeCastExpression", js.undefined)
    @scala.inline
    def setTypeParameterDeclaration(value: VisitNode[S, TypeParameterDeclaration_]): Self = this.set("TypeParameterDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeParameterDeclaration: Self = this.set("TypeParameterDeclaration", js.undefined)
    @scala.inline
    def setTypeParameterInstantiation(value: VisitNode[S, TypeParameterInstantiation_]): Self = this.set("TypeParameterInstantiation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeParameterInstantiation: Self = this.set("TypeParameterInstantiation", js.undefined)
    @scala.inline
    def setTypeofTypeAnnotation(value: VisitNode[S, TypeofTypeAnnotation_]): Self = this.set("TypeofTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeofTypeAnnotation: Self = this.set("TypeofTypeAnnotation", js.undefined)
    @scala.inline
    def setUnaryExpression(value: VisitNode[S, UnaryExpression_]): Self = this.set("UnaryExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnaryExpression: Self = this.set("UnaryExpression", js.undefined)
    @scala.inline
    def setUnaryLike(value: VisitNode[S, UnaryLike]): Self = this.set("UnaryLike", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnaryLike: Self = this.set("UnaryLike", js.undefined)
    @scala.inline
    def setUnionTypeAnnotation(value: VisitNode[S, UnionTypeAnnotation_]): Self = this.set("UnionTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnionTypeAnnotation: Self = this.set("UnionTypeAnnotation", js.undefined)
    @scala.inline
    def setUpdateExpression(value: VisitNode[S, UpdateExpression_]): Self = this.set("UpdateExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateExpression: Self = this.set("UpdateExpression", js.undefined)
    @scala.inline
    def setUserWhitespacable(value: VisitNode[S, UserWhitespacable]): Self = this.set("UserWhitespacable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserWhitespacable: Self = this.set("UserWhitespacable", js.undefined)
    @scala.inline
    def setVariableDeclaration(value: VisitNode[S, VariableDeclaration_]): Self = this.set("VariableDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableDeclaration: Self = this.set("VariableDeclaration", js.undefined)
    @scala.inline
    def setVariableDeclarator(value: VisitNode[S, VariableDeclarator_]): Self = this.set("VariableDeclarator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableDeclarator: Self = this.set("VariableDeclarator", js.undefined)
    @scala.inline
    def setVoidTypeAnnotation(value: VisitNode[S, VoidTypeAnnotation_]): Self = this.set("VoidTypeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoidTypeAnnotation: Self = this.set("VoidTypeAnnotation", js.undefined)
    @scala.inline
    def setWhile(value: VisitNode[S, While]): Self = this.set("While", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhile: Self = this.set("While", js.undefined)
    @scala.inline
    def setWhileStatement(value: VisitNode[S, WhileStatement_]): Self = this.set("WhileStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhileStatement: Self = this.set("WhileStatement", js.undefined)
    @scala.inline
    def setWithStatement(value: VisitNode[S, WithStatement_]): Self = this.set("WithStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithStatement: Self = this.set("WithStatement", js.undefined)
    @scala.inline
    def setYieldExpression(value: VisitNode[S, YieldExpression_]): Self = this.set("YieldExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYieldExpression: Self = this.set("YieldExpression", js.undefined)
  }
  
}

