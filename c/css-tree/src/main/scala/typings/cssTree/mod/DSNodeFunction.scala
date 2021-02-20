package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSNodeFunction
  extends DSNode
     with DSNodeMultiplied {
  
  var name: String = js.native
  
  var `type`: Function = js.native
}
object DSNodeFunction {
  
  @scala.inline
  def apply(name: String, `type`: Function): DSNodeFunction = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DSNodeFunction]
  }
  
  @scala.inline
  implicit class DSNodeFunctionMutableBuilder[Self <: DSNodeFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Function): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
