package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRobotsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListRobots request. When the results of a ListRobot request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A list of robots that meet the criteria of the request.
    */
  var robots: js.UndefOr[Robots] = js.native
}

object ListRobotsResponse {
  @scala.inline
  def apply(): ListRobotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRobotsResponse]
  }
  @scala.inline
  implicit class ListRobotsResponseOps[Self <: ListRobotsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRobotsVarargs(value: Robot*): Self = this.set("robots", js.Array(value :_*))
    @scala.inline
    def setRobots(value: Robots): Self = this.set("robots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRobots: Self = this.set("robots", js.undefined)
  }
  
}

