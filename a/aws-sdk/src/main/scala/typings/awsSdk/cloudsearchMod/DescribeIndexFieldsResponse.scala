package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIndexFieldsResponse extends js.Object {
  /**
    * The index fields configured for the domain.
    */
  var IndexFields: IndexFieldStatusList = js.native
}

object DescribeIndexFieldsResponse {
  @scala.inline
  def apply(IndexFields: IndexFieldStatusList): DescribeIndexFieldsResponse = {
    val __obj = js.Dynamic.literal(IndexFields = IndexFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexFieldsResponse]
  }
  @scala.inline
  implicit class DescribeIndexFieldsResponseOps[Self <: DescribeIndexFieldsResponse] (val x: Self) extends AnyVal {
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
    def setIndexFieldsVarargs(value: IndexFieldStatus*): Self = this.set("IndexFields", js.Array(value :_*))
    @scala.inline
    def setIndexFields(value: IndexFieldStatusList): Self = this.set("IndexFields", value.asInstanceOf[js.Any])
  }
  
}

