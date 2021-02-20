package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object workdocsMod {
  
  type ActivityNamesFilterType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DOCUMENT_CHECKED_IN
    - typings.awsSdk.awsSdkStrings.DOCUMENT_CHECKED_OUT
    - typings.awsSdk.awsSdkStrings.DOCUMENT_RENAMED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_VERSION_UPLOADED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_VERSION_DELETED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_VERSION_VIEWED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_VERSION_DOWNLOADED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_RECYCLED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_RESTORED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_REVERTED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_SHARED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_UNSHARED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_SHARE_PERMISSION_CHANGED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_SHAREABLE_LINK_CREATED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_SHAREABLE_LINK_REMOVED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_SHAREABLE_LINK_PERMISSION_CHANGED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_MOVED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_COMMENT_ADDED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_COMMENT_DELETED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_ANNOTATION_ADDED
    - typings.awsSdk.awsSdkStrings.DOCUMENT_ANNOTATION_DELETED
    - typings.awsSdk.awsSdkStrings.FOLDER_CREATED
    - typings.awsSdk.awsSdkStrings.FOLDER_DELETED
    - typings.awsSdk.awsSdkStrings.FOLDER_RENAMED
    - typings.awsSdk.awsSdkStrings.FOLDER_RECYCLED
    - typings.awsSdk.awsSdkStrings.FOLDER_RESTORED
    - typings.awsSdk.awsSdkStrings.FOLDER_SHARED
    - typings.awsSdk.awsSdkStrings.FOLDER_UNSHARED
    - typings.awsSdk.awsSdkStrings.FOLDER_SHARE_PERMISSION_CHANGED
    - typings.awsSdk.awsSdkStrings.FOLDER_SHAREABLE_LINK_CREATED
    - typings.awsSdk.awsSdkStrings.FOLDER_SHAREABLE_LINK_REMOVED
    - typings.awsSdk.awsSdkStrings.FOLDER_SHAREABLE_LINK_PERMISSION_CHANGED
    - typings.awsSdk.awsSdkStrings.FOLDER_MOVED
    - java.lang.String
  */
  type ActivityType = typings.awsSdk.workdocsMod._ActivityType | java.lang.String
  
  type AuthenticationHeaderType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TRUE
    - typings.awsSdk.awsSdkStrings.FALSE
    - java.lang.String
  */
  type BooleanEnumType = typings.awsSdk.workdocsMod._BooleanEnumType | java.lang.String
  
  type BooleanType = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.workdocsMod.ClientApiVersions
  
  type CommentIdType = java.lang.String
  
  type CommentList = js.Array[typings.awsSdk.workdocsMod.Comment]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DRAFT
    - typings.awsSdk.awsSdkStrings.PUBLISHED
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type CommentStatusType = typings.awsSdk.workdocsMod._CommentStatusType | java.lang.String
  
  type CommentTextType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PUBLIC
    - typings.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type CommentVisibilityType = typings.awsSdk.workdocsMod._CommentVisibilityType | java.lang.String
  
  type CustomMetadataKeyList = js.Array[typings.awsSdk.workdocsMod.CustomMetadataKeyType]
  
  type CustomMetadataKeyType = java.lang.String
  
  type CustomMetadataMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.workdocsMod.CustomMetadataValueType]
  
  type CustomMetadataValueType = java.lang.String
  
  type DocumentContentType = java.lang.String
  
  type DocumentMetadataList = js.Array[typings.awsSdk.workdocsMod.DocumentMetadata]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ORIGINAL
    - typings.awsSdk.awsSdkStrings.WITH_COMMENTS
    - java.lang.String
  */
  type DocumentSourceType = typings.awsSdk.workdocsMod._DocumentSourceType | java.lang.String
  
  type DocumentSourceUrlMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.workdocsMod.UrlType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INITIALIZED
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type DocumentStatusType = typings.awsSdk.workdocsMod._DocumentStatusType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SMALL
    - typings.awsSdk.awsSdkStrings.SMALL_HQ
    - typings.awsSdk.awsSdkStrings.LARGE
    - java.lang.String
  */
  type DocumentThumbnailType = typings.awsSdk.workdocsMod._DocumentThumbnailType | java.lang.String
  
  type DocumentThumbnailUrlMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.workdocsMod.UrlType]
  
  type DocumentVersionIdType = java.lang.String
  
  type DocumentVersionMetadataList = js.Array[typings.awsSdk.workdocsMod.DocumentVersionMetadata]
  
  type DocumentVersionStatus = typings.awsSdk.awsSdkStrings.ACTIVE | java.lang.String
  
  type EmailAddressType = java.lang.String
  
  type FieldNamesType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.DOCUMENT
    - typings.awsSdk.awsSdkStrings.FOLDER
    - java.lang.String
  */
  type FolderContentType = typings.awsSdk.workdocsMod._FolderContentType | java.lang.String
  
  type FolderMetadataList = js.Array[typings.awsSdk.workdocsMod.FolderMetadata]
  
  type GroupMetadataList = js.Array[typings.awsSdk.workdocsMod.GroupMetadata]
  
  type GroupNameType = java.lang.String
  
  type HashType = java.lang.String
  
  type HeaderNameType = java.lang.String
  
  type HeaderValueType = java.lang.String
  
  type IdType = java.lang.String
  
  type LimitType = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.en_
    - typings.awsSdk.awsSdkStrings.fr_
    - typings.awsSdk.awsSdkStrings.ko
    - typings.awsSdk.awsSdkStrings.de_
    - typings.awsSdk.awsSdkStrings.es_
    - typings.awsSdk.awsSdkStrings.ja_
    - typings.awsSdk.awsSdkStrings.ru_
    - typings.awsSdk.awsSdkStrings.zh_CN
    - typings.awsSdk.awsSdkStrings.zh_TW
    - typings.awsSdk.awsSdkStrings.pt_BR
    - typings.awsSdk.awsSdkStrings.default__
    - java.lang.String
  */
  type LocaleType = typings.awsSdk.workdocsMod._LocaleType | java.lang.String
  
  type MarkerType = java.lang.String
  
  type MessageType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASCENDING
    - typings.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type OrderType = typings.awsSdk.workdocsMod._OrderType | java.lang.String
  
  type OrganizationUserList = js.Array[typings.awsSdk.workdocsMod.User]
  
  type PageMarkerType = java.lang.String
  
  type PasswordType = java.lang.String
  
  type PermissionInfoList = js.Array[typings.awsSdk.workdocsMod.PermissionInfo]
  
  type PositiveIntegerType = scala.Double
  
  type PositiveSizeType = scala.Double
  
  type PrincipalList = js.Array[typings.awsSdk.workdocsMod.Principal]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.GROUP
    - typings.awsSdk.awsSdkStrings.INVITE
    - typings.awsSdk.awsSdkStrings.ANONYMOUS
    - typings.awsSdk.awsSdkStrings.ORGANIZATION
    - java.lang.String
  */
  type PrincipalType = typings.awsSdk.workdocsMod._PrincipalType | java.lang.String
  
  type ResourceCollectionType = typings.awsSdk.awsSdkStrings.SHARED_WITH_ME | java.lang.String
  
  type ResourceIdType = java.lang.String
  
  type ResourceNameType = java.lang.String
  
  type ResourcePathComponentList = js.Array[typings.awsSdk.workdocsMod.ResourcePathComponent]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DATE
    - typings.awsSdk.awsSdkStrings.NAME
    - java.lang.String
  */
  type ResourceSortType = typings.awsSdk.workdocsMod._ResourceSortType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.RESTORING
    - typings.awsSdk.awsSdkStrings.RECYCLING
    - typings.awsSdk.awsSdkStrings.RECYCLED
    - java.lang.String
  */
  type ResourceStateType = typings.awsSdk.workdocsMod._ResourceStateType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FOLDER
    - typings.awsSdk.awsSdkStrings.DOCUMENT
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.workdocsMod._ResourceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DIRECT
    - typings.awsSdk.awsSdkStrings.INHERITED
    - java.lang.String
  */
  type RolePermissionType = typings.awsSdk.workdocsMod._RolePermissionType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VIEWER
    - typings.awsSdk.awsSdkStrings.CONTRIBUTOR
    - typings.awsSdk.awsSdkStrings.OWNER
    - typings.awsSdk.awsSdkStrings.COOWNER
    - java.lang.String
  */
  type RoleType = typings.awsSdk.workdocsMod._RoleType | java.lang.String
  
  type SearchQueryType = java.lang.String
  
  type SharePrincipalList = js.Array[typings.awsSdk.workdocsMod.SharePrincipal]
  
  type ShareResultsList = js.Array[typings.awsSdk.workdocsMod.ShareResult]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.FAILURE
    - java.lang.String
  */
  type ShareStatusType = typings.awsSdk.workdocsMod._ShareStatusType | java.lang.String
  
  type SharedLabel = java.lang.String
  
  type SharedLabels = js.Array[typings.awsSdk.workdocsMod.SharedLabel]
  
  type SignedHeaderMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.workdocsMod.HeaderValueType]
  
  type SizeType = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UNLIMITED
    - typings.awsSdk.awsSdkStrings.QUOTA
    - java.lang.String
  */
  type StorageType = typings.awsSdk.workdocsMod._StorageType | java.lang.String
  
  type SubscriptionEndPointType = java.lang.String
  
  type SubscriptionList = js.Array[typings.awsSdk.workdocsMod.Subscription]
  
  type SubscriptionProtocolType = typings.awsSdk.awsSdkStrings.HTTPS | java.lang.String
  
  type SubscriptionType = typings.awsSdk.awsSdkStrings.ALL | java.lang.String
  
  type TimeZoneIdType = java.lang.String
  
  type TimestampType = typings.std.Date
  
  type UrlType = java.lang.String
  
  type UserActivities = js.Array[typings.awsSdk.workdocsMod.Activity]
  
  type UserAttributeValueType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.ACTIVE_PENDING
    - java.lang.String
  */
  type UserFilterType = typings.awsSdk.workdocsMod._UserFilterType | java.lang.String
  
  type UserIdsType = java.lang.String
  
  type UserMetadataList = js.Array[typings.awsSdk.workdocsMod.UserMetadata]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER_NAME
    - typings.awsSdk.awsSdkStrings.FULL_NAME
    - typings.awsSdk.awsSdkStrings.STORAGE_LIMIT
    - typings.awsSdk.awsSdkStrings.USER_STATUS
    - typings.awsSdk.awsSdkStrings.STORAGE_USED
    - java.lang.String
  */
  type UserSortType = typings.awsSdk.workdocsMod._UserSortType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type UserStatusType = typings.awsSdk.workdocsMod._UserStatusType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER
    - typings.awsSdk.awsSdkStrings.ADMIN
    - typings.awsSdk.awsSdkStrings.POWERUSER
    - typings.awsSdk.awsSdkStrings.MINIMALUSER
    - typings.awsSdk.awsSdkStrings.WORKSPACESUSER
    - java.lang.String
  */
  type UserType = typings.awsSdk.workdocsMod._UserType | java.lang.String
  
  type UsernameType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-05-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.workdocsMod._apiVersion | java.lang.String
}
