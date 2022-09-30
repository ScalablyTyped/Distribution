package typings.cytoscape.mod

import typings.cytoscape.anon.Degree
import typings.cytoscape.anon.MaxDegree
import typings.cytoscape.cytoscapeStrings.concentric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/concentric
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait ConcentricLayoutOptions
  extends StObject
     with ShapedLayoutOptions {
  
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[Boolean] = js.undefined
  
  // returns numeric value for each node, placing higher nodes in levels towards the centre
  var concentric: js.UndefOr[js.Function1[/* node */ Degree, Double]] = js.undefined
  
  // whether levels have an equal radial distance betwen them, may cause bounding box overflow
  var equidistant: js.UndefOr[Boolean] = js.undefined
  
  // min spacing between outside of nodes (used for radius adjustment)
  // height of layout area (overrides container height)
  var height: js.UndefOr[Double] = js.undefined
  
  // the variation of concentric values in each level
  var levelWidth: js.UndefOr[js.Function1[/* node */ MaxDegree, Double]] = js.undefined
  
  var minNodeSpacing: js.UndefOr[Double] = js.undefined
  
  @JSName("name")
  var name_ConcentricLayoutOptions: concentric
  
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: js.UndefOr[Double] = js.undefined
  
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[Double] = js.undefined
  
  // width of layout area (overrides container width)
  var width: js.UndefOr[Double] = js.undefined
}
object ConcentricLayoutOptions {
  
  inline def apply(): ConcentricLayoutOptions = {
    val __obj = js.Dynamic.literal(name = "concentric")
    __obj.asInstanceOf[ConcentricLayoutOptions]
  }
  
  extension [Self <: ConcentricLayoutOptions](x: Self) {
    
    inline def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
    
    inline def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
    
    inline def setConcentric(value: /* node */ Degree => Double): Self = StObject.set(x, "concentric", js.Any.fromFunction1(value))
    
    inline def setConcentricUndefined: Self = StObject.set(x, "concentric", js.undefined)
    
    inline def setEquidistant(value: Boolean): Self = StObject.set(x, "equidistant", value.asInstanceOf[js.Any])
    
    inline def setEquidistantUndefined: Self = StObject.set(x, "equidistant", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLevelWidth(value: /* node */ MaxDegree => Double): Self = StObject.set(x, "levelWidth", js.Any.fromFunction1(value))
    
    inline def setLevelWidthUndefined: Self = StObject.set(x, "levelWidth", js.undefined)
    
    inline def setMinNodeSpacing(value: Double): Self = StObject.set(x, "minNodeSpacing", value.asInstanceOf[js.Any])
    
    inline def setMinNodeSpacingUndefined: Self = StObject.set(x, "minNodeSpacing", js.undefined)
    
    inline def setName(value: concentric): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setSweep(value: Double): Self = StObject.set(x, "sweep", value.asInstanceOf[js.Any])
    
    inline def setSweepUndefined: Self = StObject.set(x, "sweep", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
