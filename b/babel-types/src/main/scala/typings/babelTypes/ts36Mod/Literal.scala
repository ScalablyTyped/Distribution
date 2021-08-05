package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.StringLiteral_
  - typings.babelTypes.ts36Mod.NumericLiteral_
  - typings.babelTypes.ts36Mod.BooleanLiteral_
  - typings.babelTypes.ts36Mod.NullLiteral_
  - typings.babelTypes.ts36Mod.RegExpLiteral_
  - typings.babelTypes.ts36Mod.TemplateLiteral_
*/
trait Literal extends StObject
object Literal {
  
  inline def BooleanLiteral_(end: Double, loc: SourceLocation, start: Double, value: Boolean): typings.babelTypes.ts36Mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BooleanLiteral_]
  }
  
  inline def NullLiteral_(end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NullLiteral_]
  }
  
  inline def NumericLiteral_(end: Double, loc: SourceLocation, start: Double, value: Double): typings.babelTypes.ts36Mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NumericLiteral_]
  }
  
  inline def RegExpLiteral_(end: Double, loc: SourceLocation, pattern: String, start: Double): typings.babelTypes.ts36Mod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.RegExpLiteral_]
  }
  
  inline def StringLiteral_(end: Double, loc: SourceLocation, start: Double, value: String): typings.babelTypes.ts36Mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.StringLiteral_]
  }
  
  inline def TemplateLiteral_(
    end: Double,
    expressions: js.Array[Expression],
    loc: SourceLocation,
    quasis: js.Array[TemplateElement_],
    start: Double
  ): typings.babelTypes.ts36Mod.TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TemplateLiteral_]
  }
}
