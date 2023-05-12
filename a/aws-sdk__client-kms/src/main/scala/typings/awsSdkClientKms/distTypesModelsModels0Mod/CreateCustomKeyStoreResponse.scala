package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomKeyStoreResponse extends StObject {
  
  /**
    * <p>A unique identifier for the new custom key store.</p>
    */
  var CustomKeyStoreId: js.UndefOr[String] = js.undefined
}
object CreateCustomKeyStoreResponse {
  
  inline def apply(): CreateCustomKeyStoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomKeyStoreResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCustomKeyStoreResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomKeyStoreId(value: String): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
  }
}
