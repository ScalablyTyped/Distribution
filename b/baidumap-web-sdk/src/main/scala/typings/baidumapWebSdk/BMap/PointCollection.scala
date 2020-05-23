package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Type
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCollection extends Overlay {
  def clear(): Unit
  def onclick(event: Type): Unit
  def onmouseout(event: Type): Unit
  def onmouseover(event: Type): Unit
  def setPoints(points: js.Array[Point]): Unit
  def setStyles(styles: PointCollectionOption): Unit
}

object PointCollection {
  @scala.inline
  def apply(
    clear: () => Unit,
    onclick: Type => Unit,
    onmouseout: Type => Unit,
    onmouseover: Type => Unit,
    setPoints: js.Array[Point] => Unit,
    setStyles: PointCollectionOption => Unit,
    draw: () => Unit = null,
    hide: () => Unit = null,
    initialize: /* map */ Map => HTMLElement = null,
    isVisible: () => Boolean = null,
    show: () => Unit = null
  ): PointCollection = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), onclick = js.Any.fromFunction1(onclick), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), setPoints = js.Any.fromFunction1(setPoints), setStyles = js.Any.fromFunction1(setStyles))
    if (draw != null) __obj.updateDynamic("draw")(js.Any.fromFunction0(draw))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1(initialize))
    if (isVisible != null) __obj.updateDynamic("isVisible")(js.Any.fromFunction0(isVisible))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    __obj.asInstanceOf[PointCollection]
  }
}

