package typings.awsSdk.comprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePHIDetectionJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a detection job.
    */
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobProperties] = js.undefined
}
object DescribePHIDetectionJobResponse {
  
  inline def apply(): DescribePHIDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePHIDetectionJobResponse]
  }
  
  extension [Self <: DescribePHIDetectionJobResponse](x: Self) {
    
    inline def setComprehendMedicalAsyncJobProperties(value: ComprehendMedicalAsyncJobProperties): Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", value.asInstanceOf[js.Any])
    
    inline def setComprehendMedicalAsyncJobPropertiesUndefined: Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", js.undefined)
  }
}
