package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubscribedWorkteamResponse extends js.Object {
  /**
    * A Workteam instance that contains information about the work team.
    */
  var SubscribedWorkteam: typings.awsSdk.sagemakerMod.SubscribedWorkteam = js.native
}

object DescribeSubscribedWorkteamResponse {
  @scala.inline
  def apply(SubscribedWorkteam: SubscribedWorkteam): DescribeSubscribedWorkteamResponse = {
    val __obj = js.Dynamic.literal(SubscribedWorkteam = SubscribedWorkteam.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscribedWorkteamResponse]
  }
  @scala.inline
  implicit class DescribeSubscribedWorkteamResponseOps[Self <: DescribeSubscribedWorkteamResponse] (val x: Self) extends AnyVal {
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
    def setSubscribedWorkteam(value: SubscribedWorkteam): Self = this.set("SubscribedWorkteam", value.asInstanceOf[js.Any])
  }
  
}

