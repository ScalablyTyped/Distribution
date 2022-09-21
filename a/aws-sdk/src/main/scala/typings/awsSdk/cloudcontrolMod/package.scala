package typings.awsSdk.cloudcontrolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ClientToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NotUpdatable
  - typings.awsSdk.awsSdkStrings.InvalidRequest
  - typings.awsSdk.awsSdkStrings.AccessDenied
  - typings.awsSdk.awsSdkStrings.InvalidCredentials
  - typings.awsSdk.awsSdkStrings.AlreadyExists
  - typings.awsSdk.awsSdkStrings.NotFound
  - typings.awsSdk.awsSdkStrings.ResourceConflict
  - typings.awsSdk.awsSdkStrings.Throttling_
  - typings.awsSdk.awsSdkStrings.ServiceLimitExceeded
  - typings.awsSdk.awsSdkStrings.NotStabilized
  - typings.awsSdk.awsSdkStrings.GeneralServiceException
  - typings.awsSdk.awsSdkStrings.ServiceInternalError
  - typings.awsSdk.awsSdkStrings.ServiceTimeout
  - typings.awsSdk.awsSdkStrings.NetworkFailure
  - typings.awsSdk.awsSdkStrings.InternalFailure
  - java.lang.String
*/
type HandlerErrorCode = _HandlerErrorCode | String

type HandlerNextToken = String

type Identifier = String

type MaxResults = Double

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE
  - typings.awsSdk.awsSdkStrings.DELETE
  - typings.awsSdk.awsSdkStrings.UPDATE
  - java.lang.String
*/
type Operation = _Operation | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCEL_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CANCEL_COMPLETE
  - java.lang.String
*/
type OperationStatus = _OperationStatus | String

type OperationStatuses = js.Array[OperationStatus]

type Operations = js.Array[Operation]

type PatchDocument = String

type Properties = String

type RequestToken = String

type ResourceDescriptions = js.Array[ResourceDescription]

type ResourceRequestStatusSummaries = js.Array[ProgressEvent]

type RoleArn = String

type StatusMessage = String

type Timestamp = js.Date

type TypeName = String

type TypeVersionId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-09-30`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
