package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFleetResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the fleet.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.worklinkMod.FleetArn] = js.undefined
}
object CreateFleetResponse {
  
  @scala.inline
  def apply(): CreateFleetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetResponse]
  }
  
  @scala.inline
  implicit class CreateFleetResponseMutableBuilder[Self <: CreateFleetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
  }
}
