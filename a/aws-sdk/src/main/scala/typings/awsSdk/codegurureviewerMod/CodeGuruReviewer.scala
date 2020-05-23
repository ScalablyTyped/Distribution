package typings.awsSdk.codegurureviewerMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeGuruReviewer extends Service {
  @JSName("config")
  var config_CodeGuruReviewer: ConfigBase with ClientConfiguration = js.native
  /**
    * Associates an AWS CodeCommit repository with Amazon CodeGuru Reviewer. When you associate an AWS CodeCommit repository with Amazon CodeGuru Reviewer, Amazon CodeGuru Reviewer will provide recommendations for each pull request raised within the repository. You can view recommendations in the AWS CodeCommit repository. You can associate a GitHub repository using the Amazon CodeGuru Reviewer console.
    */
  def associateRepository(): Request[AssociateRepositoryResponse, AWSError] = js.native
  def associateRepository(callback: js.Function2[/* err */ AWSError, /* data */ AssociateRepositoryResponse, Unit]): Request[AssociateRepositoryResponse, AWSError] = js.native
  /**
    * Associates an AWS CodeCommit repository with Amazon CodeGuru Reviewer. When you associate an AWS CodeCommit repository with Amazon CodeGuru Reviewer, Amazon CodeGuru Reviewer will provide recommendations for each pull request raised within the repository. You can view recommendations in the AWS CodeCommit repository. You can associate a GitHub repository using the Amazon CodeGuru Reviewer console.
    */
  def associateRepository(params: AssociateRepositoryRequest): Request[AssociateRepositoryResponse, AWSError] = js.native
  def associateRepository(
    params: AssociateRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateRepositoryResponse, Unit]
  ): Request[AssociateRepositoryResponse, AWSError] = js.native
  /**
    *  Returns the metadaata associated with the code review along with its status.
    */
  def describeCodeReview(): Request[DescribeCodeReviewResponse, AWSError] = js.native
  def describeCodeReview(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeReviewResponse, Unit]): Request[DescribeCodeReviewResponse, AWSError] = js.native
  /**
    *  Returns the metadaata associated with the code review along with its status.
    */
  def describeCodeReview(params: DescribeCodeReviewRequest): Request[DescribeCodeReviewResponse, AWSError] = js.native
  def describeCodeReview(
    params: DescribeCodeReviewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeReviewResponse, Unit]
  ): Request[DescribeCodeReviewResponse, AWSError] = js.native
  /**
    *  Describes the customer feedback for a CodeGuru Reviewer recommendation. 
    */
  def describeRecommendationFeedback(): Request[DescribeRecommendationFeedbackResponse, AWSError] = js.native
  def describeRecommendationFeedback(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecommendationFeedbackResponse, Unit]
  ): Request[DescribeRecommendationFeedbackResponse, AWSError] = js.native
  /**
    *  Describes the customer feedback for a CodeGuru Reviewer recommendation. 
    */
  def describeRecommendationFeedback(params: DescribeRecommendationFeedbackRequest): Request[DescribeRecommendationFeedbackResponse, AWSError] = js.native
  def describeRecommendationFeedback(
    params: DescribeRecommendationFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRecommendationFeedbackResponse, Unit]
  ): Request[DescribeRecommendationFeedbackResponse, AWSError] = js.native
  /**
    * Describes a repository association.
    */
  def describeRepositoryAssociation(): Request[DescribeRepositoryAssociationResponse, AWSError] = js.native
  def describeRepositoryAssociation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRepositoryAssociationResponse, Unit]): Request[DescribeRepositoryAssociationResponse, AWSError] = js.native
  /**
    * Describes a repository association.
    */
  def describeRepositoryAssociation(params: DescribeRepositoryAssociationRequest): Request[DescribeRepositoryAssociationResponse, AWSError] = js.native
  def describeRepositoryAssociation(
    params: DescribeRepositoryAssociationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRepositoryAssociationResponse, Unit]
  ): Request[DescribeRepositoryAssociationResponse, AWSError] = js.native
  /**
    * Removes the association between Amazon CodeGuru Reviewer and a repository.
    */
  def disassociateRepository(): Request[DisassociateRepositoryResponse, AWSError] = js.native
  def disassociateRepository(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateRepositoryResponse, Unit]): Request[DisassociateRepositoryResponse, AWSError] = js.native
  /**
    * Removes the association between Amazon CodeGuru Reviewer and a repository.
    */
  def disassociateRepository(params: DisassociateRepositoryRequest): Request[DisassociateRepositoryResponse, AWSError] = js.native
  def disassociateRepository(
    params: DisassociateRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateRepositoryResponse, Unit]
  ): Request[DisassociateRepositoryResponse, AWSError] = js.native
  /**
    *  Lists all the code reviews that the customer has created in the past 90 days. 
    */
  def listCodeReviews(): Request[ListCodeReviewsResponse, AWSError] = js.native
  def listCodeReviews(callback: js.Function2[/* err */ AWSError, /* data */ ListCodeReviewsResponse, Unit]): Request[ListCodeReviewsResponse, AWSError] = js.native
  /**
    *  Lists all the code reviews that the customer has created in the past 90 days. 
    */
  def listCodeReviews(params: ListCodeReviewsRequest): Request[ListCodeReviewsResponse, AWSError] = js.native
  def listCodeReviews(
    params: ListCodeReviewsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCodeReviewsResponse, Unit]
  ): Request[ListCodeReviewsResponse, AWSError] = js.native
  /**
    *  Lists the customer feedback for a CodeGuru Reviewer recommendation for all users. This API will be used from the console to extract the previously given feedback by the user to pre-populate the feedback emojis for all recommendations. 
    */
  def listRecommendationFeedback(): Request[ListRecommendationFeedbackResponse, AWSError] = js.native
  def listRecommendationFeedback(callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendationFeedbackResponse, Unit]): Request[ListRecommendationFeedbackResponse, AWSError] = js.native
  /**
    *  Lists the customer feedback for a CodeGuru Reviewer recommendation for all users. This API will be used from the console to extract the previously given feedback by the user to pre-populate the feedback emojis for all recommendations. 
    */
  def listRecommendationFeedback(params: ListRecommendationFeedbackRequest): Request[ListRecommendationFeedbackResponse, AWSError] = js.native
  def listRecommendationFeedback(
    params: ListRecommendationFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendationFeedbackResponse, Unit]
  ): Request[ListRecommendationFeedbackResponse, AWSError] = js.native
  /**
    *  Returns the list of all recommendations for a completed code review. 
    */
  def listRecommendations(): Request[ListRecommendationsResponse, AWSError] = js.native
  def listRecommendations(callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendationsResponse, Unit]): Request[ListRecommendationsResponse, AWSError] = js.native
  /**
    *  Returns the list of all recommendations for a completed code review. 
    */
  def listRecommendations(params: ListRecommendationsRequest): Request[ListRecommendationsResponse, AWSError] = js.native
  def listRecommendations(
    params: ListRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendationsResponse, Unit]
  ): Request[ListRecommendationsResponse, AWSError] = js.native
  /**
    * Lists repository associations. You can optionally filter on one or more of the following recommendation properties: provider types, states, names, and owners.
    */
  def listRepositoryAssociations(): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
  def listRepositoryAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoryAssociationsResponse, Unit]): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
  /**
    * Lists repository associations. You can optionally filter on one or more of the following recommendation properties: provider types, states, names, and owners.
    */
  def listRepositoryAssociations(params: ListRepositoryAssociationsRequest): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
  def listRepositoryAssociations(
    params: ListRepositoryAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoryAssociationsResponse, Unit]
  ): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
  /**
    *  Stores customer feedback for a CodeGuru-Reviewer recommendation. When this API is called again with different reactions the previous feedback is overwritten. 
    */
  def putRecommendationFeedback(): Request[PutRecommendationFeedbackResponse, AWSError] = js.native
  def putRecommendationFeedback(callback: js.Function2[/* err */ AWSError, /* data */ PutRecommendationFeedbackResponse, Unit]): Request[PutRecommendationFeedbackResponse, AWSError] = js.native
  /**
    *  Stores customer feedback for a CodeGuru-Reviewer recommendation. When this API is called again with different reactions the previous feedback is overwritten. 
    */
  def putRecommendationFeedback(params: PutRecommendationFeedbackRequest): Request[PutRecommendationFeedbackResponse, AWSError] = js.native
  def putRecommendationFeedback(
    params: PutRecommendationFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRecommendationFeedbackResponse, Unit]
  ): Request[PutRecommendationFeedbackResponse, AWSError] = js.native
}

