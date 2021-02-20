package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object networkfirewallMod {
  
  type ActionName = java.lang.String
  
  type AddressDefinition = java.lang.String
  
  type Addresses = js.Array[typings.awsSdk.networkfirewallMod.Address]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.SCALING
    - typings.awsSdk.awsSdkStrings.READY
    - java.lang.String
  */
  type AttachmentStatus = typings.awsSdk.networkfirewallMod._AttachmentStatus | java.lang.String
  
  type AvailabilityZone = java.lang.String
  
  type AzSubnet = java.lang.String
  
  type AzSubnets = js.Array[typings.awsSdk.networkfirewallMod.AzSubnet]
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.networkfirewallMod.ClientApiVersions
  
  type CollectionMemberString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.IN_SYNC
    - java.lang.String
  */
  type ConfigurationSyncState = typings.awsSdk.networkfirewallMod._ConfigurationSyncState | java.lang.String
  
  type CustomActions = js.Array[typings.awsSdk.networkfirewallMod.CustomAction]
  
  type Description = java.lang.String
  
  type Destination = java.lang.String
  
  type DimensionValue = java.lang.String
  
  type Dimensions = js.Array[typings.awsSdk.networkfirewallMod.Dimension]
  
  type EndpointId = java.lang.String
  
  type FirewallPolicies = js.Array[typings.awsSdk.networkfirewallMod.FirewallPolicyMetadata]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PROVISIONING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.READY
    - java.lang.String
  */
  type FirewallStatusValue = typings.awsSdk.networkfirewallMod._FirewallStatusValue | java.lang.String
  
  type Firewalls = js.Array[typings.awsSdk.networkfirewallMod.FirewallMetadata]
  
  type Flags = js.Array[typings.awsSdk.networkfirewallMod.TCPFlag]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALLOWLIST
    - typings.awsSdk.awsSdkStrings.DENYLIST
    - java.lang.String
  */
  type GeneratedRulesType = typings.awsSdk.networkfirewallMod._GeneratedRulesType | java.lang.String
  
  type HashMapKey = java.lang.String
  
  type HashMapValue = java.lang.String
  
  type IPSets = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.networkfirewallMod.IPSet]
  
  type Keyword = java.lang.String
  
  type LogDestinationConfigs = js.Array[typings.awsSdk.networkfirewallMod.LogDestinationConfig]
  
  type LogDestinationMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.networkfirewallMod.HashMapValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.S3
    - typings.awsSdk.awsSdkStrings.CloudWatchLogs
    - typings.awsSdk.awsSdkStrings.KinesisDataFirehose
    - java.lang.String
  */
  type LogDestinationType = typings.awsSdk.networkfirewallMod._LogDestinationType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALERT
    - typings.awsSdk.awsSdkStrings.FLOW
    - java.lang.String
  */
  type LogType = typings.awsSdk.networkfirewallMod._LogType | java.lang.String
  
  type PaginationMaxResults = scala.Double
  
  type PaginationToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.IN_SYNC
    - java.lang.String
  */
  type PerObjectSyncStatus = typings.awsSdk.networkfirewallMod._PerObjectSyncStatus | java.lang.String
  
  type PolicyString = java.lang.String
  
  type Port = java.lang.String
  
  type PortRangeBound = scala.Double
  
  type PortRanges = js.Array[typings.awsSdk.networkfirewallMod.PortRange]
  
  type PortSets = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.networkfirewallMod.PortSet]
  
  type Priority = scala.Double
  
  type ProtocolNumber = scala.Double
  
  type ProtocolNumbers = js.Array[typings.awsSdk.networkfirewallMod.ProtocolNumber]
  
  type ResourceArn = java.lang.String
  
  type ResourceId = java.lang.String
  
  type ResourceName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ResourceStatus = typings.awsSdk.networkfirewallMod._ResourceStatus | java.lang.String
  
  type RuleCapacity = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STATELESS
    - typings.awsSdk.awsSdkStrings.STATEFUL
    - java.lang.String
  */
  type RuleGroupType = typings.awsSdk.networkfirewallMod._RuleGroupType | java.lang.String
  
  type RuleGroups = js.Array[typings.awsSdk.networkfirewallMod.RuleGroupMetadata]
  
  type RuleOptions = js.Array[typings.awsSdk.networkfirewallMod.RuleOption]
  
  type RuleTargets = js.Array[typings.awsSdk.networkfirewallMod.CollectionMemberString]
  
  type RuleVariableName = java.lang.String
  
  type RulesString = java.lang.String
  
  type Setting = java.lang.String
  
  type Settings = js.Array[typings.awsSdk.networkfirewallMod.Setting]
  
  type Source = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PASS
    - typings.awsSdk.awsSdkStrings.DROP
    - typings.awsSdk.awsSdkStrings.ALERT
    - java.lang.String
  */
  type StatefulAction = typings.awsSdk.networkfirewallMod._StatefulAction | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FORWARD
    - typings.awsSdk.awsSdkStrings.ANY
    - java.lang.String
  */
  type StatefulRuleDirection = typings.awsSdk.networkfirewallMod._StatefulRuleDirection | java.lang.String
  
  type StatefulRuleGroupReferences = js.Array[typings.awsSdk.networkfirewallMod.StatefulRuleGroupReference]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IP
    - typings.awsSdk.awsSdkStrings.TCP
    - typings.awsSdk.awsSdkStrings.UDP
    - typings.awsSdk.awsSdkStrings.ICMP
    - typings.awsSdk.awsSdkStrings.HTTP
    - typings.awsSdk.awsSdkStrings.FTP
    - typings.awsSdk.awsSdkStrings.TLS
    - typings.awsSdk.awsSdkStrings.SMB
    - typings.awsSdk.awsSdkStrings.DNS
    - typings.awsSdk.awsSdkStrings.DCERPC
    - typings.awsSdk.awsSdkStrings.SSH
    - typings.awsSdk.awsSdkStrings.SMTP
    - typings.awsSdk.awsSdkStrings.IMAP
    - typings.awsSdk.awsSdkStrings.MSN
    - typings.awsSdk.awsSdkStrings.KRB5
    - typings.awsSdk.awsSdkStrings.IKEV2
    - typings.awsSdk.awsSdkStrings.TFTP
    - typings.awsSdk.awsSdkStrings.NTP
    - typings.awsSdk.awsSdkStrings.DHCP
    - java.lang.String
  */
  type StatefulRuleProtocol = typings.awsSdk.networkfirewallMod._StatefulRuleProtocol | java.lang.String
  
  type StatefulRules = js.Array[typings.awsSdk.networkfirewallMod.StatefulRule]
  
  type StatelessActions = js.Array[typings.awsSdk.networkfirewallMod.CollectionMemberString]
  
  type StatelessRuleGroupReferences = js.Array[typings.awsSdk.networkfirewallMod.StatelessRuleGroupReference]
  
  type StatelessRules = js.Array[typings.awsSdk.networkfirewallMod.StatelessRule]
  
  type SubnetMappings = js.Array[typings.awsSdk.networkfirewallMod.SubnetMapping]
  
  type SyncStateConfig = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.networkfirewallMod.PerObjectStatus]
  
  type SyncStates = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.networkfirewallMod.SyncState]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FIN
    - typings.awsSdk.awsSdkStrings.SYN
    - typings.awsSdk.awsSdkStrings.RST
    - typings.awsSdk.awsSdkStrings.PSH
    - typings.awsSdk.awsSdkStrings.ACK
    - typings.awsSdk.awsSdkStrings.URG
    - typings.awsSdk.awsSdkStrings.ECE
    - typings.awsSdk.awsSdkStrings.CWR
    - java.lang.String
  */
  type TCPFlag = typings.awsSdk.networkfirewallMod._TCPFlag | java.lang.String
  
  type TCPFlags = js.Array[typings.awsSdk.networkfirewallMod.TCPFlagField]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.networkfirewallMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.networkfirewallMod.Tag]
  
  type TagValue = java.lang.String
  
  type TagsPaginationMaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TLS_SNI
    - typings.awsSdk.awsSdkStrings.HTTP_HOST
    - java.lang.String
  */
  type TargetType = typings.awsSdk.networkfirewallMod._TargetType | java.lang.String
  
  type TargetTypes = js.Array[typings.awsSdk.networkfirewallMod.TargetType]
  
  type UpdateToken = java.lang.String
  
  type VariableDefinition = java.lang.String
  
  type VariableDefinitionList = js.Array[typings.awsSdk.networkfirewallMod.VariableDefinition]
  
  type VpcId = java.lang.String
  
  type VpcIds = js.Array[typings.awsSdk.networkfirewallMod.VpcId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2020-11-12`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.networkfirewallMod._apiVersion | java.lang.String
}
