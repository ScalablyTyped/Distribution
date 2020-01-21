package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointMessage extends js.Object {
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
  /**
    * Settings in JSON format for the target Amazon DynamoDB endpoint. For more information about the available settings, see Using Object Mapping to Migrate Data to DynamoDB in the AWS Database Migration Service User Guide. 
    */
  var DynamoDbSettings: js.UndefOr[typings.awsSdk.dmsMod.DynamoDbSettings] = js.native
  /**
    * Settings in JSON format for the target Elasticsearch endpoint. For more information about the available settings, see Extra Connection Attributes When Using Elasticsearch as a Target for AWS DMS in the AWS Database Migration User Guide. 
    */
  var ElasticsearchSettings: js.UndefOr[typings.awsSdk.dmsMod.ElasticsearchSettings] = js.native
  /**
    * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: String = js.native
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: ReplicationEndpointTypeValue = js.native
  /**
    * The type of engine for the endpoint. Valid values, depending on the EndpointType value, include mysql, oracle, postgres, mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, dynamodb, mongodb, and sqlserver.
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
    * Settings in JSON format for the target Amazon Kinesis Data Streams endpoint. For more information about the available settings, see Using Object Mapping to Migrate Data to a Kinesis Data Stream in the AWS Database Migration User Guide. 
    */
  var KinesisSettings: js.UndefOr[typings.awsSdk.dmsMod.KinesisSettings] = js.native
  /**
    * An AWS KMS key identifier that is used to encrypt the connection parameters for the endpoint. If you don't specify a value for the KmsKeyId parameter, then AWS DMS uses your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS Region.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see the configuration properties section in  Using MongoDB as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var MongoDbSettings: js.UndefOr[typings.awsSdk.dmsMod.MongoDbSettings] = js.native
  /**
    * The password to be used to log in to the endpoint database.
    */
  var Password: js.UndefOr[SecretString] = js.native
  /**
    * The port used by the endpoint database.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
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
    *  The Amazon Resource Name (ARN) for the service access role that you want to use to create the endpoint. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * The Secure Sockets Layer (SSL) mode to use for the SSL connection. The default is none 
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.native
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
  def apply(
    EndpointIdentifier: String,
    EndpointType: ReplicationEndpointTypeValue,
    EngineName: String,
    CertificateArn: String = null,
    DatabaseName: String = null,
    DmsTransferSettings: DmsTransferSettings = null,
    DynamoDbSettings: DynamoDbSettings = null,
    ElasticsearchSettings: ElasticsearchSettings = null,
    ExternalTableDefinition: String = null,
    ExtraConnectionAttributes: String = null,
    KinesisSettings: KinesisSettings = null,
    KmsKeyId: String = null,
    MongoDbSettings: MongoDbSettings = null,
    Password: SecretString = null,
    Port: Int | Double = null,
    RedshiftSettings: RedshiftSettings = null,
    S3Settings: S3Settings = null,
    ServerName: String = null,
    ServiceAccessRoleArn: String = null,
    SslMode: DmsSslModeValue = null,
    Tags: TagList = null,
    Username: String = null
  ): CreateEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointIdentifier = EndpointIdentifier.asInstanceOf[js.Any], EndpointType = EndpointType.asInstanceOf[js.Any], EngineName = EngineName.asInstanceOf[js.Any])
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (DmsTransferSettings != null) __obj.updateDynamic("DmsTransferSettings")(DmsTransferSettings.asInstanceOf[js.Any])
    if (DynamoDbSettings != null) __obj.updateDynamic("DynamoDbSettings")(DynamoDbSettings.asInstanceOf[js.Any])
    if (ElasticsearchSettings != null) __obj.updateDynamic("ElasticsearchSettings")(ElasticsearchSettings.asInstanceOf[js.Any])
    if (ExternalTableDefinition != null) __obj.updateDynamic("ExternalTableDefinition")(ExternalTableDefinition.asInstanceOf[js.Any])
    if (ExtraConnectionAttributes != null) __obj.updateDynamic("ExtraConnectionAttributes")(ExtraConnectionAttributes.asInstanceOf[js.Any])
    if (KinesisSettings != null) __obj.updateDynamic("KinesisSettings")(KinesisSettings.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (MongoDbSettings != null) __obj.updateDynamic("MongoDbSettings")(MongoDbSettings.asInstanceOf[js.Any])
    if (Password != null) __obj.updateDynamic("Password")(Password.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (RedshiftSettings != null) __obj.updateDynamic("RedshiftSettings")(RedshiftSettings.asInstanceOf[js.Any])
    if (S3Settings != null) __obj.updateDynamic("S3Settings")(S3Settings.asInstanceOf[js.Any])
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName.asInstanceOf[js.Any])
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn.asInstanceOf[js.Any])
    if (SslMode != null) __obj.updateDynamic("SslMode")(SslMode.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointMessage]
  }
}

