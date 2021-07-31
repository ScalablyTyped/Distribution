package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.breadthfirst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/breadthfirst
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait BreadthFirstLayoutOptions
  extends StObject
     with ShapedLayoutOptions {
  
  // put depths in concentric circles if true, put depths top down if false
  var circle: Boolean
  
  // whether the tree is directed downwards (or edges can point in any direction if false)
  var directed: Boolean
  
  // how many times to try to position the nodes in a maximal way (i.e. no backtracking)
  var maximalAdjustments: Double
  
  @JSName("name")
  var name_BreadthFirstLayoutOptions: breadthfirst
  
  // the roots of the trees
  var roots: js.UndefOr[String] = js.undefined
}
object BreadthFirstLayoutOptions {
  
  @scala.inline
  def apply(
    circle: Boolean,
    directed: Boolean,
    fit: Boolean,
    maximalAdjustments: Double,
    nodeDimensionsIncludeLabels: Boolean
  ): BreadthFirstLayoutOptions = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], directed = directed.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], maximalAdjustments = maximalAdjustments.asInstanceOf[js.Any], name = "breadthfirst", nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadthFirstLayoutOptions]
  }
  
  @scala.inline
  implicit class BreadthFirstLayoutOptionsMutableBuilder[Self <: BreadthFirstLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirected(value: Boolean): Self = StObject.set(x, "directed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximalAdjustments(value: Double): Self = StObject.set(x, "maximalAdjustments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: breadthfirst): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoots(value: String): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootsUndefined: Self = StObject.set(x, "roots", js.undefined)
  }
}
