package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceInventoryResponse extends js.Object {
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the resources.
    */
  var ResourceInventoryList: js.UndefOr[typings.awsSdk.licensemanagerMod.ResourceInventoryList] = js.native
}
object ListResourceInventoryResponse {
  
  @scala.inline
  def apply(): ListResourceInventoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceInventoryResponse]
  }
  
  @scala.inline
  implicit class ListResourceInventoryResponseOps[Self <: ListResourceInventoryResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setResourceInventoryListVarargs(value: ResourceInventory*): Self = this.set("ResourceInventoryList", js.Array(value :_*))
    
    @scala.inline
    def setResourceInventoryList(value: ResourceInventoryList): Self = this.set("ResourceInventoryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceInventoryList: Self = this.set("ResourceInventoryList", js.undefined)
  }
}
