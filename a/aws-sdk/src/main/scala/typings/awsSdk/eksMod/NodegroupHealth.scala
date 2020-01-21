package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodegroupHealth extends js.Object {
  /**
    * Any issues that are associated with the node group. 
    */
  var issues: js.UndefOr[IssueList] = js.native
}

object NodegroupHealth {
  @scala.inline
  def apply(issues: IssueList = null): NodegroupHealth = {
    val __obj = js.Dynamic.literal()
    if (issues != null) __obj.updateDynamic("issues")(issues.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodegroupHealth]
  }
}

