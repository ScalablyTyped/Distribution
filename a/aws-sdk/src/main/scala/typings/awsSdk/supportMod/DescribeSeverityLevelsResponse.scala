package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSeverityLevelsResponse extends StObject {
  
  /**
    * The available severity levels for the support case. Available severity levels are defined by your service level agreement with AWS.
    */
  var severityLevels: js.UndefOr[SeverityLevelsList] = js.undefined
}
object DescribeSeverityLevelsResponse {
  
  inline def apply(): DescribeSeverityLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSeverityLevelsResponse]
  }
  
  extension [Self <: DescribeSeverityLevelsResponse](x: Self) {
    
    inline def setSeverityLevels(value: SeverityLevelsList): Self = StObject.set(x, "severityLevels", value.asInstanceOf[js.Any])
    
    inline def setSeverityLevelsUndefined: Self = StObject.set(x, "severityLevels", js.undefined)
    
    inline def setSeverityLevelsVarargs(value: SeverityLevel*): Self = StObject.set(x, "severityLevels", js.Array(value :_*))
  }
}
