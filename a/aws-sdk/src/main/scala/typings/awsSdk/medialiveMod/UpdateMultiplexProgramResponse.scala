package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMultiplexProgramResponse extends StObject {
  
  /**
    * The updated multiplex program.
    */
  var MultiplexProgram: js.UndefOr[typings.awsSdk.medialiveMod.MultiplexProgram] = js.undefined
}
object UpdateMultiplexProgramResponse {
  
  inline def apply(): UpdateMultiplexProgramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMultiplexProgramResponse]
  }
  
  extension [Self <: UpdateMultiplexProgramResponse](x: Self) {
    
    inline def setMultiplexProgram(value: MultiplexProgram): Self = StObject.set(x, "MultiplexProgram", value.asInstanceOf[js.Any])
    
    inline def setMultiplexProgramUndefined: Self = StObject.set(x, "MultiplexProgram", js.undefined)
  }
}
