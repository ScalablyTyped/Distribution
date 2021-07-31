package typings.awsSdk.codegurureviewerMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeGuruReviewer extends Service {
  
  /**
    *  Use to associate an AWS CodeCommit repository or a repostory managed by AWS CodeStar Connections with Amazon CodeGuru Reviewer. When you associate a repository, CodeGuru Reviewer reviews source code changes in the repository's pull requests and provides automatic recommendations. You can view recommendations using the CodeGuru Reviewer console. For more information, see Recommendations in Amazon CodeGuru Reviewer in the Amazon CodeGuru Reviewer User Guide.  If you associate a CodeCommit repository, it must be in the same AWS Region and AWS account where its CodeGuru Reviewer code reviews are configured. Bitbucket and GitHub Enterprise Server repositories are managed by AWS CodeStar Connections to connect to CodeGuru Reviewer. For more information, see Connect to a repository source provider in the Amazon CodeGuru Reviewer User Guide.    You cannot use the CodeGuru Reviewer SDK or the AWS CLI to associate a GitHub repository with Amazon CodeGuru Reviewer. To associate a GitHub repository, use the console. For more information, see Getting started with CodeGuru Reviewer in the CodeGuru Reviewer User Guide.  
    */
  def associateRepository(): Request[AssociateRepositoryResponse, AWSError] = js.native
  def associateRepository(callback: js.Function2[/* err */ AWSError, /* data */ AssociateRepositoryResponse, Unit]): Request[AssociateRepositoryResponse, AWSError] = js.native
  /**
    *  Use to associate an AWS CodeCommit repository or a repostory managed by AWS CodeStar Connections with Amazon CodeGuru Reviewer. When you associate a repository, CodeGuru Reviewer reviews source code changes in the repository's pull requests and provides automatic recommendations. You can view recommendations using the CodeGuru Reviewer console. For more information, see Recommendations in Amazon CodeGuru Reviewer in the Amazon CodeGuru Reviewer User Guide.  If you associate a CodeCommit repository, it must be in the same AWS Region and AWS account where its CodeGuru Reviewer code reviews are configured. Bitbucket and GitHub Enterprise Server repositories are managed by AWS CodeStar Connections to connect to CodeGuru Reviewer. For more information, see Connect to a repository source provider in the Amazon CodeGuru Reviewer User Guide.    You cannot use the CodeGuru Reviewer SDK or the AWS CLI to associate a GitHub repository with Amazon CodeGuru Reviewer. To associate a GitHub repository, use the console. For more information, see Getting started with CodeGuru Reviewer in the CodeGuru Reviewer User Guide.  
    */
  def associateRepository(params: AssociateRepositoryRequest): Request[AssociateRepositoryResponse, AWSError] = js.native
  def associateRepository(
    params: AssociateRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateRepositoryResponse, Unit]
  ): Request[AssociateRepositoryResponse, AWSError] = js.native
  
  @JSName("config")
  var config_CodeGuruReviewer: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  Use to create a code review with a  CodeReviewType  of RepositoryAnalysis. This type of code review analyzes all code under a specified branch in an associated repository. PullRequest code reviews are automatically triggered by a pull request so cannot be created using this method. 
    */
  def createCodeReview(): Request[CreateCodeReviewResponse, AWSError] = js.native
  def createCodeReview(callback: js.Function2[/* err */ AWSError, /* data */ CreateCodeReviewResponse, Unit]): Request[CreateCodeReviewResponse, AWSError] = js.native
  /**
    *  Use to create a code review with a  CodeReviewType  of RepositoryAnalysis. This type of code review analyzes all code under a specified branch in an associated repository. PullRequest code reviews are automatically triggered by a pull request so cannot be created using this method. 
    */
  def createCodeReview(params: CreateCodeReviewRequest): Request[CreateCodeReviewResponse, AWSError] = js.native
  def createCodeReview(
    params: CreateCodeReviewRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCodeReviewResponse, Unit]
  ): Request[CreateCodeReviewResponse, AWSError] = js.native
  
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
    * Returns the list of tags associated with an associated repository resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns the list of tags associated with an associated repository resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
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
  
  /**
    * Adds one or more tags to an associated repository.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds one or more tags to an associated repository.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from an associated repository.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from an associated repository.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}
