package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryAssociation extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) identifying the repository association.
    */
  var AssociationArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ID of the repository association.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.codegurureviewerMod.AssociationId] = js.native
  
  /**
    *  The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id. For more information, see  Connection  in the AWS CodeStar Connections API Reference. 
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.codegurureviewerMod.ConnectionArn] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the repository association was created.
    */
  var CreatedTimeStamp: js.UndefOr[TimeStamp] = js.native
  
  /**
    * The time, in milliseconds since the epoch, when the repository association was last updated.
    */
  var LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.native
  
  /**
    * The name of the repository.
    */
  var Name: js.UndefOr[typings.awsSdk.codegurureviewerMod.Name] = js.native
  
  /**
    * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for the account that owns the repository.
    */
  var Owner: js.UndefOr[typings.awsSdk.codegurureviewerMod.Owner] = js.native
  
  /**
    * The provider type of the repository association.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codegurureviewerMod.ProviderType] = js.native
  
  /**
    * The state of the repository association. The valid repository association states are:    Associated: The repository association is complete.     Associating: CodeGuru Reviewer is:     Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer review.    If your repository ProviderType is GitHub, GitHub Enterprise Server, or Bitbucket, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru Reviewer reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.      Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your repository.       Failed: The repository failed to associate or disassociate.     Disassociating: CodeGuru Reviewer is removing the repository's pull request notifications and source code access.     Disassociated: CodeGuru Reviewer successfully disassociated the repository. You can create a new association with this repository if you want to review source code in it later. You can control access to code reviews created in an associated repository with tags after it has been disassociated. For more information, see Using tags to control access to associated repositories in the Amazon CodeGuru Reviewer User Guide.   
    */
  var State: js.UndefOr[RepositoryAssociationState] = js.native
  
  /**
    * A description of why the repository association is in the current state.
    */
  var StateReason: js.UndefOr[typings.awsSdk.codegurureviewerMod.StateReason] = js.native
}
object RepositoryAssociation {
  
  @scala.inline
  def apply(): RepositoryAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryAssociation]
  }
  
  @scala.inline
  implicit class RepositoryAssociationMutableBuilder[Self <: RepositoryAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationArn(value: Arn): Self = StObject.set(x, "AssociationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationArnUndefined: Self = StObject.set(x, "AssociationArn", js.undefined)
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    @scala.inline
    def setCreatedTimeStamp(value: TimeStamp): Self = StObject.set(x, "CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeStampUndefined: Self = StObject.set(x, "CreatedTimeStamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimeStamp(value: TimeStamp): Self = StObject.set(x, "LastUpdatedTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeStampUndefined: Self = StObject.set(x, "LastUpdatedTimeStamp", js.undefined)
    
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
    def setState(value: RepositoryAssociationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
