package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrammarSlotTypeSetting extends StObject {
  
  /**
    * The source of the grammar used to create the slot type.
    */
  var source: js.UndefOr[GrammarSlotTypeSource] = js.undefined
}
object GrammarSlotTypeSetting {
  
  inline def apply(): GrammarSlotTypeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrammarSlotTypeSetting]
  }
  
  extension [Self <: GrammarSlotTypeSetting](x: Self) {
    
    inline def setSource(value: GrammarSlotTypeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
