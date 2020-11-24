package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object transferMod {
  
  type AddressAllocationId = java.lang.String
  
  type AddressAllocationIds = js.Array[typings.awsSdk.transferMod.AddressAllocationId]
  
  type Arn = java.lang.String
  
  type Certificate = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.transferMod.ClientApiVersions
  
  type DateImported = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PUBLIC
    - typings.awsSdk.awsSdkStrings.VPC
    - typings.awsSdk.awsSdkStrings.VPC_ENDPOINT
    - java.lang.String
  */
  type EndpointType = typings.awsSdk.transferMod._EndpointType | java.lang.String
  
  type Fips = scala.Boolean
  
  type HomeDirectory = java.lang.String
  
  type HomeDirectoryMappings = js.Array[typings.awsSdk.transferMod.HomeDirectoryMapEntry]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PATH
    - typings.awsSdk.awsSdkStrings.LOGICAL
    - java.lang.String
  */
  type HomeDirectoryType = typings.awsSdk.transferMod._HomeDirectoryType | java.lang.String
  
  type HostKey = java.lang.String
  
  type HostKeyFingerprint = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SERVICE_MANAGED
    - typings.awsSdk.awsSdkStrings.API_GATEWAY
    - java.lang.String
  */
  type IdentityProviderType = typings.awsSdk.transferMod._IdentityProviderType | java.lang.String
  
  type ListedServers = js.Array[typings.awsSdk.transferMod.ListedServer]
  
  type ListedUsers = js.Array[typings.awsSdk.transferMod.ListedUser]
  
  type MapEntry = java.lang.String
  
  type MapTarget = java.lang.String
  
  type MaxResults = scala.Double
  
  type Message = java.lang.String
  
  type NextToken = java.lang.String
  
  type NullableRole = java.lang.String
  
  type Policy = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SFTP
    - typings.awsSdk.awsSdkStrings.FTP
    - typings.awsSdk.awsSdkStrings.FTPS
    - java.lang.String
  */
  type Protocol = typings.awsSdk.transferMod._Protocol | java.lang.String
  
  type Protocols = js.Array[typings.awsSdk.transferMod.Protocol]
  
  type Response = java.lang.String
  
  type Role = java.lang.String
  
  type SecurityGroupId = java.lang.String
  
  type SecurityGroupIds = js.Array[typings.awsSdk.transferMod.SecurityGroupId]
  
  type SecurityPolicyName = java.lang.String
  
  type SecurityPolicyNames = js.Array[typings.awsSdk.transferMod.SecurityPolicyName]
  
  type SecurityPolicyOption = java.lang.String
  
  type SecurityPolicyOptions = js.Array[typings.awsSdk.transferMod.SecurityPolicyOption]
  
  type ServerId = java.lang.String
  
  type SourceIp = java.lang.String
  
  type SshPublicKeyBody = java.lang.String
  
  type SshPublicKeyCount = scala.Double
  
  type SshPublicKeyId = java.lang.String
  
  type SshPublicKeys = js.Array[typings.awsSdk.transferMod.SshPublicKey]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OFFLINE
    - typings.awsSdk.awsSdkStrings.ONLINE
    - typings.awsSdk.awsSdkStrings.STARTING
    - typings.awsSdk.awsSdkStrings.STOPPING
    - typings.awsSdk.awsSdkStrings.START_FAILED
    - typings.awsSdk.awsSdkStrings.STOP_FAILED
    - java.lang.String
  */
  type State = typings.awsSdk.transferMod._State | java.lang.String
  
  type StatusCode = scala.Double
  
  type SubnetId = java.lang.String
  
  type SubnetIds = js.Array[typings.awsSdk.transferMod.SubnetId]
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typings.awsSdk.transferMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typings.awsSdk.transferMod.Tag]
  
  type Url = java.lang.String
  
  type UserCount = scala.Double
  
  type UserName = java.lang.String
  
  type UserPassword = java.lang.String
  
  type VpcEndpointId = java.lang.String
  
  type VpcId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-11-05`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.transferMod._apiVersion | java.lang.String
}
