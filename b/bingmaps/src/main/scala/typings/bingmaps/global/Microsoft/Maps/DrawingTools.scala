package typings.bingmaps.global.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.DrawingTools")
@js.native
class DrawingTools protected ()
  extends typings.bingmaps.Microsoft.Maps.DrawingTools {
  /**
    * @constructor
    * @requires The Microsoft.Maps.DrawingTools module.
    * @param map A map instanct to attach the drawing tools to.
    */
  def this(map: typings.bingmaps.Microsoft.Maps.Map) = this()
}
@JSGlobal("Microsoft.Maps.DrawingTools")
@js.native
object DrawingTools extends js.Object {
  
  @js.native
  object DrawingBarAction extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction with Double] = js.native
    
    /* 7 */ val all: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.all with Double = js.native
    
    /* 8 */ val createShapes: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.createShapes with Double = js.native
    
    /* 4 */ val edit: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.edit with Double = js.native
    
    /* 9 */ val editShapes: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.editShapes with Double = js.native
    
    /* 3 */ val erase: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.erase with Double = js.native
    
    /* 6 */ val fillStyle: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.fillStyle with Double = js.native
    
    /* 0 */ val point: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.point with Double = js.native
    
    /* 2 */ val polygon: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.polygon with Double = js.native
    
    /* 1 */ val polyline: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.polyline with Double = js.native
    
    /* 5 */ val strokeStyle: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.strokeStyle with Double = js.native
    
    /* 10 */ val styleShapes: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.styleShapes with Double = js.native
  }
  
  @js.native
  object DrawingMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode with Double] = js.native
    
    /* 0 */ val edit: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.edit with Double = js.native
    
    /* 1 */ val erase: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.erase with Double = js.native
    
    /* 2 */ val none: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.none with Double = js.native
    
    /* 3 */ val polygon: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.polygon with Double = js.native
    
    /* 4 */ val polyline: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.polyline with Double = js.native
    
    /* 5 */ val pushpin: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.pushpin with Double = js.native
  }
  
  @js.native
  object ShapeType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.DrawingTools.ShapeType with Double] = js.native
    
    /* 0 */ val polygon: typings.bingmaps.Microsoft.Maps.DrawingTools.ShapeType.polygon with Double = js.native
    
    /* 1 */ val polyline: typings.bingmaps.Microsoft.Maps.DrawingTools.ShapeType.polyline with Double = js.native
  }
}
