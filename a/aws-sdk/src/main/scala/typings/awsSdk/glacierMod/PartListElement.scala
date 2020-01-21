package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartListElement extends js.Object {
  /**
    * The byte range of a part, inclusive of the upper value of the range.
    */
  var RangeInBytes: js.UndefOr[String] = js.native
  /**
    * The SHA256 tree hash value that Amazon S3 Glacier calculated for the part. This field is never null.
    */
  var SHA256TreeHash: js.UndefOr[String] = js.native
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

