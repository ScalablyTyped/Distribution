package typings.chrome.anon

import typings.chrome.chromeStrings.mixed
import typings.chrome.chromeStrings.normal
import typings.chrome.chromeStrings.off
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MIXED extends StObject {
  
  var MIXED: mixed = js.native
  
  var NORMAL: normal = js.native
  
  var OFF: off = js.native
}
object MIXED {
  
  @scala.inline
  def apply(MIXED: mixed, NORMAL: normal, OFF: off): MIXED = {
    val __obj = js.Dynamic.literal(MIXED = MIXED.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OFF = OFF.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIXED]
  }
  
  @scala.inline
  implicit class MIXEDMutableBuilder[Self <: MIXED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMIXED(value: mixed): Self = StObject.set(x, "MIXED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNORMAL(value: normal): Self = StObject.set(x, "NORMAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOFF(value: off): Self = StObject.set(x, "OFF", value.asInstanceOf[js.Any])
  }
}
