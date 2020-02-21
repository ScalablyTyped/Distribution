package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object workmailMod {
  type AccessControlRuleAction = java.lang.String
  type AccessControlRuleDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALLOW
    - typings.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type AccessControlRuleEffect = typings.awsSdk.workmailMod._AccessControlRuleEffect | java.lang.String
  type AccessControlRuleName = java.lang.String
  type AccessControlRuleNameList = js.Array[typings.awsSdk.workmailMod.AccessControlRuleName]
  type AccessControlRulesList = js.Array[typings.awsSdk.workmailMod.AccessControlRule]
  type ActionsList = js.Array[typings.awsSdk.workmailMod.AccessControlRuleAction]
  type Aliases = js.Array[typings.awsSdk.workmailMod.EmailAddress]
  type AmazonResourceName = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.workmailMod.ClientApiVersions
  type EmailAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type EntityState = typings.awsSdk.workmailMod._EntityState | java.lang.String
  type GroupName = java.lang.String
  type Groups = js.Array[typings.awsSdk.workmailMod.Group]
  type IpAddress = java.lang.String
  type IpRange = java.lang.String
  type IpRangeList = js.Array[typings.awsSdk.workmailMod.IpRange]
  type MailboxQuota = scala.Double
  type MailboxSize = scala.Double
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GROUP
    - typings.awsSdk.awsSdkStrings.USER
    - java.lang.String
  */
  type MemberType = typings.awsSdk.workmailMod._MemberType | java.lang.String
  type Members = js.Array[typings.awsSdk.workmailMod.Member]
  type NextToken = java.lang.String
  type OrganizationId = java.lang.String
  type OrganizationName = java.lang.String
  type OrganizationSummaries = js.Array[typings.awsSdk.workmailMod.OrganizationSummary]
  type Password = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FULL_ACCESS
    - typings.awsSdk.awsSdkStrings.SEND_AS
    - typings.awsSdk.awsSdkStrings.SEND_ON_BEHALF
    - java.lang.String
  */
  type PermissionType = typings.awsSdk.workmailMod._PermissionType | java.lang.String
  type PermissionValues = js.Array[typings.awsSdk.workmailMod.PermissionType]
  type Permissions = js.Array[typings.awsSdk.workmailMod.Permission]
  type ResourceDelegates = js.Array[typings.awsSdk.workmailMod.Delegate]
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ROOM
    - typings.awsSdk.awsSdkStrings.EQUIPMENT
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.workmailMod._ResourceType | java.lang.String
  type Resources = js.Array[typings.awsSdk.workmailMod.Resource]
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.workmailMod.TagKey]
  type TagList = js.Array[typings.awsSdk.workmailMod.Tag]
  type TagValue = java.lang.String
  type Timestamp = typings.std.Date
  type UserIdList = js.Array[typings.awsSdk.workmailMod.WorkMailIdentifier]
  type UserName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.RESOURCE
    - typings.awsSdk.awsSdkStrings.SYSTEM_USER
    - java.lang.String
  */
  type UserRole = typings.awsSdk.workmailMod._UserRole | java.lang.String
  type Users = js.Array[typings.awsSdk.workmailMod.User]
  type WorkMailIdentifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-10-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.workmailMod._apiVersion | java.lang.String
}
