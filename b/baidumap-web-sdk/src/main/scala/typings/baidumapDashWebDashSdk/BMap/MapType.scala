package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.MapType")
@js.native
class MapType protected () extends js.Object {
  def this(name: String, layers: js.Array[TileLayer]) = this()
  def this(name: String, layers: TileLayer) = this()
  def this(name: String, layers: js.Array[TileLayer], opts: MapTypeOptions) = this()
  def this(name: String, layers: TileLayer, opts: MapTypeOptions) = this()
  def getMaxZoom(): Double = js.native
  def getMinZoom(): Double = js.native
  def getName(): String = js.native
  def getProjection(): Projection = js.native
  def getTextColor(): String = js.native
  def getTileLayer(): TileLayer = js.native
  def getTips(): String = js.native
}

