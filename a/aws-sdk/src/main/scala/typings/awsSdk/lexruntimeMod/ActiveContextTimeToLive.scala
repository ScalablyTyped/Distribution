package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveContextTimeToLive extends js.Object {
  
  /**
    * The number of seconds that the context should be active after it is first sent in a PostContent or PostText response. You can set the value between 5 and 86,400 seconds (24 hours).
    */
  var timeToLiveInSeconds: js.UndefOr[ActiveContextTimeToLiveInSeconds] = js.native
  
  /**
    * The number of conversation turns that the context should be active. A conversation turn is one PostContent or PostText request and the corresponding response from Amazon Lex.
    */
  var turnsToLive: js.UndefOr[ActiveContextTurnsToLive] = js.native
}
object ActiveContextTimeToLive {
  
  @scala.inline
  def apply(): ActiveContextTimeToLive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveContextTimeToLive]
  }
  
  @scala.inline
  implicit class ActiveContextTimeToLiveOps[Self <: ActiveContextTimeToLive] (val x: Self) extends AnyVal {
    
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
    def setTimeToLiveInSeconds(value: ActiveContextTimeToLiveInSeconds): Self = this.set("timeToLiveInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLiveInSeconds: Self = this.set("timeToLiveInSeconds", js.undefined)
    
    @scala.inline
    def setTurnsToLive(value: ActiveContextTurnsToLive): Self = this.set("turnsToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTurnsToLive: Self = this.set("turnsToLive", js.undefined)
  }
}
