package typings.awsSdk.simpledbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutAttributesRequest extends StObject {
  
  /**
    * The name of the domain in which the attributes are being stored.
    */
  var DomainName: String
  
  /**
    * A list of items on which to perform the operation.
    */
  var Items: ReplaceableItemList
}
object BatchPutAttributesRequest {
  
  inline def apply(DomainName: String, Items: ReplaceableItemList): BatchPutAttributesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAttributesRequest]
  }
  
  extension [Self <: BatchPutAttributesRequest](x: Self) {
    
    inline def setDomainName(value: String): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setItems(value: ReplaceableItemList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ReplaceableItem*): Self = StObject.set(x, "Items", js.Array(value*))
  }
}
