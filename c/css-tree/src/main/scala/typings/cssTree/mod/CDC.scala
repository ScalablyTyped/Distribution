package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CDC
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_CDC: typings.cssTree.cssTreeStrings.CDC
}
object CDC {
  
  @scala.inline
  def apply(): CDC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CDC")
    __obj.asInstanceOf[CDC]
  }
  
  @scala.inline
  implicit class CDCMutableBuilder[Self <: CDC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.CDC): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
