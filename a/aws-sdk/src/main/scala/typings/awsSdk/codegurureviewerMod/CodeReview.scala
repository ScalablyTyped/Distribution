package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeReview extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the code review to describe. 
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
    *  The owner of the repository. 
    */
  var Owner: js.UndefOr[typings.awsSdk.codegurureviewerMod.Owner] = js.native
  /**
    *  The provider type of the repository association. 
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
    *  The state of the code review. 
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
  def apply(
    CodeReviewArn: Arn = null,
    CreatedTimeStamp: TimeStamp = null,
    LastUpdatedTimeStamp: TimeStamp = null,
    Metrics: Metrics = null,
    Name: Name = null,
    Owner: Owner = null,
    ProviderType: ProviderType = null,
    PullRequestId: PullRequestId = null,
    RepositoryName: Name = null,
    SourceCodeType: SourceCodeType = null,
    State: JobState = null,
    StateReason: StateReason = null,
    Type: Type = null
  ): CodeReview = {
    val __obj = js.Dynamic.literal()
    if (CodeReviewArn != null) __obj.updateDynamic("CodeReviewArn")(CodeReviewArn.asInstanceOf[js.Any])
    if (CreatedTimeStamp != null) __obj.updateDynamic("CreatedTimeStamp")(CreatedTimeStamp.asInstanceOf[js.Any])
    if (LastUpdatedTimeStamp != null) __obj.updateDynamic("LastUpdatedTimeStamp")(LastUpdatedTimeStamp.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (ProviderType != null) __obj.updateDynamic("ProviderType")(ProviderType.asInstanceOf[js.Any])
    if (PullRequestId != null) __obj.updateDynamic("PullRequestId")(PullRequestId.asInstanceOf[js.Any])
    if (RepositoryName != null) __obj.updateDynamic("RepositoryName")(RepositoryName.asInstanceOf[js.Any])
    if (SourceCodeType != null) __obj.updateDynamic("SourceCodeType")(SourceCodeType.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeReview]
  }
}

