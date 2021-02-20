package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CDO
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_CDO: typings.cssTree.cssTreeStrings.CDO = js.native
}
object CDO {
  
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.CDO): CDO = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDO]
  }
  
  @scala.inline
  implicit class CDOMutableBuilder[Self <: CDO] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.CDO): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
