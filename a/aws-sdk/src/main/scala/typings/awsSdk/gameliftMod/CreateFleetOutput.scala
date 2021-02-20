package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateFleetOutput extends StObject {
  
  /**
    * Properties for the newly created fleet.
    */
  var FleetAttributes: js.UndefOr[typings.awsSdk.gameliftMod.FleetAttributes] = js.native
}
object CreateFleetOutput {
  
  @scala.inline
  def apply(): CreateFleetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetOutput]
  }
  
  @scala.inline
  implicit class CreateFleetOutputMutableBuilder[Self <: CreateFleetOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetAttributes(value: FleetAttributes): Self = StObject.set(x, "FleetAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetAttributesUndefined: Self = StObject.set(x, "FleetAttributes", js.undefined)
  }
}
