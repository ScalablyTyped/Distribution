package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrollmentConfig extends StObject {
  
  /**
    *  The action to take when the specified speaker is already enrolled in the specified domain. The default value is SKIP, which skips the enrollment for the existing speaker. Setting the value to OVERWRITE replaces the existing voice prints and enrollment audio stored for that speaker with new data generated from the latest audio.
    */
  var ExistingEnrollmentAction: js.UndefOr[typings.awsSdk.clientsVoiceidMod.ExistingEnrollmentAction] = js.undefined
  
  /**
    * The fraud detection configuration to use for the speaker enrollment job.
    */
  var FraudDetectionConfig: js.UndefOr[EnrollmentJobFraudDetectionConfig] = js.undefined
}
object EnrollmentConfig {
  
  inline def apply(): EnrollmentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnrollmentConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnrollmentConfig] (val x: Self) extends AnyVal {
    
    inline def setExistingEnrollmentAction(value: ExistingEnrollmentAction): Self = StObject.set(x, "ExistingEnrollmentAction", value.asInstanceOf[js.Any])
    
    inline def setExistingEnrollmentActionUndefined: Self = StObject.set(x, "ExistingEnrollmentAction", js.undefined)
    
    inline def setFraudDetectionConfig(value: EnrollmentJobFraudDetectionConfig): Self = StObject.set(x, "FraudDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setFraudDetectionConfigUndefined: Self = StObject.set(x, "FraudDetectionConfig", js.undefined)
  }
}
