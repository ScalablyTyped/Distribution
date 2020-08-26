package typings.brainhubeuReactCarousel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotsProps extends js.Object {
  var number: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var thumbnails: js.UndefOr[js.Array[ImgProps]] = js.native
  var value: js.UndefOr[Double] = js.native
}

object DotsProps {
  @scala.inline
  def apply(): DotsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DotsProps]
  }
  @scala.inline
  implicit class DotsPropsOps[Self <: DotsProps] (val x: Self) extends AnyVal {
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
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setThumbnailsVarargs(value: ImgProps*): Self = this.set("thumbnails", js.Array(value :_*))
    @scala.inline
    def setThumbnails(value: js.Array[ImgProps]): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

