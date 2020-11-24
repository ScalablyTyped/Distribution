package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol extends Overlay {
  
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
