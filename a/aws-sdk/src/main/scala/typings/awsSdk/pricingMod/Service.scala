package typings.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * The attributes that are available for this service.
    */
  var AttributeNames: js.UndefOr[AttributeNameList] = js.native
  /**
    * The code for the AWS service.
    */
  var ServiceCode: js.UndefOr[String] = js.native
}

object Service {
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setServiceCode(value: String): Self = this.set("ServiceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCode: Self = this.set("ServiceCode", js.undefined)
  }
  
}

