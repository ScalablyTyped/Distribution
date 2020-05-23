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
    *  The Amazon Resource Name (ARN) identifying the repository connection. 
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
    * The owner of the repository.
    */
  var Owner: js.UndefOr[typings.awsSdk.codegurureviewerMod.Owner] = js.native
  /**
    * The provider type of the repository association.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codegurureviewerMod.ProviderType] = js.native
  /**
    * The state of the repository association.
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

