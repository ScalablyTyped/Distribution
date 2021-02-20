package typings.cytoscape.mod

import typings.cytoscape.anon.Degree
import typings.cytoscape.anon.MaxDegree
import typings.cytoscape.cytoscapeBooleans.`false`
import typings.cytoscape.cytoscapeNumbers.`10`
import typings.cytoscape.cytoscapeStrings.concentric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/concentric
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ @js.native
trait ConcentricLayoutOptions extends ShapedLayoutOptions {
  
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[Boolean] = js.native
  
  // returns numeric value for each node, placing higher nodes in levels towards the centre
  def concentric(node: Degree): Double = js.native
  
  // whether levels have an equal radial distance betwen them, may cause bounding box overflow
  var equidistant: `false` = js.native
  
  // min spacing between outside of nodes (used for radius adjustment)
  // height of layout area (overrides container height)
  var height: js.UndefOr[scala.Nothing] = js.native
  
  // the variation of concentric values in each level
  def levelWidth(node: MaxDegree): Double = js.native
  
  var minNodeSpacing: `10` = js.native
  
  @JSName("name")
  var name_ConcentricLayoutOptions: concentric = js.native
  
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  @JSName("spacingFactor")
  var spacingFactor_ConcentricLayoutOptions: js.UndefOr[scala.Nothing] = js.native
  
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: Double = js.native
  
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[Double] = js.native
  
  // width of layout area (overrides container width)
  var width: js.UndefOr[scala.Nothing] = js.native
}
object ConcentricLayoutOptions {
  
  @scala.inline
  def apply(
    concentric: Degree => Double,
    equidistant: `false`,
    fit: Boolean,
    levelWidth: MaxDegree => Double,
    minNodeSpacing: `10`,
    name: concentric,
    nodeDimensionsIncludeLabels: Boolean,
    startAngle: Double
  ): ConcentricLayoutOptions = {
    val __obj = js.Dynamic.literal(concentric = js.Any.fromFunction1(concentric), equidistant = equidistant.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], levelWidth = js.Any.fromFunction1(levelWidth), minNodeSpacing = minNodeSpacing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
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
    def setLevelWidth(value: MaxDegree => Double): Self = StObject.set(x, "levelWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMinNodeSpacing(value: `10`): Self = StObject.set(x, "minNodeSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: concentric): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSweep(value: Double): Self = StObject.set(x, "sweep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSweepUndefined: Self = StObject.set(x, "sweep", js.undefined)
  }
}
