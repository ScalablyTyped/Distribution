package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProfilingGroupsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListProfilingGroups request. When the results of a ListProfilingGroups request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  A returned list of profiling group names. A list of the names is returned only if includeDescription is false, otherwise a list of  ProfilingGroupDescription  objects is returned. 
    */
  var profilingGroupNames: ProfilingGroupNames = js.native
  /**
    *  A returned list  ProfilingGroupDescription  objects. A list of  ProfilingGroupDescription  objects is returned only if includeDescription is true, otherwise a list of profiling group names is returned. 
    */
  var profilingGroups: js.UndefOr[ProfilingGroupDescriptions] = js.native
}

object ListProfilingGroupsResponse {
  @scala.inline
  def apply(profilingGroupNames: ProfilingGroupNames): ListProfilingGroupsResponse = {
    val __obj = js.Dynamic.literal(profilingGroupNames = profilingGroupNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfilingGroupsResponse]
  }
  @scala.inline
  implicit class ListProfilingGroupsResponseOps[Self <: ListProfilingGroupsResponse] (val x: Self) extends AnyVal {
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
    def setProfilingGroupNamesVarargs(value: ProfilingGroupName*): Self = this.set("profilingGroupNames", js.Array(value :_*))
    @scala.inline
    def setProfilingGroupNames(value: ProfilingGroupNames): Self = this.set("profilingGroupNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setProfilingGroupsVarargs(value: ProfilingGroupDescription*): Self = this.set("profilingGroups", js.Array(value :_*))
    @scala.inline
    def setProfilingGroups(value: ProfilingGroupDescriptions): Self = this.set("profilingGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfilingGroups: Self = this.set("profilingGroups", js.undefined)
  }
  
}

