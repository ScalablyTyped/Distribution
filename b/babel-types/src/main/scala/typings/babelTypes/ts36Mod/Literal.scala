package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.BooleanLiteral
import typings.babelTypes.babelTypesStrings.NullLiteral
import typings.babelTypes.babelTypesStrings.NumericLiteral
import typings.babelTypes.babelTypesStrings.RegExpLiteral
import typings.babelTypes.babelTypesStrings.StringLiteral
import typings.babelTypes.babelTypesStrings.TemplateLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.StringLiteral_
  - typings.babelTypes.ts36Mod.NumericLiteral_
  - typings.babelTypes.ts36Mod.BooleanLiteral_
  - typings.babelTypes.ts36Mod.NullLiteral_
  - typings.babelTypes.ts36Mod.RegExpLiteral_
  - typings.babelTypes.ts36Mod.TemplateLiteral_
*/
trait Literal extends js.Object
object Literal {
  
  @scala.inline
  def RegExpLiteral_(end: Double, loc: SourceLocation, pattern: String, start: Double, `type`: RegExpLiteral): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  
  @scala.inline
  def NullLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: NullLiteral): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  
  @scala.inline
  def StringLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: StringLiteral, value: String): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  
  @scala.inline
  def BooleanLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: BooleanLiteral, value: Boolean): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  
  @scala.inline
  def NumericLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: NumericLiteral, value: Double): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  
  @scala.inline
  def TemplateLiteral_(
    end: Double,
    expressions: js.Array[Expression],
    loc: SourceLocation,
    quasis: js.Array[TemplateElement_],
    start: Double,
    `type`: TemplateLiteral
  ): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}
