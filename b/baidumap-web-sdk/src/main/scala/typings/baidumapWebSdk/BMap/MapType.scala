package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapType extends js.Object {
  def getMaxZoom(): Double
  def getMinZoom(): Double
  def getName(): String
  def getProjection(): Projection
  def getTextColor(): String
  def getTileLayer(): TileLayer
  def getTips(): String
}

object MapType {
  @scala.inline
  def apply(
    getMaxZoom: () => Double,
    getMinZoom: () => Double,
    getName: () => String,
    getProjection: () => Projection,
    getTextColor: () => String,
    getTileLayer: () => TileLayer,
    getTips: () => String
  ): MapType = {
    val __obj = js.Dynamic.literal(getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getName = js.Any.fromFunction0(getName), getProjection = js.Any.fromFunction0(getProjection), getTextColor = js.Any.fromFunction0(getTextColor), getTileLayer = js.Any.fromFunction0(getTileLayer), getTips = js.Any.fromFunction0(getTips))
    __obj.asInstanceOf[MapType]
  }
}

