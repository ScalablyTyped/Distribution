package typings.cytoscape.mod

import typings.cytoscape.anon.Degree
import typings.cytoscape.anon.MaxDegree
import typings.cytoscape.cytoscapeBooleans.`false`
import typings.cytoscape.cytoscapeNumbers.`10`
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
  var equidistant: `false`
  
  // min spacing between outside of nodes (used for radius adjustment)
  // height of layout area (overrides container height)
  var height: Unit
  
  // the variation of concentric values in each level
  def levelWidth(node: MaxDegree): Double
  
  var minNodeSpacing: `10`
  
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
  
  @scala.inline
  def apply(
    concentric: Degree => Double,
    fit: Boolean,
    height: Unit,
    levelWidth: MaxDegree => Double,
    nodeDimensionsIncludeLabels: Boolean,
    spacingFactor: Unit,
    startAngle: Double,
    width: Unit
  ): ConcentricLayoutOptions = {
    val __obj = js.Dynamic.literal(concentric = js.Any.fromFunction1(concentric), equidistant = false, fit = fit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], levelWidth = js.Any.fromFunction1(levelWidth), minNodeSpacing = 10, name = "concentric", nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], spacingFactor = spacingFactor.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcentricLayoutOptions]
  }
  
  @scala.inline
  implicit class ConcentricLayoutOptionsMutableBuilder[Self <: ConcentricLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClockwise(value: Boolean): Self = StObject.set(x, "clockwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockwiseUndefined: Self = StObject.set(x, "clockwise", js.undefined)
    
    @scala.inline
    def setConcentric(value: Degree => Double): Self = StObject.set(x, "concentric", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquidistant(value: `false`): Self = StObject.set(x, "equidistant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Unit): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelWidth(value: MaxDegree => Double): Self = StObject.set(x, "levelWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinNodeSpacing(value: `10`): Self = StObject.set(x, "minNodeSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: concentric): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingFactor(value: Unit): Self = StObject.set(x, "spacingFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSweep(value: Double): Self = StObject.set(x, "sweep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSweepUndefined: Self = StObject.set(x, "sweep", js.undefined)
    
    @scala.inline
    def setWidth(value: Unit): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
