package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAttributesMessage extends js.Object {
  /**
    * A list of attribute names.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.native
}

object DescribeAccountAttributesMessage {
  @scala.inline
  def apply(): DescribeAccountAttributesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesMessage]
  }
  @scala.inline
  implicit class DescribeAccountAttributesMessageOps[Self <: DescribeAccountAttributesMessage] (val x: Self) extends AnyVal {
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
    def setAttributeNamesVarargs(value: String*): Self = this.set("AttributeNames", js.Array(value :_*))
    @scala.inline
    def setAttributeNames(value: AttributeNameList): Self = this.set("AttributeNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeNames: Self = this.set("AttributeNames", js.undefined)
  }
  
}

