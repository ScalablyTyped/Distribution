package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destination extends StObject {
  
  /**
    * The unique ID of the publishing destination.
    */
  var DestinationId: String = js.native
  
  /**
    * The type of resource used for the publishing destination. Currently, only Amazon S3 buckets are supported.
    */
  var DestinationType: typings.awsSdk.guarddutyMod.DestinationType = js.native
  
  /**
    * The status of the publishing destination.
    */
  var Status: PublishingStatus = js.native
}
object Destination {
  
  @scala.inline
  def apply(DestinationId: String, DestinationType: DestinationType, Status: PublishingStatus): Destination = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Destination]
  }
  
  @scala.inline
  implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationId(value: String): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationType(value: DestinationType): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PublishingStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
