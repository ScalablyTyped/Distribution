package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBInstanceMessage extends js.Object {
  /**
    * The instance identifier for the instance to be deleted. This parameter isn't case sensitive. Constraints:   Must match the name of an existing instance.  
    */
  var DBInstanceIdentifier: String = js.native
}

object DeleteDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String): DeleteDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBInstanceMessage]
  }
}

