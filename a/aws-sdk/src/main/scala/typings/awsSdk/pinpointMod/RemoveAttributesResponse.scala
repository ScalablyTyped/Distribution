package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveAttributesResponse extends StObject {
  
  var AttributesResource: typings.awsSdk.pinpointMod.AttributesResource
}
object RemoveAttributesResponse {
  
  @scala.inline
  def apply(AttributesResource: AttributesResource): RemoveAttributesResponse = {
    val __obj = js.Dynamic.literal(AttributesResource = AttributesResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveAttributesResponse]
  }
  
  @scala.inline
  implicit class RemoveAttributesResponseMutableBuilder[Self <: RemoveAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributesResource(value: AttributesResource): Self = StObject.set(x, "AttributesResource", value.asInstanceOf[js.Any])
  }
}
