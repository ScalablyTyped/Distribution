package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEndpointMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the endpoint database.
    */
  var DatabaseName: js.UndefOr[String] = js.native
  
  /**
    * The settings in JSON format for the DMS transfer type of source endpoint.  Possible settings include the following:    ServiceAccessRoleArn - The IAM role that has permission to access the Amazon S3 bucket.    BucketName - The name of the S3 bucket to use.    CompressionType - An optional parameter to use GZIP to compress the target files. To use GZIP, set this value to NONE (the default). To keep the files uncompressed, don't use this value.   Shorthand syntax for these settings is as follows: ServiceAccessRoleArn=string,BucketName=string,CompressionType=string  JSON syntax for these settings is as follows: { "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" }  
    */
  var DmsTransferSettings: js.UndefOr[typings.awsSdk.dmsMod.DmsTransferSettings] = js.native
  
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
    * The database endpoint identifier. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
    */
  var EndpointIdentifier: String = js.native
  
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: ReplicationEndpointTypeValue = js.native
  
  /**
    * The type of engine for the endpoint. Valid values, depending on the EndpointType value, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "redshift", "s3", "db2", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "docdb", "sqlserver", and "neptune".
    */
  var EngineName: String = js.native
  
  /**
    * The external table definition. 
    */
  var ExternalTableDefinition: js.UndefOr[String] = js.native
  
  /**
    * Additional attributes associated with the connection. Each attribute is specified as a name-value pair associated by an equal sign (=). Multiple attributes are separated by a semicolon (;) with no additional white space. For information on the attributes available for connecting your source or target endpoint, see Working with AWS DMS Endpoints in the AWS Database Migration Service User Guide. 
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
    * An AWS KMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * Settings in JSON format for the source and target Microsoft SQL Server endpoint. For information about other available settings, see Extra connection attributes when using SQL Server as a source for AWS DMS and  Extra connection attributes when using SQL Server as a target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var MicrosoftSQLServerSettings: js.UndefOr[typings.awsSdk.dmsMod.MicrosoftSQLServerSettings] = js.native
  
  /**
    * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see Using MongoDB as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
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
    * The password to be used to log in to the endpoint database.
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
    * A friendly name for the resource identifier at the end of the EndpointArn response parameter that is returned in the created Endpoint object. The value for this parameter can have up to 31 characters. It can contain only ASCII letters, digits, and hyphen ('-'). Also, it can't end with a hyphen or contain two consecutive hyphens, and can only begin with a letter, such as Example-App-ARN1. For example, this value might result in the EndpointArn value arn:aws:dms:eu-west-1:012345678901:rep:Example-App-ARN1. If you don't specify a ResourceIdentifier value, AWS DMS generates a default identifier value for the end of EndpointArn.
    */
  var ResourceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see Extra Connection Attributes When Using Amazon S3 as a Target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var S3Settings: js.UndefOr[typings.awsSdk.dmsMod.S3Settings] = js.native
  
  /**
    * The name of the server where the endpoint database resides.
    */
  var ServerName: js.UndefOr[String] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) for the service access role that you want to use to create the endpoint. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  
  /**
    * The Secure Sockets Layer (SSL) mode to use for the SSL connection. The default is none 
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.native
  
  /**
    * Settings in JSON format for the source and target SAP ASE endpoint. For information about other available settings, see Extra connection attributes when using SAP ASE as a source for AWS DMS and Extra connection attributes when using SAP ASE as a target for AWS DMS in the AWS Database Migration Service User Guide. 
    */
  var SybaseSettings: js.UndefOr[typings.awsSdk.dmsMod.SybaseSettings] = js.native
  
  /**
    * One or more tags to be assigned to the endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The user name to be used to log in to the endpoint database.
    */
  var Username: js.UndefOr[String] = js.native
}
object CreateEndpointMessage {
  
  @scala.inline
  def apply(EndpointIdentifier: String, EndpointType: ReplicationEndpointTypeValue, EngineName: String): CreateEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointIdentifier = EndpointIdentifier.asInstanceOf[js.Any], EndpointType = EndpointType.asInstanceOf[js.Any], EngineName = EngineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointMessage]
  }
  
  @scala.inline
  implicit class CreateEndpointMessageMutableBuilder[Self <: CreateEndpointMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setDmsTransferSettings(value: DmsTransferSettings): Self = StObject.set(x, "DmsTransferSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDmsTransferSettingsUndefined: Self = StObject.set(x, "DmsTransferSettings", js.undefined)
    
    @scala.inline
    def setDocDbSettings(value: DocDbSettings): Self = StObject.set(x, "DocDbSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocDbSettingsUndefined: Self = StObject.set(x, "DocDbSettings", js.undefined)
    
    @scala.inline
    def setDynamoDbSettings(value: DynamoDbSettings): Self = StObject.set(x, "DynamoDbSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamoDbSettingsUndefined: Self = StObject.set(x, "DynamoDbSettings", js.undefined)
    
    @scala.inline
    def setElasticsearchSettings(value: ElasticsearchSettings): Self = StObject.set(x, "ElasticsearchSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchSettingsUndefined: Self = StObject.set(x, "ElasticsearchSettings", js.undefined)
    
    @scala.inline
    def setEndpointIdentifier(value: String): Self = StObject.set(x, "EndpointIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointType(value: ReplicationEndpointTypeValue): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineName(value: String): Self = StObject.set(x, "EngineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalTableDefinition(value: String): Self = StObject.set(x, "ExternalTableDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalTableDefinitionUndefined: Self = StObject.set(x, "ExternalTableDefinition", js.undefined)
    
    @scala.inline
    def setExtraConnectionAttributes(value: String): Self = StObject.set(x, "ExtraConnectionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraConnectionAttributesUndefined: Self = StObject.set(x, "ExtraConnectionAttributes", js.undefined)
    
    @scala.inline
    def setIBMDb2Settings(value: IBMDb2Settings): Self = StObject.set(x, "IBMDb2Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIBMDb2SettingsUndefined: Self = StObject.set(x, "IBMDb2Settings", js.undefined)
    
    @scala.inline
    def setKafkaSettings(value: KafkaSettings): Self = StObject.set(x, "KafkaSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKafkaSettingsUndefined: Self = StObject.set(x, "KafkaSettings", js.undefined)
    
    @scala.inline
    def setKinesisSettings(value: KinesisSettings): Self = StObject.set(x, "KinesisSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisSettingsUndefined: Self = StObject.set(x, "KinesisSettings", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setMicrosoftSQLServerSettings(value: MicrosoftSQLServerSettings): Self = StObject.set(x, "MicrosoftSQLServerSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrosoftSQLServerSettingsUndefined: Self = StObject.set(x, "MicrosoftSQLServerSettings", js.undefined)
    
    @scala.inline
    def setMongoDbSettings(value: MongoDbSettings): Self = StObject.set(x, "MongoDbSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMongoDbSettingsUndefined: Self = StObject.set(x, "MongoDbSettings", js.undefined)
    
    @scala.inline
    def setMySQLSettings(value: MySQLSettings): Self = StObject.set(x, "MySQLSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMySQLSettingsUndefined: Self = StObject.set(x, "MySQLSettings", js.undefined)
    
    @scala.inline
    def setNeptuneSettings(value: NeptuneSettings): Self = StObject.set(x, "NeptuneSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeptuneSettingsUndefined: Self = StObject.set(x, "NeptuneSettings", js.undefined)
    
    @scala.inline
    def setOracleSettings(value: OracleSettings): Self = StObject.set(x, "OracleSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOracleSettingsUndefined: Self = StObject.set(x, "OracleSettings", js.undefined)
    
    @scala.inline
    def setPassword(value: SecretString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setPostgreSQLSettings(value: PostgreSQLSettings): Self = StObject.set(x, "PostgreSQLSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostgreSQLSettingsUndefined: Self = StObject.set(x, "PostgreSQLSettings", js.undefined)
    
    @scala.inline
    def setRedshiftSettings(value: RedshiftSettings): Self = StObject.set(x, "RedshiftSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftSettingsUndefined: Self = StObject.set(x, "RedshiftSettings", js.undefined)
    
    @scala.inline
    def setResourceIdentifier(value: String): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifierUndefined: Self = StObject.set(x, "ResourceIdentifier", js.undefined)
    
    @scala.inline
    def setS3Settings(value: S3Settings): Self = StObject.set(x, "S3Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3SettingsUndefined: Self = StObject.set(x, "S3Settings", js.undefined)
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "ServerName", js.undefined)
    
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "ServiceAccessRoleArn", js.undefined)
    
    @scala.inline
    def setSslMode(value: DmsSslModeValue): Self = StObject.set(x, "SslMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslModeUndefined: Self = StObject.set(x, "SslMode", js.undefined)
    
    @scala.inline
    def setSybaseSettings(value: SybaseSettings): Self = StObject.set(x, "SybaseSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSybaseSettingsUndefined: Self = StObject.set(x, "SybaseSettings", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
