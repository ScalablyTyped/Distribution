package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestProcessingRules extends StObject {
  
  var AdMarkerPassthrough: js.UndefOr[typings.awsSdk.mediatailorMod.AdMarkerPassthrough] = js.undefined
}
object ManifestProcessingRules {
  
  @scala.inline
  def apply(): ManifestProcessingRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManifestProcessingRules]
  }
  
  @scala.inline
  implicit class ManifestProcessingRulesMutableBuilder[Self <: ManifestProcessingRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdMarkerPassthrough(value: AdMarkerPassthrough): Self = StObject.set(x, "AdMarkerPassthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdMarkerPassthroughUndefined: Self = StObject.set(x, "AdMarkerPassthrough", js.undefined)
  }
}
