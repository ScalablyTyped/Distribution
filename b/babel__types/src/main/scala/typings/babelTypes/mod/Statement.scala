package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.babelTypesStrings.const
import typings.babelTypes.babelTypesStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Statement
  extends StObject
     with _Node
object Statement {
  
  @scala.inline
  def BlockStatement_(body: js.Array[Statement], directives: js.Array[Directive_]): typings.babelTypes.mod.BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.BlockStatement_]
  }
  
  @scala.inline
  def BreakStatement_(): typings.babelTypes.mod.BreakStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.BreakStatement_]
  }
  
  @scala.inline
  def ClassDeclaration_(body: ClassBody_, id: Identifier_): typings.babelTypes.mod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, decorators = null, end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, superClass = null, superTypeParameters = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.ClassDeclaration_]
  }
  
  @scala.inline
  def ContinueStatement_(): typings.babelTypes.mod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ContinueStatement_]
  }
  
  @scala.inline
  def DebuggerStatement_(): typings.babelTypes.mod.DebuggerStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.DebuggerStatement_]
  }
  
  @scala.inline
  def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.mod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareClass")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareClass_]
  }
  
  @scala.inline
  def DeclareExportAllDeclaration_(source: StringLiteral_): typings.babelTypes.mod.DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareExportAllDeclaration_]
  }
  
  @scala.inline
  def DeclareExportDeclaration_(): typings.babelTypes.mod.DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = null, default = null, end = null, innerComments = null, leadingComments = null, loc = null, source = null, specifiers = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareExportDeclaration_]
  }
  
  @scala.inline
  def DeclareFunction_(id: Identifier_): typings.babelTypes.mod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, predicate = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareFunction_]
  }
  
  @scala.inline
  def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.mod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareInterface_]
  }
  
  @scala.inline
  def DeclareModuleExports_(typeAnnotation: TypeAnnotation_): typings.babelTypes.mod.DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareModuleExports_]
  }
  
  @scala.inline
  def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_): typings.babelTypes.mod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, innerComments = null, kind = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareModule_]
  }
  
  @scala.inline
  def DeclareOpaqueType_(id: Identifier_): typings.babelTypes.mod.DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, supertype = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareOpaqueType_]
  }
  
  @scala.inline
  def DeclareTypeAlias_(id: Identifier_, right: FlowType): typings.babelTypes.mod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareTypeAlias_]
  }
  
  @scala.inline
  def DeclareVariable_(id: Identifier_): typings.babelTypes.mod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareVariable_]
  }
  
  @scala.inline
  def DoWhileStatement_(body: Statement, test: Expression): typings.babelTypes.mod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.DoWhileStatement_]
  }
  
  @scala.inline
  def EmptyStatement_(): typings.babelTypes.mod.EmptyStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.EmptyStatement_]
  }
  
  @scala.inline
  def EnumDeclaration_(body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_, id: Identifier_): typings.babelTypes.mod.EnumDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumDeclaration_]
  }
  
  @scala.inline
  def ExportAllDeclaration_(source: StringLiteral_): typings.babelTypes.mod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], assertions = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportAllDeclaration_]
  }
  
  @scala.inline
  def ExportDefaultDeclaration_(declaration: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression): typings.babelTypes.mod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportDefaultDeclaration_]
  }
  
  @scala.inline
  def ExportNamedDeclaration_(specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): typings.babelTypes.mod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any], assertions = null, declaration = null, end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, source = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportNamedDeclaration_]
  }
  
  @scala.inline
  def ExpressionStatement_(expression: Expression): typings.babelTypes.mod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ExpressionStatement_]
  }
  
  @scala.inline
  def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.mod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForInStatement_]
  }
  
  @scala.inline
  def ForOfStatement_(await: Boolean, body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.mod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForOfStatement_]
  }
  
  @scala.inline
  def ForStatement_(body: Statement): typings.babelTypes.mod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, init = null, innerComments = null, leadingComments = null, loc = null, start = null, test = null, trailingComments = null, update = null)
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForStatement_]
  }
  
  @scala.inline
  def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): typings.babelTypes.mod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], declare = null, end = null, id = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.FunctionDeclaration_]
  }
  
  @scala.inline
  def IfStatement_(consequent: Statement, test: Expression): typings.babelTypes.mod.IfStatement_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], alternate = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.IfStatement_]
  }
  
  @scala.inline
  def ImportDeclaration_(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]
  ): typings.babelTypes.mod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], assertions = null, end = null, importKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.ImportDeclaration_]
  }
  
  @scala.inline
  def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.mod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.InterfaceDeclaration_]
  }
  
  @scala.inline
  def LabeledStatement_(body: Statement, label: Identifier_): typings.babelTypes.mod.LabeledStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.LabeledStatement_]
  }
  
  @scala.inline
  def OpaqueType_(id: Identifier_, impltype: FlowType): typings.babelTypes.mod.OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, supertype = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[typings.babelTypes.mod.OpaqueType_]
  }
  
  @scala.inline
  def ReturnStatement_(): typings.babelTypes.mod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ReturnStatement_]
  }
  
  @scala.inline
  def SwitchStatement_(cases: js.Array[SwitchCase_], discriminant: Expression): typings.babelTypes.mod.SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.SwitchStatement_]
  }
  
  @scala.inline
  def TSDeclareFunction_(
    async: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): typings.babelTypes.mod.TSDeclareFunction_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], declare = null, end = null, id = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.mod.TSDeclareFunction_]
  }
  
  @scala.inline
  def TSEnumDeclaration_(id: Identifier_, members: js.Array[TSEnumMember_]): typings.babelTypes.mod.TSEnumDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], const = null, declare = null, end = null, initializer = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSEnumDeclaration_]
  }
  
  @scala.inline
  def TSExportAssignment_(expression: Expression): typings.babelTypes.mod.TSExportAssignment_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSExportAssignment")
    __obj.asInstanceOf[typings.babelTypes.mod.TSExportAssignment_]
  }
  
  @scala.inline
  def TSImportEqualsDeclaration_(id: Identifier_, isExport: Boolean, moduleReference: TSEntityName | TSExternalModuleReference_): typings.babelTypes.mod.TSImportEqualsDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSImportEqualsDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSImportEqualsDeclaration_]
  }
  
  @scala.inline
  def TSInterfaceDeclaration_(body: TSInterfaceBody_, id: Identifier_): typings.babelTypes.mod.TSInterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.TSInterfaceDeclaration_]
  }
  
  @scala.inline
  def TSModuleDeclaration_(
    body: TSModuleBlock_ | typings.babelTypes.mod.TSModuleDeclaration_,
    id: Identifier_ | StringLiteral_
  ): typings.babelTypes.mod.TSModuleDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, end = null, global = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSModuleDeclaration_]
  }
  
  @scala.inline
  def TSNamespaceExportDeclaration_(id: Identifier_): typings.babelTypes.mod.TSNamespaceExportDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNamespaceExportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNamespaceExportDeclaration_]
  }
  
  @scala.inline
  def TSTypeAliasDeclaration_(id: Identifier_, typeAnnotation: TSType): typings.babelTypes.mod.TSTypeAliasDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeAliasDeclaration_]
  }
  
  @scala.inline
  def ThrowStatement_(argument: Expression): typings.babelTypes.mod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ThrowStatement_]
  }
  
  @scala.inline
  def TryStatement_(block: BlockStatement_): typings.babelTypes.mod.TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], end = null, finalizer = null, handler = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.TryStatement_]
  }
  
  @scala.inline
  def TypeAlias_(id: Identifier_, right: FlowType): typings.babelTypes.mod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeAlias_]
  }
  
  @scala.inline
  def VariableDeclaration_(declarations: js.Array[VariableDeclarator_], kind: `var` | let | const): typings.babelTypes.mod.VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.VariableDeclaration_]
  }
  
  @scala.inline
  def WhileStatement_(body: Statement, test: Expression): typings.babelTypes.mod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.WhileStatement_]
  }
  
  @scala.inline
  def WithStatement_(body: Statement, `object`: Expression): typings.babelTypes.mod.WithStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.WithStatement_]
  }
}
