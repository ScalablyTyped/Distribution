package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterEndpointMessage extends js.Object {
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String = js.native
  /**
    * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The type of the endpoint. One of: READER, WRITER, ANY.
    */
  var EndpointType: String = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.native
  /**
    * The tags to be assigned to the Amazon RDS resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBClusterEndpointMessage {
  @scala.inline
  def apply(
    DBClusterEndpointIdentifier: String,
    DBClusterIdentifier: String,
    EndpointType: String,
    ExcludedMembers: StringList = null,
    StaticMembers: StringList = null,
    Tags: TagList = null
  ): CreateDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier.asInstanceOf[js.Any], DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], EndpointType = EndpointType.asInstanceOf[js.Any])
    if (ExcludedMembers != null) __obj.updateDynamic("ExcludedMembers")(ExcludedMembers.asInstanceOf[js.Any])
    if (StaticMembers != null) __obj.updateDynamic("StaticMembers")(StaticMembers.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterEndpointMessage]
  }
}

