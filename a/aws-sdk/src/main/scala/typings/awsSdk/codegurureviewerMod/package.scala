package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object codegurureviewerMod {
  
  type Arn = java.lang.String
  
  type AssociationArn = java.lang.String
  
  type AssociationId = java.lang.String
  
  type BranchName = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.codegurureviewerMod.ClientApiVersions
  
  type ClientRequestToken = java.lang.String
  
  type CodeReviewName = java.lang.String
  
  type CodeReviewSummaries = js.Array[typings.awsSdk.codegurureviewerMod.CodeReviewSummary]
  
  type CommitId = java.lang.String
  
  type ConnectionArn = java.lang.String
  
  type FilePath = java.lang.String
  
  type FindingsCount = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Completed_
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type JobState = typings.awsSdk.codegurureviewerMod._JobState | java.lang.String
  
  type JobStates = js.Array[typings.awsSdk.codegurureviewerMod.JobState]
  
  type LineNumber = scala.Double
  
  type ListCodeReviewsMaxResults = scala.Double
  
  type MaxResults = scala.Double
  
  type MeteredLinesOfCodeCount = scala.Double
  
  type Name = java.lang.String
  
  type Names = js.Array[typings.awsSdk.codegurureviewerMod.Name]
  
  type NextToken = java.lang.String
  
  type Owner = java.lang.String
  
  type Owners = js.Array[typings.awsSdk.codegurureviewerMod.Owner]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CodeCommit_
    - typings.awsSdk.awsSdkStrings.GitHub_
    - typings.awsSdk.awsSdkStrings.Bitbucket_
    - typings.awsSdk.awsSdkStrings.GitHubEnterpriseServer
    - java.lang.String
  */
  type ProviderType = typings.awsSdk.codegurureviewerMod._ProviderType | java.lang.String
  
  type ProviderTypes = js.Array[typings.awsSdk.codegurureviewerMod.ProviderType]
  
  type PullRequestId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ThumbsUp
    - typings.awsSdk.awsSdkStrings.ThumbsDown
    - java.lang.String
  */
  type Reaction = typings.awsSdk.codegurureviewerMod._Reaction | java.lang.String
  
  type Reactions = js.Array[typings.awsSdk.codegurureviewerMod.Reaction]
  
  type RecommendationFeedbackSummaries = js.Array[typings.awsSdk.codegurureviewerMod.RecommendationFeedbackSummary]
  
  type RecommendationId = java.lang.String
  
  type RecommendationIds = js.Array[typings.awsSdk.codegurureviewerMod.RecommendationId]
  
  type RecommendationSummaries = js.Array[typings.awsSdk.codegurureviewerMod.RecommendationSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Associated_
    - typings.awsSdk.awsSdkStrings.Associating_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Disassociating_
    - typings.awsSdk.awsSdkStrings.Disassociated_
    - java.lang.String
  */
  type RepositoryAssociationState = typings.awsSdk.codegurureviewerMod._RepositoryAssociationState | java.lang.String
  
  type RepositoryAssociationStates = js.Array[typings.awsSdk.codegurureviewerMod.RepositoryAssociationState]
  
  type RepositoryAssociationSummaries = js.Array[typings.awsSdk.codegurureviewerMod.RepositoryAssociationSummary]
  
  type RepositoryNames = js.Array[typings.awsSdk.codegurureviewerMod.Name]
  
  type StateReason = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.codegurureviewerMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codegurureviewerMod.TagValue]
  
  type TagValue = java.lang.String
  
  type Text = java.lang.String
  
  type TimeStamp = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PullRequest
    - typings.awsSdk.awsSdkStrings.RepositoryAnalysis
    - java.lang.String
  */
  type Type = typings.awsSdk.codegurureviewerMod._Type | java.lang.String
  
  type UserId = java.lang.String
  
  type UserIds = js.Array[typings.awsSdk.codegurureviewerMod.UserId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-09-19`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.codegurureviewerMod._apiVersion | java.lang.String
}
