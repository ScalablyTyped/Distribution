package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url_
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_Url_ : Url
  
  var value: StringNode | Raw
}
object Url_ {
  
  inline def apply(value: StringNode | Raw): Url_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Url")
    __obj.asInstanceOf[Url_]
  }
  
  extension [Self <: Url_](x: Self) {
    
    inline def setType(value: Url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StringNode | Raw): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
