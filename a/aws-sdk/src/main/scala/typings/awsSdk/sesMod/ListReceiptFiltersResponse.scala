package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReceiptFiltersResponse extends StObject {
  
  /**
    * A list of IP address filter data structures, which each consist of a name, an IP address range, and whether to allow or block mail from it.
    */
  var Filters: js.UndefOr[ReceiptFilterList] = js.native
}
object ListReceiptFiltersResponse {
  
  @scala.inline
  def apply(): ListReceiptFiltersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReceiptFiltersResponse]
  }
  
  @scala.inline
  implicit class ListReceiptFiltersResponseMutableBuilder[Self <: ListReceiptFiltersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: ReceiptFilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: ReceiptFilter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
  }
}
