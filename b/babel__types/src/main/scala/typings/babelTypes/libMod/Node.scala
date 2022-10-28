package typings.babelTypes.libMod

import typings.babelTypes.anon.Cooked
import typings.babelTypes.babelTypesStrings.Ampersand
import typings.babelTypes.babelTypesStrings.AmpersandAmpersand
import typings.babelTypes.babelTypesStrings.Asterisk
import typings.babelTypes.babelTypesStrings.AsteriskAsterisk
import typings.babelTypes.babelTypesStrings.BlockStatement
import typings.babelTypes.babelTypesStrings.ClassBody
import typings.babelTypes.babelTypesStrings.EqualssignEqualssign
import typings.babelTypes.babelTypesStrings.EqualssignEqualssignEqualssign
import typings.babelTypes.babelTypesStrings.Exclamationmark
import typings.babelTypes.babelTypesStrings.ExclamationmarkEqualssign
import typings.babelTypes.babelTypesStrings.ExclamationmarkEqualssignEqualssign
import typings.babelTypes.babelTypesStrings.Greaterthansign
import typings.babelTypes.babelTypesStrings.GreaterthansignEqualssign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.babelTypes.babelTypesStrings.Identifier
import typings.babelTypes.babelTypesStrings.Lessthansign
import typings.babelTypes.babelTypesStrings.LessthansignEqualssign
import typings.babelTypes.babelTypesStrings.LessthansignLessthansign
import typings.babelTypes.babelTypesStrings.Percentsign
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.PlussignPlussign
import typings.babelTypes.babelTypesStrings.QuestionmarkQuestionmark
import typings.babelTypes.babelTypesStrings.Slash
import typings.babelTypes.babelTypesStrings.StringLiteral
import typings.babelTypes.babelTypesStrings.Tilde
import typings.babelTypes.babelTypesStrings.Verticalline
import typings.babelTypes.babelTypesStrings.VerticallineGreaterthansign
import typings.babelTypes.babelTypesStrings.VerticallineVerticalline
import typings.babelTypes.babelTypesStrings.`--`
import typings.babelTypes.babelTypesStrings.`-_`
import typings.babelTypes.babelTypesStrings.`throw`
import typings.babelTypes.babelTypesStrings.`using`
import typings.babelTypes.babelTypesStrings.`var`
import typings.babelTypes.babelTypesStrings.const
import typings.babelTypes.babelTypesStrings.constructor
import typings.babelTypes.babelTypesStrings.delete
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.in
import typings.babelTypes.babelTypesStrings.init
import typings.babelTypes.babelTypesStrings.instanceof
import typings.babelTypes.babelTypesStrings.let
import typings.babelTypes.babelTypesStrings.method_
import typings.babelTypes.babelTypesStrings.minus
import typings.babelTypes.babelTypesStrings.module
import typings.babelTypes.babelTypesStrings.plus
import typings.babelTypes.babelTypesStrings.script
import typings.babelTypes.babelTypesStrings.set
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.AnyTypeAnnotation_
  - typings.babelTypes.libMod.ArgumentPlaceholder_
  - typings.babelTypes.libMod.ArrayExpression_
  - typings.babelTypes.libMod.ArrayPattern_
  - typings.babelTypes.libMod.ArrayTypeAnnotation_
  - typings.babelTypes.libMod.ArrowFunctionExpression_
  - typings.babelTypes.libMod.AssignmentExpression_
  - typings.babelTypes.libMod.AssignmentPattern_
  - typings.babelTypes.libMod.AwaitExpression_
  - typings.babelTypes.libMod.BigIntLiteral_
  - typings.babelTypes.libMod.BinaryExpression_
  - typings.babelTypes.libMod.BindExpression_
  - typings.babelTypes.libMod.BlockStatement_
  - typings.babelTypes.libMod.BooleanLiteral_
  - typings.babelTypes.libMod.BooleanLiteralTypeAnnotation_
  - typings.babelTypes.libMod.BooleanTypeAnnotation_
  - typings.babelTypes.libMod.BreakStatement_
  - typings.babelTypes.libMod.CallExpression_
  - typings.babelTypes.libMod.CatchClause_
  - typings.babelTypes.libMod.ClassAccessorProperty_
  - typings.babelTypes.libMod.ClassBody_
  - typings.babelTypes.libMod.ClassDeclaration_
  - typings.babelTypes.libMod.ClassExpression_
  - typings.babelTypes.libMod.ClassImplements_
  - typings.babelTypes.libMod.ClassMethod_
  - typings.babelTypes.libMod.ClassPrivateMethod_
  - typings.babelTypes.libMod.ClassPrivateProperty_
  - typings.babelTypes.libMod.ClassProperty_
  - typings.babelTypes.libMod.ConditionalExpression_
  - typings.babelTypes.libMod.ContinueStatement_
  - typings.babelTypes.libMod.DebuggerStatement_
  - typings.babelTypes.libMod.DecimalLiteral_
  - typings.babelTypes.libMod.DeclareClass_
  - typings.babelTypes.libMod.DeclareExportAllDeclaration_
  - typings.babelTypes.libMod.DeclareExportDeclaration_
  - typings.babelTypes.libMod.DeclareFunction_
  - typings.babelTypes.libMod.DeclareInterface_
  - typings.babelTypes.libMod.DeclareModule_
  - typings.babelTypes.libMod.DeclareModuleExports_
  - typings.babelTypes.libMod.DeclareOpaqueType_
  - typings.babelTypes.libMod.DeclareTypeAlias_
  - typings.babelTypes.libMod.DeclareVariable_
  - typings.babelTypes.libMod.DeclaredPredicate_
  - typings.babelTypes.libMod.Decorator_
  - typings.babelTypes.libMod.Directive_
  - typings.babelTypes.libMod.DirectiveLiteral_
  - typings.babelTypes.libMod.DoExpression_
  - typings.babelTypes.libMod.DoWhileStatement_
  - typings.babelTypes.libMod.EmptyStatement_
  - typings.babelTypes.libMod.EmptyTypeAnnotation_
  - typings.babelTypes.libMod.EnumBooleanBody_
  - typings.babelTypes.libMod.EnumBooleanMember_
  - typings.babelTypes.libMod.EnumDeclaration_
  - typings.babelTypes.libMod.EnumDefaultedMember_
  - typings.babelTypes.libMod.EnumNumberBody_
  - typings.babelTypes.libMod.EnumNumberMember_
  - typings.babelTypes.libMod.EnumStringBody_
  - typings.babelTypes.libMod.EnumStringMember_
  - typings.babelTypes.libMod.EnumSymbolBody_
  - typings.babelTypes.libMod.ExistsTypeAnnotation_
  - typings.babelTypes.libMod.ExportAllDeclaration_
  - typings.babelTypes.libMod.ExportDefaultDeclaration_
  - typings.babelTypes.libMod.ExportDefaultSpecifier_
  - typings.babelTypes.libMod.ExportNamedDeclaration_
  - typings.babelTypes.libMod.ExportNamespaceSpecifier_
  - typings.babelTypes.libMod.ExportSpecifier_
  - typings.babelTypes.libMod.ExpressionStatement_
  - typings.babelTypes.libMod.File_
  - typings.babelTypes.libMod.ForInStatement_
  - typings.babelTypes.libMod.ForOfStatement_
  - typings.babelTypes.libMod.ForStatement_
  - typings.babelTypes.libMod.FunctionDeclaration_
  - typings.babelTypes.libMod.FunctionExpression_
  - typings.babelTypes.libMod.FunctionTypeAnnotation_
  - typings.babelTypes.libMod.FunctionTypeParam_
  - typings.babelTypes.libMod.GenericTypeAnnotation_
  - typings.babelTypes.libMod.Identifier_
  - typings.babelTypes.libMod.IfStatement_
  - typings.babelTypes.libMod.Import_
  - typings.babelTypes.libMod.ImportAttribute_
  - typings.babelTypes.libMod.ImportDeclaration_
  - typings.babelTypes.libMod.ImportDefaultSpecifier_
  - typings.babelTypes.libMod.ImportNamespaceSpecifier_
  - typings.babelTypes.libMod.ImportSpecifier_
  - typings.babelTypes.libMod.IndexedAccessType_
  - typings.babelTypes.libMod.InferredPredicate_
  - typings.babelTypes.libMod.InterfaceDeclaration_
  - typings.babelTypes.libMod.InterfaceExtends_
  - typings.babelTypes.libMod.InterfaceTypeAnnotation_
  - typings.babelTypes.libMod.InterpreterDirective_
  - typings.babelTypes.libMod.IntersectionTypeAnnotation_
  - typings.babelTypes.libMod.JSXAttribute__
  - typings.babelTypes.libMod.JSXClosingElement__
  - typings.babelTypes.libMod.JSXClosingFragment__
  - typings.babelTypes.libMod.JSXElement__
  - typings.babelTypes.libMod.JSXEmptyExpression__
  - typings.babelTypes.libMod.JSXExpressionContainer__
  - typings.babelTypes.libMod.JSXFragment__
  - typings.babelTypes.libMod.JSXIdentifier__
  - typings.babelTypes.libMod.JSXMemberExpression__
  - typings.babelTypes.libMod.JSXNamespacedName__
  - typings.babelTypes.libMod.JSXOpeningElement__
  - typings.babelTypes.libMod.JSXOpeningFragment__
  - typings.babelTypes.libMod.JSXSpreadAttribute__
  - typings.babelTypes.libMod.JSXSpreadChild__
  - typings.babelTypes.libMod.JSXText__
  - typings.babelTypes.libMod.LabeledStatement_
  - typings.babelTypes.libMod.LogicalExpression_
  - typings.babelTypes.libMod.MemberExpression_
  - typings.babelTypes.libMod.MetaProperty_
  - typings.babelTypes.libMod.MixedTypeAnnotation_
  - typings.babelTypes.libMod.ModuleExpression_
  - typings.babelTypes.libMod.NewExpression_
  - typings.babelTypes.libMod.Noop_
  - typings.babelTypes.libMod.NullLiteral_
  - typings.babelTypes.libMod.NullLiteralTypeAnnotation_
  - typings.babelTypes.libMod.NullableTypeAnnotation_
  - typings.babelTypes.libMod.NumberLiteral1
  - typings.babelTypes.libMod.NumberLiteralTypeAnnotation_
  - typings.babelTypes.libMod.NumberTypeAnnotation_
  - typings.babelTypes.libMod.NumericLiteral_
  - typings.babelTypes.libMod.ObjectExpression_
  - typings.babelTypes.libMod.ObjectMethod_
  - typings.babelTypes.libMod.ObjectPattern_
  - typings.babelTypes.libMod.ObjectProperty_
  - typings.babelTypes.libMod.ObjectTypeAnnotation_
  - typings.babelTypes.libMod.ObjectTypeCallProperty_
  - typings.babelTypes.libMod.ObjectTypeIndexer_
  - typings.babelTypes.libMod.ObjectTypeInternalSlot_
  - typings.babelTypes.libMod.ObjectTypeProperty_
  - typings.babelTypes.libMod.ObjectTypeSpreadProperty_
  - typings.babelTypes.libMod.OpaqueType_
  - typings.babelTypes.libMod.OptionalCallExpression_
  - typings.babelTypes.libMod.OptionalIndexedAccessType_
  - typings.babelTypes.libMod.OptionalMemberExpression_
  - typings.babelTypes.libMod.ParenthesizedExpression_
  - typings.babelTypes.libMod.PipelineBareFunction_
  - typings.babelTypes.libMod.PipelinePrimaryTopicReference_
  - typings.babelTypes.libMod.PipelineTopicExpression_
  - typings.babelTypes.libMod.Placeholder_
  - typings.babelTypes.libMod.PrivateName_
  - typings.babelTypes.libMod.Program_
  - typings.babelTypes.libMod.QualifiedTypeIdentifier_
  - typings.babelTypes.libMod.RecordExpression_
  - typings.babelTypes.libMod.RegExpLiteral_
  - typings.babelTypes.libMod.RegexLiteral1
  - typings.babelTypes.libMod.RestElement_
  - typings.babelTypes.libMod.RestProperty1
  - typings.babelTypes.libMod.ReturnStatement_
  - typings.babelTypes.libMod.SequenceExpression_
  - typings.babelTypes.libMod.SpreadElement_
  - typings.babelTypes.libMod.SpreadProperty1
  - typings.babelTypes.libMod.StaticBlock_
  - typings.babelTypes.libMod.StringLiteral_
  - typings.babelTypes.libMod.StringLiteralTypeAnnotation_
  - typings.babelTypes.libMod.StringTypeAnnotation_
  - typings.babelTypes.libMod.Super_
  - typings.babelTypes.libMod.SwitchCase_
  - typings.babelTypes.libMod.SwitchStatement_
  - typings.babelTypes.libMod.SymbolTypeAnnotation_
  - typings.babelTypes.libMod.TSAnyKeyword__
  - typings.babelTypes.libMod.TSArrayType__
  - typings.babelTypes.libMod.TSAsExpression__
  - typings.babelTypes.libMod.TSBigIntKeyword__
  - typings.babelTypes.libMod.TSBooleanKeyword__
  - typings.babelTypes.libMod.TSCallSignatureDeclaration__
  - typings.babelTypes.libMod.TSConditionalType__
  - typings.babelTypes.libMod.TSConstructSignatureDeclaration__
  - typings.babelTypes.libMod.TSConstructorType__
  - typings.babelTypes.libMod.TSDeclareFunction__
  - typings.babelTypes.libMod.TSDeclareMethod__
  - typings.babelTypes.libMod.TSEnumDeclaration__
  - typings.babelTypes.libMod.TSEnumMember__
  - typings.babelTypes.libMod.TSExportAssignment__
  - typings.babelTypes.libMod.TSExpressionWithTypeArguments__
  - typings.babelTypes.libMod.TSExternalModuleReference__
  - typings.babelTypes.libMod.TSFunctionType__
  - typings.babelTypes.libMod.TSImportEqualsDeclaration__
  - typings.babelTypes.libMod.TSImportType__
  - typings.babelTypes.libMod.TSIndexSignature__
  - typings.babelTypes.libMod.TSIndexedAccessType__
  - typings.babelTypes.libMod.TSInferType__
  - typings.babelTypes.libMod.TSInstantiationExpression__
  - typings.babelTypes.libMod.TSInterfaceBody__
  - typings.babelTypes.libMod.TSInterfaceDeclaration__
  - typings.babelTypes.libMod.TSIntersectionType__
  - typings.babelTypes.libMod.TSIntrinsicKeyword__
  - typings.babelTypes.libMod.TSLiteralType__
  - typings.babelTypes.libMod.TSMappedType__
  - typings.babelTypes.libMod.TSMethodSignature__
  - typings.babelTypes.libMod.TSModuleBlock__
  - typings.babelTypes.libMod.TSModuleDeclaration__
  - typings.babelTypes.libMod.TSNamedTupleMember__
  - typings.babelTypes.libMod.TSNamespaceExportDeclaration__
  - typings.babelTypes.libMod.TSNeverKeyword__
  - typings.babelTypes.libMod.TSNonNullExpression__
  - typings.babelTypes.libMod.TSNullKeyword__
  - typings.babelTypes.libMod.TSNumberKeyword__
  - typings.babelTypes.libMod.TSObjectKeyword__
  - typings.babelTypes.libMod.TSOptionalType__
  - typings.babelTypes.libMod.TSParameterProperty__
  - typings.babelTypes.libMod.TSParenthesizedType__
  - typings.babelTypes.libMod.TSPropertySignature__
  - typings.babelTypes.libMod.TSQualifiedName__
  - typings.babelTypes.libMod.TSRestType__
  - typings.babelTypes.libMod.TSSatisfiesExpression__
  - typings.babelTypes.libMod.TSStringKeyword__
  - typings.babelTypes.libMod.TSSymbolKeyword__
  - typings.babelTypes.libMod.TSThisType__
  - typings.babelTypes.libMod.TSTupleType__
  - typings.babelTypes.libMod.TSTypeAliasDeclaration__
  - typings.babelTypes.libMod.TSTypeAnnotation__
  - typings.babelTypes.libMod.TSTypeAssertion__
  - typings.babelTypes.libMod.TSTypeLiteral__
  - typings.babelTypes.libMod.TSTypeOperator__
  - typings.babelTypes.libMod.TSTypeParameter__
  - typings.babelTypes.libMod.TSTypeParameterDeclaration__
  - typings.babelTypes.libMod.TSTypeParameterInstantiation__
  - typings.babelTypes.libMod.TSTypePredicate__
  - typings.babelTypes.libMod.TSTypeQuery__
  - typings.babelTypes.libMod.TSTypeReference__
  - typings.babelTypes.libMod.TSUndefinedKeyword__
  - typings.babelTypes.libMod.TSUnionType__
  - typings.babelTypes.libMod.TSUnknownKeyword__
  - typings.babelTypes.libMod.TSVoidKeyword__
  - typings.babelTypes.libMod.TaggedTemplateExpression_
  - typings.babelTypes.libMod.TemplateElement_
  - typings.babelTypes.libMod.TemplateLiteral_
  - typings.babelTypes.libMod.ThisExpression_
  - typings.babelTypes.libMod.ThisTypeAnnotation_
  - typings.babelTypes.libMod.ThrowStatement_
  - typings.babelTypes.libMod.TopicReference_
  - typings.babelTypes.libMod.TryStatement_
  - typings.babelTypes.libMod.TupleExpression_
  - typings.babelTypes.libMod.TupleTypeAnnotation_
  - typings.babelTypes.libMod.TypeAlias_
  - typings.babelTypes.libMod.TypeAnnotation_
  - typings.babelTypes.libMod.TypeCastExpression_
  - typings.babelTypes.libMod.TypeParameter_
  - typings.babelTypes.libMod.TypeParameterDeclaration_
  - typings.babelTypes.libMod.TypeParameterInstantiation_
  - typings.babelTypes.libMod.TypeofTypeAnnotation_
  - typings.babelTypes.libMod.UnaryExpression_
  - typings.babelTypes.libMod.UnionTypeAnnotation_
  - typings.babelTypes.libMod.UpdateExpression_
  - typings.babelTypes.libMod.V8IntrinsicIdentifier_
  - typings.babelTypes.libMod.VariableDeclaration_
  - typings.babelTypes.libMod.VariableDeclarator_
  - typings.babelTypes.libMod.Variance_
  - typings.babelTypes.libMod.VoidTypeAnnotation_
  - typings.babelTypes.libMod.WhileStatement_
  - typings.babelTypes.libMod.WithStatement_
  - typings.babelTypes.libMod.YieldExpression_
*/
trait Node extends StObject
object Node {
  
  inline def AnyTypeAnnotation_(): typings.babelTypes.libMod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.AnyTypeAnnotation_]
  }
  
  inline def ArgumentPlaceholder_(): typings.babelTypes.libMod.ArgumentPlaceholder_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArgumentPlaceholder")
    __obj.asInstanceOf[typings.babelTypes.libMod.ArgumentPlaceholder_]
  }
  
  inline def ArrayExpression_(elements: js.Array[Null | Expression | SpreadElement_]): typings.babelTypes.libMod.ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ArrayExpression_]
  }
  
  inline def ArrayPattern_(elements: js.Array[Null | PatternLike | LVal]): typings.babelTypes.libMod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.babelTypes.libMod.ArrayPattern_]
  }
  
  inline def ArrayTypeAnnotation_(elementType: FlowType): typings.babelTypes.libMod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.ArrayTypeAnnotation_]
  }
  
  inline def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typings.babelTypes.libMod.ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ArrowFunctionExpression_]
  }
  
  inline def AssignmentExpression_(left: LVal, operator: String, right: Expression): typings.babelTypes.libMod.AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.AssignmentExpression_]
  }
  
  inline def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression__ | TSSatisfiesExpression__ | TSTypeAssertion__ | TSNonNullExpression__,
    right: Expression
  ): typings.babelTypes.libMod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.babelTypes.libMod.AssignmentPattern_]
  }
  
  inline def AwaitExpression_(argument: Expression): typings.babelTypes.libMod.AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.AwaitExpression_]
  }
  
  inline def BigIntLiteral_(value: String): typings.babelTypes.libMod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.BigIntLiteral_]
  }
  
  inline def BinaryExpression_(
    left: Expression | PrivateName_,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typings.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign | VerticallineGreaterthansign,
    right: Expression
  ): typings.babelTypes.libMod.BinaryExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.BinaryExpression_]
  }
  
  inline def BindExpression_(callee: Expression, `object`: Expression): typings.babelTypes.libMod.BindExpression_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BindExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.BindExpression_]
  }
  
  inline def BlockStatement_(body: js.Array[Statement], directives: js.Array[Directive_]): typings.babelTypes.libMod.BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.BlockStatement_]
  }
  
  inline def BooleanLiteralTypeAnnotation_(value: Boolean): typings.babelTypes.libMod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.BooleanLiteralTypeAnnotation_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typings.babelTypes.libMod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.BooleanLiteral_]
  }
  
  inline def BooleanTypeAnnotation_(): typings.babelTypes.libMod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.BooleanTypeAnnotation_]
  }
  
  inline def BreakStatement_(): typings.babelTypes.libMod.BreakStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.BreakStatement_]
  }
  
  inline def CallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName__ | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): typings.babelTypes.libMod.CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.CallExpression_]
  }
  
  inline def CatchClause_(body: BlockStatement_): typings.babelTypes.libMod.CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[typings.babelTypes.libMod.CatchClause_]
  }
  
  inline def ClassAccessorProperty_(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression | PrivateName_,
    static: Boolean
  ): typings.babelTypes.libMod.ClassAccessorProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassAccessorProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassAccessorProperty_]
  }
  
  inline def ClassBody_(
    body: js.Array[
      ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | ClassAccessorProperty_ | TSDeclareMethod__ | TSIndexSignature__ | StaticBlock_
    ]
  ): typings.babelTypes.libMod.ClassBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassBody_]
  }
  
  inline def ClassDeclaration_(body: ClassBody_, id: Identifier_): typings.babelTypes.libMod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassDeclaration_]
  }
  
  inline def ClassExpression_(body: ClassBody_): typings.babelTypes.libMod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassExpression_]
  }
  
  inline def ClassImplements_(id: Identifier_): typings.babelTypes.libMod.ClassImplements_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassImplements")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassImplements_]
  }
  
  inline def ClassMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    kind: get | set | method_ | constructor,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty__],
    static: Boolean
  ): typings.babelTypes.libMod.ClassMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassMethod")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassMethod_]
  }
  
  inline def ClassPrivateMethod_(
    body: BlockStatement_,
    key: PrivateName_,
    kind: get | set | method_,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty__],
    static: Boolean
  ): typings.babelTypes.libMod.ClassPrivateMethod_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateMethod")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassPrivateMethod_]
  }
  
  inline def ClassPrivateProperty_(key: PrivateName_, static: Boolean): typings.babelTypes.libMod.ClassPrivateProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassPrivateProperty_]
  }
  
  inline def ClassProperty_(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    static: Boolean
  ): typings.babelTypes.libMod.ClassProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassProperty_]
  }
  
  inline def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression): typings.babelTypes.libMod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ConditionalExpression_]
  }
  
  inline def ContinueStatement_(): typings.babelTypes.libMod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.ContinueStatement_]
  }
  
  inline def DebuggerStatement_(): typings.babelTypes.libMod.DebuggerStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.DebuggerStatement_]
  }
  
  inline def DecimalLiteral_(value: String): typings.babelTypes.libMod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.DecimalLiteral_]
  }
  
  inline def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.libMod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareClass")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareClass_]
  }
  
  inline def DeclareExportAllDeclaration_(source: StringLiteral_): typings.babelTypes.libMod.DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareExportAllDeclaration_]
  }
  
  inline def DeclareExportDeclaration_(): typings.babelTypes.libMod.DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareExportDeclaration_]
  }
  
  inline def DeclareFunction_(id: Identifier_): typings.babelTypes.libMod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareFunction_]
  }
  
  inline def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.libMod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareInterface_]
  }
  
  inline def DeclareModuleExports_(typeAnnotation: TypeAnnotation_): typings.babelTypes.libMod.DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareModuleExports_]
  }
  
  inline def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_): typings.babelTypes.libMod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareModule_]
  }
  
  inline def DeclareOpaqueType_(id: Identifier_): typings.babelTypes.libMod.DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareOpaqueType_]
  }
  
  inline def DeclareTypeAlias_(id: Identifier_, right: FlowType): typings.babelTypes.libMod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareTypeAlias_]
  }
  
  inline def DeclareVariable_(id: Identifier_): typings.babelTypes.libMod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclareVariable_]
  }
  
  inline def DeclaredPredicate_(value: Flow): typings.babelTypes.libMod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclaredPredicate")
    __obj.asInstanceOf[typings.babelTypes.libMod.DeclaredPredicate_]
  }
  
  inline def Decorator_(expression: Expression): typings.babelTypes.libMod.Decorator_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Decorator")
    __obj.asInstanceOf[typings.babelTypes.libMod.Decorator_]
  }
  
  inline def DirectiveLiteral_(value: String): typings.babelTypes.libMod.DirectiveLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DirectiveLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.DirectiveLiteral_]
  }
  
  inline def Directive_(value: DirectiveLiteral_): typings.babelTypes.libMod.Directive_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Directive")
    __obj.asInstanceOf[typings.babelTypes.libMod.Directive_]
  }
  
  inline def DoExpression_(async: Boolean, body: BlockStatement_): typings.babelTypes.libMod.DoExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.DoExpression_]
  }
  
  inline def DoWhileStatement_(body: Statement, test: Expression): typings.babelTypes.libMod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.DoWhileStatement_]
  }
  
  inline def EmptyStatement_(): typings.babelTypes.libMod.EmptyStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.EmptyStatement_]
  }
  
  inline def EmptyTypeAnnotation_(): typings.babelTypes.libMod.EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.EmptyTypeAnnotation_]
  }
  
  inline def EnumBooleanBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumBooleanMember_]): typings.babelTypes.libMod.EnumBooleanBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumBooleanBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumBooleanBody_]
  }
  
  inline def EnumBooleanMember_(id: Identifier_, init: BooleanLiteral_): typings.babelTypes.libMod.EnumBooleanMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumBooleanMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumBooleanMember_]
  }
  
  inline def EnumDeclaration_(body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_, id: Identifier_): typings.babelTypes.libMod.EnumDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumDeclaration_]
  }
  
  inline def EnumDefaultedMember_(id: Identifier_): typings.babelTypes.libMod.EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumDefaultedMember_]
  }
  
  inline def EnumNumberBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumNumberMember_]): typings.babelTypes.libMod.EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumNumberBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumNumberBody_]
  }
  
  inline def EnumNumberMember_(id: Identifier_, init: NumericLiteral_): typings.babelTypes.libMod.EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumNumberMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumNumberMember_]
  }
  
  inline def EnumStringBody_(
    explicitType: Boolean,
    hasUnknownMembers: Boolean,
    members: js.Array[EnumStringMember_ | EnumDefaultedMember_]
  ): typings.babelTypes.libMod.EnumStringBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumStringBody_]
  }
  
  inline def EnumStringMember_(id: Identifier_, init: StringLiteral_): typings.babelTypes.libMod.EnumStringMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumStringMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumStringMember_]
  }
  
  inline def EnumSymbolBody_(hasUnknownMembers: Boolean, members: js.Array[EnumDefaultedMember_]): typings.babelTypes.libMod.EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.EnumSymbolBody_]
  }
  
  inline def ExistsTypeAnnotation_(): typings.babelTypes.libMod.ExistsTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExistsTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.ExistsTypeAnnotation_]
  }
  
  inline def ExportAllDeclaration_(source: StringLiteral_): typings.babelTypes.libMod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.ExportAllDeclaration_]
  }
  
  inline def ExportDefaultDeclaration_(declaration: TSDeclareFunction__ | FunctionDeclaration_ | ClassDeclaration_ | Expression): typings.babelTypes.libMod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.ExportDefaultDeclaration_]
  }
  
  inline def ExportDefaultSpecifier_(exported: Identifier_): typings.babelTypes.libMod.ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.ExportDefaultSpecifier_]
  }
  
  inline def ExportNamedDeclaration_(specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): typings.babelTypes.libMod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.ExportNamedDeclaration_]
  }
  
  inline def ExportNamespaceSpecifier_(exported: Identifier_): typings.babelTypes.libMod.ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.ExportNamespaceSpecifier_]
  }
  
  inline def ExportSpecifier_(exported: Identifier_ | StringLiteral_, local: Identifier_): typings.babelTypes.libMod.ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.ExportSpecifier_]
  }
  
  inline def ExpressionStatement_(expression: Expression): typings.babelTypes.libMod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.ExpressionStatement_]
  }
  
  inline def File_(program: Program_): typings.babelTypes.libMod.File_ = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("File")
    __obj.asInstanceOf[typings.babelTypes.libMod.File_]
  }
  
  inline def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.libMod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.ForInStatement_]
  }
  
  inline def ForOfStatement_(await: Boolean, body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.libMod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.ForOfStatement_]
  }
  
  inline def ForStatement_(body: Statement): typings.babelTypes.libMod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.ForStatement_]
  }
  
  inline def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typings.babelTypes.libMod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.FunctionDeclaration_]
  }
  
  inline def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typings.babelTypes.libMod.FunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.FunctionExpression_]
  }
  
  inline def FunctionTypeAnnotation_(params: js.Array[FunctionTypeParam_], returnType: FlowType): typings.babelTypes.libMod.FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.FunctionTypeAnnotation_]
  }
  
  inline def FunctionTypeParam_(typeAnnotation: FlowType): typings.babelTypes.libMod.FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[typings.babelTypes.libMod.FunctionTypeParam_]
  }
  
  inline def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_): typings.babelTypes.libMod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.GenericTypeAnnotation_]
  }
  
  inline def Identifier_(name: String): typings.babelTypes.libMod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.Identifier_]
  }
  
  inline def IfStatement_(consequent: Statement, test: Expression): typings.babelTypes.libMod.IfStatement_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.IfStatement_]
  }
  
  inline def ImportAttribute_(key: Identifier_ | StringLiteral_, value: StringLiteral_): typings.babelTypes.libMod.ImportAttribute_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportAttribute")
    __obj.asInstanceOf[typings.babelTypes.libMod.ImportAttribute_]
  }
  
  inline def ImportDeclaration_(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]
  ): typings.babelTypes.libMod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.ImportDeclaration_]
  }
  
  inline def ImportDefaultSpecifier_(local: Identifier_): typings.babelTypes.libMod.ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.ImportDefaultSpecifier_]
  }
  
  inline def ImportNamespaceSpecifier_(local: Identifier_): typings.babelTypes.libMod.ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.ImportNamespaceSpecifier_]
  }
  
  inline def ImportSpecifier_(imported: Identifier_ | StringLiteral_, local: Identifier_): typings.babelTypes.libMod.ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.ImportSpecifier_]
  }
  
  inline def Import_(): typings.babelTypes.libMod.Import_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[typings.babelTypes.libMod.Import_]
  }
  
  inline def IndexedAccessType_(indexType: FlowType, objectType: FlowType): typings.babelTypes.libMod.IndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.libMod.IndexedAccessType_]
  }
  
  inline def InferredPredicate_(): typings.babelTypes.libMod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[typings.babelTypes.libMod.InferredPredicate_]
  }
  
  inline def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.libMod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.InterfaceDeclaration_]
  }
  
  inline def InterfaceExtends_(id: Identifier_ | QualifiedTypeIdentifier_): typings.babelTypes.libMod.InterfaceExtends_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceExtends")
    __obj.asInstanceOf[typings.babelTypes.libMod.InterfaceExtends_]
  }
  
  inline def InterfaceTypeAnnotation_(body: ObjectTypeAnnotation_): typings.babelTypes.libMod.InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.InterfaceTypeAnnotation_]
  }
  
  inline def InterpreterDirective_(value: String): typings.babelTypes.libMod.InterpreterDirective_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InterpreterDirective")
    __obj.asInstanceOf[typings.babelTypes.libMod.InterpreterDirective_]
  }
  
  inline def IntersectionTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.libMod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.IntersectionTypeAnnotation_]
  }
  
  inline def JSXAttribute__(name: JSXIdentifier__ | JSXNamespacedName__): typings.babelTypes.libMod.JSXAttribute__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXAttribute__]
  }
  
  inline def JSXClosingElement__(name: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__): typings.babelTypes.libMod.JSXClosingElement__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXClosingElement__]
  }
  
  inline def JSXClosingFragment__(): typings.babelTypes.libMod.JSXClosingFragment__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXClosingFragment__]
  }
  
  inline def JSXElement__(
    children: js.Array[
      JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | typings.babelTypes.libMod.JSXElement__ | JSXFragment__
    ],
    openingElement: JSXOpeningElement__
  ): typings.babelTypes.libMod.JSXElement__ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXElement__]
  }
  
  inline def JSXEmptyExpression__(): typings.babelTypes.libMod.JSXEmptyExpression__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXEmptyExpression__]
  }
  
  inline def JSXExpressionContainer__(expression: Expression | JSXEmptyExpression__): typings.babelTypes.libMod.JSXExpressionContainer__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXExpressionContainer__]
  }
  
  inline def JSXFragment__(
    children: js.Array[
      JSXText__ | JSXExpressionContainer__ | JSXSpreadChild__ | JSXElement__ | typings.babelTypes.libMod.JSXFragment__
    ],
    closingFragment: JSXClosingFragment__,
    openingFragment: JSXOpeningFragment__
  ): typings.babelTypes.libMod.JSXFragment__ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXFragment__]
  }
  
  inline def JSXIdentifier__(name: String): typings.babelTypes.libMod.JSXIdentifier__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXIdentifier__]
  }
  
  inline def JSXMemberExpression__(
    `object`: typings.babelTypes.libMod.JSXMemberExpression__ | JSXIdentifier__,
    property: JSXIdentifier__
  ): typings.babelTypes.libMod.JSXMemberExpression__ = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXMemberExpression__]
  }
  
  inline def JSXNamespacedName__(name: JSXIdentifier__, namespace: JSXIdentifier__): typings.babelTypes.libMod.JSXNamespacedName__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXNamespacedName__]
  }
  
  inline def JSXOpeningElement__(
    attributes: js.Array[JSXAttribute__ | JSXSpreadAttribute__],
    name: JSXIdentifier__ | JSXMemberExpression__ | JSXNamespacedName__,
    selfClosing: Boolean
  ): typings.babelTypes.libMod.JSXOpeningElement__ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXOpeningElement__]
  }
  
  inline def JSXOpeningFragment__(): typings.babelTypes.libMod.JSXOpeningFragment__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXOpeningFragment__]
  }
  
  inline def JSXSpreadAttribute__(argument: Expression): typings.babelTypes.libMod.JSXSpreadAttribute__ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXSpreadAttribute__]
  }
  
  inline def JSXSpreadChild__(expression: Expression): typings.babelTypes.libMod.JSXSpreadChild__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXSpreadChild__]
  }
  
  inline def JSXText__(value: String): typings.babelTypes.libMod.JSXText__ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXText__]
  }
  
  inline def LabeledStatement_(body: Statement, label: Identifier_): typings.babelTypes.libMod.LabeledStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.LabeledStatement_]
  }
  
  inline def LogicalExpression_(
    left: Expression,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: Expression
  ): typings.babelTypes.libMod.LogicalExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.LogicalExpression_]
  }
  
  inline def MemberExpression_(
    computed: Boolean,
    `object`: Expression | Super_,
    property: Expression | Identifier_ | PrivateName_
  ): typings.babelTypes.libMod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.MemberExpression_]
  }
  
  inline def MetaProperty_(meta: Identifier_, property: Identifier_): typings.babelTypes.libMod.MetaProperty_ = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.MetaProperty_]
  }
  
  inline def MixedTypeAnnotation_(): typings.babelTypes.libMod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.MixedTypeAnnotation_]
  }
  
  inline def ModuleExpression_(body: Program_): typings.babelTypes.libMod.ModuleExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ModuleExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ModuleExpression_]
  }
  
  inline def NewExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName__ | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): typings.babelTypes.libMod.NewExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.NewExpression_]
  }
  
  inline def Noop_(): typings.babelTypes.libMod.Noop_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Noop")
    __obj.asInstanceOf[typings.babelTypes.libMod.Noop_]
  }
  
  inline def NullLiteralTypeAnnotation_(): typings.babelTypes.libMod.NullLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.NullLiteralTypeAnnotation_]
  }
  
  inline def NullLiteral_(): typings.babelTypes.libMod.NullLiteral_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.NullLiteral_]
  }
  
  inline def NullableTypeAnnotation_(typeAnnotation: FlowType): typings.babelTypes.libMod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.NullableTypeAnnotation_]
  }
  
  inline def NumberLiteral1(value: Double): typings.babelTypes.libMod.NumberLiteral1 = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.NumberLiteral1]
  }
  
  inline def NumberLiteralTypeAnnotation_(value: Double): typings.babelTypes.libMod.NumberLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.NumberLiteralTypeAnnotation_]
  }
  
  inline def NumberTypeAnnotation_(): typings.babelTypes.libMod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.NumberTypeAnnotation_]
  }
  
  inline def NumericLiteral_(value: Double): typings.babelTypes.libMod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.NumericLiteral_]
  }
  
  inline def ObjectExpression_(properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]): typings.babelTypes.libMod.ObjectExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectExpression_]
  }
  
  inline def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_,
    kind: method_ | get | set,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typings.babelTypes.libMod.ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectMethod_]
  }
  
  inline def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_]): typings.babelTypes.libMod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectPattern_]
  }
  
  inline def ObjectProperty_(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | DecimalLiteral_ | PrivateName_,
    shorthand: Boolean,
    value: Expression | PatternLike
  ): typings.babelTypes.libMod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectProperty_]
  }
  
  inline def ObjectTypeAnnotation_(exact: Boolean, properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]): typings.babelTypes.libMod.ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(exact = exact.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeAnnotation_]
  }
  
  inline def ObjectTypeCallProperty_(static: Boolean, value: FlowType): typings.babelTypes.libMod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeCallProperty_]
  }
  
  inline def ObjectTypeIndexer_(key: FlowType, static: Boolean, value: FlowType): typings.babelTypes.libMod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeIndexer_]
  }
  
  inline def ObjectTypeInternalSlot_(id: Identifier_, method: Boolean, optional: Boolean, static: Boolean, value: FlowType): typings.babelTypes.libMod.ObjectTypeInternalSlot_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeInternalSlot")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeInternalSlot_]
  }
  
  inline def ObjectTypeProperty_(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    method: Boolean,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    value: FlowType
  ): typings.babelTypes.libMod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeProperty_]
  }
  
  inline def ObjectTypeSpreadProperty_(argument: FlowType): typings.babelTypes.libMod.ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectTypeSpreadProperty_]
  }
  
  inline def OpaqueType_(id: Identifier_, impltype: FlowType): typings.babelTypes.libMod.OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[typings.babelTypes.libMod.OpaqueType_]
  }
  
  inline def OptionalCallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName__ | ArgumentPlaceholder_],
    callee: Expression,
    optional: Boolean
  ): typings.babelTypes.libMod.OptionalCallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.OptionalCallExpression_]
  }
  
  inline def OptionalIndexedAccessType_(indexType: FlowType, objectType: FlowType, optional: Boolean): typings.babelTypes.libMod.OptionalIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalIndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.libMod.OptionalIndexedAccessType_]
  }
  
  inline def OptionalMemberExpression_(computed: Boolean, `object`: Expression, optional: Boolean, property: Expression | Identifier_): typings.babelTypes.libMod.OptionalMemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalMemberExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.OptionalMemberExpression_]
  }
  
  inline def ParenthesizedExpression_(expression: Expression): typings.babelTypes.libMod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ParenthesizedExpression_]
  }
  
  inline def PipelineBareFunction_(callee: Expression): typings.babelTypes.libMod.PipelineBareFunction_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PipelineBareFunction")
    __obj.asInstanceOf[typings.babelTypes.libMod.PipelineBareFunction_]
  }
  
  inline def PipelinePrimaryTopicReference_(): typings.babelTypes.libMod.PipelinePrimaryTopicReference_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PipelinePrimaryTopicReference")
    __obj.asInstanceOf[typings.babelTypes.libMod.PipelinePrimaryTopicReference_]
  }
  
  inline def PipelineTopicExpression_(expression: Expression): typings.babelTypes.libMod.PipelineTopicExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PipelineTopicExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.PipelineTopicExpression_]
  }
  
  inline def Placeholder_(
    expectedNode: Identifier | StringLiteral | typings.babelTypes.babelTypesStrings.Expression | typings.babelTypes.babelTypesStrings.Statement | typings.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typings.babelTypes.babelTypesStrings.Pattern,
    name: Identifier_
  ): typings.babelTypes.libMod.Placeholder_ = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Placeholder")
    __obj.asInstanceOf[typings.babelTypes.libMod.Placeholder_]
  }
  
  inline def PrivateName_(id: Identifier_): typings.babelTypes.libMod.PrivateName_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[typings.babelTypes.libMod.PrivateName_]
  }
  
  inline def Program_(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceFile: String,
    sourceType: script | module
  ): typings.babelTypes.libMod.Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[typings.babelTypes.libMod.Program_]
  }
  
  inline def QualifiedTypeIdentifier_(id: Identifier_, qualification: Identifier_ | typings.babelTypes.libMod.QualifiedTypeIdentifier_): typings.babelTypes.libMod.QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("QualifiedTypeIdentifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.QualifiedTypeIdentifier_]
  }
  
  inline def RecordExpression_(properties: js.Array[ObjectProperty_ | SpreadElement_]): typings.babelTypes.libMod.RecordExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RecordExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.RecordExpression_]
  }
  
  inline def RegExpLiteral_(flags: String, pattern: String): typings.babelTypes.libMod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.RegExpLiteral_]
  }
  
  inline def RegexLiteral1(flags: String, pattern: String): typings.babelTypes.libMod.RegexLiteral1 = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegexLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.RegexLiteral1]
  }
  
  inline def RestElement_(argument: LVal): typings.babelTypes.libMod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.RestElement_]
  }
  
  inline def RestProperty1(argument: LVal): typings.babelTypes.libMod.RestProperty1 = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.RestProperty1]
  }
  
  inline def ReturnStatement_(): typings.babelTypes.libMod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.ReturnStatement_]
  }
  
  inline def SequenceExpression_(expressions: js.Array[Expression]): typings.babelTypes.libMod.SequenceExpression_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.SequenceExpression_]
  }
  
  inline def SpreadElement_(argument: Expression): typings.babelTypes.libMod.SpreadElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.SpreadElement_]
  }
  
  inline def SpreadProperty1(argument: Expression): typings.babelTypes.libMod.SpreadProperty1 = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.SpreadProperty1]
  }
  
  inline def StaticBlock_(body: js.Array[Statement]): typings.babelTypes.libMod.StaticBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[typings.babelTypes.libMod.StaticBlock_]
  }
  
  inline def StringLiteralTypeAnnotation_(value: String): typings.babelTypes.libMod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.StringLiteralTypeAnnotation_]
  }
  
  inline def StringLiteral_(value: String): typings.babelTypes.libMod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.StringLiteral_]
  }
  
  inline def StringTypeAnnotation_(): typings.babelTypes.libMod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.StringTypeAnnotation_]
  }
  
  inline def Super_(): typings.babelTypes.libMod.Super_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[typings.babelTypes.libMod.Super_]
  }
  
  inline def SwitchCase_(consequent: js.Array[Statement]): typings.babelTypes.libMod.SwitchCase_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchCase")
    __obj.asInstanceOf[typings.babelTypes.libMod.SwitchCase_]
  }
  
  inline def SwitchStatement_(cases: js.Array[SwitchCase_], discriminant: Expression): typings.babelTypes.libMod.SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.SwitchStatement_]
  }
  
  inline def SymbolTypeAnnotation_(): typings.babelTypes.libMod.SymbolTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("SymbolTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.SymbolTypeAnnotation_]
  }
  
  inline def TSAnyKeyword__(): typings.babelTypes.libMod.TSAnyKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSAnyKeyword__]
  }
  
  inline def TSArrayType__(elementType: TSType): typings.babelTypes.libMod.TSArrayType__ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSArrayType__]
  }
  
  inline def TSAsExpression__(expression: Expression, typeAnnotation: TSType): typings.babelTypes.libMod.TSAsExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSAsExpression__]
  }
  
  inline def TSBigIntKeyword__(): typings.babelTypes.libMod.TSBigIntKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSBigIntKeyword__]
  }
  
  inline def TSBooleanKeyword__(): typings.babelTypes.libMod.TSBooleanKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSBooleanKeyword__]
  }
  
  inline def TSCallSignatureDeclaration__(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSCallSignatureDeclaration__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSCallSignatureDeclaration__]
  }
  
  inline def TSConditionalType__(checkType: TSType, extendsType: TSType, falseType: TSType, trueType: TSType): typings.babelTypes.libMod.TSConditionalType__ = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConditionalType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConditionalType__]
  }
  
  inline def TSConstructSignatureDeclaration__(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSConstructSignatureDeclaration__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConstructSignatureDeclaration__]
  }
  
  inline def TSConstructorType__(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSConstructorType__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSConstructorType__]
  }
  
  inline def TSDeclareFunction__(params: js.Array[Identifier_ | Pattern | RestElement_]): typings.babelTypes.libMod.TSDeclareFunction__ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSDeclareFunction__]
  }
  
  inline def TSDeclareMethod__(
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty__]
  ): typings.babelTypes.libMod.TSDeclareMethod__ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSDeclareMethod")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSDeclareMethod__]
  }
  
  inline def TSEnumDeclaration__(id: Identifier_, members: js.Array[TSEnumMember__]): typings.babelTypes.libMod.TSEnumDeclaration__ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSEnumDeclaration__]
  }
  
  inline def TSEnumMember__(id: Identifier_ | StringLiteral_): typings.babelTypes.libMod.TSEnumMember__ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSEnumMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSEnumMember__]
  }
  
  inline def TSExportAssignment__(expression: Expression): typings.babelTypes.libMod.TSExportAssignment__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExportAssignment")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSExportAssignment__]
  }
  
  inline def TSExpressionWithTypeArguments__(expression: TSEntityName): typings.babelTypes.libMod.TSExpressionWithTypeArguments__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSExpressionWithTypeArguments__]
  }
  
  inline def TSExternalModuleReference__(expression: StringLiteral_): typings.babelTypes.libMod.TSExternalModuleReference__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSExternalModuleReference")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSExternalModuleReference__]
  }
  
  inline def TSFunctionType__(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSFunctionType__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSFunctionType__]
  }
  
  inline def TSImportEqualsDeclaration__(id: Identifier_, isExport: Boolean, moduleReference: TSEntityName | TSExternalModuleReference__): typings.babelTypes.libMod.TSImportEqualsDeclaration__ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportEqualsDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSImportEqualsDeclaration__]
  }
  
  inline def TSImportType__(argument: StringLiteral_): typings.babelTypes.libMod.TSImportType__ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSImportType__]
  }
  
  inline def TSIndexSignature__(parameters: js.Array[Identifier_]): typings.babelTypes.libMod.TSIndexSignature__ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIndexSignature__]
  }
  
  inline def TSIndexedAccessType__(indexType: TSType, objectType: TSType): typings.babelTypes.libMod.TSIndexedAccessType__ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIndexedAccessType__]
  }
  
  inline def TSInferType__(typeParameter: TSTypeParameter__): typings.babelTypes.libMod.TSInferType__ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSInferType__]
  }
  
  inline def TSInstantiationExpression__(expression: Expression): typings.babelTypes.libMod.TSInstantiationExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInstantiationExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSInstantiationExpression__]
  }
  
  inline def TSInterfaceBody__(body: js.Array[TSTypeElement]): typings.babelTypes.libMod.TSInterfaceBody__ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInterfaceBody")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSInterfaceBody__]
  }
  
  inline def TSInterfaceDeclaration__(body: TSInterfaceBody__, id: Identifier_): typings.babelTypes.libMod.TSInterfaceDeclaration__ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSInterfaceDeclaration__]
  }
  
  inline def TSIntersectionType__(types: js.Array[TSType]): typings.babelTypes.libMod.TSIntersectionType__ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIntersectionType__]
  }
  
  inline def TSIntrinsicKeyword__(): typings.babelTypes.libMod.TSIntrinsicKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSIntrinsicKeyword__]
  }
  
  inline def TSLiteralType__(
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_ | TemplateLiteral_ | UnaryExpression_
  ): typings.babelTypes.libMod.TSLiteralType__ = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSLiteralType__]
  }
  
  inline def TSMappedType__(typeParameter: TSTypeParameter__): typings.babelTypes.libMod.TSMappedType__ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSMappedType__]
  }
  
  inline def TSMethodSignature__(key: Expression, kind: method_ | get | set, parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.libMod.TSMethodSignature__ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSMethodSignature__]
  }
  
  inline def TSModuleBlock__(body: js.Array[Statement]): typings.babelTypes.libMod.TSModuleBlock__ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSModuleBlock__]
  }
  
  inline def TSModuleDeclaration__(
    body: TSModuleBlock__ | typings.babelTypes.libMod.TSModuleDeclaration__,
    id: Identifier_ | StringLiteral_
  ): typings.babelTypes.libMod.TSModuleDeclaration__ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSModuleDeclaration__]
  }
  
  inline def TSNamedTupleMember__(elementType: TSType, label: Identifier_, optional: Boolean): typings.babelTypes.libMod.TSNamedTupleMember__ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNamedTupleMember")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNamedTupleMember__]
  }
  
  inline def TSNamespaceExportDeclaration__(id: Identifier_): typings.babelTypes.libMod.TSNamespaceExportDeclaration__ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNamespaceExportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNamespaceExportDeclaration__]
  }
  
  inline def TSNeverKeyword__(): typings.babelTypes.libMod.TSNeverKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNeverKeyword__]
  }
  
  inline def TSNonNullExpression__(expression: Expression): typings.babelTypes.libMod.TSNonNullExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNonNullExpression__]
  }
  
  inline def TSNullKeyword__(): typings.babelTypes.libMod.TSNullKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNullKeyword__]
  }
  
  inline def TSNumberKeyword__(): typings.babelTypes.libMod.TSNumberKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNumberKeyword__]
  }
  
  inline def TSObjectKeyword__(): typings.babelTypes.libMod.TSObjectKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSObjectKeyword__]
  }
  
  inline def TSOptionalType__(typeAnnotation: TSType): typings.babelTypes.libMod.TSOptionalType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSOptionalType__]
  }
  
  inline def TSParameterProperty__(parameter: Identifier_ | AssignmentPattern_): typings.babelTypes.libMod.TSParameterProperty__ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSParameterProperty__]
  }
  
  inline def TSParenthesizedType__(typeAnnotation: TSType): typings.babelTypes.libMod.TSParenthesizedType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSParenthesizedType__]
  }
  
  inline def TSPropertySignature__(key: Expression, kind: get | set): typings.babelTypes.libMod.TSPropertySignature__ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSPropertySignature__]
  }
  
  inline def TSQualifiedName__(left: TSEntityName, right: Identifier_): typings.babelTypes.libMod.TSQualifiedName__ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSQualifiedName")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSQualifiedName__]
  }
  
  inline def TSRestType__(typeAnnotation: TSType): typings.babelTypes.libMod.TSRestType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSRestType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSRestType__]
  }
  
  inline def TSSatisfiesExpression__(expression: Expression, typeAnnotation: TSType): typings.babelTypes.libMod.TSSatisfiesExpression__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSSatisfiesExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSSatisfiesExpression__]
  }
  
  inline def TSStringKeyword__(): typings.babelTypes.libMod.TSStringKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSStringKeyword__]
  }
  
  inline def TSSymbolKeyword__(): typings.babelTypes.libMod.TSSymbolKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSSymbolKeyword__]
  }
  
  inline def TSThisType__(): typings.babelTypes.libMod.TSThisType__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSThisType__]
  }
  
  inline def TSTupleType__(elementTypes: js.Array[TSType | TSNamedTupleMember__]): typings.babelTypes.libMod.TSTupleType__ = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTupleType__]
  }
  
  inline def TSTypeAliasDeclaration__(id: Identifier_, typeAnnotation: TSType): typings.babelTypes.libMod.TSTypeAliasDeclaration__ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeAliasDeclaration__]
  }
  
  inline def TSTypeAnnotation__(typeAnnotation: TSType): typings.babelTypes.libMod.TSTypeAnnotation__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeAnnotation__]
  }
  
  inline def TSTypeAssertion__(expression: Expression, typeAnnotation: TSType): typings.babelTypes.libMod.TSTypeAssertion__ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeAssertion__]
  }
  
  inline def TSTypeLiteral__(members: js.Array[TSTypeElement]): typings.babelTypes.libMod.TSTypeLiteral__ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeLiteral__]
  }
  
  inline def TSTypeOperator__(operator: String, typeAnnotation: TSType): typings.babelTypes.libMod.TSTypeOperator__ = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeOperator__]
  }
  
  inline def TSTypeParameterDeclaration__(params: js.Array[TSTypeParameter__]): typings.babelTypes.libMod.TSTypeParameterDeclaration__ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameterDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeParameterDeclaration__]
  }
  
  inline def TSTypeParameterInstantiation__(params: js.Array[TSType]): typings.babelTypes.libMod.TSTypeParameterInstantiation__ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameterInstantiation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeParameterInstantiation__]
  }
  
  inline def TSTypeParameter__(name: String): typings.babelTypes.libMod.TSTypeParameter__ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeParameter")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeParameter__]
  }
  
  inline def TSTypePredicate__(parameterName: Identifier_ | TSThisType__): typings.babelTypes.libMod.TSTypePredicate__ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypePredicate__]
  }
  
  inline def TSTypeQuery__(exprName: TSEntityName | TSImportType__): typings.babelTypes.libMod.TSTypeQuery__ = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeQuery__]
  }
  
  inline def TSTypeReference__(typeName: TSEntityName): typings.babelTypes.libMod.TSTypeReference__ = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeReference__]
  }
  
  inline def TSUndefinedKeyword__(): typings.babelTypes.libMod.TSUndefinedKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSUndefinedKeyword__]
  }
  
  inline def TSUnionType__(types: js.Array[TSType]): typings.babelTypes.libMod.TSUnionType__ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSUnionType__]
  }
  
  inline def TSUnknownKeyword__(): typings.babelTypes.libMod.TSUnknownKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSUnknownKeyword__]
  }
  
  inline def TSVoidKeyword__(): typings.babelTypes.libMod.TSVoidKeyword__ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSVoidKeyword__]
  }
  
  inline def TaggedTemplateExpression_(quasi: TemplateLiteral_, tag: Expression): typings.babelTypes.libMod.TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TaggedTemplateExpression_]
  }
  
  inline def TemplateElement_(tail: Boolean, value: Cooked): typings.babelTypes.libMod.TemplateElement_ = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.TemplateElement_]
  }
  
  inline def TemplateLiteral_(expressions: js.Array[Expression | TSType], quasis: js.Array[TemplateElement_]): typings.babelTypes.libMod.TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.TemplateLiteral_]
  }
  
  inline def ThisExpression_(): typings.babelTypes.libMod.ThisExpression_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ThisExpression_]
  }
  
  inline def ThisTypeAnnotation_(): typings.babelTypes.libMod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.ThisTypeAnnotation_]
  }
  
  inline def ThrowStatement_(argument: Expression): typings.babelTypes.libMod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.ThrowStatement_]
  }
  
  inline def TopicReference_(): typings.babelTypes.libMod.TopicReference_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TopicReference")
    __obj.asInstanceOf[typings.babelTypes.libMod.TopicReference_]
  }
  
  inline def TryStatement_(block: BlockStatement_): typings.babelTypes.libMod.TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.TryStatement_]
  }
  
  inline def TupleExpression_(elements: js.Array[Expression | SpreadElement_]): typings.babelTypes.libMod.TupleExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TupleExpression_]
  }
  
  inline def TupleTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.libMod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TupleTypeAnnotation_]
  }
  
  inline def TypeAlias_(id: Identifier_, right: FlowType): typings.babelTypes.libMod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeAlias_]
  }
  
  inline def TypeAnnotation_(typeAnnotation: FlowType): typings.babelTypes.libMod.TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeAnnotation_]
  }
  
  inline def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typings.babelTypes.libMod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeCastExpression_]
  }
  
  inline def TypeParameterDeclaration_(params: js.Array[TypeParameter_]): typings.babelTypes.libMod.TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeParameterDeclaration_]
  }
  
  inline def TypeParameterInstantiation_(params: js.Array[FlowType]): typings.babelTypes.libMod.TypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameterInstantiation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeParameterInstantiation_]
  }
  
  inline def TypeParameter_(name: String): typings.babelTypes.libMod.TypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeParameter")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeParameter_]
  }
  
  inline def TypeofTypeAnnotation_(argument: FlowType): typings.babelTypes.libMod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeofTypeAnnotation_]
  }
  
  inline def UnaryExpression_(
    argument: Expression,
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    prefix: Boolean
  ): typings.babelTypes.libMod.UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.UnaryExpression_]
  }
  
  inline def UnionTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.libMod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.UnionTypeAnnotation_]
  }
  
  inline def UpdateExpression_(argument: Expression, operator: PlussignPlussign | `--`, prefix: Boolean): typings.babelTypes.libMod.UpdateExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.UpdateExpression_]
  }
  
  inline def V8IntrinsicIdentifier_(name: String): typings.babelTypes.libMod.V8IntrinsicIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("V8IntrinsicIdentifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.V8IntrinsicIdentifier_]
  }
  
  inline def VariableDeclaration_(declarations: js.Array[VariableDeclarator_], kind: `var` | let | const | `using`): typings.babelTypes.libMod.VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.VariableDeclaration_]
  }
  
  inline def VariableDeclarator_(id: LVal): typings.babelTypes.libMod.VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[typings.babelTypes.libMod.VariableDeclarator_]
  }
  
  inline def Variance_(kind: minus | plus): typings.babelTypes.libMod.Variance_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Variance")
    __obj.asInstanceOf[typings.babelTypes.libMod.Variance_]
  }
  
  inline def VoidTypeAnnotation_(): typings.babelTypes.libMod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.libMod.VoidTypeAnnotation_]
  }
  
  inline def WhileStatement_(body: Statement, test: Expression): typings.babelTypes.libMod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.WhileStatement_]
  }
  
  inline def WithStatement_(body: Statement, `object`: Expression): typings.babelTypes.libMod.WithStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.WithStatement_]
  }
  
  inline def YieldExpression_(delegate: Boolean): typings.babelTypes.libMod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.YieldExpression_]
  }
}
