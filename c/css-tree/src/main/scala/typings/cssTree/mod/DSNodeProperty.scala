package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSNodeProperty
  extends StObject
     with DSNode
     with DSNodeMultiplied {
  
  var name: String
  
  var `type`: Property
}
object DSNodeProperty {
  
  @scala.inline
  def apply(name: String): DSNodeProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Property")
    __obj.asInstanceOf[DSNodeProperty]
  }
  
  @scala.inline
  implicit class DSNodePropertyMutableBuilder[Self <: DSNodeProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Property): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
