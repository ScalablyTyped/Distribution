package typings.awsSdkBuildTypes.customizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalDocumentation extends js.Object {
  /**
    * A documentation string to append to the general configuration property
    * documentation.
    */
  var additionalDocumentation: js.UndefOr[String] = js.native
}

object AdditionalDocumentation {
  @scala.inline
  def apply(): AdditionalDocumentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalDocumentation]
  }
  @scala.inline
  implicit class AdditionalDocumentationOps[Self <: AdditionalDocumentation] (val x: Self) extends AnyVal {
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
    def setAdditionalDocumentation(value: String): Self = this.set("additionalDocumentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalDocumentation: Self = this.set("additionalDocumentation", js.undefined)
  }
  
}

