package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterActivity extends js.Object {
  /**
    * An expression that looks like a SQL WHERE clause that must return a Boolean value.
    */
  var filter: FilterExpression = js.native
  /**
    * The name of the 'filter' activity.
    */
  var name: ActivityName = js.native
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}

object FilterActivity {
  @scala.inline
  def apply(filter: FilterExpression, name: ActivityName, next: ActivityName = null): FilterActivity = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterActivity]
  }
}

