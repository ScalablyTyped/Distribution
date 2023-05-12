package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListKeysRequest extends StObject {
  
  /**
    * <p>Use this parameter to specify the maximum number of items to return. When this
    *     value is present, KMS does not return more than the specified number of items, but it might
    *     return fewer.</p>
    *          <p>This value is optional. If you include a value, it must be between
    *     1 and 1000, inclusive. If you do not include a value, it defaults to 100.</p>
    */
  var Limit: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Use this parameter in a subsequent request after you receive a response with
    *     truncated results. Set it to the value of <code>NextMarker</code> from the truncated response
    *     you just received.</p>
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object ListKeysRequest {
  
  inline def apply(): ListKeysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListKeysRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListKeysRequest] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
