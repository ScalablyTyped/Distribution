package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyRange extends js.Object {
  /**
    * The key that starts an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
    */
  var BeginMarker: js.UndefOr[String] = js.native
  /**
    * The key that ends an optional key range for an export job. Ranges are inclusive and UTF-8 binary sorted.
    */
  var EndMarker: js.UndefOr[String] = js.native
}

object KeyRange {
  @scala.inline
  def apply(): KeyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRange]
  }
  @scala.inline
  implicit class KeyRangeOps[Self <: KeyRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeginMarker(value: String): Self = this.set("BeginMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginMarker: Self = this.set("BeginMarker", js.undefined)
    @scala.inline
    def setEndMarker(value: String): Self = this.set("EndMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndMarker: Self = this.set("EndMarker", js.undefined)
  }
  
}

