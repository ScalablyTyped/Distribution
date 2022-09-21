package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.BreakStatement_
  - typings.babelTypes.libMod.ContinueStatement_
  - typings.babelTypes.libMod.ReturnStatement_
  - typings.babelTypes.libMod.ThrowStatement_
*/
trait CompletionStatement extends StObject
object CompletionStatement {
  
  inline def BreakStatement_(): typings.babelTypes.libMod.BreakStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.BreakStatement_]
  }
  
  inline def ContinueStatement_(): typings.babelTypes.libMod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.ContinueStatement_]
  }
  
  inline def ReturnStatement_(): typings.babelTypes.libMod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.ReturnStatement_]
  }
  
  inline def ThrowStatement_(argument: Expression): typings.babelTypes.libMod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typings.babelTypes.libMod.ThrowStatement_]
  }
}
