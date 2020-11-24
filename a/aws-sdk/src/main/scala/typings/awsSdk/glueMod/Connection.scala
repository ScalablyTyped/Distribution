package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  /**
    * These key-value pairs define parameters for the connection:    HOST - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the database host.    PORT - The port number, between 1024 and 65535, of the port on which the database host is listening for database connections.    USER_NAME - The name under which to log in to the database. The value string for USER_NAME is "USERNAME".    PASSWORD - A password, if one is used, for the user name.    ENCRYPTED_PASSWORD - When you enable connection password protection by setting ConnectionPasswordEncryption in the Data Catalog encryption settings, this field stores the encrypted password.    JDBC_DRIVER_JAR_URI - The Amazon Simple Storage Service (Amazon S3) path of the JAR file that contains the JDBC driver to use.    JDBC_DRIVER_CLASS_NAME - The class name of the JDBC driver to use.    JDBC_ENGINE - The name of the JDBC engine to use.    JDBC_ENGINE_VERSION - The version of the JDBC engine to use.    CONFIG_FILES - (Reserved for future use.)    INSTANCE_ID - The instance ID to use.    JDBC_CONNECTION_URL - The URL for connecting to a JDBC data source.    JDBC_ENFORCE_SSL - A Boolean string (true, false) specifying whether Secure Sockets Layer (SSL) with hostname matching is enforced for the JDBC connection on the client. The default is false.    CUSTOM_JDBC_CERT - An Amazon S3 location specifying the customer's root certificate. AWS Glue uses this root certificate to validate the customer’s certificate when connecting to the customer database. AWS Glue only handles X.509 certificates. The certificate provided must be DER-encoded and supplied in Base64 encoding PEM format.    SKIP_CUSTOM_JDBC_CERT_VALIDATION - By default, this is false. AWS Glue validates the Signature algorithm and Subject Public Key Algorithm for the customer certificate. The only permitted algorithms for the Signature algorithm are SHA256withRSA, SHA384withRSA or SHA512withRSA. For the Subject Public Key Algorithm, the key length must be at least 2048. You can set the value of this property to true to skip AWS Glue’s validation of the customer certificate.    CUSTOM_JDBC_CERT_STRING - A custom JDBC certificate string which is used for domain match or distinguished name match to prevent a man-in-the-middle attack. In Oracle database, this is used as the SSL_SERVER_CERT_DN; in Microsoft SQL Server, this is used as the hostNameInCertificate.    CONNECTION_URL - The URL for connecting to a general (non-JDBC) data source.    KAFKA_BOOTSTRAP_SERVERS - A comma-separated list of host and port pairs that are the addresses of the Apache Kafka brokers in a Kafka cluster to which a Kafka client will connect to and bootstrap itself.    KAFKA_SSL_ENABLED - Whether to enable or disable SSL on an Apache Kafka connection. Default value is "true".    KAFKA_CUSTOM_CERT - The Amazon S3 URL for the private CA cert file (.pem format). The default is an empty string.    KAFKA_SKIP_CUSTOM_CERT_VALIDATION - Whether to skip the validation of the CA cert file or not. AWS Glue validates for three algorithms: SHA256withRSA, SHA384withRSA and SHA512withRSA. Default value is "false".  
    */
  var ConnectionProperties: js.UndefOr[typings.awsSdk.glueMod.ConnectionProperties] = js.native
  
  /**
    * The type of the connection. Currently, SFTP is not supported.
    */
  var ConnectionType: js.UndefOr[typings.awsSdk.glueMod.ConnectionType] = js.native
  
  /**
    * The time that this connection definition was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the connection.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * The user, group, or role that last updated this connection definition.
    */
  var LastUpdatedBy: js.UndefOr[NameString] = js.native
  
  /**
    * The last time that this connection definition was updated.
    */
  var LastUpdatedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  var MatchCriteria: js.UndefOr[typings.awsSdk.glueMod.MatchCriteria] = js.native
  
  /**
    * The name of the connection definition.
    */
  var Name: js.UndefOr[NameString] = js.native
  
  /**
    * A map of physical connection requirements, such as virtual private cloud (VPC) and SecurityGroup, that are needed to make this connection successfully.
    */
  var PhysicalConnectionRequirements: js.UndefOr[typings.awsSdk.glueMod.PhysicalConnectionRequirements] = js.native
}
object Connection {
  
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    
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
    def deleteConnectionProperties: Self = this.set("ConnectionProperties", js.undefined)
    
    @scala.inline
    def setConnectionType(value: ConnectionType): Self = this.set("ConnectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionType: Self = this.set("ConnectionType", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setLastUpdatedBy(value: NameString): Self = this.set("LastUpdatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedBy: Self = this.set("LastUpdatedBy", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: Timestamp): Self = this.set("LastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("LastUpdatedTime", js.undefined)
    
    @scala.inline
    def setMatchCriteriaVarargs(value: NameString*): Self = this.set("MatchCriteria", js.Array(value :_*))
    
    @scala.inline
    def setMatchCriteria(value: MatchCriteria): Self = this.set("MatchCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchCriteria: Self = this.set("MatchCriteria", js.undefined)
    
    @scala.inline
    def setName(value: NameString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPhysicalConnectionRequirements(value: PhysicalConnectionRequirements): Self = this.set("PhysicalConnectionRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhysicalConnectionRequirements: Self = this.set("PhysicalConnectionRequirements", js.undefined)
  }
}
