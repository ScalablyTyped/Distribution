package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    *  Specifies the name of the filter. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    *  Contains one or more values for the filter. 
    */
  var Values: js.UndefOr[ValueStringList] = js.native
}

object Filter {
  @scala.inline
  def apply(Name: NonEmptyString = null, Values: ValueStringList = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

