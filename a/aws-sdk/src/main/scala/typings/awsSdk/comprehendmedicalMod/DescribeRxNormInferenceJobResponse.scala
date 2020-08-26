package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRxNormInferenceJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a detection job.
    */
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobProperties] = js.native
}

object DescribeRxNormInferenceJobResponse {
  @scala.inline
  def apply(): DescribeRxNormInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRxNormInferenceJobResponse]
  }
  @scala.inline
  implicit class DescribeRxNormInferenceJobResponseOps[Self <: DescribeRxNormInferenceJobResponse] (val x: Self) extends AnyVal {
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
    def setComprehendMedicalAsyncJobProperties(value: ComprehendMedicalAsyncJobProperties): Self = this.set("ComprehendMedicalAsyncJobProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComprehendMedicalAsyncJobProperties: Self = this.set("ComprehendMedicalAsyncJobProperties", js.undefined)
  }
  
}

