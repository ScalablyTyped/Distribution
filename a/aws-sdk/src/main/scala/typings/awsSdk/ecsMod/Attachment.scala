package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachment extends js.Object {
  /**
    * Details of the attachment. For elastic network interfaces, this includes the network interface ID, the MAC address, the subnet ID, and the private IPv4 address.
    */
  var details: js.UndefOr[AttachmentDetails] = js.native
  /**
    * The unique identifier for the attachment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    *  The status of the attachment. Valid values are PRECREATED, CREATED, ATTACHING, ATTACHED, DETACHING, DETACHED, and DELETED.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The type of the attachment, such as ElasticNetworkInterface.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Attachment {
  @scala.inline
  def apply(details: AttachmentDetails = null, id: String = null, status: String = null, `type`: String = null): Attachment = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

