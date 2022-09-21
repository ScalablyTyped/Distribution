package typings.babelTypes.mod

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

trait _Node extends StObject
object _Node {
  
  inline def AnyTypeAnnotation_(): typings.babelTypes.mod.AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AnyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.AnyTypeAnnotation_]
  }
  
  inline def ArgumentPlaceholder_(): typings.babelTypes.mod.ArgumentPlaceholder_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ArgumentPlaceholder")
    __obj.asInstanceOf[typings.babelTypes.mod.ArgumentPlaceholder_]
  }
  
  inline def ArrayExpression_(elements: js.Array[Null | Expression | SpreadElement_]): typings.babelTypes.mod.ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrayExpression_]
  }
  
  inline def ArrayPattern_(elements: js.Array[Null | PatternLike | LVal]): typings.babelTypes.mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrayPattern_]
  }
  
  inline def ArrayTypeAnnotation_(elementType: FlowType): typings.babelTypes.mod.ArrayTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ArrayTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrayTypeAnnotation_]
  }
  
  inline def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typings.babelTypes.mod.ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, predicate = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrowFunctionExpression_]
  }
  
  inline def AssignmentExpression_(left: LVal, operator: String, right: Expression): typings.babelTypes.mod.AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.AssignmentExpression_]
  }
  
  inline def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression_ | TSTypeAssertion_ | TSNonNullExpression_,
    right: Expression
  ): typings.babelTypes.mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.AssignmentPattern_]
  }
  
  inline def AwaitExpression_(argument: Expression): typings.babelTypes.mod.AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.AwaitExpression_]
  }
  
  inline def BigIntLiteral_(value: String): typings.babelTypes.mod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.BigIntLiteral_]
  }
  
  inline def BinaryExpression_(
    left: Expression | PrivateName_,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typings.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign | VerticallineGreaterthansign,
    right: Expression
  ): typings.babelTypes.mod.BinaryExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.BinaryExpression_]
  }
  
  inline def BindExpression_(callee: Expression, `object`: Expression): typings.babelTypes.mod.BindExpression_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BindExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.BindExpression_]
  }
  
  inline def BlockStatement_(body: js.Array[Statement], directives: js.Array[Directive_]): typings.babelTypes.mod.BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.BlockStatement_]
  }
  
  inline def BooleanLiteralTypeAnnotation_(value: Boolean): typings.babelTypes.mod.BooleanLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.BooleanLiteralTypeAnnotation_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typings.babelTypes.mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.BooleanLiteral_]
  }
  
  inline def BooleanTypeAnnotation_(): typings.babelTypes.mod.BooleanTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.BooleanTypeAnnotation_]
  }
  
  inline def BreakStatement_(): typings.babelTypes.mod.BreakStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.BreakStatement_]
  }
  
  inline def CallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): typings.babelTypes.mod.CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.CallExpression_]
  }
  
  inline def CatchClause_(body: BlockStatement_): typings.babelTypes.mod.CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, param = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[typings.babelTypes.mod.CatchClause_]
  }
  
  inline def ClassAccessorProperty_(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression | PrivateName_,
    `override`: Boolean,
    static: Boolean
  ): typings.babelTypes.mod.ClassAccessorProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], accessibility = null, declare = null, decorators = null, definite = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null, value = null, variance = null)
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassAccessorProperty")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.ClassAccessorProperty_]
  }
  
  inline def ClassBody_(
    body: js.Array[
      ClassMethod_ | ClassPrivateMethod_ | ClassProperty_ | ClassPrivateProperty_ | ClassAccessorProperty_ | TSDeclareMethod_ | TSIndexSignature_ | StaticBlock_
    ]
  ): typings.babelTypes.mod.ClassBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ClassBody")
    __obj.asInstanceOf[typings.babelTypes.mod.ClassBody_]
  }
  
  inline def ClassDeclaration_(body: ClassBody_, id: Identifier_): typings.babelTypes.mod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, decorators = null, end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, superClass = null, superTypeParameters = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.ClassDeclaration_]
  }
  
  inline def ClassExpression_(body: ClassBody_): typings.babelTypes.mod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], decorators = null, end = null, id = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, superClass = null, superTypeParameters = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ClassExpression_]
  }
  
  inline def ClassImplements_(id: Identifier_): typings.babelTypes.mod.ClassImplements_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassImplements")
    __obj.asInstanceOf[typings.babelTypes.mod.ClassImplements_]
  }
  
  inline def ClassMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    kind: get | set | method_ | constructor,
    `override`: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean
  ): typings.babelTypes.mod.ClassMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], access = null, accessibility = null, decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassMethod")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.ClassMethod_]
  }
  
  inline def ClassPrivateMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: PrivateName_,
    kind: get | set | method_,
    `override`: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean
  ): typings.babelTypes.mod.ClassPrivateMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], access = null, accessibility = null, decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassPrivateMethod")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.ClassPrivateMethod_]
  }
  
  inline def ClassPrivateProperty_(key: PrivateName_, static: Boolean): typings.babelTypes.mod.ClassPrivateProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], decorators = null, definite = null, end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null, value = null, variance = null)
    __obj.updateDynamic("type")("ClassPrivateProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.ClassPrivateProperty_]
  }
  
  inline def ClassProperty_(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    `override`: Boolean,
    static: Boolean
  ): typings.babelTypes.mod.ClassProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], accessibility = null, declare = null, decorators = null, definite = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null, value = null, variance = null)
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassProperty")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.ClassProperty_]
  }
  
  inline def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression): typings.babelTypes.mod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ConditionalExpression_]
  }
  
  inline def ContinueStatement_(): typings.babelTypes.mod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, label = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ContinueStatement_]
  }
  
  inline def DebuggerStatement_(): typings.babelTypes.mod.DebuggerStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DebuggerStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.DebuggerStatement_]
  }
  
  inline def DecimalLiteral_(value: String): typings.babelTypes.mod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.DecimalLiteral_]
  }
  
  inline def DeclareClass_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.mod.DeclareClass_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareClass")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareClass_]
  }
  
  inline def DeclareExportAllDeclaration_(source: StringLiteral_): typings.babelTypes.mod.DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareExportAllDeclaration_]
  }
  
  inline def DeclareExportDeclaration_(): typings.babelTypes.mod.DeclareExportDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = null, default = null, end = null, innerComments = null, leadingComments = null, loc = null, source = null, specifiers = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareExportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareExportDeclaration_]
  }
  
  inline def DeclareFunction_(id: Identifier_): typings.babelTypes.mod.DeclareFunction_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, predicate = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareFunction_]
  }
  
  inline def DeclareInterface_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.mod.DeclareInterface_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareInterface")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareInterface_]
  }
  
  inline def DeclareModuleExports_(typeAnnotation: TypeAnnotation_): typings.babelTypes.mod.DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareModuleExports")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareModuleExports_]
  }
  
  inline def DeclareModule_(body: BlockStatement_, id: Identifier_ | StringLiteral_): typings.babelTypes.mod.DeclareModule_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, innerComments = null, kind = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareModule")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareModule_]
  }
  
  inline def DeclareOpaqueType_(id: Identifier_): typings.babelTypes.mod.DeclareOpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, impltype = null, innerComments = null, leadingComments = null, loc = null, start = null, supertype = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareOpaqueType")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareOpaqueType_]
  }
  
  inline def DeclareTypeAlias_(id: Identifier_, right: FlowType): typings.babelTypes.mod.DeclareTypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareTypeAlias_]
  }
  
  inline def DeclareVariable_(id: Identifier_): typings.babelTypes.mod.DeclareVariable_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclareVariable")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclareVariable_]
  }
  
  inline def DeclaredPredicate_(value: Flow): typings.babelTypes.mod.DeclaredPredicate_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DeclaredPredicate")
    __obj.asInstanceOf[typings.babelTypes.mod.DeclaredPredicate_]
  }
  
  inline def Decorator_(expression: Expression): typings.babelTypes.mod.Decorator_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Decorator")
    __obj.asInstanceOf[typings.babelTypes.mod.Decorator_]
  }
  
  inline def DirectiveLiteral_(value: String): typings.babelTypes.mod.DirectiveLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DirectiveLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.DirectiveLiteral_]
  }
  
  inline def Directive_(value: DirectiveLiteral_): typings.babelTypes.mod.Directive_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Directive")
    __obj.asInstanceOf[typings.babelTypes.mod.Directive_]
  }
  
  inline def DoExpression_(async: Boolean, body: BlockStatement_): typings.babelTypes.mod.DoExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.DoExpression_]
  }
  
  inline def DoWhileStatement_(body: Statement, test: Expression): typings.babelTypes.mod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.DoWhileStatement_]
  }
  
  inline def EmptyStatement_(): typings.babelTypes.mod.EmptyStatement_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.EmptyStatement_]
  }
  
  inline def EmptyTypeAnnotation_(): typings.babelTypes.mod.EmptyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EmptyTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.EmptyTypeAnnotation_]
  }
  
  inline def EnumBooleanBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumBooleanMember_]): typings.babelTypes.mod.EnumBooleanBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumBooleanBody")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumBooleanBody_]
  }
  
  inline def EnumBooleanMember_(id: Identifier_, init: BooleanLiteral_): typings.babelTypes.mod.EnumBooleanMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumBooleanMember")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumBooleanMember_]
  }
  
  inline def EnumDeclaration_(body: EnumBooleanBody_ | EnumNumberBody_ | EnumStringBody_ | EnumSymbolBody_, id: Identifier_): typings.babelTypes.mod.EnumDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumDeclaration_]
  }
  
  inline def EnumDefaultedMember_(id: Identifier_): typings.babelTypes.mod.EnumDefaultedMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumDefaultedMember")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumDefaultedMember_]
  }
  
  inline def EnumNumberBody_(explicitType: Boolean, hasUnknownMembers: Boolean, members: js.Array[EnumNumberMember_]): typings.babelTypes.mod.EnumNumberBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumNumberBody")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumNumberBody_]
  }
  
  inline def EnumNumberMember_(id: Identifier_, init: NumericLiteral_): typings.babelTypes.mod.EnumNumberMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumNumberMember")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumNumberMember_]
  }
  
  inline def EnumStringBody_(
    explicitType: Boolean,
    hasUnknownMembers: Boolean,
    members: js.Array[EnumStringMember_ | EnumDefaultedMember_]
  ): typings.babelTypes.mod.EnumStringBody_ = {
    val __obj = js.Dynamic.literal(explicitType = explicitType.asInstanceOf[js.Any], hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumStringBody")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumStringBody_]
  }
  
  inline def EnumStringMember_(id: Identifier_, init: StringLiteral_): typings.babelTypes.mod.EnumStringMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumStringMember")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumStringMember_]
  }
  
  inline def EnumSymbolBody_(hasUnknownMembers: Boolean, members: js.Array[EnumDefaultedMember_]): typings.babelTypes.mod.EnumSymbolBody_ = {
    val __obj = js.Dynamic.literal(hasUnknownMembers = hasUnknownMembers.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("EnumSymbolBody")
    __obj.asInstanceOf[typings.babelTypes.mod.EnumSymbolBody_]
  }
  
  inline def ExistsTypeAnnotation_(): typings.babelTypes.mod.ExistsTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExistsTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.ExistsTypeAnnotation_]
  }
  
  inline def ExportAllDeclaration_(source: StringLiteral_): typings.babelTypes.mod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], assertions = null, end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportAllDeclaration_]
  }
  
  inline def ExportDefaultDeclaration_(declaration: TSDeclareFunction_ | FunctionDeclaration_ | ClassDeclaration_ | Expression): typings.babelTypes.mod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportDefaultDeclaration_]
  }
  
  inline def ExportDefaultSpecifier_(exported: Identifier_): typings.babelTypes.mod.ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportDefaultSpecifier_]
  }
  
  inline def ExportNamedDeclaration_(specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): typings.babelTypes.mod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any], assertions = null, declaration = null, end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, source = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportNamedDeclaration_]
  }
  
  inline def ExportNamespaceSpecifier_(exported: Identifier_): typings.babelTypes.mod.ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportNamespaceSpecifier_]
  }
  
  inline def ExportSpecifier_(exported: Identifier_ | StringLiteral_, local: Identifier_): typings.babelTypes.mod.ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportSpecifier_]
  }
  
  inline def ExpressionStatement_(expression: Expression): typings.babelTypes.mod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ExpressionStatement_]
  }
  
  inline def File_(program: Program_): typings.babelTypes.mod.File_ = {
    val __obj = js.Dynamic.literal(program = program.asInstanceOf[js.Any], comments = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, tokens = null, trailingComments = null)
    __obj.updateDynamic("type")("File")
    __obj.asInstanceOf[typings.babelTypes.mod.File_]
  }
  
  inline def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.mod.ForInStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForInStatement_]
  }
  
  inline def ForOfStatement_(await: Boolean, body: Statement, left: VariableDeclaration_ | LVal, right: Expression): typings.babelTypes.mod.ForOfStatement_ = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForOfStatement_]
  }
  
  inline def ForStatement_(body: Statement): typings.babelTypes.mod.ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, init = null, innerComments = null, leadingComments = null, loc = null, start = null, test = null, trailingComments = null, update = null)
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ForStatement_]
  }
  
  inline def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typings.babelTypes.mod.FunctionDeclaration_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], declare = null, end = null, id = null, innerComments = null, leadingComments = null, loc = null, predicate = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.FunctionDeclaration_]
  }
  
  inline def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typings.babelTypes.mod.FunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], end = null, id = null, innerComments = null, leadingComments = null, loc = null, predicate = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.FunctionExpression_]
  }
  
  inline def FunctionTypeAnnotation_(params: js.Array[FunctionTypeParam_], returnType: FlowType): typings.babelTypes.mod.FunctionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, rest = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionTypeAnnotation")
    __obj.updateDynamic("this")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.FunctionTypeAnnotation_]
  }
  
  inline def FunctionTypeParam_(typeAnnotation: FlowType): typings.babelTypes.mod.FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, name = null, optional = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("FunctionTypeParam")
    __obj.asInstanceOf[typings.babelTypes.mod.FunctionTypeParam_]
  }
  
  inline def GenericTypeAnnotation_(id: Identifier_ | QualifiedTypeIdentifier_): typings.babelTypes.mod.GenericTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("GenericTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.GenericTypeAnnotation_]
  }
  
  inline def Identifier_(name: String): typings.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.mod.Identifier_]
  }
  
  inline def IfStatement_(consequent: Statement, test: Expression): typings.babelTypes.mod.IfStatement_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], alternate = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.IfStatement_]
  }
  
  inline def ImportAttribute_(key: Identifier_ | StringLiteral_, value: StringLiteral_): typings.babelTypes.mod.ImportAttribute_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportAttribute")
    __obj.asInstanceOf[typings.babelTypes.mod.ImportAttribute_]
  }
  
  inline def ImportDeclaration_(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]
  ): typings.babelTypes.mod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], assertions = null, end = null, importKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.ImportDeclaration_]
  }
  
  inline def ImportDefaultSpecifier_(local: Identifier_): typings.babelTypes.mod.ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ImportDefaultSpecifier_]
  }
  
  inline def ImportNamespaceSpecifier_(local: Identifier_): typings.babelTypes.mod.ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ImportNamespaceSpecifier_]
  }
  
  inline def ImportSpecifier_(imported: Identifier_ | StringLiteral_, local: Identifier_): typings.babelTypes.mod.ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], end = null, importKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ImportSpecifier_]
  }
  
  inline def Import_(): typings.babelTypes.mod.Import_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[typings.babelTypes.mod.Import_]
  }
  
  inline def IndexedAccessType_(indexType: FlowType, objectType: FlowType): typings.babelTypes.mod.IndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("IndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.mod.IndexedAccessType_]
  }
  
  inline def InferredPredicate_(): typings.babelTypes.mod.InferredPredicate_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InferredPredicate")
    __obj.asInstanceOf[typings.babelTypes.mod.InferredPredicate_]
  }
  
  inline def InterfaceDeclaration_(body: ObjectTypeAnnotation_, id: Identifier_): typings.babelTypes.mod.InterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], end = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("InterfaceDeclaration")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.InterfaceDeclaration_]
  }
  
  inline def InterfaceExtends_(id: Identifier_ | QualifiedTypeIdentifier_): typings.babelTypes.mod.InterfaceExtends_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("InterfaceExtends")
    __obj.asInstanceOf[typings.babelTypes.mod.InterfaceExtends_]
  }
  
  inline def InterfaceTypeAnnotation_(body: ObjectTypeAnnotation_): typings.babelTypes.mod.InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InterfaceTypeAnnotation")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.InterfaceTypeAnnotation_]
  }
  
  inline def InterpreterDirective_(value: String): typings.babelTypes.mod.InterpreterDirective_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("InterpreterDirective")
    __obj.asInstanceOf[typings.babelTypes.mod.InterpreterDirective_]
  }
  
  inline def IntersectionTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.mod.IntersectionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("IntersectionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.IntersectionTypeAnnotation_]
  }
  
  inline def JSXAttribute_(name: JSXIdentifier_ | JSXNamespacedName_): typings.babelTypes.mod.JSXAttribute_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, value = null)
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXAttribute_]
  }
  
  inline def JSXClosingElement_(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_): typings.babelTypes.mod.JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXClosingElement_]
  }
  
  inline def JSXClosingFragment_(): typings.babelTypes.mod.JSXClosingFragment_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXClosingFragment_]
  }
  
  inline def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typings.babelTypes.mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_
  ): typings.babelTypes.mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null, end = null, innerComments = null, leadingComments = null, loc = null, selfClosing = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXElement_]
  }
  
  inline def JSXEmptyExpression_(): typings.babelTypes.mod.JSXEmptyExpression_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXEmptyExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXEmptyExpression_]
  }
  
  inline def JSXExpressionContainer_(expression: Expression | JSXEmptyExpression_): typings.babelTypes.mod.JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXExpressionContainer")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXExpressionContainer_]
  }
  
  inline def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typings.babelTypes.mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_
  ): typings.babelTypes.mod.JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXFragment_]
  }
  
  inline def JSXIdentifier_(name: String): typings.babelTypes.mod.JSXIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXIdentifier")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXIdentifier_]
  }
  
  inline def JSXMemberExpression_(`object`: typings.babelTypes.mod.JSXMemberExpression_ | JSXIdentifier_, property: JSXIdentifier_): typings.babelTypes.mod.JSXMemberExpression_ = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXMemberExpression_]
  }
  
  inline def JSXNamespacedName_(name: JSXIdentifier_, namespace: JSXIdentifier_): typings.babelTypes.mod.JSXNamespacedName_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXNamespacedName_]
  }
  
  inline def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean
  ): typings.babelTypes.mod.JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXOpeningElement_]
  }
  
  inline def JSXOpeningFragment_(): typings.babelTypes.mod.JSXOpeningFragment_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXOpeningFragment_]
  }
  
  inline def JSXSpreadAttribute_(argument: Expression): typings.babelTypes.mod.JSXSpreadAttribute_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXSpreadAttribute")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXSpreadAttribute_]
  }
  
  inline def JSXSpreadChild_(expression: Expression): typings.babelTypes.mod.JSXSpreadChild_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXSpreadChild_]
  }
  
  inline def JSXText_(value: String): typings.babelTypes.mod.JSXText_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXText_]
  }
  
  inline def LabeledStatement_(body: Statement, label: Identifier_): typings.babelTypes.mod.LabeledStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.LabeledStatement_]
  }
  
  inline def LogicalExpression_(
    left: Expression,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: Expression
  ): typings.babelTypes.mod.LogicalExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.LogicalExpression_]
  }
  
  inline def MemberExpression_(
    computed: Boolean,
    `object`: Expression | Super_,
    property: Expression | Identifier_ | PrivateName_
  ): typings.babelTypes.mod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.MemberExpression_]
  }
  
  inline def MetaProperty_(meta: Identifier_, property: Identifier_): typings.babelTypes.mod.MetaProperty_ = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.MetaProperty_]
  }
  
  inline def MixedTypeAnnotation_(): typings.babelTypes.mod.MixedTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("MixedTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.MixedTypeAnnotation_]
  }
  
  inline def ModuleExpression_(body: Program_): typings.babelTypes.mod.ModuleExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ModuleExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ModuleExpression_]
  }
  
  inline def NewExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): typings.babelTypes.mod.NewExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.NewExpression_]
  }
  
  inline def Noop_(): typings.babelTypes.mod.Noop_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Noop")
    __obj.asInstanceOf[typings.babelTypes.mod.Noop_]
  }
  
  inline def NullLiteralTypeAnnotation_(): typings.babelTypes.mod.NullLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.NullLiteralTypeAnnotation_]
  }
  
  inline def NullLiteral_(): typings.babelTypes.mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.NullLiteral_]
  }
  
  inline def NullableTypeAnnotation_(typeAnnotation: FlowType): typings.babelTypes.mod.NullableTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullableTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.NullableTypeAnnotation_]
  }
  
  inline def NumberLiteralTypeAnnotation_(value: Double): typings.babelTypes.mod.NumberLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumberLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.NumberLiteralTypeAnnotation_]
  }
  
  inline def NumberTypeAnnotation_(): typings.babelTypes.mod.NumberTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumberTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.NumberTypeAnnotation_]
  }
  
  inline def NumericLiteral_(value: Double): typings.babelTypes.mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.NumericLiteral_]
  }
  
  inline def ObjectExpression_(properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]): typings.babelTypes.mod.ObjectExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectExpression_]
  }
  
  inline def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_,
    kind: method_ | get | set,
    params: js.Array[Identifier_ | Pattern | RestElement_]
  ): typings.babelTypes.mod.ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ObjectMethod")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectMethod_]
  }
  
  inline def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_]): typings.babelTypes.mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectPattern_]
  }
  
  inline def ObjectProperty_(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | DecimalLiteral_ | PrivateName_,
    shorthand: Boolean,
    value: Expression | PatternLike
  ): typings.babelTypes.mod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectProperty_]
  }
  
  inline def ObjectTypeAnnotation_(
    callProperties: js.Array[ObjectTypeCallProperty_],
    exact: Boolean,
    indexers: js.Array[ObjectTypeIndexer_],
    internalSlots: js.Array[ObjectTypeInternalSlot_],
    properties: js.Array[ObjectTypeProperty_ | ObjectTypeSpreadProperty_]
  ): typings.babelTypes.mod.ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], exact = exact.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], internalSlots = internalSlots.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], end = null, inexact = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectTypeAnnotation_]
  }
  
  inline def ObjectTypeCallProperty_(static: Boolean, value: FlowType): typings.babelTypes.mod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeCallProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectTypeCallProperty_]
  }
  
  inline def ObjectTypeIndexer_(key: FlowType, static: Boolean, value: FlowType): typings.babelTypes.mod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, id = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, variance = null)
    __obj.updateDynamic("type")("ObjectTypeIndexer")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectTypeIndexer_]
  }
  
  inline def ObjectTypeInternalSlot_(id: Identifier_, method: Boolean, optional: Boolean, static: Boolean, value: FlowType): typings.babelTypes.mod.ObjectTypeInternalSlot_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeInternalSlot")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectTypeInternalSlot_]
  }
  
  inline def ObjectTypeProperty_(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    method: Boolean,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    value: FlowType
  ): typings.babelTypes.mod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, variance = null)
    __obj.updateDynamic("type")("ObjectTypeProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectTypeProperty_]
  }
  
  inline def ObjectTypeSpreadProperty_(argument: FlowType): typings.babelTypes.mod.ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectTypeSpreadProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectTypeSpreadProperty_]
  }
  
  inline def OpaqueType_(id: Identifier_, impltype: FlowType): typings.babelTypes.mod.OpaqueType_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], impltype = impltype.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, supertype = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("OpaqueType")
    __obj.asInstanceOf[typings.babelTypes.mod.OpaqueType_]
  }
  
  inline def OptionalCallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression,
    optional: Boolean
  ): typings.babelTypes.mod.OptionalCallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.OptionalCallExpression_]
  }
  
  inline def OptionalIndexedAccessType_(indexType: FlowType, objectType: FlowType, optional: Boolean): typings.babelTypes.mod.OptionalIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("OptionalIndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.mod.OptionalIndexedAccessType_]
  }
  
  inline def OptionalMemberExpression_(computed: Boolean, `object`: Expression, optional: Boolean, property: Expression | Identifier_): typings.babelTypes.mod.OptionalMemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalMemberExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.OptionalMemberExpression_]
  }
  
  inline def ParenthesizedExpression_(expression: Expression): typings.babelTypes.mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ParenthesizedExpression_]
  }
  
  inline def PipelineBareFunction_(callee: Expression): typings.babelTypes.mod.PipelineBareFunction_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PipelineBareFunction")
    __obj.asInstanceOf[typings.babelTypes.mod.PipelineBareFunction_]
  }
  
  inline def PipelinePrimaryTopicReference_(): typings.babelTypes.mod.PipelinePrimaryTopicReference_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PipelinePrimaryTopicReference")
    __obj.asInstanceOf[typings.babelTypes.mod.PipelinePrimaryTopicReference_]
  }
  
  inline def PipelineTopicExpression_(expression: Expression): typings.babelTypes.mod.PipelineTopicExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PipelineTopicExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.PipelineTopicExpression_]
  }
  
  inline def Placeholder_(
    expectedNode: Identifier | StringLiteral | typings.babelTypes.babelTypesStrings.Expression | typings.babelTypes.babelTypesStrings.Statement | typings.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typings.babelTypes.babelTypesStrings.Pattern,
    name: Identifier_
  ): typings.babelTypes.mod.Placeholder_ = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Placeholder")
    __obj.asInstanceOf[typings.babelTypes.mod.Placeholder_]
  }
  
  inline def PrivateName_(id: Identifier_): typings.babelTypes.mod.PrivateName_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PrivateName")
    __obj.asInstanceOf[typings.babelTypes.mod.PrivateName_]
  }
  
  inline def Program_(
    body: js.Array[Statement],
    directives: js.Array[Directive_],
    sourceFile: String,
    sourceType: script | module
  ): typings.babelTypes.mod.Program_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any], end = null, innerComments = null, interpreter = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Program")
    __obj.asInstanceOf[typings.babelTypes.mod.Program_]
  }
  
  inline def QualifiedTypeIdentifier_(id: Identifier_, qualification: Identifier_ | typings.babelTypes.mod.QualifiedTypeIdentifier_): typings.babelTypes.mod.QualifiedTypeIdentifier_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], qualification = qualification.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("QualifiedTypeIdentifier")
    __obj.asInstanceOf[typings.babelTypes.mod.QualifiedTypeIdentifier_]
  }
  
  inline def RecordExpression_(properties: js.Array[ObjectProperty_ | SpreadElement_]): typings.babelTypes.mod.RecordExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RecordExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.RecordExpression_]
  }
  
  inline def RegExpLiteral_(flags: String, pattern: String): typings.babelTypes.mod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.RegExpLiteral_]
  }
  
  inline def RestElement_(argument: LVal): typings.babelTypes.mod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("RestElement")
    __obj.asInstanceOf[typings.babelTypes.mod.RestElement_]
  }
  
  inline def ReturnStatement_(): typings.babelTypes.mod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ReturnStatement_]
  }
  
  inline def SequenceExpression_(expressions: js.Array[Expression]): typings.babelTypes.mod.SequenceExpression_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.SequenceExpression_]
  }
  
  inline def SpreadElement_(argument: Expression): typings.babelTypes.mod.SpreadElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[typings.babelTypes.mod.SpreadElement_]
  }
  
  inline def StaticBlock_(body: js.Array[Statement]): typings.babelTypes.mod.StaticBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StaticBlock")
    __obj.asInstanceOf[typings.babelTypes.mod.StaticBlock_]
  }
  
  inline def StringLiteralTypeAnnotation_(value: String): typings.babelTypes.mod.StringLiteralTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteralTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.StringLiteralTypeAnnotation_]
  }
  
  inline def StringLiteral_(value: String): typings.babelTypes.mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.StringLiteral_]
  }
  
  inline def StringTypeAnnotation_(): typings.babelTypes.mod.StringTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.StringTypeAnnotation_]
  }
  
  inline def Super_(): typings.babelTypes.mod.Super_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[typings.babelTypes.mod.Super_]
  }
  
  inline def SwitchCase_(consequent: js.Array[Statement]): typings.babelTypes.mod.SwitchCase_ = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, test = null, trailingComments = null)
    __obj.updateDynamic("type")("SwitchCase")
    __obj.asInstanceOf[typings.babelTypes.mod.SwitchCase_]
  }
  
  inline def SwitchStatement_(cases: js.Array[SwitchCase_], discriminant: Expression): typings.babelTypes.mod.SwitchStatement_ = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SwitchStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.SwitchStatement_]
  }
  
  inline def SymbolTypeAnnotation_(): typings.babelTypes.mod.SymbolTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SymbolTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.SymbolTypeAnnotation_]
  }
  
  inline def TSAnyKeyword_(): typings.babelTypes.mod.TSAnyKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSAnyKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSAnyKeyword_]
  }
  
  inline def TSArrayType_(elementType: TSType): typings.babelTypes.mod.TSArrayType_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSArrayType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSArrayType_]
  }
  
  inline def TSAsExpression_(expression: Expression, typeAnnotation: TSType): typings.babelTypes.mod.TSAsExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TSAsExpression_]
  }
  
  inline def TSBigIntKeyword_(): typings.babelTypes.mod.TSBigIntKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSBigIntKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSBigIntKeyword_]
  }
  
  inline def TSBooleanKeyword_(): typings.babelTypes.mod.TSBooleanKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSBooleanKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSBooleanKeyword_]
  }
  
  inline def TSCallSignatureDeclaration_(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.mod.TSCallSignatureDeclaration_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSCallSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSCallSignatureDeclaration_]
  }
  
  inline def TSConditionalType_(checkType: TSType, extendsType: TSType, falseType: TSType, trueType: TSType): typings.babelTypes.mod.TSConditionalType_ = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSConditionalType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSConditionalType_]
  }
  
  inline def TSConstructSignatureDeclaration_(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.mod.TSConstructSignatureDeclaration_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSConstructSignatureDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSConstructSignatureDeclaration_]
  }
  
  inline def TSConstructorType_(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.mod.TSConstructorType_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.TSConstructorType_]
  }
  
  inline def TSDeclareFunction_(async: Boolean, generator: Boolean, params: js.Array[Identifier_ | Pattern | RestElement_]): typings.babelTypes.mod.TSDeclareFunction_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], declare = null, end = null, id = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSDeclareFunction")
    __obj.asInstanceOf[typings.babelTypes.mod.TSDeclareFunction_]
  }
  
  inline def TSDeclareMethod_(
    async: Boolean,
    computed: Boolean,
    generator: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | BigIntLiteral_ | Expression,
    kind: get | set | method_ | constructor,
    `override`: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    static: Boolean
  ): typings.babelTypes.mod.TSDeclareMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], access = null, accessibility = null, decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSDeclareMethod")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.TSDeclareMethod_]
  }
  
  inline def TSEnumDeclaration_(id: Identifier_, members: js.Array[TSEnumMember_]): typings.babelTypes.mod.TSEnumDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], const = null, declare = null, end = null, initializer = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSEnumDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSEnumDeclaration_]
  }
  
  inline def TSEnumMember_(id: Identifier_ | StringLiteral_): typings.babelTypes.mod.TSEnumMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, initializer = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSEnumMember")
    __obj.asInstanceOf[typings.babelTypes.mod.TSEnumMember_]
  }
  
  inline def TSExportAssignment_(expression: Expression): typings.babelTypes.mod.TSExportAssignment_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSExportAssignment")
    __obj.asInstanceOf[typings.babelTypes.mod.TSExportAssignment_]
  }
  
  inline def TSExpressionWithTypeArguments_(expression: TSEntityName): typings.babelTypes.mod.TSExpressionWithTypeArguments_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSExpressionWithTypeArguments")
    __obj.asInstanceOf[typings.babelTypes.mod.TSExpressionWithTypeArguments_]
  }
  
  inline def TSExternalModuleReference_(expression: StringLiteral_): typings.babelTypes.mod.TSExternalModuleReference_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSExternalModuleReference")
    __obj.asInstanceOf[typings.babelTypes.mod.TSExternalModuleReference_]
  }
  
  inline def TSFunctionType_(parameters: js.Array[Identifier_ | RestElement_]): typings.babelTypes.mod.TSFunctionType_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSFunctionType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSFunctionType_]
  }
  
  inline def TSImportEqualsDeclaration_(id: Identifier_, isExport: Boolean, moduleReference: TSEntityName | TSExternalModuleReference_): typings.babelTypes.mod.TSImportEqualsDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isExport = isExport.asInstanceOf[js.Any], moduleReference = moduleReference.asInstanceOf[js.Any], end = null, importKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSImportEqualsDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSImportEqualsDeclaration_]
  }
  
  inline def TSImportType_(argument: StringLiteral_): typings.babelTypes.mod.TSImportType_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, qualifier = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSImportType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSImportType_]
  }
  
  inline def TSIndexSignature_(parameters: js.Array[Identifier_]): typings.babelTypes.mod.TSIndexSignature_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, static = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSIndexSignature")
    __obj.asInstanceOf[typings.babelTypes.mod.TSIndexSignature_]
  }
  
  inline def TSIndexedAccessType_(indexType: TSType, objectType: TSType): typings.babelTypes.mod.TSIndexedAccessType_ = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSIndexedAccessType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSIndexedAccessType_]
  }
  
  inline def TSInferType_(typeParameter: TSTypeParameter_): typings.babelTypes.mod.TSInferType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSInferType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSInferType_]
  }
  
  inline def TSInstantiationExpression_(expression: Expression): typings.babelTypes.mod.TSInstantiationExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSInstantiationExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TSInstantiationExpression_]
  }
  
  inline def TSInterfaceBody_(body: js.Array[TSTypeElement]): typings.babelTypes.mod.TSInterfaceBody_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSInterfaceBody")
    __obj.asInstanceOf[typings.babelTypes.mod.TSInterfaceBody_]
  }
  
  inline def TSInterfaceDeclaration_(body: TSInterfaceBody_, id: Identifier_): typings.babelTypes.mod.TSInterfaceDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSInterfaceDeclaration")
    __obj.updateDynamic("extends")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.TSInterfaceDeclaration_]
  }
  
  inline def TSIntersectionType_(types: js.Array[TSType]): typings.babelTypes.mod.TSIntersectionType_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSIntersectionType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSIntersectionType_]
  }
  
  inline def TSIntrinsicKeyword_(): typings.babelTypes.mod.TSIntrinsicKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSIntrinsicKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSIntrinsicKeyword_]
  }
  
  inline def TSLiteralType_(
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_ | TemplateLiteral_ | UnaryExpression_
  ): typings.babelTypes.mod.TSLiteralType_ = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSLiteralType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSLiteralType_]
  }
  
  inline def TSMappedType_(typeParameter: TSTypeParameter_): typings.babelTypes.mod.TSMappedType_ = {
    val __obj = js.Dynamic.literal(typeParameter = typeParameter.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, nameType = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSMappedType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSMappedType_]
  }
  
  inline def TSMethodSignature_(
    computed: Boolean,
    key: Expression,
    kind: method_ | get | set,
    parameters: js.Array[Identifier_ | RestElement_]
  ): typings.babelTypes.mod.TSMethodSignature_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[typings.babelTypes.mod.TSMethodSignature_]
  }
  
  inline def TSModuleBlock_(body: js.Array[Statement]): typings.babelTypes.mod.TSModuleBlock_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSModuleBlock")
    __obj.asInstanceOf[typings.babelTypes.mod.TSModuleBlock_]
  }
  
  inline def TSModuleDeclaration_(
    body: TSModuleBlock_ | typings.babelTypes.mod.TSModuleDeclaration_,
    id: Identifier_ | StringLiteral_
  ): typings.babelTypes.mod.TSModuleDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], declare = null, end = null, global = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSModuleDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSModuleDeclaration_]
  }
  
  inline def TSNamedTupleMember_(elementType: TSType, label: Identifier_, optional: Boolean): typings.babelTypes.mod.TSNamedTupleMember_ = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNamedTupleMember")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNamedTupleMember_]
  }
  
  inline def TSNamespaceExportDeclaration_(id: Identifier_): typings.babelTypes.mod.TSNamespaceExportDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNamespaceExportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNamespaceExportDeclaration_]
  }
  
  inline def TSNeverKeyword_(): typings.babelTypes.mod.TSNeverKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNeverKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNeverKeyword_]
  }
  
  inline def TSNonNullExpression_(expression: Expression): typings.babelTypes.mod.TSNonNullExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNonNullExpression_]
  }
  
  inline def TSNullKeyword_(): typings.babelTypes.mod.TSNullKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNullKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNullKeyword_]
  }
  
  inline def TSNumberKeyword_(): typings.babelTypes.mod.TSNumberKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNumberKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNumberKeyword_]
  }
  
  inline def TSObjectKeyword_(): typings.babelTypes.mod.TSObjectKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSObjectKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSObjectKeyword_]
  }
  
  inline def TSOptionalType_(typeAnnotation: TSType): typings.babelTypes.mod.TSOptionalType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSOptionalType_]
  }
  
  inline def TSParameterProperty_(parameter: Identifier_ | AssignmentPattern_): typings.babelTypes.mod.TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any], accessibility = null, decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, readonly = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSParameterProperty")
    __obj.updateDynamic("override")(null)
    __obj.asInstanceOf[typings.babelTypes.mod.TSParameterProperty_]
  }
  
  inline def TSParenthesizedType_(typeAnnotation: TSType): typings.babelTypes.mod.TSParenthesizedType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSParenthesizedType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSParenthesizedType_]
  }
  
  inline def TSPropertySignature_(computed: Boolean, key: Expression, kind: get | set): typings.babelTypes.mod.TSPropertySignature_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], end = null, initializer = null, innerComments = null, leadingComments = null, loc = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[typings.babelTypes.mod.TSPropertySignature_]
  }
  
  inline def TSQualifiedName_(left: TSEntityName, right: Identifier_): typings.babelTypes.mod.TSQualifiedName_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSQualifiedName")
    __obj.asInstanceOf[typings.babelTypes.mod.TSQualifiedName_]
  }
  
  inline def TSRestType_(typeAnnotation: TSType): typings.babelTypes.mod.TSRestType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSRestType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSRestType_]
  }
  
  inline def TSStringKeyword_(): typings.babelTypes.mod.TSStringKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSStringKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSStringKeyword_]
  }
  
  inline def TSSymbolKeyword_(): typings.babelTypes.mod.TSSymbolKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSSymbolKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSSymbolKeyword_]
  }
  
  inline def TSThisType_(): typings.babelTypes.mod.TSThisType_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSThisType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSThisType_]
  }
  
  inline def TSTupleType_(elementTypes: js.Array[TSType | TSNamedTupleMember_]): typings.babelTypes.mod.TSTupleType_ = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTupleType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTupleType_]
  }
  
  inline def TSTypeAliasDeclaration_(id: Identifier_, typeAnnotation: TSType): typings.babelTypes.mod.TSTypeAliasDeclaration_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeAliasDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeAliasDeclaration_]
  }
  
  inline def TSTypeAnnotation_(typeAnnotation: TSType): typings.babelTypes.mod.TSTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeAnnotation_]
  }
  
  inline def TSTypeAssertion_(expression: Expression, typeAnnotation: TSType): typings.babelTypes.mod.TSTypeAssertion_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeAssertion_]
  }
  
  inline def TSTypeLiteral_(members: js.Array[TSTypeElement]): typings.babelTypes.mod.TSTypeLiteral_ = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeLiteral_]
  }
  
  inline def TSTypeOperator_(operator: String, typeAnnotation: TSType): typings.babelTypes.mod.TSTypeOperator_ = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeOperator")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeOperator_]
  }
  
  inline def TSTypeParameterDeclaration_(params: js.Array[TSTypeParameter_]): typings.babelTypes.mod.TSTypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeParameterDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeParameterDeclaration_]
  }
  
  inline def TSTypeParameterInstantiation_(params: js.Array[TSType]): typings.babelTypes.mod.TSTypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeParameterInstantiation")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeParameterInstantiation_]
  }
  
  inline def TSTypeParameter_(name: String): typings.babelTypes.mod.TSTypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], constraint = null, default = null, end = null, in = null, innerComments = null, leadingComments = null, loc = null, out = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeParameter")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeParameter_]
  }
  
  inline def TSTypePredicate_(parameterName: Identifier_ | TSThisType_): typings.babelTypes.mod.TSTypePredicate_ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], asserts = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypePredicate_]
  }
  
  inline def TSTypeQuery_(exprName: TSEntityName | TSImportType_): typings.babelTypes.mod.TSTypeQuery_ = {
    val __obj = js.Dynamic.literal(exprName = exprName.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeQuery")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeQuery_]
  }
  
  inline def TSTypeReference_(typeName: TSEntityName): typings.babelTypes.mod.TSTypeReference_ = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TSTypeReference")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeReference_]
  }
  
  inline def TSUndefinedKeyword_(): typings.babelTypes.mod.TSUndefinedKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSUndefinedKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSUndefinedKeyword_]
  }
  
  inline def TSUnionType_(types: js.Array[TSType]): typings.babelTypes.mod.TSUnionType_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSUnionType")
    __obj.asInstanceOf[typings.babelTypes.mod.TSUnionType_]
  }
  
  inline def TSUnknownKeyword_(): typings.babelTypes.mod.TSUnknownKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSUnknownKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSUnknownKeyword_]
  }
  
  inline def TSVoidKeyword_(): typings.babelTypes.mod.TSVoidKeyword_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSVoidKeyword")
    __obj.asInstanceOf[typings.babelTypes.mod.TSVoidKeyword_]
  }
  
  inline def TaggedTemplateExpression_(quasi: TemplateLiteral_, tag: Expression): typings.babelTypes.mod.TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TaggedTemplateExpression_]
  }
  
  inline def TemplateElement_(tail: Boolean, value: Cooked): typings.babelTypes.mod.TemplateElement_ = {
    val __obj = js.Dynamic.literal(tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TemplateElement")
    __obj.asInstanceOf[typings.babelTypes.mod.TemplateElement_]
  }
  
  inline def TemplateLiteral_(expressions: js.Array[Expression | TSType], quasis: js.Array[TemplateElement_]): typings.babelTypes.mod.TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.TemplateLiteral_]
  }
  
  inline def ThisExpression_(): typings.babelTypes.mod.ThisExpression_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ThisExpression_]
  }
  
  inline def ThisTypeAnnotation_(): typings.babelTypes.mod.ThisTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThisTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.ThisTypeAnnotation_]
  }
  
  inline def ThrowStatement_(argument: Expression): typings.babelTypes.mod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.ThrowStatement_]
  }
  
  inline def TopicReference_(): typings.babelTypes.mod.TopicReference_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TopicReference")
    __obj.asInstanceOf[typings.babelTypes.mod.TopicReference_]
  }
  
  inline def TryStatement_(block: BlockStatement_): typings.babelTypes.mod.TryStatement_ = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], end = null, finalizer = null, handler = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.TryStatement_]
  }
  
  inline def TupleExpression_(elements: js.Array[Expression | SpreadElement_]): typings.babelTypes.mod.TupleExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TupleExpression_]
  }
  
  inline def TupleTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.mod.TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TupleTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.TupleTypeAnnotation_]
  }
  
  inline def TypeAlias_(id: Identifier_, right: FlowType): typings.babelTypes.mod.TypeAlias_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TypeAlias")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeAlias_]
  }
  
  inline def TypeAnnotation_(typeAnnotation: FlowType): typings.babelTypes.mod.TypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeAnnotation_]
  }
  
  inline def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typings.babelTypes.mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeCastExpression_]
  }
  
  inline def TypeParameterDeclaration_(params: js.Array[TypeParameter_]): typings.babelTypes.mod.TypeParameterDeclaration_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeParameterDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeParameterDeclaration_]
  }
  
  inline def TypeParameterInstantiation_(params: js.Array[FlowType]): typings.babelTypes.mod.TypeParameterInstantiation_ = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeParameterInstantiation")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeParameterInstantiation_]
  }
  
  inline def TypeParameter_(name: String): typings.babelTypes.mod.TypeParameter_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], bound = null, default = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, variance = null)
    __obj.updateDynamic("type")("TypeParameter")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeParameter_]
  }
  
  inline def TypeofTypeAnnotation_(argument: FlowType): typings.babelTypes.mod.TypeofTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeofTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeofTypeAnnotation_]
  }
  
  inline def UnaryExpression_(
    argument: Expression,
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    prefix: Boolean
  ): typings.babelTypes.mod.UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.UnaryExpression_]
  }
  
  inline def UnionTypeAnnotation_(types: js.Array[FlowType]): typings.babelTypes.mod.UnionTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UnionTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.UnionTypeAnnotation_]
  }
  
  inline def UpdateExpression_(argument: Expression, operator: PlussignPlussign | `--`, prefix: Boolean): typings.babelTypes.mod.UpdateExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.UpdateExpression_]
  }
  
  inline def V8IntrinsicIdentifier_(name: String): typings.babelTypes.mod.V8IntrinsicIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("V8IntrinsicIdentifier")
    __obj.asInstanceOf[typings.babelTypes.mod.V8IntrinsicIdentifier_]
  }
  
  inline def VariableDeclaration_(declarations: js.Array[VariableDeclarator_], kind: `var` | let | const): typings.babelTypes.mod.VariableDeclaration_ = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], declare = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.VariableDeclaration_]
  }
  
  inline def VariableDeclarator_(id: LVal): typings.babelTypes.mod.VariableDeclarator_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], definite = null, end = null, init = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[typings.babelTypes.mod.VariableDeclarator_]
  }
  
  inline def Variance_(kind: minus | plus): typings.babelTypes.mod.Variance_ = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Variance")
    __obj.asInstanceOf[typings.babelTypes.mod.Variance_]
  }
  
  inline def VoidTypeAnnotation_(): typings.babelTypes.mod.VoidTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("VoidTypeAnnotation")
    __obj.asInstanceOf[typings.babelTypes.mod.VoidTypeAnnotation_]
  }
  
  inline def WhileStatement_(body: Statement, test: Expression): typings.babelTypes.mod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.WhileStatement_]
  }
  
  inline def WithStatement_(body: Statement, `object`: Expression): typings.babelTypes.mod.WithStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[typings.babelTypes.mod.WithStatement_]
  }
  
  inline def YieldExpression_(delegate: Boolean): typings.babelTypes.mod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.YieldExpression_]
  }
}
