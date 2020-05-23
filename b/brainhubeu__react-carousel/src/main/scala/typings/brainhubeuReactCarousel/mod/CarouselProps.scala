package typings.brainhubeuReactCarousel.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends js.Object {
  var addArrowClickHandler: js.UndefOr[Boolean] = js.undefined
  var animationSpeed: js.UndefOr[Double] = js.undefined
  var arrowLeft: js.UndefOr[Element] = js.undefined
  var arrowLeftDisabled: js.UndefOr[Element] = js.undefined
  var arrowRight: js.UndefOr[Element] = js.undefined
  var arrowRightDisabled: js.UndefOr[Element] = js.undefined
  var arrows: js.UndefOr[Boolean] = js.undefined
  var autoPlay: js.UndefOr[Double] = js.undefined
  var breakpoints: js.UndefOr[js.Any] = js.undefined
  var centered: js.UndefOr[Boolean] = js.undefined
  var clickToChange: js.UndefOr[Boolean] = js.undefined
  var dots: js.UndefOr[Boolean] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var infinite: js.UndefOr[Boolean] = js.undefined
  var itemWidth: js.UndefOr[Double] = js.undefined
  var keepDirectionWhenDragging: js.UndefOr[Boolean] = js.undefined
  var minDraggableOffset: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var slides: js.UndefOr[js.Array[Element]] = js.undefined
  var slidesPerPage: js.UndefOr[Double] = js.undefined
  var slidesPerScroll: js.UndefOr[Double] = js.undefined
  var stopAutoPlayOnHover: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object CarouselProps {
  @scala.inline
  def apply(
    addArrowClickHandler: js.UndefOr[Boolean] = js.undefined,
    animationSpeed: js.UndefOr[Double] = js.undefined,
    arrowLeft: Element = null,
    arrowLeftDisabled: Element = null,
    arrowRight: Element = null,
    arrowRightDisabled: Element = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    autoPlay: js.UndefOr[Double] = js.undefined,
    breakpoints: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    clickToChange: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    itemWidth: js.UndefOr[Double] = js.undefined,
    keepDirectionWhenDragging: js.UndefOr[Boolean] = js.undefined,
    minDraggableOffset: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    onChange: /* value */ Double => Unit = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    slides: js.Array[Element] = null,
    slidesPerPage: js.UndefOr[Double] = js.undefined,
    slidesPerScroll: js.UndefOr[Double] = js.undefined,
    stopAutoPlayOnHover: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addArrowClickHandler)) __obj.updateDynamic("addArrowClickHandler")(addArrowClickHandler.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationSpeed)) __obj.updateDynamic("animationSpeed")(animationSpeed.get.asInstanceOf[js.Any])
    if (arrowLeft != null) __obj.updateDynamic("arrowLeft")(arrowLeft.asInstanceOf[js.Any])
    if (arrowLeftDisabled != null) __obj.updateDynamic("arrowLeftDisabled")(arrowLeftDisabled.asInstanceOf[js.Any])
    if (arrowRight != null) __obj.updateDynamic("arrowRight")(arrowRight.asInstanceOf[js.Any])
    if (arrowRightDisabled != null) __obj.updateDynamic("arrowRightDisabled")(arrowRightDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay.get.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToChange)) __obj.updateDynamic("clickToChange")(clickToChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(itemWidth)) __obj.updateDynamic("itemWidth")(itemWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepDirectionWhenDragging)) __obj.updateDynamic("keepDirectionWhenDragging")(keepDirectionWhenDragging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDraggableOffset)) __obj.updateDynamic("minDraggableOffset")(minDraggableOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (slides != null) __obj.updateDynamic("slides")(slides.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesPerPage)) __obj.updateDynamic("slidesPerPage")(slidesPerPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesPerScroll)) __obj.updateDynamic("slidesPerScroll")(slidesPerScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAutoPlayOnHover)) __obj.updateDynamic("stopAutoPlayOnHover")(stopAutoPlayOnHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselProps]
  }
}

