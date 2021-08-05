package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestProcessingRules extends StObject {
  
  var AdMarkerPassthrough: js.UndefOr[typings.awsSdk.mediatailorMod.AdMarkerPassthrough] = js.undefined
}
object ManifestProcessingRules {
  
  inline def apply(): ManifestProcessingRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestProcessingRules]
  }
  
  extension [Self <: ManifestProcessingRules](x: Self) {
    
    inline def setAdMarkerPassthrough(value: AdMarkerPassthrough): Self = StObject.set(x, "AdMarkerPassthrough", value.asInstanceOf[js.Any])
    
    inline def setAdMarkerPassthroughUndefined: Self = StObject.set(x, "AdMarkerPassthrough", js.undefined)
  }
}
