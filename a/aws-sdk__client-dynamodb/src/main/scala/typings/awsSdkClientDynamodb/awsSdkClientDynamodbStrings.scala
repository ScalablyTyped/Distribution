package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.AttributeAction
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BackupStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BackupType
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BackupTypeFilter
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BatchStatementErrorCodeEnum
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BillingMode
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ComparisonOperator
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ConditionalOperator
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ContinuousBackupsStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ContributorInsightsAction
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ContributorInsightsStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.DestinationStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ExportFormat
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ExportStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.GlobalTableStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ImportStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.IndexStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.InputCompressionType
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.InputFormat
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.KeyType
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.PointInTimeRecoveryStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ProjectionType
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReplicaStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnConsumedCapacity
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnItemCollectionMetrics
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnValue
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnValuesOnConditionCheckFailure
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.S3SseAlgorithm
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.SSEStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.SSEType
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ScalarAttributeType
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.Select
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.StreamViewType
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TableClass
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TableStatus
import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.TimeToLiveStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsSdkClientDynamodbStrings {
  
  @js.native
  sealed trait ACTIVE
    extends StObject
       with DestinationStatus
       with GlobalTableStatus
       with IndexStatus
       with ReplicaStatus
       with TableStatus
  inline def ACTIVE: ACTIVE = "ACTIVE".asInstanceOf[ACTIVE]
  
  @js.native
  sealed trait ADD
    extends StObject
       with AttributeAction
  inline def ADD: ADD = "ADD".asInstanceOf[ADD]
  
  @js.native
  sealed trait AES256
    extends StObject
       with S3SseAlgorithm
       with SSEType
  inline def AES256: AES256 = "AES256".asInstanceOf[AES256]
  
  @js.native
  sealed trait ALL
    extends StObject
       with BackupTypeFilter
       with ProjectionType
  inline def ALL: ALL = "ALL".asInstanceOf[ALL]
  
  @js.native
  sealed trait ALL_ATTRIBUTES
    extends StObject
       with Select
  inline def ALL_ATTRIBUTES: ALL_ATTRIBUTES = "ALL_ATTRIBUTES".asInstanceOf[ALL_ATTRIBUTES]
  
  @js.native
  sealed trait ALL_NEW
    extends StObject
       with ReturnValue
  inline def ALL_NEW: ALL_NEW = "ALL_NEW".asInstanceOf[ALL_NEW]
  
  @js.native
  sealed trait ALL_OLD
    extends StObject
       with ReturnValue
       with ReturnValuesOnConditionCheckFailure
  inline def ALL_OLD: ALL_OLD = "ALL_OLD".asInstanceOf[ALL_OLD]
  
  @js.native
  sealed trait ALL_PROJECTED_ATTRIBUTES
    extends StObject
       with Select
  inline def ALL_PROJECTED_ATTRIBUTES: ALL_PROJECTED_ATTRIBUTES = "ALL_PROJECTED_ATTRIBUTES".asInstanceOf[ALL_PROJECTED_ATTRIBUTES]
  
  @js.native
  sealed trait AND
    extends StObject
       with ConditionalOperator
  inline def AND: AND = "AND".asInstanceOf[AND]
  
  @js.native
  sealed trait ARCHIVED
    extends StObject
       with TableStatus
  inline def ARCHIVED: ARCHIVED = "ARCHIVED".asInstanceOf[ARCHIVED]
  
  @js.native
  sealed trait ARCHIVING
    extends StObject
       with TableStatus
  inline def ARCHIVING: ARCHIVING = "ARCHIVING".asInstanceOf[ARCHIVING]
  
  @js.native
  sealed trait AVAILABLE
    extends StObject
       with BackupStatus
  inline def AVAILABLE: AVAILABLE = "AVAILABLE".asInstanceOf[AVAILABLE]
  
  @js.native
  sealed trait AWS_BACKUP
    extends StObject
       with BackupType
       with BackupTypeFilter
  inline def AWS_BACKUP: AWS_BACKUP = "AWS_BACKUP".asInstanceOf[AWS_BACKUP]
  
  @js.native
  sealed trait AccessDenied
    extends StObject
       with BatchStatementErrorCodeEnum
  inline def AccessDenied: AccessDenied = "AccessDenied".asInstanceOf[AccessDenied]
  
  @js.native
  sealed trait B
    extends StObject
       with ScalarAttributeType
  inline def B: B = "B".asInstanceOf[B]
  
  @js.native
  sealed trait BEGINS_WITH
    extends StObject
       with ComparisonOperator
  inline def BEGINS_WITH: BEGINS_WITH = "BEGINS_WITH".asInstanceOf[BEGINS_WITH]
  
  @js.native
  sealed trait BETWEEN
    extends StObject
       with ComparisonOperator
  inline def BETWEEN: BETWEEN = "BETWEEN".asInstanceOf[BETWEEN]
  
  @js.native
  sealed trait BackupInUseException extends StObject
  inline def BackupInUseException: BackupInUseException = "BackupInUseException".asInstanceOf[BackupInUseException]
  
  @js.native
  sealed trait BackupNotFoundException extends StObject
  inline def BackupNotFoundException: BackupNotFoundException = "BackupNotFoundException".asInstanceOf[BackupNotFoundException]
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with ImportStatus
  inline def CANCELLED: CANCELLED = "CANCELLED".asInstanceOf[CANCELLED]
  
  @js.native
  sealed trait CANCELLING
    extends StObject
       with ImportStatus
  inline def CANCELLING: CANCELLING = "CANCELLING".asInstanceOf[CANCELLING]
  
  @js.native
  sealed trait COMPLETED
    extends StObject
       with ExportStatus
       with ImportStatus
  inline def COMPLETED: COMPLETED = "COMPLETED".asInstanceOf[COMPLETED]
  
  @js.native
  sealed trait CONTAINS
    extends StObject
       with ComparisonOperator
  inline def CONTAINS: CONTAINS = "CONTAINS".asInstanceOf[CONTAINS]
  
  @js.native
  sealed trait COUNT
    extends StObject
       with Select
  inline def COUNT: COUNT = "COUNT".asInstanceOf[COUNT]
  
  @js.native
  sealed trait CREATING
    extends StObject
       with BackupStatus
       with GlobalTableStatus
       with IndexStatus
       with ReplicaStatus
       with TableStatus
  inline def CREATING: CREATING = "CREATING".asInstanceOf[CREATING]
  
  @js.native
  sealed trait CREATION_FAILED
    extends StObject
       with ReplicaStatus
  inline def CREATION_FAILED: CREATION_FAILED = "CREATION_FAILED".asInstanceOf[CREATION_FAILED]
  
  @js.native
  sealed trait CSV
    extends StObject
       with InputFormat
  inline def CSV: CSV = "CSV".asInstanceOf[CSV]
  
  @js.native
  sealed trait ConditionalCheckFailed
    extends StObject
       with BatchStatementErrorCodeEnum
  inline def ConditionalCheckFailed: ConditionalCheckFailed = "ConditionalCheckFailed".asInstanceOf[ConditionalCheckFailed]
  
  @js.native
  sealed trait ConditionalCheckFailedException extends StObject
  inline def ConditionalCheckFailedException: ConditionalCheckFailedException = "ConditionalCheckFailedException".asInstanceOf[ConditionalCheckFailedException]
  
  @js.native
  sealed trait ContinuousBackupsUnavailableException extends StObject
  inline def ContinuousBackupsUnavailableException: ContinuousBackupsUnavailableException = "ContinuousBackupsUnavailableException".asInstanceOf[ContinuousBackupsUnavailableException]
  
  @js.native
  sealed trait DELETE
    extends StObject
       with AttributeAction
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait DELETED
    extends StObject
       with BackupStatus
  inline def DELETED: DELETED = "DELETED".asInstanceOf[DELETED]
  
  @js.native
  sealed trait DELETING
    extends StObject
       with GlobalTableStatus
       with IndexStatus
       with ReplicaStatus
       with TableStatus
  inline def DELETING: DELETING = "DELETING".asInstanceOf[DELETING]
  
  @js.native
  sealed trait DISABLE
    extends StObject
       with ContributorInsightsAction
  inline def DISABLE: DISABLE = "DISABLE".asInstanceOf[DISABLE]
  
  @js.native
  sealed trait DISABLED
    extends StObject
       with ContinuousBackupsStatus
       with ContributorInsightsStatus
       with DestinationStatus
       with PointInTimeRecoveryStatus
       with SSEStatus
       with TimeToLiveStatus
  inline def DISABLED: DISABLED = "DISABLED".asInstanceOf[DISABLED]
  
  @js.native
  sealed trait DISABLING
    extends StObject
       with ContributorInsightsStatus
       with DestinationStatus
       with SSEStatus
       with TimeToLiveStatus
  inline def DISABLING: DISABLING = "DISABLING".asInstanceOf[DISABLING]
  
  @js.native
  sealed trait DYNAMODB_JSON
    extends StObject
       with ExportFormat
       with InputFormat
  inline def DYNAMODB_JSON: DYNAMODB_JSON = "DYNAMODB_JSON".asInstanceOf[DYNAMODB_JSON]
  
  @js.native
  sealed trait DuplicateItem
    extends StObject
       with BatchStatementErrorCodeEnum
  inline def DuplicateItem: DuplicateItem = "DuplicateItem".asInstanceOf[DuplicateItem]
  
  @js.native
  sealed trait DuplicateItemException extends StObject
  inline def DuplicateItemException: DuplicateItemException = "DuplicateItemException".asInstanceOf[DuplicateItemException]
  
  @js.native
  sealed trait ENABLE
    extends StObject
       with ContributorInsightsAction
  inline def ENABLE: ENABLE = "ENABLE".asInstanceOf[ENABLE]
  
  @js.native
  sealed trait ENABLED
    extends StObject
       with ContinuousBackupsStatus
       with ContributorInsightsStatus
       with PointInTimeRecoveryStatus
       with SSEStatus
       with TimeToLiveStatus
  inline def ENABLED: ENABLED = "ENABLED".asInstanceOf[ENABLED]
  
  @js.native
  sealed trait ENABLE_FAILED
    extends StObject
       with DestinationStatus
  inline def ENABLE_FAILED: ENABLE_FAILED = "ENABLE_FAILED".asInstanceOf[ENABLE_FAILED]
  
  @js.native
  sealed trait ENABLING
    extends StObject
       with ContributorInsightsStatus
       with DestinationStatus
       with SSEStatus
       with TimeToLiveStatus
  inline def ENABLING: ENABLING = "ENABLING".asInstanceOf[ENABLING]
  
  @js.native
  sealed trait EQ
    extends StObject
       with ComparisonOperator
  inline def EQ: EQ = "EQ".asInstanceOf[EQ]
  
  @js.native
  sealed trait ExportConflictException extends StObject
  inline def ExportConflictException: ExportConflictException = "ExportConflictException".asInstanceOf[ExportConflictException]
  
  @js.native
  sealed trait ExportNotFoundException extends StObject
  inline def ExportNotFoundException: ExportNotFoundException = "ExportNotFoundException".asInstanceOf[ExportNotFoundException]
  
  @js.native
  sealed trait FAILED
    extends StObject
       with ContributorInsightsStatus
       with ExportStatus
       with ImportStatus
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait GE
    extends StObject
       with ComparisonOperator
  inline def GE: GE = "GE".asInstanceOf[GE]
  
  @js.native
  sealed trait GT
    extends StObject
       with ComparisonOperator
  inline def GT: GT = "GT".asInstanceOf[GT]
  
  @js.native
  sealed trait GZIP
    extends StObject
       with InputCompressionType
  inline def GZIP: GZIP = "GZIP".asInstanceOf[GZIP]
  
  @js.native
  sealed trait GlobalTableAlreadyExistsException extends StObject
  inline def GlobalTableAlreadyExistsException: GlobalTableAlreadyExistsException = "GlobalTableAlreadyExistsException".asInstanceOf[GlobalTableAlreadyExistsException]
  
  @js.native
  sealed trait GlobalTableNotFoundException extends StObject
  inline def GlobalTableNotFoundException: GlobalTableNotFoundException = "GlobalTableNotFoundException".asInstanceOf[GlobalTableNotFoundException]
  
  @js.native
  sealed trait HASH
    extends StObject
       with KeyType
  inline def HASH: HASH = "HASH".asInstanceOf[HASH]
  
  @js.native
  sealed trait IN
    extends StObject
       with ComparisonOperator
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait INACCESSIBLE_ENCRYPTION_CREDENTIALS
    extends StObject
       with ReplicaStatus
       with TableStatus
  inline def INACCESSIBLE_ENCRYPTION_CREDENTIALS: INACCESSIBLE_ENCRYPTION_CREDENTIALS = "INACCESSIBLE_ENCRYPTION_CREDENTIALS".asInstanceOf[INACCESSIBLE_ENCRYPTION_CREDENTIALS]
  
  @js.native
  sealed trait INCLUDE
    extends StObject
       with ProjectionType
  inline def INCLUDE: INCLUDE = "INCLUDE".asInstanceOf[INCLUDE]
  
  @js.native
  sealed trait INDEXES
    extends StObject
       with ReturnConsumedCapacity
  inline def INDEXES: INDEXES = "INDEXES".asInstanceOf[INDEXES]
  
  @js.native
  sealed trait IN_PROGRESS
    extends StObject
       with ExportStatus
       with ImportStatus
  inline def IN_PROGRESS: IN_PROGRESS = "IN_PROGRESS".asInstanceOf[IN_PROGRESS]
  
  @js.native
  sealed trait ION
    extends StObject
       with ExportFormat
       with InputFormat
  inline def ION: ION = "ION".asInstanceOf[ION]
  
  @js.native
  sealed trait IdempotentParameterMismatchException extends StObject
  inline def IdempotentParameterMismatchException: IdempotentParameterMismatchException = "IdempotentParameterMismatchException".asInstanceOf[IdempotentParameterMismatchException]
  
  @js.native
  sealed trait ImportConflictException extends StObject
  inline def ImportConflictException: ImportConflictException = "ImportConflictException".asInstanceOf[ImportConflictException]
  
  @js.native
  sealed trait ImportNotFoundException extends StObject
  inline def ImportNotFoundException: ImportNotFoundException = "ImportNotFoundException".asInstanceOf[ImportNotFoundException]
  
  @js.native
  sealed trait IndexNotFoundException extends StObject
  inline def IndexNotFoundException: IndexNotFoundException = "IndexNotFoundException".asInstanceOf[IndexNotFoundException]
  
  @js.native
  sealed trait InternalServerError
    extends StObject
       with BatchStatementErrorCodeEnum
  inline def InternalServerError: InternalServerError = "InternalServerError".asInstanceOf[InternalServerError]
  
  @js.native
  sealed trait InvalidEndpointException extends StObject
  inline def InvalidEndpointException: InvalidEndpointException = "InvalidEndpointException".asInstanceOf[InvalidEndpointException]
  
  @js.native
  sealed trait InvalidExportTimeException extends StObject
  inline def InvalidExportTimeException: InvalidExportTimeException = "InvalidExportTimeException".asInstanceOf[InvalidExportTimeException]
  
  @js.native
  sealed trait InvalidRestoreTimeException extends StObject
  inline def InvalidRestoreTimeException: InvalidRestoreTimeException = "InvalidRestoreTimeException".asInstanceOf[InvalidRestoreTimeException]
  
  @js.native
  sealed trait ItemCollectionSizeLimitExceeded
    extends StObject
       with BatchStatementErrorCodeEnum
  inline def ItemCollectionSizeLimitExceeded: ItemCollectionSizeLimitExceeded = "ItemCollectionSizeLimitExceeded".asInstanceOf[ItemCollectionSizeLimitExceeded]
  
  @js.native
  sealed trait ItemCollectionSizeLimitExceededException extends StObject
  inline def ItemCollectionSizeLimitExceededException: ItemCollectionSizeLimitExceededException = "ItemCollectionSizeLimitExceededException".asInstanceOf[ItemCollectionSizeLimitExceededException]
  
  @js.native
  sealed trait KEYS_ONLY
    extends StObject
       with ProjectionType
       with StreamViewType
  inline def KEYS_ONLY: KEYS_ONLY = "KEYS_ONLY".asInstanceOf[KEYS_ONLY]
  
  @js.native
  sealed trait KMS
    extends StObject
       with S3SseAlgorithm
       with SSEType
  inline def KMS: KMS = "KMS".asInstanceOf[KMS]
  
  @js.native
  sealed trait LE
    extends StObject
       with ComparisonOperator
  inline def LE: LE = "LE".asInstanceOf[LE]
  
  @js.native
  sealed trait LT
    extends StObject
       with ComparisonOperator
  inline def LT: LT = "LT".asInstanceOf[LT]
  
  @js.native
  sealed trait LimitExceededException extends StObject
  inline def LimitExceededException: LimitExceededException = "LimitExceededException".asInstanceOf[LimitExceededException]
  
  @js.native
  sealed trait N
    extends StObject
       with ScalarAttributeType
  inline def N: N = "N".asInstanceOf[N]
  
  @js.native
  sealed trait NE
    extends StObject
       with ComparisonOperator
  inline def NE: NE = "NE".asInstanceOf[NE]
  
  @js.native
  sealed trait NEW_AND_OLD_IMAGES
    extends StObject
       with StreamViewType
  inline def NEW_AND_OLD_IMAGES: NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES".asInstanceOf[NEW_AND_OLD_IMAGES]
  
  @js.native
  sealed trait NEW_IMAGE
    extends StObject
       with StreamViewType
  inline def NEW_IMAGE: NEW_IMAGE = "NEW_IMAGE".asInstanceOf[NEW_IMAGE]
  
  @js.native
  sealed trait NONE
    extends StObject
       with InputCompressionType
       with ReturnConsumedCapacity
       with ReturnItemCollectionMetrics
       with ReturnValue
       with ReturnValuesOnConditionCheckFailure
  inline def NONE: NONE = "NONE".asInstanceOf[NONE]
  
  @js.native
  sealed trait NOT_CONTAINS
    extends StObject
       with ComparisonOperator
  inline def NOT_CONTAINS: NOT_CONTAINS = "NOT_CONTAINS".asInstanceOf[NOT_CONTAINS]
  
  @js.native
  sealed trait NOT_NULL
    extends StObject
       with ComparisonOperator
  inline def NOT_NULL: NOT_NULL = "NOT_NULL".asInstanceOf[NOT_NULL]
  
  @js.native
  sealed trait NULL
    extends StObject
       with ComparisonOperator
  inline def NULL: NULL = "NULL".asInstanceOf[NULL]
  
  @js.native
  sealed trait OLD_IMAGE
    extends StObject
       with StreamViewType
  inline def OLD_IMAGE: OLD_IMAGE = "OLD_IMAGE".asInstanceOf[OLD_IMAGE]
  
  @js.native
  sealed trait OR
    extends StObject
       with ConditionalOperator
  inline def OR: OR = "OR".asInstanceOf[OR]
  
  @js.native
  sealed trait PAY_PER_REQUEST
    extends StObject
       with BillingMode
  inline def PAY_PER_REQUEST: PAY_PER_REQUEST = "PAY_PER_REQUEST".asInstanceOf[PAY_PER_REQUEST]
  
  @js.native
  sealed trait PROVISIONED
    extends StObject
       with BillingMode
  inline def PROVISIONED: PROVISIONED = "PROVISIONED".asInstanceOf[PROVISIONED]
  
  @js.native
  sealed trait PUT
    extends StObject
       with AttributeAction
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait PointInTimeRecoveryUnavailableException extends StObject
  inline def PointInTimeRecoveryUnavailableException: PointInTimeRecoveryUnavailableException = "PointInTimeRecoveryUnavailableException".asInstanceOf[PointInTimeRecoveryUnavailableException]
  
  @js.native
  sealed trait ProvisionedThroughputExceeded
    extends StObject
       with BatchStatementErrorCodeEnum
  inline def ProvisionedThroughputExceeded: ProvisionedThroughputExceeded = "ProvisionedThroughputExceeded".asInstanceOf[ProvisionedThroughputExceeded]
  
  @js.native
  sealed trait ProvisionedThroughputExceededException extends StObject
  inline def ProvisionedThroughputExceededException: ProvisionedThroughputExceededException = "ProvisionedThroughputExceededException".asInstanceOf[ProvisionedThroughputExceededException]
  
  @js.native
  sealed trait RANGE
    extends StObject
       with KeyType
  inline def RANGE: RANGE = "RANGE".asInstanceOf[RANGE]
  
  @js.native
  sealed trait REGION_DISABLED
    extends StObject
       with ReplicaStatus
  inline def REGION_DISABLED: REGION_DISABLED = "REGION_DISABLED".asInstanceOf[REGION_DISABLED]
  
  @js.native
  sealed trait ReplicaAlreadyExistsException extends StObject
  inline def ReplicaAlreadyExistsException: ReplicaAlreadyExistsException = "ReplicaAlreadyExistsException".asInstanceOf[ReplicaAlreadyExistsException]
  
  @js.native
  sealed trait ReplicaNotFoundException extends StObject
  inline def ReplicaNotFoundException: ReplicaNotFoundException = "ReplicaNotFoundException".asInstanceOf[ReplicaNotFoundException]
  
  @js.native
  sealed trait RequestLimitExceeded
    extends StObject
       with BatchStatementErrorCodeEnum
  inline def RequestLimitExceeded: RequestLimitExceeded = "RequestLimitExceeded".asInstanceOf[RequestLimitExceeded]
  
  @js.native
  sealed trait ResourceInUseException extends StObject
  inline def ResourceInUseException: ResourceInUseException = "ResourceInUseException".asInstanceOf[ResourceInUseException]
  
  @js.native
  sealed trait ResourceNotFound
    extends StObject
       with BatchStatementErrorCodeEnum
  inline def ResourceNotFound: ResourceNotFound = "ResourceNotFound".asInstanceOf[ResourceNotFound]
  
  @js.native
  sealed trait ResourceNotFoundException extends StObject
  inline def ResourceNotFoundException: ResourceNotFoundException = "ResourceNotFoundException".asInstanceOf[ResourceNotFoundException]
  
  @js.native
  sealed trait S
    extends StObject
       with ScalarAttributeType
  inline def S: S = "S".asInstanceOf[S]
  
  @js.native
  sealed trait SIZE
    extends StObject
       with ReturnItemCollectionMetrics
  inline def SIZE: SIZE = "SIZE".asInstanceOf[SIZE]
  
  @js.native
  sealed trait SPECIFIC_ATTRIBUTES
    extends StObject
       with Select
  inline def SPECIFIC_ATTRIBUTES: SPECIFIC_ATTRIBUTES = "SPECIFIC_ATTRIBUTES".asInstanceOf[SPECIFIC_ATTRIBUTES]
  
  @js.native
  sealed trait STANDARD
    extends StObject
       with TableClass
  inline def STANDARD: STANDARD = "STANDARD".asInstanceOf[STANDARD]
  
  @js.native
  sealed trait STANDARD_INFREQUENT_ACCESS
    extends StObject
       with TableClass
  inline def STANDARD_INFREQUENT_ACCESS: STANDARD_INFREQUENT_ACCESS = "STANDARD_INFREQUENT_ACCESS".asInstanceOf[STANDARD_INFREQUENT_ACCESS]
  
  @js.native
  sealed trait SYSTEM
    extends StObject
       with BackupType
       with BackupTypeFilter
  inline def SYSTEM: SYSTEM = "SYSTEM".asInstanceOf[SYSTEM]
  
  @js.native
  sealed trait TOTAL
    extends StObject
       with ReturnConsumedCapacity
  inline def TOTAL: TOTAL = "TOTAL".asInstanceOf[TOTAL]
  
  @js.native
  sealed trait TableAlreadyExistsException extends StObject
  inline def TableAlreadyExistsException: TableAlreadyExistsException = "TableAlreadyExistsException".asInstanceOf[TableAlreadyExistsException]
  
  @js.native
  sealed trait TableInUseException extends StObject
  inline def TableInUseException: TableInUseException = "TableInUseException".asInstanceOf[TableInUseException]
  
  @js.native
  sealed trait TableNotFoundException extends StObject
  inline def TableNotFoundException: TableNotFoundException = "TableNotFoundException".asInstanceOf[TableNotFoundException]
  
  @js.native
  sealed trait ThrottlingError
    extends StObject
       with BatchStatementErrorCodeEnum
  inline def ThrottlingError: ThrottlingError = "ThrottlingError".asInstanceOf[ThrottlingError]
  
  @js.native
  sealed trait TransactionCanceledException extends StObject
  inline def TransactionCanceledException: TransactionCanceledException = "TransactionCanceledException".asInstanceOf[TransactionCanceledException]
  
  @js.native
  sealed trait TransactionConflict
    extends StObject
       with BatchStatementErrorCodeEnum
  inline def TransactionConflict: TransactionConflict = "TransactionConflict".asInstanceOf[TransactionConflict]
  
  @js.native
  sealed trait TransactionConflictException extends StObject
  inline def TransactionConflictException: TransactionConflictException = "TransactionConflictException".asInstanceOf[TransactionConflictException]
  
  @js.native
  sealed trait TransactionInProgressException extends StObject
  inline def TransactionInProgressException: TransactionInProgressException = "TransactionInProgressException".asInstanceOf[TransactionInProgressException]
  
  @js.native
  sealed trait UPDATED_NEW
    extends StObject
       with ReturnValue
  inline def UPDATED_NEW: UPDATED_NEW = "UPDATED_NEW".asInstanceOf[UPDATED_NEW]
  
  @js.native
  sealed trait UPDATED_OLD
    extends StObject
       with ReturnValue
  inline def UPDATED_OLD: UPDATED_OLD = "UPDATED_OLD".asInstanceOf[UPDATED_OLD]
  
  @js.native
  sealed trait UPDATING
    extends StObject
       with GlobalTableStatus
       with IndexStatus
       with ReplicaStatus
       with SSEStatus
       with TableStatus
  inline def UPDATING: UPDATING = "UPDATING".asInstanceOf[UPDATING]
  
  @js.native
  sealed trait USER
    extends StObject
       with BackupType
       with BackupTypeFilter
  inline def USER: USER = "USER".asInstanceOf[USER]
  
  @js.native
  sealed trait ValidationError
    extends StObject
       with BatchStatementErrorCodeEnum
  inline def ValidationError: ValidationError = "ValidationError".asInstanceOf[ValidationError]
  
  @js.native
  sealed trait ZSTD
    extends StObject
       with InputCompressionType
  inline def ZSTD: ZSTD = "ZSTD".asInstanceOf[ZSTD]
  
  @js.native
  sealed trait client extends StObject
  inline def client: client = "client".asInstanceOf[client]
  
  @js.native
  sealed trait server extends StObject
  inline def server: server = "server".asInstanceOf[server]
}
