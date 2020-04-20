package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultRowValue extends js.Object {
  /**
    * The friendly name of the metric whose value is specified by the Value property.
    */
  var Key: string = js.native
  /**
    * The data type of the value specified by the Value property.
    */
  var Type: string = js.native
  /**
    * In a Values object, the value for the metric that the query retrieved data for. In a GroupedBys object, the value for the field that was used to group data in a result set that contains multiple results (Values objects).
    */
  var Value: string = js.native
}

object ResultRowValue {
  @scala.inline
  def apply(Key: string, Type: string, Value: string): ResultRowValue = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultRowValue]
  }
}

