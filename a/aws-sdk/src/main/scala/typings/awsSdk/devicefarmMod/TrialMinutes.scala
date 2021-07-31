package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrialMinutes extends StObject {
  
  /**
    * The number of free trial minutes remaining in the account.
    */
  var remaining: js.UndefOr[Double] = js.undefined
  
  /**
    * The total number of free trial minutes that the account started with.
    */
  var total: js.UndefOr[Double] = js.undefined
}
object TrialMinutes {
  
  @scala.inline
  def apply(): TrialMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialMinutes]
  }
  
  @scala.inline
  implicit class TrialMinutesMutableBuilder[Self <: TrialMinutes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
