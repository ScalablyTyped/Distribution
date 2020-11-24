package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeTrialRequest extends js.Object {
  
  /**
    * The name of the trial to describe.
    */
  var TrialName: ExperimentEntityName = js.native
}
object DescribeTrialRequest {
  
  @scala.inline
  def apply(TrialName: ExperimentEntityName): DescribeTrialRequest = {
    val __obj = js.Dynamic.literal(TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTrialRequest]
  }
  
  @scala.inline
  implicit class DescribeTrialRequestOps[Self <: DescribeTrialRequest] (val x: Self) extends AnyVal {
    
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
    def setTrialName(value: ExperimentEntityName): Self = this.set("TrialName", value.asInstanceOf[js.Any])
  }
}
