package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCustomKeyStoresRequest extends StObject {
  
  /**
    * Gets only information about the specified custom key store. Enter the key store ID. By default, this operation gets information about all custom key stores in the account and region. To limit the output to a particular custom key store, you can use either the CustomKeyStoreId or CustomKeyStoreName parameter, but not both.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.native
  
  /**
    * Gets only information about the specified custom key store. Enter the friendly name of the custom key store. By default, this operation gets information about all custom key stores in the account and region. To limit the output to a particular custom key store, you can use either the CustomKeyStoreId or CustomKeyStoreName parameter, but not both.
    */
  var CustomKeyStoreName: js.UndefOr[CustomKeyStoreNameType] = js.native
  
  /**
    * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not return more than the specified number of items, but it might return fewer.
    */
  var Limit: js.UndefOr[LimitType] = js.native
  
  /**
    * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextMarker from the truncated response you just received.
    */
  var Marker: js.UndefOr[MarkerType] = js.native
}
object DescribeCustomKeyStoresRequest {
  
  @scala.inline
  def apply(): DescribeCustomKeyStoresRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomKeyStoresRequest]
  }
  
  @scala.inline
  implicit class DescribeCustomKeyStoresRequestMutableBuilder[Self <: DescribeCustomKeyStoresRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomKeyStoreId(value: CustomKeyStoreIdType): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    @scala.inline
    def setCustomKeyStoreName(value: CustomKeyStoreNameType): Self = StObject.set(x, "CustomKeyStoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeyStoreNameUndefined: Self = StObject.set(x, "CustomKeyStoreName", js.undefined)
    
    @scala.inline
    def setLimit(value: LimitType): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: MarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
