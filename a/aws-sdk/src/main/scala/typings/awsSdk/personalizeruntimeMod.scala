package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personalizeruntimeMod {
  
  @JSImport("aws-sdk/clients/personalizeruntime", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  class ^ () extends PersonalizeRuntime {
    def this(options: ClientConfiguration) = this()
  }
  
  type Arn = String
  
  type AttributeName = String
  
  type AttributeValue = String
  
  @js.native
  trait Blob extends StObject
  
  @js.native
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.personalizeruntimeMod.apiVersion] = js.native
  }
  object ClientApiVersions {
    
    @scala.inline
    def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    @scala.inline
    implicit class ClientApiVersionsMutableBuilder[Self <: ClientApiVersions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  
  type Context = StringDictionary[AttributeValue]
  
  type FilterAttributeName = String
  
  type FilterAttributeValue = String
  
  type FilterValues = StringDictionary[FilterAttributeValue]
  
  @js.native
  trait GetPersonalizedRankingRequest extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
      */
    var campaignArn: Arn = js.native
    
    /**
      * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.
      */
    var context: js.UndefOr[Context] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of a filter you created to include items or exclude items from recommendations for a given user. For more information, see Filtering Recommendations.
      */
    var filterArn: js.UndefOr[Arn] = js.native
    
    /**
      * The values to use when filtering recommendations. For each placeholder parameter in your filter expression, provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value. Separate multiple values for one parameter with a comma.  For filter expressions that use an INCLUDE element to include items, you must provide values for all parameters that are defined in the expression. For filters with expressions that use an EXCLUDE element to exclude items, you can omit the filter-values.In this case, Amazon Personalize doesn't use that portion of the expression to filter recommendations. For more information, see Filtering Recommendations.
      */
    var filterValues: js.UndefOr[FilterValues] = js.native
    
    /**
      * A list of items (by itemId) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.
      */
    var inputList: InputList = js.native
    
    /**
      * The user for which you want the campaign to provide a personalized ranking.
      */
    var userId: UserID = js.native
  }
  object GetPersonalizedRankingRequest {
    
    @scala.inline
    def apply(campaignArn: Arn, inputList: InputList, userId: UserID): GetPersonalizedRankingRequest = {
      val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any], inputList = inputList.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPersonalizedRankingRequest]
    }
    
    @scala.inline
    implicit class GetPersonalizedRankingRequestMutableBuilder[Self <: GetPersonalizedRankingRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterArnUndefined: Self = StObject.set(x, "filterArn", js.undefined)
      
      @scala.inline
      def setFilterValues(value: FilterValues): Self = StObject.set(x, "filterValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterValuesUndefined: Self = StObject.set(x, "filterValues", js.undefined)
      
      @scala.inline
      def setInputList(value: InputList): Self = StObject.set(x, "inputList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputListVarargs(value: ItemID*): Self = StObject.set(x, "inputList", js.Array(value :_*))
      
      @scala.inline
      def setUserId(value: UserID): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetPersonalizedRankingResponse extends StObject {
    
    /**
      * A list of items in order of most likely interest to the user. The maximum is 500.
      */
    var personalizedRanking: js.UndefOr[ItemList] = js.native
    
    /**
      * The ID of the recommendation.
      */
    var recommendationId: js.UndefOr[RecommendationID] = js.native
  }
  object GetPersonalizedRankingResponse {
    
    @scala.inline
    def apply(): GetPersonalizedRankingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPersonalizedRankingResponse]
    }
    
    @scala.inline
    implicit class GetPersonalizedRankingResponseMutableBuilder[Self <: GetPersonalizedRankingResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersonalizedRanking(value: ItemList): Self = StObject.set(x, "personalizedRanking", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonalizedRankingUndefined: Self = StObject.set(x, "personalizedRanking", js.undefined)
      
      @scala.inline
      def setPersonalizedRankingVarargs(value: PredictedItem*): Self = StObject.set(x, "personalizedRanking", js.Array(value :_*))
      
      @scala.inline
      def setRecommendationId(value: RecommendationID): Self = StObject.set(x, "recommendationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecommendationIdUndefined: Self = StObject.set(x, "recommendationId", js.undefined)
    }
  }
  
  @js.native
  trait GetRecommendationsRequest extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
      */
    var campaignArn: Arn = js.native
    
    /**
      * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.
      */
    var context: js.UndefOr[Context] = js.native
    
    /**
      * The ARN of the filter to apply to the returned recommendations. For more information, see Filtering Recommendations. When using this parameter, be sure the filter resource is ACTIVE.
      */
    var filterArn: js.UndefOr[Arn] = js.native
    
    /**
      * The values to use when filtering recommendations. For each placeholder parameter in your filter expression, provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value. Separate multiple values for one parameter with a comma.  For filter expressions that use an INCLUDE element to include items, you must provide values for all parameters that are defined in the expression. For filters with expressions that use an EXCLUDE element to exclude items, you can omit the filter-values.In this case, Amazon Personalize doesn't use that portion of the expression to filter recommendations. For more information, see Filtering Recommendations.
      */
    var filterValues: js.UndefOr[FilterValues] = js.native
    
    /**
      * The item ID to provide recommendations for. Required for RELATED_ITEMS recipe type.
      */
    var itemId: js.UndefOr[ItemID] = js.native
    
    /**
      * The number of results to return. The default is 25. The maximum is 500.
      */
    var numResults: js.UndefOr[NumResults] = js.native
    
    /**
      * The user ID to provide recommendations for. Required for USER_PERSONALIZATION recipe type.
      */
    var userId: js.UndefOr[UserID] = js.native
  }
  object GetRecommendationsRequest {
    
    @scala.inline
    def apply(campaignArn: Arn): GetRecommendationsRequest = {
      val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRecommendationsRequest]
    }
    
    @scala.inline
    implicit class GetRecommendationsRequestMutableBuilder[Self <: GetRecommendationsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterArnUndefined: Self = StObject.set(x, "filterArn", js.undefined)
      
      @scala.inline
      def setFilterValues(value: FilterValues): Self = StObject.set(x, "filterValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterValuesUndefined: Self = StObject.set(x, "filterValues", js.undefined)
      
      @scala.inline
      def setItemId(value: ItemID): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setNumResults(value: NumResults): Self = StObject.set(x, "numResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumResultsUndefined: Self = StObject.set(x, "numResults", js.undefined)
      
      @scala.inline
      def setUserId(value: UserID): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  @js.native
  trait GetRecommendationsResponse extends StObject {
    
    /**
      * A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.
      */
    var itemList: js.UndefOr[ItemList] = js.native
    
    /**
      * The ID of the recommendation.
      */
    var recommendationId: js.UndefOr[RecommendationID] = js.native
  }
  object GetRecommendationsResponse {
    
    @scala.inline
    def apply(): GetRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRecommendationsResponse]
    }
    
    @scala.inline
    implicit class GetRecommendationsResponseMutableBuilder[Self <: GetRecommendationsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemList(value: ItemList): Self = StObject.set(x, "itemList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemListUndefined: Self = StObject.set(x, "itemList", js.undefined)
      
      @scala.inline
      def setItemListVarargs(value: PredictedItem*): Self = StObject.set(x, "itemList", js.Array(value :_*))
      
      @scala.inline
      def setRecommendationId(value: RecommendationID): Self = StObject.set(x, "recommendationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecommendationIdUndefined: Self = StObject.set(x, "recommendationId", js.undefined)
    }
  }
  
  type InputList = js.Array[ItemID]
  
  type ItemID = String
  
  type ItemList = js.Array[PredictedItem]
  
  type NumResults = Double
  
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
  
  @js.native
  trait PredictedItem extends StObject {
    
    /**
      * The recommended item ID.
      */
    var itemId: js.UndefOr[ItemID] = js.native
    
    /**
      * A numeric representation of the model's certainty that the item will be the next user selection. For more information on scoring logic, see how-scores-work.
      */
    var score: js.UndefOr[Score] = js.native
  }
  object PredictedItem {
    
    @scala.inline
    def apply(): PredictedItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PredictedItem]
    }
    
    @scala.inline
    implicit class PredictedItemMutableBuilder[Self <: PredictedItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItemId(value: ItemID): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      @scala.inline
      def setScore(value: Score): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    }
  }
  
  type RecommendationID = String
  
  type Score = Double
  
  type UserID = String
  
  trait _apiVersion extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-05-22`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
