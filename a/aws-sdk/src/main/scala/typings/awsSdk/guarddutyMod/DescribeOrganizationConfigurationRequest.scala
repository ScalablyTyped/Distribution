package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConfigurationRequest extends StObject {
  
  /**
    * The ID of the detector to retrieve information about the delegated administrator from.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
}
object DescribeOrganizationConfigurationRequest {
  
  inline def apply(DetectorId: DetectorId): DescribeOrganizationConfigurationRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigurationRequest]
  }
  
  extension [Self <: DescribeOrganizationConfigurationRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
