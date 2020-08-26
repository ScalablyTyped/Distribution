package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsResultAttribute extends js.Object {
  /**
    * Name of the data type. Valid value: AWS:OpsItem, AWS:EC2InstanceInformation, AWS:OpsItemTrendline, or AWS:ComplianceSummary.
    */
  var TypeName: OpsDataTypeName = js.native
}

object OpsResultAttribute {
  @scala.inline
  def apply(TypeName: OpsDataTypeName): OpsResultAttribute = {
    val __obj = js.Dynamic.literal(TypeName = TypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsResultAttribute]
  }
  @scala.inline
  implicit class OpsResultAttributeOps[Self <: OpsResultAttribute] (val x: Self) extends AnyVal {
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
    def setTypeName(value: OpsDataTypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
  }
  
}

