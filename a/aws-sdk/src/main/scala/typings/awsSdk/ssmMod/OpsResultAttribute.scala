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
}

