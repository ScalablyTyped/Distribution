package typings.baseui.anon

import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.full
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auto extends StObject {
  
  val default: default_
  
  val auto: typings.baseui.baseuiStrings.auto
  
  val full: typings.baseui.baseuiStrings.full
}
object Auto {
  
  inline def apply(): Auto = {
    val __obj = js.Dynamic.literal(auto = "auto", default = "default", full = "full")
    __obj.asInstanceOf[Auto]
  }
  
  extension [Self <: Auto](x: Self) {
    
    inline def setAuto(value: auto): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setFull(value: full): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
  }
}
