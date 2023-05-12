package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectCustomKeyStoreRequest extends StObject {
  
  /**
    * <p>Enter the key store ID of the custom key store that you want to connect.
    *       To find the ID of a custom key store, use the <a>DescribeCustomKeyStores</a> operation.</p>
    */
  var CustomKeyStoreId: js.UndefOr[String] = js.undefined
}
object ConnectCustomKeyStoreRequest {
  
  inline def apply(): ConnectCustomKeyStoreRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectCustomKeyStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectCustomKeyStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomKeyStoreId(value: String): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
  }
}
