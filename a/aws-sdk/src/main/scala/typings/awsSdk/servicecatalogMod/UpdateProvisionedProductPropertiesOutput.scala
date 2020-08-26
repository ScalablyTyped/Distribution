package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProvisionedProductPropertiesOutput extends js.Object {
  /**
    * The provisioned product identifier.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.native
  /**
    * A map that contains the properties updated.
    */
  var ProvisionedProductProperties: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductProperties] = js.native
  /**
    * The identifier of the record.
    */
  var RecordId: js.UndefOr[Id] = js.native
  /**
    * The status of the request.
    */
  var Status: js.UndefOr[RecordStatus] = js.native
}

object UpdateProvisionedProductPropertiesOutput {
  @scala.inline
  def apply(): UpdateProvisionedProductPropertiesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisionedProductPropertiesOutput]
  }
  @scala.inline
  implicit class UpdateProvisionedProductPropertiesOutputOps[Self <: UpdateProvisionedProductPropertiesOutput] (val x: Self) extends AnyVal {
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
    def setProvisionedProductId(value: Id): Self = this.set("ProvisionedProductId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedProductId: Self = this.set("ProvisionedProductId", js.undefined)
    @scala.inline
    def setProvisionedProductProperties(value: ProvisionedProductProperties): Self = this.set("ProvisionedProductProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedProductProperties: Self = this.set("ProvisionedProductProperties", js.undefined)
    @scala.inline
    def setRecordId(value: Id): Self = this.set("RecordId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordId: Self = this.set("RecordId", js.undefined)
    @scala.inline
    def setStatus(value: RecordStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

