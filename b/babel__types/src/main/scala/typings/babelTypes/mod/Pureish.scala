package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.FunctionDeclaration_
  - typings.babelTypes.mod.FunctionExpression_
  - typings.babelTypes.mod.StringLiteral_
  - typings.babelTypes.mod.NumericLiteral_
  - typings.babelTypes.mod.NullLiteral_
  - typings.babelTypes.mod.BooleanLiteral_
  - typings.babelTypes.mod.RegExpLiteral_
  - typings.babelTypes.mod.ArrowFunctionExpression_
  - typings.babelTypes.mod.BigIntLiteral_
  - typings.babelTypes.mod.DecimalLiteral_
*/
trait Pureish
  extends StObject
     with _Node
object Pureish {
  
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
  def BigIntLiteral_(value: String): typings.babelTypes.mod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.BigIntLiteral_]
  }
  
  @scala.inline
  def BooleanLiteral_(value: Boolean): typings.babelTypes.mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.BooleanLiteral_]
  }
  
  @scala.inline
  def DecimalLiteral_(value: String): typings.babelTypes.mod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.DecimalLiteral_]
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
  def RegExpLiteral_(flags: String, pattern: String): typings.babelTypes.mod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.RegExpLiteral_]
  }
  
  @scala.inline
  def StringLiteral_(value: String): typings.babelTypes.mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.babelTypes.mod.StringLiteral_]
  }
}
