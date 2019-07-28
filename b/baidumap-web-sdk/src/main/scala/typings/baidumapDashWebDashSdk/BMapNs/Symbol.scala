package typings.baidumapDashWebDashSdk.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BMap.Symbol")
@js.native
class Symbol protected () extends Overlay {
  def this(path: String) = this()
  def this(path: SymbolShapeType) = this()
  def this(path: String, opts: SymbolOptions) = this()
  def this(path: SymbolShapeType, opts: SymbolOptions) = this()
  def setAnchor(anchor: Size): Unit = js.native
  def setFillColor(color: String): Unit = js.native
  def setFillOpacity(opacity: Double): Unit = js.native
  def setPath(path: String): Unit = js.native
  def setPath(path: SymbolShapeType): Unit = js.native
  def setRotation(rotation: Double): Unit = js.native
  def setScale(scale: Double): Unit = js.native
  def setStrokeColor(color: String): Unit = js.native
  def setStrokeOpacity(opacity: Double): Unit = js.native
  def setStrokeWeight(strokeWeight: Double): Unit = js.native
}

