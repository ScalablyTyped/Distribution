package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectAttributesActivity extends js.Object {
  /**
    * A list of the attributes to select from the message.
    */
  var attributes: AttributeNames = js.native
  /**
    * The name of the 'selectAttributes' activity.
    */
  var name: ActivityName = js.native
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}

object SelectAttributesActivity {
  @scala.inline
  def apply(attributes: AttributeNames, name: ActivityName, next: ActivityName = null): SelectAttributesActivity = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectAttributesActivity]
  }
}

