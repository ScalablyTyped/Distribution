package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object secretsmanagerMod {
  type AutomaticallyRotateAfterDaysType = scala.Double
  type BooleanType = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.secretsmanagerMod.ClientApiVersions
  type ClientRequestTokenType = java.lang.String
  type CreatedDateType = typings.std.Date
  type DeletedDateType = typings.std.Date
  type DeletionDateType = typings.std.Date
  type DescriptionType = java.lang.String
  type ErrorMessage = java.lang.String
  type ExcludeCharactersType = java.lang.String
  type ExcludeLowercaseType = scala.Boolean
  type ExcludeNumbersType = scala.Boolean
  type ExcludePunctuationType = scala.Boolean
  type ExcludeUppercaseType = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.description
    - typings.awsSdk.awsSdkStrings.name__
    - typings.awsSdk.awsSdkStrings.`tag-key`
    - typings.awsSdk.awsSdkStrings.`tag-value`
    - typings.awsSdk.awsSdkStrings.all__
    - java.lang.String
  */
  type FilterNameStringType = typings.awsSdk.secretsmanagerMod._FilterNameStringType | java.lang.String
  type FilterValueStringType = java.lang.String
  type FilterValuesStringList = js.Array[typings.awsSdk.secretsmanagerMod.FilterValueStringType]
  type FiltersListType = js.Array[typings.awsSdk.secretsmanagerMod.Filter]
  type IncludeSpaceType = scala.Boolean
  type KmsKeyIdType = java.lang.String
  type LastAccessedDateType = typings.std.Date
  type LastChangedDateType = typings.std.Date
  type LastRotatedDateType = typings.std.Date
  type MaxResultsType = scala.Double
  type NameType = java.lang.String
  type NextTokenType = java.lang.String
  type NonEmptyResourcePolicyType = java.lang.String
  type OwningServiceType = java.lang.String
  type PasswordLengthType = scala.Double
  type RandomPasswordType = java.lang.String
  type RecoveryWindowInDaysType = scala.Double
  type RequireEachIncludedTypeType = scala.Boolean
  type RotationEnabledType = scala.Boolean
  type RotationLambdaARNType = java.lang.String
  type SecretARNType = java.lang.String
  type SecretBinaryType = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.secretsmanagerMod.Blob | java.lang.String
  type SecretIdType = java.lang.String
  type SecretListType = js.Array[typings.awsSdk.secretsmanagerMod.SecretListEntry]
  type SecretNameType = java.lang.String
  type SecretStringType = java.lang.String
  type SecretVersionIdType = java.lang.String
  type SecretVersionStageType = java.lang.String
  type SecretVersionStagesType = js.Array[typings.awsSdk.secretsmanagerMod.SecretVersionStageType]
  type SecretVersionsListType = js.Array[typings.awsSdk.secretsmanagerMod.SecretVersionsListEntry]
  type SecretVersionsToStagesMapType = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.secretsmanagerMod.SecretVersionStagesType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.asc_
    - typings.awsSdk.awsSdkStrings.desc_
    - java.lang.String
  */
  type SortOrderType = typings.awsSdk.secretsmanagerMod._SortOrderType | java.lang.String
  type TagKeyListType = js.Array[typings.awsSdk.secretsmanagerMod.TagKeyType]
  type TagKeyType = java.lang.String
  type TagListType = js.Array[typings.awsSdk.secretsmanagerMod.Tag]
  type TagValueType = java.lang.String
  type TimestampType = typings.std.Date
  type ValidationErrorsType = js.Array[typings.awsSdk.secretsmanagerMod.ValidationErrorsEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-10-17`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.secretsmanagerMod._apiVersion | java.lang.String
}
