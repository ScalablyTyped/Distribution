package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeReviewSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CodeReview object. 
    */
  var CodeReviewArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the code review was created.
    */
  var CreatedTimeStamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the code review was last updated.
    */
  var LastUpdatedTimeStamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The statistics from the code review.
    */
  var MetricsSummary: js.UndefOr[typings.awsSdk.codegurureviewerMod.MetricsSummary] = js.undefined
  
  /**
    * The name of the code review.
    */
  var Name: js.UndefOr[typings.awsSdk.codegurureviewerMod.Name] = js.undefined
  
  /**
    * The owner of the repository. For an Amazon Web Services CodeCommit repository, this is the Amazon Web Services account ID of the account that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for the account that owns the repository. For an S3 repository, it can be the username or Amazon Web Services account ID.
    */
  var Owner: js.UndefOr[typings.awsSdk.codegurureviewerMod.Owner] = js.undefined
  
  /**
    * The provider type of the repository association.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codegurureviewerMod.ProviderType] = js.undefined
  
  /**
    * The pull request ID for the code review.
    */
  var PullRequestId: js.UndefOr[typings.awsSdk.codegurureviewerMod.PullRequestId] = js.undefined
  
  /**
    * The name of the repository.
    */
  var RepositoryName: js.UndefOr[Name] = js.undefined
  
  var SourceCodeType: js.UndefOr[typings.awsSdk.codegurureviewerMod.SourceCodeType] = js.undefined
  
  /**
    * The state of the code review. The valid code review states are:    Completed: The code review is complete.    Pending: The code review started and has not completed or failed.    Failed: The code review failed.    Deleting: The code review is being deleted.  
    */
  var State: js.UndefOr[JobState] = js.undefined
  
  /**
    * The type of the code review.
    */
  var Type: js.UndefOr[typings.awsSdk.codegurureviewerMod.Type] = js.undefined
}
object CodeReviewSummary {
  
  inline def apply(): CodeReviewSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeReviewSummary]
  }
  
  extension [Self <: CodeReviewSummary](x: Self) {
    
    inline def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
    
    inline def setCodeReviewArnUndefined: Self = StObject.set(x, "CodeReviewArn", js.undefined)
    
    inline def setCreatedTimeStamp(value: js.Date): Self = StObject.set(x, "CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeStampUndefined: Self = StObject.set(x, "CreatedTimeStamp", js.undefined)
    
    inline def setLastUpdatedTimeStamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeStampUndefined: Self = StObject.set(x, "LastUpdatedTimeStamp", js.undefined)
    
    inline def setMetricsSummary(value: MetricsSummary): Self = StObject.set(x, "MetricsSummary", value.asInstanceOf[js.Any])
    
    inline def setMetricsSummaryUndefined: Self = StObject.set(x, "MetricsSummary", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    inline def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "PullRequestId", value.asInstanceOf[js.Any])
    
    inline def setPullRequestIdUndefined: Self = StObject.set(x, "PullRequestId", js.undefined)
    
    inline def setRepositoryName(value: Name): Self = StObject.set(x, "RepositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "RepositoryName", js.undefined)
    
    inline def setSourceCodeType(value: SourceCodeType): Self = StObject.set(x, "SourceCodeType", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeTypeUndefined: Self = StObject.set(x, "SourceCodeType", js.undefined)
    
    inline def setState(value: JobState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
