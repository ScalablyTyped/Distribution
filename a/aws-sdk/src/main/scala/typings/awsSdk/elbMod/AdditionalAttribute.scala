package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalAttribute extends js.Object {
  /**
    * This parameter is reserved.
    */
  var Key: js.UndefOr[AdditionalAttributeKey] = js.native
  /**
    * This parameter is reserved.
    */
  var Value: js.UndefOr[AdditionalAttributeValue] = js.native
}

object AdditionalAttribute {
  @scala.inline
  def apply(): AdditionalAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalAttribute]
  }
  @scala.inline
  implicit class AdditionalAttributeOps[Self <: AdditionalAttribute] (val x: Self) extends AnyVal {
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
    def setKey(value: AdditionalAttributeKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setValue(value: AdditionalAttributeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

