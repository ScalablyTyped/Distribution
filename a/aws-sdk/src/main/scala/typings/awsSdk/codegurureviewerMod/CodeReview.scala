package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeReview extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the  RepositoryAssociation  that contains the reviewed source code. You can retrieve associated repository ARNs by calling  ListRepositoryAssociations . 
    */
  var AssociationArn: js.UndefOr[typings.awsSdk.codegurureviewerMod.AssociationArn] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
    */
  var CodeReviewArn: js.UndefOr[Arn] = js.native
  
  /**
    *  The time, in milliseconds since the epoch, when the code review was created. 
    */
  var CreatedTimeStamp: js.UndefOr[TimeStamp] = js.native
  
  /**
    *  The time, in milliseconds since the epoch, when the code review was last updated. 
    */
  var LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.native
  
  /**
    *  The statistics from the code review. 
    */
  var Metrics: js.UndefOr[typings.awsSdk.codegurureviewerMod.Metrics] = js.native
  
  /**
    *  The name of the code review. 
    */
  var Name: js.UndefOr[typings.awsSdk.codegurureviewerMod.Name] = js.native
  
  /**
    * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for the account that owns the repository.
    */
  var Owner: js.UndefOr[typings.awsSdk.codegurureviewerMod.Owner] = js.native
  
  /**
    *  The type of repository that contains the reviewed code (for example, GitHub or Bitbucket). 
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codegurureviewerMod.ProviderType] = js.native
  
  /**
    *  The pull request ID for the code review. 
    */
  var PullRequestId: js.UndefOr[typings.awsSdk.codegurureviewerMod.PullRequestId] = js.native
  
  /**
    *  The name of the repository. 
    */
  var RepositoryName: js.UndefOr[Name] = js.native
  
  /**
    *  The type of the source code for the code review. 
    */
  var SourceCodeType: js.UndefOr[typings.awsSdk.codegurureviewerMod.SourceCodeType] = js.native
  
  /**
    * The valid code review states are:    Completed: The code review is complete.     Pending: The code review started and has not completed or failed.     Failed: The code review failed.     Deleting: The code review is being deleted.   
    */
  var State: js.UndefOr[JobState] = js.native
  
  /**
    *  The reason for the state of the code review. 
    */
  var StateReason: js.UndefOr[typings.awsSdk.codegurureviewerMod.StateReason] = js.native
  
  /**
    *  The type of code review. 
    */
  var Type: js.UndefOr[typings.awsSdk.codegurureviewerMod.Type] = js.native
}
object CodeReview {
  
  @scala.inline
  def apply(): CodeReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeReview]
  }
  
  @scala.inline
  implicit class CodeReviewMutableBuilder[Self <: CodeReview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationArn(value: AssociationArn): Self = StObject.set(x, "AssociationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationArnUndefined: Self = StObject.set(x, "AssociationArn", js.undefined)
    
    @scala.inline
    def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeReviewArnUndefined: Self = StObject.set(x, "CodeReviewArn", js.undefined)
    
    @scala.inline
    def setCreatedTimeStamp(value: TimeStamp): Self = StObject.set(x, "CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeStampUndefined: Self = StObject.set(x, "CreatedTimeStamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimeStamp(value: TimeStamp): Self = StObject.set(x, "LastUpdatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeStampUndefined: Self = StObject.set(x, "LastUpdatedTimeStamp", js.undefined)
    
    @scala.inline
    def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    @scala.inline
    def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "PullRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequestIdUndefined: Self = StObject.set(x, "PullRequestId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: Name): Self = StObject.set(x, "RepositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "RepositoryName", js.undefined)
    
    @scala.inline
    def setSourceCodeType(value: SourceCodeType): Self = StObject.set(x, "SourceCodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeTypeUndefined: Self = StObject.set(x, "SourceCodeType", js.undefined)
    
    @scala.inline
    def setState(value: JobState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
