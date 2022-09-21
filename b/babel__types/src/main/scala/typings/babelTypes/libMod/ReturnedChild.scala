package typings.babelTypes.libMod

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
import typings.babelTypes.babelTypesStrings.VerticallineGreaterthansign
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
  - typings.babelTypes.libMod.JSXSpreadChild
  - typings.babelTypes.libMod.JSXElement
  - typings.babelTypes.libMod.JSXFragment
  - typings.babelTypes.libMod.Expression
*/
trait ReturnedChild extends StObject
object ReturnedChild {
  
  inline def ArrayExpression_(elements: js.Array[Null | Expression | SpreadElement_]): typings.babelTypes.libMod.ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ArrayExpression_]
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
  
  inline def BooleanLiteral_(value: Boolean): typings.babelTypes.libMod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.BooleanLiteral_]
  }
  
  inline def CallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): typings.babelTypes.libMod.CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.CallExpression_]
  }
  
  inline def ClassExpression_(body: ClassBody_): typings.babelTypes.libMod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassExpression_]
  }
  
  inline def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression): typings.babelTypes.libMod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ConditionalExpression_]
  }
  
  inline def DecimalLiteral_(value: String): typings.babelTypes.libMod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.DecimalLiteral_]
  }
  
  inline def DoExpression_(async: Boolean, body: BlockStatement_): typings.babelTypes.libMod.DoExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.DoExpression_]
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
  
  inline def Identifier_(name: String): typings.babelTypes.libMod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.Identifier_]
  }
  
  inline def Import_(): typings.babelTypes.libMod.Import_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[typings.babelTypes.libMod.Import_]
  }
  
  inline def JSXElement(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | typings.babelTypes.libMod.JSXElement | JSXFragment
    ],
    openingElement: JSXOpeningElement
  ): typings.babelTypes.libMod.JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXElement]
  }
  
  inline def JSXFragment(
    children: js.Array[
      JSXText | JSXExpressionContainer | JSXSpreadChild | JSXElement | typings.babelTypes.libMod.JSXFragment
    ],
    closingFragment: JSXClosingFragment,
    openingFragment: JSXOpeningFragment
  ): typings.babelTypes.libMod.JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXFragment]
  }
  
  inline def JSXSpreadChild(expression: Expression): typings.babelTypes.libMod.JSXSpreadChild = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXSpreadChild")
    __obj.asInstanceOf[typings.babelTypes.libMod.JSXSpreadChild]
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
  
  inline def ModuleExpression_(body: Program_): typings.babelTypes.libMod.ModuleExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ModuleExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ModuleExpression_]
  }
  
  inline def NewExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName | ArgumentPlaceholder_],
    callee: Expression | Super_ | V8IntrinsicIdentifier_
  ): typings.babelTypes.libMod.NewExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.NewExpression_]
  }
  
  inline def NullLiteral_(): typings.babelTypes.libMod.NullLiteral_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.NullLiteral_]
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
  
  inline def OptionalCallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName | ArgumentPlaceholder_],
    callee: Expression,
    optional: Boolean
  ): typings.babelTypes.libMod.OptionalCallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.OptionalCallExpression_]
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
  
  inline def SequenceExpression_(expressions: js.Array[Expression]): typings.babelTypes.libMod.SequenceExpression_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.SequenceExpression_]
  }
  
  inline def StringLiteral_(value: String): typings.babelTypes.libMod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.StringLiteral_]
  }
  
  inline def Super_(): typings.babelTypes.libMod.Super_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[typings.babelTypes.libMod.Super_]
  }
  
  inline def TSAsExpression(expression: Expression, typeAnnotation: TSType): typings.babelTypes.libMod.TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSAsExpression]
  }
  
  inline def TSInstantiationExpression(expression: Expression): typings.babelTypes.libMod.TSInstantiationExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSInstantiationExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSInstantiationExpression]
  }
  
  inline def TSNonNullExpression(expression: Expression): typings.babelTypes.libMod.TSNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSNonNullExpression]
  }
  
  inline def TSTypeAssertion(expression: Expression, typeAnnotation: TSType): typings.babelTypes.libMod.TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typings.babelTypes.libMod.TSTypeAssertion]
  }
  
  inline def TaggedTemplateExpression_(quasi: TemplateLiteral_, tag: Expression): typings.babelTypes.libMod.TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TaggedTemplateExpression_]
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
  
  inline def TopicReference_(): typings.babelTypes.libMod.TopicReference_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TopicReference")
    __obj.asInstanceOf[typings.babelTypes.libMod.TopicReference_]
  }
  
  inline def TupleExpression_(elements: js.Array[Expression | SpreadElement_]): typings.babelTypes.libMod.TupleExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TupleExpression_]
  }
  
  inline def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typings.babelTypes.libMod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.TypeCastExpression_]
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
  
  inline def UpdateExpression_(argument: Expression, operator: PlussignPlussign | `--`, prefix: Boolean): typings.babelTypes.libMod.UpdateExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.UpdateExpression_]
  }
  
  inline def YieldExpression_(delegate: Boolean): typings.babelTypes.libMod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.YieldExpression_]
  }
}
