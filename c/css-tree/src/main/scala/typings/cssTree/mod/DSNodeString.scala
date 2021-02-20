package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.String
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSNodeString
  extends DSNode
     with DSNodeMultiplied {
  
  var `type`: String = js.native
  
  var value: java.lang.String = js.native
}
object DSNodeString {
  
  @scala.inline
  def apply(`type`: String, value: java.lang.String): DSNodeString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
