package typings.d3pie.anon

import typings.d3pie.d3pie.ID3PieTextOptions
import typings.d3pie.d3pieStrings.`pie-center`
import typings.d3pie.d3pieStrings.`top-center`
import typings.d3pie.d3pieStrings.`top-left`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  var location: js.UndefOr[`top-center` | `top-left` | `pie-center`] = js.native
  var subtitle: js.UndefOr[ID3PieTextOptions] = js.native
  var title: js.UndefOr[ID3PieTextOptions] = js.native
  var titleSubtitlePadding: js.UndefOr[Double] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setLocation(value: `top-center` | `top-left` | `pie-center`): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setSubtitle(value: ID3PieTextOptions): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: ID3PieTextOptions): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleSubtitlePadding(value: Double): Self = this.set("titleSubtitlePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleSubtitlePadding: Self = this.set("titleSubtitlePadding", js.undefined)
  }
  
}

