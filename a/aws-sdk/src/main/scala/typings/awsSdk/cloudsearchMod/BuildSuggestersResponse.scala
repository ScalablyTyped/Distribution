package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildSuggestersResponse extends js.Object {
  var FieldNames: js.UndefOr[FieldNameList] = js.native
}

object BuildSuggestersResponse {
  @scala.inline
  def apply(): BuildSuggestersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildSuggestersResponse]
  }
  @scala.inline
  implicit class BuildSuggestersResponseOps[Self <: BuildSuggestersResponse] (val x: Self) extends AnyVal {
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

