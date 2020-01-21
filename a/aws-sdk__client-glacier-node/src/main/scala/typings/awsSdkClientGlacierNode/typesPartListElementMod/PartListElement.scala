package typings.awsSdkClientGlacierNode.typesPartListElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartListElement extends js.Object {
  /**
    * <p>The byte range of a part, inclusive of the upper value of the range.</p>
    */
  var RangeInBytes: js.UndefOr[String] = js.undefined
  /**
    * <p>The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never <code>null</code>.</p>
    */
  var SHA256TreeHash: js.UndefOr[String] = js.undefined
}

object PartListElement {
  @scala.inline
  def apply(RangeInBytes: String = null, SHA256TreeHash: String = null): PartListElement = {
    val __obj = js.Dynamic.literal()
    if (RangeInBytes != null) __obj.updateDynamic("RangeInBytes")(RangeInBytes.asInstanceOf[js.Any])
    if (SHA256TreeHash != null) __obj.updateDynamic("SHA256TreeHash")(SHA256TreeHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartListElement]
  }
}

