package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CDO
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_CDO: typings.cssTree.cssTreeStrings.CDO
}
object CDO {
  
  @scala.inline
  def apply(): CDO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CDO")
    __obj.asInstanceOf[CDO]
  }
  
  @scala.inline
  implicit class CDOMutableBuilder[Self <: CDO] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.CDO): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
