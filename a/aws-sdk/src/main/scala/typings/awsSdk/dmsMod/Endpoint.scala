package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint extends js.Object {
  /**
    * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The name of the database at the endpoint.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  /**
    * The settings in JSON format for the DMS transfer type of source endpoint.  Possible settings include the following:    ServiceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.    BucketName - The name of the S3 bucket to use.    CompressionType - An optional parameter to use GZIP to compress the target files. To use GZIP, set this value to NONE (the default). To keep the files uncompressed, don't use this value.   Shorthand syntax for these settings is as follows: ServiceAccessRoleArn=string,BucketName=string,CompressionType=string  JSON syntax for these settings is as follows: { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }  
    */
  var DmsTransferSettings: js.UndefOr[typings.awsSdk.dmsMod.DmsTransferSettings] = js.native
  /**
    * The settings for the DynamoDB target endpoint. For more information, see the DynamoDBSettings structure.
    */
  var DynamoDbSettings: js.UndefOr[typings.awsSdk.dmsMod.DynamoDbSettings] = js.native
  /**
    * The settings for the Elasticsearch source endpoint. For more information, see the ElasticsearchSettings structure.
    */
  var ElasticsearchSettings: js.UndefOr[typings.awsSdk.dmsMod.ElasticsearchSettings] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.native
  /**
    * The database endpoint identifier. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.native
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.native
  /**
    * The expanded name for the engine name. For example, if the EngineName parameter is "aurora," this value would be "Amazon Aurora MySQL."
    */
  var EngineDisplayName: js.UndefOr[String] = js.native
  /**
    * The database engine name. Valid values, depending on the EndpointType, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "redshift", "s3", "db2", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "documentdb", "sqlserver", and "neptune".
    */
  var EngineName: js.UndefOr[String] = js.native
  /**
    *  Value returned by a call to CreateEndpoint that can be used for cross-account validation. Use it on a subsequent call to CreateEndpoint to create the endpoint with a cross-account. 
    */
  var ExternalId: js.UndefOr[String] = js.native
  /**
    * The external table definition.
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.native
  /**
    * Additional connection attributes used to connect to the endpoint.
    */
  var ExtraConnectionAttributes: js.UndefOr[String] = js.native
  /**
    * The settings for the IBM Db2 LUW source endpoint. For more information, see the IBMDb2Settings structure. 
    */
  var IBMDb2Settings: js.UndefOr[typings.awsSdk.dmsMod.IBMDb2Settings] = js.native
  /**
    * The settings for the Apache Kafka target endpoint. For more information, see the KafkaSettings structure.
    */
  var KafkaSettings: js.UndefOr[typings.awsSdk.dmsMod.KafkaSettings] = js.native
  /**
    * The settings for the Amazon Kinesis target endpoint. For more information, see the KinesisSettings structure.
    */
  var KinesisSettings: js.UndefOr[typings.awsSdk.dmsMod.KinesisSettings] = js.native
  /**
    * An AWS KMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The settings for the Microsoft SQL Server source and target endpoint. For more information, see the MicrosoftSQLServerSettings structure.
    */
  var MicrosoftSQLServerSettings: js.UndefOr[typings.awsSdk.dmsMod.MicrosoftSQLServerSettings] = js.native
  /**
    * The settings for the MongoDB source endpoint. For more information, see the MongoDbSettings structure.
    */
  var MongoDbSettings: js.UndefOr[typings.awsSdk.dmsMod.MongoDbSettings] = js.native
  /**
    * The settings for the MySQL source and target endpoint. For more information, see the MySQLSettings structure.
    */
  var MySQLSettings: js.UndefOr[typings.awsSdk.dmsMod.MySQLSettings] = js.native
  /**
    * The settings for the Amazon Neptune target endpoint. For more information, see the NeptuneSettings structure.
    */
  var NeptuneSettings: js.UndefOr[typings.awsSdk.dmsMod.NeptuneSettings] = js.native
  /**
    * The settings for the Oracle source and target endpoint. For more information, see the OracleSettings structure.
    */
  var OracleSettings: js.UndefOr[typings.awsSdk.dmsMod.OracleSettings] = js.native
  /**
    * The port value used to access the endpoint.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * The settings for the PostgreSQL source and target endpoint. For more information, see the PostgreSQLSettings structure.
    */
  var PostgreSQLSettings: js.UndefOr[typings.awsSdk.dmsMod.PostgreSQLSettings] = js.native
  /**
    * Settings for the Amazon Redshift endpoint.
    */
  var RedshiftSettings: js.UndefOr[typings.awsSdk.dmsMod.RedshiftSettings] = js.native
  /**
    * The settings for the S3 target endpoint. For more information, see the S3Settings structure.
    */
  var S3Settings: js.UndefOr[typings.awsSdk.dmsMod.S3Settings] = js.native
  /**
    * The name of the server at the endpoint.
    */
  var ServerName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) used by the service access IAM role.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * The SSL mode used to connect to the endpoint. The default value is none.
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.native
  /**
    * The status of the endpoint.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The settings for the SAP ASE source and target endpoint. For more information, see the SybaseSettings structure.
    */
  var SybaseSettings: js.UndefOr[typings.awsSdk.dmsMod.SybaseSettings] = js.native
  /**
    * The user name used to connect to the endpoint.
    */
  var Username: js.UndefOr[String] = js.native
}

object Endpoint {
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
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
    def setCertificateArn(value: String): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("CertificateArn", js.undefined)
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    @scala.inline
    def setDmsTransferSettings(value: DmsTransferSettings): Self = this.set("DmsTransferSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDmsTransferSettings: Self = this.set("DmsTransferSettings", js.undefined)
    @scala.inline
    def setDynamoDbSettings(value: DynamoDbSettings): Self = this.set("DynamoDbSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamoDbSettings: Self = this.set("DynamoDbSettings", js.undefined)
    @scala.inline
    def setElasticsearchSettings(value: ElasticsearchSettings): Self = this.set("ElasticsearchSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchSettings: Self = this.set("ElasticsearchSettings", js.undefined)
    @scala.inline
    def setEndpointArn(value: String): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointArn: Self = this.set("EndpointArn", js.undefined)
    @scala.inline
    def setEndpointIdentifier(value: String): Self = this.set("EndpointIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointIdentifier: Self = this.set("EndpointIdentifier", js.undefined)
    @scala.inline
    def setEndpointType(value: ReplicationEndpointTypeValue): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointType: Self = this.set("EndpointType", js.undefined)
    @scala.inline
    def setEngineDisplayName(value: String): Self = this.set("EngineDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineDisplayName: Self = this.set("EngineDisplayName", js.undefined)
    @scala.inline
    def setEngineName(value: String): Self = this.set("EngineName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineName: Self = this.set("EngineName", js.undefined)
    @scala.inline
    def setExternalId(value: String): Self = this.set("ExternalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("ExternalId", js.undefined)
    @scala.inline
    def setExternalTableDefinition(value: String): Self = this.set("ExternalTableDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalTableDefinition: Self = this.set("ExternalTableDefinition", js.undefined)
    @scala.inline
    def setExtraConnectionAttributes(value: String): Self = this.set("ExtraConnectionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraConnectionAttributes: Self = this.set("ExtraConnectionAttributes", js.undefined)
    @scala.inline
    def setIBMDb2Settings(value: IBMDb2Settings): Self = this.set("IBMDb2Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIBMDb2Settings: Self = this.set("IBMDb2Settings", js.undefined)
    @scala.inline
    def setKafkaSettings(value: KafkaSettings): Self = this.set("KafkaSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKafkaSettings: Self = this.set("KafkaSettings", js.undefined)
    @scala.inline
    def setKinesisSettings(value: KinesisSettings): Self = this.set("KinesisSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisSettings: Self = this.set("KinesisSettings", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setMicrosoftSQLServerSettings(value: MicrosoftSQLServerSettings): Self = this.set("MicrosoftSQLServerSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrosoftSQLServerSettings: Self = this.set("MicrosoftSQLServerSettings", js.undefined)
    @scala.inline
    def setMongoDbSettings(value: MongoDbSettings): Self = this.set("MongoDbSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMongoDbSettings: Self = this.set("MongoDbSettings", js.undefined)
    @scala.inline
    def setMySQLSettings(value: MySQLSettings): Self = this.set("MySQLSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMySQLSettings: Self = this.set("MySQLSettings", js.undefined)
    @scala.inline
    def setNeptuneSettings(value: NeptuneSettings): Self = this.set("NeptuneSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeptuneSettings: Self = this.set("NeptuneSettings", js.undefined)
    @scala.inline
    def setOracleSettings(value: OracleSettings): Self = this.set("OracleSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOracleSettings: Self = this.set("OracleSettings", js.undefined)
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setPostgreSQLSettings(value: PostgreSQLSettings): Self = this.set("PostgreSQLSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostgreSQLSettings: Self = this.set("PostgreSQLSettings", js.undefined)
    @scala.inline
    def setRedshiftSettings(value: RedshiftSettings): Self = this.set("RedshiftSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedshiftSettings: Self = this.set("RedshiftSettings", js.undefined)
    @scala.inline
    def setS3Settings(value: S3Settings): Self = this.set("S3Settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Settings: Self = this.set("S3Settings", js.undefined)
    @scala.inline
    def setServerName(value: String): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerName: Self = this.set("ServerName", js.undefined)
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = this.set("ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccessRoleArn: Self = this.set("ServiceAccessRoleArn", js.undefined)
    @scala.inline
    def setSslMode(value: DmsSslModeValue): Self = this.set("SslMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslMode: Self = this.set("SslMode", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setSybaseSettings(value: SybaseSettings): Self = this.set("SybaseSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSybaseSettings: Self = this.set("SybaseSettings", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
  
}

