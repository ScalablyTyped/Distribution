package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  /**
    * The valid range of values for the parameter.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * Indicates whether a change to the parameter is applied immediately or requires a reboot for the change to be applied. You can force a reboot or wait until the next maintenance window's reboot. For more information, see Rebooting a Cluster.
    */
  var ChangeType: js.UndefOr[typings.awsSdk.elasticacheMod.ChangeType] = js.native
  /**
    * The valid data type for the parameter.
    */
  var DataType: js.UndefOr[String] = js.native
  /**
    * A description of the parameter.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Indicates whether (true) or not (false) the parameter can be modified. Some parameters have security or operational implications that prevent them from being changed.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.native
  /**
    * The earliest cache engine version to which the parameter can apply.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.native
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  /**
    * The value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
  /**
    * The source of the parameter.
    */
  var Source: js.UndefOr[String] = js.native
}

object Parameter {
  @scala.inline
  def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  @scala.inline
  implicit class ParameterOps[Self <: Parameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowedValues(value: String): Self = this.set("AllowedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedValues: Self = this.set("AllowedValues", js.undefined)
    @scala.inline
    def setChangeType(value: ChangeType): Self = this.set("ChangeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeType: Self = this.set("ChangeType", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("DataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("DataType", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setIsModifiable(value: Boolean): Self = this.set("IsModifiable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsModifiable: Self = this.set("IsModifiable", js.undefined)
    @scala.inline
    def setMinimumEngineVersion(value: String): Self = this.set("MinimumEngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumEngineVersion: Self = this.set("MinimumEngineVersion", js.undefined)
    @scala.inline
    def setParameterName(value: String): Self = this.set("ParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterName: Self = this.set("ParameterName", js.undefined)
    @scala.inline
    def setParameterValue(value: String): Self = this.set("ParameterValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterValue: Self = this.set("ParameterValue", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
  }
  
}

