package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ArrowFunctionExpression
import typings.babelTypes.babelTypesStrings.BigIntLiteral
import typings.babelTypes.babelTypesStrings.BooleanLiteral
import typings.babelTypes.babelTypesStrings.DecimalLiteral
import typings.babelTypes.babelTypesStrings.FunctionDeclaration
import typings.babelTypes.babelTypesStrings.FunctionExpression
import typings.babelTypes.babelTypesStrings.NullLiteral
import typings.babelTypes.babelTypesStrings.NumericLiteral
import typings.babelTypes.babelTypesStrings.RegExpLiteral
import typings.babelTypes.babelTypesStrings.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.FunctionDeclaration_
  - typings.babelTypes.indexTs37Mod.FunctionExpression_
  - typings.babelTypes.indexTs37Mod.StringLiteral_
  - typings.babelTypes.indexTs37Mod.NumericLiteral_
  - typings.babelTypes.indexTs37Mod.NullLiteral_
  - typings.babelTypes.indexTs37Mod.BooleanLiteral_
  - typings.babelTypes.indexTs37Mod.RegExpLiteral_
  - typings.babelTypes.indexTs37Mod.ArrowFunctionExpression_
  - typings.babelTypes.indexTs37Mod.BigIntLiteral_
  - typings.babelTypes.indexTs37Mod.DecimalLiteral_
*/
trait Pureish extends _Node
object Pureish {
  
  @scala.inline
  def BooleanLiteral_(`type`: BooleanLiteral, value: Boolean): Pureish = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def FunctionDeclaration_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: FunctionDeclaration
  ): Pureish = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def DecimalLiteral_(`type`: DecimalLiteral, value: String): Pureish = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def StringLiteral_(`type`: StringLiteral, value: String): Pureish = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def ArrowFunctionExpression_(
    async: Boolean,
    body: BlockStatement_ | Expression,
    expression: Boolean,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: ArrowFunctionExpression
  ): Pureish = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def RegExpLiteral_(flags: String, pattern: String, `type`: RegExpLiteral): Pureish = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def NumericLiteral_(`type`: NumericLiteral, value: Double): Pureish = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def BigIntLiteral_(`type`: BigIntLiteral, value: String): Pureish = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def NullLiteral_(`type`: NullLiteral): Pureish = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
  
  @scala.inline
  def FunctionExpression_(
    async: Boolean,
    body: BlockStatement_,
    generator: Boolean,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: FunctionExpression
  ): Pureish = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pureish]
  }
}
