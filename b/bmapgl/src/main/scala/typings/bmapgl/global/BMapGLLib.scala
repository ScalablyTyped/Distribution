package typings.bmapgl.global

import typings.bmapgl.BMapGL.DistanceToolOptions
import typings.bmapgl.BMapGL.DrawingManagerOptions
import typings.bmapgl.BMapGL.DrawingType
import typings.bmapgl.BMapGL.Map
import typings.bmapgl.BMapGLLib.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BMapGLLib {
  
  @JSGlobal("BMapGLLib.DistanceTool")
  @js.native
  open class DistanceTool protected ()
    extends StObject
       with typings.bmapgl.BMapGLLib.DistanceTool {
    def this(map: Map) = this()
    def this(map: Map, opts: DistanceToolOptions) = this()
    
    /* CompleteClass */
    override def addEventListener(event: String, handler: Callback): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def open(): Unit = js.native
    
    /* CompleteClass */
    override def removeEventListener(event: String, handler: Callback): Unit = js.native
  }
  
  @JSGlobal("BMapGLLib.DrawingManager")
  @js.native
  open class DrawingManager protected ()
    extends StObject
       with typings.bmapgl.BMapGLLib.DrawingManager {
    def this(map: Map) = this()
    def this(map: Map, opts: DrawingManagerOptions) = this()
    
    /* CompleteClass */
    override def addEventListener(event: String, handler: Callback): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def disableCalculate(): Unit = js.native
    
    /* CompleteClass */
    override def enableCalculate(): Unit = js.native
    
    /* CompleteClass */
    override def getDrawingMode(): DrawingType = js.native
    
    /* CompleteClass */
    override def open(): Unit = js.native
    
    /* CompleteClass */
    override def removeEventListener(event: String, handler: Callback): Unit = js.native
    
    /* CompleteClass */
    override def setDrawingMode(drawingType: DrawingType): Unit = js.native
  }
}
