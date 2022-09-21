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
  def concentric(node: Degree): Double
  
  // whether levels have an equal radial distance betwen them, may cause bounding box overflow
  var equidistant: Boolean
  
  // min spacing between outside of nodes (used for radius adjustment)
  // height of layout area (overrides container height)
  var height: Unit
  
  // the variation of concentric values in each level
  def levelWidth(node: MaxDegree): Double
  
  var minNodeSpacing: Double
  
  @JSName("name")
  var name_ConcentricLayoutOptions: concentric
  
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  @JSName("spacingFactor")
  var spacingFactor_ConcentricLayoutOptions: Unit
  
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: Double
  
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[Double] = js.undefined
  
  // width of layout area (overrides container width)
  var width: Unit
}
object ConcentricLayoutOptions {
  
  inline def apply(
    concentric: Degree => Double,
    equidistant: Boolean,
    fit: Boolean,
    height: Unit,
    levelWidth: MaxDegree => Double,
    minNodeSpacing: Double,
    nodeDimensionsIncludeLabels: Boolean,
    spacingFactor: Unit,
    startAngle: Double,
    width: Unit
  ): ConcentricLayoutOptions = {
    val __obj = js.Dynamic.literal(concentric = js.Any.fromFunction1(concentric), equidistant = equidistant.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], levelWidth = js.Any.fromFunction1(levelWidth), minNodeSpacing = minNodeSpacing.asInstanceOf[js.Any], name = "concentric", nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], spacingFactor = spacingFactor.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcentricLayoutOptions]
  }
  
  extension [Self <: ConcentricLayoutOptions](x: Self) {
    
    inline def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
    
    inline def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
    
    inline def setConcentric(value: Degree => Double): Self = StObject.set(x, "concentric", js.Any.fromFunction1(value))
    
    inline def setEquidistant(value: Boolean): Self = StObject.set(x, "equidistant", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Unit): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLevelWidth(value: MaxDegree => Double): Self = StObject.set(x, "levelWidth", js.Any.fromFunction1(value))
    
    inline def setMinNodeSpacing(value: Double): Self = StObject.set(x, "minNodeSpacing", value.asInstanceOf[js.Any])
    
    inline def setName(value: concentric): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSpacingFactor(value: Unit): Self = StObject.set(x, "spacingFactor", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    inline def setSweep(value: Double): Self = StObject.set(x, "sweep", value.asInstanceOf[js.Any])
    
    inline def setSweepUndefined: Self = StObject.set(x, "sweep", js.undefined)
    
    inline def setWidth(value: Unit): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
