package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementResponse extends StObject {
  
  /**
    * The name of the placement group that the instance is in.
    */
  var GroupName: js.UndefOr[String] = js.undefined
}
object PlacementResponse {
  
  @scala.inline
  def apply(): PlacementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementResponse]
  }
  
  @scala.inline
  implicit class PlacementResponseMutableBuilder[Self <: PlacementResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNameUndefined: Self = StObject.set(x, "GroupName", js.undefined)
  }
}
