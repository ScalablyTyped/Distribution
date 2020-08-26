package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentKeyValuesFilter extends js.Object {
  /**
    * The name of the filter key.
    */
  var Key: js.UndefOr[DocumentKeyValuesFilterKey] = js.native
  /**
    * The value for the filter key.
    */
  var Values: js.UndefOr[DocumentKeyValuesFilterValues] = js.native
}

object DocumentKeyValuesFilter {
  @scala.inline
  def apply(): DocumentKeyValuesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentKeyValuesFilter]
  }
  @scala.inline
  implicit class DocumentKeyValuesFilterOps[Self <: DocumentKeyValuesFilter] (val x: Self) extends AnyVal {
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
    def setKey(value: DocumentKeyValuesFilterKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setValuesVarargs(value: DocumentKeyValuesFilterValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: DocumentKeyValuesFilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
  
}

