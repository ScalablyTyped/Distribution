package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.StringLiteral_
  - typings.babelTypes.libMod.NumericLiteral_
  - typings.babelTypes.libMod.NullLiteral_
  - typings.babelTypes.libMod.BooleanLiteral_
  - typings.babelTypes.libMod.RegExpLiteral_
  - typings.babelTypes.libMod.TemplateLiteral_
  - typings.babelTypes.libMod.BigIntLiteral_
  - typings.babelTypes.libMod.DecimalLiteral_
*/
trait Literal extends StObject
object Literal {
  
  inline def BigIntLiteral_(value: String): typings.babelTypes.libMod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.BigIntLiteral_]
  }
  
  inline def BooleanLiteral_(value: Boolean): typings.babelTypes.libMod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.BooleanLiteral_]
  }
  
  inline def DecimalLiteral_(value: String): typings.babelTypes.libMod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DecimalLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.DecimalLiteral_]
  }
  
  inline def NullLiteral_(): typings.babelTypes.libMod.NullLiteral_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.NullLiteral_]
  }
  
  inline def NumericLiteral_(value: Double): typings.babelTypes.libMod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.NumericLiteral_]
  }
  
  inline def RegExpLiteral_(flags: String, pattern: String): typings.babelTypes.libMod.RegExpLiteral_ = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.RegExpLiteral_]
  }
  
  inline def StringLiteral_(value: String): typings.babelTypes.libMod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.StringLiteral_]
  }
  
  inline def TemplateLiteral_(expressions: js.Array[Expression | TSType], quasis: js.Array[TemplateElement_]): typings.babelTypes.libMod.TemplateLiteral_ = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.babelTypes.libMod.TemplateLiteral_]
  }
}
