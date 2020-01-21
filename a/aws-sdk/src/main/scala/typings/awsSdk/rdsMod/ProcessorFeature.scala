package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessorFeature extends js.Object {
  /**
    * The name of the processor feature. Valid names are coreCount and threadsPerCore.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The value of a processor feature name.
    */
  var Value: js.UndefOr[String] = js.native
}

object ProcessorFeature {
  @scala.inline
  def apply(Name: String = null, Value: String = null): ProcessorFeature = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessorFeature]
  }
}

