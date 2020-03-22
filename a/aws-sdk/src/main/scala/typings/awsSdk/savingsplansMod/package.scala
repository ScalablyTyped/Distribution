package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object savingsplansMod {
  type Amount = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.savingsplansMod.ClientApiVersions
  type ClientToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CNY
    - typings.awsSdk.awsSdkStrings.USD
    - java.lang.String
  */
  type CurrencyCode = typings.awsSdk.savingsplansMod._CurrencyCode | java.lang.String
  type CurrencyList = js.Array[typings.awsSdk.savingsplansMod.CurrencyCode]
  type DurationsList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlansDuration]
  type EC2InstanceFamily = java.lang.String
  type FilterValuesList = js.Array[typings.awsSdk.savingsplansMod.JsonSafeFilterValueString]
  type JsonSafeFilterValueString = java.lang.String
  type ListOfStrings = js.Array[typings.awsSdk.savingsplansMod.String]
  type MaxResults = scala.Double
  type PageSize = scala.Double
  type PaginationToken = java.lang.String
  type Region = java.lang.String
  type SavingsPlanArn = java.lang.String
  type SavingsPlanArnList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanArn]
  type SavingsPlanDescription = java.lang.String
  type SavingsPlanDescriptionsList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanDescription]
  type SavingsPlanFilterList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanFilter]
  type SavingsPlanId = java.lang.String
  type SavingsPlanIdList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanId]
  type SavingsPlanList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlan]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.region__
    - typings.awsSdk.awsSdkStrings.instanceFamily
    - java.lang.String
  */
  type SavingsPlanOfferingFilterAttribute = typings.awsSdk.savingsplansMod._SavingsPlanOfferingFilterAttribute | java.lang.String
  type SavingsPlanOfferingFiltersList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanOfferingFilterElement]
  type SavingsPlanOfferingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.region__
    - typings.awsSdk.awsSdkStrings.instanceFamily
    - java.lang.String
  */
  type SavingsPlanOfferingPropertyKey = typings.awsSdk.savingsplansMod._SavingsPlanOfferingPropertyKey | java.lang.String
  type SavingsPlanOfferingPropertyList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanOfferingProperty]
  type SavingsPlanOfferingRateFiltersList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanOfferingRateFilterElement]
  type SavingsPlanOfferingRatePropertyList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanOfferingRateProperty]
  type SavingsPlanOfferingRatesList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanOfferingRate]
  type SavingsPlanOfferingsList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanOffering]
  type SavingsPlanOperation = java.lang.String
  type SavingsPlanOperationList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanOperation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`All Upfront`
    - typings.awsSdk.awsSdkStrings.`Partial Upfront`
    - typings.awsSdk.awsSdkStrings.`No Upfront`
    - java.lang.String
  */
  type SavingsPlanPaymentOption = typings.awsSdk.savingsplansMod._SavingsPlanPaymentOption | java.lang.String
  type SavingsPlanPaymentOptionList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanPaymentOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EC2
    - typings.awsSdk.awsSdkStrings.Fargate_
    - typings.awsSdk.awsSdkStrings.Lambda_
    - java.lang.String
  */
  type SavingsPlanProductType = typings.awsSdk.savingsplansMod._SavingsPlanProductType | java.lang.String
  type SavingsPlanProductTypeList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanProductType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.region__
    - typings.awsSdk.awsSdkStrings.instanceFamily
    - typings.awsSdk.awsSdkStrings.instanceType_
    - typings.awsSdk.awsSdkStrings.productDescription
    - typings.awsSdk.awsSdkStrings.tenancy_
    - typings.awsSdk.awsSdkStrings.productId
    - java.lang.String
  */
  type SavingsPlanRateFilterAttribute = typings.awsSdk.savingsplansMod._SavingsPlanRateFilterAttribute | java.lang.String
  type SavingsPlanRateFilterList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanRateFilter]
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
  type SavingsPlanRateFilterName = typings.awsSdk.savingsplansMod._SavingsPlanRateFilterName | java.lang.String
  type SavingsPlanRateList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanRate]
  type SavingsPlanRateOperation = java.lang.String
  type SavingsPlanRateOperationList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanRateOperation]
  type SavingsPlanRatePricePerUnit = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.region__
    - typings.awsSdk.awsSdkStrings.instanceType_
    - typings.awsSdk.awsSdkStrings.instanceFamily
    - typings.awsSdk.awsSdkStrings.productDescription
    - typings.awsSdk.awsSdkStrings.tenancy_
    - java.lang.String
  */
  type SavingsPlanRatePropertyKey = typings.awsSdk.savingsplansMod._SavingsPlanRatePropertyKey | java.lang.String
  type SavingsPlanRatePropertyList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanRateProperty]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AmazonEC2
    - typings.awsSdk.awsSdkStrings.AmazonECS
    - typings.awsSdk.awsSdkStrings.AWSLambda
    - java.lang.String
  */
  type SavingsPlanRateServiceCode = typings.awsSdk.savingsplansMod._SavingsPlanRateServiceCode | java.lang.String
  type SavingsPlanRateServiceCodeList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanRateServiceCode]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Hrs
    - typings.awsSdk.awsSdkStrings.`Lambda-GB-Second`
    - typings.awsSdk.awsSdkStrings.Request_
    - java.lang.String
  */
  type SavingsPlanRateUnit = typings.awsSdk.savingsplansMod._SavingsPlanRateUnit | java.lang.String
  type SavingsPlanRateUsageType = java.lang.String
  type SavingsPlanRateUsageTypeList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanRateUsageType]
  type SavingsPlanServiceCode = java.lang.String
  type SavingsPlanServiceCodeList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanServiceCode]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`payment-pending`
    - typings.awsSdk.awsSdkStrings.`payment-failed`
    - typings.awsSdk.awsSdkStrings.active__
    - typings.awsSdk.awsSdkStrings.retired
    - java.lang.String
  */
  type SavingsPlanState = typings.awsSdk.savingsplansMod._SavingsPlanState | java.lang.String
  type SavingsPlanStateList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanState]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Compute
    - typings.awsSdk.awsSdkStrings.EC2Instance
    - java.lang.String
  */
  type SavingsPlanType = typings.awsSdk.savingsplansMod._SavingsPlanType | java.lang.String
  type SavingsPlanTypeList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanType]
  type SavingsPlanUsageType = java.lang.String
  type SavingsPlanUsageTypeList = js.Array[typings.awsSdk.savingsplansMod.SavingsPlanUsageType]
  type SavingsPlansDuration = scala.Double
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
  type SavingsPlansFilterName = typings.awsSdk.savingsplansMod._SavingsPlansFilterName | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.savingsplansMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.savingsplansMod.TagValue]
  type TagValue = java.lang.String
  type TermDurationInSeconds = scala.Double
  type UUID = java.lang.String
  type UUIDs = js.Array[typings.awsSdk.savingsplansMod.UUID]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-06-28`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.savingsplansMod._apiVersion | java.lang.String
}
