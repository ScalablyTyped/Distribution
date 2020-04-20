package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBParameterGroupMessage extends js.Object {
  /**
    * The name of the DB parameter group. Constraints:   Must be the name of an existing DB parameter group   You can't delete a default DB parameter group   Can't be associated with any DB instances  
    */
  var DBParameterGroupName: String = js.native
}

object DeleteDBParameterGroupMessage {
  @scala.inline
  def apply(DBParameterGroupName: String): DeleteDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupName = DBParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBParameterGroupMessage]
  }
}

