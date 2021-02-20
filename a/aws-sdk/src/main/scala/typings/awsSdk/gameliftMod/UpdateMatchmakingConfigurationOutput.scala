package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMatchmakingConfigurationOutput extends StObject {
  
  /**
    * The updated matchmaking configuration.
    */
  var Configuration: js.UndefOr[MatchmakingConfiguration] = js.native
}
object UpdateMatchmakingConfigurationOutput {
  
  @scala.inline
  def apply(): UpdateMatchmakingConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMatchmakingConfigurationOutput]
  }
  
  @scala.inline
  implicit class UpdateMatchmakingConfigurationOutputMutableBuilder[Self <: UpdateMatchmakingConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: MatchmakingConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
  }
}
