package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elbv2Mod {
  type ActionOrder = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.forward__
    - typings.awsSdk.awsSdkStrings.`authenticate-oidc`
    - typings.awsSdk.awsSdkStrings.`authenticate-cognito`
    - typings.awsSdk.awsSdkStrings.redirect
    - typings.awsSdk.awsSdkStrings.`fixed-response`
    - java.lang.String
  */
  type ActionTypeEnum = typings.awsSdk.elbv2Mod._ActionTypeEnum | java.lang.String
  type Actions = js.Array[typings.awsSdk.elbv2Mod.Action]
  type AllocationId = java.lang.String
  type AlpnPolicyName = js.Array[typings.awsSdk.elbv2Mod.AlpnPolicyValue]
  type AlpnPolicyValue = java.lang.String
  type AuthenticateCognitoActionAuthenticationRequestExtraParams = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.elbv2Mod.AuthenticateCognitoActionAuthenticationRequestParamValue]
  type AuthenticateCognitoActionAuthenticationRequestParamName = java.lang.String
  type AuthenticateCognitoActionAuthenticationRequestParamValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.deny__
    - typings.awsSdk.awsSdkStrings.allow__
    - typings.awsSdk.awsSdkStrings.authenticate
    - java.lang.String
  */
  type AuthenticateCognitoActionConditionalBehaviorEnum = typings.awsSdk.elbv2Mod._AuthenticateCognitoActionConditionalBehaviorEnum | java.lang.String
  type AuthenticateCognitoActionScope = java.lang.String
  type AuthenticateCognitoActionSessionCookieName = java.lang.String
  type AuthenticateCognitoActionSessionTimeout = scala.Double
  type AuthenticateCognitoActionUserPoolArn = java.lang.String
  type AuthenticateCognitoActionUserPoolClientId = java.lang.String
  type AuthenticateCognitoActionUserPoolDomain = java.lang.String
  type AuthenticateOidcActionAuthenticationRequestExtraParams = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.elbv2Mod.AuthenticateOidcActionAuthenticationRequestParamValue]
  type AuthenticateOidcActionAuthenticationRequestParamName = java.lang.String
  type AuthenticateOidcActionAuthenticationRequestParamValue = java.lang.String
  type AuthenticateOidcActionAuthorizationEndpoint = java.lang.String
  type AuthenticateOidcActionClientId = java.lang.String
  type AuthenticateOidcActionClientSecret = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.deny__
    - typings.awsSdk.awsSdkStrings.allow__
    - typings.awsSdk.awsSdkStrings.authenticate
    - java.lang.String
  */
  type AuthenticateOidcActionConditionalBehaviorEnum = typings.awsSdk.elbv2Mod._AuthenticateOidcActionConditionalBehaviorEnum | java.lang.String
  type AuthenticateOidcActionIssuer = java.lang.String
  type AuthenticateOidcActionScope = java.lang.String
  type AuthenticateOidcActionSessionCookieName = java.lang.String
  type AuthenticateOidcActionSessionTimeout = scala.Double
  type AuthenticateOidcActionTokenEndpoint = java.lang.String
  type AuthenticateOidcActionUseExistingClientSecret = scala.Boolean
  type AuthenticateOidcActionUserInfoEndpoint = java.lang.String
  type AvailabilityZones = js.Array[typings.awsSdk.elbv2Mod.AvailabilityZone]
  type CanonicalHostedZoneId = java.lang.String
  type CertificateArn = java.lang.String
  type CertificateList = js.Array[typings.awsSdk.elbv2Mod.Certificate]
  type CipherName = java.lang.String
  type CipherPriority = scala.Double
  type Ciphers = js.Array[typings.awsSdk.elbv2Mod.Cipher]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.elbv2Mod.ClientApiVersions
  type ConditionFieldName = java.lang.String
  type CreatedTime = typings.std.Date
  type DNSName = java.lang.String
  type Default = scala.Boolean
  type Description = java.lang.String
  type FixedResponseActionContentType = java.lang.String
  type FixedResponseActionMessage = java.lang.String
  type FixedResponseActionStatusCode = java.lang.String
  type HealthCheckEnabled = scala.Boolean
  type HealthCheckIntervalSeconds = scala.Double
  type HealthCheckPort = java.lang.String
  type HealthCheckThresholdCount = scala.Double
  type HealthCheckTimeoutSeconds = scala.Double
  type HttpCode = java.lang.String
  type HttpHeaderConditionName = java.lang.String
  type IpAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ipv4_
    - typings.awsSdk.awsSdkStrings.dualstack
    - java.lang.String
  */
  type IpAddressType = typings.awsSdk.elbv2Mod._IpAddressType | java.lang.String
  type IsDefault = scala.Boolean
  type Limits = js.Array[typings.awsSdk.elbv2Mod.Limit]
  type ListOfString = js.Array[typings.awsSdk.elbv2Mod.StringValue]
  type ListenerArn = java.lang.String
  type ListenerArns = js.Array[typings.awsSdk.elbv2Mod.ListenerArn]
  type Listeners = js.Array[typings.awsSdk.elbv2Mod.Listener]
  type LoadBalancerAddresses = js.Array[typings.awsSdk.elbv2Mod.LoadBalancerAddress]
  type LoadBalancerArn = java.lang.String
  type LoadBalancerArns = js.Array[typings.awsSdk.elbv2Mod.LoadBalancerArn]
  type LoadBalancerAttributeKey = java.lang.String
  type LoadBalancerAttributeValue = java.lang.String
  type LoadBalancerAttributes = js.Array[typings.awsSdk.elbv2Mod.LoadBalancerAttribute]
  type LoadBalancerName = java.lang.String
  type LoadBalancerNames = js.Array[typings.awsSdk.elbv2Mod.LoadBalancerName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`internet-facing`
    - typings.awsSdk.awsSdkStrings.internal_
    - java.lang.String
  */
  type LoadBalancerSchemeEnum = typings.awsSdk.elbv2Mod._LoadBalancerSchemeEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.provisioning_
    - typings.awsSdk.awsSdkStrings.active_impaired
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type LoadBalancerStateEnum = typings.awsSdk.elbv2Mod._LoadBalancerStateEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.application_
    - typings.awsSdk.awsSdkStrings.network_
    - java.lang.String
  */
  type LoadBalancerTypeEnum = typings.awsSdk.elbv2Mod._LoadBalancerTypeEnum | java.lang.String
  type LoadBalancers = js.Array[typings.awsSdk.elbv2Mod.LoadBalancer]
  type Marker = java.lang.String
  type Max = java.lang.String
  type Name = java.lang.String
  type PageSize = scala.Double
  type Path = java.lang.String
  type Port = scala.Double
  type PrivateIPv4Address = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HTTP
    - typings.awsSdk.awsSdkStrings.HTTPS
    - typings.awsSdk.awsSdkStrings.TCP
    - typings.awsSdk.awsSdkStrings.TLS
    - typings.awsSdk.awsSdkStrings.UDP
    - typings.awsSdk.awsSdkStrings.TCP_UDP
    - java.lang.String
  */
  type ProtocolEnum = typings.awsSdk.elbv2Mod._ProtocolEnum | java.lang.String
  type QueryStringKeyValuePairList = js.Array[typings.awsSdk.elbv2Mod.QueryStringKeyValuePair]
  type RedirectActionHost = java.lang.String
  type RedirectActionPath = java.lang.String
  type RedirectActionPort = java.lang.String
  type RedirectActionProtocol = java.lang.String
  type RedirectActionQuery = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HTTP_301
    - typings.awsSdk.awsSdkStrings.HTTP_302
    - java.lang.String
  */
  type RedirectActionStatusCodeEnum = typings.awsSdk.elbv2Mod._RedirectActionStatusCodeEnum | java.lang.String
  type ResourceArn = java.lang.String
  type ResourceArns = js.Array[typings.awsSdk.elbv2Mod.ResourceArn]
  type RuleArn = java.lang.String
  type RuleArns = js.Array[typings.awsSdk.elbv2Mod.RuleArn]
  type RuleConditionList = js.Array[typings.awsSdk.elbv2Mod.RuleCondition]
  type RulePriority = scala.Double
  type RulePriorityList = js.Array[typings.awsSdk.elbv2Mod.RulePriorityPair]
  type Rules = js.Array[typings.awsSdk.elbv2Mod.Rule]
  type SecurityGroupId = java.lang.String
  type SecurityGroups = js.Array[typings.awsSdk.elbv2Mod.SecurityGroupId]
  type SslPolicies = js.Array[typings.awsSdk.elbv2Mod.SslPolicy]
  type SslPolicyName = java.lang.String
  type SslPolicyNames = js.Array[typings.awsSdk.elbv2Mod.SslPolicyName]
  type SslProtocol = java.lang.String
  type SslProtocols = js.Array[typings.awsSdk.elbv2Mod.SslProtocol]
  type StateReason = java.lang.String
  type String = java.lang.String
  type StringValue = java.lang.String
  type SubnetId = java.lang.String
  type SubnetMappings = js.Array[typings.awsSdk.elbv2Mod.SubnetMapping]
  type Subnets = js.Array[typings.awsSdk.elbv2Mod.SubnetId]
  type TagDescriptions = js.Array[typings.awsSdk.elbv2Mod.TagDescription]
  type TagKey = java.lang.String
  type TagKeys = js.Array[typings.awsSdk.elbv2Mod.TagKey]
  type TagList = js.Array[typings.awsSdk.elbv2Mod.Tag]
  type TagValue = java.lang.String
  type TargetDescriptions = js.Array[typings.awsSdk.elbv2Mod.TargetDescription]
  type TargetGroupArn = java.lang.String
  type TargetGroupArns = js.Array[typings.awsSdk.elbv2Mod.TargetGroupArn]
  type TargetGroupAttributeKey = java.lang.String
  type TargetGroupAttributeValue = java.lang.String
  type TargetGroupAttributes = js.Array[typings.awsSdk.elbv2Mod.TargetGroupAttribute]
  type TargetGroupList = js.Array[typings.awsSdk.elbv2Mod.TargetGroupTuple]
  type TargetGroupName = java.lang.String
  type TargetGroupNames = js.Array[typings.awsSdk.elbv2Mod.TargetGroupName]
  type TargetGroupStickinessDurationSeconds = scala.Double
  type TargetGroupStickinessEnabled = scala.Boolean
  type TargetGroupWeight = scala.Double
  type TargetGroups = js.Array[typings.awsSdk.elbv2Mod.TargetGroup]
  type TargetHealthDescriptions = js.Array[typings.awsSdk.elbv2Mod.TargetHealthDescription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ElbDotRegistrationInProgress
    - typings.awsSdk.awsSdkStrings.ElbDotInitialHealthChecking
    - typings.awsSdk.awsSdkStrings.TargetDotResponseCodeMismatch
    - typings.awsSdk.awsSdkStrings.TargetDotTimeout
    - typings.awsSdk.awsSdkStrings.TargetDotFailedHealthChecks
    - typings.awsSdk.awsSdkStrings.TargetDotNotRegistered
    - typings.awsSdk.awsSdkStrings.TargetDotNotInUse
    - typings.awsSdk.awsSdkStrings.TargetDotDeregistrationInProgress
    - typings.awsSdk.awsSdkStrings.TargetDotInvalidState
    - typings.awsSdk.awsSdkStrings.TargetDotIpUnusable
    - typings.awsSdk.awsSdkStrings.TargetDotHealthCheckDisabled
    - typings.awsSdk.awsSdkStrings.ElbDotInternalError
    - java.lang.String
  */
  type TargetHealthReasonEnum = typings.awsSdk.elbv2Mod._TargetHealthReasonEnum | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.initial_
    - typings.awsSdk.awsSdkStrings.healthy__
    - typings.awsSdk.awsSdkStrings.unhealthy__
    - typings.awsSdk.awsSdkStrings.unused
    - typings.awsSdk.awsSdkStrings.draining_
    - typings.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type TargetHealthStateEnum = typings.awsSdk.elbv2Mod._TargetHealthStateEnum | java.lang.String
  type TargetId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.instance__
    - typings.awsSdk.awsSdkStrings.ip_
    - typings.awsSdk.awsSdkStrings.lambda__
    - java.lang.String
  */
  type TargetTypeEnum = typings.awsSdk.elbv2Mod._TargetTypeEnum | java.lang.String
  type VpcId = java.lang.String
  type ZoneName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-12-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.elbv2Mod._apiVersion | java.lang.String
}
