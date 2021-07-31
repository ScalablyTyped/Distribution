package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_Url: typings.cssTree.cssTreeStrings.Url
  
  var value: StringNode | Raw
}
object Url {
  
  @scala.inline
  def apply(value: StringNode | Raw): Url = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Url")
    __obj.asInstanceOf[Url]
  }
  
  @scala.inline
  implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: StringNode | Raw): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
