package typings.vegaLite8ozrbXDH.channeldefDTsMod

import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.column
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.layer
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.repeat
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.row
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatRef extends StObject {
  
  var repeat: row | column | typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.repeat | layer
}
object RepeatRef {
  
  inline def apply(repeat: row | column | repeat | layer): RepeatRef = {
    val __obj = js.Dynamic.literal(repeat = repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatRef]
  }
  
  extension [Self <: RepeatRef](x: Self) {
    
    inline def setRepeat(value: row | column | repeat | layer): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
  }
}
