package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContainerInput extends js.Object {
  /**
    * The name of the container to query.
    */
  var ContainerName: js.UndefOr[typings.awsSdk.mediastoreMod.ContainerName] = js.native
}

object DescribeContainerInput {
  @scala.inline
  def apply(ContainerName: ContainerName = null): DescribeContainerInput = {
    val __obj = js.Dynamic.literal()
    if (ContainerName != null) __obj.updateDynamic("ContainerName")(ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContainerInput]
  }
}

