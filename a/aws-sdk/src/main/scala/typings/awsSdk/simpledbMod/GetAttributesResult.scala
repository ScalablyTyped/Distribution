package typings.awsSdk.simpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAttributesResult extends js.Object {
  /**
    * The list of attributes returned by the operation.
    */
  var Attributes: js.UndefOr[AttributeList] = js.native
}

object GetAttributesResult {
  @scala.inline
  def apply(Attributes: AttributeList = null): GetAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAttributesResult]
  }
}

