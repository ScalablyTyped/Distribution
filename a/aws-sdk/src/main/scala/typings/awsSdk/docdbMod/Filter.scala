package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * The name of the filter. Filter names are case sensitive.
    */
  var Name: String = js.native
  /**
    * One or more filter values. Filter values are case sensitive.
    */
  var Values: FilterValueList = js.native
}

object Filter {
  @scala.inline
  def apply(Name: String, Values: FilterValueList): Filter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Filter]
  }
}

