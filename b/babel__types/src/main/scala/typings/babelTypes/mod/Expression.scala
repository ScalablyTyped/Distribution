package typings.babelTypes.mod

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
  - typings.babelTypes.mod.ArrayExpression_
  - typings.babelTypes.mod.AssignmentExpression_
  - typings.babelTypes.mod.BinaryExpression_
  - typings.babelTypes.mod.CallExpression_
  - typings.babelTypes.mod.ConditionalExpression_
  - typings.babelTypes.mod.FunctionExpression_
  - typings.babelTypes.mod.Identifier_
  - typings.babelTypes.mod.StringLiteral_
  - typings.babelTypes.mod.NumericLiteral_
  - typings.babelTypes.mod.NullLiteral_
  - typings.babelTypes.mod.BooleanLiteral_
  - typings.babelTypes.mod.RegExpLiteral_
  - typings.babelTypes.mod.LogicalExpression_
  - typings.babelTypes.mod.MemberExpression_
  - typings.babelTypes.mod.NewExpression_
  - typings.babelTypes.mod.ObjectExpression_
  - typings.babelTypes.mod.SequenceExpression_
  - typings.babelTypes.mod.ParenthesizedExpression_
  - typings.babelTypes.mod.ThisExpression_
  - typings.babelTypes.mod.UnaryExpression_
  - typings.babelTypes.mod.UpdateExpression_
  - typings.babelTypes.mod.ArrowFunctionExpression_
  - typings.babelTypes.mod.ClassExpression_
  - typings.babelTypes.mod.MetaProperty_
  - typings.babelTypes.mod.Super_
  - typings.babelTypes.mod.TaggedTemplateExpression_
  - typings.babelTypes.mod.TemplateLiteral_
  - typings.babelTypes.mod.YieldExpression_
  - typings.babelTypes.mod.AwaitExpression_
  - typings.babelTypes.mod.Import_
  - typings.babelTypes.mod.BigIntLiteral_
  - typings.babelTypes.mod.OptionalMemberExpression_
  - typings.babelTypes.mod.OptionalCallExpression_
  - typings.babelTypes.mod.TypeCastExpression_
  - typings.babelTypes.mod.JSXElement_
  - typings.babelTypes.mod.JSXFragment_
  - typings.babelTypes.mod.BindExpression_
  - typings.babelTypes.mod.PipelinePrimaryTopicReference_
  - typings.babelTypes.mod.DoExpression_
  - typings.babelTypes.mod.RecordExpression_
  - typings.babelTypes.mod.TupleExpression_
  - typings.babelTypes.mod.DecimalLiteral_
  - typings.babelTypes.mod.TSAsExpression_
  - typings.babelTypes.mod.TSTypeAssertion_
  - typings.babelTypes.mod.TSNonNullExpression_
*/
trait Expression
  extends StObject
     with _Node
object Expression {
  
  @scala.inline
  def ArrayExpression_(elements: js.Array[Null | Expression | SpreadElement_]): typings.babelTypes.mod.ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ArrayExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrayExpression_]
  }
  
  @scala.inline
  def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): typings.babelTypes.mod.ArrowFunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ArrowFunctionExpression_]
  }
  
  @scala.inline
  def AssignmentExpression_(left: LVal, operator: String, right: Expression): typings.babelTypes.mod.AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AssignmentExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.AssignmentExpression_]
  }
  
  @scala.inline
  def AwaitExpression_(argument: Expression): typings.babelTypes.mod.AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.AwaitExpression_]
  }
  
  @scala.inline
  def BigIntLiteral_(value: String): typings.babelTypes.mod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.BigIntLiteral_]
  }
  
  @scala.inline
  def BinaryExpression_(
    left: Expression | PrivateName_,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | typings.babelTypes.babelTypesStrings.^ | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression
  ): typings.babelTypes.mod.BinaryExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.BinaryExpression_]
  }
  
  @scala.inline
  def BindExpression_(callee: Expression, `object`: Expression): typings.babelTypes.mod.BindExpression_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BindExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.BindExpression_]
  }
  
  @scala.inline
  def BooleanLiteral_(value: Boolean): typings.babelTypes.mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.BooleanLiteral_]
  }
  
  @scala.inline
  def CallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | V8IntrinsicIdentifier_
  ): typings.babelTypes.mod.CallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.CallExpression_]
  }
  
  @scala.inline
  def ClassExpression_(body: ClassBody_): typings.babelTypes.mod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], decorators = null, end = null, id = null, implements = null, innerComments = null, leadingComments = null, loc = null, mixins = null, start = null, superClass = null, superTypeParameters = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ClassExpression_]
  }
  
  @scala.inline
  def ConditionalExpression_(alternate: Expression, consequent: Expression, test: Expression): typings.babelTypes.mod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ConditionalExpression_]
  }
  
  @scala.inline
  def DecimalLiteral_(value: String): typings.babelTypes.mod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.DecimalLiteral_]
  }
  
  @scala.inline
  def DoExpression_(body: BlockStatement_): typings.babelTypes.mod.DoExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DoExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.DoExpression_]
  }
  
  @scala.inline
  def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_]
  ): typings.babelTypes.mod.FunctionExpression_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], end = null, id = null, innerComments = null, leadingComments = null, loc = null, returnType = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.FunctionExpression_]
  }
  
  @scala.inline
  def Identifier_(name: String): typings.babelTypes.mod.Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.babelTypes.mod.Identifier_]
  }
  
  @scala.inline
  def Import_(): typings.babelTypes.mod.Import_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[typings.babelTypes.mod.Import_]
  }
  
  @scala.inline
  def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typings.babelTypes.mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_
  ): typings.babelTypes.mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], closingElement = null, end = null, innerComments = null, leadingComments = null, loc = null, selfClosing = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[typings.babelTypes.mod.JSXElement_]
  }
  
  @scala.inline
  def JSXFragment_(
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
  
  @scala.inline
  def LogicalExpression_(
    left: Expression,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: Expression
  ): typings.babelTypes.mod.LogicalExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.LogicalExpression_]
  }
  
  @scala.inline
  def MemberExpression_(computed: Boolean, `object`: Expression, property: Expression | Identifier_ | PrivateName_): typings.babelTypes.mod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.MemberExpression_]
  }
  
  @scala.inline
  def MetaProperty_(meta: Identifier_, property: Identifier_): typings.babelTypes.mod.MetaProperty_ = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.MetaProperty_]
  }
  
  @scala.inline
  def NewExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_ | ArgumentPlaceholder_],
    callee: Expression | V8IntrinsicIdentifier_
  ): typings.babelTypes.mod.NewExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("NewExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.NewExpression_]
  }
  
  @scala.inline
  def NullLiteral_(): typings.babelTypes.mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.NullLiteral_]
  }
  
  @scala.inline
  def NumericLiteral_(value: Double): typings.babelTypes.mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.NumericLiteral_]
  }
  
  @scala.inline
  def ObjectExpression_(properties: js.Array[ObjectMethod_ | ObjectProperty_ | SpreadElement_]): typings.babelTypes.mod.ObjectExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectExpression_]
  }
  
  @scala.inline
  def OptionalCallExpression_(
    arguments: js.Array[Expression | SpreadElement_ | JSXNamespacedName_],
    callee: Expression,
    optional: Boolean
  ): typings.babelTypes.mod.OptionalCallExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeArguments = null, typeParameters = null)
    __obj.updateDynamic("type")("OptionalCallExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.OptionalCallExpression_]
  }
  
  @scala.inline
  def OptionalMemberExpression_(computed: Boolean, `object`: Expression, optional: Boolean, property: Expression | Identifier_): typings.babelTypes.mod.OptionalMemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalMemberExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.OptionalMemberExpression_]
  }
  
  @scala.inline
  def ParenthesizedExpression_(expression: Expression): typings.babelTypes.mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ParenthesizedExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ParenthesizedExpression_]
  }
  
  @scala.inline
  def PipelinePrimaryTopicReference_(): typings.babelTypes.mod.PipelinePrimaryTopicReference_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("PipelinePrimaryTopicReference")
    __obj.asInstanceOf[typings.babelTypes.mod.PipelinePrimaryTopicReference_]
  }
  
  @scala.inline
  def RecordExpression_(properties: js.Array[ObjectProperty_ | SpreadElement_]): typings.babelTypes.mod.RecordExpression_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RecordExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.RecordExpression_]
  }
  
  @scala.inline
  def RegExpLiteral_(flags: String, pattern: String): typings.babelTypes.mod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.RegExpLiteral_]
  }
  
  @scala.inline
  def SequenceExpression_(expressions: js.Array[Expression]): typings.babelTypes.mod.SequenceExpression_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("SequenceExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.SequenceExpression_]
  }
  
  @scala.inline
  def StringLiteral_(value: String): typings.babelTypes.mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.StringLiteral_]
  }
  
  @scala.inline
  def Super_(): typings.babelTypes.mod.Super_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Super")
    __obj.asInstanceOf[typings.babelTypes.mod.Super_]
  }
  
  @scala.inline
  def TSAsExpression_(expression: Expression, typeAnnotation: TSType): typings.babelTypes.mod.TSAsExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSAsExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TSAsExpression_]
  }
  
  @scala.inline
  def TSNonNullExpression_(expression: Expression): typings.babelTypes.mod.TSNonNullExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSNonNullExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TSNonNullExpression_]
  }
  
  @scala.inline
  def TSTypeAssertion_(expression: Expression, typeAnnotation: TSType): typings.babelTypes.mod.TSTypeAssertion_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeAssertion")
    __obj.asInstanceOf[typings.babelTypes.mod.TSTypeAssertion_]
  }
  
  @scala.inline
  def TaggedTemplateExpression_(quasi: TemplateLiteral_, tag: Expression): typings.babelTypes.mod.TaggedTemplateExpression_ = {
    val __obj = js.Dynamic.literal(quasi = quasi.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeParameters = null)
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TaggedTemplateExpression_]
  }
  
  @scala.inline
  def TemplateLiteral_(expressions: js.Array[Expression | TSType], quasis: js.Array[TemplateElement_]): typings.babelTypes.mod.TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.TemplateLiteral_]
  }
  
  @scala.inline
  def ThisExpression_(): typings.babelTypes.mod.ThisExpression_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ThisExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.ThisExpression_]
  }
  
  @scala.inline
  def TupleExpression_(elements: js.Array[Expression | SpreadElement_]): typings.babelTypes.mod.TupleExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TupleExpression_]
  }
  
  @scala.inline
  def TypeCastExpression_(expression: Expression, typeAnnotation: TypeAnnotation_): typings.babelTypes.mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TypeCastExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.TypeCastExpression_]
  }
  
  @scala.inline
  def UnaryExpression_(
    argument: Expression,
    operator: void | `throw` | delete | Exclamationmark | Plussign | `-_` | Tilde | typeof,
    prefix: Boolean
  ): typings.babelTypes.mod.UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.UnaryExpression_]
  }
  
  @scala.inline
  def UpdateExpression_(argument: Expression, operator: PlussignPlussign | `--`, prefix: Boolean): typings.babelTypes.mod.UpdateExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("UpdateExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.UpdateExpression_]
  }
  
  @scala.inline
  def YieldExpression_(delegate: Boolean): typings.babelTypes.mod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], argument = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.babelTypes.mod.YieldExpression_]
  }
}
