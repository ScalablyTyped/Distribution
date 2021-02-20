package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePublishingDestinationResponse extends StObject {
  
  /**
    * The ID of the publishing destination that is created.
    */
  var DestinationId: String = js.native
}
object CreatePublishingDestinationResponse {
  
  @scala.inline
  def apply(DestinationId: String): CreatePublishingDestinationResponse = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublishingDestinationResponse]
  }
  
  @scala.inline
  implicit class CreatePublishingDestinationResponseMutableBuilder[Self <: CreatePublishingDestinationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationId(value: String): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
  }
}
