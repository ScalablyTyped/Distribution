package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSeverityLevelsResponse extends StObject {
  
  /**
    * The available severity levels for the support case. Available severity levels are defined by your service level agreement with AWS.
    */
  var severityLevels: js.UndefOr[SeverityLevelsList] = js.native
}
object DescribeSeverityLevelsResponse {
  
  @scala.inline
  def apply(): DescribeSeverityLevelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSeverityLevelsResponse]
  }
  
  @scala.inline
  implicit class DescribeSeverityLevelsResponseMutableBuilder[Self <: DescribeSeverityLevelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeverityLevels(value: SeverityLevelsList): Self = StObject.set(x, "severityLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityLevelsUndefined: Self = StObject.set(x, "severityLevels", js.undefined)
    
    @scala.inline
    def setSeverityLevelsVarargs(value: SeverityLevel*): Self = StObject.set(x, "severityLevels", js.Array(value :_*))
  }
}
