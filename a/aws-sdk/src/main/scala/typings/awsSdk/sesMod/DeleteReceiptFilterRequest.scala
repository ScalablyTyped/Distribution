package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReceiptFilterRequest extends StObject {
  
  /**
    * The name of the IP address filter to delete.
    */
  var FilterName: ReceiptFilterName
}
object DeleteReceiptFilterRequest {
  
  @scala.inline
  def apply(FilterName: ReceiptFilterName): DeleteReceiptFilterRequest = {
    val __obj = js.Dynamic.literal(FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReceiptFilterRequest]
  }
  
  @scala.inline
  implicit class DeleteReceiptFilterRequestMutableBuilder[Self <: DeleteReceiptFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterName(value: ReceiptFilterName): Self = StObject.set(x, "FilterName", value.asInstanceOf[js.Any])
  }
}
