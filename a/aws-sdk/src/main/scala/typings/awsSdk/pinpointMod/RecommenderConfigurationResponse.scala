package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecommenderConfigurationResponse extends js.Object {
  /**
    * A map that defines 1-10 custom endpoint or user attributes, depending on the value for the RecommendationProviderIdType property. Each of these attributes temporarily stores a recommended item that's retrieved from the recommender model and sent to an AWS Lambda function for additional processing. Each attribute can be used as a message variable in a message template. This value is null if the configuration doesn't invoke an AWS Lambda function (RecommendationTransformerUri) to perform additional processing of recommendation data.
    */
  var Attributes: js.UndefOr[MapOfString] = js.native
  /**
    * The date, in extended ISO 8601 format, when the configuration was created for the recommender model.
    */
  var CreationDate: string = js.native
  /**
    * The custom description of the configuration for the recommender model.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the recommender model configuration.
    */
  var Id: string = js.native
  /**
    * The date, in extended ISO 8601 format, when the configuration for the recommender model was last modified.
    */
  var LastModifiedDate: string = js.native
  /**
    * The custom name of the configuration for the recommender model.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The type of Amazon Pinpoint ID that's associated with unique user IDs in the recommender model. This value enables the model to use attribute and event data that’s specific to a particular endpoint or user in an Amazon Pinpoint application. Possible values are: PINPOINT_ENDPOINT_ID - Each user in the model is associated with a particular endpoint in Amazon Pinpoint. The data is correlated based on endpoint IDs in Amazon Pinpoint. This is the default value. PINPOINT_USER_ID - Each user in the model is associated with a particular user and endpoint in Amazon Pinpoint. The data is correlated based on user IDs in Amazon Pinpoint. If this value is specified, an endpoint definition in Amazon Pinpoint has to specify both a user ID (UserId) and an endpoint ID. Otherwise, messages won’t be sent to the user's endpoint.
    */
  var RecommendationProviderIdType: js.UndefOr[string] = js.native
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to retrieve recommendation data from the recommender model.
    */
  var RecommendationProviderRoleArn: string = js.native
  /**
    * The Amazon Resource Name (ARN) of the recommender model that Amazon Pinpoint retrieves the recommendation data from. This value is the ARN of an Amazon Personalize campaign.
    */
  var RecommendationProviderUri: string = js.native
  /**
    * The name or Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Pinpoint invokes to perform additional processing of recommendation data that it retrieves from the recommender model.
    */
  var RecommendationTransformerUri: js.UndefOr[string] = js.native
  /**
    * The custom display name for the standard endpoint or user attribute (RecommendationItems) that temporarily stores recommended items for each endpoint or user, depending on the value for the RecommendationProviderIdType property. This name appears in the Attribute finder of the template editor on the Amazon Pinpoint console. This value is null if the configuration doesn't invoke an AWS Lambda function (RecommendationTransformerUri) to perform additional processing of recommendation data.
    */
  var RecommendationsDisplayName: js.UndefOr[string] = js.native
  /**
    * The number of recommended items that are retrieved from the model for each endpoint or user, depending on the value for the RecommendationProviderIdType property. This number determines how many recommended items are available for use in message variables.
    */
  var RecommendationsPerMessage: js.UndefOr[integer] = js.native
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
  implicit class RecommenderConfigurationResponseOps[Self <: RecommenderConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: string): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedDate(value: string): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
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

