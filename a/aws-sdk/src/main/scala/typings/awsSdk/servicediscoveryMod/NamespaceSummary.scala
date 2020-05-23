package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
    */
  var Arn: js.UndefOr[typings.awsSdk.servicediscoveryMod.Arn] = js.native
  /**
    * The date and time that the namespace was created.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.native
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * The ID of the namespace.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * The name of the namespace. When you create a namespace, AWS Cloud Map automatically creates a Route 53 hosted zone that has the same name as the namespace.
    */
  var Name: js.UndefOr[NamespaceName] = js.native
  var Properties: js.UndefOr[NamespaceProperties] = js.native
  /**
    * The number of services that were created using the namespace.
    */
  var ServiceCount: js.UndefOr[ResourceCount] = js.native
  /**
    * The type of the namespace, either public or private.
    */
  var Type: js.UndefOr[NamespaceType] = js.native
}

object NamespaceSummary {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreateDate: Timestamp = null,
    Description: ResourceDescription = null,
    Id: ResourceId = null,
    Name: NamespaceName = null,
    Properties: NamespaceProperties = null,
    ServiceCount: js.UndefOr[ResourceCount] = js.undefined,
    Type: NamespaceType = null
  ): NamespaceSummary = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Properties != null) __obj.updateDynamic("Properties")(Properties.asInstanceOf[js.Any])
    if (!js.isUndefined(ServiceCount)) __obj.updateDynamic("ServiceCount")(ServiceCount.get.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceSummary]
  }
}

