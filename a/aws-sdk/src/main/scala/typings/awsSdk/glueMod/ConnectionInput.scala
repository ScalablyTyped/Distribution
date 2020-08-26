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
    * The type of the connection. Currently, these types are supported:    JDBC - Designates a connection to a database through Java Database Connectivity (JDBC).    KAFKA - Designates a connection to an Apache Kafka streaming platform.    MONGODB - Designates a connection to a MongoDB document database.   SFTP is not supported.
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
  def apply(ConnectionProperties: ConnectionProperties, ConnectionType: ConnectionType, Name: NameString): ConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionProperties = ConnectionProperties.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInput]
  }
  @scala.inline
  implicit class ConnectionInputOps[Self <: ConnectionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectionProperties(value: ConnectionProperties): Self = this.set("ConnectionProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionType(value: ConnectionType): Self = this.set("ConnectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setMatchCriteriaVarargs(value: NameString*): Self = this.set("MatchCriteria", js.Array(value :_*))
    @scala.inline
    def setMatchCriteria(value: MatchCriteria): Self = this.set("MatchCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchCriteria: Self = this.set("MatchCriteria", js.undefined)
    @scala.inline
    def setPhysicalConnectionRequirements(value: PhysicalConnectionRequirements): Self = this.set("PhysicalConnectionRequirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysicalConnectionRequirements: Self = this.set("PhysicalConnectionRequirements", js.undefined)
  }
  
}

