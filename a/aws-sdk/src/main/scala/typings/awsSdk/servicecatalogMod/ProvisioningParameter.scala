package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningParameter extends js.Object {
  /**
    * The parameter key.
    */
  var Key: js.UndefOr[ParameterKey] = js.native
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[ParameterValue] = js.native
}

object ProvisioningParameter {
  @scala.inline
  def apply(): ProvisioningParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningParameter]
  }
  @scala.inline
  implicit class ProvisioningParameterOps[Self <: ProvisioningParameter] (val x: Self) extends AnyVal {
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
    def setKey(value: ParameterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setValue(value: ParameterValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

