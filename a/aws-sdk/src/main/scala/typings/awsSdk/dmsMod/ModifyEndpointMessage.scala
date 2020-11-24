package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyEndpointMessage extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the certificate used for SSL connection.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the endpoint database.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    * The settings in JSON format for the DMS transfer type of source endpoint.  Attributes include the following:   serviceAccessRoleArn - The AWS Identity and Access Management (IAM) role that has permission to access the Amazon S3 bucket.   BucketName - The name of the S3 bucket to use.   compressionType - An optional parameter to use GZIP to compress the target files. Either set this parameter to NONE (the default) or don't use it to leave the files uncompressed.   Shorthand syntax for these settings is as follows: ServiceAccessRoleArn=string ,BucketName=string,CompressionType=string  JSON syntax for these settings is as follows: { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }  
    */
  var DmsTransferSettings: js.UndefOr[typings.awsSdk.dmsMod.DmsTransferSettings] = js.native
  
  /**
    * Settings in JSON format for the source DocumentDB endpoint. For more information about the available settings, see the configuration properties section in  Using DocumentDB as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var DocDbSettings: js.UndefOr[typings.awsSdk.dmsMod.DocDbSettings] = js.native
  
  /**
    * Settings in JSON format for the target Amazon DynamoDB endpoint. For information about other available settings, see Using Object Mapping to Migrate Data to DynamoDB in the AWS Database Migration Service User Guide. 
    */
  var DynamoDbSettings: js.UndefOr[typings.awsSdk.dmsMod.DynamoDbSettings] = js.native
  
  /**
    * Settings in JSON format for the target Elasticsearch endpoint. For more information about the available settings, see Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var ElasticsearchSettings: js.UndefOr[typings.awsSdk.dmsMod.ElasticsearchSettings] = js.native
  
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: String = js.native
  
  /**
    * The database endpoint identifier. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.native
  
  /**
    * The type of engine for the endpoint. Valid values, depending on the EndpointType, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "redshift", "s3", "db2", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "documentdb", "sqlserver", and "neptune".
    */
  var EngineName: js.UndefOr[String] = js.native
  
  /**
    * The external table definition.
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.native
  
  /**
    * Additional attributes associated with the connection. To reset this parameter, pass the empty string ("") as an argument.
    */
  var ExtraConnectionAttributes: js.UndefOr[String] = js.native
  
  /**
    * Settings in JSON format for the source IBM Db2 LUW endpoint. For information about other available settings, see Extra connection attributes when using Db2 LUW as a source for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var IBMDb2Settings: js.UndefOr[typings.awsSdk.dmsMod.IBMDb2Settings] = js.native
  
  /**
    * Settings in JSON format for the target Apache Kafka endpoint. For more information about the available settings, see Using Apache Kafka as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var KafkaSettings: js.UndefOr[typings.awsSdk.dmsMod.KafkaSettings] = js.native
  
  /**
    * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams. For more information about the available settings, see Using Amazon Kinesis Data Streams as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var KinesisSettings: js.UndefOr[typings.awsSdk.dmsMod.KinesisSettings] = js.native
  
  /**
    * Settings in JSON format for the source and target Microsoft SQL Server endpoint. For information about other available settings, see Extra connection attributes when using SQL Server as a source for AWS DMS and  Extra connection attributes when using SQL Server as a target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var MicrosoftSQLServerSettings: js.UndefOr[typings.awsSdk.dmsMod.MicrosoftSQLServerSettings] = js.native
  
  /**
    * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see the configuration properties section in  Using MongoDB as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var MongoDbSettings: js.UndefOr[typings.awsSdk.dmsMod.MongoDbSettings] = js.native
  
  /**
    * Settings in JSON format for the source and target MySQL endpoint. For information about other available settings, see Extra connection attributes when using MySQL as a source for AWS DMS and Extra connection attributes when using a MySQL-compatible database as a target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var MySQLSettings: js.UndefOr[typings.awsSdk.dmsMod.MySQLSettings] = js.native
  
  /**
    * Settings in JSON format for the target Amazon Neptune endpoint. For more information about the available settings, see Specifying Endpoint Settings for Amazon Neptune as a Target in the AWS Database Migration Service User Guide. 
    */
  var NeptuneSettings: js.UndefOr[typings.awsSdk.dmsMod.NeptuneSettings] = js.native
  
  /**
    * Settings in JSON format for the source and target Oracle endpoint. For information about other available settings, see Extra connection attributes when using Oracle as a source for AWS DMS and  Extra connection attributes when using Oracle as a target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var OracleSettings: js.UndefOr[typings.awsSdk.dmsMod.OracleSettings] = js.native
  
  /**
    * The password to be used to login to the endpoint database.
    */
  var Password: js.UndefOr[SecretString] = js.native
  
  /**
    * The port used by the endpoint database.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * Settings in JSON format for the source and target PostgreSQL endpoint. For information about other available settings, see Extra connection attributes when using PostgreSQL as a source for AWS DMS and  Extra connection attributes when using PostgreSQL as a target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var PostgreSQLSettings: js.UndefOr[typings.awsSdk.dmsMod.PostgreSQLSettings] = js.native
  
  var RedshiftSettings: js.UndefOr[typings.awsSdk.dmsMod.RedshiftSettings] = js.native
  
  /**
    * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see Extra Connection Attributes When Using Amazon S3 as a Target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var S3Settings: js.UndefOr[typings.awsSdk.dmsMod.S3Settings] = js.native
  
  /**
    * The name of the server where the endpoint database resides.
    */
  var ServerName: js.UndefOr[String] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  
  /**
    * The SSL mode used to connect to the endpoint. The default value is none.
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.native
  
  /**
    * Settings in JSON format for the source and target SAP ASE endpoint. For information about other available settings, see Extra connection attributes when using SAP ASE as a source for AWS DMS and Extra connection attributes when using SAP ASE as a target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var SybaseSettings: js.UndefOr[typings.awsSdk.dmsMod.SybaseSettings] = js.native
  
  /**
    * The user name to be used to login to the endpoint database.
    */
  var Username: js.UndefOr[String] = js.native
}
object ModifyEndpointMessage {
  
  @scala.inline
  def apply(EndpointArn: String): ModifyEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEndpointMessage]
  }
  
  @scala.inline
  implicit class ModifyEndpointMessageOps[Self <: ModifyEndpointMessage] (val x: Self) extends AnyVal {
    
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
    def setEndpointArn(value: String): Self = this.set("EndpointArn", value.asInstanceOf[js.Any])
    
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
    def setDocDbSettings(value: DocDbSettings): Self = this.set("DocDbSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocDbSettings: Self = this.set("DocDbSettings", js.undefined)
    
    @scala.inline
    def setDynamoDbSettings(value: DynamoDbSettings): Self = this.set("DynamoDbSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamoDbSettings: Self = this.set("DynamoDbSettings", js.undefined)
    
    @scala.inline
    def setElasticsearchSettings(value: ElasticsearchSettings): Self = this.set("ElasticsearchSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticsearchSettings: Self = this.set("ElasticsearchSettings", js.undefined)
    
    @scala.inline
    def setEndpointIdentifier(value: String): Self = this.set("EndpointIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointIdentifier: Self = this.set("EndpointIdentifier", js.undefined)
    
    @scala.inline
    def setEndpointType(value: ReplicationEndpointTypeValue): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointType: Self = this.set("EndpointType", js.undefined)
    
    @scala.inline
    def setEngineName(value: String): Self = this.set("EngineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineName: Self = this.set("EngineName", js.undefined)
    
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
    def setPassword(value: SecretString): Self = this.set("Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("Password", js.undefined)
    
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
    def setSybaseSettings(value: SybaseSettings): Self = this.set("SybaseSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSybaseSettings: Self = this.set("SybaseSettings", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
