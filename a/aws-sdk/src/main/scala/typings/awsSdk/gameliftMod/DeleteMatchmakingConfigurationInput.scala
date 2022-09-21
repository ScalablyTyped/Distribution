package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMatchmakingConfigurationInput extends StObject {
  
  /**
    * A unique identifier for the matchmaking configuration. You can use either the configuration name or ARN value.
    */
  var Name: MatchmakingConfigurationName
}
object DeleteMatchmakingConfigurationInput {
  
  inline def apply(Name: MatchmakingConfigurationName): DeleteMatchmakingConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMatchmakingConfigurationInput]
  }
  
  extension [Self <: DeleteMatchmakingConfigurationInput](x: Self) {
    
    inline def setName(value: MatchmakingConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
