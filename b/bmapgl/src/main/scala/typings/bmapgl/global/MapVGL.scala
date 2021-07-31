package typings.bmapgl.global

import typings.bmapgl.BMapGL.Map
import typings.bmapgl.MapVGL.GeoJSON
import typings.bmapgl.MapVGL.LayerOptions
import typings.bmapgl.MapVGL.ViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MapVGL {
  
  @JSGlobal("MapVGL.Effects")
  @js.native
  class Effects ()
    extends StObject
       with typings.bmapgl.MapVGL.Effects {
    def this(opts: js.Object) = this()
  }
  
  @JSGlobal("MapVGL.Layer")
  @js.native
  class Layer protected ()
    extends StObject
       with typings.bmapgl.MapVGL.Layer {
    def this(map: Map) = this()
    def this(map: Map, opts: LayerOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getData(): js.Array[GeoJSON] = js.native
    
    /* CompleteClass */
    override def getDefaultOptions(): LayerOptions = js.native
    
    /* CompleteClass */
    override def getOptions(): LayerOptions = js.native
    
    /* CompleteClass */
    override def setData(x: js.Array[GeoJSON]): Unit = js.native
    
    /* CompleteClass */
    override def setOptions(x: LayerOptions): Unit = js.native
  }
  
  @JSGlobal("MapVGL.View")
  @js.native
  class View protected ()
    extends StObject
       with typings.bmapgl.MapVGL.View {
    def this(opts: ViewOptions) = this()
    
    /* CompleteClass */
    override def addLayer(x: typings.bmapgl.MapVGL.Layer): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getAllLayers(x: typings.bmapgl.MapVGL.Layer): js.Array[typings.bmapgl.MapVGL.Layer] = js.native
    
    /* CompleteClass */
    override def getAllThreeLayers(x: typings.bmapgl.MapVGL.Layer): js.Array[typings.bmapgl.MapVGL.Layer] = js.native
    
    /* CompleteClass */
    override def removeLayer(x: typings.bmapgl.MapVGL.Layer): Unit = js.native
  }
}
