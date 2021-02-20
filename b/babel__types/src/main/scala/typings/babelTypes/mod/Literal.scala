package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BigIntLiteral
import typings.babelTypes.babelTypesStrings.BooleanLiteral
import typings.babelTypes.babelTypesStrings.DecimalLiteral
import typings.babelTypes.babelTypesStrings.NullLiteral
import typings.babelTypes.babelTypesStrings.NumericLiteral
import typings.babelTypes.babelTypesStrings.RegExpLiteral
import typings.babelTypes.babelTypesStrings.StringLiteral
import typings.babelTypes.babelTypesStrings.TemplateLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def BigIntLiteral_(`type`: BigIntLiteral, value: String): typings.babelTypes.mod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.BigIntLiteral_]
  }
  
  @scala.inline
  def BooleanLiteral_(`type`: BooleanLiteral, value: Boolean): typings.babelTypes.mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.BooleanLiteral_]
  }
  
  @scala.inline
  def DecimalLiteral_(`type`: DecimalLiteral, value: String): typings.babelTypes.mod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.DecimalLiteral_]
  }
  
  @scala.inline
  def NullLiteral_(`type`: NullLiteral): typings.babelTypes.mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.NullLiteral_]
  }
  
  @scala.inline
  def NumericLiteral_(`type`: NumericLiteral, value: Double): typings.babelTypes.mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.NumericLiteral_]
  }
  
  @scala.inline
  def RegExpLiteral_(flags: String, pattern: String, `type`: RegExpLiteral): typings.babelTypes.mod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.RegExpLiteral_]
  }
  
  @scala.inline
  def StringLiteral_(`type`: StringLiteral, value: String): typings.babelTypes.mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.StringLiteral_]
  }
  
  @scala.inline
  def TemplateLiteral_(
    expressions: js.Array[Expression | TSType],
    quasis: js.Array[TemplateElement_],
    `type`: TemplateLiteral
  ): typings.babelTypes.mod.TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.TemplateLiteral_]
  }
}
