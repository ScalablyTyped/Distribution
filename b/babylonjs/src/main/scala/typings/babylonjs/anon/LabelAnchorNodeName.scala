package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelAnchorNodeName extends StObject {
  
  var labelAnchorNodeName: String
  
  var rootNodeName: String
  
  var touchPointNodeName: String
}
object LabelAnchorNodeName {
  
  inline def apply(labelAnchorNodeName: String, rootNodeName: String, touchPointNodeName: String): LabelAnchorNodeName = {
    val __obj = js.Dynamic.literal(labelAnchorNodeName = labelAnchorNodeName.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], touchPointNodeName = touchPointNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelAnchorNodeName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelAnchorNodeName] (val x: Self) extends AnyVal {
    
    inline def setLabelAnchorNodeName(value: String): Self = StObject.set(x, "labelAnchorNodeName", value.asInstanceOf[js.Any])
    
    inline def setRootNodeName(value: String): Self = StObject.set(x, "rootNodeName", value.asInstanceOf[js.Any])
    
    inline def setTouchPointNodeName(value: String): Self = StObject.set(x, "touchPointNodeName", value.asInstanceOf[js.Any])
  }
}
