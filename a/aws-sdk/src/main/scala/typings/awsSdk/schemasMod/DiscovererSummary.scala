package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscovererSummary extends StObject {
  
  /**
    * The Status if the discoverer will discover schemas from events sent from another account.
    */
  var CrossAccount: js.UndefOr[boolean] = js.undefined
  
  /**
    * The ARN of the discoverer.
    */
  var DiscovererArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the event bus.
    */
  var SourceArn: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.undefined
  
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.undefined
}
object DiscovererSummary {
  
  inline def apply(): DiscovererSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscovererSummary]
  }
  
  extension [Self <: DiscovererSummary](x: Self) {
    
    inline def setCrossAccount(value: boolean): Self = StObject.set(x, "CrossAccount", value.asInstanceOf[js.Any])
    
    inline def setCrossAccountUndefined: Self = StObject.set(x, "CrossAccount", js.undefined)
    
    inline def setDiscovererArn(value: string): Self = StObject.set(x, "DiscovererArn", value.asInstanceOf[js.Any])
    
    inline def setDiscovererArnUndefined: Self = StObject.set(x, "DiscovererArn", js.undefined)
    
    inline def setDiscovererId(value: string): Self = StObject.set(x, "DiscovererId", value.asInstanceOf[js.Any])
    
    inline def setDiscovererIdUndefined: Self = StObject.set(x, "DiscovererId", js.undefined)
    
    inline def setSourceArn(value: string): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceArnUndefined: Self = StObject.set(x, "SourceArn", js.undefined)
    
    inline def setState(value: DiscovererState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
