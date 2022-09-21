package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobLogEventData extends StObject {
  
  /**
    * Job Event conversion Server ID.
    */
  var conversionServerID: js.UndefOr[EC2InstanceID] = js.undefined
  
  /**
    * Job error.
    */
  var rawError: js.UndefOr[LargeBoundedString] = js.undefined
  
  /**
    * Job Event Source Server ID.
    */
  var sourceServerID: js.UndefOr[SourceServerID] = js.undefined
  
  /**
    * Job Event Target instance ID.
    */
  var targetInstanceID: js.UndefOr[EC2InstanceID] = js.undefined
}
object JobLogEventData {
  
  inline def apply(): JobLogEventData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobLogEventData]
  }
  
  extension [Self <: JobLogEventData](x: Self) {
    
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
