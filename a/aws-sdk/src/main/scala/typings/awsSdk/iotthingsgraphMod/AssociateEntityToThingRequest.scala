package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateEntityToThingRequest extends js.Object {
  /**
    * The ID of the device to be associated with the thing. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME 
    */
  var entityId: Urn = js.native
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.native
  /**
    * The name of the thing to which the entity is to be associated.
    */
  var thingName: ThingName = js.native
}

object AssociateEntityToThingRequest {
  @scala.inline
  def apply(entityId: Urn, thingName: ThingName): AssociateEntityToThingRequest = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateEntityToThingRequest]
  }
  @scala.inline
  implicit class AssociateEntityToThingRequestOps[Self <: AssociateEntityToThingRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntityId(value: Urn): Self = this.set("entityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespaceVersion(value: Version): Self = this.set("namespaceVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespaceVersion: Self = this.set("namespaceVersion", js.undefined)
  }
  
}

