package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryAssociation extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying the repository association.
    */
  var AssociationArn: js.UndefOr[Arn] = js.native
  /**
    * The ID of the repository association.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.codegurureviewerMod.AssociationId] = js.native
  /**
    *  The Amazon Resource Name (ARN) of an AWS CodeStar Connections connection. Its format is arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id. For more information, see Connection in the AWS CodeStar Connections API Reference. 
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
    * The owner of the repository. For an AWS CodeCommit repository, this is the AWS account ID of the account that owns the repository. For a GitHub or Bitbucket repository, this is the username for the account that owns the repository.
    */
  var Owner: js.UndefOr[typings.awsSdk.codegurureviewerMod.Owner] = js.native
  /**
    * The provider type of the repository association.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codegurureviewerMod.ProviderType] = js.native
  /**
    * The state of the repository association. The valid repository association states are:    Associated: The repository association is complete.     Associating: CodeGuru Reviewer is:     Setting up pull request notifications. This is required for pull requests to trigger a CodeGuru Reviewer review.    If your repository ProviderType is GitHub or Bitbucket, CodeGuru Reviewer creates webhooks in your repository to trigger CodeGuru Reviewer reviews. If you delete these webhooks, reviews of code in your repository cannot be triggered.      Setting up source code access. This is required for CodeGuru Reviewer to securely clone code in your repository.       Failed: The repository failed to associate or disassociate.     Disassociating: CodeGuru Reviewer is removing the repository's pull request notifications and source code access.   
    */
  var State: js.UndefOr[RepositoryAssociationState] = js.native
  /**
    * A description of why the repository association is in the current state.
    */
  var StateReason: js.UndefOr[typings.awsSdk.codegurureviewerMod.StateReason] = js.native
}

object RepositoryAssociation {
  @scala.inline
  def apply(
    AssociationArn: Arn = null,
    AssociationId: AssociationId = null,
    ConnectionArn: ConnectionArn = null,
    CreatedTimeStamp: TimeStamp = null,
    LastUpdatedTimeStamp: TimeStamp = null,
    Name: Name = null,
    Owner: Owner = null,
    ProviderType: ProviderType = null,
    State: RepositoryAssociationState = null,
    StateReason: StateReason = null
  ): RepositoryAssociation = {
    val __obj = js.Dynamic.literal()
    if (AssociationArn != null) __obj.updateDynamic("AssociationArn")(AssociationArn.asInstanceOf[js.Any])
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (ConnectionArn != null) __obj.updateDynamic("ConnectionArn")(ConnectionArn.asInstanceOf[js.Any])
    if (CreatedTimeStamp != null) __obj.updateDynamic("CreatedTimeStamp")(CreatedTimeStamp.asInstanceOf[js.Any])
    if (LastUpdatedTimeStamp != null) __obj.updateDynamic("LastUpdatedTimeStamp")(LastUpdatedTimeStamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (ProviderType != null) __obj.updateDynamic("ProviderType")(ProviderType.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryAssociation]
  }
}

