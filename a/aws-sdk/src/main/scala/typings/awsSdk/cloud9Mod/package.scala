package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloud9Mod {
  
  type AutomaticStopTimeMinutes = scala.Double
  
  type BoundedEnvironmentIdList = js.Array[typings.awsSdk.cloud9Mod.EnvironmentId]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cloud9Mod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CONNECT_SSH
    - typings.awsSdk.awsSdkStrings.CONNECT_SSM
    - java.lang.String
  */
  type ConnectionType = typings.awsSdk.cloud9Mod._ConnectionType | java.lang.String
  
  type EnvironmentArn = java.lang.String
  
  type EnvironmentDescription = java.lang.String
  
  type EnvironmentId = java.lang.String
  
  type EnvironmentIdList = js.Array[typings.awsSdk.cloud9Mod.EnvironmentId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type EnvironmentLifecycleStatus = typings.awsSdk.cloud9Mod._EnvironmentLifecycleStatus | java.lang.String
  
  type EnvironmentList = js.Array[typings.awsSdk.cloud9Mod.Environment]
  
  type EnvironmentMembersList = js.Array[typings.awsSdk.cloud9Mod.EnvironmentMember]
  
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
  type EnvironmentStatus = typings.awsSdk.cloud9Mod._EnvironmentStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ssh_
    - typings.awsSdk.awsSdkStrings.ec2_
    - java.lang.String
  */
  type EnvironmentType = typings.awsSdk.cloud9Mod._EnvironmentType | java.lang.String
  
  type InstanceType = java.lang.String
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`read-write`
    - typings.awsSdk.awsSdkStrings.`read-only`
    - java.lang.String
  */
  type MemberPermissions = typings.awsSdk.cloud9Mod._MemberPermissions | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.owner__
    - typings.awsSdk.awsSdkStrings.`read-write`
    - typings.awsSdk.awsSdkStrings.`read-only`
    - java.lang.String
  */
  type Permissions = typings.awsSdk.cloud9Mod._Permissions | java.lang.String
  
  type PermissionsList = js.Array[typings.awsSdk.cloud9Mod.Permissions]
  
  type String = java.lang.String
  
  type SubnetId = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.cloud9Mod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.cloud9Mod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = typings.std.Date
  
  type UserArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-09-23`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cloud9Mod._apiVersion | java.lang.String
}
