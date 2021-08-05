package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignTapePoolOutput extends StObject {
  
  /**
    * The unique Amazon Resource Names (ARN) of the virtual tape that was added to the tape pool.
    */
  var TapeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TapeARN] = js.undefined
}
object AssignTapePoolOutput {
  
  inline def apply(): AssignTapePoolOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignTapePoolOutput]
  }
  
  extension [Self <: AssignTapePoolOutput](x: Self) {
    
    inline def setTapeARN(value: TapeARN): Self = StObject.set(x, "TapeARN", value.asInstanceOf[js.Any])
    
    inline def setTapeARNUndefined: Self = StObject.set(x, "TapeARN", js.undefined)
  }
}
