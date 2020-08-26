package typings.awsSdkClientGlacierNode.typesJobParametersMod

import typings.awsSdkClientGlacierNode.typesInventoryRetrievalJobInputMod.UnmarshalledInventoryRetrievalJobInput
import typings.awsSdkClientGlacierNode.typesOutputLocationMod.UnmarshalledOutputLocation
import typings.awsSdkClientGlacierNode.typesSelectParametersMod.UnmarshalledSelectParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledJobParameters extends JobParameters {
  /**
    * <p>Input parameters used for range inventory retrieval.</p>
    */
  @JSName("InventoryRetrievalParameters")
  var InventoryRetrievalParameters_UnmarshalledJobParameters: js.UndefOr[UnmarshalledInventoryRetrievalJobInput] = js.native
  /**
    * <p>Contains information about the location where the select job results are stored.</p>
    */
  @JSName("OutputLocation")
  var OutputLocation_UnmarshalledJobParameters: js.UndefOr[UnmarshalledOutputLocation] = js.native
  /**
    * <p>Contains the parameters that define a job.</p>
    */
  @JSName("SelectParameters")
  var SelectParameters_UnmarshalledJobParameters: js.UndefOr[UnmarshalledSelectParameters] = js.native
}

object UnmarshalledJobParameters {
  @scala.inline
  def apply(): UnmarshalledJobParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledJobParameters]
  }
  @scala.inline
  implicit class UnmarshalledJobParametersOps[Self <: UnmarshalledJobParameters] (val x: Self) extends AnyVal {
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
    def setInventoryRetrievalParameters(value: UnmarshalledInventoryRetrievalJobInput): Self = this.set("InventoryRetrievalParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInventoryRetrievalParameters: Self = this.set("InventoryRetrievalParameters", js.undefined)
    @scala.inline
    def setOutputLocation(value: UnmarshalledOutputLocation): Self = this.set("OutputLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputLocation: Self = this.set("OutputLocation", js.undefined)
    @scala.inline
    def setSelectParameters(value: UnmarshalledSelectParameters): Self = this.set("SelectParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectParameters: Self = this.set("SelectParameters", js.undefined)
  }
  
}

