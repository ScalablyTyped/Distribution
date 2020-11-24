package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePHIDetectionJobResponse extends js.Object {
  
  /**
    * An object that contains the properties associated with a detection job.
    */
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[typings.awsSdk.comprehendmedicalMod.ComprehendMedicalAsyncJobProperties] = js.native
}
object DescribePHIDetectionJobResponse {
  
  @scala.inline
  def apply(): DescribePHIDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePHIDetectionJobResponse]
  }
  
  @scala.inline
  implicit class DescribePHIDetectionJobResponseOps[Self <: DescribePHIDetectionJobResponse] (val x: Self) extends AnyVal {
    
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
