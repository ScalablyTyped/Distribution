package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object daxMod {
  
  type AvailabilityZoneList = js.Array[typings.awsSdk.daxMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IMMEDIATE
    - typings.awsSdk.awsSdkStrings.REQUIRES_REBOOT
    - java.lang.String
  */
  type ChangeType = typings.awsSdk.daxMod._ChangeType | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.daxMod.ClientApiVersions
  
  type ClusterList = js.Array[typings.awsSdk.daxMod.Cluster]
  
  type ClusterNameList = js.Array[typings.awsSdk.daxMod.String]
  
  type EventList = js.Array[typings.awsSdk.daxMod.Event]
  
  type Integer = scala.Double
  
  type IntegerOptional = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TRUE
    - typings.awsSdk.awsSdkStrings.FALSE
    - typings.awsSdk.awsSdkStrings.CONDITIONAL
    - java.lang.String
  */
  type IsModifiable = typings.awsSdk.daxMod._IsModifiable | java.lang.String
  
  type KeyList = js.Array[typings.awsSdk.daxMod.String]
  
  type NodeIdentifierList = js.Array[typings.awsSdk.daxMod.String]
  
  type NodeList = js.Array[typings.awsSdk.daxMod.Node]
  
  type NodeTypeSpecificValueList = js.Array[typings.awsSdk.daxMod.NodeTypeSpecificValue]
  
  type ParameterGroupList = js.Array[typings.awsSdk.daxMod.ParameterGroup]
  
  type ParameterGroupNameList = js.Array[typings.awsSdk.daxMod.String]
  
  type ParameterList = js.Array[typings.awsSdk.daxMod.Parameter]
  
  type ParameterNameValueList = js.Array[typings.awsSdk.daxMod.ParameterNameValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEFAULT
    - typings.awsSdk.awsSdkStrings.NODE_TYPE_SPECIFIC
    - java.lang.String
  */
  type ParameterType = typings.awsSdk.daxMod._ParameterType | java.lang.String
  
  type SSEEnabled = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLING
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLING
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type SSEStatus = typings.awsSdk.daxMod._SSEStatus | java.lang.String
  
  type SecurityGroupIdentifierList = js.Array[typings.awsSdk.daxMod.String]
  
  type SecurityGroupMembershipList = js.Array[typings.awsSdk.daxMod.SecurityGroupMembership]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CLUSTER
    - typings.awsSdk.awsSdkStrings.PARAMETER_GROUP
    - typings.awsSdk.awsSdkStrings.SUBNET_GROUP
    - java.lang.String
  */
  type SourceType = typings.awsSdk.daxMod._SourceType | java.lang.String
  
  type String = java.lang.String
  
  type SubnetGroupList = js.Array[typings.awsSdk.daxMod.SubnetGroup]
  
  type SubnetGroupNameList = js.Array[typings.awsSdk.daxMod.String]
  
  type SubnetIdentifierList = js.Array[typings.awsSdk.daxMod.String]
  
  type SubnetList = js.Array[typings.awsSdk.daxMod.Subnet]
  
  type TStamp = typings.std.Date
  
  type TagList = js.Array[typings.awsSdk.daxMod.Tag]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-04-19`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.daxMod._apiVersion | java.lang.String
}
