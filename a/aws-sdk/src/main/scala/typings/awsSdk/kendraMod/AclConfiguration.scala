package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AclConfiguration extends js.Object {
  /**
    * A list of groups, separated by semi-colons, that filters a query response based on user context. The document is only returned to users that are in one of the groups specified in the UserContext field of the Query operation.
    */
  var AllowedGroupsColumnName: ColumnName = js.native
}

object AclConfiguration {
  @scala.inline
  def apply(AllowedGroupsColumnName: ColumnName): AclConfiguration = {
    val __obj = js.Dynamic.literal(AllowedGroupsColumnName = AllowedGroupsColumnName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AclConfiguration]
  }
}

