package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceQuery extends js.Object {
  
  /**
    * The query that defines a group or a search.
    */
  var Query: typings.awsSdk.resourcegroupsMod.Query = js.native
  
  /**
    * The type of the query. You can use the following values:     CLOUDFORMATION_STACK_1_0: Specifies that the Query contains an ARN for a CloudFormation stack.     TAG_FILTERS_1_0: Specifies that the Query parameter contains a JSON string that represents a collection of simple tag filters for resource types and tags. The JSON string uses a syntax similar to the  GetResources  operation, but uses only the   ResourceTypeFilters  and  TagFilters  fields. If you specify more than one tag key, only resources that match all tag keys, and at least one value of each specified tag key, are returned in your query. If you specify more than one value for a tag key, a resource matches the filter if it has a tag key value that matches any of the specified values. For example, consider the following sample query for resources that have two tags, Stage and Version, with two values each:  [{"Stage":["Test","Deploy"]},{"Version":["1","2"]}]  The results of this query could include the following.   An EC2 instance that has the following two tags: {"Stage":"Deploy"}, and {"Version":"2"}    An S3 bucket that has the following two tags: {"Stage":"Test"}, and {"Version":"1"}    The query would not include the following items in the results, however.    An EC2 instance that has only the following tag: {"Stage":"Deploy"}. The instance does not have all of the tag keys specified in the filter, so it is excluded from the results.   An RDS database that has the following two tags: {"Stage":"Archived"} and {"Version":"4"}  The database has all of the tag keys, but none of those keys has an associated value that matches at least one of the specified values in the filter.    
    */
  var Type: QueryType = js.native
}
object ResourceQuery {
  
  @scala.inline
  def apply(Query: Query, Type: QueryType): ResourceQuery = {
    val __obj = js.Dynamic.literal(Query = Query.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuery]
  }
  
  @scala.inline
  implicit class ResourceQueryOps[Self <: ResourceQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("Query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: QueryType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
