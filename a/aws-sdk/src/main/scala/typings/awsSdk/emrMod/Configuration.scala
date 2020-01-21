package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configuration extends js.Object {
  /**
    * The classification within a configuration.
    */
  var Classification: js.UndefOr[String] = js.native
  /**
    * A list of additional configurations to apply within a configuration object.
    */
  var Configurations: js.UndefOr[ConfigurationList] = js.native
  /**
    * A set of properties specified within a configuration classification.
    */
  var Properties: js.UndefOr[StringMap] = js.native
}

object Configuration {
  @scala.inline
  def apply(
    Classification: String = null,
    Configurations: ConfigurationList = null,
    Properties: StringMap = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (Classification != null) __obj.updateDynamic("Classification")(Classification.asInstanceOf[js.Any])
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (Properties != null) __obj.updateDynamic("Properties")(Properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

