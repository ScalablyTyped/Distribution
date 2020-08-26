package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRecommenderConfiguration extends js.Object {
  /**
    * A map of key-value pairs that defines 1-10 custom endpoint or user attributes, depending on the value for the RecommendationProviderIdType property. Each of these attributes temporarily stores a recommended item that's retrieved from the recommender model and sent to an AWS Lambda function for additional processing. Each attribute can be used as a message variable in a message template. In the map, the key is the name of a custom attribute and the value is a custom display name for that attribute. The display name appears in the Attribute finder of the template editor on the Amazon Pinpoint console. The following restrictions apply to these names: An attribute name must start with a letter or number and it can contain up to 50 characters. The characters can be letters, numbers, underscores (_), or hyphens (-). Attribute names are case sensitive and must be unique. An attribute display name must start with a letter or number and it can contain up to 25 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens (-). This object is required if the configuration invokes an AWS Lambda function (RecommendationTransformerUri) to process recommendation data. Otherwise, don't include this object in your request.
    */
  var Attributes: js.UndefOr[MapOfString] = js.native
  /**
    * A custom description of the configuration for the recommender model. The description can contain up to 128 characters. The characters can be letters, numbers, spaces, or the following symbols: _ ; () , ‐.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * A custom name of the configuration for the recommender model. The name must start with a letter or number and it can contain up to 128 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens (-).
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The type of Amazon Pinpoint ID to associate with unique user IDs in the recommender model. This value enables the model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon Pinpoint application. Valid values are: PINPOINT_ENDPOINT_ID - Associate each user in the model with a particular endpoint in Amazon Pinpoint. The data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value. PINPOINT_USER_ID - Associate each user in the model with a particular user and endpoint in Amazon Pinpoint. The data is correlated based on user IDs in Amazon Pinpoint. If you specify this value, an endpoint definition in Amazon Pinpoint has to specify both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent to the user's endpoint.
    */
  var RecommendationProviderIdType: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to retrieve recommendation data from the recommender model.
    */
  var RecommendationProviderRoleArn: string = js.native
  /**
    * The Amazon Resource Name (ARN) of the recommender model to retrieve recommendation data from. This value must match the ARN of an Amazon Personalize campaign.
    */
  var RecommendationProviderUri: string = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the AWS Lambda function to invoke for additional processing of recommendation data that's retrieved from the recommender model.
    */
  var RecommendationTransformerUri: js.UndefOr[string] = js.native
  /**
    * A custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores recommended items for each endpoint or user, depending on the value for the RecommendationProviderIdType property. This value is required if the configuration doesn't invoke an AWS Lambda function (RecommendationTransformerUri) to perform additional processing of recommendation data. This name appears in the Attribute finder of the template editor on the Amazon Pinpoint console. The name can contain up to 25 characters. The characters can be letters, numbers, spaces, underscores (_), or hyphens (-). These restrictions don't apply to attribute values.
    */
  var RecommendationsDisplayName: js.UndefOr[string] = js.native
  /**
    * The number of recommended items to retrieve from the model for each endpoint or user, depending on the value for the RecommendationProviderIdType property. This number determines how many recommended items are available for use in message variables. The minimum value is 1. The maximum value is 5. The default value is 5. To use multiple recommended items and custom attributes with message variables, you have to use an AWS Lambda function (RecommendationTransformerUri) to perform additional processing of recommendation data.
    */
  var RecommendationsPerMessage: js.UndefOr[integer] = js.native
}

object CreateRecommenderConfiguration {
  @scala.inline
  def apply(RecommendationProviderRoleArn: string, RecommendationProviderUri: string): CreateRecommenderConfiguration = {
    val __obj = js.Dynamic.literal(RecommendationProviderRoleArn = RecommendationProviderRoleArn.asInstanceOf[js.Any], RecommendationProviderUri = RecommendationProviderUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRecommenderConfiguration]
  }
  @scala.inline
  implicit class CreateRecommenderConfigurationOps[Self <: CreateRecommenderConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRecommendationProviderRoleArn(value: string): Self = this.set("RecommendationProviderRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecommendationProviderUri(value: string): Self = this.set("RecommendationProviderUri", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: MapOfString): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRecommendationProviderIdType(value: string): Self = this.set("RecommendationProviderIdType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendationProviderIdType: Self = this.set("RecommendationProviderIdType", js.undefined)
    @scala.inline
    def setRecommendationTransformerUri(value: string): Self = this.set("RecommendationTransformerUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendationTransformerUri: Self = this.set("RecommendationTransformerUri", js.undefined)
    @scala.inline
    def setRecommendationsDisplayName(value: string): Self = this.set("RecommendationsDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendationsDisplayName: Self = this.set("RecommendationsDisplayName", js.undefined)
    @scala.inline
    def setRecommendationsPerMessage(value: integer): Self = this.set("RecommendationsPerMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecommendationsPerMessage: Self = this.set("RecommendationsPerMessage", js.undefined)
  }
  
}

