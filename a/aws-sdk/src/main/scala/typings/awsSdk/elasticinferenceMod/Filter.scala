package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    *  The filter name for the Elastic Inference Accelerator list. It can assume the following values: accelerator-type: the type of Elastic Inference Accelerator to filter for. instance-id: an EC2 instance id to filter for. 
    */
  var name: js.UndefOr[FilterName] = js.native
  /**
    *  The values for the filter of the Elastic Inference Accelerator list. 
    */
  var values: js.UndefOr[ValueStringList] = js.native
}

object Filter {
  @scala.inline
  def apply(name: FilterName = null, values: ValueStringList = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

