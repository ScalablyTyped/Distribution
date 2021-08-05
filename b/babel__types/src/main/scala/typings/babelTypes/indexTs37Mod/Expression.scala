package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.Ampersand
import typings.babelTypes.babelTypesStrings.AmpersandAmpersand
import typings.babelTypes.babelTypesStrings.Asterisk
import typings.babelTypes.babelTypesStrings.AsteriskAsterisk
import typings.babelTypes.babelTypesStrings.EqualssignEqualssign
import typings.babelTypes.babelTypesStrings.EqualssignEqualssignEqualssign
import typings.babelTypes.babelTypesStrings.Exclamationmark
import typings.babelTypes.babelTypesStrings.ExclamationmarkEqualssign
import typings.babelTypes.babelTypesStrings.ExclamationmarkEqualssignEqualssign
import typings.babelTypes.babelTypesStrings.Greaterthansign
import typings.babelTypes.babelTypesStrings.GreaterthansignEqualssign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.babelTypes.babelTypesStrings.Lessthansign
import typings.babelTypes.babelTypesStrings.LessthansignEqualssign
import typings.babelTypes.babelTypesStrings.LessthansignLessthansign
import typings.babelTypes.babelTypesStrings.Percentsign
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.PlussignPlussign
import typings.babelTypes.babelTypesStrings.QuestionmarkQuestionmark
import typings.babelTypes.babelTypesStrings.Slash
import typings.babelTypes.babelTypesStrings.Tilde
import typings.babelTypes.babelTypesStrings.Verticalline
import typings.babelTypes.babelTypesStrings.VerticallineVerticalline
import typings.babelTypes.babelTypesStrings.`--`
import typings.babelTypes.babelTypesStrings.`-_`
import typings.babelTypes.babelTypesStrings.`throw`
import typings.babelTypes.babelTypesStrings.delete
import typings.babelTypes.babelTypesStrings.in
import typings.babelTypes.babelTypesStrings.instanceof
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.ArrayExpression_
  - typings.babelTypes.indexTs37Mod.AssignmentExpression_
  - typings.babelTypes.indexTs37Mod.BinaryExpression_
  - typings.babelTypes.indexTs37Mod.CallExpression_
  - typings.babelTypes.indexTs37Mod.ConditionalExpression_
  - typings.babelTypes.indexTs37Mod.FunctionExpression_
  - typings.babelTypes.indexTs37Mod.Identifier_
  - typings.babelTypes.indexTs37Mod.StringLiteral_
  - typings.babelTypes.indexTs37Mod.NumericLiteral_
  - typings.babelTypes.indexTs37Mod.NullLiteral_
  - typings.babelTypes.indexTs37Mod.BooleanLiteral_
  - typings.babelTypes.indexTs37Mod.RegExpLiteral_
  - typings.babelTypes.indexTs37Mod.LogicalExpression_
  - typings.babelTypes.indexTs37Mod.MemberExpression_
  - typings.babelTypes.indexTs37Mod.NewExpression_
  - typings.babelTypes.indexTs37Mod.ObjectExpression_
  - typings.babelTypes.indexTs37Mod.SequenceExpression_
  - typings.babelTypes.indexTs37Mod.ParenthesizedExpression_
  - typings.babelTypes.indexTs37Mod.ThisExpression_
  - typings.babelTypes.indexTs37Mod.UnaryExpression_
  - typings.babelTypes.indexTs37Mod.UpdateExpression_
  - typings.babelTypes.indexTs37Mod.ArrowFunctionExpression_
  - typings.babelTypes.indexTs37Mod.ClassExpression_
  - typings.babelTypes.indexTs37Mod.MetaProperty_
  - typings.babelTypes.indexTs37Mod.Super_
  - typings.babelTypes.indexTs37Mod.TaggedTemplateExpression_
  - typings.babelTypes.indexTs37Mod.TemplateLiteral_
  - typings.babelTypes.indexTs37Mod.YieldExpression_
  - typings.babelTypes.indexTs37Mod.AwaitExpression_
  - typings.babelTypes.indexTs37Mod.Import_
  - typings.babelTypes.indexTs37Mod.BigIntLiteral_
  - typings.babelTypes.indexTs37Mod.OptionalMemberExpression_
  - typings.babelTypes.indexTs37Mod.OptionalCallExpression_
  - typings.babelTypes.indexTs37Mod.TypeCastExpression_
  - typings.babelTypes.indexTs37Mod.JSXElement_
  - typings.babelTypes.indexTs37Mod.JSXFragment_
  - typings.babelTypes.indexTs37Mod.BindExpression_
  - typings.babelTypes.indexTs37Mod.PipelinePrimaryTopicReference_
  - typings.babelTypes.indexTs37Mod.DoExpression_
  - typings.babelTypes.indexTs37Mod.RecordExpression_
  - typings.babelTypes.indexTs37Mod.TupleExpression_
  - typings.babelTypes.indexTs37Mod.DecimalLiteral_
  - typings.babelTypes.indexTs37Mod.TSAsExpression_
  - typings.babelTypes.indexTs37Mod.TSTypeAssertion_
  - typings.babelTypes.indexTs37Mod.TSNonNullExpression_
*/
trait Expression
  extends StObject
     with _Node
object Expression {
  
  inline def ArrayExpression_(elements: js.Array[Null | Expression | SpreadElement_]): typings.babelTypes.indexTs37Mod.ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ArrayExpression_]
  }
  
  inline def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): typings.babelTypes.indexTs37Mod.ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ArrowFunctionExpression_]
  }
  
  inline def AssignmentExpression_(left: LVal, operator: String, right: Expression): typings.babelTypes.indexTs37Mod.AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.AssignmentExpression_]
  }
  
  inline def AwaitExpression_(argument: Expression): typings.babelTypes.indexTs37Mod.AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.AwaitExpression_]
  }
  
  inline def BigIntLiteral_(value: String): typings.babelTypes.indexTs37Mod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.BigIntLiteral_]
  }
  
  inline def BinaryExpression_(
    left: Expression | PrivateName_,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typings.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression
  ): typings.babelTypes.indexTs37Mod.BinaryExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.BinaryExpression_]
  }
  
  inline def BindExpression_(callee: Expression, `object`: Expression): typings.babelTypes.indexTs37Mod.BindExpression_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BindExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.BindExpression_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typings.babelTypes.indexTs37Mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.BooleanLiteral_]
  }
  
  inline def CallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | V8IntrinsicIdentifier_
  ): typings.babelTypes.indexTs37Mod.CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.CallExpression_]
  }
  
  inline def ClassExpression_(body: ClassBody_): typings.babelTypes.indexTs37Mod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], decorators = null, end = null, id = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, superClass = null, superTypeParameters = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ClassExpression_]
  }
  
  inline def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression): typings.babelTypes.indexTs37Mod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ConditionalExpression_]
  }
  
  inline def DecimalLiteral_(value: String): typings.babelTypes.indexTs37Mod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.DecimalLiteral_]
  }
  
  inline def DoExpression_(body: BlockStatement_): typings.babelTypes.indexTs37Mod.DoExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.DoExpression_]
  }
  
  inline def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): typings.babelTypes.indexTs37Mod.FunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], end = null, id = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.FunctionExpression_]
  }
  
  inline def Identifier_(name: String): typings.babelTypes.indexTs37Mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.Identifier_]
  }
  
  inline def Import_(): typings.babelTypes.indexTs37Mod.Import_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.Import_]
  }
  
  inline def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typings.babelTypes.indexTs37Mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_
  ): typings.babelTypes.indexTs37Mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null, end = null, innerComments = null, leadingComments = null, loc = null, selfClosing = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXElement_]
  }
  
  inline def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typings.babelTypes.indexTs37Mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_
  ): typings.babelTypes.indexTs37Mod.JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.JSXFragment_]
  }
  
  inline def LogicalExpression_(
    left: Expression,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: Expression
  ): typings.babelTypes.indexTs37Mod.LogicalExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.LogicalExpression_]
  }
  
  inline def MemberExpression_(computed: Boolean, `object`: Expression, property: Expression | Identifier_ | PrivateName_): typings.babelTypes.indexTs37Mod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.MemberExpression_]
  }
  
  inline def MetaProperty_(meta: Identifier_, property: Identifier_): typings.babelTypes.indexTs37Mod.MetaProperty_ = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.MetaProperty_]
  }
  
  inline def NewExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | V8IntrinsicIdentifier_
  ): typings.babelTypes.indexTs37Mod.NewExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.NewExpression_]
  }
  
  inline def NullLiteral_(): typings.babelTypes.indexTs37Mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.NullLiteral_]
  }
  
  inline def NumericLiteral_(value: Double): typings.babelTypes.indexTs37Mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.NumericLiteral_]
  }
  
  inline def ObjectExpression_(properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]): typings.babelTypes.indexTs37Mod.ObjectExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ObjectExpression_]
  }
  
  inline def OptionalCallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_],
    callee: Expression,
    optional: Boolean
  ): typings.babelTypes.indexTs37Mod.OptionalCallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.OptionalCallExpression_]
  }
  
  inline def OptionalMemberExpression_(computed: Boolean, `object`: Expression, optional: Boolean, property: Expression | Identifier_): typings.babelTypes.indexTs37Mod.OptionalMemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalMemberExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.OptionalMemberExpression_]
  }
  
  inline def ParenthesizedExpression_(expression: Expression): typings.babelTypes.indexTs37Mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ParenthesizedExpression_]
  }
  
  inline def PipelinePrimaryTopicReference_(): typings.babelTypes.indexTs37Mod.PipelinePrimaryTopicReference_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PipelinePrimaryTopicReference")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.PipelinePrimaryTopicReference_]
  }
  
  inline def RecordExpression_(properties: js.Array[ObjectProperty_ | SpreadElement_]): typings.babelTypes.indexTs37Mod.RecordExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RecordExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.RecordExpression_]
  }
  
  inline def RegExpLiteral_(flags: String, pattern: String): typings.babelTypes.indexTs37Mod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.RegExpLiteral_]
  }
  
  inline def SequenceExpression_(expressions: js.Array[Expression]): typings.babelTypes.indexTs37Mod.SequenceExpression_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.SequenceExpression_]
  }
  
  inline def StringLiteral_(value: String): typings.babelTypes.indexTs37Mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.StringLiteral_]
  }
  
  inline def Super_(): typings.babelTypes.indexTs37Mod.Super_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.Super_]
  }
  
  inline def TSAsExpression_(expression: Expression, typeAnnotation: TSType): typings.babelTypes.indexTs37Mod.TSAsExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TSAsExpression_]
  }
  
  inline def TSNonNullExpression_(expression: Expression): typings.babelTypes.indexTs37Mod.TSNonNullExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TSNonNullExpression_]
  }
  
  inline def TSTypeAssertion_(expression: Expression, typeAnnotation: TSType): typings.babelTypes.indexTs37Mod.TSTypeAssertion_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TSTypeAssertion_]
  }
  
  inline def TaggedTemplateExpression_(quasi: TemplateLiteral_, tag: Expression): typings.babelTypes.indexTs37Mod.TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TaggedTemplateExpression_]
  }
  
  inline def TemplateLiteral_(expressions: js.Array[Expression | TSType], quasis: js.Array[TemplateElement_]): typings.babelTypes.indexTs37Mod.TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TemplateLiteral_]
  }
  
  inline def ThisExpression_(): typings.babelTypes.indexTs37Mod.ThisExpression_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ThisExpression_]
  }
  
  inline def TupleExpression_(elements: js.Array[Expression | SpreadElement_]): typings.babelTypes.indexTs37Mod.TupleExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TupleExpression_]
  }
  
  inline def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typings.babelTypes.indexTs37Mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.TypeCastExpression_]
  }
  
  inline def UnaryExpression_(
    argument: Expression,
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    prefix: Boolean
  ): typings.babelTypes.indexTs37Mod.UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.UnaryExpression_]
  }
  
  inline def UpdateExpression_(argument: Expression, operator: PlussignPlussign | `--`, prefix: Boolean): typings.babelTypes.indexTs37Mod.UpdateExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.UpdateExpression_]
  }
  
  inline def YieldExpression_(delegate: Boolean): typings.babelTypes.indexTs37Mod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.YieldExpression_]
  }
}
