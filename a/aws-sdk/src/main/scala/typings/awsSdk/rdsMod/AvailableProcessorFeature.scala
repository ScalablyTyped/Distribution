package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailableProcessorFeature extends js.Object {
  /**
    * The allowed values for the processor feature of the DB instance class.
    */
  var AllowedValues: js.UndefOr[String] = js.native
  /**
    * The default value for the processor feature of the DB instance class.
    */
  var DefaultValue: js.UndefOr[String] = js.native
  /**
    * The name of the processor feature. Valid names are coreCount and threadsPerCore.
    */
  var Name: js.UndefOr[String] = js.native
}

object AvailableProcessorFeature {
  @scala.inline
  def apply(AllowedValues: String = null, DefaultValue: String = null, Name: String = null): AvailableProcessorFeature = {
    val __obj = js.Dynamic.literal()
    if (AllowedValues != null) __obj.updateDynamic("AllowedValues")(AllowedValues.asInstanceOf[js.Any])
    if (DefaultValue != null) __obj.updateDynamic("DefaultValue")(DefaultValue.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableProcessorFeature]
  }
}

