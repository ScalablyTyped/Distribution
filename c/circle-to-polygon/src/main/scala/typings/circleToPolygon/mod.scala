package typings.circleToPolygon

import typings.geojson.mod.Polygon
import typings.geojson.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(center: Position, radius: Double): Polygon = (^.asInstanceOf[js.Dynamic].apply(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def apply(center: Position, radius: Double, numberOfSegments: Double): Polygon = (^.asInstanceOf[js.Dynamic].apply(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], numberOfSegments.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  inline def apply(center: Position, radius: Double, numberOfSegments: PolygonConfig): Polygon = (^.asInstanceOf[js.Dynamic].apply(center.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], numberOfSegments.asInstanceOf[js.Any])).asInstanceOf[Polygon]
  
  @JSImport("circle-to-polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PolygonConfig extends StObject {
    
    var bearing: js.UndefOr[Double] = js.undefined
    
    var earthRadius: js.UndefOr[Double] = js.undefined
    
    var numberOfEdges: js.UndefOr[Double] = js.undefined
    
    var rightHandRule: js.UndefOr[Boolean] = js.undefined
  }
  object PolygonConfig {
    
    inline def apply(): PolygonConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolygonConfig]
    }
    
    extension [Self <: PolygonConfig](x: Self) {
      
      inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
      
      inline def setBearingUndefined: Self = StObject.set(x, "bearing", js.undefined)
      
      inline def setEarthRadius(value: Double): Self = StObject.set(x, "earthRadius", value.asInstanceOf[js.Any])
      
      inline def setEarthRadiusUndefined: Self = StObject.set(x, "earthRadius", js.undefined)
      
      inline def setNumberOfEdges(value: Double): Self = StObject.set(x, "numberOfEdges", value.asInstanceOf[js.Any])
      
      inline def setNumberOfEdgesUndefined: Self = StObject.set(x, "numberOfEdges", js.undefined)
      
      inline def setRightHandRule(value: Boolean): Self = StObject.set(x, "rightHandRule", value.asInstanceOf[js.Any])
      
      inline def setRightHandRuleUndefined: Self = StObject.set(x, "rightHandRule", js.undefined)
    }
  }
}
