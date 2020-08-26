package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResult extends js.Object {
  /**
    * Values for fields generated during the request.
    */
  var generatedFields: js.UndefOr[FieldList] = js.native
}

object UpdateResult {
  @scala.inline
  def apply(): UpdateResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateResult]
  }
  @scala.inline
  implicit class UpdateResultOps[Self <: UpdateResult] (val x: Self) extends AnyVal {
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
    def setGeneratedFieldsVarargs(value: Field*): Self = this.set("generatedFields", js.Array(value :_*))
    @scala.inline
    def setGeneratedFields(value: FieldList): Self = this.set("generatedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneratedFields: Self = this.set("generatedFields", js.undefined)
  }
  
}

