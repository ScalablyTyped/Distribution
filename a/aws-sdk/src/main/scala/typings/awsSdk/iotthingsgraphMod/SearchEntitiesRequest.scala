package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchEntitiesRequest extends js.Object {
  /**
    * The entity types for which to search.
    */
  var entityTypes: EntityTypes = js.native
  /**
    * Optional filter to apply to the search. Valid filters are NAME NAMESPACE, SEMANTIC_TYPE_PATH and REFERENCED_ENTITY_ID. REFERENCED_ENTITY_ID filters on entities that are used by the entity in the result set. For example, you can filter on the ID of a property that is used in a state. Multiple filters function as OR criteria in the query. Multiple values passed inside the filter function as AND criteria.
    */
  var filters: js.UndefOr[EntityFilters] = js.native
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The string that specifies the next page of results. Use this when you're paginating results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object SearchEntitiesRequest {
  @scala.inline
  def apply(entityTypes: EntityTypes): SearchEntitiesRequest = {
    val __obj = js.Dynamic.literal(entityTypes = entityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchEntitiesRequest]
  }
  @scala.inline
  implicit class SearchEntitiesRequestOps[Self <: SearchEntitiesRequest] (val x: Self) extends AnyVal {
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
    def setEntityTypesVarargs(value: EntityType*): Self = this.set("entityTypes", js.Array(value :_*))
    @scala.inline
    def setEntityTypes(value: EntityTypes): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: EntityFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: EntityFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNamespaceVersion(value: Version): Self = this.set("namespaceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceVersion: Self = this.set("namespaceVersion", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

