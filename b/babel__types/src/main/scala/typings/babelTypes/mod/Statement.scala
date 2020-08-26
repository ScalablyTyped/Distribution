package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BlockStatement
import typings.babelTypes.babelTypesStrings.BreakStatement
import typings.babelTypes.babelTypesStrings.ClassDeclaration
import typings.babelTypes.babelTypesStrings.ContinueStatement
import typings.babelTypes.babelTypesStrings.DebuggerStatement
import typings.babelTypes.babelTypesStrings.DeclareClass
import typings.babelTypes.babelTypesStrings.DeclareExportAllDeclaration
import typings.babelTypes.babelTypesStrings.DeclareExportDeclaration
import typings.babelTypes.babelTypesStrings.DeclareFunction
import typings.babelTypes.babelTypesStrings.DeclareInterface
import typings.babelTypes.babelTypesStrings.DeclareModule
import typings.babelTypes.babelTypesStrings.DeclareModuleExports
import typings.babelTypes.babelTypesStrings.DeclareOpaqueType
import typings.babelTypes.babelTypesStrings.DeclareTypeAlias
import typings.babelTypes.babelTypesStrings.DeclareVariable
import typings.babelTypes.babelTypesStrings.DoWhileStatement
import typings.babelTypes.babelTypesStrings.EmptyStatement
import typings.babelTypes.babelTypesStrings.EnumDeclaration
import typings.babelTypes.babelTypesStrings.ExportAllDeclaration
import typings.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import typings.babelTypes.babelTypesStrings.ExportNamedDeclaration
import typings.babelTypes.babelTypesStrings.ExpressionStatement
import typings.babelTypes.babelTypesStrings.ForInStatement
import typings.babelTypes.babelTypesStrings.ForOfStatement
import typings.babelTypes.babelTypesStrings.ForStatement
import typings.babelTypes.babelTypesStrings.FunctionDeclaration
import typings.babelTypes.babelTypesStrings.IfStatement
import typings.babelTypes.babelTypesStrings.ImportDeclaration
import typings.babelTypes.babelTypesStrings.InterfaceDeclaration
import typings.babelTypes.babelTypesStrings.LabeledStatement
import typings.babelTypes.babelTypesStrings.OpaqueType
import typings.babelTypes.babelTypesStrings.ReturnStatement
import typings.babelTypes.babelTypesStrings.SwitchStatement
import typings.babelTypes.babelTypesStrings.TSDeclareFunction
import typings.babelTypes.babelTypesStrings.TSEnumDeclaration
import typings.babelTypes.babelTypesStrings.TSExportAssignment
import typings.babelTypes.babelTypesStrings.TSImportEqualsDeclaration
import typings.babelTypes.babelTypesStrings.TSInterfaceDeclaration
import typings.babelTypes.babelTypesStrings.TSModuleDeclaration
import typings.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration
import typings.babelTypes.babelTypesStrings.TSTypeAliasDeclaration
import typings.babelTypes.babelTypesStrings.ThrowStatement
import typings.babelTypes.babelTypesStrings.TryStatement
import typings.babelTypes.babelTypesStrings.TypeAlias
import typings.babelTypes.babelTypesStrings.VariableDeclaration
import typings.babelTypes.babelTypesStrings.WhileStatement
import typings.babelTypes.babelTypesStrings.WithStatement
import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.babelTypesStrings.const
import typings.babelTypes.babelTypesStrings.let
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.BlockStatement_
  - typings.babelTypes.mod.BreakStatement_
  - typings.babelTypes.mod.ContinueStatement_
  - typings.babelTypes.mod.DebuggerStatement_
  - typings.babelTypes.mod.DoWhileStatement_
  - typings.babelTypes.mod.EmptyStatement_
  - typings.babelTypes.mod.ExpressionStatement_
  - typings.babelTypes.mod.ForInStatement_
  - typings.babelTypes.mod.ForStatement_
  - typings.babelTypes.mod.FunctionDeclaration_
  - typings.babelTypes.mod.IfStatement_
  - typings.babelTypes.mod.LabeledStatement_
  - typings.babelTypes.mod.ReturnStatement_
  - typings.babelTypes.mod.SwitchStatement_
  - typings.babelTypes.mod.ThrowStatement_
  - typings.babelTypes.mod.TryStatement_
  - typings.babelTypes.mod.VariableDeclaration_
  - typings.babelTypes.mod.WhileStatement_
  - typings.babelTypes.mod.WithStatement_
  - typings.babelTypes.mod.ClassDeclaration_
  - typings.babelTypes.mod.ExportAllDeclaration_
  - typings.babelTypes.mod.ExportDefaultDeclaration_
  - typings.babelTypes.mod.ExportNamedDeclaration_
  - typings.babelTypes.mod.ForOfStatement_
  - typings.babelTypes.mod.ImportDeclaration_
  - typings.babelTypes.mod.DeclareClass_
  - typings.babelTypes.mod.DeclareFunction_
  - typings.babelTypes.mod.DeclareInterface_
  - typings.babelTypes.mod.DeclareModule_
  - typings.babelTypes.mod.DeclareModuleExports_
  - typings.babelTypes.mod.DeclareTypeAlias_
  - typings.babelTypes.mod.DeclareOpaqueType_
  - typings.babelTypes.mod.DeclareVariable_
  - typings.babelTypes.mod.DeclareExportDeclaration_
  - typings.babelTypes.mod.DeclareExportAllDeclaration_
  - typings.babelTypes.mod.InterfaceDeclaration_
  - typings.babelTypes.mod.OpaqueType_
  - typings.babelTypes.mod.TypeAlias_
  - typings.babelTypes.mod.EnumDeclaration_
  - typings.babelTypes.mod.TSDeclareFunction_
  - typings.babelTypes.mod.TSInterfaceDeclaration_
  - typings.babelTypes.mod.TSTypeAliasDeclaration_
  - typings.babelTypes.mod.TSEnumDeclaration_
  - typings.babelTypes.mod.TSModuleDeclaration_
  - typings.babelTypes.mod.TSImportEqualsDeclaration_
  - typings.babelTypes.mod.TSExportAssignment_
  - typings.babelTypes.mod.TSNamespaceExportDeclaration_
*/
trait Statement extends _Node

object Statement {
  @scala.inline
  def ContinueStatement_(`type`: ContinueStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression, `type`: ForInStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DeclareModuleExports_(`type`: DeclareModuleExports, typeAnnotation: TypeAnnotation_): Statement = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def SwitchStatement_(cases: js.Array[SwitchCase_], discriminant: Expression, `type`: SwitchStatement): Statement = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def OpaqueType_(id: Identifier_, impltype: FlowType, `type`: OpaqueType): Statement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DeclareVariable_(id: Identifier_, `type`: DeclareVariable): Statement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def WithStatement_(body: Statement, `object`: Expression, `type`: WithStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: InterfaceDeclaration): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ExportAllDeclaration_(source: StringLiteral_, `type`: ExportAllDeclaration): Statement = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def BlockStatement_(body: js.Array[Statement], directives: js.Array[Directive_], `type`: BlockStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def TSNamespaceExportDeclaration_(id: Identifier_, `type`: TSNamespaceExportDeclaration): Statement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ExportDefaultDeclaration_(
    declaration: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression,
    `type`: ExportDefaultDeclaration
  ): Statement = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def TryStatement_(block: BlockStatement_, `type`: TryStatement): Statement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def IfStatement_(consequent: Statement, test: Expression, `type`: IfStatement): Statement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def LabeledStatement_(body: Statement, label: Identifier_, `type`: LabeledStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_, `type`: DeclareModule): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def TSDeclareFunction_(
    async: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: TSDeclareFunction
  ): Statement = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ImportDeclaration_(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    `type`: ImportDeclaration
  ): Statement = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DeclareFunction_(id: Identifier_, `type`: DeclareFunction): Statement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ExportNamedDeclaration_(
    specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_],
    `type`: ExportNamedDeclaration
  ): Statement = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DeclareExportDeclaration_(`type`: DeclareExportDeclaration): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def VariableDeclaration_(
    declarations: js.Array[VariableDeclarator_],
    kind: `var` | let | const,
    `type`: VariableDeclaration
  ): Statement = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def TSExportAssignment_(expression: Expression, `type`: TSExportAssignment): Statement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DeclareExportAllDeclaration_(source: StringLiteral_, `type`: DeclareExportAllDeclaration): Statement = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ForStatement_(body: Statement, `type`: ForStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareClass): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_, `type`: DeclareInterface): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DebuggerStatement_(`type`: DebuggerStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: FunctionDeclaration
  ): Statement = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def EnumDeclaration_(
    body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_,
    id: Identifier_,
    `type`: EnumDeclaration
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def TSTypeAliasDeclaration_(id: Identifier_, `type`: TSTypeAliasDeclaration, typeAnnotation: TSType): Statement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def TSModuleDeclaration_(
    body: TSModuleBlock_ | typings.babelTypes.mod.TSModuleDeclaration_,
    id: Identifier_ | StringLiteral_,
    `type`: TSModuleDeclaration
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ReturnStatement_(`type`: ReturnStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def WhileStatement_(body: Statement, test: Expression, `type`: WhileStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def EmptyStatement_(`type`: EmptyStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def TypeAlias_(id: Identifier_, right: FlowType, `type`: TypeAlias): Statement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def TSInterfaceDeclaration_(body: TSInterfaceBody_, id: Identifier_, `type`: TSInterfaceDeclaration): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def TSEnumDeclaration_(id: Identifier_, members: js.Array[TSEnumMember_], `type`: TSEnumDeclaration): Statement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ThrowStatement_(argument: Expression, `type`: ThrowStatement): Statement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DeclareTypeAlias_(id: Identifier_, right: FlowType, `type`: DeclareTypeAlias): Statement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ForOfStatement_(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration_ | LVal,
    right: Expression,
    `type`: ForOfStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ExpressionStatement_(expression: Expression, `type`: ExpressionStatement): Statement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DeclareOpaqueType_(id: Identifier_, `type`: DeclareOpaqueType): Statement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DoWhileStatement_(body: Statement, test: Expression, `type`: DoWhileStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def TSImportEqualsDeclaration_(
    id: Identifier_,
    isExport: Boolean,
    moduleReference: TSEntityName | TSExternalModuleReference_,
    `type`: TSImportEqualsDeclaration
  ): Statement = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def BreakStatement_(`type`: BreakStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ClassDeclaration_(body: ClassBody_, id: Identifier_, `type`: ClassDeclaration): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
}

