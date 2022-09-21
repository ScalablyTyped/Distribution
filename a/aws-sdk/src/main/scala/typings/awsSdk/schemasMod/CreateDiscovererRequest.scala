package typings.awsSdk.schemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDiscovererRequest extends StObject {
  
  /**
    * Support discovery of schemas in events sent to the bus from another account. (default: true).
    */
  var CrossAccount: js.UndefOr[boolean] = js.undefined
  
  /**
    * A description for the discoverer.
    */
  var Description: js.UndefOr[stringMin0Max256] = js.undefined
  
  /**
    * The ARN of the event bus.
    */
  var SourceArn: stringMin20Max1600
  
  /**
    * Tags associated with the resource.
    */
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.undefined
}
object CreateDiscovererRequest {
  
  inline def apply(SourceArn: stringMin20Max1600): CreateDiscovererRequest = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiscovererRequest]
  }
  
  extension [Self <: CreateDiscovererRequest](x: Self) {
    
    inline def setCrossAccount(value: boolean): Self = StObject.set(x, "CrossAccount", value.asInstanceOf[js.Any])
    
    inline def setCrossAccountUndefined: Self = StObject.set(x, "CrossAccount", js.undefined)
    
    inline def setDescription(value: stringMin0Max256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setSourceArn(value: stringMin20Max1600): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
