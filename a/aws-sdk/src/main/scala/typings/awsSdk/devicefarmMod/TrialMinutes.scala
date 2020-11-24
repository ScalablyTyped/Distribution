package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrialMinutes extends js.Object {
  
  /**
    * The number of free trial minutes remaining in the account.
    */
  var remaining: js.UndefOr[Double] = js.native
  
  /**
    * The total number of free trial minutes that the account started with.
    */
  var total: js.UndefOr[Double] = js.native
}
object TrialMinutes {
  
  @scala.inline
  def apply(): TrialMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialMinutes]
  }
  
  @scala.inline
  implicit class TrialMinutesOps[Self <: TrialMinutes] (val x: Self) extends AnyVal {
    
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
    def setRemaining(value: Double): Self = this.set("remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemaining: Self = this.set("remaining", js.undefined)
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
