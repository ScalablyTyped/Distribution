package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DoWhileStatement
import typings.babelTypes.babelTypesStrings.WhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.DoWhileStatement_
  - typings.babelTypes.mod.WhileStatement_
*/
trait While extends _Node

object While {
  @scala.inline
  def DoWhileStatement_(body: Statement, test: Expression, `type`: DoWhileStatement): While = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[While]
  }
  @scala.inline
  def WhileStatement_(body: Statement, test: Expression, `type`: WhileStatement): While = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[While]
  }
}

