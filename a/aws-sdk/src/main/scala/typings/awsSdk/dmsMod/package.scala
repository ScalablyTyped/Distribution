package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dmsMod {
  type AccountQuotaList = js.Array[typings.awsSdk.dmsMod.AccountQuota]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.default_
    - typings.awsSdk.awsSdkStrings.mongodb_cr
    - typings.awsSdk.awsSdkStrings.scram_sha_1
    - java.lang.String
  */
  type AuthMechanismValue = typings.awsSdk.dmsMod._AuthMechanismValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.no_
    - typings.awsSdk.awsSdkStrings.password__
    - java.lang.String
  */
  type AuthTypeValue = typings.awsSdk.dmsMod._AuthTypeValue | java.lang.String
  type AvailabilityZonesList = js.Array[typings.awsSdk.dmsMod.String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CertificateList = js.Array[typings.awsSdk.dmsMod.Certificate]
  type CertificateWallet = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.dmsMod.Blob | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.dmsMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.gzip__
    - java.lang.String
  */
  type CompressionTypeValue = typings.awsSdk.dmsMod._CompressionTypeValue | java.lang.String
  type ConnectionList = js.Array[typings.awsSdk.dmsMod.Connection]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.csv_
    - typings.awsSdk.awsSdkStrings.parquet_
    - java.lang.String
  */
  type DataFormatValue = typings.awsSdk.dmsMod._DataFormatValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.require__
    - typings.awsSdk.awsSdkStrings.`verify-ca`
    - typings.awsSdk.awsSdkStrings.`verify-full`
    - java.lang.String
  */
  type DmsSslModeValue = typings.awsSdk.dmsMod._DmsSslModeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.plain
    - typings.awsSdk.awsSdkStrings.`plain-dictionary`
    - typings.awsSdk.awsSdkStrings.`rle-dictionary`
    - java.lang.String
  */
  type EncodingTypeValue = typings.awsSdk.dmsMod._EncodingTypeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`sse-s3_`
    - typings.awsSdk.awsSdkStrings.`sse-kms_`
    - java.lang.String
  */
  type EncryptionModeValue = typings.awsSdk.dmsMod._EncryptionModeValue | java.lang.String
  type EndpointList = js.Array[typings.awsSdk.dmsMod.Endpoint]
  type EventCategoriesList = js.Array[typings.awsSdk.dmsMod.String]
  type EventCategoryGroupList = js.Array[typings.awsSdk.dmsMod.EventCategoryGroup]
  type EventList = js.Array[typings.awsSdk.dmsMod.Event]
  type EventSubscriptionsList = js.Array[typings.awsSdk.dmsMod.EventSubscription]
  type FilterList = js.Array[typings.awsSdk.dmsMod.Filter]
  type FilterValueList = js.Array[typings.awsSdk.dmsMod.String]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[typings.awsSdk.dmsMod.String]
  type Long = scala.Double
  type MessageFormatValue = typings.awsSdk.awsSdkStrings.json_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`full-load`
    - typings.awsSdk.awsSdkStrings.cdc
    - typings.awsSdk.awsSdkStrings.`full-load-and-cdc`
    - java.lang.String
  */
  type MigrationTypeValue = typings.awsSdk.dmsMod._MigrationTypeValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.none__
    - typings.awsSdk.awsSdkStrings.one
    - java.lang.String
  */
  type NestingLevelValue = typings.awsSdk.dmsMod._NestingLevelValue | java.lang.String
  type OrderableReplicationInstanceList = js.Array[typings.awsSdk.dmsMod.OrderableReplicationInstance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`parquet-1-0`
    - typings.awsSdk.awsSdkStrings.`parquet-2-0`
    - java.lang.String
  */
  type ParquetVersionValue = typings.awsSdk.dmsMod._ParquetVersionValue | java.lang.String
  type PendingMaintenanceActionDetails = js.Array[typings.awsSdk.dmsMod.PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[typings.awsSdk.dmsMod.ResourcePendingMaintenanceActions]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.successful__
    - typings.awsSdk.awsSdkStrings.failed__
    - typings.awsSdk.awsSdkStrings.refreshing
    - java.lang.String
  */
  type RefreshSchemasStatusTypeValue = typings.awsSdk.dmsMod._RefreshSchemasStatusTypeValue | java.lang.String
  type ReleaseStatusValues = typings.awsSdk.awsSdkStrings.beta_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`data-reload`
    - typings.awsSdk.awsSdkStrings.`validate-only`
    - java.lang.String
  */
  type ReloadOptionValue = typings.awsSdk.dmsMod._ReloadOptionValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.source_
    - typings.awsSdk.awsSdkStrings.target_
    - java.lang.String
  */
  type ReplicationEndpointTypeValue = typings.awsSdk.dmsMod._ReplicationEndpointTypeValue | java.lang.String
  type ReplicationInstanceList = js.Array[typings.awsSdk.dmsMod.ReplicationInstance]
  type ReplicationInstancePrivateIpAddressList = js.Array[typings.awsSdk.dmsMod.String]
  type ReplicationInstancePublicIpAddressList = js.Array[typings.awsSdk.dmsMod.String]
  type ReplicationInstanceTaskLogsList = js.Array[typings.awsSdk.dmsMod.ReplicationInstanceTaskLog]
  type ReplicationSubnetGroups = js.Array[typings.awsSdk.dmsMod.ReplicationSubnetGroup]
  type ReplicationTaskAssessmentResultList = js.Array[typings.awsSdk.dmsMod.ReplicationTaskAssessmentResult]
  type ReplicationTaskList = js.Array[typings.awsSdk.dmsMod.ReplicationTask]
  type SchemaList = js.Array[typings.awsSdk.dmsMod.String]
  type SecretString = java.lang.String
  type SourceIdsList = js.Array[typings.awsSdk.dmsMod.String]
  type SourceType = typings.awsSdk.awsSdkStrings.`replication-instance` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`start-replication`
    - typings.awsSdk.awsSdkStrings.`resume-processing`
    - typings.awsSdk.awsSdkStrings.`reload-target`
    - java.lang.String
  */
  type StartReplicationTaskTypeValue = typings.awsSdk.dmsMod._StartReplicationTaskTypeValue | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[typings.awsSdk.dmsMod.String]
  type SubnetList = js.Array[typings.awsSdk.dmsMod.Subnet]
  type SupportedEndpointTypeList = js.Array[typings.awsSdk.dmsMod.SupportedEndpointType]
  type TStamp = typings.std.Date
  type TableListToReload = js.Array[typings.awsSdk.dmsMod.TableToReload]
  type TableStatisticsList = js.Array[typings.awsSdk.dmsMod.TableStatistics]
  type TagList = js.Array[typings.awsSdk.dmsMod.Tag]
  type VpcSecurityGroupIdList = js.Array[typings.awsSdk.dmsMod.String]
  type VpcSecurityGroupMembershipList = js.Array[typings.awsSdk.dmsMod.VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-01-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.dmsMod._apiVersion | java.lang.String
}
