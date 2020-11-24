package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonCompliantSummary extends js.Object {
  
  /**
    * The total number of compliance items that are not compliant.
    */
  var NonCompliantCount: js.UndefOr[ComplianceSummaryCount] = js.native
  
  /**
    * A summary of the non-compliance severity by compliance type
    */
  var SeveritySummary: js.UndefOr[typings.awsSdk.ssmMod.SeveritySummary] = js.native
}
object NonCompliantSummary {
  
  @scala.inline
  def apply(): NonCompliantSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonCompliantSummary]
  }
  
  @scala.inline
  implicit class NonCompliantSummaryOps[Self <: NonCompliantSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNonCompliantCount(value: ComplianceSummaryCount): Self = this.set("NonCompliantCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonCompliantCount: Self = this.set("NonCompliantCount", js.undefined)
    
    @scala.inline
    def setSeveritySummary(value: SeveritySummary): Self = this.set("SeveritySummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeveritySummary: Self = this.set("SeveritySummary", js.undefined)
  }
}
