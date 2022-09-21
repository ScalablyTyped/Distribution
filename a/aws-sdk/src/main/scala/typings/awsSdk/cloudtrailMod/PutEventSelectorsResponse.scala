package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventSelectorsResponse extends StObject {
  
  /**
    * Specifies the advanced event selectors configured for your trail.
    */
  var AdvancedEventSelectors: js.UndefOr[typings.awsSdk.cloudtrailMod.AdvancedEventSelectors] = js.undefined
  
  /**
    * Specifies the event selectors configured for your trail.
    */
  var EventSelectors: js.UndefOr[typings.awsSdk.cloudtrailMod.EventSelectors] = js.undefined
  
  /**
    * Specifies the ARN of the trail that was updated with event selectors. The following is the format of a trail ARN.  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var TrailARN: js.UndefOr[String] = js.undefined
}
object PutEventSelectorsResponse {
  
  inline def apply(): PutEventSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventSelectorsResponse]
  }
  
  extension [Self <: PutEventSelectorsResponse](x: Self) {
    
    inline def setAdvancedEventSelectors(value: AdvancedEventSelectors): Self = StObject.set(x, "AdvancedEventSelectors", value.asInstanceOf[js.Any])
    
    inline def setAdvancedEventSelectorsUndefined: Self = StObject.set(x, "AdvancedEventSelectors", js.undefined)
    
    inline def setAdvancedEventSelectorsVarargs(value: AdvancedEventSelector*): Self = StObject.set(x, "AdvancedEventSelectors", js.Array(value*))
    
    inline def setEventSelectors(value: EventSelectors): Self = StObject.set(x, "EventSelectors", value.asInstanceOf[js.Any])
    
    inline def setEventSelectorsUndefined: Self = StObject.set(x, "EventSelectors", js.undefined)
    
    inline def setEventSelectorsVarargs(value: EventSelector*): Self = StObject.set(x, "EventSelectors", js.Array(value*))
    
    inline def setTrailARN(value: String): Self = StObject.set(x, "TrailARN", value.asInstanceOf[js.Any])
    
    inline def setTrailARNUndefined: Self = StObject.set(x, "TrailARN", js.undefined)
  }
}
