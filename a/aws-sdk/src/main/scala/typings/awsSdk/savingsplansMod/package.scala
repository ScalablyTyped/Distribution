package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Amount = java.lang.String

type ClientToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CNY
  - typings.awsSdk.awsSdkStrings.USD
  - java.lang.String
*/
type CurrencyCode = _CurrencyCode | java.lang.String

type CurrencyList = js.Array[CurrencyCode]

type DateTime = js.Date

type DurationsList = js.Array[SavingsPlansDuration]

type EC2InstanceFamily = java.lang.String

type FilterValuesList = js.Array[JsonSafeFilterValueString]

type JsonSafeFilterValueString = java.lang.String

type ListOfStrings = js.Array[String]

type MaxResults = Double

type PageSize = Double

type PaginationToken = java.lang.String

type Region = java.lang.String

type SavingsPlanArn = java.lang.String

type SavingsPlanArnList = js.Array[SavingsPlanArn]

type SavingsPlanDescription = java.lang.String

type SavingsPlanDescriptionsList = js.Array[SavingsPlanDescription]

type SavingsPlanFilterList = js.Array[SavingsPlanFilter]

type SavingsPlanId = java.lang.String

type SavingsPlanIdList = js.Array[SavingsPlanId]

type SavingsPlanList = js.Array[SavingsPlan]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.region__
  - typings.awsSdk.awsSdkStrings.instanceFamily
  - java.lang.String
*/
type SavingsPlanOfferingFilterAttribute = _SavingsPlanOfferingFilterAttribute | java.lang.String

type SavingsPlanOfferingFiltersList = js.Array[SavingsPlanOfferingFilterElement]

type SavingsPlanOfferingId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.region__
  - typings.awsSdk.awsSdkStrings.instanceFamily
  - java.lang.String
*/
type SavingsPlanOfferingPropertyKey = _SavingsPlanOfferingPropertyKey | java.lang.String

type SavingsPlanOfferingPropertyList = js.Array[SavingsPlanOfferingProperty]

type SavingsPlanOfferingRateFiltersList = js.Array[SavingsPlanOfferingRateFilterElement]

type SavingsPlanOfferingRatePropertyList = js.Array[SavingsPlanOfferingRateProperty]

type SavingsPlanOfferingRatesList = js.Array[SavingsPlanOfferingRate]

type SavingsPlanOfferingsList = js.Array[SavingsPlanOffering]

type SavingsPlanOperation = java.lang.String

type SavingsPlanOperationList = js.Array[SavingsPlanOperation]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`All Upfront`
  - typings.awsSdk.awsSdkStrings.`Partial Upfront`
  - typings.awsSdk.awsSdkStrings.`No Upfront`
  - java.lang.String
*/
type SavingsPlanPaymentOption = _SavingsPlanPaymentOption | java.lang.String

type SavingsPlanPaymentOptionList = js.Array[SavingsPlanPaymentOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EC2
  - typings.awsSdk.awsSdkStrings.Fargate_
  - typings.awsSdk.awsSdkStrings.Lambda_
  - typings.awsSdk.awsSdkStrings.SageMaker_
  - java.lang.String
*/
type SavingsPlanProductType = _SavingsPlanProductType | java.lang.String

type SavingsPlanProductTypeList = js.Array[SavingsPlanProductType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.region__
  - typings.awsSdk.awsSdkStrings.instanceFamily
  - typings.awsSdk.awsSdkStrings.instanceType_
  - typings.awsSdk.awsSdkStrings.productDescription
  - typings.awsSdk.awsSdkStrings.tenancy_
  - typings.awsSdk.awsSdkStrings.productId
  - java.lang.String
*/
type SavingsPlanRateFilterAttribute = _SavingsPlanRateFilterAttribute | java.lang.String

type SavingsPlanRateFilterList = js.Array[SavingsPlanRateFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.region__
  - typings.awsSdk.awsSdkStrings.instanceType_
  - typings.awsSdk.awsSdkStrings.productDescription
  - typings.awsSdk.awsSdkStrings.tenancy_
  - typings.awsSdk.awsSdkStrings.productType_
  - typings.awsSdk.awsSdkStrings.serviceCode
  - typings.awsSdk.awsSdkStrings.usageType
  - typings.awsSdk.awsSdkStrings.operation_
  - java.lang.String
*/
type SavingsPlanRateFilterName = _SavingsPlanRateFilterName | java.lang.String

type SavingsPlanRateList = js.Array[SavingsPlanRate]

type SavingsPlanRateOperation = java.lang.String

type SavingsPlanRateOperationList = js.Array[SavingsPlanRateOperation]

type SavingsPlanRatePricePerUnit = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.region__
  - typings.awsSdk.awsSdkStrings.instanceType_
  - typings.awsSdk.awsSdkStrings.instanceFamily
  - typings.awsSdk.awsSdkStrings.productDescription
  - typings.awsSdk.awsSdkStrings.tenancy_
  - java.lang.String
*/
type SavingsPlanRatePropertyKey = _SavingsPlanRatePropertyKey | java.lang.String

type SavingsPlanRatePropertyList = js.Array[SavingsPlanRateProperty]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AmazonEC2
  - typings.awsSdk.awsSdkStrings.AmazonECS
  - typings.awsSdk.awsSdkStrings.AmazonEKS
  - typings.awsSdk.awsSdkStrings.AWSLambda
  - typings.awsSdk.awsSdkStrings.AmazonSageMaker
  - java.lang.String
*/
type SavingsPlanRateServiceCode = _SavingsPlanRateServiceCode | java.lang.String

type SavingsPlanRateServiceCodeList = js.Array[SavingsPlanRateServiceCode]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Hrs
  - typings.awsSdk.awsSdkStrings.`Lambda-GB-Second`
  - typings.awsSdk.awsSdkStrings.Request_
  - java.lang.String
*/
type SavingsPlanRateUnit = _SavingsPlanRateUnit | java.lang.String

type SavingsPlanRateUsageType = java.lang.String

type SavingsPlanRateUsageTypeList = js.Array[SavingsPlanRateUsageType]

type SavingsPlanServiceCode = java.lang.String

type SavingsPlanServiceCodeList = js.Array[SavingsPlanServiceCode]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`payment-pending`
  - typings.awsSdk.awsSdkStrings.`payment-failed`
  - typings.awsSdk.awsSdkStrings.active__
  - typings.awsSdk.awsSdkStrings.retired_
  - typings.awsSdk.awsSdkStrings.queued__
  - typings.awsSdk.awsSdkStrings.`queued-deleted`
  - java.lang.String
*/
type SavingsPlanState = _SavingsPlanState | java.lang.String

type SavingsPlanStateList = js.Array[SavingsPlanState]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Compute_
  - typings.awsSdk.awsSdkStrings.EC2Instance
  - typings.awsSdk.awsSdkStrings.SageMaker_
  - java.lang.String
*/
type SavingsPlanType = _SavingsPlanType | java.lang.String

type SavingsPlanTypeList = js.Array[SavingsPlanType]

type SavingsPlanUsageType = java.lang.String

type SavingsPlanUsageTypeList = js.Array[SavingsPlanUsageType]

type SavingsPlansDuration = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.region__
  - typings.awsSdk.awsSdkStrings.`ec2-instance-family`
  - typings.awsSdk.awsSdkStrings.commitment
  - typings.awsSdk.awsSdkStrings.upfront
  - typings.awsSdk.awsSdkStrings.term
  - typings.awsSdk.awsSdkStrings.`savings-plan-type`
  - typings.awsSdk.awsSdkStrings.`payment-option`
  - typings.awsSdk.awsSdkStrings.start_
  - typings.awsSdk.awsSdkStrings.end_
  - java.lang.String
*/
type SavingsPlansFilterName = _SavingsPlansFilterName | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TermDurationInSeconds = Double

type UUID = java.lang.String

type UUIDs = js.Array[UUID]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-06-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
