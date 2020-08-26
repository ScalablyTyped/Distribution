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
  def apply(): ExecutionParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionParameter]
  }
  @scala.inline
  implicit class ExecutionParameterOps[Self <: ExecutionParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefaultValuesVarargs(value: ExecutionParameterValue*): Self = this.set("DefaultValues", js.Array(value :_*))
    @scala.inline
    def setDefaultValues(value: ExecutionParameterValueList): Self = this.set("DefaultValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValues: Self = this.set("DefaultValues", js.undefined)
    @scala.inline
    def setName(value: ExecutionParameterKey): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setType(value: ExecutionParameterType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

