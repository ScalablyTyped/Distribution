package typings.awsSdk.savingsplansMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlans extends Service {
  
  @JSName("config")
  var config_SavingsPlans: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a Savings Plan.
    */
  def createSavingsPlan(): Request[CreateSavingsPlanResponse, AWSError] = js.native
  def createSavingsPlan(callback: js.Function2[/* err */ AWSError, /* data */ CreateSavingsPlanResponse, Unit]): Request[CreateSavingsPlanResponse, AWSError] = js.native
  /**
    * Creates a Savings Plan.
    */
  def createSavingsPlan(params: CreateSavingsPlanRequest): Request[CreateSavingsPlanResponse, AWSError] = js.native
  def createSavingsPlan(
    params: CreateSavingsPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSavingsPlanResponse, Unit]
  ): Request[CreateSavingsPlanResponse, AWSError] = js.native
  
  /**
    * Deletes the queued purchase for the specified Savings Plan.
    */
  def deleteQueuedSavingsPlan(): Request[DeleteQueuedSavingsPlanResponse, AWSError] = js.native
  def deleteQueuedSavingsPlan(callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueuedSavingsPlanResponse, Unit]): Request[DeleteQueuedSavingsPlanResponse, AWSError] = js.native
  /**
    * Deletes the queued purchase for the specified Savings Plan.
    */
  def deleteQueuedSavingsPlan(params: DeleteQueuedSavingsPlanRequest): Request[DeleteQueuedSavingsPlanResponse, AWSError] = js.native
  def deleteQueuedSavingsPlan(
    params: DeleteQueuedSavingsPlanRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteQueuedSavingsPlanResponse, Unit]
  ): Request[DeleteQueuedSavingsPlanResponse, AWSError] = js.native
  
  /**
    * Describes the specified Savings Plans rates.
    */
  def describeSavingsPlanRates(): Request[DescribeSavingsPlanRatesResponse, AWSError] = js.native
  def describeSavingsPlanRates(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSavingsPlanRatesResponse, Unit]): Request[DescribeSavingsPlanRatesResponse, AWSError] = js.native
  /**
    * Describes the specified Savings Plans rates.
    */
  def describeSavingsPlanRates(params: DescribeSavingsPlanRatesRequest): Request[DescribeSavingsPlanRatesResponse, AWSError] = js.native
  def describeSavingsPlanRates(
    params: DescribeSavingsPlanRatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSavingsPlanRatesResponse, Unit]
  ): Request[DescribeSavingsPlanRatesResponse, AWSError] = js.native
  
  /**
    * Describes the specified Savings Plans.
    */
  def describeSavingsPlans(): Request[DescribeSavingsPlansResponse, AWSError] = js.native
  def describeSavingsPlans(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSavingsPlansResponse, Unit]): Request[DescribeSavingsPlansResponse, AWSError] = js.native
  /**
    * Describes the specified Savings Plans.
    */
  def describeSavingsPlans(params: DescribeSavingsPlansRequest): Request[DescribeSavingsPlansResponse, AWSError] = js.native
  def describeSavingsPlans(
    params: DescribeSavingsPlansRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSavingsPlansResponse, Unit]
  ): Request[DescribeSavingsPlansResponse, AWSError] = js.native
  
  /**
    * Describes the specified Savings Plans offering rates.
    */
  def describeSavingsPlansOfferingRates(): Request[DescribeSavingsPlansOfferingRatesResponse, AWSError] = js.native
  def describeSavingsPlansOfferingRates(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSavingsPlansOfferingRatesResponse, Unit]
  ): Request[DescribeSavingsPlansOfferingRatesResponse, AWSError] = js.native
  /**
    * Describes the specified Savings Plans offering rates.
    */
  def describeSavingsPlansOfferingRates(params: DescribeSavingsPlansOfferingRatesRequest): Request[DescribeSavingsPlansOfferingRatesResponse, AWSError] = js.native
  def describeSavingsPlansOfferingRates(
    params: DescribeSavingsPlansOfferingRatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSavingsPlansOfferingRatesResponse, Unit]
  ): Request[DescribeSavingsPlansOfferingRatesResponse, AWSError] = js.native
  
  /**
    * Describes the specified Savings Plans offerings.
    */
  def describeSavingsPlansOfferings(): Request[DescribeSavingsPlansOfferingsResponse, AWSError] = js.native
  def describeSavingsPlansOfferings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSavingsPlansOfferingsResponse, Unit]): Request[DescribeSavingsPlansOfferingsResponse, AWSError] = js.native
  /**
    * Describes the specified Savings Plans offerings.
    */
  def describeSavingsPlansOfferings(params: DescribeSavingsPlansOfferingsRequest): Request[DescribeSavingsPlansOfferingsResponse, AWSError] = js.native
  def describeSavingsPlansOfferings(
    params: DescribeSavingsPlansOfferingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSavingsPlansOfferingsResponse, Unit]
  ): Request[DescribeSavingsPlansOfferingsResponse, AWSError] = js.native
  
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags for the specified resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Adds the specified tags to the specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds the specified tags to the specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}
