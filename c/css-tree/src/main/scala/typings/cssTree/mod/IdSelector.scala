package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdSelector
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var name: String = js.native
  
  @JSName("type")
  var type_IdSelector: typings.cssTree.cssTreeStrings.IdSelector = js.native
}
object IdSelector {
  
  @scala.inline
  def apply(name: String, `type`: typings.cssTree.cssTreeStrings.IdSelector): IdSelector = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdSelector]
  }
  
  @scala.inline
  implicit class IdSelectorMutableBuilder[Self <: IdSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.IdSelector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
