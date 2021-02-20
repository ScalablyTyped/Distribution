package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMatchmakingConfigurationInput extends StObject {
  
  /**
    * A unique identifier for a matchmaking configuration. You can use either the configuration name or ARN value.
    */
  var Name: MatchmakingConfigurationName = js.native
}
object DeleteMatchmakingConfigurationInput {
  
  @scala.inline
  def apply(Name: MatchmakingConfigurationName): DeleteMatchmakingConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMatchmakingConfigurationInput]
  }
  
  @scala.inline
  implicit class DeleteMatchmakingConfigurationInputMutableBuilder[Self <: DeleteMatchmakingConfigurationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: MatchmakingConfigurationName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
