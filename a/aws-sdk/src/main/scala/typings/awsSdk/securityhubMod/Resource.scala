package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /**
    * Additional details about the resource related to a finding.
    */
  var Details: js.UndefOr[ResourceDetails] = js.native
  /**
    * The canonical identifier for the given resource type.
    */
  var Id: NonEmptyString = js.native
  /**
    * The canonical AWS partition name that the Region is assigned to.
    */
  var Partition: js.UndefOr[typings.awsSdk.securityhubMod.Partition] = js.native
  /**
    * The canonical AWS external Region name where this resource is located.
    */
  var Region: js.UndefOr[NonEmptyString] = js.native
  /**
    * A list of AWS tags associated with a resource at the time the finding was processed.
    */
  var Tags: js.UndefOr[FieldMap] = js.native
  /**
    * The type of the resource that details are provided for.
    */
  var Type: NonEmptyString = js.native
}

object Resource {
  @scala.inline
  def apply(
    Id: NonEmptyString,
    Type: NonEmptyString,
    Details: ResourceDetails = null,
    Partition: Partition = null,
    Region: NonEmptyString = null,
    Tags: FieldMap = null
  ): Resource = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (Partition != null) __obj.updateDynamic("Partition")(Partition.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

