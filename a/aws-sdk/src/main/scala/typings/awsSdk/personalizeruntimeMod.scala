package typings.awsSdk

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import typings.awsSdk.serviceMod.ServiceConfigurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object personalizeruntimeMod {
  
  @JSImport("aws-sdk/clients/personalizeruntime", JSImport.Namespace)
  @js.native
  /**
    * Constructs a service object. This object has one method for each API operation.
    */
  open class ^ () extends PersonalizeRuntime {
    def this(options: ClientConfiguration) = this()
  }
  
  type Arn = String
  
  type AttributeName = String
  
  type AttributeValue = String
  
  trait Blob extends StObject
  
  trait ClientApiVersions extends StObject {
    
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[typings.awsSdk.personalizeruntimeMod.apiVersion] = js.undefined
  }
  object ClientApiVersions {
    
    inline def apply(): ClientApiVersions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientApiVersions]
    }
    
    extension [Self <: ClientApiVersions](x: Self) {
      
      inline def setApiVersion(value: apiVersion): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    }
  }
  
  @js.native
  trait ClientConfiguration
    extends ServiceConfigurationOptions
       with ClientApiVersions
  
  type Context = StringDictionary[AttributeValue]
  
  type FilterAttributeName = String
  
  type FilterAttributeValue = String
  
  type FilterValues = StringDictionary[FilterAttributeValue]
  
  trait GetPersonalizedRankingRequest extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
      */
    var campaignArn: Arn
    
    /**
      * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.
      */
    var context: js.UndefOr[Context] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of a filter you created to include items or exclude items from recommendations for a given user. For more information, see Filtering Recommendations.
      */
    var filterArn: js.UndefOr[Arn] = js.undefined
    
    /**
      * The values to use when filtering recommendations. For each placeholder parameter in your filter expression, provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value. Separate multiple values for one parameter with a comma.  For filter expressions that use an INCLUDE element to include items, you must provide values for all parameters that are defined in the expression. For filters with expressions that use an EXCLUDE element to exclude items, you can omit the filter-values.In this case, Amazon Personalize doesn't use that portion of the expression to filter recommendations. For more information, see Filtering Recommendations.
      */
    var filterValues: js.UndefOr[FilterValues] = js.undefined
    
    /**
      * A list of items (by itemId) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list. The maximum is 500.
      */
    var inputList: InputList
    
    /**
      * The user for which you want the campaign to provide a personalized ranking.
      */
    var userId: UserID
  }
  object GetPersonalizedRankingRequest {
    
    inline def apply(campaignArn: Arn, inputList: InputList, userId: UserID): GetPersonalizedRankingRequest = {
      val __obj = js.Dynamic.literal(campaignArn = campaignArn.asInstanceOf[js.Any], inputList = inputList.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPersonalizedRankingRequest]
    }
    
    extension [Self <: GetPersonalizedRankingRequest](x: Self) {
      
      inline def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
      
      inline def setFilterArnUndefined: Self = StObject.set(x, "filterArn", js.undefined)
      
      inline def setFilterValues(value: FilterValues): Self = StObject.set(x, "filterValues", value.asInstanceOf[js.Any])
      
      inline def setFilterValuesUndefined: Self = StObject.set(x, "filterValues", js.undefined)
      
      inline def setInputList(value: InputList): Self = StObject.set(x, "inputList", value.asInstanceOf[js.Any])
      
      inline def setInputListVarargs(value: ItemID*): Self = StObject.set(x, "inputList", js.Array(value*))
      
      inline def setUserId(value: UserID): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetPersonalizedRankingResponse extends StObject {
    
    /**
      * A list of items in order of most likely interest to the user. The maximum is 500.
      */
    var personalizedRanking: js.UndefOr[ItemList] = js.undefined
    
    /**
      * The ID of the recommendation.
      */
    var recommendationId: js.UndefOr[RecommendationID] = js.undefined
  }
  object GetPersonalizedRankingResponse {
    
    inline def apply(): GetPersonalizedRankingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPersonalizedRankingResponse]
    }
    
    extension [Self <: GetPersonalizedRankingResponse](x: Self) {
      
      inline def setPersonalizedRanking(value: ItemList): Self = StObject.set(x, "personalizedRanking", value.asInstanceOf[js.Any])
      
      inline def setPersonalizedRankingUndefined: Self = StObject.set(x, "personalizedRanking", js.undefined)
      
      inline def setPersonalizedRankingVarargs(value: PredictedItem*): Self = StObject.set(x, "personalizedRanking", js.Array(value*))
      
      inline def setRecommendationId(value: RecommendationID): Self = StObject.set(x, "recommendationId", value.asInstanceOf[js.Any])
      
      inline def setRecommendationIdUndefined: Self = StObject.set(x, "recommendationId", js.undefined)
    }
  }
  
  trait GetRecommendationsRequest extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
      */
    var campaignArn: js.UndefOr[Arn] = js.undefined
    
    /**
      * The contextual metadata to use when getting recommendations. Contextual metadata includes any interaction information that might be relevant when getting a user's recommendations, such as the user's current location or device type.
      */
    var context: js.UndefOr[Context] = js.undefined
    
    /**
      * The ARN of the filter to apply to the returned recommendations. For more information, see Filtering Recommendations. When using this parameter, be sure the filter resource is ACTIVE.
      */
    var filterArn: js.UndefOr[Arn] = js.undefined
    
    /**
      * The values to use when filtering recommendations. For each placeholder parameter in your filter expression, provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value. Separate multiple values for one parameter with a comma.  For filter expressions that use an INCLUDE element to include items, you must provide values for all parameters that are defined in the expression. For filters with expressions that use an EXCLUDE element to exclude items, you can omit the filter-values.In this case, Amazon Personalize doesn't use that portion of the expression to filter recommendations. For more information, see Filtering recommendations and user segments.
      */
    var filterValues: js.UndefOr[FilterValues] = js.undefined
    
    /**
      * The item ID to provide recommendations for. Required for RELATED_ITEMS recipe type.
      */
    var itemId: js.UndefOr[ItemID] = js.undefined
    
    /**
      * The number of results to return. The default is 25. The maximum is 500.
      */
    var numResults: js.UndefOr[NumResults] = js.undefined
    
    /**
      * The promotions to apply to the recommendation request. A promotion defines additional business rules that apply to a configurable subset of recommended items.
      */
    var promotions: js.UndefOr[PromotionList] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the recommender to use to get recommendations. Provide a recommender ARN if you created a Domain dataset group with a recommender for a domain use case.
      */
    var recommenderArn: js.UndefOr[Arn] = js.undefined
    
    /**
      * The user ID to provide recommendations for. Required for USER_PERSONALIZATION recipe type.
      */
    var userId: js.UndefOr[UserID] = js.undefined
  }
  object GetRecommendationsRequest {
    
    inline def apply(): GetRecommendationsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRecommendationsRequest]
    }
    
    extension [Self <: GetRecommendationsRequest](x: Self) {
      
      inline def setCampaignArn(value: Arn): Self = StObject.set(x, "campaignArn", value.asInstanceOf[js.Any])
      
      inline def setCampaignArnUndefined: Self = StObject.set(x, "campaignArn", js.undefined)
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
      
      inline def setFilterArnUndefined: Self = StObject.set(x, "filterArn", js.undefined)
      
      inline def setFilterValues(value: FilterValues): Self = StObject.set(x, "filterValues", value.asInstanceOf[js.Any])
      
      inline def setFilterValuesUndefined: Self = StObject.set(x, "filterValues", js.undefined)
      
      inline def setItemId(value: ItemID): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setNumResults(value: NumResults): Self = StObject.set(x, "numResults", value.asInstanceOf[js.Any])
      
      inline def setNumResultsUndefined: Self = StObject.set(x, "numResults", js.undefined)
      
      inline def setPromotions(value: PromotionList): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
      
      inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
      
      inline def setPromotionsVarargs(value: Promotion*): Self = StObject.set(x, "promotions", js.Array(value*))
      
      inline def setRecommenderArn(value: Arn): Self = StObject.set(x, "recommenderArn", value.asInstanceOf[js.Any])
      
      inline def setRecommenderArnUndefined: Self = StObject.set(x, "recommenderArn", js.undefined)
      
      inline def setUserId(value: UserID): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  trait GetRecommendationsResponse extends StObject {
    
    /**
      * A list of recommendations sorted in descending order by prediction score. There can be a maximum of 500 items in the list.
      */
    var itemList: js.UndefOr[ItemList] = js.undefined
    
    /**
      * The ID of the recommendation.
      */
    var recommendationId: js.UndefOr[RecommendationID] = js.undefined
  }
  object GetRecommendationsResponse {
    
    inline def apply(): GetRecommendationsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetRecommendationsResponse]
    }
    
    extension [Self <: GetRecommendationsResponse](x: Self) {
      
      inline def setItemList(value: ItemList): Self = StObject.set(x, "itemList", value.asInstanceOf[js.Any])
      
      inline def setItemListUndefined: Self = StObject.set(x, "itemList", js.undefined)
      
      inline def setItemListVarargs(value: PredictedItem*): Self = StObject.set(x, "itemList", js.Array(value*))
      
      inline def setRecommendationId(value: RecommendationID): Self = StObject.set(x, "recommendationId", value.asInstanceOf[js.Any])
      
      inline def setRecommendationIdUndefined: Self = StObject.set(x, "recommendationId", js.undefined)
    }
  }
  
  type InputList = js.Array[ItemID]
  
  type ItemID = String
  
  type ItemList = js.Array[PredictedItem]
  
  type Name = String
  
  type NumResults = Double
  
  type PercentPromotedItems = Double
  
  @js.native
  trait PersonalizeRuntime extends Service {
    
    @JSName("config")
    var config_PersonalizeRuntime: ConfigBase & ClientConfiguration = js.native
    
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
      * Returns a list of recommended items. For campaigns, the campaign's Amazon Resource Name (ARN) is required and the required user and item input depends on the recipe type used to create the solution backing the campaign as follows:   USER_PERSONALIZATION - userId required, itemId not used   RELATED_ITEMS - itemId required, userId not used    Campaigns that are backed by a solution created using a recipe of type PERSONALIZED_RANKING use the API.   For recommenders, the recommender's ARN is required and the required item and user input depends on the use case (domain-based recipe) backing the recommender. For information on use case requirements see Choosing recommender use cases. 
      */
    def getRecommendations(): Request[GetRecommendationsResponse, AWSError] = js.native
    def getRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationsResponse, Unit]): Request[GetRecommendationsResponse, AWSError] = js.native
    /**
      * Returns a list of recommended items. For campaigns, the campaign's Amazon Resource Name (ARN) is required and the required user and item input depends on the recipe type used to create the solution backing the campaign as follows:   USER_PERSONALIZATION - userId required, itemId not used   RELATED_ITEMS - itemId required, userId not used    Campaigns that are backed by a solution created using a recipe of type PERSONALIZED_RANKING use the API.   For recommenders, the recommender's ARN is required and the required item and user input depends on the use case (domain-based recipe) backing the recommender. For information on use case requirements see Choosing recommender use cases. 
      */
    def getRecommendations(params: GetRecommendationsRequest): Request[GetRecommendationsResponse, AWSError] = js.native
    def getRecommendations(
      params: GetRecommendationsRequest,
      callback: js.Function2[/* err */ AWSError, /* data */ GetRecommendationsResponse, Unit]
    ): Request[GetRecommendationsResponse, AWSError] = js.native
  }
  
  trait PredictedItem extends StObject {
    
    /**
      * The recommended item ID.
      */
    var itemId: js.UndefOr[ItemID] = js.undefined
    
    /**
      * The name of the promotion that included the predicted item.
      */
    var promotionName: js.UndefOr[Name] = js.undefined
    
    /**
      * A numeric representation of the model's certainty that the item will be the next user selection. For more information on scoring logic, see how-scores-work.
      */
    var score: js.UndefOr[Score] = js.undefined
  }
  object PredictedItem {
    
    inline def apply(): PredictedItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PredictedItem]
    }
    
    extension [Self <: PredictedItem](x: Self) {
      
      inline def setItemId(value: ItemID): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
      
      inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
      
      inline def setPromotionName(value: Name): Self = StObject.set(x, "promotionName", value.asInstanceOf[js.Any])
      
      inline def setPromotionNameUndefined: Self = StObject.set(x, "promotionName", js.undefined)
      
      inline def setScore(value: Score): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      
      inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    }
  }
  
  trait Promotion extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the filter used by the promotion. This filter defines the criteria for promoted items. For more information, see Promotion filters.
      */
    var filterArn: js.UndefOr[Arn] = js.undefined
    
    /**
      * The values to use when promoting items. For each placeholder parameter in your promotion's filter expression, provide the parameter name (in matching case) as a key and the filter value(s) as the corresponding value. Separate multiple values for one parameter with a comma.  For filter expressions that use an INCLUDE element to include items, you must provide values for all parameters that are defined in the expression. For filters with expressions that use an EXCLUDE element to exclude items, you can omit the filter-values. In this case, Amazon Personalize doesn't use that portion of the expression to filter recommendations. For more information on creating filters, see Filtering recommendations and user segments.
      */
    var filterValues: js.UndefOr[FilterValues] = js.undefined
    
    /**
      * The name of the promotion.
      */
    var name: js.UndefOr[Name] = js.undefined
    
    /**
      * The percentage of recommended items to apply the promotion to.
      */
    var percentPromotedItems: js.UndefOr[PercentPromotedItems] = js.undefined
  }
  object Promotion {
    
    inline def apply(): Promotion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Promotion]
    }
    
    extension [Self <: Promotion](x: Self) {
      
      inline def setFilterArn(value: Arn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
      
      inline def setFilterArnUndefined: Self = StObject.set(x, "filterArn", js.undefined)
      
      inline def setFilterValues(value: FilterValues): Self = StObject.set(x, "filterValues", value.asInstanceOf[js.Any])
      
      inline def setFilterValuesUndefined: Self = StObject.set(x, "filterValues", js.undefined)
      
      inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPercentPromotedItems(value: PercentPromotedItems): Self = StObject.set(x, "percentPromotedItems", value.asInstanceOf[js.Any])
      
      inline def setPercentPromotedItemsUndefined: Self = StObject.set(x, "percentPromotedItems", js.undefined)
    }
  }
  
  type PromotionList = js.Array[Promotion]
  
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
