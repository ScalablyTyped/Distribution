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

trait TraverseOptions[S] extends Visitor[S] {
  var noScope: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[Scope] = js.undefined
}

object TraverseOptions {
  @scala.inline
  def apply[S](
    AnyTypeAnnotation: VisitNode[S, AnyTypeAnnotation_] = null,
    ArrayExpression: VisitNode[S, ArrayExpression_] = null,
    ArrayPattern: VisitNode[S, ArrayPattern_] = null,
    ArrayTypeAnnotation: VisitNode[S, ArrayTypeAnnotation_] = null,
    ArrowFunctionExpression: VisitNode[S, ArrowFunctionExpression_] = null,
    AssignmentExpression: VisitNode[S, AssignmentExpression_] = null,
    AssignmentPattern: VisitNode[S, AssignmentPattern_] = null,
    AwaitExpression: VisitNode[S, AwaitExpression_] = null,
    Binary: VisitNode[S, Binary] = null,
    BinaryExpression: VisitNode[S, BinaryExpression_] = null,
    BindExpression: VisitNode[S, BindExpression_] = null,
    Block: VisitNode[S, Block] = null,
    BlockParent: VisitNode[S, BlockParent] = null,
    BlockStatement: VisitNode[S, BlockStatement_] = null,
    BooleanLiteral: VisitNode[S, BooleanLiteral_] = null,
    BooleanLiteralTypeAnnotation: VisitNode[S, BooleanLiteralTypeAnnotation_] = null,
    BooleanTypeAnnotation: VisitNode[S, BooleanTypeAnnotation_] = null,
    BreakStatement: VisitNode[S, BreakStatement_] = null,
    CallExpression: VisitNode[S, CallExpression_] = null,
    CatchClause: VisitNode[S, CatchClause_] = null,
    Class: VisitNode[S, Class] = null,
    ClassBody: VisitNode[S, ClassBody_] = null,
    ClassDeclaration: VisitNode[S, ClassDeclaration_] = null,
    ClassExpression: VisitNode[S, ClassExpression_] = null,
    ClassImplements: VisitNode[S, ClassImplements_] = null,
    ClassMethod: VisitNode[S, ClassMethod_] = null,
    ClassProperty: VisitNode[S, ClassProperty_] = null,
    CompletionStatement: VisitNode[S, CompletionStatement] = null,
    Conditional: VisitNode[S, Conditional] = null,
    ConditionalExpression: VisitNode[S, ConditionalExpression_] = null,
    ContinueStatement: VisitNode[S, ContinueStatement_] = null,
    DebuggerStatement: VisitNode[S, DebuggerStatement_] = null,
    Declaration: VisitNode[S, Declaration] = null,
    DeclareClass: VisitNode[S, DeclareClass_] = null,
    DeclareFunction: VisitNode[S, DeclareFunction_] = null,
    DeclareInterface: VisitNode[S, DeclareInterface_] = null,
    DeclareModule: VisitNode[S, DeclareModule_] = null,
    DeclareTypeAlias: VisitNode[S, DeclareTypeAlias_] = null,
    DeclareVariable: VisitNode[S, DeclareVariable_] = null,
    Decorator: VisitNode[S, Decorator_] = null,
    Directive: VisitNode[S, Directive_] = null,
    DirectiveLiteral: VisitNode[S, DirectiveLiteral_] = null,
    DoExpression: VisitNode[S, DoExpression_] = null,
    DoWhileStatement: VisitNode[S, DoWhileStatement_] = null,
    EmptyStatement: VisitNode[S, EmptyStatement_] = null,
    ExistentialTypeParam: VisitNode[S, ExistentialTypeParam_] = null,
    ExportAllDeclaration: VisitNode[S, ExportAllDeclaration_] = null,
    ExportDeclaration: VisitNode[S, ExportDeclaration] = null,
    ExportDefaultDeclaration: VisitNode[S, ExportDefaultDeclaration_] = null,
    ExportDefaultSpecifier: VisitNode[S, ExportDefaultSpecifier_] = null,
    ExportNamedDeclaration: VisitNode[S, ExportNamedDeclaration_] = null,
    ExportNamespaceSpecifier: VisitNode[S, ExportNamespaceSpecifier_] = null,
    ExportSpecifier: VisitNode[S, ExportSpecifier_] = null,
    Expression: VisitNode[S, Expression] = null,
    ExpressionStatement: VisitNode[S, ExpressionStatement_] = null,
    ExpressionWrapper: VisitNode[S, ExpressionWrapper] = null,
    File: VisitNode[S, File_] = null,
    Flow: VisitNode[S, Flow] = null,
    FlowBaseAnnotation: VisitNode[S, FlowBaseAnnotation] = null,
    FlowDeclaration: VisitNode[S, FlowDeclaration] = null,
    For: VisitNode[S, For] = null,
    ForInStatement: VisitNode[S, ForInStatement_] = null,
    ForOfStatement: VisitNode[S, ForOfStatement_] = null,
    ForStatement: VisitNode[S, ForStatement_] = null,
    ForXStatement: VisitNode[S, ForXStatement] = null,
    Function: VisitNode[S, Function] = null,
    FunctionDeclaration: VisitNode[S, FunctionDeclaration_] = null,
    FunctionExpression: VisitNode[S, FunctionExpression_] = null,
    FunctionParent: VisitNode[S, FunctionParent] = null,
    FunctionTypeAnnotation: VisitNode[S, FunctionTypeAnnotation_] = null,
    FunctionTypeParam: VisitNode[S, FunctionTypeParam_] = null,
    GenericTypeAnnotation: VisitNode[S, GenericTypeAnnotation_] = null,
    Identifier: VisitNode[S, Identifier_] = null,
    IfStatement: VisitNode[S, IfStatement_] = null,
    Immutable: VisitNode[S, Immutable] = null,
    ImportDeclaration: VisitNode[S, ImportDeclaration_] = null,
    ImportDefaultSpecifier: VisitNode[S, ImportDefaultSpecifier_] = null,
    ImportNamespaceSpecifier: VisitNode[S, ImportNamespaceSpecifier_] = null,
    ImportSpecifier: VisitNode[S, ImportSpecifier_] = null,
    InterfaceDeclaration: VisitNode[S, InterfaceDeclaration_] = null,
    InterfaceExtends: VisitNode[S, InterfaceExtends_] = null,
    IntersectionTypeAnnotation: VisitNode[S, IntersectionTypeAnnotation_] = null,
    JSX: VisitNode[S, JSX] = null,
    JSXAttribute: VisitNode[S, JSXAttribute_] = null,
    JSXClosingElement: VisitNode[S, JSXClosingElement_] = null,
    JSXElement: VisitNode[S, JSXElement_] = null,
    JSXEmptyExpression: VisitNode[S, JSXEmptyExpression_] = null,
    JSXExpressionContainer: VisitNode[S, JSXExpressionContainer_] = null,
    JSXIdentifier: VisitNode[S, JSXIdentifier_] = null,
    JSXMemberExpression: VisitNode[S, JSXMemberExpression_] = null,
    JSXNamespacedName: VisitNode[S, JSXNamespacedName_] = null,
    JSXOpeningElement: VisitNode[S, JSXOpeningElement_] = null,
    JSXSpreadAttribute: VisitNode[S, JSXSpreadAttribute_] = null,
    JSXText: VisitNode[S, JSXText_] = null,
    LVal: VisitNode[S, LVal] = null,
    LabeledStatement: VisitNode[S, LabeledStatement_] = null,
    Literal: VisitNode[S, Literal] = null,
    LogicalExpression: VisitNode[S, LogicalExpression_] = null,
    Loop: VisitNode[S, Loop] = null,
    MemberExpression: VisitNode[S, MemberExpression_] = null,
    MetaProperty: VisitNode[S, MetaProperty_] = null,
    Method: VisitNode[S, Method] = null,
    MixedTypeAnnotation: VisitNode[S, MixedTypeAnnotation_] = null,
    ModuleDeclaration: VisitNode[S, ModuleDeclaration] = null,
    ModuleSpecifier: VisitNode[S, ModuleSpecifier] = null,
    NewExpression: VisitNode[S, NewExpression_] = null,
    Noop: VisitNode[S, Noop_] = null,
    NullLiteral: VisitNode[S, NullLiteral_] = null,
    NullLiteralTypeAnnotation: VisitNode[S, NullLiteralTypeAnnotation_] = null,
    NullableTypeAnnotation: VisitNode[S, NullableTypeAnnotation_] = null,
    NumberTypeAnnotation: VisitNode[S, NumberTypeAnnotation_] = null,
    NumericLiteral: VisitNode[S, NumericLiteral_] = null,
    NumericLiteralTypeAnnotation: VisitNode[S, NumericLiteralTypeAnnotation_] = null,
    ObjectExpression: VisitNode[S, ObjectExpression_] = null,
    ObjectMember: VisitNode[S, ObjectMember] = null,
    ObjectMethod: VisitNode[S, ObjectMethod_] = null,
    ObjectPattern: VisitNode[S, ObjectPattern_] = null,
    ObjectProperty: VisitNode[S, ObjectProperty_] = null,
    ObjectTypeAnnotation: VisitNode[S, ObjectTypeAnnotation_] = null,
    ObjectTypeCallProperty: VisitNode[S, ObjectTypeCallProperty_] = null,
    ObjectTypeIndexer: VisitNode[S, ObjectTypeIndexer_] = null,
    ObjectTypeProperty: VisitNode[S, ObjectTypeProperty_] = null,
    ParenthesizedExpression: VisitNode[S, ParenthesizedExpression_] = null,
    Pattern: VisitNode[S, Pattern] = null,
    Program: VisitNode[S, Program_] = null,
    Property: VisitNode[S, Property] = null,
    Pureish: VisitNode[S, Pureish] = null,
    QualifiedTypeIdentifier: VisitNode[S, QualifiedTypeIdentifier_] = null,
    RegExpLiteral: VisitNode[S, RegExpLiteral_] = null,
    RestElement: VisitNode[S, RestElement_] = null,
    RestProperty: VisitNode[S, RestProperty_] = null,
    ReturnStatement: VisitNode[S, ReturnStatement_] = null,
    Scopable: VisitNode[S, Scopable] = null,
    Scope: VisitNode[S, Scopable] = null,
    SequenceExpression: VisitNode[S, SequenceExpression_] = null,
    SpreadElement: VisitNode[S, SpreadElement_] = null,
    SpreadProperty: VisitNode[S, SpreadProperty_] = null,
    Statement: VisitNode[S, Statement] = null,
    StringLiteral: VisitNode[S, StringLiteral_] = null,
    StringLiteralTypeAnnotation: VisitNode[S, StringLiteralTypeAnnotation_] = null,
    StringTypeAnnotation: VisitNode[S, StringTypeAnnotation_] = null,
    Super: VisitNode[S, Super] = null,
    SwitchCase: VisitNode[S, SwitchCase_] = null,
    SwitchStatement: VisitNode[S, SwitchStatement_] = null,
    TaggedTemplateExpression: VisitNode[S, TaggedTemplateExpression_] = null,
    TemplateElement: VisitNode[S, TemplateElement_] = null,
    TemplateLiteral: VisitNode[S, TemplateLiteral_] = null,
    Terminatorless: VisitNode[S, Terminatorless] = null,
    ThisExpression: VisitNode[S, ThisExpression_] = null,
    ThisTypeAnnotation: VisitNode[S, ThisTypeAnnotation_] = null,
    ThrowStatement: VisitNode[S, ThrowStatement_] = null,
    TryStatement: VisitNode[S, TryStatement_] = null,
    TupleTypeAnnotation: VisitNode[S, TupleTypeAnnotation_] = null,
    TypeAlias: VisitNode[S, TypeAlias_] = null,
    TypeAnnotation: VisitNode[S, TypeAnnotation_] = null,
    TypeCastExpression: VisitNode[S, TypeCastExpression_] = null,
    TypeParameterDeclaration: VisitNode[S, TypeParameterDeclaration_] = null,
    TypeParameterInstantiation: VisitNode[S, TypeParameterInstantiation_] = null,
    TypeofTypeAnnotation: VisitNode[S, TypeofTypeAnnotation_] = null,
    UnaryExpression: VisitNode[S, UnaryExpression_] = null,
    UnaryLike: VisitNode[S, UnaryLike] = null,
    UnionTypeAnnotation: VisitNode[S, UnionTypeAnnotation_] = null,
    UpdateExpression: VisitNode[S, UpdateExpression_] = null,
    UserWhitespacable: VisitNode[S, UserWhitespacable] = null,
    VariableDeclaration: VisitNode[S, VariableDeclaration_] = null,
    VariableDeclarator: VisitNode[S, VariableDeclarator_] = null,
    VoidTypeAnnotation: VisitNode[S, VoidTypeAnnotation_] = null,
    While: VisitNode[S, While] = null,
    WhileStatement: VisitNode[S, WhileStatement_] = null,
    WithStatement: VisitNode[S, WithStatement_] = null,
    YieldExpression: VisitNode[S, YieldExpression_] = null,
    enter: (/* path */ NodePath[Node], /* state */ js.Any) => Unit = null,
    exit: (/* path */ NodePath[Node], /* state */ js.Any) => Unit = null,
    noScope: js.UndefOr[Boolean] = js.undefined,
    scope: Scope = null
  ): TraverseOptions[S] = {
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
    if (!js.isUndefined(noScope)) __obj.updateDynamic("noScope")(noScope.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraverseOptions[S]]
  }
}

