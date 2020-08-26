package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInputSecurityGroupsResponse extends js.Object {
  /**
    * List of input security groups
    */
  var InputSecurityGroups: js.UndefOr[listOfInputSecurityGroup] = js.native
  var NextToken: js.UndefOr[string] = js.native
}

object ListInputSecurityGroupsResponse {
  @scala.inline
  def apply(): ListInputSecurityGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputSecurityGroupsResponse]
  }
  @scala.inline
  implicit class ListInputSecurityGroupsResponseOps[Self <: ListInputSecurityGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInputSecurityGroupsVarargs(value: InputSecurityGroup*): Self = this.set("InputSecurityGroups", js.Array(value :_*))
    @scala.inline
    def setInputSecurityGroups(value: listOfInputSecurityGroup): Self = this.set("InputSecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputSecurityGroups: Self = this.set("InputSecurityGroups", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

