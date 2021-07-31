package typings.cesium.mod

import typings.cesium.anon.DestroyPrimitives
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PrimitiveCollection")
@js.native
class PrimitiveCollection () extends StObject {
  def this(options: DestroyPrimitives) = this()
  
  def add(primitive: js.Any): js.Any = js.native
  def add(primitive: js.Any, index: Double): js.Any = js.native
  
  def contains(): Boolean = js.native
  def contains(primitive: js.Any): Boolean = js.native
  
  def destroy(): Unit = js.native
  
  var destroyPrimitives: Boolean = js.native
  
  def get(index: Double): js.Any = js.native
  
  def isDestroyed(): Boolean = js.native
  
  val length: Double = js.native
  
  def lower(): Unit = js.native
  def lower(primitive: js.Any): Unit = js.native
  
  def lowerToBottom(): Unit = js.native
  def lowerToBottom(primitive: js.Any): Unit = js.native
  
  def raise(): Unit = js.native
  def raise(primitive: js.Any): Unit = js.native
  
  def raiseToTop(): Unit = js.native
  def raiseToTop(primitive: js.Any): Unit = js.native
  
  def remove(): Boolean = js.native
  def remove(primitive: js.Any): Boolean = js.native
  
  def removeAll(): Unit = js.native
  
  var show: Boolean = js.native
}
