package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDynamicThingGroupRequest extends StObject {
  
  /**
    * The dynamic thing group index name.  Currently one index is supported: "AWS_Things". 
    */
  var indexName: js.UndefOr[IndexName] = js.native
  
  /**
    * The dynamic thing group search query string. See Query Syntax for information about query string syntax.
    */
  var queryString: QueryString = js.native
  
  /**
    * The dynamic thing group query version.  Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this value. 
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
  
  /**
    * Metadata which can be used to manage the dynamic thing group.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The dynamic thing group name to create.
    */
  var thingGroupName: ThingGroupName = js.native
  
  /**
    * The dynamic thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.native
}
object CreateDynamicThingGroupRequest {
  
  @scala.inline
  def apply(queryString: QueryString, thingGroupName: ThingGroupName): CreateDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any], thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDynamicThingGroupRequest]
  }
  
  @scala.inline
  implicit class CreateDynamicThingGroupRequestMutableBuilder[Self <: CreateDynamicThingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    @scala.inline
    def setQueryString(value: QueryString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryVersion(value: QueryVersion): Self = StObject.set(x, "queryVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryVersionUndefined: Self = StObject.set(x, "queryVersion", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupProperties(value: ThingGroupProperties): Self = StObject.set(x, "thingGroupProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupPropertiesUndefined: Self = StObject.set(x, "thingGroupProperties", js.undefined)
  }
}
