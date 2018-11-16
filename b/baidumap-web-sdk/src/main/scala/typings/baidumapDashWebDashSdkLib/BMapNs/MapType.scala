package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.MapType")
@js.native
class MapType protected () extends js.Object {
  def this(name: java.lang.String, layers: TileLayer) = this()
  def this(name: java.lang.String, layers: js.Array[TileLayer]) = this()
  def this(name: java.lang.String, layers: TileLayer, opts: MapTypeOptions) = this()
  def this(name: java.lang.String, layers: js.Array[TileLayer], opts: MapTypeOptions) = this()
  def getMaxZoom(): scala.Double = js.native
  def getMinZoom(): scala.Double = js.native
  def getName(): java.lang.String = js.native
  def getProjection(): Projection = js.native
  def getTextColor(): java.lang.String = js.native
  def getTileLayer(): TileLayer = js.native
  def getTips(): java.lang.String = js.native
}

