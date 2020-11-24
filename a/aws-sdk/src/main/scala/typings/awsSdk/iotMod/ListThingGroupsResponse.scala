package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListThingGroupsResponse extends js.Object {
  
  /**
    * The token to use to get the next set of results. Will not be returned if operation has returned all results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The thing groups.
    */
  var thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.native
}
object ListThingGroupsResponse {
  
  @scala.inline
  def apply(): ListThingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingGroupsResponse]
  }
  
  @scala.inline
  implicit class ListThingGroupsResponseOps[Self <: ListThingGroupsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setThingGroupsVarargs(value: GroupNameAndArn*): Self = this.set("thingGroups", js.Array(value :_*))
    
    @scala.inline
    def setThingGroups(value: ThingGroupNameAndArnList): Self = this.set("thingGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingGroups: Self = this.set("thingGroups", js.undefined)
  }
}
