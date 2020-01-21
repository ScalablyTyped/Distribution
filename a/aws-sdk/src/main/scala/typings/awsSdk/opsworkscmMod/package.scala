package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object opsworkscmMod {
  type AWSOpsWorksCMResourceArn = java.lang.String
  type AccountAttributes = js.Array[typings.awsSdk.opsworkscmMod.AccountAttribute]
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type BackupId = java.lang.String
  type BackupRetentionCountDefinition = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.OK
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type BackupStatus = typings.awsSdk.opsworkscmMod._BackupStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AUTOMATED
    - typings.awsSdk.awsSdkStrings.MANUAL
    - java.lang.String
  */
  type BackupType = typings.awsSdk.opsworkscmMod._BackupType | java.lang.String
  type Backups = js.Array[typings.awsSdk.opsworkscmMod.Backup]
  type Boolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.opsworkscmMod.ClientApiVersions
  type CustomCertificate = java.lang.String
  type CustomDomain = java.lang.String
  type CustomPrivateKey = java.lang.String
  type EngineAttributeName = java.lang.String
  type EngineAttributeValue = java.lang.String
  type EngineAttributes = js.Array[typings.awsSdk.opsworkscmMod.EngineAttribute]
  type InstanceProfileArn = java.lang.String
  type Integer = scala.Double
  type KeyPair = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type MaintenanceStatus = typings.awsSdk.opsworkscmMod._MaintenanceStatus | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - java.lang.String
  */
  type NodeAssociationStatus = typings.awsSdk.opsworkscmMod._NodeAssociationStatus | java.lang.String
  type NodeAssociationStatusToken = java.lang.String
  type NodeName = java.lang.String
  type ServerEvents = js.Array[typings.awsSdk.opsworkscmMod.ServerEvent]
  type ServerName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BACKING_UP
    - typings.awsSdk.awsSdkStrings.CONNECTION_LOST
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.MODIFYING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.HEALTHY
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.RESTORING
    - typings.awsSdk.awsSdkStrings.SETUP
    - typings.awsSdk.awsSdkStrings.UNDER_MAINTENANCE
    - typings.awsSdk.awsSdkStrings.UNHEALTHY
    - typings.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type ServerStatus = typings.awsSdk.opsworkscmMod._ServerStatus | java.lang.String
  type Servers = js.Array[typings.awsSdk.opsworkscmMod.Server]
  type ServiceRoleArn = java.lang.String
  type String = java.lang.String
  type Strings = js.Array[typings.awsSdk.opsworkscmMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.opsworkscmMod.TagKey]
  type TagList = js.Array[typings.awsSdk.opsworkscmMod.Tag]
  type TagValue = java.lang.String
  type TimeWindowDefinition = java.lang.String
  type Timestamp = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-11-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.opsworkscmMod._apiVersion | java.lang.String
}
