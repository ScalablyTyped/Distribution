package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Remediation extends js.Object {
  
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
  implicit class RemediationOps[Self <: Remediation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRecommendation(value: Recommendation): Self = this.set("Recommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommendation: Self = this.set("Recommendation", js.undefined)
  }
}
