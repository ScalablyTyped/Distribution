package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBSecurityGroupMessage extends js.Object {
  /**
    * The name of the DB security group to delete.  You can't delete the default DB security group.  Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Must not be "Default"  
    */
  var DBSecurityGroupName: String = js.native
}

object DeleteDBSecurityGroupMessage {
  @scala.inline
  def apply(DBSecurityGroupName: String): DeleteDBSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(DBSecurityGroupName = DBSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBSecurityGroupMessage]
  }
}

