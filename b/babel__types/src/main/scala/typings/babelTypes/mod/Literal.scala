package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BigIntLiteral
import typings.babelTypes.babelTypesStrings.BooleanLiteral
import typings.babelTypes.babelTypesStrings.DecimalLiteral
import typings.babelTypes.babelTypesStrings.NullLiteral
import typings.babelTypes.babelTypesStrings.NumericLiteral
import typings.babelTypes.babelTypesStrings.RegExpLiteral
import typings.babelTypes.babelTypesStrings.StringLiteral
import typings.babelTypes.babelTypesStrings.TemplateLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.StringLiteral_
  - typings.babelTypes.mod.NumericLiteral_
  - typings.babelTypes.mod.NullLiteral_
  - typings.babelTypes.mod.BooleanLiteral_
  - typings.babelTypes.mod.RegExpLiteral_
  - typings.babelTypes.mod.TemplateLiteral_
  - typings.babelTypes.mod.BigIntLiteral_
  - typings.babelTypes.mod.DecimalLiteral_
*/
trait Literal extends _Node

object Literal {
  @scala.inline
  def DecimalLiteral_(`type`: DecimalLiteral, value: String): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def RegExpLiteral_(flags: String, pattern: String, `type`: RegExpLiteral): Literal = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def NullLiteral_(`type`: NullLiteral): Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def BooleanLiteral_(`type`: BooleanLiteral, value: Boolean): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def BigIntLiteral_(`type`: BigIntLiteral, value: String): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def NumericLiteral_(`type`: NumericLiteral, value: Double): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def StringLiteral_(`type`: StringLiteral, value: String): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def TemplateLiteral_(expressions: js.Array[Expression], quasis: js.Array[TemplateElement_], `type`: TemplateLiteral): Literal = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

