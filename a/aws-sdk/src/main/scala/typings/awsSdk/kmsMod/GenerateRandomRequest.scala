package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateRandomRequest extends StObject {
  
  /**
    * Generates the random byte string in the AWS CloudHSM cluster that is associated with the specified custom key store. To find the ID of a custom key store, use the DescribeCustomKeyStores operation.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
  
  /**
    * The length of the byte string.
    */
  var NumberOfBytes: js.UndefOr[NumberOfBytesType] = js.undefined
}
object GenerateRandomRequest {
  
  @scala.inline
  def apply(): GenerateRandomRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateRandomRequest]
  }
  
  @scala.inline
  implicit class GenerateRandomRequestMutableBuilder[Self <: GenerateRandomRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    @scala.inline
    def setNumberOfBytes(value: NumberOfBytesType): Self = StObject.set(x, "NumberOfBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfBytesUndefined: Self = StObject.set(x, "NumberOfBytes", js.undefined)
  }
}
