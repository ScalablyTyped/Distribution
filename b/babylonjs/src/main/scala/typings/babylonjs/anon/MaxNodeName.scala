package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxNodeName extends StObject {
  
  var maxNodeName: String = js.native
  
  var minNodeName: String = js.native
  
  var valueNodeName: String = js.native
}
object MaxNodeName {
  
  @scala.inline
  def apply(maxNodeName: String, minNodeName: String, valueNodeName: String): MaxNodeName = {
    val __obj = js.Dynamic.literal(maxNodeName = maxNodeName.asInstanceOf[js.Any], minNodeName = minNodeName.asInstanceOf[js.Any], valueNodeName = valueNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxNodeName]
  }
  
  @scala.inline
  implicit class MaxNodeNameMutableBuilder[Self <: MaxNodeName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxNodeName(value: String): Self = StObject.set(x, "maxNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNodeName(value: String): Self = StObject.set(x, "minNodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNodeName(value: String): Self = StObject.set(x, "valueNodeName", value.asInstanceOf[js.Any])
  }
}
