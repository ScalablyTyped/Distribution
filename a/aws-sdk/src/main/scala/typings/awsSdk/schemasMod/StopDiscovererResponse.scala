package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDiscovererResponse extends StObject {
  
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.undefined
}
object StopDiscovererResponse {
  
  @scala.inline
  def apply(): StopDiscovererResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDiscovererResponse]
  }
  
  @scala.inline
  implicit class StopDiscovererResponseMutableBuilder[Self <: StopDiscovererResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscovererId(value: string): Self = StObject.set(x, "DiscovererId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscovererIdUndefined: Self = StObject.set(x, "DiscovererId", js.undefined)
    
    @scala.inline
    def setState(value: DiscovererState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
