package typings.babelTypes.indexTs37Mod

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.StringLiteral_
  - typings.babelTypes.indexTs37Mod.NumericLiteral_
  - typings.babelTypes.indexTs37Mod.NullLiteral_
  - typings.babelTypes.indexTs37Mod.BooleanLiteral_
  - typings.babelTypes.indexTs37Mod.RegExpLiteral_
  - typings.babelTypes.indexTs37Mod.TemplateLiteral_
  - typings.babelTypes.indexTs37Mod.BigIntLiteral_
  - typings.babelTypes.indexTs37Mod.DecimalLiteral_
*/
trait Literal extends _Node
object Literal {
  
  @scala.inline
  def BooleanLiteral_(`type`: BooleanLiteral, value: Boolean): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  
  @scala.inline
  def DecimalLiteral_(`type`: DecimalLiteral, value: String): Literal = {
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
  def RegExpLiteral_(flags: String, pattern: String, `type`: RegExpLiteral): Literal = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
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
  def BigIntLiteral_(`type`: BigIntLiteral, value: String): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  
  @scala.inline
  def TemplateLiteral_(
    expressions: js.Array[Expression | TSType],
    quasis: js.Array[TemplateElement_],
    `type`: TemplateLiteral
  ): Literal = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  
  @scala.inline
  def NullLiteral_(`type`: NullLiteral): Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}
