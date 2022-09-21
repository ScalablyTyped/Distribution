package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.DROP_TO_ALERT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActionName = String

type AddressDefinition = String

type Addresses = js.Array[Address]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.SCALING
  - typings.awsSdk.awsSdkStrings.READY
  - java.lang.String
*/
type AttachmentStatus = _AttachmentStatus | String

type AvailabilityZone = String

type AzSubnet = String

type AzSubnets = js.Array[AzSubnet]

type Boolean = scala.Boolean

type CIDRCount = Double

type CollectionMemberString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_SYNC
  - typings.awsSdk.awsSdkStrings.CAPACITY_CONSTRAINED
  - java.lang.String
*/
type ConfigurationSyncState = _ConfigurationSyncState | String

type CustomActions = js.Array[CustomAction]

type Description = String

type Destination = String

type DimensionValue = String

type Dimensions = js.Array[Dimension]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOMER_KMS
  - typings.awsSdk.awsSdkStrings.AWS_OWNED_KMS_KEY
  - java.lang.String
*/
type EncryptionType = _EncryptionType | String

type EndpointId = String

type FirewallPolicies = js.Array[FirewallPolicyMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.READY
  - java.lang.String
*/
type FirewallStatusValue = _FirewallStatusValue | String

type Firewalls = js.Array[FirewallMetadata]

type Flags = js.Array[TCPFlag]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOWLIST
  - typings.awsSdk.awsSdkStrings.DENYLIST
  - java.lang.String
*/
type GeneratedRulesType = _GeneratedRulesType | String

type HashMapKey = String

type HashMapValue = String

type IPSetArn = String

type IPSetMetadataMap = StringDictionary[IPSetMetadata]

type IPSetReferenceMap = StringDictionary[IPSetReference]

type IPSetReferenceName = String

type IPSets = StringDictionary[IPSet]

type KeyId = String

type Keyword = String

type LastUpdateTime = js.Date

type LogDestinationConfigs = js.Array[LogDestinationConfig]

type LogDestinationMap = StringDictionary[HashMapValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S3
  - typings.awsSdk.awsSdkStrings.CloudWatchLogs
  - typings.awsSdk.awsSdkStrings.KinesisDataFirehose
  - java.lang.String
*/
type LogDestinationType = _LogDestinationType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALERT
  - typings.awsSdk.awsSdkStrings.FLOW
  - java.lang.String
*/
type LogType = _LogType | String

type NumberOfAssociations = Double

type OverrideAction = DROP_TO_ALERT | String

type PaginationMaxResults = Double

type PaginationToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_SYNC
  - typings.awsSdk.awsSdkStrings.CAPACITY_CONSTRAINED
  - java.lang.String
*/
type PerObjectSyncStatus = _PerObjectSyncStatus | String

type PolicyString = String

type Port = String

type PortRangeBound = Double

type PortRanges = js.Array[PortRange]

type PortSets = StringDictionary[PortSet]

type Priority = Double

type ProtocolNumber = Double

type ProtocolNumbers = js.Array[ProtocolNumber]

type ResourceArn = String

type ResourceId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MANAGED
  - typings.awsSdk.awsSdkStrings.ACCOUNT
  - java.lang.String
*/
type ResourceManagedStatus = _ResourceManagedStatus | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_MANAGED_THREAT_SIGNATURES
  - typings.awsSdk.awsSdkStrings.AWS_MANAGED_DOMAIN_LISTS
  - java.lang.String
*/
type ResourceManagedType = _ResourceManagedType | String

type ResourceName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ResourceStatus = _ResourceStatus | String

type RuleCapacity = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STATELESS
  - typings.awsSdk.awsSdkStrings.STATEFUL
  - java.lang.String
*/
type RuleGroupType = _RuleGroupType | String

type RuleGroups = js.Array[RuleGroupMetadata]

type RuleOptions = js.Array[RuleOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEFAULT_ACTION_ORDER
  - typings.awsSdk.awsSdkStrings.STRICT_ORDER
  - java.lang.String
*/
type RuleOrder = _RuleOrder | String

type RuleTargets = js.Array[CollectionMemberString]

type RuleVariableName = String

type RulesString = String

type Setting = String

type Settings = js.Array[Setting]

type Source = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PASS
  - typings.awsSdk.awsSdkStrings.DROP
  - typings.awsSdk.awsSdkStrings.ALERT
  - java.lang.String
*/
type StatefulAction = _StatefulAction | String

type StatefulActions = js.Array[CollectionMemberString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FORWARD
  - typings.awsSdk.awsSdkStrings.ANY
  - java.lang.String
*/
type StatefulRuleDirection = _StatefulRuleDirection | String

type StatefulRuleGroupReferences = js.Array[StatefulRuleGroupReference]

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
type StatefulRuleProtocol = _StatefulRuleProtocol | String

type StatefulRules = js.Array[StatefulRule]

type StatelessActions = js.Array[CollectionMemberString]

type StatelessRuleGroupReferences = js.Array[StatelessRuleGroupReference]

type StatelessRules = js.Array[StatelessRule]

type SubnetMappings = js.Array[SubnetMapping]

type SyncStateConfig = StringDictionary[PerObjectStatus]

type SyncStates = StringDictionary[SyncState]

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
type TCPFlag = _TCPFlag | String

type TCPFlags = js.Array[TCPFlagField]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TagsPaginationMaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TLS_SNI
  - typings.awsSdk.awsSdkStrings.HTTP_HOST
  - java.lang.String
*/
type TargetType = _TargetType | String

type TargetTypes = js.Array[TargetType]

type UpdateToken = String

type VariableDefinition = String

type VariableDefinitionList = js.Array[VariableDefinition]

type VpcId = String

type VpcIds = js.Array[VpcId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-11-12`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
