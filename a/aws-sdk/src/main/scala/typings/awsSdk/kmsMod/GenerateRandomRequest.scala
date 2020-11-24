package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateRandomRequest extends js.Object {
  
  /**
    * Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
  
  /**
    * The length of the byte string.
    */
  var NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.native
}
object GenerateRandomRequest {
  
  @scala.inline
  def apply(): GenerateRandomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateRandomRequest]
  }
  
  @scala.inline
  implicit class GenerateRandomRequestOps[Self <: GenerateRandomRequest] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setNumberOfBytes(value: NumberOfBytesType): Self = this.set("NumberOfBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfBytes: Self = this.set("NumberOfBytes", js.undefined)
  }
}
