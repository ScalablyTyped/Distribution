package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSNodeString
  extends StObject
     with DSNode
     with DSNodeMultiplied {
  
  var `type`: String
  
  var value: java.lang.String
}
object DSNodeString {
  
  @scala.inline
  def apply(value: java.lang.String): DSNodeString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("String")
    __obj.asInstanceOf[DSNodeString]
  }
  
  @scala.inline
  implicit class DSNodeStringMutableBuilder[Self <: DSNodeString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: java.lang.String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
