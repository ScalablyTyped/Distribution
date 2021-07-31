package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.Exclamationmark
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.Tilde
import typings.babelTypes.babelTypesStrings.`-_`
import typings.babelTypes.babelTypesStrings.delete
import typings.babelTypes.babelTypesStrings.typeof
import typings.babelTypes.babelTypesStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.UnaryExpression_
  - typings.babelTypes.ts36Mod.SpreadElement_
  - typings.babelTypes.ts36Mod.RestProperty_
  - typings.babelTypes.ts36Mod.SpreadProperty_
*/
trait UnaryLike extends StObject
object UnaryLike {
  
  @scala.inline
  def RestProperty_(argument: LVal, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.RestProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestProperty")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.RestProperty_]
  }
  
  @scala.inline
  def SpreadElement_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.SpreadElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.SpreadElement_]
  }
  
  @scala.inline
  def SpreadProperty_(argument: Expression, end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.SpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadProperty")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.SpreadProperty_]
  }
  
  @scala.inline
  def UnaryExpression_(
    argument: Expression,
    end: Double,
    loc: SourceLocation,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    prefix: Boolean,
    start: Double
  ): typings.babelTypes.ts36Mod.UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.UnaryExpression_]
  }
}
