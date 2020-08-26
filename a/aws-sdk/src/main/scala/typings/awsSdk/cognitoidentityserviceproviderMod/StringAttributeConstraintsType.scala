package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringAttributeConstraintsType extends js.Object {
  /**
    * The maximum length.
    */
  var MaxLength: js.UndefOr[StringType] = js.native
  /**
    * The minimum length.
    */
  var MinLength: js.UndefOr[StringType] = js.native
}

object StringAttributeConstraintsType {
  @scala.inline
  def apply(): StringAttributeConstraintsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringAttributeConstraintsType]
  }
  @scala.inline
  implicit class StringAttributeConstraintsTypeOps[Self <: StringAttributeConstraintsType] (val x: Self) extends AnyVal {
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
    def setMaxLength(value: StringType): Self = this.set("MaxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("MaxLength", js.undefined)
    @scala.inline
    def setMinLength(value: StringType): Self = this.set("MinLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("MinLength", js.undefined)
  }
  
}

