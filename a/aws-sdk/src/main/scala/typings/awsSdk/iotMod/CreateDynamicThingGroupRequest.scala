package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDynamicThingGroupRequest extends js.Object {
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
  implicit class CreateDynamicThingGroupRequestOps[Self <: CreateDynamicThingGroupRequest] (val x: Self) extends AnyVal {
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
    def setQueryString(value: QueryString): Self = this.set("queryString", value.asInstanceOf[js.Any])
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = this.set("thingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexName(value: IndexName): Self = this.set("indexName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexName: Self = this.set("indexName", js.undefined)
    @scala.inline
    def setQueryVersion(value: QueryVersion): Self = this.set("queryVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryVersion: Self = this.set("queryVersion", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setThingGroupProperties(value: ThingGroupProperties): Self = this.set("thingGroupProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupProperties: Self = this.set("thingGroupProperties", js.undefined)
  }
  
}

