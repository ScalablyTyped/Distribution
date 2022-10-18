package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.DocumentFragment
import typings.ckeditorCkeditor5Engine.srcModelRangeMod.default
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/documentfragment.DocumentFragment, 'childCount' | 'isEmpty' | 'markers' | 'maxOffset' | 'parent' | 'root'> */
trait PickDocumentFragmentchild extends StObject {
  
  var childCount: Double
  
  var isEmpty: Boolean
  
  var markers: Map[String, default]
  
  var maxOffset: Double
  
  var parent: Null
  
  var root: DocumentFragment
}
object PickDocumentFragmentchild {
  
  inline def apply(
    childCount: Double,
    isEmpty: Boolean,
    markers: Map[String, default],
    maxOffset: Double,
    parent: Null,
    root: DocumentFragment
  ): PickDocumentFragmentchild = {
    val __obj = js.Dynamic.literal(childCount = childCount.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], maxOffset = maxOffset.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickDocumentFragmentchild]
  }
  
  extension [Self <: PickDocumentFragmentchild](x: Self) {
    
    inline def setChildCount(value: Double): Self = StObject.set(x, "childCount", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setMarkers(value: Map[String, default]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMaxOffset(value: Double): Self = StObject.set(x, "maxOffset", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Null): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: DocumentFragment): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
