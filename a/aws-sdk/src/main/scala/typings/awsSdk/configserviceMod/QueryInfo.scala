package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryInfo extends js.Object {
  /**
    * Returns a FieldInfo object.
    */
  var SelectFields: js.UndefOr[FieldInfoList] = js.native
}

object QueryInfo {
  @scala.inline
  def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  @scala.inline
  implicit class QueryInfoOps[Self <: QueryInfo] (val x: Self) extends AnyVal {
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
    def setSelectFieldsVarargs(value: FieldInfo*): Self = this.set("SelectFields", js.Array(value :_*))
    @scala.inline
    def setSelectFields(value: FieldInfoList): Self = this.set("SelectFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectFields: Self = this.set("SelectFields", js.undefined)
  }
  
}

