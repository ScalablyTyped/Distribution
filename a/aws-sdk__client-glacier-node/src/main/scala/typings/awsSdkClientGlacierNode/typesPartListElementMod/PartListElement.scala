package typings.awsSdkClientGlacierNode.typesPartListElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartListElement extends js.Object {
  /**
    * <p>The byte range of a part, inclusive of the upper value of the range.</p>
    */
  var RangeInBytes: js.UndefOr[String] = js.native
  /**
    * <p>The SHA256 tree hash value that Amazon Glacier calculated for the part. This field is never <code>null</code>.</p>
    */
  var SHA256TreeHash: js.UndefOr[String] = js.native
}

object PartListElement {
  @scala.inline
  def apply(): PartListElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartListElement]
  }
  @scala.inline
  implicit class PartListElementOps[Self <: PartListElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRangeInBytes(value: String): Self = this.set("RangeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeInBytes: Self = this.set("RangeInBytes", js.undefined)
    @scala.inline
    def setSHA256TreeHash(value: String): Self = this.set("SHA256TreeHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSHA256TreeHash: Self = this.set("SHA256TreeHash", js.undefined)
  }
  
}

