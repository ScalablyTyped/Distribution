package typings.awsSdk.clientsTnbMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.MODIFY_VNF_INFORMATION
import typings.awsSdk.awsSdkStrings.applicationSlashzip
import typings.awsSdk.awsSdkStrings.textSlashplain
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Boolean = scala.Boolean

type CreateSolNetworkInstanceInputNsDescriptionString = java.lang.String

type CreateSolNetworkInstanceInputNsNameString = java.lang.String

type DescriptorContentType = textSlashplain | java.lang.String

type ErrorCause = java.lang.String

type ErrorDetails = java.lang.String

type GetSolNetworkOperationTasksList = js.Array[GetSolNetworkOperationTaskDetails]

type GetSolVnfcResourceInfoList = js.Array[GetSolVnfcResourceInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INSTANTIATE
  - typings.awsSdk.awsSdkStrings.UPDATE
  - typings.awsSdk.awsSdkStrings.TERMINATE
  - java.lang.String
*/
type LcmOperationType = _LcmOperationType | java.lang.String

type ListSolFunctionInstanceResources = js.Array[ListSolFunctionInstanceInfo]

type ListSolFunctionInstancesInputMaxResultsInteger = Double

type ListSolFunctionPackageResources = js.Array[ListSolFunctionPackageInfo]

type ListSolFunctionPackagesInputMaxResultsInteger = Double

type ListSolNetworkInstanceResources = js.Array[ListSolNetworkInstanceInfo]

type ListSolNetworkInstancesInputMaxResultsInteger = Double

type ListSolNetworkOperationsInputMaxResultsInteger = Double

type ListSolNetworkOperationsResources = js.Array[ListSolNetworkOperationsInfo]

type ListSolNetworkPackageResources = js.Array[ListSolNetworkPackageInfo]

type ListSolNetworkPackagesInputMaxResultsInteger = Double

type NsInstanceArn = java.lang.String

type NsInstanceId = java.lang.String

type NsLcmOpOccArn = java.lang.String

type NsLcmOpOccId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROCESSING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type NsLcmOperationState = _NsLcmOperationState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INSTANTIATED
  - typings.awsSdk.awsSdkStrings.NOT_INSTANTIATED
  - typings.awsSdk.awsSdkStrings.IMPAIRED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.DELETED
  - typings.awsSdk.awsSdkStrings.INSTANTIATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.TERMINATE_IN_PROGRESS
  - java.lang.String
*/
type NsState = _NsState | java.lang.String

type NsdId = java.lang.String

type NsdInfoArn = java.lang.String

type NsdInfoId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.ONBOARDED
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type NsdOnboardingState = _NsdOnboardingState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type NsdOperationalState = _NsdOperationalState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_USE
  - typings.awsSdk.awsSdkStrings.NOT_IN_USE
  - java.lang.String
*/
type NsdUsageState = _NsdUsageState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.ONBOARDED
  - typings.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type OnboardingState = _OnboardingState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type OperationalState = _OperationalState | java.lang.String

type OverrideList = js.Array[ToscaOverride]

type PackageContentType = applicationSlashzip | java.lang.String

type PaginationToken = java.lang.String

type String = java.lang.String

type StringMap = StringDictionary[String]

type SyntheticTimestampDateTime = js.Date

type TNBResourceArn = java.lang.String

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SCHEDULED
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.SKIPPED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type TaskStatus = _TaskStatus | java.lang.String

type UpdateSolNetworkType = MODIFY_VNF_INFORMATION | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_USE
  - typings.awsSdk.awsSdkStrings.NOT_IN_USE
  - java.lang.String
*/
type UsageState = _UsageState | java.lang.String

type VnfInstanceArn = java.lang.String

type VnfInstanceId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INSTANTIATED
  - typings.awsSdk.awsSdkStrings.NOT_INSTANTIATED
  - java.lang.String
*/
type VnfInstantiationState = _VnfInstantiationState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type VnfOperationalState = _VnfOperationalState | java.lang.String

type VnfPkgArn = java.lang.String

type VnfPkgId = java.lang.String

type VnfPkgIdList = js.Array[VnfPkgId]

type VnfdId = java.lang.String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2008-10-21`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
