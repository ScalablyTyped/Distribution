package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDynamicThingGroupResponse extends js.Object {
  
  /**
    * The dynamic thing group index name.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  
  /**
    * The dynamic thing group search query string.
    */
  var queryString: js.UndefOr[QueryString] = js.native
  
  /**
    * The dynamic thing group query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
  
  /**
    * The dynamic thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  
  /**
    * The dynamic thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  
  /**
    * The dynamic thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
}
object CreateDynamicThingGroupResponse {
  
  @scala.inline
  def apply(): CreateDynamicThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDynamicThingGroupResponse]
  }
  
  @scala.inline
  implicit class CreateDynamicThingGroupResponseOps[Self <: CreateDynamicThingGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setIndexName(value: IndexName): Self = this.set("indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("indexName", js.undefined)
    
    @scala.inline
    def setQueryString(value: QueryString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryString: Self = this.set("queryString", js.undefined)
    
    @scala.inline
    def setQueryVersion(value: QueryVersion): Self = this.set("queryVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryVersion: Self = this.set("queryVersion", js.undefined)
    
    @scala.inline
    def setThingGroupArn(value: ThingGroupArn): Self = this.set("thingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingGroupArn: Self = this.set("thingGroupArn", js.undefined)
    
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
