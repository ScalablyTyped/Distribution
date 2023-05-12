package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomKeyStoresRequest extends StObject {
  
  /**
    * <p>Gets only information about the specified custom key store. Enter the key store ID.</p>
    *          <p>By default, this operation gets information about all custom key stores in the account and
    *       Region. To limit the output to a particular custom key store, provide either the
    *         <code>CustomKeyStoreId</code> or <code>CustomKeyStoreName</code> parameter, but not
    *       both.</p>
    */
  var CustomKeyStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Gets only information about the specified custom key store. Enter the friendly name of the
    *       custom key store.</p>
    *          <p>By default, this operation gets information about all custom key stores in the account and
    *       Region. To limit the output to a particular custom key store, provide either the
    *         <code>CustomKeyStoreId</code> or <code>CustomKeyStoreName</code> parameter, but not
    *       both.</p>
    */
  var CustomKeyStoreName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Use this parameter to specify the maximum number of items to return. When this
    *     value is present, KMS does not return more than the specified number of items, but it might
    *     return fewer.</p>
    */
  var Limit: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Use this parameter in a subsequent request after you receive a response with
    *     truncated results. Set it to the value of <code>NextMarker</code> from the truncated response
    *     you just received.</p>
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object DescribeCustomKeyStoresRequest {
  
  inline def apply(): DescribeCustomKeyStoresRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomKeyStoresRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCustomKeyStoresRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomKeyStoreId(value: String): Self = StObject.set(x, "CustomKeyStoreId", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreIdUndefined: Self = StObject.set(x, "CustomKeyStoreId", js.undefined)
    
    inline def setCustomKeyStoreName(value: String): Self = StObject.set(x, "CustomKeyStoreName", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoreNameUndefined: Self = StObject.set(x, "CustomKeyStoreName", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
