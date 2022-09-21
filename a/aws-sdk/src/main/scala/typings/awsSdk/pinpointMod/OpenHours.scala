package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenHours extends StObject {
  
  /**
    * Rules for Custom Channel.
    */
  var CUSTOM: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined
  
  /**
    * Rules for Email Channel.
    */
  var EMAIL: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined
  
  /**
    * Rules for Push Channel.
    */
  var PUSH: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined
  
  /**
    * Rules for SMS Channel.
    */
  var SMS: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined
  
  /**
    * Rules for Voice Channel.
    */
  var VOICE: js.UndefOr[MapOfListOfOpenHoursRules] = js.undefined
}
object OpenHours {
  
  inline def apply(): OpenHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenHours]
  }
  
  extension [Self <: OpenHours](x: Self) {
    
    inline def setCUSTOM(value: MapOfListOfOpenHoursRules): Self = StObject.set(x, "CUSTOM", value.asInstanceOf[js.Any])
    
    inline def setCUSTOMUndefined: Self = StObject.set(x, "CUSTOM", js.undefined)
    
    inline def setEMAIL(value: MapOfListOfOpenHoursRules): Self = StObject.set(x, "EMAIL", value.asInstanceOf[js.Any])
    
    inline def setEMAILUndefined: Self = StObject.set(x, "EMAIL", js.undefined)
    
    inline def setPUSH(value: MapOfListOfOpenHoursRules): Self = StObject.set(x, "PUSH", value.asInstanceOf[js.Any])
    
    inline def setPUSHUndefined: Self = StObject.set(x, "PUSH", js.undefined)
    
    inline def setSMS(value: MapOfListOfOpenHoursRules): Self = StObject.set(x, "SMS", value.asInstanceOf[js.Any])
    
    inline def setSMSUndefined: Self = StObject.set(x, "SMS", js.undefined)
    
    inline def setVOICE(value: MapOfListOfOpenHoursRules): Self = StObject.set(x, "VOICE", value.asInstanceOf[js.Any])
    
    inline def setVOICEUndefined: Self = StObject.set(x, "VOICE", js.undefined)
  }
}
