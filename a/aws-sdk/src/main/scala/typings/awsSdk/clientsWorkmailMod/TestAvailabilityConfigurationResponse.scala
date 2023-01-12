package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestAvailabilityConfigurationResponse extends StObject {
  
  /**
    * String containing the reason for a failed test if TestPassed is false.
    */
  var FailureReason: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean indicating whether the test passed or failed.
    */
  var TestPassed: js.UndefOr[Boolean] = js.undefined
}
object TestAvailabilityConfigurationResponse {
  
  inline def apply(): TestAvailabilityConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestAvailabilityConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestAvailabilityConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setTestPassed(value: Boolean): Self = StObject.set(x, "TestPassed", value.asInstanceOf[js.Any])
    
    inline def setTestPassedUndefined: Self = StObject.set(x, "TestPassed", js.undefined)
  }
}
