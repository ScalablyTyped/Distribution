package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDynamicThingGroupRequest extends js.Object {
  
  /**
    * The expected version of the dynamic thing group to update.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  
  /**
    * The dynamic thing group index to update.  Currently one index is supported: 'AWS_Things'. 
    */
  var indexName: js.UndefOr[IndexName] = js.native
  
  /**
    * The dynamic thing group search query string to update.
    */
  var queryString: js.UndefOr[QueryString] = js.native
  
  /**
    * The dynamic thing group query version to update.  Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this value. 
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
  
  /**
    * The name of the dynamic thing group to update.
    */
  var thingGroupName: ThingGroupName = js.native
  
  /**
    * The dynamic thing group properties to update.
    */
  var thingGroupProperties: ThingGroupProperties = js.native
}
object UpdateDynamicThingGroupRequest {
  
  @scala.inline
  def apply(thingGroupName: ThingGroupName, thingGroupProperties: ThingGroupProperties): UpdateDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any], thingGroupProperties = thingGroupProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDynamicThingGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateDynamicThingGroupRequestOps[Self <: UpdateDynamicThingGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setThingGroupProperties(value: ThingGroupProperties): Self = this.set("thingGroupProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedVersion(value: OptionalVersion): Self = this.set("expectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedVersion: Self = this.set("expectedVersion", js.undefined)
    
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
  }
}
