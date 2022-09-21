package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.BreakStatement_
  - typings.babelTypes.libMod.ContinueStatement_
  - typings.babelTypes.libMod.ReturnStatement_
  - typings.babelTypes.libMod.ThrowStatement_
  - typings.babelTypes.libMod.YieldExpression_
  - typings.babelTypes.libMod.AwaitExpression_
*/
trait Terminatorless extends StObject
object Terminatorless {
  
  inline def AwaitExpression_(argument: Expression): typings.babelTypes.libMod.AwaitExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.AwaitExpression_]
  }
  
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
  
  inline def YieldExpression_(delegate: Boolean): typings.babelTypes.libMod.YieldExpression_ = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("YieldExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.YieldExpression_]
  }
}
