package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDiscovererResponse extends StObject {
  
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.undefined
}
object StartDiscovererResponse {
  
  inline def apply(): StartDiscovererResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDiscovererResponse]
  }
  
  extension [Self <: StartDiscovererResponse](x: Self) {
    
    inline def setDiscovererId(value: string): Self = StObject.set(x, "DiscovererId", value.asInstanceOf[js.Any])
    
    inline def setDiscovererIdUndefined: Self = StObject.set(x, "DiscovererId", js.undefined)
    
    inline def setState(value: DiscovererState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
