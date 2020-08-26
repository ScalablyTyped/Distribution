package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAnalysisSchemeRequest extends js.Object {
  /**
    * The name of the analysis scheme you want to delete.
    */
  var AnalysisSchemeName: StandardName = js.native
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}

object DeleteAnalysisSchemeRequest {
  @scala.inline
  def apply(AnalysisSchemeName: StandardName, DomainName: DomainName): DeleteAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisSchemeName = AnalysisSchemeName.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalysisSchemeRequest]
  }
  @scala.inline
  implicit class DeleteAnalysisSchemeRequestOps[Self <: DeleteAnalysisSchemeRequest] (val x: Self) extends AnyVal {
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
    def setAnalysisSchemeName(value: StandardName): Self = this.set("AnalysisSchemeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
  }
  
}

