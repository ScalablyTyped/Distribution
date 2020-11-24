package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mturkMod {
  
  type AssignmentList = js.Array[typings.awsSdk.mturkMod.Assignment]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Submitted_
    - typings.awsSdk.awsSdkStrings.Approved_
    - typings.awsSdk.awsSdkStrings.Rejected_
    - java.lang.String
  */
  type AssignmentStatus = typings.awsSdk.mturkMod._AssignmentStatus | java.lang.String
  
  type AssignmentStatusList = js.Array[typings.awsSdk.mturkMod.AssignmentStatus]
  
  type BonusPaymentList = js.Array[typings.awsSdk.mturkMod.BonusPayment]
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.mturkMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.LessThan
    - typings.awsSdk.awsSdkStrings.LessThanOrEqualTo
    - typings.awsSdk.awsSdkStrings.GreaterThan
    - typings.awsSdk.awsSdkStrings.GreaterThanOrEqualTo
    - typings.awsSdk.awsSdkStrings.EqualTo
    - typings.awsSdk.awsSdkStrings.NotEqualTo
    - typings.awsSdk.awsSdkStrings.Exists
    - typings.awsSdk.awsSdkStrings.DoesNotExist
    - typings.awsSdk.awsSdkStrings.In_
    - typings.awsSdk.awsSdkStrings.NotIn
    - java.lang.String
  */
  type Comparator = typings.awsSdk.mturkMod._Comparator | java.lang.String
  
  type CountryParameters = java.lang.String
  
  type CurrencyAmount = java.lang.String
  
  type CustomerId = java.lang.String
  
  type CustomerIdList = js.Array[typings.awsSdk.mturkMod.CustomerId]
  
  type EntityId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AssignmentAccepted
    - typings.awsSdk.awsSdkStrings.AssignmentAbandoned
    - typings.awsSdk.awsSdkStrings.AssignmentReturned
    - typings.awsSdk.awsSdkStrings.AssignmentSubmitted
    - typings.awsSdk.awsSdkStrings.AssignmentRejected
    - typings.awsSdk.awsSdkStrings.AssignmentApproved
    - typings.awsSdk.awsSdkStrings.HITCreated
    - typings.awsSdk.awsSdkStrings.HITExpired
    - typings.awsSdk.awsSdkStrings.HITReviewable
    - typings.awsSdk.awsSdkStrings.HITExtended
    - typings.awsSdk.awsSdkStrings.HITDisposed
    - typings.awsSdk.awsSdkStrings.Ping
    - java.lang.String
  */
  type EventType = typings.awsSdk.mturkMod._EventType | java.lang.String
  
  type EventTypeList = js.Array[typings.awsSdk.mturkMod.EventType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Accept_
    - typings.awsSdk.awsSdkStrings.PreviewAndAccept
    - typings.awsSdk.awsSdkStrings.DiscoverPreviewAndAccept
    - java.lang.String
  */
  type HITAccessActions = typings.awsSdk.mturkMod._HITAccessActions | java.lang.String
  
  type HITLayoutParameterList = js.Array[typings.awsSdk.mturkMod.HITLayoutParameter]
  
  type HITList = js.Array[typings.awsSdk.mturkMod.HIT]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NotReviewed
    - typings.awsSdk.awsSdkStrings.MarkedForReview
    - typings.awsSdk.awsSdkStrings.ReviewedAppropriate
    - typings.awsSdk.awsSdkStrings.ReviewedInappropriate
    - java.lang.String
  */
  type HITReviewStatus = typings.awsSdk.mturkMod._HITReviewStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Assignable
    - typings.awsSdk.awsSdkStrings.Unassignable
    - typings.awsSdk.awsSdkStrings.Reviewable
    - typings.awsSdk.awsSdkStrings.Reviewing
    - typings.awsSdk.awsSdkStrings.Disposed
    - java.lang.String
  */
  type HITStatus = typings.awsSdk.mturkMod._HITStatus | java.lang.String
  
  type IdempotencyToken = java.lang.String
  
  type Integer = scala.Double
  
  type IntegerList = js.Array[typings.awsSdk.mturkMod.Integer]
  
  type LocaleList = js.Array[typings.awsSdk.mturkMod.Locale]
  
  type Long = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Email_
    - typings.awsSdk.awsSdkStrings.SQS
    - typings.awsSdk.awsSdkStrings.SNS
    - java.lang.String
  */
  type NotificationTransport = typings.awsSdk.mturkMod._NotificationTransport | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SoftFailure
    - typings.awsSdk.awsSdkStrings.HardFailure
    - java.lang.String
  */
  type NotifyWorkersFailureCode = typings.awsSdk.mturkMod._NotifyWorkersFailureCode | java.lang.String
  
  type NotifyWorkersFailureStatusList = js.Array[typings.awsSdk.mturkMod.NotifyWorkersFailureStatus]
  
  type PaginationToken = java.lang.String
  
  type ParameterMapEntryList = js.Array[typings.awsSdk.mturkMod.ParameterMapEntry]
  
  type PolicyParameterList = js.Array[typings.awsSdk.mturkMod.PolicyParameter]
  
  type QualificationList = js.Array[typings.awsSdk.mturkMod.Qualification]
  
  type QualificationRequestList = js.Array[typings.awsSdk.mturkMod.QualificationRequest]
  
  type QualificationRequirementList = js.Array[typings.awsSdk.mturkMod.QualificationRequirement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Granted_
    - typings.awsSdk.awsSdkStrings.Revoked_
    - java.lang.String
  */
  type QualificationStatus = typings.awsSdk.mturkMod._QualificationStatus | java.lang.String
  
  type QualificationTypeList = js.Array[typings.awsSdk.mturkMod.QualificationType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type QualificationTypeStatus = typings.awsSdk.mturkMod._QualificationTypeStatus | java.lang.String
  
  type ResultSize = scala.Double
  
  type ReviewActionDetailList = js.Array[typings.awsSdk.mturkMod.ReviewActionDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Intended
    - typings.awsSdk.awsSdkStrings.Succeeded_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type ReviewActionStatus = typings.awsSdk.mturkMod._ReviewActionStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Assignment
    - typings.awsSdk.awsSdkStrings.HIT
    - java.lang.String
  */
  type ReviewPolicyLevel = typings.awsSdk.mturkMod._ReviewPolicyLevel | java.lang.String
  
  type ReviewPolicyLevelList = js.Array[typings.awsSdk.mturkMod.ReviewPolicyLevel]
  
  type ReviewResultDetailList = js.Array[typings.awsSdk.mturkMod.ReviewResultDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Reviewable
    - typings.awsSdk.awsSdkStrings.Reviewing
    - java.lang.String
  */
  type ReviewableHITStatus = typings.awsSdk.mturkMod._ReviewableHITStatus | java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typings.awsSdk.mturkMod.String]
  
  type Timestamp = typings.std.Date
  
  type WorkerBlockList = js.Array[typings.awsSdk.mturkMod.WorkerBlock]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-01-17`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.mturkMod._apiVersion | java.lang.String
}
