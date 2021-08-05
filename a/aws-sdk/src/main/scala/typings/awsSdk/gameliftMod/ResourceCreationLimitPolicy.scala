package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceCreationLimitPolicy extends StObject {
  
  /**
    * The maximum number of game sessions that an individual can create during the policy period. 
    */
  var NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The time span used in evaluating the resource creation limit policy. 
    */
  var PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.undefined
}
object ResourceCreationLimitPolicy {
  
  inline def apply(): ResourceCreationLimitPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceCreationLimitPolicy]
  }
  
  extension [Self <: ResourceCreationLimitPolicy](x: Self) {
    
    inline def setNewGameSessionsPerCreator(value: WholeNumber): Self = StObject.set(x, "NewGameSessionsPerCreator", value.asInstanceOf[js.Any])
    
    inline def setNewGameSessionsPerCreatorUndefined: Self = StObject.set(x, "NewGameSessionsPerCreator", js.undefined)
    
    inline def setPolicyPeriodInMinutes(value: WholeNumber): Self = StObject.set(x, "PolicyPeriodInMinutes", value.asInstanceOf[js.Any])
    
    inline def setPolicyPeriodInMinutesUndefined: Self = StObject.set(x, "PolicyPeriodInMinutes", js.undefined)
  }
}
