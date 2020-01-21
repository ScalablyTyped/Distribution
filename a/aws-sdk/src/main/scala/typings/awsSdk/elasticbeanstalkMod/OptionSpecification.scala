package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionSpecification extends js.Object {
  /**
    * A unique namespace identifying the option's associated AWS resource.
    */
  var Namespace: js.UndefOr[OptionNamespace] = js.native
  /**
    * The name of the configuration option.
    */
  var OptionName: js.UndefOr[ConfigurationOptionName] = js.native
  /**
    * A unique resource name for a time-based scaling configuration option.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ResourceName] = js.native
}

object OptionSpecification {
  @scala.inline
  def apply(
    Namespace: OptionNamespace = null,
    OptionName: ConfigurationOptionName = null,
    ResourceName: ResourceName = null
  ): OptionSpecification = {
    val __obj = js.Dynamic.literal()
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace.asInstanceOf[js.Any])
    if (OptionName != null) __obj.updateDynamic("OptionName")(OptionName.asInstanceOf[js.Any])
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionSpecification]
  }
}

