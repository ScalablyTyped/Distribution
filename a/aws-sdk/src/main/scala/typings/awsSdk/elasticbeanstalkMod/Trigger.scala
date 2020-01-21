package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trigger extends js.Object {
  /**
    * The name of the trigger.
    */
  var Name: js.UndefOr[ResourceId] = js.native
}

object Trigger {
  @scala.inline
  def apply(Name: ResourceId = null): Trigger = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
}

