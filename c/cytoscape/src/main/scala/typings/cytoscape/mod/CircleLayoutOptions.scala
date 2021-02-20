package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/circle
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ @js.native
trait CircleLayoutOptions extends ShapedLayoutOptions {
  
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[Boolean] = js.native
  
  @JSName("name")
  var name_CircleLayoutOptions: circle = js.native
  
  // the radius of the circle
  var radius: js.UndefOr[Double] = js.native
  
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: Double = js.native
  
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[Double] = js.native
}
object CircleLayoutOptions {
  
  @scala.inline
  def apply(fit: Boolean, name: circle, nodeDimensionsIncludeLabels: Boolean, startAngle: Double): CircleLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleLayoutOptions]
  }
  
  @scala.inline
  implicit class CircleLayoutOptionsMutableBuilder[Self <: CircleLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
    
    @scala.inline
    def setName(value: circle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSweep(value: Double): Self = StObject.set(x, "sweep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSweepUndefined: Self = StObject.set(x, "sweep", js.undefined)
  }
}
