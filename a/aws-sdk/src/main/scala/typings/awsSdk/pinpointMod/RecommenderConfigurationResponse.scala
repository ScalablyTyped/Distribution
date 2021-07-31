package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommenderConfigurationResponse extends StObject {
  
  /**
    * A map that defines 1-10 custom endpoint or user attributes, depending on the value for the RecommendationProviderIdType property. Each of these attributes temporarily stores a recommended item that's retrieved from the recommender model and sent to an AWS Lambda function for additional processing. Each attribute can be used as a message variable in a message template. This value is null if the configuration doesn't invoke an AWS Lambda function (RecommendationTransformerUri) to perform additional processing of recommendation data.
    */
  var Attributes: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * The date, in extended ISO 8601 format, when the configuration was created for the recommender model.
    */
  var CreationDate: string
  
  /**
    * The custom description of the configuration for the recommender model.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the recommender model configuration.
    */
  var Id: string
  
  /**
    * The date, in extended ISO 8601 format, when the configuration for the recommender model was last modified.
    */
  var LastModifiedDate: string
  
  /**
    * The custom name of the configuration for the recommender model.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The type of Amazon Pinpoint ID that's associated with unique user IDs in the recommender model. This value enables the model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon Pinpoint application. Possible values are: PINPOINT_ENDPOINT_ID - Each user in the model is associated with a particular endpoint in Amazon Pinpoint. The data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value. PINPOINT_USER_ID - Each user in the model is associated with a particular user and endpoint in Amazon Pinpoint. The data is correlated based on user IDs in Amazon Pinpoint. If this value is specified, an endpoint definition in Amazon Pinpoint has to specify both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent to the user's endpoint.
    */
  var RecommendationProviderIdType: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to retrieve recommendation data from the recommender model.
    */
  var RecommendationProviderRoleArn: string
  
  /**
    * The Amazon Resource Name (ARN) of the recommender model that Amazon Pinpoint retrieves the recommendation data from. This value is the ARN of an Amazon Personalize campaign.
    */
  var RecommendationProviderUri: string
  
  /**
    * The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to perform additional processing of recommendation data that it retrieves from the recommender model.
    */
  var RecommendationTransformerUri: js.UndefOr[string] = js.undefined
  
  /**
    * The custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores recommended items for each endpoint or user, depending on the value for the RecommendationProviderIdType property. This name appears in the Attribute finder of the template editor on the Amazon Pinpoint console. This value is null if the configuration doesn't invoke an AWS Lambda function (RecommendationTransformerUri) to perform additional processing of recommendation data.
    */
  var RecommendationsDisplayName: js.UndefOr[string] = js.undefined
  
  /**
    * The number of recommended items that are retrieved from the model for each endpoint or user, depending on the value for the RecommendationProviderIdType property. This number determines how many recommended items are available for use in message variables.
    */
  var RecommendationsPerMessage: js.UndefOr[integer] = js.undefined
}
object RecommenderConfigurationResponse {
  
  @scala.inline
  def apply(
    CreationDate: string,
    Id: string,
    LastModifiedDate: string,
    RecommendationProviderRoleArn: string,
    RecommendationProviderUri: string
  ): RecommenderConfigurationResponse = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LastModifiedDate = LastModifiedDate.asInstanceOf[js.Any], RecommendationProviderRoleArn = RecommendationProviderRoleArn.asInstanceOf[js.Any], RecommendationProviderUri = RecommendationProviderUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommenderConfigurationResponse]
  }
  
  @scala.inline
  implicit class RecommenderConfigurationResponseMutableBuilder[Self <: RecommenderConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: MapOfString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRecommendationProviderIdType(value: string): Self = StObject.set(x, "RecommendationProviderIdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationProviderIdTypeUndefined: Self = StObject.set(x, "RecommendationProviderIdType", js.undefined)
    
    @scala.inline
    def setRecommendationProviderRoleArn(value: string): Self = StObject.set(x, "RecommendationProviderRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationProviderUri(value: string): Self = StObject.set(x, "RecommendationProviderUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationTransformerUri(value: string): Self = StObject.set(x, "RecommendationTransformerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationTransformerUriUndefined: Self = StObject.set(x, "RecommendationTransformerUri", js.undefined)
    
    @scala.inline
    def setRecommendationsDisplayName(value: string): Self = StObject.set(x, "RecommendationsDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationsDisplayNameUndefined: Self = StObject.set(x, "RecommendationsDisplayName", js.undefined)
    
    @scala.inline
    def setRecommendationsPerMessage(value: integer): Self = StObject.set(x, "RecommendationsPerMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationsPerMessageUndefined: Self = StObject.set(x, "RecommendationsPerMessage", js.undefined)
  }
}
