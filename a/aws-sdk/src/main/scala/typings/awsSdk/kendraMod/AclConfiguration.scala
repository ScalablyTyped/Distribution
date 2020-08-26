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
  @scala.inline
  implicit class AclConfigurationOps[Self <: AclConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowedGroupsColumnName(value: ColumnName): Self = this.set("AllowedGroupsColumnName", value.asInstanceOf[js.Any])
  }
  
}

