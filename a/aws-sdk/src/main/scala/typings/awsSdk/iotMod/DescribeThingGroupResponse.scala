package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeThingGroupResponse extends StObject {
  
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
    * The dynamic thing group status.
    */
  var status: js.UndefOr[DynamicGroupStatus] = js.native
  
  /**
    * The thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  
  /**
    * Thing group metadata.
    */
  var thingGroupMetadata: js.UndefOr[ThingGroupMetadata] = js.native
  
  /**
    * The name of the thing group.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
  
  /**
    * The thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.native
  
  /**
    * The version of the thing group.
    */
  var version: js.UndefOr[Version] = js.native
}
object DescribeThingGroupResponse {
  
  @scala.inline
  def apply(): DescribeThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeThingGroupResponse]
  }
  
  @scala.inline
  implicit class DescribeThingGroupResponseMutableBuilder[Self <: DescribeThingGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: DynamicGroupStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setThingGroupArn(value: ThingGroupArn): Self = StObject.set(x, "thingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupArnUndefined: Self = StObject.set(x, "thingGroupArn", js.undefined)
    
    @scala.inline
    def setThingGroupId(value: ThingGroupId): Self = StObject.set(x, "thingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupIdUndefined: Self = StObject.set(x, "thingGroupId", js.undefined)
    
    @scala.inline
    def setThingGroupMetadata(value: ThingGroupMetadata): Self = StObject.set(x, "thingGroupMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupMetadataUndefined: Self = StObject.set(x, "thingGroupMetadata", js.undefined)
    
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupNameUndefined: Self = StObject.set(x, "thingGroupName", js.undefined)
    
    @scala.inline
    def setThingGroupProperties(value: ThingGroupProperties): Self = StObject.set(x, "thingGroupProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupPropertiesUndefined: Self = StObject.set(x, "thingGroupProperties", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
