package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCustomKeyStoreResponse extends js.Object {
  
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
  implicit class CreateCustomKeyStoreResponseOps[Self <: CreateCustomKeyStoreResponse] (val x: Self) extends AnyVal {
    
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
    def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = this.set("CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomKeyStoreId: Self = this.set("CustomKeyStoreId", js.undefined)
  }
}
