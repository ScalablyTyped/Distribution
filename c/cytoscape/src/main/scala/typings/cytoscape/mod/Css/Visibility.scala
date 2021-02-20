package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.displayed
import typings.cytoscape.cytoscapeStrings.hidden
import typings.cytoscape.cytoscapeStrings.none
import typings.cytoscape.cytoscapeStrings.visible
import typings.cytoscape.mod.EdgeSingular
import typings.cytoscape.mod.NodeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#style/visibility
  */
@js.native
trait Visibility[SingularType /* <: NodeSingular | EdgeSingular */] extends StObject {
  
  /**
    * Whether to display the element; may be element for displayed or none for not displayed.
    * Note that a "display: none" bezier edge does not take up space in its bundle.
    */
  var display: PropertyValue[SingularType, none | displayed] = js.native
  
  /**
    * The opacity of the element, ranging from 0 to 1.
    * Note that the opacity of a compound node parent affects the effective opacity of its children.
    */
  var opacity: PropertyValue[SingularType, Double] = js.native
  
  /**
    * Whether the element is visible; may be visible or hidden.
    * Note that a "visibility : hidden" bezier edge still takes up space in its bundle.
    */
  var visibility: PropertyValue[SingularType, hidden | visible] = js.native
  
  /**
    * An integer value that affects the relative draw order of elements.
    * In general, an element with a higher "z-index" will be drawn on top of an element with a lower "z-index".
    * Note that edges are under nodes despite "z-index", except when necessary for compound nodes.
    */
  var `z-index`: PropertyValue[SingularType, Double] = js.native
}
object Visibility {
  
  @scala.inline
  def apply[SingularType /* <: NodeSingular | EdgeSingular */](
    display: PropertyValue[SingularType, none | displayed],
    opacity: PropertyValue[SingularType, Double],
    visibility: PropertyValue[SingularType, hidden | visible],
    `z-index`: PropertyValue[SingularType, Double]
  ): Visibility[SingularType] = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("z-index")(`z-index`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visibility[SingularType]]
  }
  
  @scala.inline
  implicit class VisibilityMutableBuilder[Self <: Visibility[_], SingularType /* <: NodeSingular | EdgeSingular */] (val x: Self with Visibility[SingularType]) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: PropertyValue[SingularType, none | displayed]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFunction1(value: SingularType => none | displayed): Self = StObject.set(x, "display", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpacity(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityFunction1(value: SingularType => Double): Self = StObject.set(x, "opacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisibility(value: PropertyValue[SingularType, hidden | visible]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityFunction1(value: SingularType => hidden | visible): Self = StObject.set(x, "visibility", js.Any.fromFunction1(value))
    
    @scala.inline
    def `setZ-index`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZ-indexFunction1`(value: SingularType => Double): Self = StObject.set(x, "z-index", js.Any.fromFunction1(value))
  }
}
