package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSNodeTypeOpts extends StObject {
  
  var max: Double | Null = js.native
  
  var min: Double | Null = js.native
  
  var `type`: Range = js.native
}
object DSNodeTypeOpts {
  
  @scala.inline
  def apply(`type`: Range): DSNodeTypeOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeTypeOpts]
  }
  
  @scala.inline
  implicit class DSNodeTypeOptsMutableBuilder[Self <: DSNodeTypeOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxNull: Self = StObject.set(x, "max", null)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNull: Self = StObject.set(x, "min", null)
    
    @scala.inline
    def setType(value: Range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
