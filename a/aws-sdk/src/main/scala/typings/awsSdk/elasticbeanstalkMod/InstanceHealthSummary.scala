package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceHealthSummary extends js.Object {
  /**
    *  Red. The health agent is reporting a high number of request failures or other issues for an instance or environment.
    */
  var Degraded: js.UndefOr[NullableInteger] = js.native
  /**
    *  Green. An operation is in progress on an instance.
    */
  var Info: js.UndefOr[NullableInteger] = js.native
  /**
    *  Grey. AWS Elastic Beanstalk and the health agent are reporting no data on an instance.
    */
  var NoData: js.UndefOr[NullableInteger] = js.native
  /**
    *  Green. An instance is passing health checks and the health agent is not reporting any problems.
    */
  var Ok: js.UndefOr[NullableInteger] = js.native
  /**
    *  Grey. An operation is in progress on an instance within the command timeout.
    */
  var Pending: js.UndefOr[NullableInteger] = js.native
  /**
    *  Red. The health agent is reporting a very high number of request failures or other issues for an instance or environment.
    */
  var Severe: js.UndefOr[NullableInteger] = js.native
  /**
    *  Grey. AWS Elastic Beanstalk and the health agent are reporting an insufficient amount of data on an instance.
    */
  var Unknown: js.UndefOr[NullableInteger] = js.native
  /**
    *  Yellow. The health agent is reporting a moderate number of request failures or other issues for an instance or environment.
    */
  var Warning: js.UndefOr[NullableInteger] = js.native
}

object InstanceHealthSummary {
  @scala.inline
  def apply(): InstanceHealthSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceHealthSummary]
  }
  @scala.inline
  implicit class InstanceHealthSummaryOps[Self <: InstanceHealthSummary] (val x: Self) extends AnyVal {
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
    def setDegraded(value: NullableInteger): Self = this.set("Degraded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDegraded: Self = this.set("Degraded", js.undefined)
    @scala.inline
    def setInfo(value: NullableInteger): Self = this.set("Info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("Info", js.undefined)
    @scala.inline
    def setNoData(value: NullableInteger): Self = this.set("NoData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoData: Self = this.set("NoData", js.undefined)
    @scala.inline
    def setOk(value: NullableInteger): Self = this.set("Ok", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOk: Self = this.set("Ok", js.undefined)
    @scala.inline
    def setPending(value: NullableInteger): Self = this.set("Pending", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePending: Self = this.set("Pending", js.undefined)
    @scala.inline
    def setSevere(value: NullableInteger): Self = this.set("Severe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSevere: Self = this.set("Severe", js.undefined)
    @scala.inline
    def setUnknown(value: NullableInteger): Self = this.set("Unknown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknown: Self = this.set("Unknown", js.undefined)
    @scala.inline
    def setWarning(value: NullableInteger): Self = this.set("Warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("Warning", js.undefined)
  }
  
}

