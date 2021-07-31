package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identifier
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var name: String
  
  @JSName("type")
  var type_Identifier: typings.cssTree.cssTreeStrings.Identifier
}
object Identifier {
  
  @scala.inline
  def apply(name: String): Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[Identifier]
  }
  
  @scala.inline
  implicit class IdentifierMutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
