package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Settings in JSON format for the target Apache Kafka endpoint. For more information about the available settings, see Using Apache Kafka as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var KafkaSettings: js.UndefOr[typings.awsSdk.dmsMod.KafkaSettings] = js.native
  /**
    * Settings in JSON format for the target endpoint for Amazon Kinesis Data Streams. For more information about the available settings, see Using Amazon Kinesis Data Streams as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var KinesisSettings: js.UndefOr[typings.awsSdk.dmsMod.KinesisSettings] = js.native
  /**
    * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see the configuration properties section in  Using MongoDB as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
    */
  var MongoDbSettings: js.UndefOr[typings.awsSdk.dmsMod.MongoDbSettings] = js.native
  /**
    * Settings in JSON format for the target Amazon Neptune endpoint. For more information about the available settings, see Specifying Endpoint Settings for Amazon Neptune as a Target in the AWS Database Migration Service User Guide. 
    */
  var NeptuneSettings: js.UndefOr[typings.awsSdk.dmsMod.NeptuneSettings] = js.native
  /**
    * The password to be used to login to the endpoint database.
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
    *  The Amazon Resource Name (ARN) for the service access role you want to use to modify the endpoint. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * The SSL mode used to connect to the endpoint. The default value is none.
    */
  var SslMode: js.UndefOr[DmsSslModeValue] = js.native
  /**
    * The user name to be used to login to the endpoint database.
    */
  var Username: js.UndefOr[String] = js.native
}

object ModifyEndpointMessage {
  @scala.inline
  def apply(
    EndpointArn: String,
    CertificateArn: String = null,
    DatabaseName: String = null,
    DmsTransferSettings: DmsTransferSettings = null,
    DynamoDbSettings: DynamoDbSettings = null,
    ElasticsearchSettings: ElasticsearchSettings = null,
    EndpointIdentifier: String = null,
    EndpointType: ReplicationEndpointTypeValue = null,
    EngineName: String = null,
    ExternalTableDefinition: String = null,
    ExtraConnectionAttributes: String = null,
    KafkaSettings: KafkaSettings = null,
    KinesisSettings: KinesisSettings = null,
    MongoDbSettings: MongoDbSettings = null,
    NeptuneSettings: NeptuneSettings = null,
    Password: SecretString = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    RedshiftSettings: RedshiftSettings = null,
    S3Settings: S3Settings = null,
    ServerName: String = null,
    ServiceAccessRoleArn: String = null,
    SslMode: DmsSslModeValue = null,
    Username: String = null
  ): ModifyEndpointMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (DatabaseName != null) __obj.updateDynamic("DatabaseName")(DatabaseName.asInstanceOf[js.Any])
    if (DmsTransferSettings != null) __obj.updateDynamic("DmsTransferSettings")(DmsTransferSettings.asInstanceOf[js.Any])
    if (DynamoDbSettings != null) __obj.updateDynamic("DynamoDbSettings")(DynamoDbSettings.asInstanceOf[js.Any])
    if (ElasticsearchSettings != null) __obj.updateDynamic("ElasticsearchSettings")(ElasticsearchSettings.asInstanceOf[js.Any])
    if (EndpointIdentifier != null) __obj.updateDynamic("EndpointIdentifier")(EndpointIdentifier.asInstanceOf[js.Any])
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (EngineName != null) __obj.updateDynamic("EngineName")(EngineName.asInstanceOf[js.Any])
    if (ExternalTableDefinition != null) __obj.updateDynamic("ExternalTableDefinition")(ExternalTableDefinition.asInstanceOf[js.Any])
    if (ExtraConnectionAttributes != null) __obj.updateDynamic("ExtraConnectionAttributes")(ExtraConnectionAttributes.asInstanceOf[js.Any])
    if (KafkaSettings != null) __obj.updateDynamic("KafkaSettings")(KafkaSettings.asInstanceOf[js.Any])
    if (KinesisSettings != null) __obj.updateDynamic("KinesisSettings")(KinesisSettings.asInstanceOf[js.Any])
    if (MongoDbSettings != null) __obj.updateDynamic("MongoDbSettings")(MongoDbSettings.asInstanceOf[js.Any])
    if (NeptuneSettings != null) __obj.updateDynamic("NeptuneSettings")(NeptuneSettings.asInstanceOf[js.Any])
    if (Password != null) __obj.updateDynamic("Password")(Password.asInstanceOf[js.Any])
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    if (RedshiftSettings != null) __obj.updateDynamic("RedshiftSettings")(RedshiftSettings.asInstanceOf[js.Any])
    if (S3Settings != null) __obj.updateDynamic("S3Settings")(S3Settings.asInstanceOf[js.Any])
    if (ServerName != null) __obj.updateDynamic("ServerName")(ServerName.asInstanceOf[js.Any])
    if (ServiceAccessRoleArn != null) __obj.updateDynamic("ServiceAccessRoleArn")(ServiceAccessRoleArn.asInstanceOf[js.Any])
    if (SslMode != null) __obj.updateDynamic("SslMode")(SslMode.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEndpointMessage]
  }
}

