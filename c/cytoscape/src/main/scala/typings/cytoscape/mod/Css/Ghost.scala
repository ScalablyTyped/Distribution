package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.no
import typings.cytoscape.cytoscapeStrings.yes
import typings.cytoscape.mod.NodeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ghost properties allow for creating a ghosting effect, a semitransparent duplicate of the element drawn at an offset.
  * https://js.cytoscape.org/#style/ghost
  */
trait Ghost extends StObject {
  
  /**
    * Whether to use the ghost effect; may be yes or no.
    */
  var ghost: PropertyValueNode[yes | no]
  
  /**
    * The horizontal offset used to position the ghost effect.
    */
  var `ghost-offset-x`: PropertyValueNode[Double]
  
  /**
    * The vertical offset used to position the ghost effect.
    */
  var `ghost-offset-y`: PropertyValueNode[Double]
  
  /**
    * The opacity of the ghost effect.
    */
  var `ghost-opacity`: PropertyValueNode[Double]
}
object Ghost {
  
  @scala.inline
  def apply(
    ghost: PropertyValueNode[yes | no],
    `ghost-offset-x`: PropertyValueNode[Double],
    `ghost-offset-y`: PropertyValueNode[Double],
    `ghost-opacity`: PropertyValueNode[Double]
  ): Ghost = {
    val __obj = js.Dynamic.literal(ghost = ghost.asInstanceOf[js.Any])
    __obj.updateDynamic("ghost-offset-x")(`ghost-offset-x`.asInstanceOf[js.Any])
    __obj.updateDynamic("ghost-offset-y")(`ghost-offset-y`.asInstanceOf[js.Any])
    __obj.updateDynamic("ghost-opacity")(`ghost-opacity`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ghost]
  }
  
  @scala.inline
  implicit class GhostMutableBuilder[Self <: Ghost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGhost(value: PropertyValueNode[yes | no]): Self = StObject.set(x, "ghost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGhost-offset-x`(value: PropertyValueNode[Double]): Self = StObject.set(x, "ghost-offset-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGhost-offset-xFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "ghost-offset-x", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setGhost-offset-y`(value: PropertyValueNode[Double]): Self = StObject.set(x, "ghost-offset-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGhost-offset-yFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "ghost-offset-y", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setGhost-opacity`(value: PropertyValueNode[Double]): Self = StObject.set(x, "ghost-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGhost-opacityFunction1`(value: NodeSingular => Double): Self = StObject.set(x, "ghost-opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGhostFunction1(value: NodeSingular => yes | no): Self = StObject.set(x, "ghost", js.Any.fromFunction1(value))
  }
}
