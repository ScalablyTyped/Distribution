package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.DoWhileStatement_
  - typings.babelTypes.ts36Mod.WhileStatement_
*/
trait While extends StObject
object While {
  
  @scala.inline
  def DoWhileStatement_(body: Statement, end: Double, loc: SourceLocation, start: Double, test: Expression): typings.babelTypes.ts36Mod.DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.DoWhileStatement_]
  }
  
  @scala.inline
  def WhileStatement_(body: Statement, end: Double, loc: SourceLocation, start: Double, test: Expression): typings.babelTypes.ts36Mod.WhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.WhileStatement_]
  }
}
