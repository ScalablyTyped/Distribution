package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MIDIMessageEventInit
  extends StObject
     with EventInit {
  
  var data: js.UndefOr[Uint8Array] = js.undefined
}
object MIDIMessageEventInit {
  
  inline def apply(): MIDIMessageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MIDIMessageEventInit]
  }
  
  extension [Self <: MIDIMessageEventInit](x: Self) {
    
    inline def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
