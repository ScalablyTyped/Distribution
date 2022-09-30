package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/circle
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait CircleLayoutOptions
  extends StObject
     with ShapedLayoutOptions {
  
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[Boolean] = js.undefined
  
  @JSName("name")
  var name_CircleLayoutOptions: circle
  
  // the radius of the circle
  var radius: js.UndefOr[Double] = js.undefined
  
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: js.UndefOr[Double] = js.undefined
  
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[Double] = js.undefined
}
object CircleLayoutOptions {
  
  inline def apply(): CircleLayoutOptions = {
    val __obj = js.Dynamic.literal(name = "circle")
    __obj.asInstanceOf[CircleLayoutOptions]
  }
  
  extension [Self <: CircleLayoutOptions](x: Self) {
    
    inline def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
    
    inline def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
    
    inline def setName(value: circle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    inline def setSweep(value: Double): Self = StObject.set(x, "sweep", value.asInstanceOf[js.Any])
    
    inline def setSweepUndefined: Self = StObject.set(x, "sweep", js.undefined)
  }
}
