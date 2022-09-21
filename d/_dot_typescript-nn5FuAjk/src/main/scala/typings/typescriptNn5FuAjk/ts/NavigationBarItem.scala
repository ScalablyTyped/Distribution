package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Navigation bar interface designed for visual studio's dual-column layout.
  * This does not form a proper tree.
  * The navbar is returned as a list of top-level items, each of which has a list of child items.
  * Child items always have an empty array for their `childItems`.
  */
trait NavigationBarItem extends StObject {
  
  var bolded: Boolean
  
  var childItems: Array[NavigationBarItem]
  
  var grayed: Boolean
  
  var indent: Double
  
  var kind: ScriptElementKind
  
  var kindModifiers: java.lang.String
  
  var spans: Array[TextSpan]
  
  var text: java.lang.String
}
object NavigationBarItem {
  
  inline def apply(
    bolded: Boolean,
    childItems: Array[NavigationBarItem],
    grayed: Boolean,
    indent: Double,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    spans: Array[TextSpan],
    text: java.lang.String
  ): NavigationBarItem = {
    val __obj = js.Dynamic.literal(bolded = bolded.asInstanceOf[js.Any], childItems = childItems.asInstanceOf[js.Any], grayed = grayed.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], spans = spans.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarItem]
  }
  
  extension [Self <: NavigationBarItem](x: Self) {
    
    inline def setBolded(value: Boolean): Self = StObject.set(x, "bolded", value.asInstanceOf[js.Any])
    
    inline def setChildItems(value: Array[NavigationBarItem]): Self = StObject.set(x, "childItems", value.asInstanceOf[js.Any])
    
    inline def setGrayed(value: Boolean): Self = StObject.set(x, "grayed", value.asInstanceOf[js.Any])
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ScriptElementKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindModifiers(value: java.lang.String): Self = StObject.set(x, "kindModifiers", value.asInstanceOf[js.Any])
    
    inline def setSpans(value: Array[TextSpan]): Self = StObject.set(x, "spans", value.asInstanceOf[js.Any])
    
    inline def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
