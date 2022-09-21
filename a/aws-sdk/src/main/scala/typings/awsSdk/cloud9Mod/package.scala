package typings.awsSdk.cloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AutomaticStopTimeMinutes = Double

type BoundedEnvironmentIdList = js.Array[EnvironmentId]

type ClientRequestToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONNECT_SSH
  - typings.awsSdk.awsSdkStrings.CONNECT_SSM
  - java.lang.String
*/
type ConnectionType = _ConnectionType | java.lang.String

type EnvironmentArn = java.lang.String

type EnvironmentDescription = java.lang.String

type EnvironmentId = java.lang.String

type EnvironmentIdList = js.Array[EnvironmentId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type EnvironmentLifecycleStatus = _EnvironmentLifecycleStatus | java.lang.String

type EnvironmentList = js.Array[Environment]

type EnvironmentMembersList = js.Array[EnvironmentMember]

type EnvironmentName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.error__
  - typings.awsSdk.awsSdkStrings.creating__
  - typings.awsSdk.awsSdkStrings.connecting__
  - typings.awsSdk.awsSdkStrings.ready__
  - typings.awsSdk.awsSdkStrings.stopping__
  - typings.awsSdk.awsSdkStrings.stopped__
  - typings.awsSdk.awsSdkStrings.deleting__
  - java.lang.String
*/
type EnvironmentStatus = _EnvironmentStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ssh_
  - typings.awsSdk.awsSdkStrings.ec2_
  - java.lang.String
*/
type EnvironmentType = _EnvironmentType | java.lang.String

type ImageId = java.lang.String

type InstanceType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLE
  - typings.awsSdk.awsSdkStrings.DISABLE
  - java.lang.String
*/
type ManagedCredentialsAction = _ManagedCredentialsAction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED_ON_CREATE
  - typings.awsSdk.awsSdkStrings.ENABLED_BY_OWNER
  - typings.awsSdk.awsSdkStrings.DISABLED_BY_DEFAULT
  - typings.awsSdk.awsSdkStrings.DISABLED_BY_OWNER
  - typings.awsSdk.awsSdkStrings.DISABLED_BY_COLLABORATOR
  - typings.awsSdk.awsSdkStrings.PENDING_REMOVAL_BY_COLLABORATOR
  - typings.awsSdk.awsSdkStrings.PENDING_START_REMOVAL_BY_COLLABORATOR
  - typings.awsSdk.awsSdkStrings.PENDING_REMOVAL_BY_OWNER
  - typings.awsSdk.awsSdkStrings.PENDING_START_REMOVAL_BY_OWNER
  - typings.awsSdk.awsSdkStrings.FAILED_REMOVAL_BY_COLLABORATOR
  - typings.awsSdk.awsSdkStrings.FAILED_REMOVAL_BY_OWNER
  - java.lang.String
*/
type ManagedCredentialsStatus = _ManagedCredentialsStatus | java.lang.String

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`read-write`
  - typings.awsSdk.awsSdkStrings.`read-only`
  - java.lang.String
*/
type MemberPermissions = _MemberPermissions | java.lang.String

type NullableBoolean = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.owner__
  - typings.awsSdk.awsSdkStrings.`read-write`
  - typings.awsSdk.awsSdkStrings.`read-only`
  - java.lang.String
*/
type Permissions = _Permissions | java.lang.String

type PermissionsList = js.Array[Permissions]

type String = java.lang.String

type SubnetId = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type UserArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-09-23`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
