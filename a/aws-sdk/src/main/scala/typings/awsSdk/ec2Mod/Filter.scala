package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * The name of the filter. Filter names are case-sensitive.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The filter values. Filter values are case-sensitive.
    */
  var Values: js.UndefOr[ValueStringList] = js.native
}

object Filter {
  @scala.inline
  def apply(Name: String = null, Values: ValueStringList = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

