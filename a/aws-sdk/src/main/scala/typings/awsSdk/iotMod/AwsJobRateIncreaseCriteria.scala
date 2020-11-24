package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsJobRateIncreaseCriteria extends js.Object {
  
  /**
    * When this number of things have been notified, it will initiate an increase in the rollout rate.
    */
  var numberOfNotifiedThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.native
  
  /**
    * When this number of things have succeeded in their job execution, it will initiate an increase in the rollout rate.
    */
  var numberOfSucceededThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.native
}
object AwsJobRateIncreaseCriteria {
  
  @scala.inline
  def apply(): AwsJobRateIncreaseCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobRateIncreaseCriteria]
  }
  
  @scala.inline
  implicit class AwsJobRateIncreaseCriteriaOps[Self <: AwsJobRateIncreaseCriteria] (val x: Self) extends AnyVal {
    
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
    def setNumberOfNotifiedThings(value: AwsJobRateIncreaseCriteriaNumberOfThings): Self = this.set("numberOfNotifiedThings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNotifiedThings: Self = this.set("numberOfNotifiedThings", js.undefined)
    
    @scala.inline
    def setNumberOfSucceededThings(value: AwsJobRateIncreaseCriteriaNumberOfThings): Self = this.set("numberOfSucceededThings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfSucceededThings: Self = this.set("numberOfSucceededThings", js.undefined)
  }
}
