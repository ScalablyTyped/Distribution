package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomKeyStoreResponse extends StObject {
  
  /**
    * A unique identifier for the new custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
}
object CreateCustomKeyStoreResponse {
  
  @scala.inline
  def apply(): CreateCustomKeyStoreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomKeyStoreResponse]
  }
  
  @scala.inline
  implicit class CreateCustomKeyStoreResponseMutableBuilder[Self <: CreateCustomKeyStoreResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
  }
}
