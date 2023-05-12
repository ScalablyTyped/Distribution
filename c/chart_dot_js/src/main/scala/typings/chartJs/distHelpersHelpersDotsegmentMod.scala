package typings.chartJs

import typings.chartJs.anon.Loop
import typings.chartJs.anon.Property
import typings.chartJs.distElementsElementDotlineMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersHelpersDotsegmentMod {
  
  @JSImport("chart.js/dist/helpers/helpers.segment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def boundSegment(segment: Loop, points: js.Array[PointElement]): js.Array[Loop] = (^.asInstanceOf[js.Dynamic].applyDynamic("_boundSegment")(segment.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[js.Array[Loop]]
  inline def boundSegment(segment: Loop, points: js.Array[PointElement], bounds: Property): js.Array[Loop] = (^.asInstanceOf[js.Dynamic].applyDynamic("_boundSegment")(segment.asInstanceOf[js.Any], points.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[Loop]]
  
  inline def boundSegments(line: LineElement): js.Array[Loop] = ^.asInstanceOf[js.Dynamic].applyDynamic("_boundSegments")(line.asInstanceOf[js.Any]).asInstanceOf[js.Array[Loop]]
  inline def boundSegments(line: LineElement, bounds: Property): js.Array[Loop] = (^.asInstanceOf[js.Dynamic].applyDynamic("_boundSegments")(line.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[js.Array[Loop]]
  
  inline def computeSegments(line: LineElement): js.Array[Segment] = ^.asInstanceOf[js.Dynamic].applyDynamic("_computeSegments")(line.asInstanceOf[js.Any]).asInstanceOf[js.Array[Segment]]
  inline def computeSegments(line: LineElement, segmentOptions: js.Object): js.Array[Segment] = (^.asInstanceOf[js.Dynamic].applyDynamic("_computeSegments")(line.asInstanceOf[js.Any], segmentOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[Segment]]
  
  type LineElement = default
  
  type PointElement = typings.chartJs.distElementsElementDotpointMod.default
  
  trait Segment extends StObject {
    
    var end: Double
    
    var loop: Boolean
    
    var start: Double
    
    var style: js.UndefOr[Any] = js.undefined
  }
  object Segment {
    
    inline def apply(end: Double, loop: Boolean, start: Double): Segment = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Segment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
