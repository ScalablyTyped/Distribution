package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInputResponse extends StObject {
  
  var Input: js.UndefOr[typings.awsSdk.medialiveMod.Input] = js.undefined
}
object CreateInputResponse {
  
  inline def apply(): CreateInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInputResponse]
  }
  
  extension [Self <: CreateInputResponse](x: Self) {
    
    inline def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}
