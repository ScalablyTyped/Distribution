package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RateIncreaseCriteria extends js.Object {
  
  /**
    * The threshold for number of notified things that will initiate the increase in rate of rollout.
    */
  var numberOfNotifiedThings: js.UndefOr[NumberOfThings] = js.native
  
  /**
    * The threshold for number of succeeded things that will initiate the increase in rate of rollout.
    */
  var numberOfSucceededThings: js.UndefOr[NumberOfThings] = js.native
}
object RateIncreaseCriteria {
  
  @scala.inline
  def apply(): RateIncreaseCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateIncreaseCriteria]
  }
  
  @scala.inline
  implicit class RateIncreaseCriteriaOps[Self <: RateIncreaseCriteria] (val x: Self) extends AnyVal {
    
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
    def setNumberOfNotifiedThings(value: NumberOfThings): Self = this.set("numberOfNotifiedThings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNotifiedThings: Self = this.set("numberOfNotifiedThings", js.undefined)
    
    @scala.inline
    def setNumberOfSucceededThings(value: NumberOfThings): Self = this.set("numberOfSucceededThings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfSucceededThings: Self = this.set("numberOfSucceededThings", js.undefined)
  }
}
