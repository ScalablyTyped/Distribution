package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListThingsInThingGroupRequest extends js.Object {
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[RegistryMaxResults] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * When true, list things in this thing group and in all child groups as well.
    */
  var recursive: js.UndefOr[Recursive] = js.native
  /**
    * The thing group name.
    */
  var thingGroupName: ThingGroupName = js.native
}

object ListThingsInThingGroupRequest {
  @scala.inline
  def apply(thingGroupName: ThingGroupName): ListThingsInThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThingsInThingGroupRequest]
  }
  @scala.inline
  implicit class ListThingsInThingGroupRequestOps[Self <: ListThingsInThingGroupRequest] (val x: Self) extends AnyVal {
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
    def setThingGroupName(value: ThingGroupName): Self = this.set("thingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: RegistryMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRecursive(value: Recursive): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
  
}

