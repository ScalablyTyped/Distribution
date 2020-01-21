package typings.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypedLinkAttributeRange extends js.Object {
  /**
    * The unique name of the typed link attribute.
    */
  var AttributeName: js.UndefOr[typings.awsSdk.clouddirectoryMod.AttributeName] = js.native
  /**
    * The range of attribute values that are being selected.
    */
  var Range: TypedAttributeValueRange = js.native
}

object TypedLinkAttributeRange {
  @scala.inline
  def apply(Range: TypedAttributeValueRange, AttributeName: AttributeName = null): TypedLinkAttributeRange = {
    val __obj = js.Dynamic.literal(Range = Range.asInstanceOf[js.Any])
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypedLinkAttributeRange]
  }
}

