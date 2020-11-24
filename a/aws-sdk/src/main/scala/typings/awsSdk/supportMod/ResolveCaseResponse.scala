package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolveCaseResponse extends js.Object {
  
  /**
    * The status of the case after the ResolveCase request was processed.
    */
  var finalCaseStatus: js.UndefOr[CaseStatus] = js.native
  
  /**
    * The status of the case when the ResolveCase request was sent.
    */
  var initialCaseStatus: js.UndefOr[CaseStatus] = js.native
}
object ResolveCaseResponse {
  
  @scala.inline
  def apply(): ResolveCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveCaseResponse]
  }
  
  @scala.inline
  implicit class ResolveCaseResponseOps[Self <: ResolveCaseResponse] (val x: Self) extends AnyVal {
    
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
    def setFinalCaseStatus(value: CaseStatus): Self = this.set("finalCaseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalCaseStatus: Self = this.set("finalCaseStatus", js.undefined)
    
    @scala.inline
    def setInitialCaseStatus(value: CaseStatus): Self = this.set("initialCaseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialCaseStatus: Self = this.set("initialCaseStatus", js.undefined)
  }
}
