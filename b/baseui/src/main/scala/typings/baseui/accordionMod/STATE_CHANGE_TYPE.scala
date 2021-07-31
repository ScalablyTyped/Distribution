package typings.baseui.accordionMod

import typings.baseui.baseuiStrings.expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait STATE_CHANGE_TYPE extends StObject {
  
  var expand: typings.baseui.baseuiStrings.expand
}
object STATE_CHANGE_TYPE {
  
  @JSImport("baseui/accordion", "STATE_CHANGE_TYPE")
  @js.native
  val ^ : STATE_CHANGE_TYPE = js.native
  
  @scala.inline
  implicit class STATE_CHANGE_TYPEMutableBuilder[Self <: STATE_CHANGE_TYPE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpand(value: expand): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
  }
}
