package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.in_
import typings.chromeApps.chromeAppsStrings.out_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IN extends StObject {
  
  var IN: in_ = js.native
  
  var OUT: out_ = js.native
}
object IN {
  
  @scala.inline
  def apply(IN: in_, OUT: out_): IN = {
    val __obj = js.Dynamic.literal(IN = IN.asInstanceOf[js.Any], OUT = OUT.asInstanceOf[js.Any])
    __obj.asInstanceOf[IN]
  }
  
  @scala.inline
  implicit class INMutableBuilder[Self <: IN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIN(value: in_): Self = StObject.set(x, "IN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOUT(value: out_): Self = StObject.set(x, "OUT", value.asInstanceOf[js.Any])
  }
}
