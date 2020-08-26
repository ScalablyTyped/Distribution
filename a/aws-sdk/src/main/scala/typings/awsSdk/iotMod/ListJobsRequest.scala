package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobsRequest extends js.Object {
  /**
    * The maximum number of results to return per request.
    */
  var maxResults: js.UndefOr[LaserMaxResults] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An optional filter that lets you search for jobs that have the specified status.
    */
  var status: js.UndefOr[JobStatus] = js.native
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group. 
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.native
  /**
    * A filter that limits the returned jobs to those for the specified group.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * A filter that limits the returned jobs to those for the specified group.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
}

object ListJobsRequest {
  @scala.inline
  def apply(): ListJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsRequest]
  }
  @scala.inline
  implicit class ListJobsRequestOps[Self <: ListJobsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: LaserMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTargetSelection(value: TargetSelection): Self = this.set("targetSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetSelection: Self = this.set("targetSelection", js.undefined)
    @scala.inline
    def setThingGroupId(value: ThingGroupId): Self = this.set("thingGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupId: Self = this.set("thingGroupId", js.undefined)
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = this.set("thingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupName: Self = this.set("thingGroupName", js.undefined)
  }
  
}

