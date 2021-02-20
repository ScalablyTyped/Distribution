package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFleetPortSettingsOutput extends StObject {
  
  /**
    * A unique identifier for a fleet that was updated.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
}
object UpdateFleetPortSettingsOutput {
  
  @scala.inline
  def apply(): UpdateFleetPortSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFleetPortSettingsOutput]
  }
  
  @scala.inline
  implicit class UpdateFleetPortSettingsOutputMutableBuilder[Self <: UpdateFleetPortSettingsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
