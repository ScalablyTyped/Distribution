package typings.awsSdk.licensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceInventoryResponse extends StObject {
  
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
  implicit class ListResourceInventoryResponseMutableBuilder[Self <: ListResourceInventoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceInventoryList(value: ResourceInventoryList): Self = StObject.set(x, "ResourceInventoryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceInventoryListUndefined: Self = StObject.set(x, "ResourceInventoryList", js.undefined)
    
    @scala.inline
    def setResourceInventoryListVarargs(value: ResourceInventory*): Self = StObject.set(x, "ResourceInventoryList", js.Array(value :_*))
  }
}
