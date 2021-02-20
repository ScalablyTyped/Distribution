package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionInput extends StObject {
  
  /**
    * These key-value pairs define parameters for the connection.
    */
  var ConnectionProperties: typings.awsSdk.glueMod.ConnectionProperties = js.native
  
  /**
    * The type of the connection. Currently, these types are supported:    JDBC - Designates a connection to a database through Java Database Connectivity (JDBC).    KAFKA - Designates a connection to an Apache Kafka streaming platform.    MONGODB - Designates a connection to a MongoDB document database.    NETWORK - Designates a network connection to a data source within an Amazon Virtual Private Cloud environment (Amazon VPC).   SFTP is not supported.
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
  implicit class ConnectionInputMutableBuilder[Self <: ConnectionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionProperties(value: ConnectionProperties): Self = StObject.set(x, "ConnectionProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionType(value: ConnectionType): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setMatchCriteria(value: MatchCriteria): Self = StObject.set(x, "MatchCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchCriteriaUndefined: Self = StObject.set(x, "MatchCriteria", js.undefined)
    
    @scala.inline
    def setMatchCriteriaVarargs(value: NameString*): Self = StObject.set(x, "MatchCriteria", js.Array(value :_*))
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalConnectionRequirements(value: PhysicalConnectionRequirements): Self = StObject.set(x, "PhysicalConnectionRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhysicalConnectionRequirementsUndefined: Self = StObject.set(x, "PhysicalConnectionRequirements", js.undefined)
  }
}
