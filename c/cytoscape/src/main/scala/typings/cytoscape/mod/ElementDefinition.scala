package typings.cytoscape.mod

import typings.cytoscape.mod.Css.Edge
import typings.cytoscape.mod.Css.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinition extends StObject {
  
  /**
    * a space separated list of class names that the element has
    */
  var classes: js.UndefOr[String] = js.undefined
  
  /**
    * you should only use `style`/`css` for very special cases; use classes instead
    */
  var css: js.UndefOr[Node | Edge] = js.undefined
  
  var data: NodeDataDefinition | EdgeDataDefinition
  
  /**
    * Wether the node can be grabbed and moved by the user
    */
  var grabbable: js.UndefOr[Boolean] = js.undefined
  
  var group: js.UndefOr[ElementGroup] = js.undefined
  
  /**
    * When locked a node's position is immutable (default false)
    */
  var locked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The model position of the node (optional on init, mandatory after)
    */
  var position: js.UndefOr[Position] = js.undefined
  
  /**
    * can alternatively specify position in rendered on-screen pixels
    */
  var renderedPosition: js.UndefOr[Position] = js.undefined
  
  /**
    * Scratchpad data (usually temp or nonserialisable data)
    */
  var scratch: js.UndefOr[Scratchpad] = js.undefined
  
  /**
    * Whether the selection state is mutable (default true)
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the element is selected (default false)
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  CssStyleDeclaration;
    */
  var style: js.UndefOr[CssStyleDeclaration] = js.undefined
}
object ElementDefinition {
  
  inline def apply(data: NodeDataDefinition | EdgeDataDefinition): ElementDefinition = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementDefinition] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setCss(value: Node | Edge): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setData(value: NodeDataDefinition | EdgeDataDefinition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGrabbable(value: Boolean): Self = StObject.set(x, "grabbable", value.asInstanceOf[js.Any])
    
    inline def setGrabbableUndefined: Self = StObject.set(x, "grabbable", js.undefined)
    
    inline def setGroup(value: ElementGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRenderedPosition(value: Position): Self = StObject.set(x, "renderedPosition", value.asInstanceOf[js.Any])
    
    inline def setRenderedPositionUndefined: Self = StObject.set(x, "renderedPosition", js.undefined)
    
    inline def setScratch(value: Scratchpad): Self = StObject.set(x, "scratch", value.asInstanceOf[js.Any])
    
    inline def setScratchUndefined: Self = StObject.set(x, "scratch", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setStyle(value: CssStyleDeclaration): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
