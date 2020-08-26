package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Export extends js.Object {
  /**
    * The stack that contains the exported output name and value.
    */
  var ExportingStackId: js.UndefOr[StackId] = js.native
  /**
    * The name of exported output value. Use this name and the Fn::ImportValue function to import the associated value into other stacks. The name is defined in the Export field in the associated stack's Outputs section.
    */
  var Name: js.UndefOr[ExportName] = js.native
  /**
    * The value of the exported output, such as a resource physical ID. This value is defined in the Export field in the associated stack's Outputs section.
    */
  var Value: js.UndefOr[ExportValue] = js.native
}

object Export {
  @scala.inline
  def apply(): Export = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Export]
  }
  @scala.inline
  implicit class ExportOps[Self <: Export] (val x: Self) extends AnyVal {
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
    def setExportingStackId(value: StackId): Self = this.set("ExportingStackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportingStackId: Self = this.set("ExportingStackId", js.undefined)
    @scala.inline
    def setName(value: ExportName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setValue(value: ExportValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

