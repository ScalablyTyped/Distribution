package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameter extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the parameter.
    */
  var ARN: js.UndefOr[String] = js.native
  /**
    * The data type of the parameter, such as text or aws:ec2:image. The default is text.
    */
  var DataType: js.UndefOr[ParameterDataType] = js.native
  /**
    * Date the parameter was last changed or updated and the parameter version was created.
    */
  var LastModifiedDate: js.UndefOr[DateTime] = js.native
  /**
    * The name of the parameter.
    */
  var Name: js.UndefOr[PSParameterName] = js.native
  /**
    * Either the version number or the label used to retrieve the parameter value. Specify selectors by using one of the following formats: parameter_name:version parameter_name:label
    */
  var Selector: js.UndefOr[PSParameterSelector] = js.native
  /**
    * Applies to parameters that reference information in other AWS services. SourceResult is the raw result or response from the source.
    */
  var SourceResult: js.UndefOr[String] = js.native
  /**
    * The type of parameter. Valid values include the following: String, StringList, and SecureString.
    */
  var Type: js.UndefOr[ParameterType] = js.native
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[PSParameterValue] = js.native
  /**
    * The parameter version.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.native
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
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    @scala.inline
    def setDataType(value: ParameterDataType): Self = this.set("DataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("DataType", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: DateTime): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setName(value: PSParameterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSelector(value: PSParameterSelector): Self = this.set("Selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("Selector", js.undefined)
    @scala.inline
    def setSourceResult(value: String): Self = this.set("SourceResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceResult: Self = this.set("SourceResult", js.undefined)
    @scala.inline
    def setType(value: ParameterType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setValue(value: PSParameterValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
    @scala.inline
    def setVersion(value: PSParameterVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

