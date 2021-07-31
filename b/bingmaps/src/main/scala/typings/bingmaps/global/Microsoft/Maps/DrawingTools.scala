package typings.bingmaps.global.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.DrawingTools")
@js.native
class DrawingTools protected ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.DrawingTools {
  /**
    * @constructor
    * @requires The Microsoft.Maps.DrawingTools module.
    * @param map A map instanct to attach the drawing tools to.
    */
  def this(map: typings.bingmaps.Microsoft.Maps.Map) = this()
}
object DrawingTools {
  
  @JSGlobal("Microsoft.Maps.DrawingTools.DrawingBarAction")
  @js.native
  object DrawingBarAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction & Double] = js.native
    
    /* 7 */ val all: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.all & Double = js.native
    
    /* 8 */ val createShapes: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.createShapes & Double = js.native
    
    /* 4 */ val edit: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.edit & Double = js.native
    
    /* 9 */ val editShapes: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.editShapes & Double = js.native
    
    /* 3 */ val erase: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.erase & Double = js.native
    
    /* 6 */ val fillStyle: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.fillStyle & Double = js.native
    
    /* 0 */ val point: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.point & Double = js.native
    
    /* 2 */ val polygon: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.polygon & Double = js.native
    
    /* 1 */ val polyline: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.polyline & Double = js.native
    
    /* 5 */ val strokeStyle: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.strokeStyle & Double = js.native
    
    /* 10 */ val styleShapes: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingBarAction.styleShapes & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.DrawingTools.DrawingMode")
  @js.native
  object DrawingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode & Double] = js.native
    
    /* 0 */ val edit: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.edit & Double = js.native
    
    /* 1 */ val erase: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.erase & Double = js.native
    
    /* 2 */ val none: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.none & Double = js.native
    
    /* 3 */ val polygon: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.polygon & Double = js.native
    
    /* 4 */ val polyline: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.polyline & Double = js.native
    
    /* 5 */ val pushpin: typings.bingmaps.Microsoft.Maps.DrawingTools.DrawingMode.pushpin & Double = js.native
  }
  
  @JSGlobal("Microsoft.Maps.DrawingTools.ShapeType")
  @js.native
  object ShapeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.bingmaps.Microsoft.Maps.DrawingTools.ShapeType & Double] = js.native
    
    /* 0 */ val polygon: typings.bingmaps.Microsoft.Maps.DrawingTools.ShapeType.polygon & Double = js.native
    
    /* 1 */ val polyline: typings.bingmaps.Microsoft.Maps.DrawingTools.ShapeType.polyline & Double = js.native
  }
}
