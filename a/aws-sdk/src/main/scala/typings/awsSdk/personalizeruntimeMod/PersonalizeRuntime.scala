package typings.awsSdk.personalizeruntimeMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonalizeRuntime extends Service {
  
  @JSName("config")
  var config_PersonalizeRuntime: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Re-ranks a list of recommended items for the given user. The first item in the list is deemed the most likely item to be of interest to the user.  The solution backing the campaign must have been created using a recipe of type PERSONALIZED_RANKING. 
    */
  def getPersonalizedRanking(): Request[GetPersonalizedRankingResponse, AWSError] = js.native
  def getPersonalizedRanking(callback: js.Function2[/* err */ AWSError, /* data */ GetPersonalizedRankingResponse, Unit]): Request[GetPersonalizedRankingResponse, AWSError] = js.native
  /**
    * Re-ranks a list of recommended items for the given user. The first item in the list is deemed the most likely item to be of interest to the user.  The solution backing the campaign must have been created using a recipe of type PERSONALIZED_RANKING. 
    */
  def getPersonalizedRanking(params: GetPersonalizedRankingRequest): Request[GetPersonalizedRankingResponse, AWSError] = js.native
  def getPersonalizedRanking(
    params: GetPersonalizedRankingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPersonalizedRankingResponse, Unit]
  ): Request[GetPersonalizedRankingResponse, AWSError] = js.native
  
  /**
    * Returns a list of recommended items. The required input depends on the recipe type used to create the solution backing the campaign, as follows:   RELATED_ITEMS - itemId required, userId not used   USER_PERSONALIZATION - itemId optional, userId required    Campaigns that are backed by a solution created using a recipe of type PERSONALIZED_RANKING use the API. 
    */
  def getRecommendations(): Request[GetRecommendationsResponse, AWSError] = js.native
  def getRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationsResponse, Unit]): Request[GetRecommendationsResponse, AWSError] = js.native
  /**
    * Returns a list of recommended items. The required input depends on the recipe type used to create the solution backing the campaign, as follows:   RELATED_ITEMS - itemId required, userId not used   USER_PERSONALIZATION - itemId optional, userId required    Campaigns that are backed by a solution created using a recipe of type PERSONALIZED_RANKING use the API. 
    */
  def getRecommendations(params: GetRecommendationsRequest): Request[GetRecommendationsResponse, AWSError] = js.native
  def getRecommendations(
    params: GetRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationsResponse, Unit]
  ): Request[GetRecommendationsResponse, AWSError] = js.native
}
