package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceNameAndResourceType extends js.Object {
  /**
    * The shareable resource types.
    */
  var resourceType: js.UndefOr[String] = js.native
  /**
    * The name of the AWS services to which the resources belong.
    */
  var serviceName: js.UndefOr[String] = js.native
}

object ServiceNameAndResourceType {
  @scala.inline
  def apply(resourceType: String = null, serviceName: String = null): ServiceNameAndResourceType = {
    val __obj = js.Dynamic.literal()
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNameAndResourceType]
  }
}

