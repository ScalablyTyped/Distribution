package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactAttributesRequest extends StObject {
  
  /**
    * The identifier of the initial contact.
    */
  var InitialContactId: ContactId
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typings.awsSdk.connectMod.InstanceId
}
object GetContactAttributesRequest {
  
  @scala.inline
  def apply(InitialContactId: ContactId, InstanceId: InstanceId): GetContactAttributesRequest = {
    val __obj = js.Dynamic.literal(InitialContactId = InitialContactId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactAttributesRequest]
  }
  
  @scala.inline
  implicit class GetContactAttributesRequestMutableBuilder[Self <: GetContactAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialContactId(value: ContactId): Self = StObject.set(x, "InitialContactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
