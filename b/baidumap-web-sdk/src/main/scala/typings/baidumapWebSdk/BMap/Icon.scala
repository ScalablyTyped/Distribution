package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends Overlay {
  var anchor: Size
  var imageOffset: Size
  var imageSize: Size
  var imageUrl: Size
  var infoWindowAnchor: Size
  var printImageUrl: String
  var size: Size
  def setAnchor(anchor: Size): Unit
  def setImageOffset(offset: Size): Unit
  def setImageSize(offset: Size): Unit
  def setImageUrl(imageUrl: String): Unit
  def setInfoWindowAnchor(anchor: Size): Unit
  def setPrintImageUrl(url: String): Unit
  def setSize(size: Size): Unit
}

object Icon {
  @scala.inline
  def apply(
    anchor: Size,
    imageOffset: Size,
    imageSize: Size,
    imageUrl: Size,
    infoWindowAnchor: Size,
    printImageUrl: String,
    setAnchor: Size => Unit,
    setImageOffset: Size => Unit,
    setImageSize: Size => Unit,
    setImageUrl: String => Unit,
    setInfoWindowAnchor: Size => Unit,
    setPrintImageUrl: String => Unit,
    setSize: Size => Unit,
    size: Size,
    draw: () => Unit = null,
    hide: () => Unit = null,
    initialize: /* map */ Map => HTMLElement = null,
    isVisible: () => Boolean = null,
    show: () => Unit = null
  ): Icon = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], imageOffset = imageOffset.asInstanceOf[js.Any], imageSize = imageSize.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], infoWindowAnchor = infoWindowAnchor.asInstanceOf[js.Any], printImageUrl = printImageUrl.asInstanceOf[js.Any], setAnchor = js.Any.fromFunction1(setAnchor), setImageOffset = js.Any.fromFunction1(setImageOffset), setImageSize = js.Any.fromFunction1(setImageSize), setImageUrl = js.Any.fromFunction1(setImageUrl), setInfoWindowAnchor = js.Any.fromFunction1(setInfoWindowAnchor), setPrintImageUrl = js.Any.fromFunction1(setPrintImageUrl), setSize = js.Any.fromFunction1(setSize), size = size.asInstanceOf[js.Any])
    if (draw != null) __obj.updateDynamic("draw")(js.Any.fromFunction0(draw))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1(initialize))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction0(isVisible))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    __obj.asInstanceOf[Icon]
  }
}

