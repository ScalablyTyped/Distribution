package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.babelTypesStrings.const
import typings.babelTypes.babelTypesStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.BlockStatement_
  - typings.babelTypes.ts36Mod.BreakStatement_
  - typings.babelTypes.ts36Mod.ContinueStatement_
  - typings.babelTypes.ts36Mod.DebuggerStatement_
  - typings.babelTypes.ts36Mod.DoWhileStatement_
  - typings.babelTypes.ts36Mod.EmptyStatement_
  - typings.babelTypes.ts36Mod.ExpressionStatement_
  - typings.babelTypes.ts36Mod.ForInStatement_
  - typings.babelTypes.ts36Mod.ForStatement_
  - typings.babelTypes.ts36Mod.FunctionDeclaration_
  - typings.babelTypes.ts36Mod.IfStatement_
  - typings.babelTypes.ts36Mod.LabeledStatement_
  - typings.babelTypes.ts36Mod.ReturnStatement_
  - typings.babelTypes.ts36Mod.SwitchStatement_
  - typings.babelTypes.ts36Mod.ThrowStatement_
  - typings.babelTypes.ts36Mod.TryStatement_
  - typings.babelTypes.ts36Mod.VariableDeclaration_
  - typings.babelTypes.ts36Mod.WhileStatement_
  - typings.babelTypes.ts36Mod.WithStatement_
  - typings.babelTypes.ts36Mod.ClassDeclaration_
  - typings.babelTypes.ts36Mod.ExportAllDeclaration_
  - typings.babelTypes.ts36Mod.ExportDefaultDeclaration_
  - typings.babelTypes.ts36Mod.ExportNamedDeclaration_
  - typings.babelTypes.ts36Mod.ForOfStatement_
  - typings.babelTypes.ts36Mod.ImportDeclaration_
  - typings.babelTypes.ts36Mod.DeclareClass_
  - typings.babelTypes.ts36Mod.DeclareFunction_
  - typings.babelTypes.ts36Mod.DeclareInterface_
  - typings.babelTypes.ts36Mod.DeclareModule_
  - typings.babelTypes.ts36Mod.DeclareTypeAlias_
  - typings.babelTypes.ts36Mod.DeclareVariable_
  - typings.babelTypes.ts36Mod.InterfaceDeclaration_
  - typings.babelTypes.ts36Mod.TypeAlias_
  - typings.babelTypes.ts36Mod.TSDeclareFunction
  - typings.babelTypes.ts36Mod.TSEnumDeclaration
  - typings.babelTypes.ts36Mod.TSExportAssignment
  - typings.babelTypes.ts36Mod.TSImportEqualsDeclaration
  - typings.babelTypes.ts36Mod.TSInterfaceDeclaration
  - typings.babelTypes.ts36Mod.TSModuleDeclaration
  - typings.babelTypes.ts36Mod.TSNamespaceExportDeclaration
  - typings.babelTypes.ts36Mod.TSTypeAliasDeclaration
*/
trait Statement extends StObject
object Statement {
  
  inline def BlockStatement_(body: js.Array[Statement], end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BlockStatement_]
  }
  
  inline def BreakStatement_(end: Double, label: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.BreakStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BreakStatement_]
  }
  
  inline def ClassDeclaration_(
    body: ClassBody_,
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    superClass: Expression
  ): typings.babelTypes.ts36Mod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ClassDeclaration_]
  }
  
  inline def ContinueStatement_(end: Double, label: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ContinueStatement_]
  }
  
  inline def DebuggerStatement_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.DebuggerStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DebuggerStatement_]
  }
  
  inline def DeclareClass_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareClass_]
  }
  
  inline def DeclareFunction_(end: Double, id: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareFunction_]
  }
  
  inline def DeclareInterface_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareInterface_]
  }
  
  inline def DeclareModule_(
    body: BlockStatement_,
    end: Double,
    id: StringLiteral_ | Identifier_,
    loc: SourceLocation,
    start: Double
  ): typings.babelTypes.ts36Mod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareModule_]
  }
  
  inline def DeclareTypeAlias_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareTypeAlias_]
  }
  
  inline def DeclareVariable_(end: Double, id: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DeclareVariable_]
  }
  
  inline def DoWhileStatement_(body: Statement, end: Double, loc: SourceLocation, start: Double, test: Expression): typings.babelTypes.ts36Mod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DoWhileStatement_]
  }
  
  inline def EmptyStatement_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.EmptyStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.EmptyStatement_]
  }
  
  inline def ExportAllDeclaration_(end: Double, loc: SourceLocation, source: StringLiteral_, start: Double): typings.babelTypes.ts36Mod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ExportAllDeclaration_]
  }
  
  inline def ExportDefaultDeclaration_(declaration: Declaration | Expression, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ExportDefaultDeclaration_]
  }
  
  inline def ExportNamedDeclaration_(
    declaration: Declaration,
    end: Double,
    loc: SourceLocation,
    specifiers: js.Array[ExportSpecifier_],
    start: Double
  ): typings.babelTypes.ts36Mod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], source = null)
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ExportNamedDeclaration_]
  }
  
  inline def ExpressionStatement_(end: Double, expression: Expression, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ExpressionStatement_]
  }
  
  inline def ForInStatement_(
    body: Statement,
    end: Double,
    left: VariableDeclaration_ | LVal,
    loc: SourceLocation,
    right: Expression,
    start: Double
  ): typings.babelTypes.ts36Mod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ForInStatement_]
  }
  
  inline def ForOfStatement_(
    body: Statement,
    end: Double,
    left: VariableDeclaration_ | LVal,
    loc: SourceLocation,
    right: Expression,
    start: Double
  ): typings.babelTypes.ts36Mod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ForOfStatement_]
  }
  
  inline def ForStatement_(
    body: Statement,
    end: Double,
    init: VariableDeclaration_ | Expression,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    update: Expression
  ): typings.babelTypes.ts36Mod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ForStatement_]
  }
  
  inline def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    end: Double,
    generator: Boolean,
    id: Identifier_,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double
  ): typings.babelTypes.ts36Mod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.FunctionDeclaration_]
  }
  
  inline def IfStatement_(
    alternate: Statement,
    consequent: Statement,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression
  ): typings.babelTypes.ts36Mod.IfStatement_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.IfStatement_]
  }
  
  inline def ImportDeclaration_(
    end: Double,
    loc: SourceLocation,
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_],
    start: Double
  ): typings.babelTypes.ts36Mod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ImportDeclaration_]
  }
  
  inline def InterfaceDeclaration_(
    body: ObjectTypeAnnotation_,
    end: Double,
    `extends`: js.Array[InterfaceExtends_],
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.InterfaceDeclaration_]
  }
  
  inline def LabeledStatement_(body: Statement, end: Double, label: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.LabeledStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.LabeledStatement_]
  }
  
  inline def ReturnStatement_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ReturnStatement_]
  }
  
  inline def SwitchStatement_(
    cases: js.Array[SwitchCase_],
    discriminant: Expression,
    end: Double,
    loc: SourceLocation,
    start: Double
  ): typings.babelTypes.ts36Mod.SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.SwitchStatement_]
  }
  
  inline def TSDeclareFunction(
    async: Boolean,
    end: Double,
    generator: Boolean,
    loc: SourceLocation,
    params: js.Array[LVal],
    start: Double
  ): typings.babelTypes.ts36Mod.TSDeclareFunction = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], declare = null, id = null, returnType = null, typeParameters = null)
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSDeclareFunction]
  }
  
  inline def TSEnumDeclaration(end: Double, id: Identifier_, loc: SourceLocation, members: js.Array[TSEnumMember], start: Double): typings.babelTypes.ts36Mod.TSEnumDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], const = null, declare = null, initializer = null)
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSEnumDeclaration]
  }
  
  inline def TSExportAssignment(end: Double, expression: Expression, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSExportAssignment = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExportAssignment")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSExportAssignment]
  }
  
  inline def TSImportEqualsDeclaration(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    moduleReference: TSEntityName | TSExternalModuleReference,
    start: Double
  ): typings.babelTypes.ts36Mod.TSImportEqualsDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], isExport = null)
    __obj.updateDynamic("type")("TSImportEqualsDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSImportEqualsDeclaration]
  }
  
  inline def TSInterfaceDeclaration(body: TSInterfaceBody, end: Double, id: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSInterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], declare = null, typeParameters = null)
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSInterfaceDeclaration]
  }
  
  inline def TSModuleDeclaration(
    body: TSModuleBlock | typings.babelTypes.ts36Mod.TSModuleDeclaration,
    end: Double,
    id: Identifier_ | StringLiteral_,
    loc: SourceLocation,
    start: Double
  ): typings.babelTypes.ts36Mod.TSModuleDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], declare = null, global = null)
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSModuleDeclaration]
  }
  
  inline def TSNamespaceExportDeclaration(end: Double, id: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.TSNamespaceExportDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNamespaceExportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSNamespaceExportDeclaration]
  }
  
  inline def TSTypeAliasDeclaration(end: Double, id: Identifier_, loc: SourceLocation, start: Double, typeAnnotation: TSType): typings.babelTypes.ts36Mod.TSTypeAliasDeclaration = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], declare = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSTypeAliasDeclaration]
  }
  
  inline def ThrowStatement_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ThrowStatement_]
  }
  
  inline def TryStatement_(
    block: BlockStatement_,
    end: Double,
    finalizer: BlockStatement_,
    handler: CatchClause_,
    loc: SourceLocation,
    start: Double
  ): typings.babelTypes.ts36Mod.TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], finalizer = finalizer.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TryStatement_]
  }
  
  inline def TypeAlias_(
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    right: FlowTypeAnnotation,
    start: Double,
    typeParameters: TypeParameterDeclaration_
  ): typings.babelTypes.ts36Mod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TypeAlias_]
  }
  
  inline def VariableDeclaration_(
    declarations: js.Array[VariableDeclarator_],
    end: Double,
    kind: `var` | let | const,
    loc: SourceLocation,
    start: Double
  ): typings.babelTypes.ts36Mod.VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.VariableDeclaration_]
  }
  
  inline def WhileStatement_(body: Statement, end: Double, loc: SourceLocation, start: Double, test: Expression): typings.babelTypes.ts36Mod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.WhileStatement_]
  }
  
  inline def WithStatement_(
    body: BlockStatement_ | Statement,
    end: Double,
    loc: SourceLocation,
    `object`: Expression,
    start: Double
  ): typings.babelTypes.ts36Mod.WithStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.WithStatement_]
  }
}
