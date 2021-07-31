package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectCustomKeyStoreRequest extends StObject {
  
  /**
    * Enter the ID of the custom key store you want to disconnect. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: CustomKeyStoreIdType
}
object DisconnectCustomKeyStoreRequest {
  
  @scala.inline
  def apply(CustomKeyStoreId: CustomKeyStoreIdType): DisconnectCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal(CustomKeyStoreId = CustomKeyStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectCustomKeyStoreRequest]
  }
  
  @scala.inline
  implicit class DisconnectCustomKeyStoreRequestMutableBuilder[Self <: DisconnectCustomKeyStoreRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
  }
}
