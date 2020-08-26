package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineAnalysisSchemeResponse extends js.Object {
  var AnalysisScheme: AnalysisSchemeStatus = js.native
}

object DefineAnalysisSchemeResponse {
  @scala.inline
  def apply(AnalysisScheme: AnalysisSchemeStatus): DefineAnalysisSchemeResponse = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAnalysisSchemeResponse]
  }
  @scala.inline
  implicit class DefineAnalysisSchemeResponseOps[Self <: DefineAnalysisSchemeResponse] (val x: Self) extends AnyVal {
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
    def setAnalysisScheme(value: AnalysisSchemeStatus): Self = this.set("AnalysisScheme", value.asInstanceOf[js.Any])
  }
  
}

