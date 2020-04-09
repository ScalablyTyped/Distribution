package typings.brainhubeuReactCarousel.mod

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselProps extends js.Object {
  var addArrowClickHandler: js.UndefOr[Boolean] = js.undefined
  var animationSpeed: js.UndefOr[Double] = js.undefined
  var arrowLeft: js.UndefOr[Element] = js.undefined
  var arrowRight: js.UndefOr[Element] = js.undefined
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
    animationSpeed: Int | Double = null,
    arrowLeft: Element = null,
    arrowRight: Element = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    autoPlay: Int | Double = null,
    breakpoints: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    clickToChange: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    itemWidth: Int | Double = null,
    keepDirectionWhenDragging: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    onChange: /* value */ Double => Unit = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    slides: js.Array[Element] = null,
    slidesPerPage: Int | Double = null,
    slidesPerScroll: Int | Double = null,
    stopAutoPlayOnHover: js.UndefOr[Boolean] = js.undefined,
    value: Int | Double = null
  ): CarouselProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addArrowClickHandler)) __obj.updateDynamic("addArrowClickHandler")(addArrowClickHandler.asInstanceOf[js.Any])
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (arrowLeft != null) __obj.updateDynamic("arrowLeft")(arrowLeft.asInstanceOf[js.Any])
    if (arrowRight != null) __obj.updateDynamic("arrowRight")(arrowRight.asInstanceOf[js.Any])
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (autoPlay != null) __obj.updateDynamic("autoPlay")(autoPlay.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (!js.isUndefined(clickToChange)) __obj.updateDynamic("clickToChange")(clickToChange.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.asInstanceOf[js.Any])
    if (itemWidth != null) __obj.updateDynamic("itemWidth")(itemWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(keepDirectionWhenDragging)) __obj.updateDynamic("keepDirectionWhenDragging")(keepDirectionWhenDragging.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (slides != null) __obj.updateDynamic("slides")(slides.asInstanceOf[js.Any])
    if (slidesPerPage != null) __obj.updateDynamic("slidesPerPage")(slidesPerPage.asInstanceOf[js.Any])
    if (slidesPerScroll != null) __obj.updateDynamic("slidesPerScroll")(slidesPerScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAutoPlayOnHover)) __obj.updateDynamic("stopAutoPlayOnHover")(stopAutoPlayOnHover.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselProps]
  }
}

