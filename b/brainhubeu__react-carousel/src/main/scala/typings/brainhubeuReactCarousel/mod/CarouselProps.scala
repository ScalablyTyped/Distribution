package typings.brainhubeuReactCarousel.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselProps extends js.Object {
  var addArrowClickHandler: js.UndefOr[Boolean] = js.native
  var animationSpeed: js.UndefOr[Double] = js.native
  var arrowLeft: js.UndefOr[Element] = js.native
  var arrowLeftDisabled: js.UndefOr[Element] = js.native
  var arrowRight: js.UndefOr[Element] = js.native
  var arrowRightDisabled: js.UndefOr[Element] = js.native
  var arrows: js.UndefOr[Boolean] = js.native
  var autoPlay: js.UndefOr[Double] = js.native
  var breakpoints: js.UndefOr[js.Any] = js.native
  var centered: js.UndefOr[Boolean] = js.native
  var clickToChange: js.UndefOr[Boolean] = js.native
  var dots: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var infinite: js.UndefOr[Boolean] = js.native
  var itemWidth: js.UndefOr[Double] = js.native
  var keepDirectionWhenDragging: js.UndefOr[Boolean] = js.native
  var minDraggableOffset: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var slides: js.UndefOr[js.Array[Element]] = js.native
  var slidesPerPage: js.UndefOr[Double] = js.native
  var slidesPerScroll: js.UndefOr[Double] = js.native
  var stopAutoPlayOnHover: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[Double] = js.native
}

object CarouselProps {
  @scala.inline
  def apply(): CarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselProps]
  }
  @scala.inline
  implicit class CarouselPropsOps[Self <: CarouselProps] (val x: Self) extends AnyVal {
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
    def setAddArrowClickHandler(value: Boolean): Self = this.set("addArrowClickHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddArrowClickHandler: Self = this.set("addArrowClickHandler", js.undefined)
    @scala.inline
    def setAnimationSpeed(value: Double): Self = this.set("animationSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationSpeed: Self = this.set("animationSpeed", js.undefined)
    @scala.inline
    def setArrowLeft(value: Element): Self = this.set("arrowLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowLeft: Self = this.set("arrowLeft", js.undefined)
    @scala.inline
    def setArrowLeftDisabled(value: Element): Self = this.set("arrowLeftDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowLeftDisabled: Self = this.set("arrowLeftDisabled", js.undefined)
    @scala.inline
    def setArrowRight(value: Element): Self = this.set("arrowRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowRight: Self = this.set("arrowRight", js.undefined)
    @scala.inline
    def setArrowRightDisabled(value: Element): Self = this.set("arrowRightDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowRightDisabled: Self = this.set("arrowRightDisabled", js.undefined)
    @scala.inline
    def setArrows(value: Boolean): Self = this.set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    @scala.inline
    def setAutoPlay(value: Double): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    @scala.inline
    def setBreakpoints(value: js.Any): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    @scala.inline
    def setCentered(value: Boolean): Self = this.set("centered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCentered: Self = this.set("centered", js.undefined)
    @scala.inline
    def setClickToChange(value: Boolean): Self = this.set("clickToChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickToChange: Self = this.set("clickToChange", js.undefined)
    @scala.inline
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    @scala.inline
    def setKeepDirectionWhenDragging(value: Boolean): Self = this.set("keepDirectionWhenDragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepDirectionWhenDragging: Self = this.set("keepDirectionWhenDragging", js.undefined)
    @scala.inline
    def setMinDraggableOffset(value: Double): Self = this.set("minDraggableOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDraggableOffset: Self = this.set("minDraggableOffset", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ Double => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setSlidesVarargs(value: Element*): Self = this.set("slides", js.Array(value :_*))
    @scala.inline
    def setSlides(value: js.Array[Element]): Self = this.set("slides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlides: Self = this.set("slides", js.undefined)
    @scala.inline
    def setSlidesPerPage(value: Double): Self = this.set("slidesPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesPerPage: Self = this.set("slidesPerPage", js.undefined)
    @scala.inline
    def setSlidesPerScroll(value: Double): Self = this.set("slidesPerScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesPerScroll: Self = this.set("slidesPerScroll", js.undefined)
    @scala.inline
    def setStopAutoPlayOnHover(value: Boolean): Self = this.set("stopAutoPlayOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopAutoPlayOnHover: Self = this.set("stopAutoPlayOnHover", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

