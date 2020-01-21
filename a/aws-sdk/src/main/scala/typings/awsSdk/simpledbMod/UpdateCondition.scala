package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCondition extends js.Object {
  /**
    * A value specifying whether or not the specified attribute must exist with the specified value in order for the update condition to be satisfied. Specify true if the attribute must exist for the update condition to be satisfied. Specify false if the attribute should not exist in order for the update condition to be satisfied.
    */
  var Exists: js.UndefOr[Boolean] = js.native
  /**
    * The name of the attribute involved in the condition.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The value of an attribute. This value can only be specified when the Exists parameter is equal to true.
    */
  var Value: js.UndefOr[String] = js.native
}

object UpdateCondition {
  @scala.inline
  def apply(Exists: js.UndefOr[scala.Boolean] = js.undefined, Name: String = null, Value: String = null): UpdateCondition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Exists)) __obj.updateDynamic("Exists")(Exists.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCondition]
  }
}

