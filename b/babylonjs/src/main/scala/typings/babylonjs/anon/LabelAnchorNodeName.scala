package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelAnchorNodeName extends StObject {
  
  var labelAnchorNodeName: String = js.native
  
  var rootNodeName: String = js.native
  
  var touchPointNodeName: String = js.native
}
object LabelAnchorNodeName {
  
  @scala.inline
  def apply(labelAnchorNodeName: String, rootNodeName: String, touchPointNodeName: String): LabelAnchorNodeName = {
    val __obj = js.Dynamic.literal(labelAnchorNodeName = labelAnchorNodeName.asInstanceOf[js.Any], rootNodeName = rootNodeName.asInstanceOf[js.Any], touchPointNodeName = touchPointNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelAnchorNodeName]
  }
  
  @scala.inline
  implicit class LabelAnchorNodeNameMutableBuilder[Self <: LabelAnchorNodeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelAnchorNodeName(value: String): Self = StObject.set(x, "labelAnchorNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNodeName(value: String): Self = StObject.set(x, "rootNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchPointNodeName(value: String): Self = StObject.set(x, "touchPointNodeName", value.asInstanceOf[js.Any])
  }
}
