package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Remediation extends StObject {
  
  /**
    * A recommendation on the steps to take to remediate the issue identified by a finding.
    */
  var Recommendation: js.UndefOr[typings.awsSdk.securityhubMod.Recommendation] = js.native
}
object Remediation {
  
  @scala.inline
  def apply(): Remediation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Remediation]
  }
  
  @scala.inline
  implicit class RemediationMutableBuilder[Self <: Remediation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecommendation(value: Recommendation): Self = StObject.set(x, "Recommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationUndefined: Self = StObject.set(x, "Recommendation", js.undefined)
  }
}
