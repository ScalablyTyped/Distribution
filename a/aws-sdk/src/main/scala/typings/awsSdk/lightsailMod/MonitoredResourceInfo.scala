package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonitoredResourceInfo extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource being monitored.
    */
  var arn: js.UndefOr[ResourceArn] = js.native
  /**
    * The name of the Lightsail resource being monitored.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The Lightsail resource type of the resource being monitored. Instances, load balancers, and relational databases are the only Lightsail resources that can currently be monitored by alarms.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object MonitoredResourceInfo {
  @scala.inline
  def apply(arn: ResourceArn = null, name: ResourceName = null, resourceType: ResourceType = null): MonitoredResourceInfo = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoredResourceInfo]
  }
}

