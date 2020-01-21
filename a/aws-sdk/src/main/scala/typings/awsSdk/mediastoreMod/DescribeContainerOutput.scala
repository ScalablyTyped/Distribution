package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContainerOutput extends js.Object {
  /**
    * The name of the queried container.
    */
  var Container: js.UndefOr[typings.awsSdk.mediastoreMod.Container] = js.native
}

object DescribeContainerOutput {
  @scala.inline
  def apply(Container: Container = null): DescribeContainerOutput = {
    val __obj = js.Dynamic.literal()
    if (Container != null) __obj.updateDynamic("Container")(Container.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContainerOutput]
  }
}

