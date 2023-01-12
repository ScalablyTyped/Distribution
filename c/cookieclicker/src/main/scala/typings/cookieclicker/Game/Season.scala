package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Season extends StObject {
  
  var name: String
  
  /**
    * The message to display when the season ends
    */
  var over: String
  
  /**
    * The message to display when the season starts
    */
  var start: String
  
  /**
    * The name of the upgrade which triggers the season
    */
  var trigger: String
  
  /**
    * The upgrade which triggers the season
    */
  var triggerUpgrade: SeasonSwitch
}
object Season {
  
  inline def apply(name: String, over: String, start: String, trigger: String, triggerUpgrade: SeasonSwitch): Season = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any], triggerUpgrade = triggerUpgrade.asInstanceOf[js.Any])
    __obj.asInstanceOf[Season]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Season] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOver(value: String): Self = StObject.set(x, "over", value.asInstanceOf[js.Any])
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUpgrade(value: SeasonSwitch): Self = StObject.set(x, "triggerUpgrade", value.asInstanceOf[js.Any])
  }
}
