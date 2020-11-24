package typings.broadcastChannel.leaderElectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaderElectionOptions extends js.Object {
  
  /**
    * This value decides how often instances will renegotiate who is leader.
    * Probably should be at least 2x bigger than responseTime.
    */
  var fallbackInterval: js.UndefOr[Double] = js.native
  
  /**
    * This timer value is used when resolving which instance should be leader.
    * In case when your application elects more than one leader increase this value.
    */
  var responseTime: js.UndefOr[Double] = js.native
}
object LeaderElectionOptions {
  
  @scala.inline
  def apply(): LeaderElectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaderElectionOptions]
  }
  
  @scala.inline
  implicit class LeaderElectionOptionsOps[Self <: LeaderElectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFallbackInterval(value: Double): Self = this.set("fallbackInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallbackInterval: Self = this.set("fallbackInterval", js.undefined)
    
    @scala.inline
    def setResponseTime(value: Double): Self = this.set("responseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTime: Self = this.set("responseTime", js.undefined)
  }
}
