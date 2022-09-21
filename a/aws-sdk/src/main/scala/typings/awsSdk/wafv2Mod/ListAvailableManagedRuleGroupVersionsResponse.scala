package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAvailableManagedRuleGroupVersionsResponse extends StObject {
  
  /**
    * The name of the version that's currently set as the default. 
    */
  var CurrentDefaultVersion: js.UndefOr[VersionKeyString] = js.undefined
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.undefined
  
  /**
    * The versions that are currently available for the specified managed rule group. 
    */
  var Versions: js.UndefOr[ManagedRuleGroupVersions] = js.undefined
}
object ListAvailableManagedRuleGroupVersionsResponse {
  
  inline def apply(): ListAvailableManagedRuleGroupVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAvailableManagedRuleGroupVersionsResponse]
  }
  
  extension [Self <: ListAvailableManagedRuleGroupVersionsResponse](x: Self) {
    
    inline def setCurrentDefaultVersion(value: VersionKeyString): Self = StObject.set(x, "CurrentDefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentDefaultVersionUndefined: Self = StObject.set(x, "CurrentDefaultVersion", js.undefined)
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setVersions(value: ManagedRuleGroupVersions): Self = StObject.set(x, "Versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "Versions", js.undefined)
    
    inline def setVersionsVarargs(value: ManagedRuleGroupVersion*): Self = StObject.set(x, "Versions", js.Array(value*))
  }
}
