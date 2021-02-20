package typings.cesium.mod

import typings.cesium.anon.EdgeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ClippingPlaneCollection")
@js.native
class ClippingPlaneCollection () extends StObject {
  def this(options: EdgeColor) = this()
  
  def add(plane: ClippingPlane): Unit = js.native
  
  def contains(plane: ClippingPlane): Boolean = js.native
  
  def destroy(): Unit = js.native
  
  var edgeColor: Color = js.native
  
  var edgeWidth: Double = js.native
  
  var enabled: Boolean = js.native
  
  def getIndex(index: Double): ClippingPlane = js.native
  
  def isDestroyed(): Boolean = js.native
  
  val length: Double = js.native
  
  var modelMatrix: Matrix4 = js.native
  
  var planeAdded: Event[js.Array[_]] = js.native
  
  var planeRemoved: Event[js.Array[_]] = js.native
  
  def remove(plane: ClippingPlane): Boolean = js.native
  
  var unionClippingRegions: Boolean = js.native
  
  def update(): Unit = js.native
}
