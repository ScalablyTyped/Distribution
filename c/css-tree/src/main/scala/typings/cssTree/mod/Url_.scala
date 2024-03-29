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
  
  var value: String
}
object Url_ {
  
  inline def apply(value: String): Url_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Url")
    __obj.asInstanceOf[Url_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Url_] (val x: Self) extends AnyVal {
    
    inline def setType(value: Url): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
