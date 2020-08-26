package typings.baseui.ratingMod

import typings.baseui.anon.ValueNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StarRatingProps extends js.Object {
  var numItems: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[js.Function1[/* args */ ValueNumber, _]] = js.native
  var overrides: js.UndefOr[RatingOverrides] = js.native
  var size: js.UndefOr[Double] = js.native
  var value: js.UndefOr[Double] = js.native
}

object StarRatingProps {
  @scala.inline
  def apply(): StarRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StarRatingProps]
  }
  @scala.inline
  implicit class StarRatingPropsOps[Self <: StarRatingProps] (val x: Self) extends AnyVal {
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
    def setNumItems(value: Double): Self = this.set("numItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumItems: Self = this.set("numItems", js.undefined)
    @scala.inline
    def setOnChange(value: /* args */ ValueNumber => _): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOverrides(value: RatingOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

