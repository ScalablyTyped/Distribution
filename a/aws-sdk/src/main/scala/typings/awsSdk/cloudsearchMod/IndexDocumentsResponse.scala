package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexDocumentsResponse extends js.Object {
  /**
    * The names of the fields that are currently being indexed.
    */
  var FieldNames: js.UndefOr[FieldNameList] = js.native
}

object IndexDocumentsResponse {
  @scala.inline
  def apply(): IndexDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexDocumentsResponse]
  }
  @scala.inline
  implicit class IndexDocumentsResponseOps[Self <: IndexDocumentsResponse] (val x: Self) extends AnyVal {
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
    def setFieldNamesVarargs(value: FieldName*): Self = this.set("FieldNames", js.Array(value :_*))
    @scala.inline
    def setFieldNames(value: FieldNameList): Self = this.set("FieldNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldNames: Self = this.set("FieldNames", js.undefined)
  }
  
}

