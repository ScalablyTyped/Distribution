package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSNodeTypeOpts extends StObject {
  
  var max: Double | Null
  
  var min: Double | Null
  
  var `type`: Range
}
object DSNodeTypeOpts {
  
  @scala.inline
  def apply(): DSNodeTypeOpts = {
    val __obj = js.Dynamic.literal(max = null, min = null)
    __obj.updateDynamic("type")("Range")
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
