package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesRequest extends js.Object {
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.marketplacecatalogMod.Catalog = js.native
  /**
    * The type of entities to retrieve.
    */
  var EntityType: typings.awsSdk.marketplacecatalogMod.EntityType = js.native
  /**
    * An array of filter objects. Each filter object contains two attributes, filterName and filterValues.
    */
  var FilterList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.FilterList] = js.native
  /**
    * Specifies the upper limit of the elements on a single page. If a value isn't provided, the default value is 20.
    */
  var MaxResults: js.UndefOr[MaxResultInteger] = js.native
  /**
    * The value of the next token, if it exists. Null if there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.NextToken] = js.native
  /**
    * An object that contains two attributes, SortBy and SortOrder.
    */
  var Sort: js.UndefOr[typings.awsSdk.marketplacecatalogMod.Sort] = js.native
}

object ListEntitiesRequest {
  @scala.inline
  def apply(Catalog: Catalog, EntityType: EntityType): ListEntitiesRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], EntityType = EntityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntitiesRequest]
  }
  @scala.inline
  implicit class ListEntitiesRequestOps[Self <: ListEntitiesRequest] (val x: Self) extends AnyVal {
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
    def setCatalog(value: Catalog): Self = this.set("Catalog", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityType(value: EntityType): Self = this.set("EntityType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterListVarargs(value: Filter*): Self = this.set("FilterList", js.Array(value :_*))
    @scala.inline
    def setFilterList(value: FilterList): Self = this.set("FilterList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterList: Self = this.set("FilterList", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResultInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSort(value: Sort): Self = this.set("Sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("Sort", js.undefined)
  }
  
}

