package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Namespace extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
    */
  var Arn: js.UndefOr[typings.awsSdk.servicediscoveryMod.Arn] = js.native
  /**
    * The date that the namespace was created, in Unix date/time format and Coordinated Universal Time (UTC). The value of CreateDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.native
  /**
    * A unique string that identifies the request and that allows failed requests to be retried without the risk of executing an operation twice. 
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  /**
    * The description that you specify for the namespace when you create it.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * The ID of a namespace.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * The name of the namespace, such as example.com.
    */
  var Name: js.UndefOr[NamespaceName] = js.native
  /**
    * A complex type that contains information that's specific to the type of the namespace.
    */
  var Properties: js.UndefOr[NamespaceProperties] = js.native
  /**
    * The number of services that are associated with the namespace.
    */
  var ServiceCount: js.UndefOr[ResourceCount] = js.native
  /**
    * The type of the namespace. Valid values are DNS_PUBLIC and DNS_PRIVATE.
    */
  var Type: js.UndefOr[NamespaceType] = js.native
}

object Namespace {
  @scala.inline
  def apply(
    Arn: Arn = null,
    CreateDate: Timestamp = null,
    CreatorRequestId: ResourceId = null,
    Description: ResourceDescription = null,
    Id: ResourceId = null,
    Name: NamespaceName = null,
    Properties: NamespaceProperties = null,
    ServiceCount: Int | Double = null,
    Type: NamespaceType = null
  ): Namespace = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Properties != null) __obj.updateDynamic("Properties")(Properties.asInstanceOf[js.Any])
    if (ServiceCount != null) __obj.updateDynamic("ServiceCount")(ServiceCount.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Namespace]
  }
}

