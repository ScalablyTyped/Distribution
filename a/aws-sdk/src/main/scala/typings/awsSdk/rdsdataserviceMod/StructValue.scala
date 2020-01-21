package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StructValue extends js.Object {
  /**
    * The attributes returned in the record.
    */
  var attributes: js.UndefOr[ArrayValueList] = js.native
}

object StructValue {
  @scala.inline
  def apply(attributes: ArrayValueList = null): StructValue = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructValue]
  }
}

