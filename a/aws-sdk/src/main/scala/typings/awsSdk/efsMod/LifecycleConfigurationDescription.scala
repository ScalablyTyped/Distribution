package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleConfigurationDescription extends js.Object {
  /**
    * An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file system.
    */
  var LifecyclePolicies: js.UndefOr[typings.awsSdk.efsMod.LifecyclePolicies] = js.native
}

object LifecycleConfigurationDescription {
  @scala.inline
  def apply(LifecyclePolicies: LifecyclePolicies = null): LifecycleConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    if (LifecyclePolicies != null) __obj.updateDynamic("LifecyclePolicies")(LifecyclePolicies.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleConfigurationDescription]
  }
}

