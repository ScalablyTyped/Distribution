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
    *  Use to associate an AWS CodeCommit repository or a repostory managed by AWS CodeStar Connections with Amazon CodeGuru Reviewer. When you associate a repository, CodeGuru Reviewer reviews source code changes in the repository's pull requests and provides automatic recommendations. You can view recommendations using the CodeGuru Reviewer console. For more information, see Recommendations in Amazon CodeGuru Reviewer in the Amazon CodeGuru Reviewer User Guide.  If you associate a CodeCommit repository, it must be in the same AWS Region and AWS account where its CodeGuru Reviewer code reviews are configured.  Bitbucket and GitHub Enterprise Server repositories are managed by AWS CodeStar Connections to connect to CodeGuru Reviewer. For more information, see Connect to a repository source provider in the Amazon CodeGuru Reviewer User Guide.    You cannot use the CodeGuru Reviewer SDK or the AWS CLI to associate a GitHub repository with Amazon CodeGuru Reviewer. To associate a GitHub repository, use the console. For more information, see Getting started with CodeGuru Reviewer in the CodeGuru Reviewer User Guide.  
    */
  def associateRepository(): Request[AssociateRepositoryResponse, AWSError] = js.native
  def associateRepository(callback: js.Function2[/* err */ AWSError, /* data */ AssociateRepositoryResponse, Unit]): Request[AssociateRepositoryResponse, AWSError] = js.native
  /**
    *  Use to associate an AWS CodeCommit repository or a repostory managed by AWS CodeStar Connections with Amazon CodeGuru Reviewer. When you associate a repository, CodeGuru Reviewer reviews source code changes in the repository's pull requests and provides automatic recommendations. You can view recommendations using the CodeGuru Reviewer console. For more information, see Recommendations in Amazon CodeGuru Reviewer in the Amazon CodeGuru Reviewer User Guide.  If you associate a CodeCommit repository, it must be in the same AWS Region and AWS account where its CodeGuru Reviewer code reviews are configured.  Bitbucket and GitHub Enterprise Server repositories are managed by AWS CodeStar Connections to connect to CodeGuru Reviewer. For more information, see Connect to a repository source provider in the Amazon CodeGuru Reviewer User Guide.    You cannot use the CodeGuru Reviewer SDK or the AWS CLI to associate a GitHub repository with Amazon CodeGuru Reviewer. To associate a GitHub repository, use the console. For more information, see Getting started with CodeGuru Reviewer in the CodeGuru Reviewer User Guide.  
    */
  def associateRepository(params: AssociateRepositoryRequest): Request[AssociateRepositoryResponse, AWSError] = js.native
  def associateRepository(
    params: AssociateRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateRepositoryResponse, Unit]
  ): Request[AssociateRepositoryResponse, AWSError] = js.native
  /**
    *  Returns the metadata associated with the code review along with its status.
    */
  def describeCodeReview(): Request[DescribeCodeReviewResponse, AWSError] = js.native
  def describeCodeReview(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeReviewResponse, Unit]): Request[DescribeCodeReviewResponse, AWSError] = js.native
  /**
    *  Returns the metadata associated with the code review along with its status.
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
    *  Returns a  RepositoryAssociation  object that contains information about the requested repository association. 
    */
  def describeRepositoryAssociation(): Request[DescribeRepositoryAssociationResponse, AWSError] = js.native
  def describeRepositoryAssociation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRepositoryAssociationResponse, Unit]): Request[DescribeRepositoryAssociationResponse, AWSError] = js.native
  /**
    *  Returns a  RepositoryAssociation  object that contains information about the requested repository association. 
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
    *  Returns a list of  RecommendationFeedbackSummary  objects that contain customer recommendation feedback for all CodeGuru Reviewer users. 
    */
  def listRecommendationFeedback(): Request[ListRecommendationFeedbackResponse, AWSError] = js.native
  def listRecommendationFeedback(callback: js.Function2[/* err */ AWSError, /* data */ ListRecommendationFeedbackResponse, Unit]): Request[ListRecommendationFeedbackResponse, AWSError] = js.native
  /**
    *  Returns a list of  RecommendationFeedbackSummary  objects that contain customer recommendation feedback for all CodeGuru Reviewer users. 
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
    *  Returns a list of  RepositoryAssociationSummary  objects that contain summary information about a repository association. You can filter the returned list by  ProviderType ,  Name ,  State , and  Owner . 
    */
  def listRepositoryAssociations(): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
  def listRepositoryAssociations(callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoryAssociationsResponse, Unit]): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
  /**
    *  Returns a list of  RepositoryAssociationSummary  objects that contain summary information about a repository association. You can filter the returned list by  ProviderType ,  Name ,  State , and  Owner . 
    */
  def listRepositoryAssociations(params: ListRepositoryAssociationsRequest): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
  def listRepositoryAssociations(
    params: ListRepositoryAssociationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoryAssociationsResponse, Unit]
  ): Request[ListRepositoryAssociationsResponse, AWSError] = js.native
  /**
    *  Stores customer feedback for a CodeGuru Reviewer recommendation. When this API is called again with different reactions the previous feedback is overwritten. 
    */
  def putRecommendationFeedback(): Request[PutRecommendationFeedbackResponse, AWSError] = js.native
  def putRecommendationFeedback(callback: js.Function2[/* err */ AWSError, /* data */ PutRecommendationFeedbackResponse, Unit]): Request[PutRecommendationFeedbackResponse, AWSError] = js.native
  /**
    *  Stores customer feedback for a CodeGuru Reviewer recommendation. When this API is called again with different reactions the previous feedback is overwritten. 
    */
  def putRecommendationFeedback(params: PutRecommendationFeedbackRequest): Request[PutRecommendationFeedbackResponse, AWSError] = js.native
  def putRecommendationFeedback(
    params: PutRecommendationFeedbackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRecommendationFeedbackResponse, Unit]
  ): Request[PutRecommendationFeedbackResponse, AWSError] = js.native
}

