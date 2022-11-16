package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.ACTIVE
import typings.awsSdk.awsSdkStrings.ALL
import typings.awsSdk.awsSdkStrings.SHARED_WITH_ME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActivityNamesFilterType = String

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
type ActivityType = _ActivityType | String

type AuthenticationHeaderType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRUE
  - typings.awsSdk.awsSdkStrings.FALSE
  - java.lang.String
*/
type BooleanEnumType = _BooleanEnumType | String

type BooleanType = Boolean

type CommentIdType = String

type CommentList = js.Array[Comment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DRAFT
  - typings.awsSdk.awsSdkStrings.PUBLISHED
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type CommentStatusType = _CommentStatusType | String

type CommentTextType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUBLIC
  - typings.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type CommentVisibilityType = _CommentVisibilityType | String

type CustomMetadataKeyList = js.Array[CustomMetadataKeyType]

type CustomMetadataKeyType = String

type CustomMetadataMap = StringDictionary[CustomMetadataValueType]

type CustomMetadataValueType = String

type DocumentContentType = String

type DocumentMetadataList = js.Array[DocumentMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ORIGINAL
  - typings.awsSdk.awsSdkStrings.WITH_COMMENTS
  - java.lang.String
*/
type DocumentSourceType = _DocumentSourceType | String

type DocumentSourceUrlMap = StringDictionary[UrlType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INITIALIZED
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - java.lang.String
*/
type DocumentStatusType = _DocumentStatusType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SMALL
  - typings.awsSdk.awsSdkStrings.SMALL_HQ
  - typings.awsSdk.awsSdkStrings.LARGE
  - java.lang.String
*/
type DocumentThumbnailType = _DocumentThumbnailType | String

type DocumentThumbnailUrlMap = StringDictionary[UrlType]

type DocumentVersionIdType = String

type DocumentVersionMetadataList = js.Array[DocumentVersionMetadata]

type DocumentVersionStatus = ACTIVE | String

type EmailAddressType = String

type FieldNamesType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.DOCUMENT
  - typings.awsSdk.awsSdkStrings.FOLDER
  - java.lang.String
*/
type FolderContentType = _FolderContentType | String

type FolderMetadataList = js.Array[FolderMetadata]

type GroupMetadataList = js.Array[GroupMetadata]

type GroupNameType = String

type HashType = String

type HeaderNameType = String

type HeaderValueType = String

type IdType = String

type LimitType = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.en_
  - typings.awsSdk.awsSdkStrings.fr_
  - typings.awsSdk.awsSdkStrings.ko_
  - typings.awsSdk.awsSdkStrings.de_
  - typings.awsSdk.awsSdkStrings.es_
  - typings.awsSdk.awsSdkStrings.ja_
  - typings.awsSdk.awsSdkStrings.ru_
  - typings.awsSdk.awsSdkStrings.zh_CN_
  - typings.awsSdk.awsSdkStrings.zh_TW_
  - typings.awsSdk.awsSdkStrings.pt_BR_
  - typings.awsSdk.awsSdkStrings.default__
  - java.lang.String
*/
type LocaleType = _LocaleType | String

type MarkerType = String

type MessageType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASCENDING
  - typings.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type OrderType = _OrderType | String

type OrganizationUserList = js.Array[User]

type PageMarkerType = String

type PasswordType = String

type PermissionInfoList = js.Array[PermissionInfo]

type PositiveIntegerType = Double

type PositiveSizeType = Double

type PrincipalList = js.Array[Principal]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.GROUP
  - typings.awsSdk.awsSdkStrings.INVITE
  - typings.awsSdk.awsSdkStrings.ANONYMOUS
  - typings.awsSdk.awsSdkStrings.ORGANIZATION
  - java.lang.String
*/
type PrincipalType = _PrincipalType | String

type ResourceCollectionType = SHARED_WITH_ME | String

type ResourceIdType = String

type ResourceNameType = String

type ResourcePathComponentList = js.Array[ResourcePathComponent]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.NAME
  - java.lang.String
*/
type ResourceSortType = _ResourceSortType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.RESTORING
  - typings.awsSdk.awsSdkStrings.RECYCLING
  - typings.awsSdk.awsSdkStrings.RECYCLED
  - java.lang.String
*/
type ResourceStateType = _ResourceStateType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FOLDER
  - typings.awsSdk.awsSdkStrings.DOCUMENT
  - java.lang.String
*/
type ResourceType = _ResourceType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DIRECT
  - typings.awsSdk.awsSdkStrings.INHERITED
  - java.lang.String
*/
type RolePermissionType = _RolePermissionType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VIEWER
  - typings.awsSdk.awsSdkStrings.CONTRIBUTOR
  - typings.awsSdk.awsSdkStrings.OWNER
  - typings.awsSdk.awsSdkStrings.COOWNER
  - java.lang.String
*/
type RoleType = _RoleType | String

type SearchMarkerType = String

type SearchQueryType = String

type SharePrincipalList = js.Array[SharePrincipal]

type ShareResultsList = js.Array[ShareResult]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILURE
  - java.lang.String
*/
type ShareStatusType = _ShareStatusType | String

type SharedLabel = String

type SharedLabels = js.Array[SharedLabel]

type SignedHeaderMap = StringDictionary[HeaderValueType]

type SizeType = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNLIMITED
  - typings.awsSdk.awsSdkStrings.QUOTA
  - java.lang.String
*/
type StorageType = _StorageType | String

type SubscriptionEndPointType = String

type SubscriptionList = js.Array[Subscription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTPS
  - typings.awsSdk.awsSdkStrings.SQS
  - java.lang.String
*/
type SubscriptionProtocolType = _SubscriptionProtocolType | String

type SubscriptionType = ALL | String

type TimeZoneIdType = String

type TimestampType = js.Date

type UrlType = String

type UserActivities = js.Array[Activity]

type UserAttributeValueType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALL
  - typings.awsSdk.awsSdkStrings.ACTIVE_PENDING
  - java.lang.String
*/
type UserFilterType = _UserFilterType | String

type UserIdsType = String

type UserMetadataList = js.Array[UserMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER_NAME
  - typings.awsSdk.awsSdkStrings.FULL_NAME
  - typings.awsSdk.awsSdkStrings.STORAGE_LIMIT
  - typings.awsSdk.awsSdkStrings.USER_STATUS
  - typings.awsSdk.awsSdkStrings.STORAGE_USED
  - java.lang.String
*/
type UserSortType = _UserSortType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.INACTIVE
  - typings.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type UserStatusType = _UserStatusType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.ADMIN
  - typings.awsSdk.awsSdkStrings.POWERUSER
  - typings.awsSdk.awsSdkStrings.MINIMALUSER
  - typings.awsSdk.awsSdkStrings.WORKSPACESUSER
  - java.lang.String
*/
type UserType = _UserType | String

type UsernameType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-05-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
