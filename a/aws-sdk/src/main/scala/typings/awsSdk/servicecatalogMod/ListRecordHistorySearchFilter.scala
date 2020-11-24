package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRecordHistorySearchFilter extends js.Object {
  
  /**
    * The filter key.    product - Filter results based on the specified product identifier.    provisionedproduct - Filter results based on the provisioned product identifier.  
    */
  var Key: js.UndefOr[SearchFilterKey] = js.native
  
  /**
    * The filter value.
    */
  var Value: js.UndefOr[SearchFilterValue] = js.native
}
object ListRecordHistorySearchFilter {
  
  @scala.inline
  def apply(): ListRecordHistorySearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecordHistorySearchFilter]
  }
  
  @scala.inline
  implicit class ListRecordHistorySearchFilterOps[Self <: ListRecordHistorySearchFilter] (val x: Self) extends AnyVal {
    
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
    def setKey(value: SearchFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setValue(value: SearchFilterValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
