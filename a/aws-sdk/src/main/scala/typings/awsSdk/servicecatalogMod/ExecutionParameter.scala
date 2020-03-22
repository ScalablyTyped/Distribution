package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionParameter extends js.Object {
  /**
    * The default values for the execution parameter.
    */
  var DefaultValues: js.UndefOr[ExecutionParameterValueList] = js.native
  /**
    * The name of the execution parameter.
    */
  var Name: js.UndefOr[ExecutionParameterKey] = js.native
  /**
    * The execution parameter type.
    */
  var Type: js.UndefOr[ExecutionParameterType] = js.native
}

object ExecutionParameter {
  @scala.inline
  def apply(
    DefaultValues: ExecutionParameterValueList = null,
    Name: ExecutionParameterKey = null,
    Type: ExecutionParameterType = null
  ): ExecutionParameter = {
    val __obj = js.Dynamic.literal()
    if (DefaultValues != null) __obj.updateDynamic("DefaultValues")(DefaultValues.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionParameter]
  }
}

