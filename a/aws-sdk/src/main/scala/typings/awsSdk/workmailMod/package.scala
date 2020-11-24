package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  type Description = java.lang.String
  
  type DirectoryId = java.lang.String
  
  type DomainName = java.lang.String
  
  type Domains = js.Array[typings.awsSdk.workmailMod.Domain]
  
  type EmailAddress = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type EntityState = typings.awsSdk.workmailMod._EntityState | java.lang.String
  
  type FolderConfigurations = js.Array[typings.awsSdk.workmailMod.FolderConfiguration]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INBOX
    - typings.awsSdk.awsSdkStrings.DELETED_ITEMS
    - typings.awsSdk.awsSdkStrings.SENT_ITEMS
    - typings.awsSdk.awsSdkStrings.DRAFTS
    - typings.awsSdk.awsSdkStrings.JUNK_EMAIL
    - java.lang.String
  */
  type FolderName = typings.awsSdk.workmailMod._FolderName | java.lang.String
  
  type GroupName = java.lang.String
  
  type Groups = js.Array[typings.awsSdk.workmailMod.Group]
  
  type HostedZoneId = java.lang.String
  
  type IdempotencyClientToken = java.lang.String
  
  type IpAddress = java.lang.String
  
  type IpRange = java.lang.String
  
  type IpRangeList = js.Array[typings.awsSdk.workmailMod.IpRange]
  
  type Jobs = js.Array[typings.awsSdk.workmailMod.MailboxExportJob]
  
  type KmsKeyArn = java.lang.String
  
  type MailboxExportErrorInfo = java.lang.String
  
  type MailboxExportJobId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type MailboxExportJobState = typings.awsSdk.workmailMod._MailboxExportJobState | java.lang.String
  
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
  
  type Percentage = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FULL_ACCESS
    - typings.awsSdk.awsSdkStrings.SEND_AS
    - typings.awsSdk.awsSdkStrings.SEND_ON_BEHALF
    - java.lang.String
  */
  type PermissionType = typings.awsSdk.workmailMod._PermissionType | java.lang.String
  
  type PermissionValues = js.Array[typings.awsSdk.workmailMod.PermissionType]
  
  type Permissions = js.Array[typings.awsSdk.workmailMod.Permission]
  
  type PolicyDescription = java.lang.String
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.DELETE
    - typings.awsSdk.awsSdkStrings.PERMANENTLY_DELETE
    - java.lang.String
  */
  type RetentionAction = typings.awsSdk.workmailMod._RetentionAction | java.lang.String
  
  type RetentionPeriod = scala.Double
  
  type RoleArn = java.lang.String
  
  type S3BucketName = java.lang.String
  
  type S3ObjectKey = java.lang.String
  
  type ShortString = java.lang.String
  
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
