package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTapesOutput extends StObject {
  
  /**
    * A list of unique Amazon Resource Names (ARNs) that represents the virtual tapes that were created.
    */
  var TapeARNs: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARNs] = js.undefined
}
object CreateTapesOutput {
  
  inline def apply(): CreateTapesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTapesOutput]
  }
  
  extension [Self <: CreateTapesOutput](x: Self) {
    
    inline def setTapeARNs(value: TapeARNs): Self = StObject.set(x, "TapeARNs", value.asInstanceOf[js.Any])
    
    inline def setTapeARNsUndefined: Self = StObject.set(x, "TapeARNs", js.undefined)
    
    inline def setTapeARNsVarargs(value: TapeARN*): Self = StObject.set(x, "TapeARNs", js.Array(value*))
  }
}
