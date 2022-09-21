package typings.bmapgl.global.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.Bounds")
@js.native
open class Bounds protected ()
  extends StObject
     with typings.bmapgl.BMapGL.Bounds {
  def this(sw: typings.bmapgl.BMapGL.Point, ne: typings.bmapgl.BMapGL.Point) = this()
  def this(minX: Double, minY: Double, maxX: Double, maxY: Double) = this()
  
  /* CompleteClass */
  override def containsBounds(bounds: typings.bmapgl.BMapGL.Bounds): Boolean = js.native
  
  /* CompleteClass */
  override def containsPoint(point: typings.bmapgl.BMapGL.Point): Boolean = js.native
  
  /* CompleteClass */
  override def equals(other: typings.bmapgl.BMapGL.Bounds): Boolean = js.native
  
  /* CompleteClass */
  override def extend(point: typings.bmapgl.BMapGL.Point): Unit = js.native
  
  /* CompleteClass */
  override def getCenter(): typings.bmapgl.BMapGL.Point = js.native
  
  /* CompleteClass */
  override def getNorthEast(): typings.bmapgl.BMapGL.Point = js.native
  
  /* CompleteClass */
  override def getSouthWest(): typings.bmapgl.BMapGL.Point = js.native
  
  /* CompleteClass */
  override def intersects(other: typings.bmapgl.BMapGL.Bounds): Boolean = js.native
  
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  
  /* CompleteClass */
  var maxX: Double = js.native
  
  /* CompleteClass */
  var maxY: Double = js.native
  
  /* CompleteClass */
  var minX: Double = js.native
  
  /* CompleteClass */
  var minY: Double = js.native
  
  /* CompleteClass */
  override def toSpan(): typings.bmapgl.BMapGL.Point = js.native
}
