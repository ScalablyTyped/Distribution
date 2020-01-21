package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryAssociationSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying the repository association.
    */
  var AssociationArn: js.UndefOr[Arn] = js.native
  /**
    * The repository association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.codegurureviewerMod.AssociationId] = js.native
  /**
    * The time, in milliseconds since the epoch, since the repository association was last updated. 
    */
  var LastUpdatedTimeStamp: js.UndefOr[TimeStamp] = js.native
  /**
    * The name of the repository association.
    */
  var Name: js.UndefOr[typings.awsSdk.codegurureviewerMod.Name] = js.native
  /**
    * The owner of the repository association.
    */
  var Owner: js.UndefOr[typings.awsSdk.codegurureviewerMod.Owner] = js.native
  /**
    * The provider type of the repository association.
    */
  var ProviderType: js.UndefOr[typings.awsSdk.codegurureviewerMod.ProviderType] = js.native
  /**
    * The state of the repository association.  Associated  Amazon CodeGuru Reviewer is associated with the repository.   Associating  The association is in progress.   Failed  The association failed. For more information about troubleshooting (or why it failed), see [troubleshooting topic].   Disassociating  Amazon CodeGuru Reviewer is in the process of disassociating with the repository.   
    */
  var State: js.UndefOr[RepositoryAssociationState] = js.native
}

object RepositoryAssociationSummary {
  @scala.inline
  def apply(
    AssociationArn: Arn = null,
    AssociationId: AssociationId = null,
    LastUpdatedTimeStamp: TimeStamp = null,
    Name: Name = null,
    Owner: Owner = null,
    ProviderType: ProviderType = null,
    State: RepositoryAssociationState = null
  ): RepositoryAssociationSummary = {
    val __obj = js.Dynamic.literal()
    if (AssociationArn != null) __obj.updateDynamic("AssociationArn")(AssociationArn.asInstanceOf[js.Any])
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (LastUpdatedTimeStamp != null) __obj.updateDynamic("LastUpdatedTimeStamp")(LastUpdatedTimeStamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    if (ProviderType != null) __obj.updateDynamic("ProviderType")(ProviderType.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryAssociationSummary]
  }
}

