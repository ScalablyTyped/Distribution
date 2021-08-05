package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic Functions
  * chayns.intercom
  * interfaces
  */
trait IntercomConfig extends StObject {
  
  var text: String
}
object IntercomConfig {
  
  inline def apply(text: String): IntercomConfig = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntercomConfig]
  }
  
  extension [Self <: IntercomConfig](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
