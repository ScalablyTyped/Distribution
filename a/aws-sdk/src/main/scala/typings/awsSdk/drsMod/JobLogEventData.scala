package typings.awsSdk.drsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobLogEventData extends StObject {
  
  /**
    * Properties of a conversion job
    */
  var conversionProperties: js.UndefOr[ConversionProperties] = js.undefined
  
  /**
    * The ID of a conversion server.
    */
  var conversionServerID: js.UndefOr[EC2InstanceID] = js.undefined
  
  /**
    * A string representing a job error.
    */
  var rawError: js.UndefOr[LargeBoundedString] = js.undefined
  
  /**
    * The ID of a Source Server.
    */
  var sourceServerID: js.UndefOr[SourceServerID] = js.undefined
  
  /**
    * The ID of a Recovery Instance.
    */
  var targetInstanceID: js.UndefOr[EC2InstanceID] = js.undefined
}
object JobLogEventData {
  
  inline def apply(): JobLogEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobLogEventData]
  }
  
  extension [Self <: JobLogEventData](x: Self) {
    
    inline def setConversionProperties(value: ConversionProperties): Self = StObject.set(x, "conversionProperties", value.asInstanceOf[js.Any])
    
    inline def setConversionPropertiesUndefined: Self = StObject.set(x, "conversionProperties", js.undefined)
    
    inline def setConversionServerID(value: EC2InstanceID): Self = StObject.set(x, "conversionServerID", value.asInstanceOf[js.Any])
    
    inline def setConversionServerIDUndefined: Self = StObject.set(x, "conversionServerID", js.undefined)
    
    inline def setRawError(value: LargeBoundedString): Self = StObject.set(x, "rawError", value.asInstanceOf[js.Any])
    
    inline def setRawErrorUndefined: Self = StObject.set(x, "rawError", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDUndefined: Self = StObject.set(x, "sourceServerID", js.undefined)
    
    inline def setTargetInstanceID(value: EC2InstanceID): Self = StObject.set(x, "targetInstanceID", value.asInstanceOf[js.Any])
    
    inline def setTargetInstanceIDUndefined: Self = StObject.set(x, "targetInstanceID", js.undefined)
  }
}
