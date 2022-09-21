package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestOverridesPayload extends StObject {
  
  /**
    * The overrides document.
    */
  var PayloadData: js.UndefOr[ManifestOverridesPayloadData] = js.undefined
}
object ManifestOverridesPayload {
  
  inline def apply(): ManifestOverridesPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestOverridesPayload]
  }
  
  extension [Self <: ManifestOverridesPayload](x: Self) {
    
    inline def setPayloadData(value: ManifestOverridesPayloadData): Self = StObject.set(x, "PayloadData", value.asInstanceOf[js.Any])
    
    inline def setPayloadDataUndefined: Self = StObject.set(x, "PayloadData", js.undefined)
  }
}
