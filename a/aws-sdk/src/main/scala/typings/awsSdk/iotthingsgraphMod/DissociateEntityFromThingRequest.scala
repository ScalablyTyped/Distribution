package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DissociateEntityFromThingRequest extends js.Object {
  /**
    * The entity type from which to disassociate the thing.
    */
  var entityType: EntityType = js.native
  /**
    * The name of the thing to disassociate.
    */
  var thingName: ThingName = js.native
}

object DissociateEntityFromThingRequest {
  @scala.inline
  def apply(entityType: EntityType, thingName: ThingName): DissociateEntityFromThingRequest = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DissociateEntityFromThingRequest]
  }
}

