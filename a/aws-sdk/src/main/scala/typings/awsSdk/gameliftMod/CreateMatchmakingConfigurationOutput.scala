package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMatchmakingConfigurationOutput extends StObject {
  
  /**
    * Object that describes the newly created matchmaking configuration.
    */
  var Configuration: js.UndefOr[MatchmakingConfiguration] = js.native
}
object CreateMatchmakingConfigurationOutput {
  
  @scala.inline
  def apply(): CreateMatchmakingConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMatchmakingConfigurationOutput]
  }
  
  @scala.inline
  implicit class CreateMatchmakingConfigurationOutputMutableBuilder[Self <: CreateMatchmakingConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: MatchmakingConfiguration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
  }
}
