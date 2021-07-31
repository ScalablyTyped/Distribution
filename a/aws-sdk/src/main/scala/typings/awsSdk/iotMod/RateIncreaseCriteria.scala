package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RateIncreaseCriteria extends StObject {
  
  /**
    * The threshold for number of notified things that will initiate the increase in rate of rollout.
    */
  var numberOfNotifiedThings: js.UndefOr[NumberOfThings] = js.undefined
  
  /**
    * The threshold for number of succeeded things that will initiate the increase in rate of rollout.
    */
  var numberOfSucceededThings: js.UndefOr[NumberOfThings] = js.undefined
}
object RateIncreaseCriteria {
  
  @scala.inline
  def apply(): RateIncreaseCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateIncreaseCriteria]
  }
  
  @scala.inline
  implicit class RateIncreaseCriteriaMutableBuilder[Self <: RateIncreaseCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumberOfNotifiedThings(value: NumberOfThings): Self = StObject.set(x, "numberOfNotifiedThings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNotifiedThingsUndefined: Self = StObject.set(x, "numberOfNotifiedThings", js.undefined)
    
    @scala.inline
    def setNumberOfSucceededThings(value: NumberOfThings): Self = StObject.set(x, "numberOfSucceededThings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfSucceededThingsUndefined: Self = StObject.set(x, "numberOfSucceededThings", js.undefined)
  }
}
