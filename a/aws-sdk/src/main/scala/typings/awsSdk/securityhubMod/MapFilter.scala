package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapFilter extends js.Object {
  /**
    * The condition to apply to a key value when querying for findings with a map filter.
    */
  var Comparison: js.UndefOr[MapFilterComparison] = js.native
  /**
    * The key of the map filter.
    */
  var Key: js.UndefOr[NonEmptyString] = js.native
  /**
    * The value for the key in the map filter.
    */
  var Value: js.UndefOr[NonEmptyString] = js.native
}

object MapFilter {
  @scala.inline
  def apply(): MapFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapFilter]
  }
  @scala.inline
  implicit class MapFilterOps[Self <: MapFilter] (val x: Self) extends AnyVal {
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
    def setComparison(value: MapFilterComparison): Self = this.set("Comparison", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparison: Self = this.set("Comparison", js.undefined)
    @scala.inline
    def setKey(value: NonEmptyString): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setValue(value: NonEmptyString): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

