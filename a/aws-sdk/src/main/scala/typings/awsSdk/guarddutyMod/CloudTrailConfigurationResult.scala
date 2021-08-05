package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudTrailConfigurationResult extends StObject {
  
  /**
    * Describes whether CloudTrail is enabled as a data source for the detector.
    */
  var Status: DataSourceStatus
}
object CloudTrailConfigurationResult {
  
  inline def apply(Status: DataSourceStatus): CloudTrailConfigurationResult = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudTrailConfigurationResult]
  }
  
  extension [Self <: CloudTrailConfigurationResult](x: Self) {
    
    inline def setStatus(value: DataSourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
