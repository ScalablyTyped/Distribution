package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBClusterEndpointMessage extends js.Object {
  /**
    * The identifier of the endpoint to modify. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String = js.native
  /**
    * The type of the endpoint. One of: READER, WRITER, ANY.
    */
  var EndpointType: js.UndefOr[String] = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.native
}

object ModifyDBClusterEndpointMessage {
  @scala.inline
  def apply(
    DBClusterEndpointIdentifier: String,
    EndpointType: String = null,
    ExcludedMembers: StringList = null,
    StaticMembers: StringList = null
  ): ModifyDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier.asInstanceOf[js.Any])
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (ExcludedMembers != null) __obj.updateDynamic("ExcludedMembers")(ExcludedMembers.asInstanceOf[js.Any])
    if (StaticMembers != null) __obj.updateDynamic("StaticMembers")(StaticMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterEndpointMessage]
  }
}

