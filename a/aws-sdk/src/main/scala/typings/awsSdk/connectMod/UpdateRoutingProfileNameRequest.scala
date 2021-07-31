package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoutingProfileNameRequest extends StObject {
  
  /**
    * The description of the routing profile. Must not be more than 250 characters.
    */
  var Description: js.UndefOr[RoutingProfileDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
  
  /**
    * The name of the routing profile. Must not be more than 127 characters.
    */
  var Name: js.UndefOr[RoutingProfileName] = js.undefined
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typings.awsSdk.connectMod.RoutingProfileId
}
object UpdateRoutingProfileNameRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, RoutingProfileId: RoutingProfileId): UpdateRoutingProfileNameRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoutingProfileNameRequest]
  }
  
  @scala.inline
  implicit class UpdateRoutingProfileNameRequestMutableBuilder[Self <: UpdateRoutingProfileNameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: RoutingProfileDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: RoutingProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
