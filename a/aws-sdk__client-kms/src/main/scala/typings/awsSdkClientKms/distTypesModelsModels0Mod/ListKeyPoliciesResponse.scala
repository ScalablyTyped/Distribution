package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeyPoliciesResponse extends StObject {
  
  /**
    * <p>When <code>Truncated</code> is true, this element is present and contains the
    *     value to use for the <code>Marker</code> parameter in a subsequent request.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A list of key policy names. The only valid value is <code>default</code>.</p>
    */
  var PolicyNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * <p>A flag that indicates whether there are more items in the list. When this
    *     value is true, the list in this response is truncated. To get more items, pass the value of
    *     the <code>NextMarker</code> element in thisresponse to the <code>Marker</code> parameter in a
    *     subsequent request.</p>
    */
  var Truncated: js.UndefOr[Boolean] = js.undefined
}
object ListKeyPoliciesResponse {
  
  inline def apply(): ListKeyPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeyPoliciesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListKeyPoliciesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setPolicyNames(value: js.Array[String]): Self = StObject.set(x, "PolicyNames", value.asInstanceOf[js.Any])
    
    inline def setPolicyNamesUndefined: Self = StObject.set(x, "PolicyNames", js.undefined)
    
    inline def setPolicyNamesVarargs(value: String*): Self = StObject.set(x, "PolicyNames", js.Array(value*))
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
  }
}
