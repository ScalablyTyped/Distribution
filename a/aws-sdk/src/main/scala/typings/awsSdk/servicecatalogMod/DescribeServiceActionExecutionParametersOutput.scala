package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServiceActionExecutionParametersOutput extends js.Object {
  /**
    * The parameters of the self-service action.
    */
  var ServiceActionParameters: js.UndefOr[ExecutionParameters] = js.native
}

object DescribeServiceActionExecutionParametersOutput {
  @scala.inline
  def apply(ServiceActionParameters: ExecutionParameters = null): DescribeServiceActionExecutionParametersOutput = {
    val __obj = js.Dynamic.literal()
    if (ServiceActionParameters != null) __obj.updateDynamic("ServiceActionParameters")(ServiceActionParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServiceActionExecutionParametersOutput]
  }
}

