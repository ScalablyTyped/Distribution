package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search extends js.Object {
  
  /**
    * Determines whether the field is returned in the query response. The default is true.
    */
  var Displayable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that the field can be used to create search facets, a count of results for each value in the field. The default is false .
    */
  var Facetable: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines whether the field is used in the search. If the Searchable field is true, you can use relevance tuning to manually tune how Amazon Kendra weights the field in the search. The default is true for string fields and false for number and date fields.
    */
  var Searchable: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines whether the field can be used to sort the results of a query. If you specify sorting on a field that does not have Sortable set to true, Amazon Kendra returns an exception. The default is false.
    */
  var Sortable: js.UndefOr[Boolean] = js.native
}
object Search {
  
  @scala.inline
  def apply(): Search = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Search]
  }
  
  @scala.inline
  implicit class SearchOps[Self <: Search] (val x: Self) extends AnyVal {
    
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
    def setDisplayable(value: Boolean): Self = this.set("Displayable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayable: Self = this.set("Displayable", js.undefined)
    
    @scala.inline
    def setFacetable(value: Boolean): Self = this.set("Facetable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetable: Self = this.set("Facetable", js.undefined)
    
    @scala.inline
    def setSearchable(value: Boolean): Self = this.set("Searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchable: Self = this.set("Searchable", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("Sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortable: Self = this.set("Sortable", js.undefined)
  }
}
