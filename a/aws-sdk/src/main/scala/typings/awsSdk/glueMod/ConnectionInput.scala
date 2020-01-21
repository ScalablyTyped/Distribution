package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionInput extends js.Object {
  /**
    * These key-value pairs define parameters for the connection.
    */
  var ConnectionProperties: typings.awsSdk.glueMod.ConnectionProperties = js.native
  /**
    * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
    */
  var ConnectionType: typings.awsSdk.glueMod.ConnectionType = js.native
  /**
    * The description of the connection.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  var MatchCriteria: js.UndefOr[typings.awsSdk.glueMod.MatchCriteria] = js.native
  /**
    * The name of the connection.
    */
  var Name: NameString = js.native
  /**
    * A map of physical connection requirements, such as virtual private cloud (VPC) and SecurityGroup, that are needed to successfully make this connection.
    */
  var PhysicalConnectionRequirements: js.UndefOr[typings.awsSdk.glueMod.PhysicalConnectionRequirements] = js.native
}

object ConnectionInput {
  @scala.inline
  def apply(
    ConnectionProperties: ConnectionProperties,
    ConnectionType: ConnectionType,
    Name: NameString,
    Description: DescriptionString = null,
    MatchCriteria: MatchCriteria = null,
    PhysicalConnectionRequirements: PhysicalConnectionRequirements = null
  ): ConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionProperties = ConnectionProperties.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (MatchCriteria != null) __obj.updateDynamic("MatchCriteria")(MatchCriteria.asInstanceOf[js.Any])
    if (PhysicalConnectionRequirements != null) __obj.updateDynamic("PhysicalConnectionRequirements")(PhysicalConnectionRequirements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInput]
  }
}

