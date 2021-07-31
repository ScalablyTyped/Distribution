package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BackupId = java.lang.String

type BackupPolicy = typings.awsSdk.awsSdkStrings.DEFAULT | java.lang.String

type BackupRetentionType = typings.awsSdk.awsSdkStrings.DAYS | java.lang.String

type BackupRetentionValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.PENDING_DELETION
  - java.lang.String
*/
type BackupState = typings.awsSdk.cloudhsmv2Mod._BackupState | java.lang.String

type Backups = js.Array[typings.awsSdk.cloudhsmv2Mod.Backup]

type BackupsMaxSize = scala.Double

type Boolean = scala.Boolean

type Cert = java.lang.String

type ClusterId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UNINITIALIZED
  - typings.awsSdk.awsSdkStrings.INITIALIZE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.INITIALIZED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.DEGRADED
  - java.lang.String
*/
type ClusterState = typings.awsSdk.cloudhsmv2Mod._ClusterState | java.lang.String

type Clusters = js.Array[typings.awsSdk.cloudhsmv2Mod.Cluster]

type ClustersMaxSize = scala.Double

type EniId = java.lang.String

type ExternalAz = java.lang.String

type ExternalSubnetMapping = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudhsmv2Mod.SubnetId]

type Field = java.lang.String

type Filters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cloudhsmv2Mod.Strings]

type HsmId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DEGRADED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type HsmState = typings.awsSdk.cloudhsmv2Mod._HsmState | java.lang.String

type HsmType = java.lang.String

type Hsms = js.Array[typings.awsSdk.cloudhsmv2Mod.Hsm]

type IpAddress = java.lang.String

type MaxSize = scala.Double

type NextToken = java.lang.String

type PreCoPassword = java.lang.String

type Region = java.lang.String

type ResourceId = java.lang.String

type SecurityGroup = java.lang.String

type StateMessage = java.lang.String

type String = java.lang.String

type Strings = js.Array[typings.awsSdk.cloudhsmv2Mod.String]

type SubnetId = java.lang.String

type SubnetIds = js.Array[typings.awsSdk.cloudhsmv2Mod.SubnetId]

type TagKey = java.lang.String

type TagKeyList = js.Array[typings.awsSdk.cloudhsmv2Mod.TagKey]

type TagList = js.Array[typings.awsSdk.cloudhsmv2Mod.Tag]

type TagValue = java.lang.String

type Timestamp = typings.std.Date

type VpcId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-04-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.cloudhsmv2Mod._apiVersion | java.lang.String
