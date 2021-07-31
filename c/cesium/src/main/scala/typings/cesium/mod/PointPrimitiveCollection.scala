package typings.cesium.mod

import typings.cesium.anon.ModelMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "PointPrimitiveCollection")
@js.native
class PointPrimitiveCollection () extends StObject {
  def this(options: ModelMatrix) = this()
  
  def add(): PointPrimitive = js.native
  def add(pointPrimitive: js.Any): PointPrimitive = js.native
  
  var blendOption: BlendOption = js.native
  
  def contains(): Boolean = js.native
  def contains(pointPrimitive: PointPrimitive): Boolean = js.native
  
  var debugShowBoundingVolume: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  def get(index: Double): PointPrimitive = js.native
  
  def isDestroyed(): Boolean = js.native
  
  var length: Double = js.native
  
  var modelMatrix: Matrix4 = js.native
  
  def remove(pointPrimitive: PointPrimitive): Boolean = js.native
  
  def removeAll(): Unit = js.native
}
