package typings.bmapgl.global.BMapGL

import typings.bmapgl.BMapGL.MapTypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMapGL.MapType")
@js.native
class MapType protected ()
  extends StObject
     with typings.bmapgl.BMapGL.MapType {
  def this(name: String, layers: js.Array[typings.bmapgl.BMapGL.TileLayer]) = this()
  def this(name: String, layers: typings.bmapgl.BMapGL.TileLayer) = this()
  def this(name: String, layers: js.Array[typings.bmapgl.BMapGL.TileLayer], opts: MapTypeOptions) = this()
  def this(name: String, layers: typings.bmapgl.BMapGL.TileLayer, opts: MapTypeOptions) = this()
  
  /* CompleteClass */
  override def getMaxZoom(): Double = js.native
  
  /* CompleteClass */
  override def getMinZoom(): Double = js.native
  
  /* CompleteClass */
  override def getName(): String = js.native
  
  /* CompleteClass */
  override def getProjection(): typings.bmapgl.BMapGL.Projection = js.native
  
  /* CompleteClass */
  override def getTextColor(): String = js.native
  
  /* CompleteClass */
  override def getTileLayer(): typings.bmapgl.BMapGL.TileLayer = js.native
  
  /* CompleteClass */
  override def getTips(): String = js.native
}
