package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Season extends js.Object {
  
  var name: String = js.native
  
  /**
    * The message to display when the season ends
    */
  var over: String = js.native
  
  /**
    * The message to display when the season starts
    */
  var start: String = js.native
  
  /**
    * The name of the upgrade which triggers the season
    */
  var trigger: String = js.native
  
  /**
    * The upgrade which triggers the season
    */
  var triggerUpgrade: SeasonSwitch = js.native
}
object Season {
  
  @scala.inline
  def apply(name: String, over: String, start: String, trigger: String, triggerUpgrade: SeasonSwitch): Season = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], triggerUpgrade = triggerUpgrade.asInstanceOf[js.Any])
    __obj.asInstanceOf[Season]
  }
  
  @scala.inline
  implicit class SeasonOps[Self <: Season] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOver(value: String): Self = this.set("over", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUpgrade(value: SeasonSwitch): Self = this.set("triggerUpgrade", value.asInstanceOf[js.Any])
  }
}
