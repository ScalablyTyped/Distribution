package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagOptionSummary extends js.Object {
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.native
  /**
    * The TagOption value.
    */
  var Values: js.UndefOr[TagOptionValues] = js.native
}

object TagOptionSummary {
  @scala.inline
  def apply(): TagOptionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOptionSummary]
  }
  @scala.inline
  implicit class TagOptionSummaryOps[Self <: TagOptionSummary] (val x: Self) extends AnyVal {
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
    def setKey(value: TagOptionKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setValuesVarargs(value: TagOptionValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: TagOptionValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
  
}

