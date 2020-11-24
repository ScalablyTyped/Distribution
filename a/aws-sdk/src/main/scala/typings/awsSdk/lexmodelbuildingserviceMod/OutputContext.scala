package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputContext extends js.Object {
  
  /**
    * The name of the context.
    */
  var name: OutputContextName = js.native
  
  /**
    * The number of seconds that the context should be active after it is first sent in a PostContent or PostText response. You can set the value between 5 and 86,400 seconds (24 hours).
    */
  var timeToLiveInSeconds: ContextTimeToLiveInSeconds = js.native
  
  /**
    * The number of conversation turns that the context should be active. A conversation turn is one PostContent or PostText request and the corresponding response from Amazon Lex.
    */
  var turnsToLive: ContextTurnsToLive = js.native
}
object OutputContext {
  
  @scala.inline
  def apply(
    name: OutputContextName,
    timeToLiveInSeconds: ContextTimeToLiveInSeconds,
    turnsToLive: ContextTurnsToLive
  ): OutputContext = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], timeToLiveInSeconds = timeToLiveInSeconds.asInstanceOf[js.Any], turnsToLive = turnsToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputContext]
  }
  
  @scala.inline
  implicit class OutputContextOps[Self <: OutputContext] (val x: Self) extends AnyVal {
    
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
    def setName(value: OutputContextName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeToLiveInSeconds(value: ContextTimeToLiveInSeconds): Self = this.set("timeToLiveInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTurnsToLive(value: ContextTurnsToLive): Self = this.set("turnsToLive", value.asInstanceOf[js.Any])
  }
}
