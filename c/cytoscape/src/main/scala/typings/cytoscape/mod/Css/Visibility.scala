package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.auto
import typings.cytoscape.cytoscapeStrings.bottom
import typings.cytoscape.cytoscapeStrings.element
import typings.cytoscape.cytoscapeStrings.hidden
import typings.cytoscape.cytoscapeStrings.manual
import typings.cytoscape.cytoscapeStrings.none
import typings.cytoscape.cytoscapeStrings.orphan
import typings.cytoscape.cytoscapeStrings.top
import typings.cytoscape.cytoscapeStrings.visible
import typings.cytoscape.mod.EdgeSingular
import typings.cytoscape.mod.NodeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#style/visibility
  */
trait Visibility[SingularType /* <: NodeSingular | EdgeSingular */] extends StObject {
  
  /**
    * Whether to display the element; may be element for displayed or none for not displayed.
    * Note that a "display: none" bezier edge does not take up space in its bundle.
    */
  var display: PropertyValue[SingularType, none | element]
  
  /**
    * The opacity of the element, ranging from 0 to 1.
    * Note that the opacity of a compound node parent affects the effective opacity of its children.
    */
  var opacity: PropertyValue[SingularType, Double]
  
  /**
    * Whether the element is visible; may be visible or hidden.
    * Note that a "visibility : hidden" bezier edge still takes up space in its bundle.
    */
  var visibility: PropertyValue[SingularType, hidden | visible]
  
  /**
    * May be bottom, orphan, auto (default), or top. The first drawn is bottom, the second is orphan,
    * which is the same depth as the root of the compound graph, followed by the default of auto
    * which draws in depth order from root to leaves of the compound graph. The last drawn is top.
    * It does not usually make sense to set this value for non-compound graphs.
    */
  var `z-compound-depth`: PropertyValue[SingularType, auto | top | bottom | orphan]
  
  /**
    * An integer value that affects the relative draw order of elements.
    * In general, an element with a higher "z-index" will be drawn on top of an element with a lower "z-index".
    * Note that edges are under nodes despite "z-index", except when necessary for compound nodes.
    */
  var `z-index`: PropertyValue[SingularType, Double]
  
  /**
    * May be auto (default) or manual. The auto setting draws edges under nodes,
    * whereas manual ignores this convention and draws solely based on the z-index value.
    */
  var `z-index-compare`: PropertyValue[SingularType, auto | manual]
}
object Visibility {
  
  inline def apply[SingularType /* <: NodeSingular | EdgeSingular */](
    display: PropertyValue[SingularType, none | element],
    opacity: PropertyValue[SingularType, Double],
    visibility: PropertyValue[SingularType, hidden | visible],
    `z-compound-depth`: PropertyValue[SingularType, auto | top | bottom | orphan],
    `z-index`: PropertyValue[SingularType, Double],
    `z-index-compare`: PropertyValue[SingularType, auto | manual]
  ): Visibility[SingularType] = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("z-compound-depth")(`z-compound-depth`.asInstanceOf[js.Any])
    __obj.updateDynamic("z-index")(`z-index`.asInstanceOf[js.Any])
    __obj.updateDynamic("z-index-compare")(`z-index-compare`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Visibility[SingularType]]
  }
  
  extension [Self <: Visibility[?], SingularType /* <: NodeSingular | EdgeSingular */](x: Self & Visibility[SingularType]) {
    
    inline def setDisplay(value: PropertyValue[SingularType, none | element]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayFunction1(value: SingularType => none | element): Self = StObject.set(x, "display", js.Any.fromFunction1(value))
    
    inline def setOpacity(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityFunction1(value: SingularType => Double): Self = StObject.set(x, "opacity", js.Any.fromFunction1(value))
    
    inline def setVisibility(value: PropertyValue[SingularType, hidden | visible]): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityFunction1(value: SingularType => hidden | visible): Self = StObject.set(x, "visibility", js.Any.fromFunction1(value))
    
    inline def `setZ-compound-depth`(value: PropertyValue[SingularType, auto | top | bottom | orphan]): Self = StObject.set(x, "z-compound-depth", value.asInstanceOf[js.Any])
    
    inline def `setZ-compound-depthFunction1`(value: SingularType => auto | top | bottom | orphan): Self = StObject.set(x, "z-compound-depth", js.Any.fromFunction1(value))
    
    inline def `setZ-index`(value: PropertyValue[SingularType, Double]): Self = StObject.set(x, "z-index", value.asInstanceOf[js.Any])
    
    inline def `setZ-index-compare`(value: PropertyValue[SingularType, auto | manual]): Self = StObject.set(x, "z-index-compare", value.asInstanceOf[js.Any])
    
    inline def `setZ-index-compareFunction1`(value: SingularType => auto | manual): Self = StObject.set(x, "z-index-compare", js.Any.fromFunction1(value))
    
    inline def `setZ-indexFunction1`(value: SingularType => Double): Self = StObject.set(x, "z-index", js.Any.fromFunction1(value))
  }
}
