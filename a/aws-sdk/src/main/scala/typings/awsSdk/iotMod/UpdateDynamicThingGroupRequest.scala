package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDynamicThingGroupRequest extends StObject {
  
  /**
    * The expected version of the dynamic thing group to update.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  
  /**
    * The dynamic thing group index to update.  Currently one index is supported: 'AWS_Things'. 
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  
  /**
    * The dynamic thing group search query string to update.
    */
  var queryString: js.UndefOr[QueryString] = js.undefined
  
  /**
    * The dynamic thing group query version to update.  Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this value. 
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
  
  /**
    * The name of the dynamic thing group to update.
    */
  var thingGroupName: ThingGroupName
  
  /**
    * The dynamic thing group properties to update.
    */
  var thingGroupProperties: ThingGroupProperties
}
object UpdateDynamicThingGroupRequest {
  
  @scala.inline
  def apply(thingGroupName: ThingGroupName, thingGroupProperties: ThingGroupProperties): UpdateDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any], thingGroupProperties = thingGroupProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDynamicThingGroupRequest]
  }
  
  @scala.inline
  implicit class UpdateDynamicThingGroupRequestMutableBuilder[Self <: UpdateDynamicThingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    @scala.inline
    def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
    
    @scala.inline
    def setQueryVersion(value: QueryVersion): Self = StObject.set(x, "queryVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryVersionUndefined: Self = StObject.set(x, "queryVersion", js.undefined)
    
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupProperties(value: ThingGroupProperties): Self = StObject.set(x, "thingGroupProperties", value.asInstanceOf[js.Any])
  }
}
