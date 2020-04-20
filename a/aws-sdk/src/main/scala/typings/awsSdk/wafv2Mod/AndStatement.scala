package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndStatement extends js.Object {
  /**
    * The statements to combine with AND logic. You can use any statements that can be nested. 
    */
  var Statements: typings.awsSdk.wafv2Mod.Statements = js.native
}

object AndStatement {
  @scala.inline
  def apply(Statements: Statements): AndStatement = {
    val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndStatement]
  }
}

