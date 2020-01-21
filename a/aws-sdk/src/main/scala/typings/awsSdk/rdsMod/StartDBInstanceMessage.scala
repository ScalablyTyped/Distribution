package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDBInstanceMessage extends js.Object {
  /**
    *  The user-supplied instance identifier. 
    */
  var DBInstanceIdentifier: String = js.native
}

object StartDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): StartDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartDBInstanceMessage]
  }
}

