package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Input extends js.Object {
  /**
    * Information about the configuration of an input.
    */
  var inputConfiguration: js.UndefOr[InputConfiguration] = js.native
  /**
    * The definition of the input.
    */
  var inputDefinition: js.UndefOr[InputDefinition] = js.native
}

object Input {
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  @scala.inline
  implicit class InputOps[Self <: Input] (val x: Self) extends AnyVal {
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
    def setInputConfiguration(value: InputConfiguration): Self = this.set("inputConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputConfiguration: Self = this.set("inputConfiguration", js.undefined)
    @scala.inline
    def setInputDefinition(value: InputDefinition): Self = this.set("inputDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDefinition: Self = this.set("inputDefinition", js.undefined)
  }
  
}

