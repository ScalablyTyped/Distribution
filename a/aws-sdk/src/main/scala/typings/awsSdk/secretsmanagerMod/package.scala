package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddReplicaRegionListType = js.Array[ReplicaRegionType]

type AutomaticallyRotateAfterDaysType = Double

type BooleanType = Boolean

type ClientRequestTokenType = String

type CreatedDateType = js.Date

type DeletedDateType = js.Date

type DeletionDateType = js.Date

type DescriptionType = String

type DurationType = String

type ErrorMessage = String

type ExcludeCharactersType = String

type ExcludeLowercaseType = Boolean

type ExcludeNumbersType = Boolean

type ExcludePunctuationType = Boolean

type ExcludeUppercaseType = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.description_
  - typings.awsSdk.awsSdkStrings.name__
  - typings.awsSdk.awsSdkStrings.`tag-key`
  - typings.awsSdk.awsSdkStrings.`tag-value`
  - typings.awsSdk.awsSdkStrings.`primary-region`
  - typings.awsSdk.awsSdkStrings.all__
  - java.lang.String
*/
type FilterNameStringType = _FilterNameStringType | String

type FilterValueStringType = String

type FilterValuesStringList = js.Array[FilterValueStringType]

type FiltersListType = js.Array[Filter]

type IncludeSpaceType = Boolean

type KmsKeyIdListType = js.Array[KmsKeyIdType]

type KmsKeyIdType = String

type LastAccessedDateType = js.Date

type LastChangedDateType = js.Date

type LastRotatedDateType = js.Date

type MaxResultsType = Double

type NameType = String

type NextTokenType = String

type NonEmptyResourcePolicyType = String

type OwningServiceType = String

type PasswordLengthType = Double

type RandomPasswordType = String

type RecoveryWindowInDaysType = Double

type RegionType = String

type RemoveReplicaRegionListType = js.Array[RegionType]

type ReplicationStatusListType = js.Array[ReplicationStatusType]

type RequireEachIncludedTypeType = Boolean

type RotationEnabledType = Boolean

type RotationLambdaARNType = String

type ScheduleExpressionType = String

type SecretARNType = String

type SecretBinaryType = Buffer | js.typedarray.Uint8Array | Blob | String

type SecretIdType = String

type SecretListType = js.Array[SecretListEntry]

type SecretNameType = String

type SecretStringType = String

type SecretVersionIdType = String

type SecretVersionStageType = String

type SecretVersionStagesType = js.Array[SecretVersionStageType]

type SecretVersionsListType = js.Array[SecretVersionsListEntry]

type SecretVersionsToStagesMapType = StringDictionary[SecretVersionStagesType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.asc_
  - typings.awsSdk.awsSdkStrings.desc_
  - java.lang.String
*/
type SortOrderType = _SortOrderType | String

type StatusMessageType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InSync_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - java.lang.String
*/
type StatusType = _StatusType | String

type TagKeyListType = js.Array[TagKeyType]

type TagKeyType = String

type TagListType = js.Array[Tag]

type TagValueType = String

type TimestampType = js.Date

type ValidationErrorsType = js.Array[ValidationErrorsEntry]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-10-17`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
