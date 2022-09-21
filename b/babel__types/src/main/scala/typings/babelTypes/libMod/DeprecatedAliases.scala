package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.NumberLiteral1
  - typings.babelTypes.libMod.RegexLiteral1
  - typings.babelTypes.libMod.RestProperty1
  - typings.babelTypes.libMod.SpreadProperty1
*/
trait DeprecatedAliases extends StObject
object DeprecatedAliases {
  
  inline def NumberLiteral1(value: Double): typings.babelTypes.libMod.NumberLiteral1 = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.NumberLiteral1]
  }
  
  inline def RegexLiteral1(flags: String, pattern: String): typings.babelTypes.libMod.RegexLiteral1 = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegexLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.RegexLiteral1]
  }
  
  inline def RestProperty1(argument: LVal): typings.babelTypes.libMod.RestProperty1 = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RestProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.RestProperty1]
  }
  
  inline def SpreadProperty1(argument: Expression): typings.babelTypes.libMod.SpreadProperty1 = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadProperty")
    __obj.asInstanceOf[typings.babelTypes.libMod.SpreadProperty1]
  }
}
